package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum IOIQualifier {

	Crossing_opportunity('X', "Crossing Oportunity"),
	At_the_open('O', "At the open"),
	More_behind('M', "More_behind"),
	Taking_position('P', "Taking a position"),
	Versus('V', "Versus"),
	Current_quote('Q', "Current Quote"),
	At_the_close('C', "At the close"),
	Porfolio('S', "Portfolio show-n"),
	In_touch('I', "In touch with"),
	Indication('W', "Indication - Wokring away"),
	All_or_none('A', "All or none"),
	Limit('L', "Limit"),
	Through_the_day('T', "Through the day"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	IOIQualifier(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public IOIQualifier getIOIQualifierFromCode(char code) {
		switch (code) {
			case 'X':
				return Crossing_opportunity;
			case 'O':
				return At_the_open;
			case 'M':
				return More_behind;
			case 'P':
				return Taking_position;
			case 'V':
				return Versus;
			case 'Q':
				return Current_quote;
			case 'C':
				return At_the_close;
			case 'S':
				return Porfolio;
			case 'I':
				return In_touch;
			case 'W':
				return Indication;
			case 'A':
				return All_or_none;
			case 'L':
				return Limit;
			case 'T':
				return Through_the_day;
			default:
				return Unknown;
		}
	}
}

