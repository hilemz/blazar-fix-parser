package net.openblazar.fixparser.desktop.io;

import net.openblazar.fixparser.fix.FixMessage;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
@FunctionalInterface
public interface BlazarFileReaderListener {

	void onMessage(final FixMessage fixMessage);

}
