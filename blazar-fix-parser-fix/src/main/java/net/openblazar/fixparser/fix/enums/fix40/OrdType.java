package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum OrdType {

	Market('1', "Market"),
	Limit('2', "Limit"),
	Stop('3', "Stop"),
	Stop_Limit('4', "Stop Limit"),
	Market_on_close('5', "Market on close"),
	With_or_without('6', "With or without"),
	Limit_or_better('7', "Limit or better"),
	Limit_with_or_without('8', "Limit with or without"),
	On_basis('9', "On basis"),
	On_close('A', "On close"),
	Limit_on_close('B', "Limit on close"),
	Forex('C', "Forex"),
	Previously_quoted('D', "Previously quoted"),
	Previously_indicated('E', "Previously indicated"),
	Pegged('P', "Pegged"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	OrdType(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public OrdType getOrdTypeFromCode(char code) {
		switch (code) {
			case '1':
				return Market;
			case '2':
				return Limit;
			case '3':
				return Stop;
			case '4':
				return Stop_Limit;
			case '5':
				return Market_on_close;
			case '6':
				return With_or_without;
			case '7':
				return Limit_or_better;
			case '8':
				return Limit_with_or_without;
			case '9':
				return On_basis;
			case 'A':
				return On_close;
			case 'B':
				return Limit_on_close;
			case 'C':
				return Forex;
			case 'D':
				return Previously_quoted;
			case 'E':
				return Previously_indicated;
			case 'P':
				return Pegged;
			default:
				return Unkown;
		}
	}

}
