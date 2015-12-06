package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum IOITransType {

	New('N'),
	Cancel('C'),
	Replace('R'),
	Unkown(' ');

	private final char code;

	IOITransType(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public IOITransType getIOITransTypeFromCode(char code) {
		switch(code) {
			case 'N':
				return New;
			case 'C':
				return Cancel;
			case 'R':
				return Replace;
			default:
				return Unkown;
		}
	}
}
