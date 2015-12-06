package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum TimeInForce {

	Day('0', "Day"),
	GTC('1', "Good Till Cancel (GTC)"),
	OPG('2', "At the Opening (OPG)"),
	OC('3', "Immediate or Cancel (OC"),
	FOK('4', "Fill or Kill (FOK)"),
	GTX('5', "Good Till Crossing (GTX)"),
	GTD('6', "Good Till Date (GTD)"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	TimeInForce(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public TimeInForce getTimeInForceFromCode(char code) {
		switch (code) {
			case '0':
				return Day;
			case '1':
				return GTC;
			case '2':
				return OPG;
			case '3':
				return OC;
			case '4':
				return FOK;
			case '5':
				return GTX;
			case '6':
				return GTD;
			default:
				return Unkown;
		}
	}
}
