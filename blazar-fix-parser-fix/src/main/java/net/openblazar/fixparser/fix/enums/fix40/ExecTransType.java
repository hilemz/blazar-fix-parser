package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum ExecTransType {

	New('0'),
	Cancel('1'),
	Correct('2'),
	Status('3'),
	Unkown(' ');

	private final char code;

	ExecTransType(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public ExecTransType getExecTransTypeFromCode(char code) {
		switch (code) {
			case '0':
				return New;
			case '1':
				return Cancel;
			case '2':
				return Correct;
			case '3':
				return Status;
			default:
				return Unkown;
		}
	}
}
