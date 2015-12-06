package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum IOINaturalFlag {

	Yes('Y'),
	No('N'),
	Unknown(' ');

	private final char code;

	IOINaturalFlag(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public IOINaturalFlag getIOINaturalFlagFromCode(char code) {
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
