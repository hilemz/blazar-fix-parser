package net.openblazar.fixparser.fix.enums;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum Fix43 {

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
	SecurityIDSource(22),
	IOIid(23),
	IOIOthSvc(24),
	IOIQltyInd(25),
	IOIRefID(26),
	IOIQty(27),
	IOITransType(28),
	LastCapacity(29),
	LastMkt(30),
	LastPx(31),
	LastQty(32),
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
	Quantity(53),
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
	TotNoOrders(68),
	ListExecInst(69),
	AllocID(70),
	AllocTransType(71),
	RefAllocID(72),
	NoOrders(73),
	AvgPrxPrecision(74),
	TradeDate(75),
	ExecBroker(76),
	PositionEffect(77),
	NoAllocs(78),
	AllocAccount(79),
	AllocQty(80),
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
	ResetSeqNumFlag(141),
	SenderLocationID(142),
	TargetLocationID(143),
	OnBehalfOfLocationID(144),
	DeliverToLocationID(145),
	NoRelatedSym(146),
	Subject(147),
	Headline(148),
	URLLink(149),
	ExecType(150),
	LeavesQty(151),
	CashOrderQty(152),
	AllocAvgPx(153),
	AllocNetMoney(154),
	SettlCurrFxRate(155),
	SettlCurrFxRateCalc(156),
	NumDaysInterest(157),
	AccruedInterestRate(158),
	AccruedInterestAmt(159),
	SettlInstMode(160),
	AllocText(161),
	SettlInstID(162),
	SettlInstTransType(163),
	EmailThreadID(164),
	SettlInstSource(165),
	SettlLocation(166),
	SecurityType(167),
	EffectiveTime(168),
	StandInstDbType(169),
	StandInstDbName(170),
	StandInstDbID(171),
	SettlDeliveryType(172),
	SettlDepositoryCode(173),
	SettlBrkrCode(174),
	SettlInstCode(175),
	SecuritySettlAgentName(176),
	SecuritySettlAgentCode(177),
	SecuritySettlAgentAcctNum(178),
	SecuritySettlAgentAcctName(179),
	SecuritySettlAgentContactName(180),
	SecuritySettlAgentContactPhone(181),
	CashSettlAgentName(182),
	CashSettlAgentCode(183),
	CashSettlAgentAcctNum(184),
	CashSettlAgentAcctName(185),
	CashSettlAgentContactName(186),
	CashSettlAgentContactPhone(187),
	BidSpotRate(188),
	BidForwardPoints(189),
	OfferSpotRate(190),
	OfferForwardPoints(191),
	OrderQty2(192),
	FutSettDate2(193),
	LastSpotRate(194),
	LastForwardPoints(195),
	AllocLinkID(196),
	AllocLinkType(197),
	SecondaryOrderID(198),
	NoIOIQualifiers(199),
	MaturityMonthYear(200),
	PutOrCall(201),
	StrikePrice(202),
	CoveredOrUncovered(203),
	CustomerOrFirm(204),
	MaturityDay(205),
	OptAttribute(206),
	SecurityExchange(207),
	NotifyBrokerOfCredit(208),
	AllocHandlInst(209),
	MaxShow(210),
	PegDifference(211),
	XmlDataLen(212),
	XmlData(213),
	SettlInstRefID(214),
	NoRoutingIDs(215),
	RoutingType(216),
	RoutingID(217),
	Spread(218),
	Benchmark(219),
	BenchmarkCurveCurrency(220),
	BenchmarkCurveName(221),
	BenchmarkCurvePoint(222),
	CouponRate(223),
	CouponPaymentDate(224),
	IssueDate(225),
	RepurchaseTerm(226),
	RepurchaseRate(227),
	Factor(228),
	TradeOriginationDate(229),
	ExDate(230),
	ContractMultiplier(231),
	NoStipulations(232),
	StipulationType(233),
	StipulationValue(234),
	YieldType(235),
	Yield(236),
	TotalTakedown(237),
	Concession(238),
	RepoCollateralSecurityType(239),
	RedemptionDate(240),
	UnderlyingCouponPaymentDate(241),
	UnderlyingIssueDate(242),
	UnderlyingRepoCollateralSecurityType(243),
	UnderlyingRepurchaseTerm(244),
	UnderlyingRepurchaseRate(245),
	UnderlyingFactor(246),
	UnderlyingRedemptionDate(247),
	LegCouponPaymentDate(248),
	LegIssueDate(249),
	LegRepoCollateralSecurityType(250),
	LegRepurchaseTerm(251),
	LegRepurchaseRate(252),
	LegFactor(253),
	LegRedemptionDate(254),
	CreditRating(255),
	UnderlyingCreditRating(256),
	LegCreditRating(257),
	TradedFlatSwitch(258),
	BasisFeatureDate(259),
	BasisFeaturePrice(260),
	MDReqID(262),
	SubscriptionRequestType(263),
	MarketDepth(264),
	MDUpdateType(265),
	AggregatedBook(266),
	NoMDEntryTypes(267),
	NoMDEntries(268),
	MDEntryType(269),
	MDEntryPx(270),
	MDEntrySize(271),
	MDEntryDate(272),
	MDEntryTime(273),
	TickDirection(274),
	MDMkt(275),
	QuoteCondition(276),
	TradeCondition(277),
	MDEntryID(278),
	MDUpdateAction(279),
	MDEntryRefID(280),
	MDReqRejReason(281),
	MDEntryOriginator(282),
	LocationID(283),
	DeskID(284),
	DeleteReason(285),
	OpenCloseSettleFlag(286),
	SellerDays(287),
	MDEntryBuyer(288),
	MDEntrySeller(289),
	MDEntryPositionNo(290),
	FinancialStatus(291),
	CorporateAction(292),
	DefBidSize(293),
	DefOfferSize(294),
	NoQuoteEntries(295),
	NoQuoteSets(296),
	QuoteStatus(297),
	QuoteCancelType(298),
	QuoteEntryID(299),
	QuoteRejectReason(300),
	QuoteResponseLevel(301),
	QuoteSetID(302),
	QuoteRequestType(303),
	TotQuoteEntries(304),
	UnderlyingSecurityIDSource(305),
	UnderlyingIssuer(306),
	UnderlyingSecurityDesc(307),
	UnderlyingSecurityExchange(308),
	UnderlyingSecurityID(309),
	UnderlyingSecurityType(310),
	UnderlyingSymbol(311),
	UnderlyingSymbolSfx(312),
	UnderlyingMaturityMonthYear(313),
	UnderlyingMaturityDay(314),
	UnderlyingPutOrCall(315),
	UnderlyingStrikePrice(316),
	UnderlyingOptAttribute(317),
	Underlying(318),
	RatioQty(319),
	SecurityReqID(320),
	SecurityRequestType(321),
	SecurityResponseID(322),
	SecurityResponseType(323),
	SecurityStatusReqID(324),
	UnsolicitedIndicator(325),
	SecurityTradingStatus(326),
	HaltReason(327),
	InViewOfCommon(328),
	DueToRelated(329),
	BuyVolume(330),
	SellVolume(331),
	HighPx(332),
	LowPx(333),
	Adjustment(334),
	TradSesReqID(335),
	TradingSessionID(336),
	ContraTrader(337),
	TradSesMethod(338),
	TradSesMode(339),
	TradSesStatus(340),
	TradSesStartTime(341),
	TradSesOpenTime(342),
	TradSesPreCloseTime(343),
	TradSesCloseTime(344),
	TradSesEndTime(345),
	NumberOfOrders(346),
	MessageEncoding(347),
	EncodedIssuerLen(348),
	EncodedIssuer(349),
	EncodedSecurityDescLen(350),
	EncodedSecurityDesc(351),
	EncodedListExecInstLen(352),
	EncodedListExecInst(353),
	EncodedTextLen(354),
	EncodedText(355),
	EncodedSubjectLen(356),
	EncodedSubject(357),
	EncodedHeadlineLen(358),
	EncodedHeadline(359),
	EncodedAllocTextLen(360),
	EncodedAllocText(361),
	EncodedUnderlyingIssuerLen(362),
	EncodedUnderlyingIssuer(363),
	EncodedUnderlyingSecurityDescLen(364),
	EncodedUnderlyingSecurityDesc(365),
	AllocPrice(366),
	QuoteSetValidUntilTime(367),
	QuoteEntryRejectReason(368),
	LastMsgSeqNumProcessed(369),
	OnBehalfOfSendingTime(370),
	RefTagID(371),
	RefMsgType(372),
	SessionRejectReason(373),
	BidRequestTransType(374),
	ContraBroker(375),
	ComplianceID(376),
	SolicitedFlag(377),
	ExecRestatementReason(378),
	BusinessRejectRefID(379),
	BusinessRejectReason(380),
	GrossTradeAmt(381),
	NoContraBrokers(382),
	MaxMessageSize(383),
	NoMsgTypes(384),
	MsgDirection(385),
	NoTradingSessions(386),
	TotalVolumeTraded(387),
	DiscretionInst(388),
	DiscretionOffset(389),
	BidID(390),
	ClientBidID(391),
	ListName(392),
	TotalNumSecurities(393),
	BidType(394),
	NumTickets(395),
	SideValue1(396),
	SideValue2(397),
	NoBidDescriptors(398),
	BidDescriptorType(399),
	BidDescriptor(400),
	SideValueInd(401),
	LiquidityPctLow(402),
	LiquidityPctHigh(403),
	LiquidityValue(404),
	EFPTrackingError(405),
	FairValue(406),
	OutsideIndexPct(407),
	ValueOfFutures(408),
	LiquidityIndType(409),
	WtAverageLiquidity(410),
	ExchangeForPhysical(411),
	OutMainCntryUIndex(412),
	CrossPercent(413),
	ProgRptReqs(414),
	ProgPeriodInterval(415),
	IncTaxInd(416),
	NumBidders(417),
	TradeType(418),
	BasisPxType(419),
	NoBidComponents(420),
	Country(421),
	TotNoStrikes(422),
	PriceType(423),
	DayOrderQty(424),
	DayCumQty(425),
	DayAvgPx(426),
	GTBookingInst(427),
	NoStrikes(428),
	ListStatusType(429),
	NetGrossInd(430),
	ListOrderStatus(431),
	ExpireDate(432),
	ListExecInstType(433),
	CxlRejResponseTo(434),
	UnderlyingCouponRate(435),
	UnderlyingContractMultiplier(436),
	ContraTradeQty(437),
	ContraTradeTime(438),
	ClearingFirm(439),
	ClearingAccount(440),
	LiquidityNumSecurities(441),
	MultiLegReportingType(442),
	StrikeTime(443),
	ListStatusText(444),
	EncodedListStatusTextLen(445),
	EncodedListStatusText(446),
	PartyIDSource(447),
	PartyID(448),
	TotalVolumeTradedDate(449),
	TotalVolumeTradedTime(450),
	NetChgPrevDay(451),
	PartyRole(452),
	NoPartyIDs(453),
	NoSecurityAltID(454),
	SecurityAltID(455),
	SecurityAltIDSource(456),
	NoUnderlyingSecurityAltID(457),
	UnderlyingSecurityAltID(458),
	UnderlyingSecurityAltIDSource(459),
	Product(460),
	CFICode(461),
	UnderlyingProduct(462),
	UnderlyingCFICode(463),
	TestMessageIndicator(464),
	QuantityType(465),
	BookingRefID(466),
	IndividualAllocID(467),
	RoundingDirection(468),
	RoundingModulus(469),
	CountryOfIssue(470),
	StateOrProvinceOfIssue(471),
	LocaleOfIssue(472),
	NoRegistDtls(473),
	MailingDtls(474),
	InvestorCountryOfResidence(475),
	PaymentRef(476),
	DistribPaymentMethod(477),
	CashDistribCurr(478),
	CommCurrency(479),
	CancellationRights(480),
	MoneyLaunderingStatus(481),
	MailingInst(482),
	TransBkdTime(483),
	ExecPriceType(484),
	ExecPriceAdjustment(485),
	DateOfBirth(486),
	TradeReportTransType(487),
	CardHolderName(488),
	CardNumber(489),
	CardExpDate(490),
	CardIssNo(491),
	PaymentMethod(492),
	RegistAcctType(493),
	Designation(494),
	TaxAdvantageType(495),
	RegistRejReasonText(496),
	FundRenewWaiv(497),
	CashDistribAgentName(498),
	CashDistribAgentCode(499),
	CashDistribAgentAcctNumber(500),
	CashDistribPayRef(501),
	CashDistribAgentAcctName(502),
	CardStartDate(503),
	PaymentDate(504),
	PaymentRemitterID(505),
	RegistStatus(506),
	RegistRejReasonCode(507),
	RegistRefID(508),
	RegistDetls(509),
	NoDistribInsts(510),
	RegistEmail(511),
	DistribPercentage(512),
	RegistID(513),
	RegistTransType(514),
	ExecValuationPoint(515),
	OrderPercent(516),
	OwnershipType(517),
	NoContAmts(518),
	ContAmtType(519),
	ContAmtValue(520),
	ContAmtCurr(521),
	OwnerType(522),
	PartySubID(523),
	NestedPartyID(524),
	NestedPartyIDSource(525),
	SecondaryClOrdID(526),
	SecondaryExecID(527),
	OrderCapacity(528),
	OrderRestrictions(529),
	MassCancelRequestType(530),
	MassCancelResponse(531),
	MassCancelRejectReason(532),
	TotalAffectedOrders(533),
	NoAffectedOrders(534),
	AffectedOrderID(535),
	AffectedSecondaryOrderID(536),
	QuoteType(537),
	NestedPartyRole(538),
	NoNestedPartyIDs(539),
	TotalAccruedInterestAmt(540),
	MaturityDate(541),
	UnderlyingMaturityDate(542),
	InstrRegistry(543),
	CashMargin(544),
	NestedPartySubID(545),
	Scope(546),
	MDImplicitDelete(547),
	CrossID(548),
	CrossType(549),
	CrossPrioritization(550),
	OrigCrossID(551),
	NoSides(552),
	Username(553),
	Password(554),
	NoLegs(555),
	LegCurrency(556),
	TotalNumSecurityTypes(557),
	NoSecurityTypes(558),
	SecurityListRequestType(559),
	SecurityRequestResult(560),
	RoundLot(561),
	MinTradeVol(562),
	MultiLegRptTypeReq(563),
	LegPositionEffect(564),
	LegCoveredOrUncovered(565),
	LegPrice(566),
	TradSesStatusRejReason(567),
	TradeRequestID(568),
	TradeRequestType(569),
	PreviouslyReported(570),
	TradeReportID(571),
	TradeReportRefID(572),
	MatchStatus(573),
	MatchType(574),
	OddLot(575),
	NoClearingInstructions(576),
	ClearingInstruction(577),
	TradeInputSource(578),
	TradeInputDevice(579),
	NoDates(580),
	AccountType(581),
	CustOrderCapacity(582),
	ClOrdLinkID(583),
	MassStatusReqID(584),
	MassStatusReqType(585),
	OrigOrdModTime(586),
	LegSettlmntTyp(587),
	LegFutSettDate(588),
	DayBookingInst(589),
	BookingUnit(590),
	PreallocMethod(591),
	UnderlyingCountryOfIssue(592),
	UnderlyingStateOrProvinceOfIssue(593),
	UnderlyingLocaleOfIssue(594),
	UnderlyingInstrRegistry(595),
	LegCountryOfIssue(596),
	LegStateOrProvinceOfIssue(597),
	LegLocaleOfIssue(598),
	LegInstrRegistry(599),
	LegSymbol(600),
	LegSymbolSfx(601),
	LegSecurityID(602),
	LegSecurityIDSource(603),
	NoLegSecurityAltID(604),
	LegSecurityAltID(605),
	LegSecurityAltIDSource(606),
	LegProduct(607),
	LegCFICode(608),
	LegSecurityType(609),
	LegMaturityMonthYear(610),
	LegMaturityDate(611),
	LegStrikePrice(612),
	LegOptAttribute(613),
	LegContractMultiplier(614),
	LegCouponRate(615),
	LegSecurityExchange(616),
	LegIssuer(617),
	EncodedLegIssuerLen(618),
	EncodedLegIssuer(619),
	LegSecurityDesc(620),
	EncodedLegSecurityDescLen(621),
	EncodedLegSecurityDesc(622),
	LegRatioQty(623),
	LegSide(624),
	TradingSessionSubID(625),
	AllocType(626),
	NoHops(627),
	HopCompID(628),
	HopSendingTime(629),
	HopRefID(630),
	MidPx(631),
	BidYield(632),
	MidYield(633),
	OfferYield(634),
	ClearingFeeIndicator(635),
	WorkingIndicator(636),
	LegLastPx(637),
	PriorityIndicator(638),
	PriceImprovement(639),
	Price2(640),
	LastForwardPoints2(641),
	BidForwardPoints2(642),
	OfferForwardPoints2(643),
	RFQReqID(644),
	MktBidPx(645),
	MktOfferPx(646),
	MinBidSize(647),
	MinOfferSize(648),
	QuoteStatusReqID(649),
	LegalConfirm(650),
	UnderlyingLastPx(651),
	UnderlyingLastQty(652),
	SecDefStatus(653),
	LegRefID(654),
	ContraLegRefID(655),
	SettlCurrBidFxRate(656),
	SettlCurrOfferFxRate(657),
	QuoteRequestRejectReason(658),
	SideComplianceID(659),
	Unkown(0);

	private final int tag;

	private Fix43(int tag) {
		this.tag = tag;
	}

	public int getTag() {
		return tag;
	}

	public Fix43 getFieldFromTag(int tag) {
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
				return SecurityIDSource;
			case 23:
				return IOIid;
			case 24:
				return IOIOthSvc;
			case 25:
				return IOIQltyInd;
			case 26:
				return IOIRefID;
			case 27:
				return IOIQty;
			case 28:
				return IOITransType;
			case 29:
				return LastCapacity;
			case 30:
				return LastMkt;
			case 31:
				return LastPx;
			case 32:
				return LastQty;
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
				return Quantity;
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
				return TotNoOrders;
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
				return PositionEffect;
			case 78:
				return NoAllocs;
			case 79:
				return AllocAccount;
			case 80:
				return AllocQty;
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
			case 141:
				return ResetSeqNumFlag;
			case 142:
				return SenderLocationID;
			case 143:
				return TargetLocationID;
			case 144:
				return OnBehalfOfLocationID;
			case 145:
				return DeliverToLocationID;
			case 146:
				return NoRelatedSym;
			case 147:
				return Subject;
			case 148:
				return Headline;
			case 149:
				return URLLink;
			case 150:
				return ExecType;
			case 151:
				return LeavesQty;
			case 152:
				return CashOrderQty;
			case 153:
				return AllocAvgPx;
			case 154:
				return AllocNetMoney;
			case 155:
				return SettlCurrFxRate;
			case 156:
				return SettlCurrFxRateCalc;
			case 157:
				return NumDaysInterest;
			case 158:
				return AccruedInterestRate;
			case 159:
				return AccruedInterestAmt;
			case 160:
				return SettlInstMode;
			case 161:
				return AllocText;
			case 162:
				return SettlInstID;
			case 163:
				return SettlInstTransType;
			case 164:
				return EmailThreadID;
			case 165:
				return SettlInstSource;
			case 166:
				return SettlLocation;
			case 167:
				return SecurityType;
			case 168:
				return EffectiveTime;
			case 169:
				return StandInstDbType;
			case 170:
				return StandInstDbName;
			case 171:
				return StandInstDbID;
			case 172:
				return SettlDeliveryType;
			case 173:
				return SettlDepositoryCode;
			case 174:
				return SettlBrkrCode;
			case 175:
				return SettlInstCode;
			case 176:
				return SecuritySettlAgentName;
			case 177:
				return SecuritySettlAgentCode;
			case 178:
				return SecuritySettlAgentAcctNum;
			case 179:
				return SecuritySettlAgentAcctName;
			case 180:
				return SecuritySettlAgentContactName;
			case 181:
				return SecuritySettlAgentContactPhone;
			case 182:
				return CashSettlAgentName;
			case 183:
				return CashSettlAgentCode;
			case 184:
				return CashSettlAgentAcctNum;
			case 185:
				return CashSettlAgentAcctName;
			case 186:
				return CashSettlAgentContactName;
			case 187:
				return CashSettlAgentContactPhone;
			case 188:
				return BidSpotRate;
			case 189:
				return BidForwardPoints;
			case 190:
				return OfferSpotRate;
			case 191:
				return OfferForwardPoints;
			case 192:
				return OrderQty2;
			case 193:
				return FutSettDate2;
			case 194:
				return LastSpotRate;
			case 195:
				return LastForwardPoints;
			case 196:
				return AllocLinkID;
			case 197:
				return AllocLinkType;
			case 198:
				return SecondaryOrderID;
			case 199:
				return NoIOIQualifiers;
			case 200:
				return MaturityMonthYear;
			case 201:
				return PutOrCall;
			case 202:
				return StrikePrice;
			case 203:
				return CoveredOrUncovered;
			case 204:
				return CustomerOrFirm;
			case 205:
				return MaturityDay;
			case 206:
				return OptAttribute;
			case 207:
				return SecurityExchange;
			case 208:
				return NotifyBrokerOfCredit;
			case 209:
				return AllocHandlInst;
			case 210:
				return MaxShow;
			case 211:
				return PegDifference;
			case 212:
				return XmlDataLen;
			case 213:
				return XmlData;
			case 214:
				return SettlInstRefID;
			case 215:
				return NoRoutingIDs;
			case 216:
				return RoutingType;
			case 217:
				return RoutingID;
			case 218:
				return Spread;
			case 219:
				return Benchmark;
			case 220:
				return BenchmarkCurveCurrency;
			case 221:
				return BenchmarkCurveName;
			case 222:
				return BenchmarkCurvePoint;
			case 223:
				return CouponRate;
			case 224:
				return CouponPaymentDate;
			case 225:
				return IssueDate;
			case 226:
				return RepurchaseTerm;
			case 227:
				return RepurchaseRate;
			case 228:
				return Factor;
			case 229:
				return TradeOriginationDate;
			case 230:
				return ExDate;
			case 231:
				return ContractMultiplier;
			case 232:
				return NoStipulations;
			case 233:
				return StipulationType;
			case 234:
				return StipulationValue;
			case 235:
				return YieldType;
			case 236:
				return Yield;
			case 237:
				return TotalTakedown;
			case 238:
				return Concession;
			case 239:
				return RepoCollateralSecurityType;
			case 240:
				return RedemptionDate;
			case 241:
				return UnderlyingCouponPaymentDate;
			case 242:
				return UnderlyingIssueDate;
			case 243:
				return UnderlyingRepoCollateralSecurityType;
			case 244:
				return UnderlyingRepurchaseTerm;
			case 245:
				return UnderlyingRepurchaseRate;
			case 246:
				return UnderlyingFactor;
			case 247:
				return UnderlyingRedemptionDate;
			case 248:
				return LegCouponPaymentDate;
			case 249:
				return LegIssueDate;
			case 250:
				return LegRepoCollateralSecurityType;
			case 251:
				return LegRepurchaseTerm;
			case 252:
				return LegRepurchaseRate;
			case 253:
				return LegFactor;
			case 254:
				return LegRedemptionDate;
			case 255:
				return CreditRating;
			case 256:
				return UnderlyingCreditRating;
			case 257:
				return LegCreditRating;
			case 258:
				return TradedFlatSwitch;
			case 259:
				return BasisFeatureDate;
			case 260:
				return BasisFeaturePrice;
			case 262:
				return MDReqID;
			case 263:
				return SubscriptionRequestType;
			case 264:
				return MarketDepth;
			case 265:
				return MDUpdateType;
			case 266:
				return AggregatedBook;
			case 267:
				return NoMDEntryTypes;
			case 268:
				return NoMDEntries;
			case 269:
				return MDEntryType;
			case 270:
				return MDEntryPx;
			case 271:
				return MDEntrySize;
			case 272:
				return MDEntryDate;
			case 273:
				return MDEntryTime;
			case 274:
				return TickDirection;
			case 275:
				return MDMkt;
			case 276:
				return QuoteCondition;
			case 277:
				return TradeCondition;
			case 278:
				return MDEntryID;
			case 279:
				return MDUpdateAction;
			case 280:
				return MDEntryRefID;
			case 281:
				return MDReqRejReason;
			case 282:
				return MDEntryOriginator;
			case 283:
				return LocationID;
			case 284:
				return DeskID;
			case 285:
				return DeleteReason;
			case 286:
				return OpenCloseSettleFlag;
			case 287:
				return SellerDays;
			case 288:
				return MDEntryBuyer;
			case 289:
				return MDEntrySeller;
			case 290:
				return MDEntryPositionNo;
			case 291:
				return FinancialStatus;
			case 292:
				return CorporateAction;
			case 293:
				return DefBidSize;
			case 294:
				return DefOfferSize;
			case 295:
				return NoQuoteEntries;
			case 296:
				return NoQuoteSets;
			case 297:
				return QuoteStatus;
			case 298:
				return QuoteCancelType;
			case 299:
				return QuoteEntryID;
			case 300:
				return QuoteRejectReason;
			case 301:
				return QuoteResponseLevel;
			case 302:
				return QuoteSetID;
			case 303:
				return QuoteRequestType;
			case 304:
				return TotQuoteEntries;
			case 305:
				return UnderlyingSecurityIDSource;
			case 306:
				return UnderlyingIssuer;
			case 307:
				return UnderlyingSecurityDesc;
			case 308:
				return UnderlyingSecurityExchange;
			case 309:
				return UnderlyingSecurityID;
			case 310:
				return UnderlyingSecurityType;
			case 311:
				return UnderlyingSymbol;
			case 312:
				return UnderlyingSymbolSfx;
			case 313:
				return UnderlyingMaturityMonthYear;
			case 314:
				return UnderlyingMaturityDay;
			case 315:
				return UnderlyingPutOrCall;
			case 316:
				return UnderlyingStrikePrice;
			case 317:
				return UnderlyingOptAttribute;
			case 318:
				return Underlying;
			case 319:
				return RatioQty;
			case 320:
				return SecurityReqID;
			case 321:
				return SecurityRequestType;
			case 322:
				return SecurityResponseID;
			case 323:
				return SecurityResponseType;
			case 324:
				return SecurityStatusReqID;
			case 325:
				return UnsolicitedIndicator;
			case 326:
				return SecurityTradingStatus;
			case 327:
				return HaltReason;
			case 328:
				return InViewOfCommon;
			case 329:
				return DueToRelated;
			case 330:
				return BuyVolume;
			case 331:
				return SellVolume;
			case 332:
				return HighPx;
			case 333:
				return LowPx;
			case 334:
				return Adjustment;
			case 335:
				return TradSesReqID;
			case 336:
				return TradingSessionID;
			case 337:
				return ContraTrader;
			case 338:
				return TradSesMethod;
			case 339:
				return TradSesMode;
			case 340:
				return TradSesStatus;
			case 341:
				return TradSesStartTime;
			case 342:
				return TradSesOpenTime;
			case 343:
				return TradSesPreCloseTime;
			case 344:
				return TradSesCloseTime;
			case 345:
				return TradSesEndTime;
			case 346:
				return NumberOfOrders;
			case 347:
				return MessageEncoding;
			case 348:
				return EncodedIssuerLen;
			case 349:
				return EncodedIssuer;
			case 350:
				return EncodedSecurityDescLen;
			case 351:
				return EncodedSecurityDesc;
			case 352:
				return EncodedListExecInstLen;
			case 353:
				return EncodedListExecInst;
			case 354:
				return EncodedTextLen;
			case 355:
				return EncodedText;
			case 356:
				return EncodedSubjectLen;
			case 357:
				return EncodedSubject;
			case 358:
				return EncodedHeadlineLen;
			case 359:
				return EncodedHeadline;
			case 360:
				return EncodedAllocTextLen;
			case 361:
				return EncodedAllocText;
			case 362:
				return EncodedUnderlyingIssuerLen;
			case 363:
				return EncodedUnderlyingIssuer;
			case 364:
				return EncodedUnderlyingSecurityDescLen;
			case 365:
				return EncodedUnderlyingSecurityDesc;
			case 366:
				return AllocPrice;
			case 367:
				return QuoteSetValidUntilTime;
			case 368:
				return QuoteEntryRejectReason;
			case 369:
				return LastMsgSeqNumProcessed;
			case 370:
				return OnBehalfOfSendingTime;
			case 371:
				return RefTagID;
			case 372:
				return RefMsgType;
			case 373:
				return SessionRejectReason;
			case 374:
				return BidRequestTransType;
			case 375:
				return ContraBroker;
			case 376:
				return ComplianceID;
			case 377:
				return SolicitedFlag;
			case 378:
				return ExecRestatementReason;
			case 379:
				return BusinessRejectRefID;
			case 380:
				return BusinessRejectReason;
			case 381:
				return GrossTradeAmt;
			case 382:
				return NoContraBrokers;
			case 383:
				return MaxMessageSize;
			case 384:
				return NoMsgTypes;
			case 385:
				return MsgDirection;
			case 386:
				return NoTradingSessions;
			case 387:
				return TotalVolumeTraded;
			case 388:
				return DiscretionInst;
			case 389:
				return DiscretionOffset;
			case 390:
				return BidID;
			case 391:
				return ClientBidID;
			case 392:
				return ListName;
			case 393:
				return TotalNumSecurities;
			case 394:
				return BidType;
			case 395:
				return NumTickets;
			case 396:
				return SideValue1;
			case 397:
				return SideValue2;
			case 398:
				return NoBidDescriptors;
			case 399:
				return BidDescriptorType;
			case 400:
				return BidDescriptor;
			case 401:
				return SideValueInd;
			case 402:
				return LiquidityPctLow;
			case 403:
				return LiquidityPctHigh;
			case 404:
				return LiquidityValue;
			case 405:
				return EFPTrackingError;
			case 406:
				return FairValue;
			case 407:
				return OutsideIndexPct;
			case 408:
				return ValueOfFutures;
			case 409:
				return LiquidityIndType;
			case 410:
				return WtAverageLiquidity;
			case 411:
				return ExchangeForPhysical;
			case 412:
				return OutMainCntryUIndex;
			case 413:
				return CrossPercent;
			case 414:
				return ProgRptReqs;
			case 415:
				return ProgPeriodInterval;
			case 416:
				return IncTaxInd;
			case 417:
				return NumBidders;
			case 418:
				return TradeType;
			case 419:
				return BasisPxType;
			case 420:
				return NoBidComponents;
			case 421:
				return Country;
			case 422:
				return TotNoStrikes;
			case 423:
				return PriceType;
			case 424:
				return DayOrderQty;
			case 425:
				return DayCumQty;
			case 426:
				return DayAvgPx;
			case 427:
				return GTBookingInst;
			case 428:
				return NoStrikes;
			case 429:
				return ListStatusType;
			case 430:
				return NetGrossInd;
			case 431:
				return ListOrderStatus;
			case 432:
				return ExpireDate;
			case 433:
				return ListExecInstType;
			case 434:
				return CxlRejResponseTo;
			case 435:
				return UnderlyingCouponRate;
			case 436:
				return UnderlyingContractMultiplier;
			case 437:
				return ContraTradeQty;
			case 438:
				return ContraTradeTime;
			case 439:
				return ClearingFirm;
			case 440:
				return ClearingAccount;
			case 441:
				return LiquidityNumSecurities;
			case 442:
				return MultiLegReportingType;
			case 443:
				return StrikeTime;
			case 444:
				return ListStatusText;
			case 445:
				return EncodedListStatusTextLen;
			case 446:
				return EncodedListStatusText;
			case 447:
				return PartyIDSource;
			case 448:
				return PartyID;
			case 449:
				return TotalVolumeTradedDate;
			case 450:
				return TotalVolumeTraded;
			case 451:
				return NetChgPrevDay;
			case 452:
				return PartyRole;
			case 453:
				return NoPartyIDs;
			case 454:
				return NoSecurityAltID;
			case 455:
				return SecurityAltID;
			case 456:
				return SecurityAltIDSource;
			case 457:
				return NoUnderlyingSecurityAltID;
			case 458:
				return UnderlyingSecurityAltID;
			case 459:
				return UnderlyingSecurityAltIDSource;
			case 460:
				return Product;
			case 461:
				return CFICode;
			case 462:
				return UnderlyingProduct;
			case 463:
				return UnderlyingCFICode;
			case 464:
				return TestMessageIndicator;
			case 465:
				return QuantityType;
			case 466:
				return BookingRefID;
			case 467:
				return IndividualAllocID;
			case 468:
				return RoundingDirection;
			case 469:
				return RoundingModulus;
			case 470:
				return CountryOfIssue;
			case 471:
				return StateOrProvinceOfIssue;
			case 472:
				return LocaleOfIssue;
			case 473:
				return NoRegistDtls;
			case 474:
				return MailingDtls;
			case 475:
				return InvestorCountryOfResidence;
			case 476:
				return PaymentRef;
			case 477:
				return DistribPaymentMethod;
			case 478:
				return CashDistribCurr;
			case 479:
				return CommCurrency;
			case 480:
				return CancellationRights;
			case 481:
				return MoneyLaunderingStatus;
			case 482:
				return MailingInst;
			case 483:
				return TransBkdTime;
			case 484:
				return ExecPriceType;
			case 485:
				return ExecPriceAdjustment;
			case 486:
				return DateOfBirth;
			case 487:
				return TradeReportTransType;
			case 488:
				return CardHolderName;
			case 489:
				return CardNumber;
			case 490:
				return CardExpDate;
			case 491:
				return CardIssNo;
			case 492:
				return PaymentMethod;
			case 493:
				return RegistAcctType;
			case 494:
				return Designation;
			case 495:
				return TaxAdvantageType;
			case 496:
				return RegistRejReasonText;
			case 497:
				return FundRenewWaiv;
			case 498:
				return CashDistribAgentName;
			case 499:
				return CashDistribAgentCode;
			case 500:
				return CashDistribAgentAcctNumber;
			case 501:
				return CashDistribPayRef;
			case 502:
				return CashDistribAgentAcctName;
			case 503:
				return CardStartDate;
			case 504:
				return PaymentDate;
			case 505:
				return PaymentRemitterID;
			case 506:
				return RegistStatus;
			case 507:
				return RegistRejReasonCode;
			case 508:
				return RegistRefID;
			case 509:
				return RegistDetls;
			case 510:
				return NoDistribInsts;
			case 511:
				return RegistEmail;
			case 512:
				return DistribPercentage;
			case 513:
				return RegistID;
			case 514:
				return RegistTransType;
			case 515:
				return ExecValuationPoint;
			case 516:
				return OrderPercent;
			case 517:
				return OwnershipType;
			case 518:
				return NoContAmts;
			case 519:
				return ContAmtType;
			case 520:
				return ContAmtValue;
			case 521:
				return ContAmtCurr;
			case 522:
				return OwnerType;
			case 523:
				return PartySubID;
			case 524:
				return NestedPartyID;
			case 525:
				return NestedPartyIDSource;
			case 526:
				return SecondaryClOrdID;
			case 527:
				return SecondaryExecID;
			case 528:
				return OrderCapacity;
			case 529:
				return OrderRestrictions;
			case 530:
				return MassCancelRequestType;
			case 531:
				return MassCancelResponse;
			case 532:
				return MassCancelRejectReason;
			case 533:
				return TotalAffectedOrders;
			case 534:
				return NoAffectedOrders;
			case 535:
				return AffectedOrderID;
			case 536:
				return AffectedSecondaryOrderID;
			case 537:
				return QuoteType;
			case 538:
				return NestedPartyRole;
			case 539:
				return NoNestedPartyIDs;
			case 540:
				return TotalAccruedInterestAmt;
			case 541:
				return MaturityDate;
			case 542:
				return UnderlyingMaturityDate;
			case 543:
				return InstrRegistry;
			case 544:
				return CashMargin;
			case 545:
				return NestedPartySubID;
			case 546:
				return Scope;
			case 547:
				return MDImplicitDelete;
			case 548:
				return CrossID;
			case 549:
				return CrossType;
			case 550:
				return CrossPrioritization;
			case 551:
				return OrigCrossID;
			case 552:
				return NoSides;
			case 553:
				return Username;
			case 554:
				return Password;
			case 555:
				return NoLegs;
			case 556:
				return LegCurrency;
			case 557:
				return TotalNumSecurityTypes;
			case 558:
				return NoSecurityTypes;
			case 559:
				return SecurityListRequestType;
			case 560:
				return SecurityRequestResult;
			case 561:
				return RoundLot;
			case 562:
				return MinTradeVol;
			case 563:
				return MultiLegRptTypeReq;
			case 564:
				return LegPositionEffect;
			case 565:
				return LegCoveredOrUncovered;
			case 566:
				return LegPrice;
			case 567:
				return TradSesStatusRejReason;
			case 568:
				return TradeRequestID;
			case 569:
				return TradeRequestType;
			case 570:
				return PreviouslyReported;
			case 571:
				return TradeReportID;
			case 572:
				return TradeReportRefID;
			case 573:
				return MatchStatus;
			case 574:
				return MatchType;
			case 575:
				return OddLot;
			case 576:
				return NoClearingInstructions;
			case 577:
				return ClearingInstruction;
			case 578:
				return TradeInputSource;
			case 579:
				return TradeInputDevice;
			case 580:
				return NoDates;
			case 581:
				return AccountType;
			case 582:
				return CustOrderCapacity;
			case 583:
				return ClOrdLinkID;
			case 584:
				return MassStatusReqID;
			case 585:
				return MassStatusReqType;
			case 586:
				return OrigOrdModTime;
			case 587:
				return LegSettlmntTyp;
			case 588:
				return LegFutSettDate;
			case 589:
				return DayBookingInst;
			case 590:
				return BookingUnit;
			case 591:
				return PreallocMethod;
			case 592:
				return UnderlyingCountryOfIssue;
			case 593:
				return UnderlyingStateOrProvinceOfIssue;
			case 594:
				return UnderlyingLocaleOfIssue;
			case 595:
				return UnderlyingInstrRegistry;
			case 596:
				return LegCountryOfIssue;
			case 597:
				return LegStateOrProvinceOfIssue;
			case 598:
				return LegLocaleOfIssue;
			case 599:
				return LegInstrRegistry;
			case 600:
				return LegSymbol;
			case 601:
				return LegSymbolSfx;
			case 602:
				return LegSecurityID;
			case 603:
				return LegSecurityIDSource;
			case 604:
				return NoLegSecurityAltID;
			case 605:
				return LegSecurityAltID;
			case 606:
				return LegSecurityAltIDSource;
			case 607:
				return LegProduct;
			case 608:
				return LegCFICode;
			case 609:
				return LegSecurityType;
			case 610:
				return LegMaturityMonthYear;
			case 611:
				return LegMaturityDate;
			case 612:
				return LegStrikePrice;
			case 613:
				return LegOptAttribute;
			case 614:
				return LegContractMultiplier;
			case 615:
				return LegCouponRate;
			case 616:
				return LegSecurityExchange;
			case 617:
				return LegIssuer;
			case 618:
				return EncodedLegIssuerLen;
			case 619:
				return EncodedLegIssuer;
			case 620:
				return LegSecurityDesc;
			case 621:
				return EncodedLegSecurityDescLen;
			case 622:
				return EncodedLegSecurityDesc;
			case 623:
				return LegRatioQty;
			case 624:
				return LegSide;
			case 625:
				return TradingSessionSubID;
			case 626:
				return AllocType;
			case 627:
				return NoHops;
			case 628:
				return HopCompID;
			case 629:
				return HopSendingTime;
			case 630:
				return HopRefID;
			case 631:
				return MidPx;
			case 632:
				return BidYield;
			case 633:
				return MidYield;
			case 634:
				return OfferYield;
			case 635:
				return ClearingFeeIndicator;
			case 636:
				return WorkingIndicator;
			case 637:
				return LegLastPx;
			case 638:
				return PriorityIndicator;
			case 639:
				return PriceImprovement;
			case 640:
				return Price2;
			case 641:
				return LastForwardPoints2;
			case 642:
				return BidForwardPoints2;
			case 643:
				return OfferForwardPoints2;
			case 644:
				return RFQReqID;
			case 645:
				return MktBidPx;
			case 646:
				return MktOfferPx;
			case 647:
				return MinBidSize;
			case 648:
				return MinOfferSize;
			case 649:
				return QuoteStatusReqID;
			case 650:
				return LegalConfirm;
			case 651:
				return UnderlyingLastPx;
			case 652:
				return UnderlyingLastQty;
			case 653:
				return SecDefStatus;
			case 654:
				return LegRefID;
			case 655:
				return ContraLegRefID;
			case 656:
				return SettlCurrBidFxRate;
			case 657:
				return SettlCurrOfferFxRate;
			case 658:
				return QuoteRequestRejectReason;
			case 659:
				return SideComplianceID;
			default:
				return Unkown;
		}
	}

}
