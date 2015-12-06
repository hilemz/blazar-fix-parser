package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum CxlType {

	Partial_cancel('P', "Partial cancel"),
	Full('F', "Full remaining quantity"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	CxlType(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public CxlType getCxlTypeFromCode(char code) {
		switch (code) {
			case 'P':
				return Partial_cancel;
			case 'F':
				return Full;
			default:
				return Unknown;
		}
	}
}

