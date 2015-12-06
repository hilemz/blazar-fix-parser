package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum CommType {

	Per_Share('1'),
	Percentage('2'),
	Absolute('3'),
	Unkown(' ');

	private final char code;

	CommType(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public CommType getCommTypeFromCode(char code) {
		switch (code) {
			case '1':
				return Per_Share;
			case '2':
				return Percentage;
			case '3':
				return Absolute;
			default:
				return Unkown;
		}
	}
}
