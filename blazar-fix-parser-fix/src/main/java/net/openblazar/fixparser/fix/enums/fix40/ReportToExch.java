package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum ReportToExch {

	Yes('Y'),
	No('N'),
	Unknown(' ');

	private final char code;

	ReportToExch(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public ReportToExch getReportToExchFromCode(char code) {
		switch (code) {
			case 'Y':
				return Yes;
			case 'N':
				return No;
			default:
				return Unknown;
		}
	}
}
