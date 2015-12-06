package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum AllocStatus {

	Accepted('0', "Accepted"),
	Rejected('1', "Rejected"),
	Partial_Accept('2', "Partial Accept"),
	Received('3', "Received"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	AllocStatus(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public AllocStatus getAllocStatusFromCode(char code) {
		switch (code) {
			case '0':
				return Accepted;
			case '1':
				return Rejected;
			case '2':
				return Partial_Accept;
			case '3':
				return Received;
			default:
				return Unkown;
		}
	}
}
