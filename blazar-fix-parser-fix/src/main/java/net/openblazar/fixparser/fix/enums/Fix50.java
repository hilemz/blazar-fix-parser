package net.openblazar.fixparser.fix.enums;

/**
 * Date: 05.12.2015
 *
 * @author Wojciech Zankowski
 */
public enum Fix50 {

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
	IOIID(23),
	IOIOthSvc(24),
	IOIQltyInd(25),
	IOIRefID(26),
	IOIQty(27),
	IOITransType(28),
	LastCapacity(29),
	LastMkt(30),
	LastPx(31),
	LastQty(32),
	NoLinesOfText(33),
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
	SettlType(63),
	SettlDate(64),
	SymbolSfx(65),
	ListID(66),
	ListSeqNo(67),
	TotNoOrders(68),
	ListExecInst(69),
	AllocID(70),
	AllocTransType(71),
	RefAllocID(72),
	NoOrders(73),
	AvgPxPrecision(74),
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
	NotDefined(101),
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
	SettlDate2(193),
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
	PegOffsetValue(211),
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
	Reserved(261),
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
	OpenCloseSettlFlag(286),
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
	TotNoQuoteEntries(304),
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
	UnderlyingCurrency(318),
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
	DiscretionOffsetValue(389),
	BidID(390),
	ClientBidID(391),
	ListName(392),
	TotNoRelatedSym(393),
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
	BidTradeType(418),
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
	CardIssNum(491),
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
	RegistDtls(509),
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
	TotNoSecurityTypes(557),
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
	LegSettlType(587),
	LegSettlDate(588),
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
	AcctIDSource(660),
	AllocAcctIDSource(661),
	BenchmarkPrice(662),
	BenchmarkPriceType(663),
	ConfirmID(664),
	ConfirmStatus(665),
	ConfirmTransType(666),
	ContractSettlMonth(667),
	DeliveryForm(668),
	LastParPx(669),
	NoLegAllocs(670),
	LegAllocAccount(671),
	LegIndividualAllocID(672),
	LegAllocQty(673),
	LegAllocAcctIDSource(674),
	LegSettlCurrency(675),
	LegBenchmarkCurveCurrency(676),
	LegBenchmarkCurveName(677),
	LegBenchmarkCurvePoint(678),
	LegBenchmarkPrice(679),
	LegBenchmarkPriceType(680),
	LegBidPx(681),
	LegIOIQty(682),
	NoLegStipulations(683),
	LegOfferPx(684),
	LegOrderQty(685),
	LegPriceType(686),
	LegQty(687),
	LegStipulationType(688),
	LegStipulationValue(689),
	LegSwapType(690),
	Pool(691),
	QuotePriceType(692),
	QuoteRespID(693),
	QuoteRespType(694),
	QuoteQualifier(695),
	YieldRedemptionDate(696),
	YieldRedemptionPrice(697),
	YieldRedemptionPriceType(698),
	BenchmarkSecurityID(699),
	ReversalIndicator(700),
	YieldCalcDate(701),
	NoPositions(702),
	PosType(703),
	LongQty(704),
	ShortQty(705),
	PosQtyStatus(706),
	PosAmtType(707),
	PosAmt(708),
	PosTransType(709),
	PosReqID(710),
	NoUnderlyings(711),
	PosMaintAction(712),
	OrigPosReqRefID(713),
	PosMaintRptRefID(714),
	ClearingBusinessDate(715),
	SettlSessID(716),
	SettlSessSubID(717),
	AdjustmentType(718),
	ContraryInstructionIndicator(719),
	PriorSpreadIndicator(720),
	PosMaintRptID(721),
	PosMaintStatus(722),
	PosMaintResult(723),
	PosReqType(724),
	ResponseTransportType(725),
	ResponseDestination(726),
	TotalNumPosReports(727),
	PosReqResult(728),
	PosReqStatus(729),
	SettlPrice(730),
	SettlPriceType(731),
	UnderlyingSettlPrice(732),
	UnderlyingSettlPriceType(733),
	PriorSettlPrice(734),
	NoQuoteQualifiers(735),
	AllocSettlCurrency(736),
	AllocSettlCurrAmt(737),
	InterestAtMaturity(738),
	LegDatedDate(739),
	LegPool(740),
	AllocInterestAtMaturity(741),
	AllocAccruedInterestAmt(742),
	DeliveryDate(743),
	AssignmentMethod(744),
	AssignmentUnit(745),
	OpenInterest(746),
	ExerciseMethod(747),
	TotNumTradeReports(748),
	TradeRequestResult(749),
	TradeRequestStatus(750),
	TradeReportRejectReason(751),
	SideMultiLegReportingType(752),
	NoPosAmt(753),
	AutoAcceptIndicator(754),
	AllocReportID(755),
	NoNested2PartyIDs(756),
	Nested2PartyID(757),
	Nested2PartyIDSource(758),
	Nested2PartyRole(759),
	Nested2PartySubID(760),
	BenchmarkSecurityIDSource(761),
	SecuritySubType(762),
	UnderlyingSecuritySubType(763),
	LegSecuritySubType(764),
	AllowableOneSidednessPct(765),
	AllowableOneSidednessValue(766),
	AllowableOneSidednessCurr(767),
	NoTrdRegTimestamps(768),
	TrdRegTimestamp(769),
	TrdRegTimestampType(770),
	TrdRegTimestampOrigin(771),
	ConfirmRefID(772),
	ConfirmType(773),
	ConfirmRejReason(774),
	BookingType(775),
	IndividualAllocRejCode(776),
	SettlInstMsgID(777),
	NoSettlInst(778),
	LastUpdateTime(779),
	AllocSettlInstType(780),
	NoSettlPartyIDs(781),
	SettlPartyID(782),
	SettlPartyIDSource(783),
	SettlPartyRole(784),
	SettlPartySubID(785),
	SettlPartySubIDType(786),
	DlvyInstType(787),
	TerminationType(788),
	NextExpectedMsgSeqNum(789),
	OrdStatusReqID(790),
	SettlInstReqID(791),
	SettlInstReqRejCode(792),
	SecondaryAllocID(793),
	AllocReportType(794),
	AllocReportRefID(795),
	AllocCancReplaceReason(796),
	CopyMsgIndicator(797),
	AllocAccountType(798),
	OrderAvgPx(799),
	OrderBookingQty(800),
	NoSettlPartySubIDs(801),
	NoPartySubIDs(802),
	PartySubIDType(803),
	NoNestedPartySubIDs(804),
	NestedPartySubIDType(805),
	NoNested2PartySubIDs(806),
	Nested2PartySubIDType(807),
	AllocIntermedReqType(808),
	NotDefined2(809),
	UnderlyingPx(810),
	PriceDelta(811),
	ApplQueueMax(812),
	ApplQueueDepth(813),
	ApplQueueResolution(814),
	ApplQueueAction(815),
	NoAltMDSource(816),
	AltMDSourceID(817),
	SecondaryTradeReportID(818),
	AvgPxIndicator(819),
	TradeLinkID(820),
	OrderInputDevice(821),
	UnderlyingTradingSessionID(822),
	UnderlyingTradingSessionSubID(823),
	TradeLegRefID(824),
	ExchangeRule(825),
	TradeAllocIndicator(826),
	ExpirationCycle(827),
	TrdType(828),
	TrdSubType(829),
	TransferReason(830),
	AsgnReqID(831),
	TotNumAssignmentReports(832),
	AsgnRptID(833),
	ThresholdAmount(834),
	PegMoveType(835),
	PegOffsetType(836),
	PegLimitType(837),
	PegRoundDirection(838),
	PeggedPrice(839),
	PegScope(840),
	DiscretionMoveType(841),
	DiscretionOffsetType(842),
	DiscretionLimitType(843),
	DiscretionRoundDirection(844),
	DiscretionPrice(845),
	DiscretionScope(846),
	TargetStrategy(847),
	TargetStrategyParameters(848),
	ParticipationRate(849),
	TargetStrategyPerformance(850),
	LastLiquidityInd(851),
	PublishTrdIndicator(852),
	ShortSaleReason(853),
	QtyType(854),
	SecondaryTrdType(855),
	TradeReportType(856),
	AllocNoOrdersType(857),
	SharedCommission(858),
	ConfirmReqID(859),
	AvgParPx(860),
	ReportedPx(861),
	NoCapacities(862),
	OrderCapacityQty(863),
	NoEvents(864),
	EventType(865),
	EventDate(866),
	EventPx(867),
	EventText(868),
	PctAtRisk(869),
	NoInstrAttrib(870),
	InstrAttribType(871),
	InstrAttribValue(872),
	DatedDate(873),
	InterestAccrualDate(874),
	CPProgram(875),
	CPRegType(876),
	UnderlyingCPProgram(877),
	UnderlyingCPRegType(878),
	UnderlyingQty(879),
	TrdMatchID(880),
	SecondaryTradeReportRefID(881),
	UnderlyingDirtyPrice(882),
	UnderlyingEndPrice(883),
	UnderlyingStartValue(884),
	UnderlyingCurrentValue(885),
	UnderlyingEndValue(886),
	NoUnderlyingStips(887),
	UnderlyingStipType(888),
	UnderlyingStipValue(889),
	MaturityNetMoney(890),
	MiscFeeBasis(891),
	TotNoAllocs(892),
	LastFragment(893),
	CollReqID(894),
	CollAsgnReason(895),
	CollInquiryQualifier(896),
	NoTrades(897),
	MarginRatio(898),
	MarginExcess(899),
	TotalNetValue(900),
	CashOutstanding(901),
	CollAsgnID(902),
	CollAsgnTransType(903),
	CollRespID(904),
	CollAsgnRespType(905),
	CollAsgnRejectReason(906),
	CollAsgnRefID(907),
	CollRptID(908),
	CollInquiryID(909),
	CollStatus(910),
	TotNumReports(911),
	LastRptRequested(912),
	AgreementDesc(913),
	AgreementID(914),
	AgreementDate(915),
	StartDate(916),
	EndDate(917),
	AgreementCurrency(918),
	DeliveryType(919),
	EndAccruedInterestAmt(920),
	StartCash(921),
	EndCash(922),
	UserRequestID(923),
	UserRequestType(924),
	NewPassword(925),
	UserStatus(926),
	UserStatusText(927),
	StatusValue(928),
	StatusText(929),
	RefCompID(930),
	RefSubID(931),
	NetworkResponseID(932),
	NetworkRequestID(933),
	LastNetworkResponseID(934),
	NetworkRequestType(935),
	NoCompIDs(936),
	NetworkStatusResponseType(937),
	NoCollInquiryQualifier(938),
	TrdRptStatus(939),
	AffirmStatus(940),
	UnderlyingStrikeCurrency(941),
	LegStrikeCurrency(942),
	TimeBracket(943),
	CollAction(944),
	CollInquiryStatus(945),
	CollInquiryResult(946),
	StrikeCurrency(947),
	NoNested3PartyIDs(948),
	Nested3PartyID(949),
	Nested3PartyIDSource(950),
	Nested3PartyRole(951),
	NoNested3PartySubIDs(952),
	Nested3PartySubID(953),
	Nested3PartySubIDType(954),
	LegContractSettlMonth(955),
	LegInterestAccrualDate(956),
	NoStrategyParameters(957),
	StrategyParameterName(958),
	StrategyParameterType(959),
	StrategyParameterValue(960),
	HostCrossID(961),
	SideTimeInForce(962),
	MDReportID(963),
	SecurityReportID(964),
	SecurityStatus(965),
	SettleOnOpenFlag(966),
	StrikeMultiplier(967),
	StrikeValue(968),
	MinPriceIncrement(969),
	PositionLimit(970),
	NTPositionLimit(971),
	UnderlyingAllocationPercent(972),
	UnderlyingCashAmount(973),
	UnderlyingCashType(974),
	UnderlyingSettlementType(975),
	QuantityDate(976),
	ContIntRptID(977),
	LateIndicator(978),
	InputSource(979),
	SecurityUpdateAction(980),
	NoExpiration(981),
	ExpType(982),
	ExpQty(983),
	NoUnderlyingAmounts(984),
	UnderlyingPayAmount(985),
	UnderlyingCollectAmount(986),
	UnderlyingSettlementDate(987),
	UnderlyingSettlementStatus(988),
	SecondaryIndividualAllocID(989),
	LegReportID(990),
	RndPx(991),
	IndividualAllocType(992),
	AllocCustomerCapacity(993),
	TierCode(994),
	UnitofMeasure(996),
	TimeUnit(997),
	UnderlyingUnitofMeasure(998),
	LegUnitofMeasure(999),
	UnderlyingTimeUnit(1000),
	LegTimeUnit(1001),
	AllocMethod(1002),
	TradeID(1003),
	SideTradeReportID(1005),
	SideFillStationCd(1006),
	SideReasonCd(1007),
	SideTrdSubTyp(1008),
	SideQty(1009),
	MessageEventSource(1011),
	SideTrdRegTimestamp(1012),
	SideTrdRegTimestampType(1013),
	SideTrdRegTimestampSrc(1014),
	AsOfIndicator(1015),
	NoSideTrdRegTS(1016),
	LegOptionRatio(1017),
	NoInstrumentParties(1018),
	InstrumentPartyID(1019),
	TradeVolume(1020),
	MDBookType(1021),
	MDFeedType(1022),
	MDPriceLevel(1023),
	MDOriginType(1024),
	FirstPx(1025),
	MDEntrySpotRate(1026),
	MDEntryForwardPoints(1027),
	ManualOrderIndicator(1028),
	CustDirectedOrder(1029),
	ReceivedDeptID(1030),
	CustOrderHandlingInst(1031),
	OrderHandlingInstSource(1032),
	DeskType(1033),
	DeskTypeSource(1034),
	DeskOrderHandlingInst(1035),
	ExecAckStatus(1036),
	UnderlyingDeliveryAmount(1037),
	UnderlyingCapValue(1038),
	UnderlyingSettlMethod(1039),
	SecondaryTradeID(1040),
	FirmTradeID(1041),
	SecondaryFirmTradeID(1042),
	CollApplType(1043),
	UnderlyingAdjustedQuantity(1044),
	UnderlyingFXRate(1045),
	UnderlyingFXRateCalc(1046),
	AllocPositionEffect(1047),
	DealingCapacity(1048),
	InstrmtAssignmentMethod(1049),
	InstrumentPartyIDSource(1050),
	InstrumentPartyRole(1051),
	NoInstrumentPartySubIDs(1052),
	InstrumentPartySubID(1053),
	InstrumentPartySubIDType(1054),
	PositionCurrency(1055),
	CalculatedCcyLastQty(1056),
	AggressorIndicator(1057),
	NoUndlyInstrumentParties(1058),
	UndlyInstrumentPartyID(1059),
	UndlyInstrumentPartyIDSource(1060),
	UndlyInstrumentPartyRole(1061),
	NoUndlyInstrumentPartySubIDs(1062),
	UndlyInstrumentPartySubID(1063),
	UndlyInstrumentPartySubIDType(1064),
	BidSwapPoints(1065),
	OfferSwapPoints(1066),
	LegBidForwardPoints(1067),
	LegOfferForwardPoints(1068),
	SwapPoints(1069),
	MDQuoteType(1070),
	LastSwapPoints(1071),
	SideGrossTradeAmt(1072),
	LegLastForwardPoints(1073),
	LegCalculatedCcyLastQty(1074),
	LegGrossTradeAmt(1075),
	MaturityTime(1079),
	RefOrderID(1080),
	RefOrderIDSource(1081),
	SecondaryDisplayQty(1082),
	DisplayWhen(1083),
	DisplayMethod(1084),
	DisplayLowQty(1085),
	DisplayHighQty(1086),
	DisplayMinIncr(1087),
	RefreshQty(1088),
	MatchIncrement(1089),
	MaxPriceLevels(1090),
	PreTradeAnonymity(1091),
	PriceProtectionScope(1092),
	LotType(1093),
	PegPriceType(1094),
	PeggedRefPrice(1095),
	PegSecurityIDSource(1096),
	PegSecurityID(1097),
	PegSymbol(1098),
	PegSecurityDesc(1099),
	TriggerType(1100),
	TriggerAction(1101),
	TriggerPrice(1102),
	TriggerSymbol(1103),
	TriggerSecurityID(1104),
	TriggerSecurityIDSource(1105),
	TriggerSecurityDesc(1106),
	TriggerPriceType(1107),
	TriggerPriceTypeScope(1108),
	TriggerPriceDirection(1109),
	TriggerNewPrice(1110),
	TriggerOrderType(1111),
	TriggerNewQty(1112),
	TriggerTradingSessionID(1113),
	TriggerTradingSessionSubID(1114),
	OrderCategory(1115),
	NoRootPartyIDs(1116),
	RootPartyID(1117),
	RootPartyIDSource(1118),
	RootPartyRole(1119),
	NoRootPartySubIDs(1120),
	RootPartySubID(1121),
	RootPartySubIDType(1122),
	TradeHandlingInstr(1123),
	OrigTradeHandlingInstr(1124),
	OrigTradeDate(1125),
	OrigTradeID(1126),
	OrigSecondaryTradeID(1127),
	ApplVerID(1128),
	CstmApplVerID(1129),
	RefApplVerID(1130),
	RefCstmApplVerID(1131),
	TZTransactTime(1132),
	ExDestinationIDSource(1133),
	ReportedPxDiff(1134),
	RptSys(1135),
	AllocClearingFeeIndicator(1136),
	DefaultApplVerID(1137),
	DisplayQty(1138),
	ExchangeSpecialInstructions(1139),
	Unkown(0);

	private final int tag;

	private Fix50(int tag) {
		this.tag = tag;
	}

	public int getTag() {
		return tag;
	}

	public Fix50 getFieldFromTag(int tag) {
		switch(tag) {
			case 1:
				return 	Account;
			case 2:
				return 	AdvId;
			case 3:
				return 	AdvRefID;
			case 4:
				return 	AdvSide;
			case 5:
				return 	AdvTransType;
			case 6:
				return 	AvgPx;
			case 7:
				return 	BeginSeqNo;
			case 8:
				return 	BeginString;
			case 9:
				return 	BodyLength;
			case 10:
				return 	CheckSum;
			case 11:
				return 	ClOrdID;
			case 12:
				return 	Commission;
			case 13:
				return 	CommType;
			case 14:
				return 	CumQty;
			case 15:
				return 	Currency;
			case 16:
				return 	EndSeqNo;
			case 17:
				return 	ExecID;
			case 18:
				return 	ExecInst;
			case 19:
				return 	ExecRefID;
			case 20:
				return 	ExecTransType;
			case 21:
				return 	HandlInst;
			case 22:
				return 	SecurityIDSource;
			case 23:
				return 	IOIID;
			case 24:
				return 	IOIOthSvc;
			case 25:
				return 	IOIQltyInd;
			case 26:
				return 	IOIRefID;
			case 27:
				return 	IOIQty;
			case 28:
				return 	IOITransType;
			case 29:
				return 	LastCapacity;
			case 30:
				return 	LastMkt;
			case 31:
				return 	LastPx;
			case 32:
				return 	LastQty;
			case 33:
				return 	NoLinesOfText;
			case 34:
				return 	MsgSeqNum;
			case 35:
				return 	MsgType;
			case 36:
				return 	NewSeqNo;
			case 37:
				return 	OrderID;
			case 38:
				return 	OrderQty;
			case 39:
				return 	OrdStatus;
			case 40:
				return 	OrdType;
			case 41:
				return 	OrigClOrdID;
			case 42:
				return 	OrigTime;
			case 43:
				return 	PossDupFlag;
			case 44:
				return 	Price;
			case 45:
				return 	RefSeqNum;
			case 46:
				return 	RelatdSym;
			case 47:
				return 	Rule80A;
			case 48:
				return 	SecurityID;
			case 49:
				return 	SenderCompID;
			case 50:
				return 	SenderSubID;
			case 51:
				return 	SendingDate;
			case 52:
				return 	SendingTime;
			case 53:
				return 	Quantity;
			case 54:
				return 	Side;
			case 55:
				return 	Symbol;
			case 56:
				return 	TargetCompID;
			case 57:
				return 	TargetSubID;
			case 58:
				return 	Text;
			case 59:
				return 	TimeInForce;
			case 60:
				return 	TransactTime;
			case 61:
				return 	Urgency;
			case 62:
				return 	ValidUntilTime;
			case 63:
				return 	SettlType;
			case 64:
				return 	SettlDate;
			case 65:
				return 	SymbolSfx;
			case 66:
				return 	ListID;
			case 67:
				return 	ListSeqNo;
			case 68:
				return 	TotNoOrders;
			case 69:
				return 	ListExecInst;
			case 70:
				return 	AllocID;
			case 71:
				return 	AllocTransType;
			case 72:
				return 	RefAllocID;
			case 73:
				return 	NoOrders;
			case 74:
				return 	AvgPxPrecision;
			case 75:
				return 	TradeDate;
			case 76:
				return 	ExecBroker;
			case 77:
				return 	PositionEffect;
			case 78:
				return 	NoAllocs;
			case 79:
				return 	AllocAccount;
			case 80:
				return 	AllocQty;
			case 81:
				return 	ProcessCode;
			case 82:
				return 	NoRpts;
			case 83:
				return 	RptSeq;
			case 84:
				return 	CxlQty;
			case 85:
				return 	NoDlvyInst;
			case 86:
				return 	DlvyInst;
			case 87:
				return 	AllocStatus;
			case 88:
				return 	AllocRejCode;
			case 89:
				return 	Signature;
			case 90:
				return 	SecureDataLen;
			case 91:
				return 	SecureData;
			case 92:
				return 	BrokerOfCredit;
			case 93:
				return 	SignatureLength;
			case 94:
				return 	EmailType;
			case 95:
				return 	RawDataLength;
			case 96:
				return 	RawData;
			case 97:
				return 	PossResend;
			case 98:
				return 	EncryptMethod;
			case 99:
				return 	StopPx;
			case 100:
				return 	ExDestination;
			case 101:
				return 	NotDefined;
			case 102:
				return 	CxlRejReason;
			case 103:
				return 	OrdRejReason;
			case 104:
				return 	IOIQualifier;
			case 105:
				return 	WaveNo;
			case 106:
				return 	Issuer;
			case 107:
				return 	SecurityDesc;
			case 108:
				return 	HeartBtInt;
			case 109:
				return 	ClientID;
			case 110:
				return 	MinQty;
			case 111:
				return 	MaxFloor;
			case 112:
				return 	TestReqID;
			case 113:
				return 	ReportToExch;
			case 114:
				return 	LocateReqd;
			case 115:
				return 	OnBehalfOfCompID;
			case 116:
				return 	OnBehalfOfSubID;
			case 117:
				return 	QuoteID;
			case 118:
				return 	NetMoney;
			case 119:
				return 	SettlCurrAmt;
			case 120:
				return 	SettlCurrency;
			case 121:
				return 	ForexReq;
			case 122:
				return 	OrigSendingTime;
			case 123:
				return 	GapFillFlag;
			case 124:
				return 	NoExecs;
			case 125:
				return 	CxlType;
			case 126:
				return 	ExpireTime;
			case 127:
				return 	DKReason;
			case 128:
				return 	DeliverToCompID;
			case 129:
				return 	DeliverToSubID;
			case 130:
				return 	IOINaturalFlag;
			case 131:
				return 	QuoteReqID;
			case 132:
				return 	BidPx;
			case 133:
				return 	OfferPx;
			case 134:
				return 	BidSize;
			case 135:
				return 	OfferSize;
			case 136:
				return 	NoMiscFees;
			case 137:
				return 	MiscFeeAmt;
			case 138:
				return 	MiscFeeCurr;
			case 139:
				return 	MiscFeeType;
			case 140:
				return 	PrevClosePx;
			case 141:
				return 	ResetSeqNumFlag;
			case 142:
				return 	SenderLocationID;
			case 143:
				return 	TargetLocationID;
			case 144:
				return 	OnBehalfOfLocationID;
			case 145:
				return 	DeliverToLocationID;
			case 146:
				return 	NoRelatedSym;
			case 147:
				return 	Subject;
			case 148:
				return 	Headline;
			case 149:
				return 	URLLink;
			case 150:
				return 	ExecType;
			case 151:
				return 	LeavesQty;
			case 152:
				return 	CashOrderQty;
			case 153:
				return 	AllocAvgPx;
			case 154:
				return 	AllocNetMoney;
			case 155:
				return 	SettlCurrFxRate;
			case 156:
				return 	SettlCurrFxRateCalc;
			case 157:
				return 	NumDaysInterest;
			case 158:
				return 	AccruedInterestRate;
			case 159:
				return 	AccruedInterestAmt;
			case 160:
				return 	SettlInstMode;
			case 161:
				return 	AllocText;
			case 162:
				return 	SettlInstID;
			case 163:
				return 	SettlInstTransType;
			case 164:
				return 	EmailThreadID;
			case 165:
				return 	SettlInstSource;
			case 166:
				return 	SettlLocation;
			case 167:
				return 	SecurityType;
			case 168:
				return 	EffectiveTime;
			case 169:
				return 	StandInstDbType;
			case 170:
				return 	StandInstDbName;
			case 171:
				return 	StandInstDbID;
			case 172:
				return 	SettlDeliveryType;
			case 173:
				return 	SettlDepositoryCode;
			case 174:
				return 	SettlBrkrCode;
			case 175:
				return 	SettlInstCode;
			case 176:
				return 	SecuritySettlAgentName;
			case 177:
				return 	SecuritySettlAgentCode;
			case 178:
				return 	SecuritySettlAgentAcctNum;
			case 179:
				return 	SecuritySettlAgentAcctName;
			case 180:
				return 	SecuritySettlAgentContactName;
			case 181:
				return 	SecuritySettlAgentContactPhone;
			case 182:
				return 	CashSettlAgentName;
			case 183:
				return 	CashSettlAgentCode;
			case 184:
				return 	CashSettlAgentAcctNum;
			case 185:
				return 	CashSettlAgentAcctName;
			case 186:
				return 	CashSettlAgentContactName;
			case 187:
				return 	CashSettlAgentContactPhone;
			case 188:
				return 	BidSpotRate;
			case 189:
				return 	BidForwardPoints;
			case 190:
				return 	OfferSpotRate;
			case 191:
				return 	OfferForwardPoints;
			case 192:
				return 	OrderQty2;
			case 193:
				return 	SettlDate2;
			case 194:
				return 	LastSpotRate;
			case 195:
				return 	LastForwardPoints;
			case 196:
				return 	AllocLinkID;
			case 197:
				return 	AllocLinkType;
			case 198:
				return 	SecondaryOrderID;
			case 199:
				return 	NoIOIQualifiers;
			case 200:
				return 	MaturityMonthYear;
			case 201:
				return 	PutOrCall;
			case 202:
				return 	StrikePrice;
			case 203:
				return 	CoveredOrUncovered;
			case 204:
				return 	CustomerOrFirm;
			case 205:
				return 	MaturityDay;
			case 206:
				return 	OptAttribute;
			case 207:
				return 	SecurityExchange;
			case 208:
				return 	NotifyBrokerOfCredit;
			case 209:
				return 	AllocHandlInst;
			case 210:
				return 	MaxShow;
			case 211:
				return 	PegOffsetValue;
			case 212:
				return 	XmlDataLen;
			case 213:
				return 	XmlData;
			case 214:
				return 	SettlInstRefID;
			case 215:
				return 	NoRoutingIDs;
			case 216:
				return 	RoutingType;
			case 217:
				return 	RoutingID;
			case 218:
				return 	Spread;
			case 219:
				return 	Benchmark;
			case 220:
				return 	BenchmarkCurveCurrency;
			case 221:
				return 	BenchmarkCurveName;
			case 222:
				return 	BenchmarkCurvePoint;
			case 223:
				return 	CouponRate;
			case 224:
				return 	CouponPaymentDate;
			case 225:
				return 	IssueDate;
			case 226:
				return 	RepurchaseTerm;
			case 227:
				return 	RepurchaseRate;
			case 228:
				return 	Factor;
			case 229:
				return 	TradeOriginationDate;
			case 230:
				return 	ExDate;
			case 231:
				return 	ContractMultiplier;
			case 232:
				return 	NoStipulations;
			case 233:
				return 	StipulationType;
			case 234:
				return 	StipulationValue;
			case 235:
				return 	YieldType;
			case 236:
				return 	Yield;
			case 237:
				return 	TotalTakedown;
			case 238:
				return 	Concession;
			case 239:
				return 	RepoCollateralSecurityType;
			case 240:
				return 	RedemptionDate;
			case 241:
				return 	UnderlyingCouponPaymentDate;
			case 242:
				return 	UnderlyingIssueDate;
			case 243:
				return 	UnderlyingRepoCollateralSecurityType;
			case 244:
				return 	UnderlyingRepurchaseTerm;
			case 245:
				return 	UnderlyingRepurchaseRate;
			case 246:
				return 	UnderlyingFactor;
			case 247:
				return 	UnderlyingRedemptionDate;
			case 248:
				return 	LegCouponPaymentDate;
			case 249:
				return 	LegIssueDate;
			case 250:
				return 	LegRepoCollateralSecurityType;
			case 251:
				return 	LegRepurchaseTerm;
			case 252:
				return 	LegRepurchaseRate;
			case 253:
				return 	LegFactor;
			case 254:
				return 	LegRedemptionDate;
			case 255:
				return 	CreditRating;
			case 256:
				return 	UnderlyingCreditRating;
			case 257:
				return 	LegCreditRating;
			case 258:
				return 	TradedFlatSwitch;
			case 259:
				return 	BasisFeatureDate;
			case 260:
				return 	BasisFeaturePrice;
			case 261:
				return 	Reserved;
			case 262:
				return 	MDReqID;
			case 263:
				return 	SubscriptionRequestType;
			case 264:
				return 	MarketDepth;
			case 265:
				return 	MDUpdateType;
			case 266:
				return 	AggregatedBook;
			case 267:
				return 	NoMDEntryTypes;
			case 268:
				return 	NoMDEntries;
			case 269:
				return 	MDEntryType;
			case 270:
				return 	MDEntryPx;
			case 271:
				return 	MDEntrySize;
			case 272:
				return 	MDEntryDate;
			case 273:
				return 	MDEntryTime;
			case 274:
				return 	TickDirection;
			case 275:
				return 	MDMkt;
			case 276:
				return 	QuoteCondition;
			case 277:
				return 	TradeCondition;
			case 278:
				return 	MDEntryID;
			case 279:
				return 	MDUpdateAction;
			case 280:
				return 	MDEntryRefID;
			case 281:
				return 	MDReqRejReason;
			case 282:
				return 	MDEntryOriginator;
			case 283:
				return 	LocationID;
			case 284:
				return 	DeskID;
			case 285:
				return 	DeleteReason;
			case 286:
				return 	OpenCloseSettlFlag;
			case 287:
				return 	SellerDays;
			case 288:
				return 	MDEntryBuyer;
			case 289:
				return 	MDEntrySeller;
			case 290:
				return 	MDEntryPositionNo;
			case 291:
				return 	FinancialStatus;
			case 292:
				return 	CorporateAction;
			case 293:
				return 	DefBidSize;
			case 294:
				return 	DefOfferSize;
			case 295:
				return 	NoQuoteEntries;
			case 296:
				return 	NoQuoteSets;
			case 297:
				return 	QuoteStatus;
			case 298:
				return 	QuoteCancelType;
			case 299:
				return 	QuoteEntryID;
			case 300:
				return 	QuoteRejectReason;
			case 301:
				return 	QuoteResponseLevel;
			case 302:
				return 	QuoteSetID;
			case 303:
				return 	QuoteRequestType;
			case 304:
				return 	TotNoQuoteEntries;
			case 305:
				return 	UnderlyingSecurityIDSource;
			case 306:
				return 	UnderlyingIssuer;
			case 307:
				return 	UnderlyingSecurityDesc;
			case 308:
				return 	UnderlyingSecurityExchange;
			case 309:
				return 	UnderlyingSecurityID;
			case 310:
				return 	UnderlyingSecurityType;
			case 311:
				return 	UnderlyingSymbol;
			case 312:
				return 	UnderlyingSymbolSfx;
			case 313:
				return 	UnderlyingMaturityMonthYear;
			case 314:
				return 	UnderlyingMaturityDay;
			case 315:
				return 	UnderlyingPutOrCall;
			case 316:
				return 	UnderlyingStrikePrice;
			case 317:
				return 	UnderlyingOptAttribute;
			case 318:
				return 	UnderlyingCurrency;
			case 319:
				return 	RatioQty;
			case 320:
				return 	SecurityReqID;
			case 321:
				return 	SecurityRequestType;
			case 322:
				return 	SecurityResponseID;
			case 323:
				return 	SecurityResponseType;
			case 324:
				return 	SecurityStatusReqID;
			case 325:
				return 	UnsolicitedIndicator;
			case 326:
				return 	SecurityTradingStatus;
			case 327:
				return 	HaltReason;
			case 328:
				return 	InViewOfCommon;
			case 329:
				return 	DueToRelated;
			case 330:
				return 	BuyVolume;
			case 331:
				return 	SellVolume;
			case 332:
				return 	HighPx;
			case 333:
				return 	LowPx;
			case 334:
				return 	Adjustment;
			case 335:
				return 	TradSesReqID;
			case 336:
				return 	TradingSessionID;
			case 337:
				return 	ContraTrader;
			case 338:
				return 	TradSesMethod;
			case 339:
				return 	TradSesMode;
			case 340:
				return 	TradSesStatus;
			case 341:
				return 	TradSesStartTime;
			case 342:
				return 	TradSesOpenTime;
			case 343:
				return 	TradSesPreCloseTime;
			case 344:
				return 	TradSesCloseTime;
			case 345:
				return 	TradSesEndTime;
			case 346:
				return 	NumberOfOrders;
			case 347:
				return 	MessageEncoding;
			case 348:
				return 	EncodedIssuerLen;
			case 349:
				return 	EncodedIssuer;
			case 350:
				return 	EncodedSecurityDescLen;
			case 351:
				return 	EncodedSecurityDesc;
			case 352:
				return 	EncodedListExecInstLen;
			case 353:
				return 	EncodedListExecInst;
			case 354:
				return 	EncodedTextLen;
			case 355:
				return 	EncodedText;
			case 356:
				return 	EncodedSubjectLen;
			case 357:
				return 	EncodedSubject;
			case 358:
				return 	EncodedHeadlineLen;
			case 359:
				return 	EncodedHeadline;
			case 360:
				return 	EncodedAllocTextLen;
			case 361:
				return 	EncodedAllocText;
			case 362:
				return 	EncodedUnderlyingIssuerLen;
			case 363:
				return 	EncodedUnderlyingIssuer;
			case 364:
				return 	EncodedUnderlyingSecurityDescLen;
			case 365:
				return 	EncodedUnderlyingSecurityDesc;
			case 366:
				return 	AllocPrice;
			case 367:
				return 	QuoteSetValidUntilTime;
			case 368:
				return 	QuoteEntryRejectReason;
			case 369:
				return 	LastMsgSeqNumProcessed;
			case 370:
				return 	OnBehalfOfSendingTime;
			case 371:
				return 	RefTagID;
			case 372:
				return 	RefMsgType;
			case 373:
				return 	SessionRejectReason;
			case 374:
				return 	BidRequestTransType;
			case 375:
				return 	ContraBroker;
			case 376:
				return 	ComplianceID;
			case 377:
				return 	SolicitedFlag;
			case 378:
				return 	ExecRestatementReason;
			case 379:
				return 	BusinessRejectRefID;
			case 380:
				return 	BusinessRejectReason;
			case 381:
				return 	GrossTradeAmt;
			case 382:
				return 	NoContraBrokers;
			case 383:
				return 	MaxMessageSize;
			case 384:
				return 	NoMsgTypes;
			case 385:
				return 	MsgDirection;
			case 386:
				return 	NoTradingSessions;
			case 387:
				return 	TotalVolumeTraded;
			case 388:
				return 	DiscretionInst;
			case 389:
				return 	DiscretionOffsetValue;
			case 390:
				return 	BidID;
			case 391:
				return 	ClientBidID;
			case 392:
				return 	ListName;
			case 393:
				return 	TotNoRelatedSym;
			case 394:
				return 	BidType;
			case 395:
				return 	NumTickets;
			case 396:
				return 	SideValue1;
			case 397:
				return 	SideValue2;
			case 398:
				return 	NoBidDescriptors;
			case 399:
				return 	BidDescriptorType;
			case 400:
				return 	BidDescriptor;
			case 401:
				return 	SideValueInd;
			case 402:
				return 	LiquidityPctLow;
			case 403:
				return 	LiquidityPctHigh;
			case 404:
				return 	LiquidityValue;
			case 405:
				return 	EFPTrackingError;
			case 406:
				return 	FairValue;
			case 407:
				return 	OutsideIndexPct;
			case 408:
				return 	ValueOfFutures;
			case 409:
				return 	LiquidityIndType;
			case 410:
				return 	WtAverageLiquidity;
			case 411:
				return 	ExchangeForPhysical;
			case 412:
				return 	OutMainCntryUIndex;
			case 413:
				return 	CrossPercent;
			case 414:
				return 	ProgRptReqs;
			case 415:
				return 	ProgPeriodInterval;
			case 416:
				return 	IncTaxInd;
			case 417:
				return 	NumBidders;
			case 418:
				return 	BidTradeType;
			case 419:
				return 	BasisPxType;
			case 420:
				return 	NoBidComponents;
			case 421:
				return 	Country;
			case 422:
				return 	TotNoStrikes;
			case 423:
				return 	PriceType;
			case 424:
				return 	DayOrderQty;
			case 425:
				return 	DayCumQty;
			case 426:
				return 	DayAvgPx;
			case 427:
				return 	GTBookingInst;
			case 428:
				return 	NoStrikes;
			case 429:
				return 	ListStatusType;
			case 430:
				return 	NetGrossInd;
			case 431:
				return 	ListOrderStatus;
			case 432:
				return 	ExpireDate;
			case 433:
				return 	ListExecInstType;
			case 434:
				return 	CxlRejResponseTo;
			case 435:
				return 	UnderlyingCouponRate;
			case 436:
				return 	UnderlyingContractMultiplier;
			case 437:
				return 	ContraTradeQty;
			case 438:
				return 	ContraTradeTime;
			case 439:
				return 	ClearingFirm;
			case 440:
				return 	ClearingAccount;
			case 441:
				return 	LiquidityNumSecurities;
			case 442:
				return 	MultiLegReportingType;
			case 443:
				return 	StrikeTime;
			case 444:
				return 	ListStatusText;
			case 445:
				return 	EncodedListStatusTextLen;
			case 446:
				return 	EncodedListStatusText;
			case 447:
				return 	PartyIDSource;
			case 448:
				return 	PartyID;
			case 449:
				return 	TotalVolumeTradedDate;
			case 450:
				return 	TotalVolumeTraded;
			case 451:
				return 	NetChgPrevDay;
			case 452:
				return 	PartyRole;
			case 453:
				return 	NoPartyIDs;
			case 454:
				return 	NoSecurityAltID;
			case 455:
				return 	SecurityAltID;
			case 456:
				return 	SecurityAltIDSource;
			case 457:
				return 	NoUnderlyingSecurityAltID;
			case 458:
				return 	UnderlyingSecurityAltID;
			case 459:
				return 	UnderlyingSecurityAltIDSource;
			case 460:
				return 	Product;
			case 461:
				return 	CFICode;
			case 462:
				return 	UnderlyingProduct;
			case 463:
				return 	UnderlyingCFICode;
			case 464:
				return 	TestMessageIndicator;
			case 465:
				return 	QuantityType;
			case 466:
				return 	BookingRefID;
			case 467:
				return 	IndividualAllocID;
			case 468:
				return 	RoundingDirection;
			case 469:
				return 	RoundingModulus;
			case 470:
				return 	CountryOfIssue;
			case 471:
				return 	StateOrProvinceOfIssue;
			case 472:
				return 	LocaleOfIssue;
			case 473:
				return 	NoRegistDtls;
			case 474:
				return 	MailingDtls;
			case 475:
				return 	InvestorCountryOfResidence;
			case 476:
				return 	PaymentRef;
			case 477:
				return 	DistribPaymentMethod;
			case 478:
				return 	CashDistribCurr;
			case 479:
				return 	CommCurrency;
			case 480:
				return 	CancellationRights;
			case 481:
				return 	MoneyLaunderingStatus;
			case 482:
				return 	MailingInst;
			case 483:
				return 	TransBkdTime;
			case 484:
				return 	ExecPriceType;
			case 485:
				return 	ExecPriceAdjustment;
			case 486:
				return 	DateOfBirth;
			case 487:
				return 	TradeReportTransType;
			case 488:
				return 	CardHolderName;
			case 489:
				return 	CardNumber;
			case 490:
				return 	CardExpDate;
			case 491:
				return 	CardIssNum;
			case 492:
				return 	PaymentMethod;
			case 493:
				return 	RegistAcctType;
			case 494:
				return 	Designation;
			case 495:
				return 	TaxAdvantageType;
			case 496:
				return 	RegistRejReasonText;
			case 497:
				return 	FundRenewWaiv;
			case 498:
				return 	CashDistribAgentName;
			case 499:
				return 	CashDistribAgentCode;
			case 500:
				return 	CashDistribAgentAcctNumber;
			case 501:
				return 	CashDistribPayRef;
			case 502:
				return 	CashDistribAgentAcctName;
			case 503:
				return 	CardStartDate;
			case 504:
				return 	PaymentDate;
			case 505:
				return 	PaymentRemitterID;
			case 506:
				return 	RegistStatus;
			case 507:
				return 	RegistRejReasonCode;
			case 508:
				return 	RegistRefID;
			case 509:
				return 	RegistDtls;
			case 510:
				return 	NoDistribInsts;
			case 511:
				return 	RegistEmail;
			case 512:
				return 	DistribPercentage;
			case 513:
				return 	RegistID;
			case 514:
				return 	RegistTransType;
			case 515:
				return 	ExecValuationPoint;
			case 516:
				return 	OrderPercent;
			case 517:
				return 	OwnershipType;
			case 518:
				return 	NoContAmts;
			case 519:
				return 	ContAmtType;
			case 520:
				return 	ContAmtValue;
			case 521:
				return 	ContAmtCurr;
			case 522:
				return 	OwnerType;
			case 523:
				return 	PartySubID;
			case 524:
				return 	NestedPartyID;
			case 525:
				return 	NestedPartyIDSource;
			case 526:
				return 	SecondaryClOrdID;
			case 527:
				return 	SecondaryExecID;
			case 528:
				return 	OrderCapacity;
			case 529:
				return 	OrderRestrictions;
			case 530:
				return 	MassCancelRequestType;
			case 531:
				return 	MassCancelResponse;
			case 532:
				return 	MassCancelRejectReason;
			case 533:
				return 	TotalAffectedOrders;
			case 534:
				return 	NoAffectedOrders;
			case 535:
				return 	AffectedOrderID;
			case 536:
				return 	AffectedSecondaryOrderID;
			case 537:
				return 	QuoteType;
			case 538:
				return 	NestedPartyRole;
			case 539:
				return 	NoNestedPartyIDs;
			case 540:
				return 	TotalAccruedInterestAmt;
			case 541:
				return 	MaturityDate;
			case 542:
				return 	UnderlyingMaturityDate;
			case 543:
				return 	InstrRegistry;
			case 544:
				return 	CashMargin;
			case 545:
				return 	NestedPartySubID;
			case 546:
				return 	Scope;
			case 547:
				return 	MDImplicitDelete;
			case 548:
				return 	CrossID;
			case 549:
				return 	CrossType;
			case 550:
				return 	CrossPrioritization;
			case 551:
				return 	OrigCrossID;
			case 552:
				return 	NoSides;
			case 553:
				return 	Username;
			case 554:
				return 	Password;
			case 555:
				return 	NoLegs;
			case 556:
				return 	LegCurrency;
			case 557:
				return 	TotNoSecurityTypes;
			case 558:
				return 	NoSecurityTypes;
			case 559:
				return 	SecurityListRequestType;
			case 560:
				return 	SecurityRequestResult;
			case 561:
				return 	RoundLot;
			case 562:
				return 	MinTradeVol;
			case 563:
				return 	MultiLegRptTypeReq;
			case 564:
				return 	LegPositionEffect;
			case 565:
				return 	LegCoveredOrUncovered;
			case 566:
				return 	LegPrice;
			case 567:
				return 	TradSesStatusRejReason;
			case 568:
				return 	TradeRequestID;
			case 569:
				return 	TradeRequestType;
			case 570:
				return 	PreviouslyReported;
			case 571:
				return 	TradeReportID;
			case 572:
				return 	TradeReportRefID;
			case 573:
				return 	MatchStatus;
			case 574:
				return 	MatchType;
			case 575:
				return 	OddLot;
			case 576:
				return 	NoClearingInstructions;
			case 577:
				return 	ClearingInstruction;
			case 578:
				return 	TradeInputSource;
			case 579:
				return 	TradeInputDevice;
			case 580:
				return 	NoDates;
			case 581:
				return 	AccountType;
			case 582:
				return 	CustOrderCapacity;
			case 583:
				return 	ClOrdLinkID;
			case 584:
				return 	MassStatusReqID;
			case 585:
				return 	MassStatusReqType;
			case 586:
				return 	OrigOrdModTime;
			case 587:
				return 	LegSettlType;
			case 588:
				return 	LegSettlDate;
			case 589:
				return 	DayBookingInst;
			case 590:
				return 	BookingUnit;
			case 591:
				return 	PreallocMethod;
			case 592:
				return 	UnderlyingCountryOfIssue;
			case 593:
				return 	UnderlyingStateOrProvinceOfIssue;
			case 594:
				return 	UnderlyingLocaleOfIssue;
			case 595:
				return 	UnderlyingInstrRegistry;
			case 596:
				return 	LegCountryOfIssue;
			case 597:
				return 	LegStateOrProvinceOfIssue;
			case 598:
				return 	LegLocaleOfIssue;
			case 599:
				return 	LegInstrRegistry;
			case 600:
				return 	LegSymbol;
			case 601:
				return 	LegSymbolSfx;
			case 602:
				return 	LegSecurityID;
			case 603:
				return 	LegSecurityIDSource;
			case 604:
				return 	NoLegSecurityAltID;
			case 605:
				return 	LegSecurityAltID;
			case 606:
				return 	LegSecurityAltIDSource;
			case 607:
				return 	LegProduct;
			case 608:
				return 	LegCFICode;
			case 609:
				return 	LegSecurityType;
			case 610:
				return 	LegMaturityMonthYear;
			case 611:
				return 	LegMaturityDate;
			case 612:
				return 	LegStrikePrice;
			case 613:
				return 	LegOptAttribute;
			case 614:
				return 	LegContractMultiplier;
			case 615:
				return 	LegCouponRate;
			case 616:
				return 	LegSecurityExchange;
			case 617:
				return 	LegIssuer;
			case 618:
				return 	EncodedLegIssuerLen;
			case 619:
				return 	EncodedLegIssuer;
			case 620:
				return 	LegSecurityDesc;
			case 621:
				return 	EncodedLegSecurityDescLen;
			case 622:
				return 	EncodedLegSecurityDesc;
			case 623:
				return 	LegRatioQty;
			case 624:
				return 	LegSide;
			case 625:
				return 	TradingSessionSubID;
			case 626:
				return 	AllocType;
			case 627:
				return 	NoHops;
			case 628:
				return 	HopCompID;
			case 629:
				return 	HopSendingTime;
			case 630:
				return 	HopRefID;
			case 631:
				return 	MidPx;
			case 632:
				return 	BidYield;
			case 633:
				return 	MidYield;
			case 634:
				return 	OfferYield;
			case 635:
				return 	ClearingFeeIndicator;
			case 636:
				return 	WorkingIndicator;
			case 637:
				return 	LegLastPx;
			case 638:
				return 	PriorityIndicator;
			case 639:
				return 	PriceImprovement;
			case 640:
				return 	Price2;
			case 641:
				return 	LastForwardPoints2;
			case 642:
				return 	BidForwardPoints2;
			case 643:
				return 	OfferForwardPoints2;
			case 644:
				return 	RFQReqID;
			case 645:
				return 	MktBidPx;
			case 646:
				return 	MktOfferPx;
			case 647:
				return 	MinBidSize;
			case 648:
				return 	MinOfferSize;
			case 649:
				return 	QuoteStatusReqID;
			case 650:
				return 	LegalConfirm;
			case 651:
				return 	UnderlyingLastPx;
			case 652:
				return 	UnderlyingLastQty;
			case 653:
				return 	SecDefStatus;
			case 654:
				return 	LegRefID;
			case 655:
				return 	ContraLegRefID;
			case 656:
				return 	SettlCurrBidFxRate;
			case 657:
				return 	SettlCurrOfferFxRate;
			case 658:
				return 	QuoteRequestRejectReason;
			case 659:
				return 	SideComplianceID;
			case 660:
				return 	AcctIDSource;
			case 661:
				return 	AllocAcctIDSource;
			case 662:
				return 	BenchmarkPrice;
			case 663:
				return 	BenchmarkPriceType;
			case 664:
				return 	ConfirmID;
			case 665:
				return 	ConfirmStatus;
			case 666:
				return 	ConfirmTransType;
			case 667:
				return 	ContractSettlMonth;
			case 668:
				return 	DeliveryForm;
			case 669:
				return 	LastParPx;
			case 670:
				return 	NoLegAllocs;
			case 671:
				return 	LegAllocAccount;
			case 672:
				return 	LegIndividualAllocID;
			case 673:
				return 	LegAllocQty;
			case 674:
				return 	LegAllocAcctIDSource;
			case 675:
				return 	LegSettlCurrency;
			case 676:
				return 	LegBenchmarkCurveCurrency;
			case 677:
				return 	LegBenchmarkCurveName;
			case 678:
				return 	LegBenchmarkCurvePoint;
			case 679:
				return 	LegBenchmarkPrice;
			case 680:
				return 	LegBenchmarkPriceType;
			case 681:
				return 	LegBidPx;
			case 682:
				return 	LegIOIQty;
			case 683:
				return 	NoLegStipulations;
			case 684:
				return 	LegOfferPx;
			case 685:
				return 	LegOrderQty;
			case 686:
				return 	LegPriceType;
			case 687:
				return 	LegQty;
			case 688:
				return 	LegStipulationType;
			case 689:
				return 	LegStipulationValue;
			case 690:
				return 	LegSwapType;
			case 691:
				return 	Pool;
			case 692:
				return 	QuotePriceType;
			case 693:
				return 	QuoteRespID;
			case 694:
				return 	QuoteRespType;
			case 695:
				return 	QuoteQualifier;
			case 696:
				return 	YieldRedemptionDate;
			case 697:
				return 	YieldRedemptionPrice;
			case 698:
				return 	YieldRedemptionPriceType;
			case 699:
				return 	BenchmarkSecurityID;
			case 700:
				return 	ReversalIndicator;
			case 701:
				return 	YieldCalcDate;
			case 702:
				return 	NoPositions;
			case 703:
				return 	PosType;
			case 704:
				return 	LongQty;
			case 705:
				return 	ShortQty;
			case 706:
				return 	PosQtyStatus;
			case 707:
				return 	PosAmtType;
			case 708:
				return 	PosAmt;
			case 709:
				return 	PosTransType;
			case 710:
				return 	PosReqID;
			case 711:
				return 	NoUnderlyings;
			case 712:
				return 	PosMaintAction;
			case 713:
				return 	OrigPosReqRefID;
			case 714:
				return 	PosMaintRptRefID;
			case 715:
				return 	ClearingBusinessDate;
			case 716:
				return 	SettlSessID;
			case 717:
				return 	SettlSessSubID;
			case 718:
				return 	AdjustmentType;
			case 719:
				return 	ContraryInstructionIndicator;
			case 720:
				return 	PriorSpreadIndicator;
			case 721:
				return 	PosMaintRptID;
			case 722:
				return 	PosMaintStatus;
			case 723:
				return 	PosMaintResult;
			case 724:
				return 	PosReqType;
			case 725:
				return 	ResponseTransportType;
			case 726:
				return 	ResponseDestination;
			case 727:
				return 	TotalNumPosReports;
			case 728:
				return 	PosReqResult;
			case 729:
				return 	PosReqStatus;
			case 730:
				return 	SettlPrice;
			case 731:
				return 	SettlPriceType;
			case 732:
				return 	UnderlyingSettlPrice;
			case 733:
				return 	UnderlyingSettlPriceType;
			case 734:
				return 	PriorSettlPrice;
			case 735:
				return 	NoQuoteQualifiers;
			case 736:
				return 	AllocSettlCurrency;
			case 737:
				return 	AllocSettlCurrAmt;
			case 738:
				return 	InterestAtMaturity;
			case 739:
				return 	LegDatedDate;
			case 740:
				return 	LegPool;
			case 741:
				return 	AllocInterestAtMaturity;
			case 742:
				return 	AllocAccruedInterestAmt;
			case 743:
				return 	DeliveryDate;
			case 744:
				return 	AssignmentMethod;
			case 745:
				return 	AssignmentUnit;
			case 746:
				return 	OpenInterest;
			case 747:
				return 	ExerciseMethod;
			case 748:
				return 	TotNumTradeReports;
			case 749:
				return 	TradeRequestResult;
			case 750:
				return 	TradeRequestStatus;
			case 751:
				return 	TradeReportRejectReason;
			case 752:
				return 	SideMultiLegReportingType;
			case 753:
				return 	NoPosAmt;
			case 754:
				return 	AutoAcceptIndicator;
			case 755:
				return 	AllocReportID;
			case 756:
				return 	NoNested2PartyIDs;
			case 757:
				return 	Nested2PartyID;
			case 758:
				return 	Nested2PartyIDSource;
			case 759:
				return 	Nested2PartyRole;
			case 760:
				return 	Nested2PartySubID;
			case 761:
				return 	BenchmarkSecurityIDSource;
			case 762:
				return 	SecuritySubType;
			case 763:
				return 	UnderlyingSecuritySubType;
			case 764:
				return 	LegSecuritySubType;
			case 765:
				return 	AllowableOneSidednessPct;
			case 766:
				return 	AllowableOneSidednessValue;
			case 767:
				return 	AllowableOneSidednessCurr;
			case 768:
				return 	NoTrdRegTimestamps;
			case 769:
				return 	TrdRegTimestamp;
			case 770:
				return 	TrdRegTimestampType;
			case 771:
				return 	TrdRegTimestampOrigin;
			case 772:
				return 	ConfirmRefID;
			case 773:
				return 	ConfirmType;
			case 774:
				return 	ConfirmRejReason;
			case 775:
				return 	BookingType;
			case 776:
				return 	IndividualAllocRejCode;
			case 777:
				return 	SettlInstMsgID;
			case 778:
				return 	NoSettlInst;
			case 779:
				return 	LastUpdateTime;
			case 780:
				return 	AllocSettlInstType;
			case 781:
				return 	NoSettlPartyIDs;
			case 782:
				return 	SettlPartyID;
			case 783:
				return 	SettlPartyIDSource;
			case 784:
				return 	SettlPartyRole;
			case 785:
				return 	SettlPartySubID;
			case 786:
				return 	SettlPartySubIDType;
			case 787:
				return 	DlvyInstType;
			case 788:
				return 	TerminationType;
			case 789:
				return 	NextExpectedMsgSeqNum;
			case 790:
				return 	OrdStatusReqID;
			case 791:
				return 	SettlInstReqID;
			case 792:
				return 	SettlInstReqRejCode;
			case 793:
				return 	SecondaryAllocID;
			case 794:
				return 	AllocReportType;
			case 795:
				return 	AllocReportRefID;
			case 796:
				return 	AllocCancReplaceReason;
			case 797:
				return 	CopyMsgIndicator;
			case 798:
				return 	AllocAccountType;
			case 799:
				return 	OrderAvgPx;
			case 800:
				return 	OrderBookingQty;
			case 801:
				return 	NoSettlPartySubIDs;
			case 802:
				return 	NoPartySubIDs;
			case 803:
				return 	PartySubIDType;
			case 804:
				return 	NoNestedPartySubIDs;
			case 805:
				return 	NestedPartySubIDType;
			case 806:
				return 	NoNested2PartySubIDs;
			case 807:
				return 	Nested2PartySubIDType;
			case 808:
				return 	AllocIntermedReqType;
			case 809:
				return 	NotDefined2;
			case 810:
				return 	UnderlyingPx;
			case 811:
				return 	PriceDelta;
			case 812:
				return 	ApplQueueMax;
			case 813:
				return 	ApplQueueDepth;
			case 814:
				return 	ApplQueueResolution;
			case 815:
				return 	ApplQueueAction;
			case 816:
				return 	NoAltMDSource;
			case 817:
				return 	AltMDSourceID;
			case 818:
				return 	SecondaryTradeReportID;
			case 819:
				return 	AvgPxIndicator;
			case 820:
				return 	TradeLinkID;
			case 821:
				return 	OrderInputDevice;
			case 822:
				return 	UnderlyingTradingSessionID;
			case 823:
				return 	UnderlyingTradingSessionSubID;
			case 824:
				return 	TradeLegRefID;
			case 825:
				return 	ExchangeRule;
			case 826:
				return 	TradeAllocIndicator;
			case 827:
				return 	ExpirationCycle;
			case 828:
				return 	TrdType;
			case 829:
				return 	TrdSubType;
			case 830:
				return 	TransferReason;
			case 831:
				return 	AsgnReqID;
			case 832:
				return 	TotNumAssignmentReports;
			case 833:
				return 	AsgnRptID;
			case 834:
				return 	ThresholdAmount;
			case 835:
				return 	PegMoveType;
			case 836:
				return 	PegOffsetType;
			case 837:
				return 	PegLimitType;
			case 838:
				return 	PegRoundDirection;
			case 839:
				return 	PeggedPrice;
			case 840:
				return 	PegScope;
			case 841:
				return 	DiscretionMoveType;
			case 842:
				return 	DiscretionOffsetType;
			case 843:
				return 	DiscretionLimitType;
			case 844:
				return 	DiscretionRoundDirection;
			case 845:
				return 	DiscretionPrice;
			case 846:
				return 	DiscretionScope;
			case 847:
				return 	TargetStrategy;
			case 848:
				return 	TargetStrategyParameters;
			case 849:
				return 	ParticipationRate;
			case 850:
				return 	TargetStrategyPerformance;
			case 851:
				return 	LastLiquidityInd;
			case 852:
				return 	PublishTrdIndicator;
			case 853:
				return 	ShortSaleReason;
			case 854:
				return 	QtyType;
			case 855:
				return 	SecondaryTrdType;
			case 856:
				return 	TradeReportType;
			case 857:
				return 	AllocNoOrdersType;
			case 858:
				return 	SharedCommission;
			case 859:
				return 	ConfirmReqID;
			case 860:
				return 	AvgParPx;
			case 861:
				return 	ReportedPx;
			case 862:
				return 	NoCapacities;
			case 863:
				return 	OrderCapacityQty;
			case 864:
				return 	NoEvents;
			case 865:
				return 	EventType;
			case 866:
				return 	EventDate;
			case 867:
				return 	EventPx;
			case 868:
				return 	EventText;
			case 869:
				return 	PctAtRisk;
			case 870:
				return 	NoInstrAttrib;
			case 871:
				return 	InstrAttribType;
			case 872:
				return 	InstrAttribValue;
			case 873:
				return 	DatedDate;
			case 874:
				return 	InterestAccrualDate;
			case 875:
				return 	CPProgram;
			case 876:
				return 	CPRegType;
			case 877:
				return 	UnderlyingCPProgram;
			case 878:
				return 	UnderlyingCPRegType;
			case 879:
				return 	UnderlyingQty;
			case 880:
				return 	TrdMatchID;
			case 881:
				return 	SecondaryTradeReportRefID;
			case 882:
				return 	UnderlyingDirtyPrice;
			case 883:
				return 	UnderlyingEndPrice;
			case 884:
				return 	UnderlyingStartValue;
			case 885:
				return 	UnderlyingCurrentValue;
			case 886:
				return 	UnderlyingEndValue;
			case 887:
				return 	NoUnderlyingStips;
			case 888:
				return 	UnderlyingStipType;
			case 889:
				return 	UnderlyingStipValue;
			case 890:
				return 	MaturityNetMoney;
			case 891:
				return 	MiscFeeBasis;
			case 892:
				return 	TotNoAllocs;
			case 893:
				return 	LastFragment;
			case 894:
				return 	CollReqID;
			case 895:
				return 	CollAsgnReason;
			case 896:
				return 	CollInquiryQualifier;
			case 897:
				return 	NoTrades;
			case 898:
				return 	MarginRatio;
			case 899:
				return 	MarginExcess;
			case 900:
				return 	TotalNetValue;
			case 901:
				return 	CashOutstanding;
			case 902:
				return 	CollAsgnID;
			case 903:
				return 	CollAsgnTransType;
			case 904:
				return 	CollRespID;
			case 905:
				return 	CollAsgnRespType;
			case 906:
				return 	CollAsgnRejectReason;
			case 907:
				return 	CollAsgnRefID;
			case 908:
				return 	CollRptID;
			case 909:
				return 	CollInquiryID;
			case 910:
				return 	CollStatus;
			case 911:
				return 	TotNumReports;
			case 912:
				return 	LastRptRequested;
			case 913:
				return 	AgreementDesc;
			case 914:
				return 	AgreementID;
			case 915:
				return 	AgreementDate;
			case 916:
				return 	StartDate;
			case 917:
				return 	EndDate;
			case 918:
				return 	AgreementCurrency;
			case 919:
				return 	DeliveryType;
			case 920:
				return 	EndAccruedInterestAmt;
			case 921:
				return 	StartCash;
			case 922:
				return 	EndCash;
			case 923:
				return 	UserRequestID;
			case 924:
				return 	UserRequestType;
			case 925:
				return 	NewPassword;
			case 926:
				return 	UserStatus;
			case 927:
				return 	UserStatusText;
			case 928:
				return 	StatusValue;
			case 929:
				return 	StatusText;
			case 930:
				return 	RefCompID;
			case 931:
				return 	RefSubID;
			case 932:
				return 	NetworkResponseID;
			case 933:
				return 	NetworkRequestID;
			case 934:
				return 	LastNetworkResponseID;
			case 935:
				return 	NetworkRequestType;
			case 936:
				return 	NoCompIDs;
			case 937:
				return 	NetworkStatusResponseType;
			case 938:
				return 	NoCollInquiryQualifier;
			case 939:
				return 	TrdRptStatus;
			case 940:
				return 	AffirmStatus;
			case 941:
				return 	UnderlyingStrikeCurrency;
			case 942:
				return 	LegStrikeCurrency;
			case 943:
				return 	TimeBracket;
			case 944:
				return 	CollAction;
			case 945:
				return 	CollInquiryStatus;
			case 946:
				return 	CollInquiryResult;
			case 947:
				return 	StrikeCurrency;
			case 948:
				return 	NoNested3PartyIDs;
			case 949:
				return 	Nested3PartyID;
			case 950:
				return 	Nested3PartyIDSource;
			case 951:
				return 	Nested3PartyRole;
			case 952:
				return 	NoNested3PartySubIDs;
			case 953:
				return 	Nested3PartySubID;
			case 954:
				return 	Nested3PartySubIDType;
			case 955:
				return 	LegContractSettlMonth;
			case 956:
				return 	LegInterestAccrualDate;
			case 957:
				return 	NoStrategyParameters;
			case 958:
				return 	StrategyParameterName;
			case 959:
				return 	StrategyParameterType;
			case 960:
				return 	StrategyParameterValue;
			case 961:
				return 	HostCrossID;
			case 962:
				return 	SideTimeInForce;
			case 963:
				return 	MDReportID;
			case 964:
				return 	SecurityReportID;
			case 965:
				return 	SecurityStatus;
			case 966:
				return 	SettleOnOpenFlag;
			case 967:
				return 	StrikeMultiplier;
			case 968:
				return 	StrikeValue;
			case 969:
				return 	MinPriceIncrement;
			case 970:
				return 	PositionLimit;
			case 971:
				return 	NTPositionLimit;
			case 972:
				return 	UnderlyingAllocationPercent;
			case 973:
				return 	UnderlyingCashAmount;
			case 974:
				return 	UnderlyingCashType;
			case 975:
				return 	UnderlyingSettlementType;
			case 976:
				return 	QuantityDate;
			case 977:
				return 	ContIntRptID;
			case 978:
				return 	LateIndicator;
			case 979:
				return 	InputSource;
			case 980:
				return 	SecurityUpdateAction;
			case 981:
				return 	NoExpiration;
			case 982:
				return 	ExpType;
			case 983:
				return 	ExpQty;
			case 984:
				return 	NoUnderlyingAmounts;
			case 985:
				return 	UnderlyingPayAmount;
			case 986:
				return 	UnderlyingCollectAmount;
			case 987:
				return 	UnderlyingSettlementDate;
			case 988:
				return 	UnderlyingSettlementStatus;
			case 989:
				return 	SecondaryIndividualAllocID;
			case 990:
				return 	LegReportID;
			case 991:
				return 	RndPx;
			case 992:
				return 	IndividualAllocType;
			case 993:
				return 	AllocCustomerCapacity;
			case 994:
				return 	TierCode;
			case 996:
				return 	UnitofMeasure;
			case 997:
				return 	TimeUnit;
			case 998:
				return 	UnderlyingUnitofMeasure;
			case 999:
				return 	LegUnitofMeasure;
			case 1000:
				return 	UnderlyingTimeUnit;
			case 1001:
				return 	LegTimeUnit;
			case 1002:
				return 	AllocMethod;
			case 1003:
				return 	TradeID;
			case 1005:
				return 	SideTradeReportID;
			case 1006:
				return 	SideFillStationCd;
			case 1007:
				return 	SideReasonCd;
			case 1008:
				return 	SideTrdSubTyp;
			case 1009:
				return 	SideQty;
			case 1011:
				return 	MessageEventSource;
			case 1012:
				return 	SideTrdRegTimestamp;
			case 1013:
				return 	SideTrdRegTimestampType;
			case 1014:
				return 	SideTrdRegTimestampSrc;
			case 1015:
				return 	AsOfIndicator;
			case 1016:
				return 	NoSideTrdRegTS;
			case 1017:
				return 	LegOptionRatio;
			case 1018:
				return 	NoInstrumentParties;
			case 1019:
				return 	InstrumentPartyID;
			case 1020:
				return 	TradeVolume;
			case 1021:
				return 	MDBookType;
			case 1022:
				return 	MDFeedType;
			case 1023:
				return 	MDPriceLevel;
			case 1024:
				return 	MDOriginType;
			case 1025:
				return 	FirstPx;
			case 1026:
				return 	MDEntrySpotRate;
			case 1027:
				return 	MDEntryForwardPoints;
			case 1028:
				return 	ManualOrderIndicator;
			case 1029:
				return 	CustDirectedOrder;
			case 1030:
				return 	ReceivedDeptID;
			case 1031:
				return 	CustOrderHandlingInst;
			case 1032:
				return 	OrderHandlingInstSource;
			case 1033:
				return 	DeskType;
			case 1034:
				return 	DeskTypeSource;
			case 1035:
				return 	DeskOrderHandlingInst;
			case 1036:
				return 	ExecAckStatus;
			case 1037:
				return 	UnderlyingDeliveryAmount;
			case 1038:
				return 	UnderlyingCapValue;
			case 1039:
				return 	UnderlyingSettlMethod;
			case 1040:
				return 	SecondaryTradeID;
			case 1041:
				return 	FirmTradeID;
			case 1042:
				return 	SecondaryFirmTradeID;
			case 1043:
				return 	CollApplType;
			case 1044:
				return 	UnderlyingAdjustedQuantity;
			case 1045:
				return 	UnderlyingFXRate;
			case 1046:
				return 	UnderlyingFXRateCalc;
			case 1047:
				return 	AllocPositionEffect;
			case 1048:
				return 	DealingCapacity;
			case 1049:
				return 	InstrmtAssignmentMethod;
			case 1050:
				return 	InstrumentPartyIDSource;
			case 1051:
				return 	InstrumentPartyRole;
			case 1052:
				return 	NoInstrumentPartySubIDs;
			case 1053:
				return 	InstrumentPartySubID;
			case 1054:
				return 	InstrumentPartySubIDType;
			case 1055:
				return 	PositionCurrency;
			case 1056:
				return 	CalculatedCcyLastQty;
			case 1057:
				return 	AggressorIndicator;
			case 1058:
				return 	NoUndlyInstrumentParties;
			case 1059:
				return 	UndlyInstrumentPartyID;
			case 1060:
				return 	UndlyInstrumentPartyIDSource;
			case 1061:
				return 	UndlyInstrumentPartyRole;
			case 1062:
				return 	NoUndlyInstrumentPartySubIDs;
			case 1063:
				return 	UndlyInstrumentPartySubID;
			case 1064:
				return 	UndlyInstrumentPartySubIDType;
			case 1065:
				return 	BidSwapPoints;
			case 1066:
				return 	OfferSwapPoints;
			case 1067:
				return 	LegBidForwardPoints;
			case 1068:
				return 	LegOfferForwardPoints;
			case 1069:
				return 	SwapPoints;
			case 1070:
				return 	MDQuoteType;
			case 1071:
				return 	LastSwapPoints;
			case 1072:
				return 	SideGrossTradeAmt;
			case 1073:
				return 	LegLastForwardPoints;
			case 1074:
				return 	LegCalculatedCcyLastQty;
			case 1075:
				return 	LegGrossTradeAmt;
			case 1079:
				return 	MaturityTime;
			case 1080:
				return 	RefOrderID;
			case 1081:
				return 	RefOrderIDSource;
			case 1082:
				return 	SecondaryDisplayQty;
			case 1083:
				return 	DisplayWhen;
			case 1084:
				return 	DisplayMethod;
			case 1085:
				return 	DisplayLowQty;
			case 1086:
				return 	DisplayHighQty;
			case 1087:
				return 	DisplayMinIncr;
			case 1088:
				return 	RefreshQty;
			case 1089:
				return 	MatchIncrement;
			case 1090:
				return 	MaxPriceLevels;
			case 1091:
				return 	PreTradeAnonymity;
			case 1092:
				return 	PriceProtectionScope;
			case 1093:
				return 	LotType;
			case 1094:
				return 	PegPriceType;
			case 1095:
				return 	PeggedRefPrice;
			case 1096:
				return 	PegSecurityIDSource;
			case 1097:
				return 	PegSecurityID;
			case 1098:
				return 	PegSymbol;
			case 1099:
				return 	PegSecurityDesc;
			case 1100:
				return 	TriggerType;
			case 1101:
				return 	TriggerAction;
			case 1102:
				return 	TriggerPrice;
			case 1103:
				return 	TriggerSymbol;
			case 1104:
				return 	TriggerSecurityID;
			case 1105:
				return 	TriggerSecurityIDSource;
			case 1106:
				return 	TriggerSecurityDesc;
			case 1107:
				return 	TriggerPriceType;
			case 1108:
				return 	TriggerPriceTypeScope;
			case 1109:
				return 	TriggerPriceDirection;
			case 1110:
				return 	TriggerNewPrice;
			case 1111:
				return 	TriggerOrderType;
			case 1112:
				return 	TriggerNewQty;
			case 1113:
				return 	TriggerTradingSessionID;
			case 1114:
				return 	TriggerTradingSessionSubID;
			case 1115:
				return 	OrderCategory;
			case 1116:
				return 	NoRootPartyIDs;
			case 1117:
				return 	RootPartyID;
			case 1118:
				return 	RootPartyIDSource;
			case 1119:
				return 	RootPartyRole;
			case 1120:
				return 	NoRootPartySubIDs;
			case 1121:
				return 	RootPartySubID;
			case 1122:
				return 	RootPartySubIDType;
			case 1123:
				return 	TradeHandlingInstr;
			case 1124:
				return 	OrigTradeHandlingInstr;
			case 1125:
				return 	OrigTradeDate;
			case 1126:
				return 	OrigTradeID;
			case 1127:
				return 	OrigSecondaryTradeID;
			case 1128:
				return 	ApplVerID;
			case 1129:
				return 	CstmApplVerID;
			case 1130:
				return 	RefApplVerID;
			case 1131:
				return 	RefCstmApplVerID;
			case 1132:
				return 	TZTransactTime;
			case 1133:
				return 	ExDestinationIDSource;
			case 1134:
				return 	ReportedPxDiff;
			case 1135:
				return 	RptSys;
			case 1136:
				return 	AllocClearingFeeIndicator;
			case 1137:
				return 	DefaultApplVerID;
			case 1138:
				return 	DisplayQty;
			case 1139:
				return 	ExchangeSpecialInstructions;
			default:
				return Unkown;
		}
	}

}
