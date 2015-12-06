package net.openblazar.fixparser.desktop;

import net.openblazar.fixparser.desktop.settings.BlazarSettingsManager;
import net.openblazar.fixparser.fix.FixMessage;
import net.openblazar.fixparser.desktop.util.FixMessageParser;
import net.openblazar.fixparser.desktop.settings.BlazarSettingsImpl;

import java.util.List;
import java.util.Optional;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public class BlazarFixParser {

	public static void main(String[] args) {
		BlazarSettingsManager.getInstance().setSetting(BlazarSettingsImpl.FIX_DELIMITER, "#");
		BlazarSettingsManager.getInstance().setSetting(BlazarSettingsImpl.FIX_USE_DELIMITER, false);
		BlazarSettingsManager.getInstance().setSetting(BlazarSettingsImpl.FIX_VALUE_DELIMITER, "=");

		Optional<List<FixMessage>> message = FixMessageParser.toFixMessage("8=FIX.4.1\u00019=61" +
				"\u000135=A\u000134=1\u000149=EXEC\u000152=20121105-23:24:06\u000156=BANZAI" +
				"\u000198=0\u0001108=30\u000110=003\u00018=FIX.4" +
				".1\u00019=61\u000135=A\u000134=1\u000149=BANZAI\u000152=20121105-23:24:06\u000156" +
				"=EXEC\u000198=0\u0001108=30\u000110=003\u00018=FIX.4" +
				".1\u00019=49\u000135=0\u000134=2\u000149=BANZAI\u000152=20121105-23:24:37\u000156" +
				"=EXEC\u000110=228");

		System.out.println(message);
	}

}
