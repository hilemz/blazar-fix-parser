package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum Rule80A {

	Agency('A', "Agency single order"),
	Individual('I', "Individual Investor, single order"),
	Program_index_firm('D', "Program Order, index arb, for Member firm/org"),
	Program_nonindex_firm('C', "Program Order, non-index arb, for Member firm/org"),
	Program_index_individual('J', "Program Order, index arb, for individual customer"),
	Program_nonindex_individual('K', "Program Order, non-index arb, for individual customer"),
	Program_index_agency('U', "Program Order, index arb, for other agency"),
	Program_nonindex_agency('Y', "Program Order, non-index arb, for other agency"),
	Program_index_other('M', "Program Order, index arb, for other member"),
	Program_nonindex_other('N', "Program Order, non-index arb, for other member"),
	Other('W', "All other orders as agent for other member"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	Rule80A(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public Rule80A getRule80AFromCode(char code) {
		switch (code) {
			case 'A':
				return Agency;
			case 'I':
				return Individual;
			case 'D':
				return Program_index_firm;
			case 'C':
				return Program_nonindex_firm;
			case 'J':
				return Program_index_individual;
			case 'K':
				return Program_nonindex_individual;
			case 'U':
				return Program_index_agency;
			case 'Y':
				return Program_nonindex_agency;
			case 'M':
				return Program_index_other;
			case 'N':
				return Program_nonindex_other;
			case 'W':
				return Other;
			default:
				return Unkown;
		}
	}
}
