package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum LastCapacity {

	Agent('1', "Agent"),
	Cross_agent('2', "Cross as agent"),
	Cross_principal('3', "Cross as principal"),
	Principal('4', "Principal"),
	Unkown(' ', "Unkown");

	private final char code;
	private final String niceName;

	LastCapacity(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public LastCapacity getLastCapacityFromCode(char code) {
		switch (code) {
			case '1':
				return Agent;
			case '2':
				return Cross_agent;
			case '3':
				return Cross_principal;
			case '4':
				return Principal;
			default:
				return Unkown;
		}
	}
}

