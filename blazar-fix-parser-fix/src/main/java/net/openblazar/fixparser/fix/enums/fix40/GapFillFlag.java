package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum GapFillFlag {

	Yes('Y'),
	No('N'),
	Unknown(' ');

	private final char code;

	GapFillFlag(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public GapFillFlag getGapFillFlagFromCode(char code) {
		switch (code) {
			case 'Y':
				return Yes;
			case 'N':
				return No;
			default:
				return Unknown;
		}
	}
}
