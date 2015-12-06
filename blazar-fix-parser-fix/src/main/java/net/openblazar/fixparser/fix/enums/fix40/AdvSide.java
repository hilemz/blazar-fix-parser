package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum AdvSide {

	Buy('B'),
	Sell('S'),
	Cross('X'),
	Trade('T'),
	Unkown(' ');

	private final char code;

	AdvSide(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public AdvSide getAdvSideFromCode(char code) {
		switch (code) {
			case 'B':
				return Buy;
			case 'S':
				return Sell;
			case 'X':
				return Cross;
			case 'T':
				return Trade;
			default:
				return Unkown;
		}
	}
}
