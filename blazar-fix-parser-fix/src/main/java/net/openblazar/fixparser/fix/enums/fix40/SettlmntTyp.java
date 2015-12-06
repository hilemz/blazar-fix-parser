package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum SettlmntTyp {

	Regular('0', "Regular"),
	Cash('1', "Cash"),
	Next_Day('2', "Next Day"),
	T_2('3', "T+2"),
	T_3('4', "T+3"),
	T_4('5', "T+4"),
	Future('6', "Future"),
	When_issued('7', "When Issued"),
	Sellers_option('8', "Sellers Option"),
	T_5('9', "T+5"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	SettlmntTyp(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public SettlmntTyp getSettlmntTypFromCode(char code) {
		switch (code) {
			case '0':
				return Regular;
			case '1':
				return Cash;
			case '2':
				return Next_Day;
			case '3':
				return T_2;
			case '4':
				return T_3;
			case '5':
				return T_4;
			case '6':
				return Future;
			case '7':
				return When_issued;
			case '8':
				return Sellers_option;
			case '9':
				return T_5;
			default:
				return Unkown;
		}
	}
}
