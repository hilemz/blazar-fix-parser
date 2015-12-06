package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum IOIQltyInd {

	Low('L'),
	Medium('M'),
	High('H'),
	Unkown(' ');

	private final char code;

	IOIQltyInd(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public IOIQltyInd getIOIQltyIndFromCode(char code) {
		switch (code) {
			case 'L':
				return Low;
			case 'M':
				return Medium;
			case 'H':
				return High;
			default:
				return Unkown;
		}
	}
}
