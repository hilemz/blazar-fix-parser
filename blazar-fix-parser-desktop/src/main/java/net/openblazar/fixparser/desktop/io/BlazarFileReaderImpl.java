package net.openblazar.fixparser.desktop.io;

import net.openblazar.fixparser.fix.FixMessage;
import net.openblazar.fixparser.desktop.util.FixMessageParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;
import java.util.Optional;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class BlazarFileReaderImpl implements BlazarFileReader {

	private final static Logger LOGGER = LoggerFactory.getLogger(BlazarFileReaderImpl.class);

	private final File file;
	private BlazarFileReaderListener listener;

	public BlazarFileReaderImpl(File file) {
		this.file = file;
	}

	public void setFileReaderListener(BlazarFileReaderListener listener) {
		this.listener = listener;
	}

	public void read() {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream
				(file)))) {
			String currentLine;

			while ((currentLine = reader.readLine()) != null) {
				Optional<List<FixMessage>> messages = FixMessageParser.toFixMessage(currentLine);
				if (messages.isPresent()) {
					if (listener != null) {
						List<FixMessage> list = messages.get();
						for (FixMessage fixMessage : list) {
							listener.onMessage(fixMessage);
						}
					}
				}
			}
		} catch (IOException e) {
			LOGGER.error("Error occured while file " + file.getName() + "reading. {}", e);
		}
	}


}
