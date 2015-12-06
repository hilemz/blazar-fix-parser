package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum IOIOthSvc {

	Autex('A'),
	Bridge('B'),
	Unkown(' ');

	private final char code;

	IOIOthSvc(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public IOIOthSvc getIOIOthSvcFromCode(char code) {
		switch (code) {
			case 'A':
				return Autex;
			case 'B':
				return Bridge;
			default:
				return Unkown;
		}
	}
}
