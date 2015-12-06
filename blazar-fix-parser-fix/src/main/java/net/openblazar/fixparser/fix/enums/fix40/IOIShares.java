package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum IOIShares {

	N_1000000000('0'),
	Small('S'),
	Medium('M'),
	Large('L'),
	Unkown(' ');

	private final char code;

	IOIShares(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public IOIShares getIOISharesFromCode(char code) {
		switch (code) {
			case '0':
				return N_1000000000;
			case 'S':
				return Small;
			case 'M':
				return Medium;
			case 'L':
				return Large;
			default:
				return Unkown;
		}
	}

}
