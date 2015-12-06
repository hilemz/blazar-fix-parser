package net.openblazar.fixparser.desktop.settings;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public interface BlazarSettings {

	Object getSetting(String settingName);

	void setSetting(String settingName, Object value);

}
