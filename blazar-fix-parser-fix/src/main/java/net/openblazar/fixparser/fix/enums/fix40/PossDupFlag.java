package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum PossDupFlag {

	Duplicate('Y', "Possible duplicate"),
	Original('N', "Original transmission"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	PossDupFlag(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public PossDupFlag getPossDupFlagFromCode(char code) {
		switch (code) {
			case 'Y':
				return Duplicate;
			case 'N':
				return Original;
			default:
				return Unkown;
		}
	}
}
