package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum IDSource {

	CUSIP('1'),
	SEDOL('2'),
	QUIK('3'),
	ISIN('4'),
	RIC('5'),
	Unkown(' ');

	private final char code;

	IDSource(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public IDSource getIDSourceFromCode(char code) {
		switch (code) {
			case '1':
				return CUSIP;
			case '2':
				return SEDOL;
			case '3':
				return QUIK;
			case '4':
				return ISIN;
			case '5':
				return RIC;
			default:
				return Unkown;
		}
	}
}
