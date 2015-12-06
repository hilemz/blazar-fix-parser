package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum LocateReqd {

	Yes('Y'),
	No('N'),
	Unknown(' ');

	private final char code;

	LocateReqd(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public LocateReqd getLocateReqdFromCode(char code) {
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
