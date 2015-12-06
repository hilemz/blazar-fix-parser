package net.openblazar.fixparser.fix.enums;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum FixType {

	FIX_40("FIX.4.0"),
	FIX_41("FIX.4.1"),
	FIX_42("FIX.4.2"),
	FIX_43("FIX.4.3"),
	FIX_44("FIX.4.4"),
	FIX_50("FIXT.1.1");

	private String code;

	private FixType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public FixType getTypeFromCode(String code) {
		switch (code) {
			case "FIX.4.0":
				return FIX_40;
			case "FIX.4.1":
				return FIX_41;
			case "FIX.4.2":
				return FIX_42;
			case "FIX.4.3":
				return FIX_43;
			case "FIX.4.4":
				return FIX_44;
			case "FIXT.1.1":
				return FIX_50;
			default:
				throw new IllegalArgumentException("Invalid Fix Type code: " + code);
		}
	}
}
