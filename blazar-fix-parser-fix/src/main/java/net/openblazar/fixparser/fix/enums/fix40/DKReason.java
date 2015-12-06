package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum DKReason {

	Unknown_symbol('A', "Unknown Symbol"),
	Wrong_Side('B', "Wrong Side"),
	Quantity_exceeds('C', "Quantity Exceeds Order"),
	No_matching_order('D', "No matching order"),
	Price_exceeds_limit('E', "Price exceeds limit"),
	Other('Z', "Other"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	DKReason(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public DKReason getDKReasonFromCode(char code) {
		switch (code) {
			case 'A':
				return Unknown_symbol;
			case 'B':
				return Wrong_Side;
			case 'C':
				return Quantity_exceeds;
			case 'D':
				return No_matching_order;
			case 'E':
				return Price_exceeds_limit;
			case 'Z':
				return Other;
			default:
				return Unknown;
		}
	}
}
