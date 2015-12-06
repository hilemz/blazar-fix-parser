package net.openblazar.fixparser.desktop.settings;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class BlazarSettingsImpl implements BlazarSettings {

	public static final String FIX_DELIMITER = "fix.delimiter";
	public static final String FIX_USE_DELIMITER = "fix.usedelimiter";
	public static final String FIX_VALUE_DELIMITER = "fix.valuedelimiter";

	private final Map<String, Object> settings = new HashMap<String, Object>();

	@Override
	public Object getSetting(String settingName) {
		synchronized (settings) {
			if (settingName.equals(FIX_DELIMITER)) {
				return settings.get(FIX_DELIMITER);
			} else if (settingName.equals(FIX_USE_DELIMITER)) {
				return settings.get(FIX_USE_DELIMITER);
			} else if (settingName.equals(FIX_VALUE_DELIMITER)) {
				return settings.get(FIX_VALUE_DELIMITER);
			}

			throw new IllegalArgumentException("Couldn't resolve setting name " + settingName +
					"" +
					".");
		}
	}

	@Override
	public void setSetting(String settingName, Object value) {
		synchronized (settings) {
			if (settingName.equals(FIX_DELIMITER)) {
				settings.put(settingName, value);
			} else if (settingName.equals(FIX_USE_DELIMITER)) {
				settings.put(settingName, value);
			} else if (settingName.equals(FIX_VALUE_DELIMITER)) {
				settings.put(settingName, value);
			} else {
				throw new IllegalArgumentException("Couldn't resolve setting name " + settingName + ".");
			}
		}
	}
}
