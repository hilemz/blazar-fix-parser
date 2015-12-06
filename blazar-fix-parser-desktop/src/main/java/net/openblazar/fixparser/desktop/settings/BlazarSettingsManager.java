package net.openblazar.fixparser.desktop.settings;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class BlazarSettingsManager {

	private static class SettingsManagerHolder {
		private static final BlazarSettings instance = new BlazarSettingsImpl();
	}

	public static BlazarSettings getInstance() {
		return SettingsManagerHolder.instance;
	}

}
