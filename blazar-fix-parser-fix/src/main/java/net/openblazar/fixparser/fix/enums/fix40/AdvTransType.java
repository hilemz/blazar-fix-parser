package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum AdvTransType {

	New('N'),
	Cancel('C'),
	Replace('R'),
	Unknown(' ');

	private final char code;

	AdvTransType(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public AdvTransType getAdvTransTypeFromCode(char code) {
		switch (code) {
			case 'N':
				return New;
			case 'C':
				return Cancel;
			case 'R':
				return Replace;
			default:
				return Unknown;
		}
	}
}
