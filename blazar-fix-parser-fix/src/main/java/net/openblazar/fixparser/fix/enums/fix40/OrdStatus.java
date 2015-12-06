package net.openblazar.fixparser.fix.enums.fix40;

import javafx.scene.paint.Stop;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum OrdStatus {

	New('0', "New"),
	Partially_Filled('1', "Partially Filled"),
	Filled('2', "Filled"),
	Done_for_day('3', "Done for day"),
	Canceled('4', "Canceled"),
	Replaced('5', "Replaced"),
	Pending_CancelReplace('6', "Pending Cancel/Replace"),
	Stopped('7', "Stopped"),
	Rejected('8', "Rejected"),
	Suspended('9', "Suspended"),
	Pending_New('A', "Pending New"),
	Calculated('B', "Calculated"),
	Expired('C', "Expired"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	OrdStatus(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public OrdStatus getOrdStatusFromCode(char code) {
		switch (code) {
			case '0':
				return New;
			case '1':
				return Partially_Filled;
			case '2':
				return Filled;
			case '3':
				return Done_for_day;
			case '4':
				return Canceled;
			case '5':
				return Replaced;
			case '6':
				return Pending_CancelReplace;
			case '7':
				return Stopped;
			case '8':
				return Rejected;
			case '9':
				return Suspended;
			case 'A':
				return Pending_New;
			case 'B':
				return Calculated;
			case 'C':
				return Expired;
			default:
				return Unkown;
		}
	}
}
