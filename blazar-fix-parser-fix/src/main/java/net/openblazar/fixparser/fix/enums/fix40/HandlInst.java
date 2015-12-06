package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum HandlInst {

	Automated_no_broker('1', "Automated execution order, private, no Broker intervention"),
	Automated_broker('2', "Automated execution order, public, Broker intervention OK"),
	Manual_order('3', "Manual order, best execution"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	HandlInst(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public HandlInst getHandlInstFromCode(char code) {
		switch (code) {
			case '1':
				return Automated_no_broker;
			case '2':
				return Automated_broker;
			case '3':
				return Manual_order;
			default:
				return Unkown;
		}
	}


}
