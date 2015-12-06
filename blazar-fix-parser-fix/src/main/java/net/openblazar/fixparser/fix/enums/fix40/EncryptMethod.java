package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum EncryptMethod {

	None('0', "None / other"),
	PKCS('1', "PKCS (proprietary)"),
	DES('2', "DES (EBC mode)"),
	PKCS_DES('3', "PKCS/DES (proprietary)"),
	PGP_DES('4', "PGP/DES (defunct)"),
	PGP_DES_MD5('5', "PGP/DES-MD5"),
	PEM_DES_MD5('6', "PEM/DES-MD5"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	EncryptMethod(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public String getNiceName() {
		return niceName;
	}

	public char getCode() {
		return code;
	}

	public EncryptMethod getEncryptMethodFromCode(char code) {
		switch (code) {
			case '0':
				return None;
			case '1':
				return PKCS;
			case '2':
				return DES;
			case '3':
				return PKCS_DES;
			case '4':
				return PGP_DES;
			case '5':
				return PGP_DES_MD5;
			case '6':
				return PEM_DES_MD5;
			default:
				return Unknown;
		}
	}
}
