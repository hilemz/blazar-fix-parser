package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum Side {

	Buy('1', "Buy"),
	Sell('2', "Sell"),
	Buy_minus('3', "Buy minus"),
	Sell_plus('4', "Sell plus"),
	Sell_short('5', "Sell short"),
	Sell_short_exempt('6', "Sell short exempt"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	Side(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public Side getSideFromCode(char code) {
		switch (code) {
			case '1':
				return Buy;
			case '2':
				return Sell;
			case '3':
				return Buy_minus;
			case '4':
				return Sell_plus;
			case '5':
				return Sell_short;
			case '6':
				return Sell_short_exempt;
			default:
				return Unkown;
		}
	}
}
