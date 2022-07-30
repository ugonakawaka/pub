package aaaa;

import java.util.Objects;
import aaaa.Ambr;
import aaaa.ChargingInformation;
import aaaa.DnnSelectionMode;
import aaaa.EpsBearerInfo;
import aaaa.EpsPdnCnxInfo;
import aaaa.IpAddress;
import aaaa.Ipv6Prefix;
import aaaa.MaxIntegrityProtectedDataRate;
import aaaa.PduSessionType;
import aaaa.QosFlowSetupItem;
import aaaa.QosFlowTunnel;
import aaaa.RedundantPduSessionInformation;
import aaaa.RoamingChargingProfile;
import aaaa.SatelliteBackhaulCategory;
import aaaa.SbiBindingLevel;
import aaaa.Snssai;
import aaaa.TunnelInfo;
import aaaa.UpSecurity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Complete SM Context
 */
@ApiModel(description = "Complete SM Context")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class SmContext   {
  @JsonProperty("pduSessionId")
  private Integer pduSessionId;

  @JsonProperty("dnn")
  private String dnn;

  @JsonProperty("selectedDnn")
  private String selectedDnn;

  @JsonProperty("sNssai")
  private Snssai sNssai;

  @JsonProperty("hplmnSnssai")
  private Snssai hplmnSnssai;

  @JsonProperty("pduSessionType")
  private PduSessionType pduSessionType;

  @JsonProperty("gpsi")
  private String gpsi;

  @JsonProperty("hSmfUri")
  private String hSmfUri;

  @JsonProperty("smfUri")
  private String smfUri;

  @JsonProperty("pduSessionRef")
  private String pduSessionRef;

  @JsonProperty("pcfId")
  private UUID pcfId;

  @JsonProperty("pcfGroupId")
  private String pcfGroupId;

  @JsonProperty("pcfSetId")
  private String pcfSetId;

  @JsonProperty("selMode")
  private DnnSelectionMode selMode;

  @JsonProperty("udmGroupId")
  private String udmGroupId;

  @JsonProperty("routingIndicator")
  private String routingIndicator;

  @JsonProperty("hNwPubKeyId")
  private Integer hNwPubKeyId;

  @JsonProperty("sessionAmbr")
  private Ambr sessionAmbr;

  @JsonProperty("qosFlowsList")
  @Valid
  private List<QosFlowSetupItem> qosFlowsList = new ArrayList<>();

  @JsonProperty("hSmfInstanceId")
  private UUID hSmfInstanceId;

  @JsonProperty("smfInstanceId")
  private UUID smfInstanceId;

  @JsonProperty("pduSessionSmfSetId")
  private String pduSessionSmfSetId;

  @JsonProperty("pduSessionSmfServiceSetId")
  private String pduSessionSmfServiceSetId;

  @JsonProperty("pduSessionSmfBinding")
  private SbiBindingLevel pduSessionSmfBinding;

  @JsonProperty("enablePauseCharging")
  private Boolean enablePauseCharging = false;

  @JsonProperty("ueIpv4Address")
  private String ueIpv4Address;

  @JsonProperty("ueIpv6Prefix")
  private Ipv6Prefix ueIpv6Prefix;

  @JsonProperty("epsPdnCnxInfo")
  private EpsPdnCnxInfo epsPdnCnxInfo;

  @JsonProperty("epsBearerInfo")
  @Valid
  private List<EpsBearerInfo> epsBearerInfo = null;

  @JsonProperty("maxIntegrityProtectedDataRate")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRate;

  @JsonProperty("alwaysOnGranted")
  private Boolean alwaysOnGranted = false;

  @JsonProperty("upSecurity")
  private UpSecurity upSecurity;

  @JsonProperty("hSmfServiceInstanceId")
  private String hSmfServiceInstanceId;

  @JsonProperty("smfServiceInstanceId")
  private String smfServiceInstanceId;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  @JsonProperty("forwardingInd")
  private Boolean forwardingInd = false;

  @JsonProperty("psaTunnelInfo")
  private TunnelInfo psaTunnelInfo;

  @JsonProperty("chargingId")
  private String chargingId;

  @JsonProperty("chargingInfo")
  private ChargingInformation chargingInfo;

  @JsonProperty("roamingChargingProfile")
  private RoamingChargingProfile roamingChargingProfile;

  @JsonProperty("nefExtBufSupportInd")
  private Boolean nefExtBufSupportInd = false;

  @JsonProperty("ipv6Index")
  private Integer ipv6Index;

  @JsonProperty("dnAaaAddress")
  private IpAddress dnAaaAddress;

  @JsonProperty("redundantPduSessionInfo")
  private RedundantPduSessionInformation redundantPduSessionInfo;

  @JsonProperty("ranTunnelInfo")
  private QosFlowTunnel ranTunnelInfo;

  @JsonProperty("addRanTunnelInfo")
  @Valid
  private List<QosFlowTunnel> addRanTunnelInfo = null;

  @JsonProperty("redRanTunnelInfo")
  private QosFlowTunnel redRanTunnelInfo;

  @JsonProperty("addRedRanTunnelInfo")
  @Valid
  private List<QosFlowTunnel> addRedRanTunnelInfo = null;

  @JsonProperty("nspuSupportInd")
  private Boolean nspuSupportInd;

  @JsonProperty("smfBindingInfo")
  private String smfBindingInfo;

  @JsonProperty("satelliteBackhaulCat")
  private SatelliteBackhaulCategory satelliteBackhaulCat;

  public SmContext pduSessionId(Integer pduSessionId) {
    this.pduSessionId = pduSessionId;
    return this;
  }

  /**
   * Unsigned integer identifying a PDU session, within the range 0 to 255, as specified in clause 11.2.3.1b, bits 1 to 8, of 3GPP TS 24.007. If the PDU Session ID is allocated by the Core Network for UEs not supporting N1 mode, reserved range 64 to 95 is used. PDU Session ID within the reserved range is only visible in the Core Network.
   * minimum: 0
   * maximum: 255
   * @return pduSessionId
  */
  @ApiModelProperty(required = true, value = "Unsigned integer identifying a PDU session, within the range 0 to 255, as specified in clause 11.2.3.1b, bits 1 to 8, of 3GPP TS 24.007. If the PDU Session ID is allocated by the Core Network for UEs not supporting N1 mode, reserved range 64 to 95 is used. PDU Session ID within the reserved range is only visible in the Core Network.")
  @NotNull

@Min(0) @Max(255) 
  public Integer getPduSessionId() {
    return pduSessionId;
  }

  public void setPduSessionId(Integer pduSessionId) {
    this.pduSessionId = pduSessionId;
  }

  public SmContext dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").
   * @return dnn
  */
  @ApiModelProperty(required = true, value = "String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").")
  @NotNull


  public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public SmContext selectedDnn(String selectedDnn) {
    this.selectedDnn = selectedDnn;
    return this;
  }

  /**
   * String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").
   * @return selectedDnn
  */
  @ApiModelProperty(value = "String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").")


  public String getSelectedDnn() {
    return selectedDnn;
  }

  public void setSelectedDnn(String selectedDnn) {
    this.selectedDnn = selectedDnn;
  }

  public SmContext sNssai(Snssai sNssai) {
    this.sNssai = sNssai;
    return this;
  }

  /**
   * Get sNssai
   * @return sNssai
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Snssai getsNssai() {
    return sNssai;
  }

  public void setsNssai(Snssai sNssai) {
    this.sNssai = sNssai;
  }

  public SmContext hplmnSnssai(Snssai hplmnSnssai) {
    this.hplmnSnssai = hplmnSnssai;
    return this;
  }

  /**
   * Get hplmnSnssai
   * @return hplmnSnssai
  */
  @ApiModelProperty(value = "")

  @Valid

  public Snssai getHplmnSnssai() {
    return hplmnSnssai;
  }

  public void setHplmnSnssai(Snssai hplmnSnssai) {
    this.hplmnSnssai = hplmnSnssai;
  }

  public SmContext pduSessionType(PduSessionType pduSessionType) {
    this.pduSessionType = pduSessionType;
    return this;
  }

  /**
   * Get pduSessionType
   * @return pduSessionType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PduSessionType getPduSessionType() {
    return pduSessionType;
  }

  public void setPduSessionType(PduSessionType pduSessionType) {
    this.pduSessionType = pduSessionType;
  }

  public SmContext gpsi(String gpsi) {
    this.gpsi = gpsi;
    return this;
  }

  /**
   * String identifying a Gpsi shall contain either an External Id or an MSISDN. It shall be formatted as follows -External Identifier= \"extid-<extid>, where <extid> shall be formatted according to clause 19.7.2 of 3GPP TS 23.003 that describes an External Identifier.
   * @return gpsi
  */
  @ApiModelProperty(value = "String identifying a Gpsi shall contain either an External Id or an MSISDN. It shall be formatted as follows -External Identifier= \"extid-<extid>, where <extid> shall be formatted according to clause 19.7.2 of 3GPP TS 23.003 that describes an External Identifier.")

@Pattern(regexp="^(msisdn-[0-9]{5,15}|extid-[^@]+@[^@]+|.+)$") 
  public String getGpsi() {
    return gpsi;
  }

  public void setGpsi(String gpsi) {
    this.gpsi = gpsi;
  }

  public SmContext hSmfUri(String hSmfUri) {
    this.hSmfUri = hSmfUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return hSmfUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String gethSmfUri() {
    return hSmfUri;
  }

  public void sethSmfUri(String hSmfUri) {
    this.hSmfUri = hSmfUri;
  }

  public SmContext smfUri(String smfUri) {
    this.smfUri = smfUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return smfUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getSmfUri() {
    return smfUri;
  }

  public void setSmfUri(String smfUri) {
    this.smfUri = smfUri;
  }

  public SmContext pduSessionRef(String pduSessionRef) {
    this.pduSessionRef = pduSessionRef;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return pduSessionRef
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getPduSessionRef() {
    return pduSessionRef;
  }

  public void setPduSessionRef(String pduSessionRef) {
    this.pduSessionRef = pduSessionRef;
  }

  public SmContext pcfId(UUID pcfId) {
    this.pcfId = pcfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return pcfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getPcfId() {
    return pcfId;
  }

  public void setPcfId(UUID pcfId) {
    this.pcfId = pcfId;
  }

  public SmContext pcfGroupId(String pcfGroupId) {
    this.pcfGroupId = pcfGroupId;
    return this;
  }

  /**
   * Identifier of a group of NFs.
   * @return pcfGroupId
  */
  @ApiModelProperty(value = "Identifier of a group of NFs.")


  public String getPcfGroupId() {
    return pcfGroupId;
  }

  public void setPcfGroupId(String pcfGroupId) {
    this.pcfGroupId = pcfGroupId;
  }

  public SmContext pcfSetId(String pcfSetId) {
    this.pcfSetId = pcfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return pcfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getPcfSetId() {
    return pcfSetId;
  }

  public void setPcfSetId(String pcfSetId) {
    this.pcfSetId = pcfSetId;
  }

  public SmContext selMode(DnnSelectionMode selMode) {
    this.selMode = selMode;
    return this;
  }

  /**
   * Get selMode
   * @return selMode
  */
  @ApiModelProperty(value = "")

  @Valid

  public DnnSelectionMode getSelMode() {
    return selMode;
  }

  public void setSelMode(DnnSelectionMode selMode) {
    this.selMode = selMode;
  }

  public SmContext udmGroupId(String udmGroupId) {
    this.udmGroupId = udmGroupId;
    return this;
  }

  /**
   * Identifier of a group of NFs.
   * @return udmGroupId
  */
  @ApiModelProperty(value = "Identifier of a group of NFs.")


  public String getUdmGroupId() {
    return udmGroupId;
  }

  public void setUdmGroupId(String udmGroupId) {
    this.udmGroupId = udmGroupId;
  }

  public SmContext routingIndicator(String routingIndicator) {
    this.routingIndicator = routingIndicator;
    return this;
  }

  /**
   * Get routingIndicator
   * @return routingIndicator
  */
  @ApiModelProperty(value = "")


  public String getRoutingIndicator() {
    return routingIndicator;
  }

  public void setRoutingIndicator(String routingIndicator) {
    this.routingIndicator = routingIndicator;
  }

  public SmContext hNwPubKeyId(Integer hNwPubKeyId) {
    this.hNwPubKeyId = hNwPubKeyId;
    return this;
  }

  /**
   * Get hNwPubKeyId
   * @return hNwPubKeyId
  */
  @ApiModelProperty(value = "")


  public Integer gethNwPubKeyId() {
    return hNwPubKeyId;
  }

  public void sethNwPubKeyId(Integer hNwPubKeyId) {
    this.hNwPubKeyId = hNwPubKeyId;
  }

  public SmContext sessionAmbr(Ambr sessionAmbr) {
    this.sessionAmbr = sessionAmbr;
    return this;
  }

  /**
   * Get sessionAmbr
   * @return sessionAmbr
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Ambr getSessionAmbr() {
    return sessionAmbr;
  }

  public void setSessionAmbr(Ambr sessionAmbr) {
    this.sessionAmbr = sessionAmbr;
  }

  public SmContext qosFlowsList(List<QosFlowSetupItem> qosFlowsList) {
    this.qosFlowsList = qosFlowsList;
    return this;
  }

  public SmContext addQosFlowsListItem(QosFlowSetupItem qosFlowsListItem) {
    this.qosFlowsList.add(qosFlowsListItem);
    return this;
  }

  /**
   * Get qosFlowsList
   * @return qosFlowsList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<QosFlowSetupItem> getQosFlowsList() {
    return qosFlowsList;
  }

  public void setQosFlowsList(List<QosFlowSetupItem> qosFlowsList) {
    this.qosFlowsList = qosFlowsList;
  }

  public SmContext hSmfInstanceId(UUID hSmfInstanceId) {
    this.hSmfInstanceId = hSmfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return hSmfInstanceId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID gethSmfInstanceId() {
    return hSmfInstanceId;
  }

  public void sethSmfInstanceId(UUID hSmfInstanceId) {
    this.hSmfInstanceId = hSmfInstanceId;
  }

  public SmContext smfInstanceId(UUID smfInstanceId) {
    this.smfInstanceId = smfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return smfInstanceId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getSmfInstanceId() {
    return smfInstanceId;
  }

  public void setSmfInstanceId(UUID smfInstanceId) {
    this.smfInstanceId = smfInstanceId;
  }

  public SmContext pduSessionSmfSetId(String pduSessionSmfSetId) {
    this.pduSessionSmfSetId = pduSessionSmfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return pduSessionSmfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getPduSessionSmfSetId() {
    return pduSessionSmfSetId;
  }

  public void setPduSessionSmfSetId(String pduSessionSmfSetId) {
    this.pduSessionSmfSetId = pduSessionSmfSetId;
  }

  public SmContext pduSessionSmfServiceSetId(String pduSessionSmfServiceSetId) {
    this.pduSessionSmfServiceSetId = pduSessionSmfServiceSetId;
    return this;
  }

  /**
   * NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return pduSessionSmfServiceSetId
  */
  @ApiModelProperty(value = "NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getPduSessionSmfServiceSetId() {
    return pduSessionSmfServiceSetId;
  }

  public void setPduSessionSmfServiceSetId(String pduSessionSmfServiceSetId) {
    this.pduSessionSmfServiceSetId = pduSessionSmfServiceSetId;
  }

  public SmContext pduSessionSmfBinding(SbiBindingLevel pduSessionSmfBinding) {
    this.pduSessionSmfBinding = pduSessionSmfBinding;
    return this;
  }

  /**
   * Get pduSessionSmfBinding
   * @return pduSessionSmfBinding
  */
  @ApiModelProperty(value = "")

  @Valid

  public SbiBindingLevel getPduSessionSmfBinding() {
    return pduSessionSmfBinding;
  }

  public void setPduSessionSmfBinding(SbiBindingLevel pduSessionSmfBinding) {
    this.pduSessionSmfBinding = pduSessionSmfBinding;
  }

  public SmContext enablePauseCharging(Boolean enablePauseCharging) {
    this.enablePauseCharging = enablePauseCharging;
    return this;
  }

  /**
   * Get enablePauseCharging
   * @return enablePauseCharging
  */
  @ApiModelProperty(value = "")


  public Boolean getEnablePauseCharging() {
    return enablePauseCharging;
  }

  public void setEnablePauseCharging(Boolean enablePauseCharging) {
    this.enablePauseCharging = enablePauseCharging;
  }

  public SmContext ueIpv4Address(String ueIpv4Address) {
    this.ueIpv4Address = ueIpv4Address;
    return this;
  }

  /**
   * String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.
   * @return ueIpv4Address
  */
  @ApiModelProperty(example = "198.51.100.1", value = "String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.")

@Pattern(regexp="^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$") 
  public String getUeIpv4Address() {
    return ueIpv4Address;
  }

  public void setUeIpv4Address(String ueIpv4Address) {
    this.ueIpv4Address = ueIpv4Address;
  }

  public SmContext ueIpv6Prefix(Ipv6Prefix ueIpv6Prefix) {
    this.ueIpv6Prefix = ueIpv6Prefix;
    return this;
  }

  /**
   * Get ueIpv6Prefix
   * @return ueIpv6Prefix
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Prefix getUeIpv6Prefix() {
    return ueIpv6Prefix;
  }

  public void setUeIpv6Prefix(Ipv6Prefix ueIpv6Prefix) {
    this.ueIpv6Prefix = ueIpv6Prefix;
  }

  public SmContext epsPdnCnxInfo(EpsPdnCnxInfo epsPdnCnxInfo) {
    this.epsPdnCnxInfo = epsPdnCnxInfo;
    return this;
  }

  /**
   * Get epsPdnCnxInfo
   * @return epsPdnCnxInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public EpsPdnCnxInfo getEpsPdnCnxInfo() {
    return epsPdnCnxInfo;
  }

  public void setEpsPdnCnxInfo(EpsPdnCnxInfo epsPdnCnxInfo) {
    this.epsPdnCnxInfo = epsPdnCnxInfo;
  }

  public SmContext epsBearerInfo(List<EpsBearerInfo> epsBearerInfo) {
    this.epsBearerInfo = epsBearerInfo;
    return this;
  }

  public SmContext addEpsBearerInfoItem(EpsBearerInfo epsBearerInfoItem) {
    if (this.epsBearerInfo == null) {
      this.epsBearerInfo = new ArrayList<>();
    }
    this.epsBearerInfo.add(epsBearerInfoItem);
    return this;
  }

  /**
   * Get epsBearerInfo
   * @return epsBearerInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<EpsBearerInfo> getEpsBearerInfo() {
    return epsBearerInfo;
  }

  public void setEpsBearerInfo(List<EpsBearerInfo> epsBearerInfo) {
    this.epsBearerInfo = epsBearerInfo;
  }

  public SmContext maxIntegrityProtectedDataRate(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRate) {
    this.maxIntegrityProtectedDataRate = maxIntegrityProtectedDataRate;
    return this;
  }

  /**
   * Get maxIntegrityProtectedDataRate
   * @return maxIntegrityProtectedDataRate
  */
  @ApiModelProperty(value = "")

  @Valid

  public MaxIntegrityProtectedDataRate getMaxIntegrityProtectedDataRate() {
    return maxIntegrityProtectedDataRate;
  }

  public void setMaxIntegrityProtectedDataRate(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRate) {
    this.maxIntegrityProtectedDataRate = maxIntegrityProtectedDataRate;
  }

  public SmContext alwaysOnGranted(Boolean alwaysOnGranted) {
    this.alwaysOnGranted = alwaysOnGranted;
    return this;
  }

  /**
   * Get alwaysOnGranted
   * @return alwaysOnGranted
  */
  @ApiModelProperty(value = "")


  public Boolean getAlwaysOnGranted() {
    return alwaysOnGranted;
  }

  public void setAlwaysOnGranted(Boolean alwaysOnGranted) {
    this.alwaysOnGranted = alwaysOnGranted;
  }

  public SmContext upSecurity(UpSecurity upSecurity) {
    this.upSecurity = upSecurity;
    return this;
  }

  /**
   * Get upSecurity
   * @return upSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpSecurity getUpSecurity() {
    return upSecurity;
  }

  public void setUpSecurity(UpSecurity upSecurity) {
    this.upSecurity = upSecurity;
  }

  public SmContext hSmfServiceInstanceId(String hSmfServiceInstanceId) {
    this.hSmfServiceInstanceId = hSmfServiceInstanceId;
    return this;
  }

  /**
   * Get hSmfServiceInstanceId
   * @return hSmfServiceInstanceId
  */
  @ApiModelProperty(value = "")


  public String gethSmfServiceInstanceId() {
    return hSmfServiceInstanceId;
  }

  public void sethSmfServiceInstanceId(String hSmfServiceInstanceId) {
    this.hSmfServiceInstanceId = hSmfServiceInstanceId;
  }

  public SmContext smfServiceInstanceId(String smfServiceInstanceId) {
    this.smfServiceInstanceId = smfServiceInstanceId;
    return this;
  }

  /**
   * Get smfServiceInstanceId
   * @return smfServiceInstanceId
  */
  @ApiModelProperty(value = "")


  public String getSmfServiceInstanceId() {
    return smfServiceInstanceId;
  }

  public void setSmfServiceInstanceId(String smfServiceInstanceId) {
    this.smfServiceInstanceId = smfServiceInstanceId;
  }

  public SmContext recoveryTime(OffsetDateTime recoveryTime) {
    this.recoveryTime = recoveryTime;
    return this;
  }

  /**
   * Get recoveryTime
   * @return recoveryTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRecoveryTime() {
    return recoveryTime;
  }

  public void setRecoveryTime(OffsetDateTime recoveryTime) {
    this.recoveryTime = recoveryTime;
  }

  public SmContext forwardingInd(Boolean forwardingInd) {
    this.forwardingInd = forwardingInd;
    return this;
  }

  /**
   * Get forwardingInd
   * @return forwardingInd
  */
  @ApiModelProperty(value = "")


  public Boolean getForwardingInd() {
    return forwardingInd;
  }

  public void setForwardingInd(Boolean forwardingInd) {
    this.forwardingInd = forwardingInd;
  }

  public SmContext psaTunnelInfo(TunnelInfo psaTunnelInfo) {
    this.psaTunnelInfo = psaTunnelInfo;
    return this;
  }

  /**
   * Get psaTunnelInfo
   * @return psaTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getPsaTunnelInfo() {
    return psaTunnelInfo;
  }

  public void setPsaTunnelInfo(TunnelInfo psaTunnelInfo) {
    this.psaTunnelInfo = psaTunnelInfo;
  }

  public SmContext chargingId(String chargingId) {
    this.chargingId = chargingId;
    return this;
  }

  /**
   * Get chargingId
   * @return chargingId
  */
  @ApiModelProperty(value = "")


  public String getChargingId() {
    return chargingId;
  }

  public void setChargingId(String chargingId) {
    this.chargingId = chargingId;
  }

  public SmContext chargingInfo(ChargingInformation chargingInfo) {
    this.chargingInfo = chargingInfo;
    return this;
  }

  /**
   * Get chargingInfo
   * @return chargingInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChargingInformation getChargingInfo() {
    return chargingInfo;
  }

  public void setChargingInfo(ChargingInformation chargingInfo) {
    this.chargingInfo = chargingInfo;
  }

  public SmContext roamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
    this.roamingChargingProfile = roamingChargingProfile;
    return this;
  }

  /**
   * Get roamingChargingProfile
   * @return roamingChargingProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public RoamingChargingProfile getRoamingChargingProfile() {
    return roamingChargingProfile;
  }

  public void setRoamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
    this.roamingChargingProfile = roamingChargingProfile;
  }

  public SmContext nefExtBufSupportInd(Boolean nefExtBufSupportInd) {
    this.nefExtBufSupportInd = nefExtBufSupportInd;
    return this;
  }

  /**
   * Get nefExtBufSupportInd
   * @return nefExtBufSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getNefExtBufSupportInd() {
    return nefExtBufSupportInd;
  }

  public void setNefExtBufSupportInd(Boolean nefExtBufSupportInd) {
    this.nefExtBufSupportInd = nefExtBufSupportInd;
  }

  public SmContext ipv6Index(Integer ipv6Index) {
    this.ipv6Index = ipv6Index;
    return this;
  }

  /**
   * Represents information that identifies which IP pool or external server is used to allocate the IP address.
   * @return ipv6Index
  */
  @ApiModelProperty(value = "Represents information that identifies which IP pool or external server is used to allocate the IP address.")


  public Integer getIpv6Index() {
    return ipv6Index;
  }

  public void setIpv6Index(Integer ipv6Index) {
    this.ipv6Index = ipv6Index;
  }

  public SmContext dnAaaAddress(IpAddress dnAaaAddress) {
    this.dnAaaAddress = dnAaaAddress;
    return this;
  }

  /**
   * Get dnAaaAddress
   * @return dnAaaAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public IpAddress getDnAaaAddress() {
    return dnAaaAddress;
  }

  public void setDnAaaAddress(IpAddress dnAaaAddress) {
    this.dnAaaAddress = dnAaaAddress;
  }

  public SmContext redundantPduSessionInfo(RedundantPduSessionInformation redundantPduSessionInfo) {
    this.redundantPduSessionInfo = redundantPduSessionInfo;
    return this;
  }

  /**
   * Get redundantPduSessionInfo
   * @return redundantPduSessionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RedundantPduSessionInformation getRedundantPduSessionInfo() {
    return redundantPduSessionInfo;
  }

  public void setRedundantPduSessionInfo(RedundantPduSessionInformation redundantPduSessionInfo) {
    this.redundantPduSessionInfo = redundantPduSessionInfo;
  }

  public SmContext ranTunnelInfo(QosFlowTunnel ranTunnelInfo) {
    this.ranTunnelInfo = ranTunnelInfo;
    return this;
  }

  /**
   * Get ranTunnelInfo
   * @return ranTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosFlowTunnel getRanTunnelInfo() {
    return ranTunnelInfo;
  }

  public void setRanTunnelInfo(QosFlowTunnel ranTunnelInfo) {
    this.ranTunnelInfo = ranTunnelInfo;
  }

  public SmContext addRanTunnelInfo(List<QosFlowTunnel> addRanTunnelInfo) {
    this.addRanTunnelInfo = addRanTunnelInfo;
    return this;
  }

  public SmContext addAddRanTunnelInfoItem(QosFlowTunnel addRanTunnelInfoItem) {
    if (this.addRanTunnelInfo == null) {
      this.addRanTunnelInfo = new ArrayList<>();
    }
    this.addRanTunnelInfo.add(addRanTunnelInfoItem);
    return this;
  }

  /**
   * Get addRanTunnelInfo
   * @return addRanTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowTunnel> getAddRanTunnelInfo() {
    return addRanTunnelInfo;
  }

  public void setAddRanTunnelInfo(List<QosFlowTunnel> addRanTunnelInfo) {
    this.addRanTunnelInfo = addRanTunnelInfo;
  }

  public SmContext redRanTunnelInfo(QosFlowTunnel redRanTunnelInfo) {
    this.redRanTunnelInfo = redRanTunnelInfo;
    return this;
  }

  /**
   * Get redRanTunnelInfo
   * @return redRanTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosFlowTunnel getRedRanTunnelInfo() {
    return redRanTunnelInfo;
  }

  public void setRedRanTunnelInfo(QosFlowTunnel redRanTunnelInfo) {
    this.redRanTunnelInfo = redRanTunnelInfo;
  }

  public SmContext addRedRanTunnelInfo(List<QosFlowTunnel> addRedRanTunnelInfo) {
    this.addRedRanTunnelInfo = addRedRanTunnelInfo;
    return this;
  }

  public SmContext addAddRedRanTunnelInfoItem(QosFlowTunnel addRedRanTunnelInfoItem) {
    if (this.addRedRanTunnelInfo == null) {
      this.addRedRanTunnelInfo = new ArrayList<>();
    }
    this.addRedRanTunnelInfo.add(addRedRanTunnelInfoItem);
    return this;
  }

  /**
   * Get addRedRanTunnelInfo
   * @return addRedRanTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowTunnel> getAddRedRanTunnelInfo() {
    return addRedRanTunnelInfo;
  }

  public void setAddRedRanTunnelInfo(List<QosFlowTunnel> addRedRanTunnelInfo) {
    this.addRedRanTunnelInfo = addRedRanTunnelInfo;
  }

  public SmContext nspuSupportInd(Boolean nspuSupportInd) {
    this.nspuSupportInd = nspuSupportInd;
    return this;
  }

  /**
   * Get nspuSupportInd
   * @return nspuSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getNspuSupportInd() {
    return nspuSupportInd;
  }

  public void setNspuSupportInd(Boolean nspuSupportInd) {
    this.nspuSupportInd = nspuSupportInd;
  }

  public SmContext smfBindingInfo(String smfBindingInfo) {
    this.smfBindingInfo = smfBindingInfo;
    return this;
  }

  /**
   * Get smfBindingInfo
   * @return smfBindingInfo
  */
  @ApiModelProperty(value = "")


  public String getSmfBindingInfo() {
    return smfBindingInfo;
  }

  public void setSmfBindingInfo(String smfBindingInfo) {
    this.smfBindingInfo = smfBindingInfo;
  }

  public SmContext satelliteBackhaulCat(SatelliteBackhaulCategory satelliteBackhaulCat) {
    this.satelliteBackhaulCat = satelliteBackhaulCat;
    return this;
  }

  /**
   * Get satelliteBackhaulCat
   * @return satelliteBackhaulCat
  */
  @ApiModelProperty(value = "")

  @Valid

  public SatelliteBackhaulCategory getSatelliteBackhaulCat() {
    return satelliteBackhaulCat;
  }

  public void setSatelliteBackhaulCat(SatelliteBackhaulCategory satelliteBackhaulCat) {
    this.satelliteBackhaulCat = satelliteBackhaulCat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContext smContext = (SmContext) o;
    return Objects.equals(this.pduSessionId, smContext.pduSessionId) &&
        Objects.equals(this.dnn, smContext.dnn) &&
        Objects.equals(this.selectedDnn, smContext.selectedDnn) &&
        Objects.equals(this.sNssai, smContext.sNssai) &&
        Objects.equals(this.hplmnSnssai, smContext.hplmnSnssai) &&
        Objects.equals(this.pduSessionType, smContext.pduSessionType) &&
        Objects.equals(this.gpsi, smContext.gpsi) &&
        Objects.equals(this.hSmfUri, smContext.hSmfUri) &&
        Objects.equals(this.smfUri, smContext.smfUri) &&
        Objects.equals(this.pduSessionRef, smContext.pduSessionRef) &&
        Objects.equals(this.pcfId, smContext.pcfId) &&
        Objects.equals(this.pcfGroupId, smContext.pcfGroupId) &&
        Objects.equals(this.pcfSetId, smContext.pcfSetId) &&
        Objects.equals(this.selMode, smContext.selMode) &&
        Objects.equals(this.udmGroupId, smContext.udmGroupId) &&
        Objects.equals(this.routingIndicator, smContext.routingIndicator) &&
        Objects.equals(this.hNwPubKeyId, smContext.hNwPubKeyId) &&
        Objects.equals(this.sessionAmbr, smContext.sessionAmbr) &&
        Objects.equals(this.qosFlowsList, smContext.qosFlowsList) &&
        Objects.equals(this.hSmfInstanceId, smContext.hSmfInstanceId) &&
        Objects.equals(this.smfInstanceId, smContext.smfInstanceId) &&
        Objects.equals(this.pduSessionSmfSetId, smContext.pduSessionSmfSetId) &&
        Objects.equals(this.pduSessionSmfServiceSetId, smContext.pduSessionSmfServiceSetId) &&
        Objects.equals(this.pduSessionSmfBinding, smContext.pduSessionSmfBinding) &&
        Objects.equals(this.enablePauseCharging, smContext.enablePauseCharging) &&
        Objects.equals(this.ueIpv4Address, smContext.ueIpv4Address) &&
        Objects.equals(this.ueIpv6Prefix, smContext.ueIpv6Prefix) &&
        Objects.equals(this.epsPdnCnxInfo, smContext.epsPdnCnxInfo) &&
        Objects.equals(this.epsBearerInfo, smContext.epsBearerInfo) &&
        Objects.equals(this.maxIntegrityProtectedDataRate, smContext.maxIntegrityProtectedDataRate) &&
        Objects.equals(this.alwaysOnGranted, smContext.alwaysOnGranted) &&
        Objects.equals(this.upSecurity, smContext.upSecurity) &&
        Objects.equals(this.hSmfServiceInstanceId, smContext.hSmfServiceInstanceId) &&
        Objects.equals(this.smfServiceInstanceId, smContext.smfServiceInstanceId) &&
        Objects.equals(this.recoveryTime, smContext.recoveryTime) &&
        Objects.equals(this.forwardingInd, smContext.forwardingInd) &&
        Objects.equals(this.psaTunnelInfo, smContext.psaTunnelInfo) &&
        Objects.equals(this.chargingId, smContext.chargingId) &&
        Objects.equals(this.chargingInfo, smContext.chargingInfo) &&
        Objects.equals(this.roamingChargingProfile, smContext.roamingChargingProfile) &&
        Objects.equals(this.nefExtBufSupportInd, smContext.nefExtBufSupportInd) &&
        Objects.equals(this.ipv6Index, smContext.ipv6Index) &&
        Objects.equals(this.dnAaaAddress, smContext.dnAaaAddress) &&
        Objects.equals(this.redundantPduSessionInfo, smContext.redundantPduSessionInfo) &&
        Objects.equals(this.ranTunnelInfo, smContext.ranTunnelInfo) &&
        Objects.equals(this.addRanTunnelInfo, smContext.addRanTunnelInfo) &&
        Objects.equals(this.redRanTunnelInfo, smContext.redRanTunnelInfo) &&
        Objects.equals(this.addRedRanTunnelInfo, smContext.addRedRanTunnelInfo) &&
        Objects.equals(this.nspuSupportInd, smContext.nspuSupportInd) &&
        Objects.equals(this.smfBindingInfo, smContext.smfBindingInfo) &&
        Objects.equals(this.satelliteBackhaulCat, smContext.satelliteBackhaulCat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pduSessionId, dnn, selectedDnn, sNssai, hplmnSnssai, pduSessionType, gpsi, hSmfUri, smfUri, pduSessionRef, pcfId, pcfGroupId, pcfSetId, selMode, udmGroupId, routingIndicator, hNwPubKeyId, sessionAmbr, qosFlowsList, hSmfInstanceId, smfInstanceId, pduSessionSmfSetId, pduSessionSmfServiceSetId, pduSessionSmfBinding, enablePauseCharging, ueIpv4Address, ueIpv6Prefix, epsPdnCnxInfo, epsBearerInfo, maxIntegrityProtectedDataRate, alwaysOnGranted, upSecurity, hSmfServiceInstanceId, smfServiceInstanceId, recoveryTime, forwardingInd, psaTunnelInfo, chargingId, chargingInfo, roamingChargingProfile, nefExtBufSupportInd, ipv6Index, dnAaaAddress, redundantPduSessionInfo, ranTunnelInfo, addRanTunnelInfo, redRanTunnelInfo, addRedRanTunnelInfo, nspuSupportInd, smfBindingInfo, satelliteBackhaulCat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContext {\n");
    
    sb.append("    pduSessionId: ").append(toIndentedString(pduSessionId)).append("\n");
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    selectedDnn: ").append(toIndentedString(selectedDnn)).append("\n");
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    hplmnSnssai: ").append(toIndentedString(hplmnSnssai)).append("\n");
    sb.append("    pduSessionType: ").append(toIndentedString(pduSessionType)).append("\n");
    sb.append("    gpsi: ").append(toIndentedString(gpsi)).append("\n");
    sb.append("    hSmfUri: ").append(toIndentedString(hSmfUri)).append("\n");
    sb.append("    smfUri: ").append(toIndentedString(smfUri)).append("\n");
    sb.append("    pduSessionRef: ").append(toIndentedString(pduSessionRef)).append("\n");
    sb.append("    pcfId: ").append(toIndentedString(pcfId)).append("\n");
    sb.append("    pcfGroupId: ").append(toIndentedString(pcfGroupId)).append("\n");
    sb.append("    pcfSetId: ").append(toIndentedString(pcfSetId)).append("\n");
    sb.append("    selMode: ").append(toIndentedString(selMode)).append("\n");
    sb.append("    udmGroupId: ").append(toIndentedString(udmGroupId)).append("\n");
    sb.append("    routingIndicator: ").append(toIndentedString(routingIndicator)).append("\n");
    sb.append("    hNwPubKeyId: ").append(toIndentedString(hNwPubKeyId)).append("\n");
    sb.append("    sessionAmbr: ").append(toIndentedString(sessionAmbr)).append("\n");
    sb.append("    qosFlowsList: ").append(toIndentedString(qosFlowsList)).append("\n");
    sb.append("    hSmfInstanceId: ").append(toIndentedString(hSmfInstanceId)).append("\n");
    sb.append("    smfInstanceId: ").append(toIndentedString(smfInstanceId)).append("\n");
    sb.append("    pduSessionSmfSetId: ").append(toIndentedString(pduSessionSmfSetId)).append("\n");
    sb.append("    pduSessionSmfServiceSetId: ").append(toIndentedString(pduSessionSmfServiceSetId)).append("\n");
    sb.append("    pduSessionSmfBinding: ").append(toIndentedString(pduSessionSmfBinding)).append("\n");
    sb.append("    enablePauseCharging: ").append(toIndentedString(enablePauseCharging)).append("\n");
    sb.append("    ueIpv4Address: ").append(toIndentedString(ueIpv4Address)).append("\n");
    sb.append("    ueIpv6Prefix: ").append(toIndentedString(ueIpv6Prefix)).append("\n");
    sb.append("    epsPdnCnxInfo: ").append(toIndentedString(epsPdnCnxInfo)).append("\n");
    sb.append("    epsBearerInfo: ").append(toIndentedString(epsBearerInfo)).append("\n");
    sb.append("    maxIntegrityProtectedDataRate: ").append(toIndentedString(maxIntegrityProtectedDataRate)).append("\n");
    sb.append("    alwaysOnGranted: ").append(toIndentedString(alwaysOnGranted)).append("\n");
    sb.append("    upSecurity: ").append(toIndentedString(upSecurity)).append("\n");
    sb.append("    hSmfServiceInstanceId: ").append(toIndentedString(hSmfServiceInstanceId)).append("\n");
    sb.append("    smfServiceInstanceId: ").append(toIndentedString(smfServiceInstanceId)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
    sb.append("    forwardingInd: ").append(toIndentedString(forwardingInd)).append("\n");
    sb.append("    psaTunnelInfo: ").append(toIndentedString(psaTunnelInfo)).append("\n");
    sb.append("    chargingId: ").append(toIndentedString(chargingId)).append("\n");
    sb.append("    chargingInfo: ").append(toIndentedString(chargingInfo)).append("\n");
    sb.append("    roamingChargingProfile: ").append(toIndentedString(roamingChargingProfile)).append("\n");
    sb.append("    nefExtBufSupportInd: ").append(toIndentedString(nefExtBufSupportInd)).append("\n");
    sb.append("    ipv6Index: ").append(toIndentedString(ipv6Index)).append("\n");
    sb.append("    dnAaaAddress: ").append(toIndentedString(dnAaaAddress)).append("\n");
    sb.append("    redundantPduSessionInfo: ").append(toIndentedString(redundantPduSessionInfo)).append("\n");
    sb.append("    ranTunnelInfo: ").append(toIndentedString(ranTunnelInfo)).append("\n");
    sb.append("    addRanTunnelInfo: ").append(toIndentedString(addRanTunnelInfo)).append("\n");
    sb.append("    redRanTunnelInfo: ").append(toIndentedString(redRanTunnelInfo)).append("\n");
    sb.append("    addRedRanTunnelInfo: ").append(toIndentedString(addRedRanTunnelInfo)).append("\n");
    sb.append("    nspuSupportInd: ").append(toIndentedString(nspuSupportInd)).append("\n");
    sb.append("    smfBindingInfo: ").append(toIndentedString(smfBindingInfo)).append("\n");
    sb.append("    satelliteBackhaulCat: ").append(toIndentedString(satelliteBackhaulCat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

