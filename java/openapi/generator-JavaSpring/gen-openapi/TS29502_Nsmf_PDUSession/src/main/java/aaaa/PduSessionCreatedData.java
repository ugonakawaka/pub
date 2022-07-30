package aaaa;

import java.util.Objects;
import aaaa.Ambr;
import aaaa.EpsBearerInfo;
import aaaa.EpsPdnCnxInfo;
import aaaa.IpAddress;
import aaaa.Ipv6Prefix;
import aaaa.MaxIntegrityProtectedDataRate;
import aaaa.PduSessionType;
import aaaa.QosFlowSetupItem;
import aaaa.RedundantPduSessionInformation;
import aaaa.RefToBinaryData;
import aaaa.RoamingChargingProfile;
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
 * Data within Create Response
 */
@ApiModel(description = "Data within Create Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class PduSessionCreatedData   {
  @JsonProperty("pduSessionType")
  private PduSessionType pduSessionType;

  @JsonProperty("sscMode")
  private String sscMode;

  @JsonProperty("hcnTunnelInfo")
  private TunnelInfo hcnTunnelInfo;

  @JsonProperty("cnTunnelInfo")
  private TunnelInfo cnTunnelInfo;

  @JsonProperty("additionalCnTunnelInfo")
  private TunnelInfo additionalCnTunnelInfo;

  @JsonProperty("sessionAmbr")
  private Ambr sessionAmbr;

  @JsonProperty("qosFlowsSetupList")
  @Valid
  private List<QosFlowSetupItem> qosFlowsSetupList = null;

  @JsonProperty("hSmfInstanceId")
  private UUID hSmfInstanceId;

  @JsonProperty("smfInstanceId")
  private UUID smfInstanceId;

  @JsonProperty("pduSessionId")
  private Integer pduSessionId;

  @JsonProperty("sNssai")
  private Snssai sNssai;

  @JsonProperty("enablePauseCharging")
  private Boolean enablePauseCharging = false;

  @JsonProperty("ueIpv4Address")
  private String ueIpv4Address;

  @JsonProperty("ueIpv6Prefix")
  private Ipv6Prefix ueIpv6Prefix;

  @JsonProperty("n1SmInfoToUe")
  private RefToBinaryData n1SmInfoToUe;

  @JsonProperty("epsPdnCnxInfo")
  private EpsPdnCnxInfo epsPdnCnxInfo;

  @JsonProperty("epsBearerInfo")
  @Valid
  private List<EpsBearerInfo> epsBearerInfo = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("maxIntegrityProtectedDataRate")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRate;

  @JsonProperty("maxIntegrityProtectedDataRateDl")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl;

  @JsonProperty("alwaysOnGranted")
  private Boolean alwaysOnGranted = false;

  @JsonProperty("gpsi")
  private String gpsi;

  @JsonProperty("upSecurity")
  private UpSecurity upSecurity;

  @JsonProperty("roamingChargingProfile")
  private RoamingChargingProfile roamingChargingProfile;

  @JsonProperty("hSmfServiceInstanceId")
  private String hSmfServiceInstanceId;

  @JsonProperty("smfServiceInstanceId")
  private String smfServiceInstanceId;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  @JsonProperty("dnaiList")
  @Valid
  private List<String> dnaiList = null;

  @JsonProperty("ipv6MultiHomingInd")
  private Boolean ipv6MultiHomingInd = false;

  @JsonProperty("maAcceptedInd")
  private Boolean maAcceptedInd = false;

  @JsonProperty("homeProvidedChargingId")
  private String homeProvidedChargingId;

  @JsonProperty("nefExtBufSupportInd")
  private Boolean nefExtBufSupportInd = false;

  @JsonProperty("smallDataRateControlEnabled")
  private Boolean smallDataRateControlEnabled = false;

  @JsonProperty("ueIpv6InterfaceId")
  private String ueIpv6InterfaceId;

  @JsonProperty("ipv6Index")
  private Integer ipv6Index;

  @JsonProperty("dnAaaAddress")
  private IpAddress dnAaaAddress;

  @JsonProperty("redundantPduSessionInfo")
  private RedundantPduSessionInformation redundantPduSessionInfo;

  @JsonProperty("nspuSupportInd")
  private Boolean nspuSupportInd;

  public PduSessionCreatedData pduSessionType(PduSessionType pduSessionType) {
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

  public PduSessionCreatedData sscMode(String sscMode) {
    this.sscMode = sscMode;
    return this;
  }

  /**
   * Get sscMode
   * @return sscMode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^[0-7]$") 
  public String getSscMode() {
    return sscMode;
  }

  public void setSscMode(String sscMode) {
    this.sscMode = sscMode;
  }

  public PduSessionCreatedData hcnTunnelInfo(TunnelInfo hcnTunnelInfo) {
    this.hcnTunnelInfo = hcnTunnelInfo;
    return this;
  }

  /**
   * Get hcnTunnelInfo
   * @return hcnTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getHcnTunnelInfo() {
    return hcnTunnelInfo;
  }

  public void setHcnTunnelInfo(TunnelInfo hcnTunnelInfo) {
    this.hcnTunnelInfo = hcnTunnelInfo;
  }

  public PduSessionCreatedData cnTunnelInfo(TunnelInfo cnTunnelInfo) {
    this.cnTunnelInfo = cnTunnelInfo;
    return this;
  }

  /**
   * Get cnTunnelInfo
   * @return cnTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getCnTunnelInfo() {
    return cnTunnelInfo;
  }

  public void setCnTunnelInfo(TunnelInfo cnTunnelInfo) {
    this.cnTunnelInfo = cnTunnelInfo;
  }

  public PduSessionCreatedData additionalCnTunnelInfo(TunnelInfo additionalCnTunnelInfo) {
    this.additionalCnTunnelInfo = additionalCnTunnelInfo;
    return this;
  }

  /**
   * Get additionalCnTunnelInfo
   * @return additionalCnTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getAdditionalCnTunnelInfo() {
    return additionalCnTunnelInfo;
  }

  public void setAdditionalCnTunnelInfo(TunnelInfo additionalCnTunnelInfo) {
    this.additionalCnTunnelInfo = additionalCnTunnelInfo;
  }

  public PduSessionCreatedData sessionAmbr(Ambr sessionAmbr) {
    this.sessionAmbr = sessionAmbr;
    return this;
  }

  /**
   * Get sessionAmbr
   * @return sessionAmbr
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ambr getSessionAmbr() {
    return sessionAmbr;
  }

  public void setSessionAmbr(Ambr sessionAmbr) {
    this.sessionAmbr = sessionAmbr;
  }

  public PduSessionCreatedData qosFlowsSetupList(List<QosFlowSetupItem> qosFlowsSetupList) {
    this.qosFlowsSetupList = qosFlowsSetupList;
    return this;
  }

  public PduSessionCreatedData addQosFlowsSetupListItem(QosFlowSetupItem qosFlowsSetupListItem) {
    if (this.qosFlowsSetupList == null) {
      this.qosFlowsSetupList = new ArrayList<>();
    }
    this.qosFlowsSetupList.add(qosFlowsSetupListItem);
    return this;
  }

  /**
   * Get qosFlowsSetupList
   * @return qosFlowsSetupList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowSetupItem> getQosFlowsSetupList() {
    return qosFlowsSetupList;
  }

  public void setQosFlowsSetupList(List<QosFlowSetupItem> qosFlowsSetupList) {
    this.qosFlowsSetupList = qosFlowsSetupList;
  }

  public PduSessionCreatedData hSmfInstanceId(UUID hSmfInstanceId) {
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

  public PduSessionCreatedData smfInstanceId(UUID smfInstanceId) {
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

  public PduSessionCreatedData pduSessionId(Integer pduSessionId) {
    this.pduSessionId = pduSessionId;
    return this;
  }

  /**
   * Unsigned integer identifying a PDU session, within the range 0 to 255, as specified in clause 11.2.3.1b, bits 1 to 8, of 3GPP TS 24.007. If the PDU Session ID is allocated by the Core Network for UEs not supporting N1 mode, reserved range 64 to 95 is used. PDU Session ID within the reserved range is only visible in the Core Network.
   * minimum: 0
   * maximum: 255
   * @return pduSessionId
  */
  @ApiModelProperty(value = "Unsigned integer identifying a PDU session, within the range 0 to 255, as specified in clause 11.2.3.1b, bits 1 to 8, of 3GPP TS 24.007. If the PDU Session ID is allocated by the Core Network for UEs not supporting N1 mode, reserved range 64 to 95 is used. PDU Session ID within the reserved range is only visible in the Core Network.")

@Min(0) @Max(255) 
  public Integer getPduSessionId() {
    return pduSessionId;
  }

  public void setPduSessionId(Integer pduSessionId) {
    this.pduSessionId = pduSessionId;
  }

  public PduSessionCreatedData sNssai(Snssai sNssai) {
    this.sNssai = sNssai;
    return this;
  }

  /**
   * Get sNssai
   * @return sNssai
  */
  @ApiModelProperty(value = "")

  @Valid

  public Snssai getsNssai() {
    return sNssai;
  }

  public void setsNssai(Snssai sNssai) {
    this.sNssai = sNssai;
  }

  public PduSessionCreatedData enablePauseCharging(Boolean enablePauseCharging) {
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

  public PduSessionCreatedData ueIpv4Address(String ueIpv4Address) {
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

  public PduSessionCreatedData ueIpv6Prefix(Ipv6Prefix ueIpv6Prefix) {
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

  public PduSessionCreatedData n1SmInfoToUe(RefToBinaryData n1SmInfoToUe) {
    this.n1SmInfoToUe = n1SmInfoToUe;
    return this;
  }

  /**
   * Get n1SmInfoToUe
   * @return n1SmInfoToUe
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN1SmInfoToUe() {
    return n1SmInfoToUe;
  }

  public void setN1SmInfoToUe(RefToBinaryData n1SmInfoToUe) {
    this.n1SmInfoToUe = n1SmInfoToUe;
  }

  public PduSessionCreatedData epsPdnCnxInfo(EpsPdnCnxInfo epsPdnCnxInfo) {
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

  public PduSessionCreatedData epsBearerInfo(List<EpsBearerInfo> epsBearerInfo) {
    this.epsBearerInfo = epsBearerInfo;
    return this;
  }

  public PduSessionCreatedData addEpsBearerInfoItem(EpsBearerInfo epsBearerInfoItem) {
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

  public PduSessionCreatedData supportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported
   * @return supportedFeatures
  */
  @ApiModelProperty(value = "A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported")

@Pattern(regexp="^[A-Fa-f0-9]*$") 
  public String getSupportedFeatures() {
    return supportedFeatures;
  }

  public void setSupportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }

  public PduSessionCreatedData maxIntegrityProtectedDataRate(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRate) {
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

  public PduSessionCreatedData maxIntegrityProtectedDataRateDl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl) {
    this.maxIntegrityProtectedDataRateDl = maxIntegrityProtectedDataRateDl;
    return this;
  }

  /**
   * Get maxIntegrityProtectedDataRateDl
   * @return maxIntegrityProtectedDataRateDl
  */
  @ApiModelProperty(value = "")

  @Valid

  public MaxIntegrityProtectedDataRate getMaxIntegrityProtectedDataRateDl() {
    return maxIntegrityProtectedDataRateDl;
  }

  public void setMaxIntegrityProtectedDataRateDl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl) {
    this.maxIntegrityProtectedDataRateDl = maxIntegrityProtectedDataRateDl;
  }

  public PduSessionCreatedData alwaysOnGranted(Boolean alwaysOnGranted) {
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

  public PduSessionCreatedData gpsi(String gpsi) {
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

  public PduSessionCreatedData upSecurity(UpSecurity upSecurity) {
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

  public PduSessionCreatedData roamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
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

  public PduSessionCreatedData hSmfServiceInstanceId(String hSmfServiceInstanceId) {
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

  public PduSessionCreatedData smfServiceInstanceId(String smfServiceInstanceId) {
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

  public PduSessionCreatedData recoveryTime(OffsetDateTime recoveryTime) {
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

  public PduSessionCreatedData dnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public PduSessionCreatedData addDnaiListItem(String dnaiListItem) {
    if (this.dnaiList == null) {
      this.dnaiList = new ArrayList<>();
    }
    this.dnaiList.add(dnaiListItem);
    return this;
  }

  /**
   * Get dnaiList
   * @return dnaiList
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getDnaiList() {
    return dnaiList;
  }

  public void setDnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
  }

  public PduSessionCreatedData ipv6MultiHomingInd(Boolean ipv6MultiHomingInd) {
    this.ipv6MultiHomingInd = ipv6MultiHomingInd;
    return this;
  }

  /**
   * Get ipv6MultiHomingInd
   * @return ipv6MultiHomingInd
  */
  @ApiModelProperty(value = "")


  public Boolean getIpv6MultiHomingInd() {
    return ipv6MultiHomingInd;
  }

  public void setIpv6MultiHomingInd(Boolean ipv6MultiHomingInd) {
    this.ipv6MultiHomingInd = ipv6MultiHomingInd;
  }

  public PduSessionCreatedData maAcceptedInd(Boolean maAcceptedInd) {
    this.maAcceptedInd = maAcceptedInd;
    return this;
  }

  /**
   * Get maAcceptedInd
   * @return maAcceptedInd
  */
  @ApiModelProperty(value = "")


  public Boolean getMaAcceptedInd() {
    return maAcceptedInd;
  }

  public void setMaAcceptedInd(Boolean maAcceptedInd) {
    this.maAcceptedInd = maAcceptedInd;
  }

  public PduSessionCreatedData homeProvidedChargingId(String homeProvidedChargingId) {
    this.homeProvidedChargingId = homeProvidedChargingId;
    return this;
  }

  /**
   * Get homeProvidedChargingId
   * @return homeProvidedChargingId
  */
  @ApiModelProperty(value = "")


  public String getHomeProvidedChargingId() {
    return homeProvidedChargingId;
  }

  public void setHomeProvidedChargingId(String homeProvidedChargingId) {
    this.homeProvidedChargingId = homeProvidedChargingId;
  }

  public PduSessionCreatedData nefExtBufSupportInd(Boolean nefExtBufSupportInd) {
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

  public PduSessionCreatedData smallDataRateControlEnabled(Boolean smallDataRateControlEnabled) {
    this.smallDataRateControlEnabled = smallDataRateControlEnabled;
    return this;
  }

  /**
   * Get smallDataRateControlEnabled
   * @return smallDataRateControlEnabled
  */
  @ApiModelProperty(value = "")


  public Boolean getSmallDataRateControlEnabled() {
    return smallDataRateControlEnabled;
  }

  public void setSmallDataRateControlEnabled(Boolean smallDataRateControlEnabled) {
    this.smallDataRateControlEnabled = smallDataRateControlEnabled;
  }

  public PduSessionCreatedData ueIpv6InterfaceId(String ueIpv6InterfaceId) {
    this.ueIpv6InterfaceId = ueIpv6InterfaceId;
    return this;
  }

  /**
   * Get ueIpv6InterfaceId
   * @return ueIpv6InterfaceId
  */
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-Fa-f0-9]{16}$") 
  public String getUeIpv6InterfaceId() {
    return ueIpv6InterfaceId;
  }

  public void setUeIpv6InterfaceId(String ueIpv6InterfaceId) {
    this.ueIpv6InterfaceId = ueIpv6InterfaceId;
  }

  public PduSessionCreatedData ipv6Index(Integer ipv6Index) {
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

  public PduSessionCreatedData dnAaaAddress(IpAddress dnAaaAddress) {
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

  public PduSessionCreatedData redundantPduSessionInfo(RedundantPduSessionInformation redundantPduSessionInfo) {
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

  public PduSessionCreatedData nspuSupportInd(Boolean nspuSupportInd) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PduSessionCreatedData pduSessionCreatedData = (PduSessionCreatedData) o;
    return Objects.equals(this.pduSessionType, pduSessionCreatedData.pduSessionType) &&
        Objects.equals(this.sscMode, pduSessionCreatedData.sscMode) &&
        Objects.equals(this.hcnTunnelInfo, pduSessionCreatedData.hcnTunnelInfo) &&
        Objects.equals(this.cnTunnelInfo, pduSessionCreatedData.cnTunnelInfo) &&
        Objects.equals(this.additionalCnTunnelInfo, pduSessionCreatedData.additionalCnTunnelInfo) &&
        Objects.equals(this.sessionAmbr, pduSessionCreatedData.sessionAmbr) &&
        Objects.equals(this.qosFlowsSetupList, pduSessionCreatedData.qosFlowsSetupList) &&
        Objects.equals(this.hSmfInstanceId, pduSessionCreatedData.hSmfInstanceId) &&
        Objects.equals(this.smfInstanceId, pduSessionCreatedData.smfInstanceId) &&
        Objects.equals(this.pduSessionId, pduSessionCreatedData.pduSessionId) &&
        Objects.equals(this.sNssai, pduSessionCreatedData.sNssai) &&
        Objects.equals(this.enablePauseCharging, pduSessionCreatedData.enablePauseCharging) &&
        Objects.equals(this.ueIpv4Address, pduSessionCreatedData.ueIpv4Address) &&
        Objects.equals(this.ueIpv6Prefix, pduSessionCreatedData.ueIpv6Prefix) &&
        Objects.equals(this.n1SmInfoToUe, pduSessionCreatedData.n1SmInfoToUe) &&
        Objects.equals(this.epsPdnCnxInfo, pduSessionCreatedData.epsPdnCnxInfo) &&
        Objects.equals(this.epsBearerInfo, pduSessionCreatedData.epsBearerInfo) &&
        Objects.equals(this.supportedFeatures, pduSessionCreatedData.supportedFeatures) &&
        Objects.equals(this.maxIntegrityProtectedDataRate, pduSessionCreatedData.maxIntegrityProtectedDataRate) &&
        Objects.equals(this.maxIntegrityProtectedDataRateDl, pduSessionCreatedData.maxIntegrityProtectedDataRateDl) &&
        Objects.equals(this.alwaysOnGranted, pduSessionCreatedData.alwaysOnGranted) &&
        Objects.equals(this.gpsi, pduSessionCreatedData.gpsi) &&
        Objects.equals(this.upSecurity, pduSessionCreatedData.upSecurity) &&
        Objects.equals(this.roamingChargingProfile, pduSessionCreatedData.roamingChargingProfile) &&
        Objects.equals(this.hSmfServiceInstanceId, pduSessionCreatedData.hSmfServiceInstanceId) &&
        Objects.equals(this.smfServiceInstanceId, pduSessionCreatedData.smfServiceInstanceId) &&
        Objects.equals(this.recoveryTime, pduSessionCreatedData.recoveryTime) &&
        Objects.equals(this.dnaiList, pduSessionCreatedData.dnaiList) &&
        Objects.equals(this.ipv6MultiHomingInd, pduSessionCreatedData.ipv6MultiHomingInd) &&
        Objects.equals(this.maAcceptedInd, pduSessionCreatedData.maAcceptedInd) &&
        Objects.equals(this.homeProvidedChargingId, pduSessionCreatedData.homeProvidedChargingId) &&
        Objects.equals(this.nefExtBufSupportInd, pduSessionCreatedData.nefExtBufSupportInd) &&
        Objects.equals(this.smallDataRateControlEnabled, pduSessionCreatedData.smallDataRateControlEnabled) &&
        Objects.equals(this.ueIpv6InterfaceId, pduSessionCreatedData.ueIpv6InterfaceId) &&
        Objects.equals(this.ipv6Index, pduSessionCreatedData.ipv6Index) &&
        Objects.equals(this.dnAaaAddress, pduSessionCreatedData.dnAaaAddress) &&
        Objects.equals(this.redundantPduSessionInfo, pduSessionCreatedData.redundantPduSessionInfo) &&
        Objects.equals(this.nspuSupportInd, pduSessionCreatedData.nspuSupportInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pduSessionType, sscMode, hcnTunnelInfo, cnTunnelInfo, additionalCnTunnelInfo, sessionAmbr, qosFlowsSetupList, hSmfInstanceId, smfInstanceId, pduSessionId, sNssai, enablePauseCharging, ueIpv4Address, ueIpv6Prefix, n1SmInfoToUe, epsPdnCnxInfo, epsBearerInfo, supportedFeatures, maxIntegrityProtectedDataRate, maxIntegrityProtectedDataRateDl, alwaysOnGranted, gpsi, upSecurity, roamingChargingProfile, hSmfServiceInstanceId, smfServiceInstanceId, recoveryTime, dnaiList, ipv6MultiHomingInd, maAcceptedInd, homeProvidedChargingId, nefExtBufSupportInd, smallDataRateControlEnabled, ueIpv6InterfaceId, ipv6Index, dnAaaAddress, redundantPduSessionInfo, nspuSupportInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PduSessionCreatedData {\n");
    
    sb.append("    pduSessionType: ").append(toIndentedString(pduSessionType)).append("\n");
    sb.append("    sscMode: ").append(toIndentedString(sscMode)).append("\n");
    sb.append("    hcnTunnelInfo: ").append(toIndentedString(hcnTunnelInfo)).append("\n");
    sb.append("    cnTunnelInfo: ").append(toIndentedString(cnTunnelInfo)).append("\n");
    sb.append("    additionalCnTunnelInfo: ").append(toIndentedString(additionalCnTunnelInfo)).append("\n");
    sb.append("    sessionAmbr: ").append(toIndentedString(sessionAmbr)).append("\n");
    sb.append("    qosFlowsSetupList: ").append(toIndentedString(qosFlowsSetupList)).append("\n");
    sb.append("    hSmfInstanceId: ").append(toIndentedString(hSmfInstanceId)).append("\n");
    sb.append("    smfInstanceId: ").append(toIndentedString(smfInstanceId)).append("\n");
    sb.append("    pduSessionId: ").append(toIndentedString(pduSessionId)).append("\n");
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    enablePauseCharging: ").append(toIndentedString(enablePauseCharging)).append("\n");
    sb.append("    ueIpv4Address: ").append(toIndentedString(ueIpv4Address)).append("\n");
    sb.append("    ueIpv6Prefix: ").append(toIndentedString(ueIpv6Prefix)).append("\n");
    sb.append("    n1SmInfoToUe: ").append(toIndentedString(n1SmInfoToUe)).append("\n");
    sb.append("    epsPdnCnxInfo: ").append(toIndentedString(epsPdnCnxInfo)).append("\n");
    sb.append("    epsBearerInfo: ").append(toIndentedString(epsBearerInfo)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    maxIntegrityProtectedDataRate: ").append(toIndentedString(maxIntegrityProtectedDataRate)).append("\n");
    sb.append("    maxIntegrityProtectedDataRateDl: ").append(toIndentedString(maxIntegrityProtectedDataRateDl)).append("\n");
    sb.append("    alwaysOnGranted: ").append(toIndentedString(alwaysOnGranted)).append("\n");
    sb.append("    gpsi: ").append(toIndentedString(gpsi)).append("\n");
    sb.append("    upSecurity: ").append(toIndentedString(upSecurity)).append("\n");
    sb.append("    roamingChargingProfile: ").append(toIndentedString(roamingChargingProfile)).append("\n");
    sb.append("    hSmfServiceInstanceId: ").append(toIndentedString(hSmfServiceInstanceId)).append("\n");
    sb.append("    smfServiceInstanceId: ").append(toIndentedString(smfServiceInstanceId)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
    sb.append("    ipv6MultiHomingInd: ").append(toIndentedString(ipv6MultiHomingInd)).append("\n");
    sb.append("    maAcceptedInd: ").append(toIndentedString(maAcceptedInd)).append("\n");
    sb.append("    homeProvidedChargingId: ").append(toIndentedString(homeProvidedChargingId)).append("\n");
    sb.append("    nefExtBufSupportInd: ").append(toIndentedString(nefExtBufSupportInd)).append("\n");
    sb.append("    smallDataRateControlEnabled: ").append(toIndentedString(smallDataRateControlEnabled)).append("\n");
    sb.append("    ueIpv6InterfaceId: ").append(toIndentedString(ueIpv6InterfaceId)).append("\n");
    sb.append("    ipv6Index: ").append(toIndentedString(ipv6Index)).append("\n");
    sb.append("    dnAaaAddress: ").append(toIndentedString(dnAaaAddress)).append("\n");
    sb.append("    redundantPduSessionInfo: ").append(toIndentedString(redundantPduSessionInfo)).append("\n");
    sb.append("    nspuSupportInd: ").append(toIndentedString(nspuSupportInd)).append("\n");
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

