package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum ProcessCode {

	Regular('0', "Regular"),
	Soft_dollar('1', "Soft Dollar"),
	Step_in('2', "Step-in"),
	Step_out('3', "Step-out"),
	Soft_dollar_in('4', "Soft-Dollar Step-In"),
	Soft_dollar_out('5', "Soft-Dollar Step-Out"),
	Plan_sponsor('6', "Plan Sponsor"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	ProcessCode(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public ProcessCode getProcessCodeFromCode(char code) {
		switch (code) {
			case '0':
				return Regular;
			case '1':
				return Soft_dollar;
			case '2':
				return Step_in;
			case '3':
				return Step_out;
			case '4':
				return Soft_dollar_in;
			case '5':
				return Soft_dollar_out;
			case '6':
				return Plan_sponsor;
			default:
				return Unkown;
		}
	}
}
