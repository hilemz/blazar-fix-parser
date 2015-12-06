package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 06.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum OrdRejReason {

	BrokerOption('0', "Broker Option"),
	UnknownSymbol('1', "Unknown Symbol"),
	ExchangeClosed('2', "Exchange Closed"),
	OrderExceedsLimit('3', "Order Exceeds Limit"),
	TooLateToEnter('4', "Too Late To Enter"),
	Unknown(' ', "Unknown");

	private final char code;
	private final String niceName;

	OrdRejReason(char code, String niceName) {
		this.code = code;
		this.niceName = niceName;
	}

	public char getCode() {
		return code;
	}

	public String getNiceName() {
		return niceName;
	}

	public OrdRejReason getOrdRejReasonFromCode(char code) {
		switch (code) {
			case '0':
				return BrokerOption;
			case '1':
				return UnknownSymbol;
			case '2':
				return ExchangeClosed;
			case '3':
				return OrderExceedsLimit;
			case '4':
				return TooLateToEnter;
			default:
				return Unknown;
		}
	}
}
