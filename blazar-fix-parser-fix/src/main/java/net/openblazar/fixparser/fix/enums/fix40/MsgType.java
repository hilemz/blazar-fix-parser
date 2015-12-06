package net.openblazar.fixparser.fix.enums.fix40;

import sun.rmi.runtime.Log;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum MsgType {

	Heartbeat('0', "Heartbeat"),
	Test_Request('1', "Test Request"),
	Resend_Request('2', "Resend Request"),
	Reject('3', "Reject"),
	Sequence_Reset('4', "Sequence Reset"),
	Logout('5', "Logout"),
	Indication_of_Interest('6', "Indication of Interest"),
	Adverisement('7', "Adverisement"),
	Execution_Report('8', "Execution Report"),
	Order_Cancel_Reject('9', "Order Cancel Reject"),
	Logon('A', "Logon"),
	News('B', "News"),
	Email('C', "Email"),
	Order_Single('D', "Order Single"),
	Order_List('E', "Order List"),
	Order_Cancel_Request('F', "Order Cancel Request"),
	Order_Replace_Request('G', "Order Cancel/Replace Request"),
	Order_Status_Request('H', "Order Status Request"),
	Allocation('J', "Allocation"),
	List_Cancel_Request('K', "List Cancel Request"),
	List_Execute('L', "List Execute"),
	List_Status_Request('M', "List Status Request"),
	List_Status('N', "List Status"),
	Allocation_ACK('P', "Allocation ACK"),
	Dont_Know_Trade('Q', "Don't Know Trade"),
	Quote_Request('R', "Quote Request"),
	Quote('S', "Quote"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	MsgType(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public MsgType getMsgTypeFromCode(char code) {
		switch (code) {
			case '0':
				return Heartbeat;
			case '1':
				return Test_Request;
			case '2':
				return Resend_Request;
			case '3':
				return Reject;
			case '4':
				return Sequence_Reset;
			case '5':
				return Logout;
			case '6':
				return Indication_of_Interest;
			case '7':
				return Adverisement;
			case '8':
				return Execution_Report;
			case '9':
				return Order_Cancel_Reject;
			case 'A':
				return Logon;
			case 'B':
				return News;
			case 'C':
				return Email;
			case 'D':
				return Order_Single;
			case 'E':
				return Order_List;
			case 'F':
				return Order_Cancel_Request;
			case 'G':
				return Order_Replace_Request;
			case 'H':
				return Order_Status_Request;
			case 'J':
				return Allocation;
			case 'K':
				return List_Cancel_Request;
			case 'L':
				return List_Execute;
			case 'M':
				return List_Status_Request;
			case 'N':
				return List_Status;
			case 'P':
				return Allocation_ACK;
			case 'Q':
				return Dont_Know_Trade;
			case 'R':
				return Quote_Request;
			case 'S':
				return Quote;
			default:
				return Unkown;
		}
	}

}
