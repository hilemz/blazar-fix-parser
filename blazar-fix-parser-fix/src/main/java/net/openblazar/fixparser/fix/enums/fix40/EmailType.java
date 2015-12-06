package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum EmailType {

	New('0', "New"),
	Reply('1', "Reply"),
	Admin_Reply('2', "Admin Reply"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	EmailType(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public EmailType getEmailTypeFromCode(char code) {
		switch (code) {
			case '0':
				return New;
			case '1':
				return Reply;
			case '2':
				return Admin_Reply;
			default:
				return Unknown;
		}
	}
}
