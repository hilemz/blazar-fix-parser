package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum ExDestination {

	None('0'),
	POSIT('4'),
	Unknown(' ');

	private final char code;

	ExDestination(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public ExDestination getExDestinationFromCode(char code) {
		switch (code) {
			case '0':
				return None;
			case '4':
				return POSIT;
			default:
				return Unknown;
		}
	}
}
