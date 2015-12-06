package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum Urgency {

	Normal('0'),
	Flash('1'),
	Background('2'),
	Unkown(' ');

	private final char code;

	Urgency(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public Urgency getUrgencyFromCode(char code) {
		switch (code) {
			case '0':
				return Normal;
			case '1':
				return Flash;
			case '2':
				return Background;
			default:
				return Unkown;
		}
	}
}
