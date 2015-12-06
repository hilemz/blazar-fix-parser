package net.openblazar.fixparser.fix.enums.fix40;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum Fix40 {

	Account(1),
	AdvId(2),
	AdvRefID(3),
	AdvSide(4),
	AdvTransType(5),
	AvgPx(6),
	BeginSeqNo(7),
	BeginString(8),
	BodyLength(9),
	CheckSum(10),
	ClOrdID(11),
	Commission(12),
	CommType(13),
	CumQty(14),
	Currency(15),
	EndSeqNo(16),
	ExecID(17),
	ExecInst(18),
	ExecRefID(19),
	ExecTransType(20),
	HandlInst(21),
	IDSource(22),
	IOIid(23),
	IOIOthSvc(24),
	IOIQltyInd(25),
	IOIRefID(26),
	IOIShares(27),
	IOITransType(28),
	LastCapacity(29),
	LastMkt(30),
	LastPx(31),
	LastShares(32),
	LinesOfText(33),
	MsgSeqNum(34),
	MsgType(35),
	NewSeqNo(36),
	OrderID(37),
	OrderQty(38),
	OrdStatus(39),
	OrdType(40),
	OrigClOrdID(41),
	OrigTime(42),
	PossDupFlag(43),
	Price(44),
	RefSeqNum(45),
	RelatdSym(46),
	Rule80A(47),
	SecurityID(48),
	SenderCompID(49),
	SenderSubID(50),
	SendingDate(51),
	SendingTime(52),
	Shares(53),
	Side(54),
	Symbol(55),
	TargetCompID(56),
	TargetSubID(57),
	Text(58),
	TimeInForce(59),
	TransactTime(60),
	Urgency(61),
	ValidUntilTime(62),
	SettlmntTyp(63),
	FutSettDate(64),
	SymbolSfx(65),
	ListID(66),
	ListSeqNo(67),
	ListNoOrds(68),
	ListExecInst(69),
	AllocID(70),
	AllocTransType(71),
	RefAllocID(72),
	NoOrders(73),
	AvgPrxPrecision(74),
	TradeDate(75),
	ExecBroker(76),
	OpenClose(77),
	NoAllocs(78),
	AllocAccount(79),
	AllocShares(80),
	ProcessCode(81),
	NoRpts(82),
	RptSeq(83),
	CxlQty(84),
	NoDlvyInst(85),
	DlvyInst(86),
	AllocStatus(87),
	AllocRejCode(88),
	Signature(89),
	SecureDataLen(90),
	SecureData(91),
	BrokerOfCredit(92),
	SignatureLength(93),
	EmailType(94),
	RawDataLength(95),
	RawData(96),
	PossResend(97),
	EncryptMethod(98),
	StopPx(99),
	ExDestination(100),
	CxlRejReason(102),
	OrdRejReason(103),
	IOIQualifier(104),
	WaveNo(105),
	Issuer(106),
	SecurityDesc(107),
	HeartBtInt(108),
	ClientID(109),
	MinQty(110),
	MaxFloor(111),
	TestReqID(112),
	ReportToExch(113),
	LocateReqd(114),
	OnBehalfOfCompID(115),
	OnBehalfOfSubID(116),
	QuoteID(117),
	NetMoney(118),
	SettlCurrAmt(119),
	SettlCurrency(120),
	ForexReq(121),
	OrigSendingTime(122),
	GapFillFlag(123),
	NoExecs(124),
	CxlType(125),
	ExpireTime(126),
	DKReason(127),
	DeliverToCompID(128),
	DeliverToSubID(129),
	IOINaturalFlag(130),
	QuoteReqID(131),
	BidPx(132),
	OfferPx(133),
	BidSize(134),
	OfferSize(135),
	NoMiscFees(136),
	MiscFeeAmt(137),
	MiscFeeCurr(138),
	MiscFeeType(139),
	PrevClosePx(140),
	Unkown(0);

	private final int tag;

	private Fix40(int tag) {
		this.tag = tag;
	}

	public int getTag() {
		return tag;
	}

	public Fix40 getFieldFromTag(int tag) {
		switch (tag) {
			case 1:
				return Account;
			case 2:
				return AdvId;
			case 3:
				return AdvRefID;
			case 4:
				return AdvSide;
			case 5:
				return AdvTransType;
			case 6:
				return AvgPx;
			case 7:
				return BeginSeqNo;
			case 8:
				return BeginString;
			case 9:
				return BodyLength;
			case 10:
				return CheckSum;
			case 11:
				return ClOrdID;
			case 12:
				return Commission;
			case 13:
				return CommType;
			case 14:
				return CumQty;
			case 15:
				return Currency;
			case 16:
				return EndSeqNo;
			case 17:
				return ExecID;
			case 18:
				return ExecInst;
			case 19:
				return ExecRefID;
			case 20:
				return ExecTransType;
			case 21:
				return HandlInst;
			case 22:
				return IDSource;
			case 23:
				return IOIid;
			case 24:
				return IOIOthSvc;
			case 25:
				return IOIQltyInd;
			case 26:
				return IOIRefID;
			case 27:
				return IOIShares;
			case 28:
				return IOITransType;
			case 29:
				return LastCapacity;
			case 30:
				return LastMkt;
			case 31:
				return LastPx;
			case 32:
				return LastShares;
			case 33:
				return LinesOfText;
			case 34:
				return MsgSeqNum;
			case 35:
				return MsgType;
			case 36:
				return NewSeqNo;
			case 37:
				return OrderID;
			case 38:
				return OrderQty;
			case 39:
				return OrdStatus;
			case 40:
				return OrdType;
			case 41:
				return OrigClOrdID;
			case 42:
				return OrigTime;
			case 43:
				return PossDupFlag;
			case 44:
				return Price;
			case 45:
				return RefSeqNum;
			case 46:
				return RelatdSym;
			case 47:
				return Rule80A;
			case 48:
				return SecurityID;
			case 49:
				return SenderCompID;
			case 50:
				return SenderSubID;
			case 51:
				return SendingDate;
			case 52:
				return SendingTime;
			case 53:
				return Shares;
			case 54:
				return Side;
			case 55:
				return Symbol;
			case 56:
				return TargetCompID;
			case 57:
				return TargetSubID;
			case 58:
				return Text;
			case 59:
				return TimeInForce;
			case 60:
				return TransactTime;
			case 61:
				return Urgency;
			case 62:
				return ValidUntilTime;
			case 63:
				return SettlmntTyp;
			case 64:
				return FutSettDate;
			case 65:
				return SymbolSfx;
			case 66:
				return ListID;
			case 67:
				return ListSeqNo;
			case 68:
				return ListNoOrds;
			case 69:
				return ListExecInst;
			case 70:
				return AllocID;
			case 71:
				return AllocTransType;
			case 72:
				return RefAllocID;
			case 73:
				return NoOrders;
			case 74:
				return AvgPrxPrecision;
			case 75:
				return TradeDate;
			case 76:
				return ExecBroker;
			case 77:
				return OpenClose;
			case 78:
				return NoAllocs;
			case 79:
				return AllocAccount;
			case 80:
				return AllocShares;
			case 81:
				return ProcessCode;
			case 82:
				return NoRpts;
			case 83:
				return RptSeq;
			case 84:
				return CxlQty;
			case 85:
				return NoDlvyInst;
			case 86:
				return DlvyInst;
			case 87:
				return AllocStatus;
			case 88:
				return AllocRejCode;
			case 89:
				return Signature;
			case 90:
				return SecureDataLen;
			case 91:
				return SecureData;
			case 92:
				return BrokerOfCredit;
			case 93:
				return SignatureLength;
			case 94:
				return EmailType;
			case 95:
				return RawDataLength;
			case 96:
				return RawData;
			case 97:
				return PossResend;
			case 98:
				return EncryptMethod;
			case 99:
				return StopPx;
			case 100:
				return ExDestination;
			case 102:
				return CxlRejReason;
			case 103:
				return OrdRejReason;
			case 104:
				return IOIQualifier;
			case 105:
				return WaveNo;
			case 106:
				return Issuer;
			case 107:
				return SecurityDesc;
			case 108:
				return HeartBtInt;
			case 109:
				return ClientID;
			case 110:
				return MinQty;
			case 111:
				return MaxFloor;
			case 112:
				return TestReqID;
			case 113:
				return ReportToExch;
			case 114:
				return LocateReqd;
			case 115:
				return OnBehalfOfCompID;
			case 116:
				return OnBehalfOfSubID;
			case 117:
				return QuoteID;
			case 118:
				return NetMoney;
			case 119:
				return SettlCurrAmt;
			case 120:
				return SettlCurrency;
			case 121:
				return ForexReq;
			case 122:
				return OrigSendingTime;
			case 123:
				return GapFillFlag;
			case 124:
				return NoExecs;
			case 125:
				return CxlType;
			case 126:
				return ExpireTime;
			case 127:
				return DKReason;
			case 128:
				return DeliverToCompID;
			case 129:
				return DeliverToSubID;
			case 130:
				return IOINaturalFlag;
			case 131:
				return QuoteReqID;
			case 132:
				return BidPx;
			case 133:
				return OfferPx;
			case 134:
				return BidSize;
			case 135:
				return OfferSize;
			case 136:
				return NoMiscFees;
			case 137:
				return MiscFeeAmt;
			case 138:
				return MiscFeeCurr;
			case 139:
				return MiscFeeType;
			case 140:
				return PrevClosePx;
			default:
				return Unkown;
		}
	}

}
