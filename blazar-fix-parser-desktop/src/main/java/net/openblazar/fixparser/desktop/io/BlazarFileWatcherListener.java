package net.openblazar.fixparser.desktop.io;

import java.nio.file.Path;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
@FunctionalInterface
public interface BlazarFileWatcherListener {

	void onFileModified(Path path);

}
