package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum CxlRejReason {

	TooLateToCancel('0', "Too Late To Cancel"),
	UnknownOrder('1', "Unknown Order"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	CxlRejReason(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public String getNiceName() {
		return niceName;
	}

	public char getCode() {
		return code;
	}

	public CxlRejReason getCxlRejReasonFromCode(char code) {
		switch (code) {
			case '0':
				return TooLateToCancel;
			case '1':
				return UnknownOrder;
			default:
				return Unknown;
		}
	}
}
