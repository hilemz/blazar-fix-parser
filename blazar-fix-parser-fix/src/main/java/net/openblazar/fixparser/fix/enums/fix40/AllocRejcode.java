package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum AllocRejcode {

	Unknown_account('0', "Unknown account(s)"),
	Incorrect_qty('1', "Incorrect Quantity"),
	Incorrect_avg_px('2', "Incorrect Average Price"),
	Unknown_broker('3', "Unknown Executing Broker Mnemonic"),
	Commission_diff('4', "Commission Difference"),
	Unknown_OrdId('5', "Unknown OrderID"),
	Unknown_ListID('6', "Unknown ListID"),
	Other('7', "Other"),
	Unknown(' ', "Unkown");

	private final char code;
	private final String niceName;

	AllocRejcode(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public AllocRejcode getAllocRejcodeFromCode(char code) {
		switch (code) {
			case '0':
				return Unknown_account;
			case '1':
				return Incorrect_qty;
			case '2':
				return Incorrect_avg_px;
			case '3':
				return Unknown_broker;
			case '4':
				return Commission_diff;
			case '5':
				return Unknown_OrdId;
			case '6':
				return Unknown_ListID;
			case '7':
				return Other;
			default:
				return Unknown;
		}
	}
}
