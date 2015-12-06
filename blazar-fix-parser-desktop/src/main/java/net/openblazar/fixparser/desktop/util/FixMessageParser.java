package net.openblazar.fixparser.desktop.util;

import net.openblazar.fixparser.fix.FixField;
import net.openblazar.fixparser.fix.FixMessage;
import net.openblazar.fixparser.fix.enums.FixType;
import net.openblazar.fixparser.desktop.settings.BlazarSettingsImpl;
import net.openblazar.fixparser.desktop.settings.BlazarSettingsManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class FixMessageParser {

	public static final int FIX_FIELD_TAG = 0;
	public static final int FIX_FIELD_VALUE = 1;

	private final static Logger LOGGER = LoggerFactory.getLogger(FixMessageParser.class);

	public static Optional<List<FixMessage>> toFixMessage(String line) {
		try {
			FixType fixType = resolveFixType(line);

			List<String> messages = extractMessageFromLine(line, fixType);
			if(messages.isEmpty()) {
				return Optional.empty();
			}

			String delimiter = getDelimiter(messages.get(0));
			List<FixMessage> fixMessages = new ArrayList<FixMessage>();

			for(String message : messages) {
				if(!message.isEmpty()) {
					FixMessage fixMessage = new FixMessage(fixType);
					fillFixMessage(message, delimiter, fixMessage);
					fixMessages.add(fixMessage);
				}
			}

			return Optional.of(fixMessages);
		} catch (IllegalArgumentException e) {
			return Optional.empty();
		}
	}

	private static void fillFixMessage(String message, String delimiter, FixMessage fixMessage) {
		String[] elements = message.split(delimiter);

		for (String element : elements) {
			try {
				FixField fixField = toFixField(element);
				fixMessage.addField(fixField);
			} catch (IllegalArgumentException e) {
				LOGGER.error(e.getMessage() + " {}", e);
			}
		}
	}

	private static String getDelimiter(String message) {
		if ((Boolean) BlazarSettingsManager.getInstance().getSetting(BlazarSettingsImpl
				.FIX_USE_DELIMITER)) {
			return String.valueOf(BlazarSettingsManager.getInstance().getSetting
					(BlazarSettingsImpl.FIX_DELIMITER));
		}

		String delimiter = resolveDelimiter(message);
		if (delimiter == null) {
			return String.valueOf(BlazarSettingsManager.getInstance().getSetting
					(BlazarSettingsImpl.FIX_DELIMITER));
		}
		return delimiter;
	}

	private static String resolveDelimiter(String message) {
		int index = message.indexOf("9" + BlazarSettingsManager.getInstance().getSetting
				(BlazarSettingsImpl.FIX_VALUE_DELIMITER));
		if (index > 0) {
			return String.valueOf(message.charAt(index - 1));
		}
		return null;
	}

	private static FixField toFixField(String element) {
		String[] elements = element.split("=");
		if (elements.length != 2) {
			throw new IllegalArgumentException("Couldn't parse Fix Field. Invalid number of " +
					"elements in field.");
		}
		return new FixField(Integer.parseInt(elements[FIX_FIELD_TAG]), elements[FIX_FIELD_VALUE]);
	}

	private static List<String> extractMessageFromLine(String line, FixType fixType) {
		Pattern pattern = Pattern.compile("8=" + fixType.getCode() + ".*");
		Matcher matcher = pattern.matcher(line);
		if (matcher.find()) {
			line = matcher.group(0);
		}

		List<String> messages = copyArrayToList(line.split("8=" + fixType.getCode()));
		return messages;
	}

	private static List<String> copyArrayToList(String[] messages) {
		List<String> messagesList = new ArrayList<String>();
		for(String message : messages) {
			if(!message.isEmpty()) {
				messagesList.add(message);
			}
		}
		return messagesList;
	}

	private static FixType resolveFixType(String line) {
		if (line.contains(FixType.FIX_40.getCode())) {
			return FixType.FIX_40;
		} else if (line.contains(FixType.FIX_41.getCode())) {
			return FixType.FIX_41;
		} else if (line.contains(FixType.FIX_42.getCode())) {
			return FixType.FIX_42;
		} else if (line.contains(FixType.FIX_43.getCode())) {
			return FixType.FIX_43;
		} else if (line.contains(FixType.FIX_44.getCode())) {
			return FixType.FIX_44;
		} else if (line.contains(FixType.FIX_50.getCode())) {
			return FixType.FIX_50;
		}

		throw new IllegalArgumentException("Couldn't resolve Fix Type.");
	}

}
