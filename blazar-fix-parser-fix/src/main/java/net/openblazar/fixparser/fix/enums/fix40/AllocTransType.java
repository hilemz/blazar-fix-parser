package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum AllocTransType {

	New('0'),
	Replace('1'),
	Cancel('2'),
	Unkown(' ');

	private final char code;

	AllocTransType(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public AllocTransType getAllocTransTypeFromCode(char code) {
		switch (code) {
			case '0':
				return New;
			case '1':
				return Replace;
			case '2':
				return Cancel;
			default:
				return Unkown;
		}
	}
}
