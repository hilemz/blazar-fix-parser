package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum ExecInst {

	Not_Held('1', "Not Held"),
	Work('2', "Work"),
	Go_along('3', "Go along"),
	Over_the_day('4', "Over the day"),
	Held('5', "Held"),
	Participate_dont_initiate('6', "Participate don't initiate"),
	Strict_scale('7', "Strict scale"),
	Try_to_scale('8', "Try to scale"),
	Stay_on_bidside('9', "Stay on bidside"),
	Stay_on_offerside('0', "Stay on offerside"),
	No_cross('A', "No cross"),
	Ok_to_cross('B', "Ok to cross"),
	Call_first('C', "Call first"),
	Percent_of_volume('D', "Percent of volume"),
	Do_not_increase('E', "Do not increase"),
	Do_not_reduce('F', "Do not reduce"),
	All_or_none('G', "All or none"),
	Institutions_only('I', "Institutions only"),
	Last_peg('L', "Last peg"),
	Mid_price_peg('M', "Mid-price peg"),
	Non_negotiable('N', "Non-negotiable"),
	Opening_peg('O', "Opening peg"),
	Market_peg('P', "Market peg"),
	Primary_peg('R', "Primary peg"),
	Suspend('S', "Suspend"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	ExecInst(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public ExecInst getExecInstFromCode(char code) {
		switch (code) {
			case '1':
				return Not_Held;
			case '2':
				return Work;
			case '3':
				return Go_along;
			case '4':
				return Over_the_day;
			case '5':
				return Held;
			case '6':
				return Participate_dont_initiate;
			case '7':
				return Strict_scale;
			case '8':
				return Try_to_scale;
			case '9':
				return Stay_on_bidside;
			case '0':
				return Stay_on_offerside;
			case 'A':
				return No_cross;
			case 'B':
				return Ok_to_cross;
			case 'C':
				return Call_first;
			case 'D':
				return Percent_of_volume;
			case 'E':
				return Do_not_increase;
			case 'F':
				return Do_not_reduce;
			case 'G':
				return All_or_none;
			case 'I':
				return Institutions_only;
			case 'L':
				return Last_peg;
			case 'M':
				return Mid_price_peg;
			case 'N':
				return Non_negotiable;
			case 'O':
				return Opening_peg;
			case 'P':
				return Market_peg;
			case 'R':
				return Primary_peg;
			case 'S':
				return Suspend;
			default:
				return Unkown;
		}
	}
}
