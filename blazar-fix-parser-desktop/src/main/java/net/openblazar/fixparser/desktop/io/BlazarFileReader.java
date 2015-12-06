package net.openblazar.fixparser.desktop.io;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public interface BlazarFileReader {

	void read();

	void setFileReaderListener(BlazarFileReaderListener listener);

}
