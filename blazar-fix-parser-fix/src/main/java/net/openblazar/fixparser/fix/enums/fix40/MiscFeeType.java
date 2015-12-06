package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum MiscFeeType {

	Regulatory('1', "Regulatory"),
	Tax('2', "Tax"),
	Local_Commission('3', "Local Commission"),
	Exchange_Fees('4', "Exchange Fees"),
	Stamp('5', "Stamp"),
	Levy('6', "Levy"),
	Other('7', "Other"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	MiscFeeType(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public MiscFeeType getMiscFeeTypeFromCode(char code) {
		switch (code) {
			case '1':
				return Regulatory;
			case '2':
				return Tax;
			case '3':
				return Local_Commission;
			case '4':
				return Exchange_Fees;
			case '5':
				return Stamp;
			case '6':
				return Levy;
			case '7':
				return Other;
			default:
				return Unknown;
		}
	}
}
