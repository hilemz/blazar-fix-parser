package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum ForexReq {

	Yes('Y'),
	No('N'),
	Unknown(' ');

	private final char code;

	ForexReq(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public ForexReq getForexReqFromCode(char code) {
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
