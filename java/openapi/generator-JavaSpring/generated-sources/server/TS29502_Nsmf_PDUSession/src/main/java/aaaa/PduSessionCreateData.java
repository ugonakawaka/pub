package aaaa;

import java.util.Objects;
import aaaa.AccessType;
import aaaa.ApnRateStatus;
import aaaa.DnnSelectionMode;
import aaaa.EpsInterworkingIndication;
import aaaa.Guami;
import aaaa.MaxIntegrityProtectedDataRate;
import aaaa.PcfUeCallbackInfo;
import aaaa.PlmnIdNid;
import aaaa.PresenceState;
import aaaa.RatType;
import aaaa.RedundantPduSessionInformation;
import aaaa.RefToBinaryData;
import aaaa.RequestType;
import aaaa.RoamingChargingProfile;
import aaaa.SatelliteBackhaulCategory;
import aaaa.SecondaryRatUsageInfo;
import aaaa.SmallDataRateStatus;
import aaaa.Snssai;
import aaaa.TunnelInfo;
import aaaa.UpSecurityInfo;
import aaaa.UserLocation;
import aaaa.VplmnQos;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Create Request
 */
@ApiModel(description = "Data within Create Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class PduSessionCreateData   {
  @JsonProperty("supi")
  private String supi;

  @JsonProperty("unauthenticatedSupi")
  private Boolean unauthenticatedSupi = false;

  @JsonProperty("pei")
  private String pei;

  @JsonProperty("pduSessionId")
  private Integer pduSessionId;

  @JsonProperty("dnn")
  private String dnn;

  @JsonProperty("selectedDnn")
  private String selectedDnn;

  @JsonProperty("sNssai")
  private Snssai sNssai;

  @JsonProperty("vsmfId")
  private UUID vsmfId;

  @JsonProperty("ismfId")
  private UUID ismfId;

  @JsonProperty("servingNetwork")
  private PlmnIdNid servingNetwork;

  @JsonProperty("requestType")
  private RequestType requestType;

  @JsonProperty("epsBearerId")
  @Valid
  private List<Integer> epsBearerId = null;

  @JsonProperty("pgwS8cFteid")
  private byte[] pgwS8cFteid;

  @JsonProperty("vsmfPduSessionUri")
  private String vsmfPduSessionUri;

  @JsonProperty("ismfPduSessionUri")
  private String ismfPduSessionUri;

  @JsonProperty("vcnTunnelInfo")
  private TunnelInfo vcnTunnelInfo;

  @JsonProperty("icnTunnelInfo")
  private TunnelInfo icnTunnelInfo;

  @JsonProperty("n9ForwardingTunnelInfo")
  private TunnelInfo n9ForwardingTunnelInfo;

  @JsonProperty("additionalCnTunnelInfo")
  private TunnelInfo additionalCnTunnelInfo;

  @JsonProperty("anType")
  private AccessType anType;

  @JsonProperty("additionalAnType")
  private AccessType additionalAnType;

  @JsonProperty("ratType")
  private RatType ratType;

  @JsonProperty("ueLocation")
  private UserLocation ueLocation;

  @JsonProperty("ueTimeZone")
  private String ueTimeZone;

  @JsonProperty("addUeLocation")
  private UserLocation addUeLocation;

  @JsonProperty("gpsi")
  private String gpsi;

  @JsonProperty("n1SmInfoFromUe")
  private RefToBinaryData n1SmInfoFromUe;

  @JsonProperty("unknownN1SmInfo")
  private RefToBinaryData unknownN1SmInfo;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("hPcfId")
  private UUID hPcfId;

  @JsonProperty("pcfId")
  private UUID pcfId;

  @JsonProperty("pcfGroupId")
  private String pcfGroupId;

  @JsonProperty("pcfSetId")
  private String pcfSetId;

  @JsonProperty("hoPreparationIndication")
  private Boolean hoPreparationIndication;

  @JsonProperty("selMode")
  private DnnSelectionMode selMode;

  @JsonProperty("alwaysOnRequested")
  private Boolean alwaysOnRequested = false;

  @JsonProperty("udmGroupId")
  private String udmGroupId;

  @JsonProperty("routingIndicator")
  private String routingIndicator;

  @JsonProperty("hNwPubKeyId")
  private Integer hNwPubKeyId;

  @JsonProperty("epsInterworkingInd")
  private EpsInterworkingIndication epsInterworkingInd;

  @JsonProperty("vSmfServiceInstanceId")
  private String vSmfServiceInstanceId;

  @JsonProperty("iSmfServiceInstanceId")
  private String iSmfServiceInstanceId;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  @JsonProperty("roamingChargingProfile")
  private RoamingChargingProfile roamingChargingProfile;

  @JsonProperty("chargingId")
  private String chargingId;

  @JsonProperty("oldPduSessionId")
  private Integer oldPduSessionId;

  @JsonProperty("epsBearerCtxStatus")
  private String epsBearerCtxStatus;

  @JsonProperty("amfNfId")
  private UUID amfNfId;

  @JsonProperty("guami")
  private Guami guami;

  @JsonProperty("maxIntegrityProtectedDataRateUl")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl;

  @JsonProperty("maxIntegrityProtectedDataRateDl")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl;

  @JsonProperty("cpCiotEnabled")
  private Boolean cpCiotEnabled = false;

  @JsonProperty("cpOnlyInd")
  private Boolean cpOnlyInd = false;

  @JsonProperty("invokeNef")
  private Boolean invokeNef = false;

  @JsonProperty("maRequestInd")
  private Boolean maRequestInd = false;

  @JsonProperty("maNwUpgradeInd")
  private Boolean maNwUpgradeInd = false;

  @JsonProperty("dnaiList")
  @Valid
  private List<String> dnaiList = null;

  @JsonProperty("presenceInLadn")
  private PresenceState presenceInLadn;

  @JsonProperty("secondaryRatUsageInfo")
  @Valid
  private List<SecondaryRatUsageInfo> secondaryRatUsageInfo = null;

  @JsonProperty("smallDataRateStatus")
  private SmallDataRateStatus smallDataRateStatus;

  @JsonProperty("apnRateStatus")
  private ApnRateStatus apnRateStatus;

  @JsonProperty("dlServingPlmnRateCtl")
  private Integer dlServingPlmnRateCtl;

  @JsonProperty("upSecurityInfo")
  private UpSecurityInfo upSecurityInfo;

  @JsonProperty("vplmnQos")
  private VplmnQos vplmnQos;

  @JsonProperty("oldSmContextRef")
  private String oldSmContextRef;

  @JsonProperty("redundantPduSessionInfo")
  private RedundantPduSessionInformation redundantPduSessionInfo;

  @JsonProperty("oldPduSessionRef")
  private String oldPduSessionRef;

  @JsonProperty("smPolicyNotifyInd")
  private Boolean smPolicyNotifyInd = false;

  @JsonProperty("pcfUeCallbackInfo")
  private JsonNullable<PcfUeCallbackInfo> pcfUeCallbackInfo = JsonNullable.undefined();

  @JsonProperty("satelliteBackhaulCat")
  private SatelliteBackhaulCategory satelliteBackhaulCat;

  @JsonProperty("upipSupported")
  private Boolean upipSupported = false;

  public PduSessionCreateData supi(String supi) {
    this.supi = supi;
    return this;
  }

  /**
   * String identifying a Supi that shall contain either an IMSI, a network specific identifier, a Global Cable Identifier (GCI) or a Global Line Identifier (GLI) as specified in clause 2.2A of 3GPP TS 23.003. It shall be formatted as follows  - for an IMSI \"imsi-<imsi>\", where <imsi> shall be formatted according to clause 2.2 of 3GPP TS 23.003 that describes an IMSI.  - for a network specific identifier \"nai-<nai>, where <nai> shall be formatted according to clause 28.7.2 of 3GPP TS 23.003 that describes an NAI.  - for a GCI \"gci-<gci>\", where <gci> shall be formatted according to clause 28.15.2 of 3GPP TS 23.003.  - for a GLI \"gli-<gli>\", where <gli> shall be formatted according to clause 28.16.2 of 3GPP TS 23.003.To enable that the value is used as part of an URI, the string shall only contain characters allowed according to the \"lower-with-hyphen\" naming convention defined in 3GPP TS 29.501. 
   * @return supi
  */
  @ApiModelProperty(value = "String identifying a Supi that shall contain either an IMSI, a network specific identifier, a Global Cable Identifier (GCI) or a Global Line Identifier (GLI) as specified in clause 2.2A of 3GPP TS 23.003. It shall be formatted as follows  - for an IMSI \"imsi-<imsi>\", where <imsi> shall be formatted according to clause 2.2 of 3GPP TS 23.003 that describes an IMSI.  - for a network specific identifier \"nai-<nai>, where <nai> shall be formatted according to clause 28.7.2 of 3GPP TS 23.003 that describes an NAI.  - for a GCI \"gci-<gci>\", where <gci> shall be formatted according to clause 28.15.2 of 3GPP TS 23.003.  - for a GLI \"gli-<gli>\", where <gli> shall be formatted according to clause 28.16.2 of 3GPP TS 23.003.To enable that the value is used as part of an URI, the string shall only contain characters allowed according to the \"lower-with-hyphen\" naming convention defined in 3GPP TS 29.501. ")

@Pattern(regexp="^(imsi-[0-9]{5,15}|nai-.+|gci-.+|gli-.+|.+)$") 
  public String getSupi() {
    return supi;
  }

  public void setSupi(String supi) {
    this.supi = supi;
  }

  public PduSessionCreateData unauthenticatedSupi(Boolean unauthenticatedSupi) {
    this.unauthenticatedSupi = unauthenticatedSupi;
    return this;
  }

  /**
   * Get unauthenticatedSupi
   * @return unauthenticatedSupi
  */
  @ApiModelProperty(value = "")


  public Boolean getUnauthenticatedSupi() {
    return unauthenticatedSupi;
  }

  public void setUnauthenticatedSupi(Boolean unauthenticatedSupi) {
    this.unauthenticatedSupi = unauthenticatedSupi;
  }

  public PduSessionCreateData pei(String pei) {
    this.pei = pei;
    return this;
  }

  /**
   * String representing a Permanent Equipment Identifier that may contain - an IMEI or IMEISV, as specified in clause 6.2 of 3GPP TS 23.003; a MAC address for a 5G-RG or FN-RG via wireline access, with an indication that this address cannot be trusted for regulatory purpose if this address cannot be used as an Equipment Identifier of the FN-RG, as specified in clause 4.7.7 of 3GPP TS23.316. Examples are imei-012345678901234 or imeisv-0123456789012345.
   * @return pei
  */
  @ApiModelProperty(value = "String representing a Permanent Equipment Identifier that may contain - an IMEI or IMEISV, as specified in clause 6.2 of 3GPP TS 23.003; a MAC address for a 5G-RG or FN-RG via wireline access, with an indication that this address cannot be trusted for regulatory purpose if this address cannot be used as an Equipment Identifier of the FN-RG, as specified in clause 4.7.7 of 3GPP TS23.316. Examples are imei-012345678901234 or imeisv-0123456789012345.")

@Pattern(regexp="^(imei-[0-9]{15}|imeisv-[0-9]{16}|mac((-[0-9a-fA-F]{2}){6})(-untrusted)?|eui((-[0-9a-fA-F]{2}){8})|.+)$") 
  public String getPei() {
    return pei;
  }

  public void setPei(String pei) {
    this.pei = pei;
  }

  public PduSessionCreateData pduSessionId(Integer pduSessionId) {
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

  public PduSessionCreateData dnn(String dnn) {
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

  public PduSessionCreateData selectedDnn(String selectedDnn) {
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

  public PduSessionCreateData sNssai(Snssai sNssai) {
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

  public PduSessionCreateData vsmfId(UUID vsmfId) {
    this.vsmfId = vsmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return vsmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getVsmfId() {
    return vsmfId;
  }

  public void setVsmfId(UUID vsmfId) {
    this.vsmfId = vsmfId;
  }

  public PduSessionCreateData ismfId(UUID ismfId) {
    this.ismfId = ismfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return ismfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getIsmfId() {
    return ismfId;
  }

  public void setIsmfId(UUID ismfId) {
    this.ismfId = ismfId;
  }

  public PduSessionCreateData servingNetwork(PlmnIdNid servingNetwork) {
    this.servingNetwork = servingNetwork;
    return this;
  }

  /**
   * Get servingNetwork
   * @return servingNetwork
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PlmnIdNid getServingNetwork() {
    return servingNetwork;
  }

  public void setServingNetwork(PlmnIdNid servingNetwork) {
    this.servingNetwork = servingNetwork;
  }

  public PduSessionCreateData requestType(RequestType requestType) {
    this.requestType = requestType;
    return this;
  }

  /**
   * Get requestType
   * @return requestType
  */
  @ApiModelProperty(value = "")

  @Valid

  public RequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(RequestType requestType) {
    this.requestType = requestType;
  }

  public PduSessionCreateData epsBearerId(List<Integer> epsBearerId) {
    this.epsBearerId = epsBearerId;
    return this;
  }

  public PduSessionCreateData addEpsBearerIdItem(Integer epsBearerIdItem) {
    if (this.epsBearerId == null) {
      this.epsBearerId = new ArrayList<>();
    }
    this.epsBearerId.add(epsBearerIdItem);
    return this;
  }

  /**
   * Get epsBearerId
   * @return epsBearerId
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<Integer> getEpsBearerId() {
    return epsBearerId;
  }

  public void setEpsBearerId(List<Integer> epsBearerId) {
    this.epsBearerId = epsBearerId;
  }

  public PduSessionCreateData pgwS8cFteid(byte[] pgwS8cFteid) {
    this.pgwS8cFteid = pgwS8cFteid;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return pgwS8cFteid
  */
  @ApiModelProperty(value = "string with format \"bytes\" as defined in OpenAPI")


  public byte[] getPgwS8cFteid() {
    return pgwS8cFteid;
  }

  public void setPgwS8cFteid(byte[] pgwS8cFteid) {
    this.pgwS8cFteid = pgwS8cFteid;
  }

  public PduSessionCreateData vsmfPduSessionUri(String vsmfPduSessionUri) {
    this.vsmfPduSessionUri = vsmfPduSessionUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return vsmfPduSessionUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getVsmfPduSessionUri() {
    return vsmfPduSessionUri;
  }

  public void setVsmfPduSessionUri(String vsmfPduSessionUri) {
    this.vsmfPduSessionUri = vsmfPduSessionUri;
  }

  public PduSessionCreateData ismfPduSessionUri(String ismfPduSessionUri) {
    this.ismfPduSessionUri = ismfPduSessionUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return ismfPduSessionUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getIsmfPduSessionUri() {
    return ismfPduSessionUri;
  }

  public void setIsmfPduSessionUri(String ismfPduSessionUri) {
    this.ismfPduSessionUri = ismfPduSessionUri;
  }

  public PduSessionCreateData vcnTunnelInfo(TunnelInfo vcnTunnelInfo) {
    this.vcnTunnelInfo = vcnTunnelInfo;
    return this;
  }

  /**
   * Get vcnTunnelInfo
   * @return vcnTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getVcnTunnelInfo() {
    return vcnTunnelInfo;
  }

  public void setVcnTunnelInfo(TunnelInfo vcnTunnelInfo) {
    this.vcnTunnelInfo = vcnTunnelInfo;
  }

  public PduSessionCreateData icnTunnelInfo(TunnelInfo icnTunnelInfo) {
    this.icnTunnelInfo = icnTunnelInfo;
    return this;
  }

  /**
   * Get icnTunnelInfo
   * @return icnTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getIcnTunnelInfo() {
    return icnTunnelInfo;
  }

  public void setIcnTunnelInfo(TunnelInfo icnTunnelInfo) {
    this.icnTunnelInfo = icnTunnelInfo;
  }

  public PduSessionCreateData n9ForwardingTunnelInfo(TunnelInfo n9ForwardingTunnelInfo) {
    this.n9ForwardingTunnelInfo = n9ForwardingTunnelInfo;
    return this;
  }

  /**
   * Get n9ForwardingTunnelInfo
   * @return n9ForwardingTunnelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getN9ForwardingTunnelInfo() {
    return n9ForwardingTunnelInfo;
  }

  public void setN9ForwardingTunnelInfo(TunnelInfo n9ForwardingTunnelInfo) {
    this.n9ForwardingTunnelInfo = n9ForwardingTunnelInfo;
  }

  public PduSessionCreateData additionalCnTunnelInfo(TunnelInfo additionalCnTunnelInfo) {
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

  public PduSessionCreateData anType(AccessType anType) {
    this.anType = anType;
    return this;
  }

  /**
   * Get anType
   * @return anType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccessType getAnType() {
    return anType;
  }

  public void setAnType(AccessType anType) {
    this.anType = anType;
  }

  public PduSessionCreateData additionalAnType(AccessType additionalAnType) {
    this.additionalAnType = additionalAnType;
    return this;
  }

  /**
   * Get additionalAnType
   * @return additionalAnType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessType getAdditionalAnType() {
    return additionalAnType;
  }

  public void setAdditionalAnType(AccessType additionalAnType) {
    this.additionalAnType = additionalAnType;
  }

  public PduSessionCreateData ratType(RatType ratType) {
    this.ratType = ratType;
    return this;
  }

  /**
   * Get ratType
   * @return ratType
  */
  @ApiModelProperty(value = "")

  @Valid

  public RatType getRatType() {
    return ratType;
  }

  public void setRatType(RatType ratType) {
    this.ratType = ratType;
  }

  public PduSessionCreateData ueLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
    return this;
  }

  /**
   * Get ueLocation
   * @return ueLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserLocation getUeLocation() {
    return ueLocation;
  }

  public void setUeLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
  }

  public PduSessionCreateData ueTimeZone(String ueTimeZone) {
    this.ueTimeZone = ueTimeZone;
    return this;
  }

  /**
   * String with format \"<time-numoffset>\" optionally appended by \"<daylightSavingTime>\", where -  <time-numoffset> shall represent the time zone adjusted for daylight saving time and be encoded as time-numoffset as defined in clause 5.6 of IETF RFC 3339; - <daylightSavingTime> shall represent the adjustment that has been made and shall be encoded as \"+1\" or \"+2\" for a +1 or +2 hours adjustment. The example is for 8 hours behind UTC, +1 hour adjustment for Daylight Saving Time.
   * @return ueTimeZone
  */
  @ApiModelProperty(example = "-08:00+1", value = "String with format \"<time-numoffset>\" optionally appended by \"<daylightSavingTime>\", where -  <time-numoffset> shall represent the time zone adjusted for daylight saving time and be encoded as time-numoffset as defined in clause 5.6 of IETF RFC 3339; - <daylightSavingTime> shall represent the adjustment that has been made and shall be encoded as \"+1\" or \"+2\" for a +1 or +2 hours adjustment. The example is for 8 hours behind UTC, +1 hour adjustment for Daylight Saving Time.")


  public String getUeTimeZone() {
    return ueTimeZone;
  }

  public void setUeTimeZone(String ueTimeZone) {
    this.ueTimeZone = ueTimeZone;
  }

  public PduSessionCreateData addUeLocation(UserLocation addUeLocation) {
    this.addUeLocation = addUeLocation;
    return this;
  }

  /**
   * Get addUeLocation
   * @return addUeLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserLocation getAddUeLocation() {
    return addUeLocation;
  }

  public void setAddUeLocation(UserLocation addUeLocation) {
    this.addUeLocation = addUeLocation;
  }

  public PduSessionCreateData gpsi(String gpsi) {
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

  public PduSessionCreateData n1SmInfoFromUe(RefToBinaryData n1SmInfoFromUe) {
    this.n1SmInfoFromUe = n1SmInfoFromUe;
    return this;
  }

  /**
   * Get n1SmInfoFromUe
   * @return n1SmInfoFromUe
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN1SmInfoFromUe() {
    return n1SmInfoFromUe;
  }

  public void setN1SmInfoFromUe(RefToBinaryData n1SmInfoFromUe) {
    this.n1SmInfoFromUe = n1SmInfoFromUe;
  }

  public PduSessionCreateData unknownN1SmInfo(RefToBinaryData unknownN1SmInfo) {
    this.unknownN1SmInfo = unknownN1SmInfo;
    return this;
  }

  /**
   * Get unknownN1SmInfo
   * @return unknownN1SmInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getUnknownN1SmInfo() {
    return unknownN1SmInfo;
  }

  public void setUnknownN1SmInfo(RefToBinaryData unknownN1SmInfo) {
    this.unknownN1SmInfo = unknownN1SmInfo;
  }

  public PduSessionCreateData supportedFeatures(String supportedFeatures) {
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

  public PduSessionCreateData hPcfId(UUID hPcfId) {
    this.hPcfId = hPcfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return hPcfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID gethPcfId() {
    return hPcfId;
  }

  public void sethPcfId(UUID hPcfId) {
    this.hPcfId = hPcfId;
  }

  public PduSessionCreateData pcfId(UUID pcfId) {
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

  public PduSessionCreateData pcfGroupId(String pcfGroupId) {
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

  public PduSessionCreateData pcfSetId(String pcfSetId) {
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

  public PduSessionCreateData hoPreparationIndication(Boolean hoPreparationIndication) {
    this.hoPreparationIndication = hoPreparationIndication;
    return this;
  }

  /**
   * Get hoPreparationIndication
   * @return hoPreparationIndication
  */
  @ApiModelProperty(value = "")


  public Boolean getHoPreparationIndication() {
    return hoPreparationIndication;
  }

  public void setHoPreparationIndication(Boolean hoPreparationIndication) {
    this.hoPreparationIndication = hoPreparationIndication;
  }

  public PduSessionCreateData selMode(DnnSelectionMode selMode) {
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

  public PduSessionCreateData alwaysOnRequested(Boolean alwaysOnRequested) {
    this.alwaysOnRequested = alwaysOnRequested;
    return this;
  }

  /**
   * Get alwaysOnRequested
   * @return alwaysOnRequested
  */
  @ApiModelProperty(value = "")


  public Boolean getAlwaysOnRequested() {
    return alwaysOnRequested;
  }

  public void setAlwaysOnRequested(Boolean alwaysOnRequested) {
    this.alwaysOnRequested = alwaysOnRequested;
  }

  public PduSessionCreateData udmGroupId(String udmGroupId) {
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

  public PduSessionCreateData routingIndicator(String routingIndicator) {
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

  public PduSessionCreateData hNwPubKeyId(Integer hNwPubKeyId) {
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

  public PduSessionCreateData epsInterworkingInd(EpsInterworkingIndication epsInterworkingInd) {
    this.epsInterworkingInd = epsInterworkingInd;
    return this;
  }

  /**
   * Get epsInterworkingInd
   * @return epsInterworkingInd
  */
  @ApiModelProperty(value = "")

  @Valid

  public EpsInterworkingIndication getEpsInterworkingInd() {
    return epsInterworkingInd;
  }

  public void setEpsInterworkingInd(EpsInterworkingIndication epsInterworkingInd) {
    this.epsInterworkingInd = epsInterworkingInd;
  }

  public PduSessionCreateData vSmfServiceInstanceId(String vSmfServiceInstanceId) {
    this.vSmfServiceInstanceId = vSmfServiceInstanceId;
    return this;
  }

  /**
   * Get vSmfServiceInstanceId
   * @return vSmfServiceInstanceId
  */
  @ApiModelProperty(value = "")


  public String getvSmfServiceInstanceId() {
    return vSmfServiceInstanceId;
  }

  public void setvSmfServiceInstanceId(String vSmfServiceInstanceId) {
    this.vSmfServiceInstanceId = vSmfServiceInstanceId;
  }

  public PduSessionCreateData iSmfServiceInstanceId(String iSmfServiceInstanceId) {
    this.iSmfServiceInstanceId = iSmfServiceInstanceId;
    return this;
  }

  /**
   * Get iSmfServiceInstanceId
   * @return iSmfServiceInstanceId
  */
  @ApiModelProperty(value = "")


  public String getiSmfServiceInstanceId() {
    return iSmfServiceInstanceId;
  }

  public void setiSmfServiceInstanceId(String iSmfServiceInstanceId) {
    this.iSmfServiceInstanceId = iSmfServiceInstanceId;
  }

  public PduSessionCreateData recoveryTime(OffsetDateTime recoveryTime) {
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

  public PduSessionCreateData roamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
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

  public PduSessionCreateData chargingId(String chargingId) {
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

  public PduSessionCreateData oldPduSessionId(Integer oldPduSessionId) {
    this.oldPduSessionId = oldPduSessionId;
    return this;
  }

  /**
   * Unsigned integer identifying a PDU session, within the range 0 to 255, as specified in clause 11.2.3.1b, bits 1 to 8, of 3GPP TS 24.007. If the PDU Session ID is allocated by the Core Network for UEs not supporting N1 mode, reserved range 64 to 95 is used. PDU Session ID within the reserved range is only visible in the Core Network.
   * minimum: 0
   * maximum: 255
   * @return oldPduSessionId
  */
  @ApiModelProperty(value = "Unsigned integer identifying a PDU session, within the range 0 to 255, as specified in clause 11.2.3.1b, bits 1 to 8, of 3GPP TS 24.007. If the PDU Session ID is allocated by the Core Network for UEs not supporting N1 mode, reserved range 64 to 95 is used. PDU Session ID within the reserved range is only visible in the Core Network.")

@Min(0) @Max(255) 
  public Integer getOldPduSessionId() {
    return oldPduSessionId;
  }

  public void setOldPduSessionId(Integer oldPduSessionId) {
    this.oldPduSessionId = oldPduSessionId;
  }

  public PduSessionCreateData epsBearerCtxStatus(String epsBearerCtxStatus) {
    this.epsBearerCtxStatus = epsBearerCtxStatus;
    return this;
  }

  /**
   * EPS bearer context status
   * @return epsBearerCtxStatus
  */
  @ApiModelProperty(value = "EPS bearer context status")

@Pattern(regexp="^[A-Fa-f0-9]{4}$") 
  public String getEpsBearerCtxStatus() {
    return epsBearerCtxStatus;
  }

  public void setEpsBearerCtxStatus(String epsBearerCtxStatus) {
    this.epsBearerCtxStatus = epsBearerCtxStatus;
  }

  public PduSessionCreateData amfNfId(UUID amfNfId) {
    this.amfNfId = amfNfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return amfNfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getAmfNfId() {
    return amfNfId;
  }

  public void setAmfNfId(UUID amfNfId) {
    this.amfNfId = amfNfId;
  }

  public PduSessionCreateData guami(Guami guami) {
    this.guami = guami;
    return this;
  }

  /**
   * Get guami
   * @return guami
  */
  @ApiModelProperty(value = "")

  @Valid

  public Guami getGuami() {
    return guami;
  }

  public void setGuami(Guami guami) {
    this.guami = guami;
  }

  public PduSessionCreateData maxIntegrityProtectedDataRateUl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl) {
    this.maxIntegrityProtectedDataRateUl = maxIntegrityProtectedDataRateUl;
    return this;
  }

  /**
   * Get maxIntegrityProtectedDataRateUl
   * @return maxIntegrityProtectedDataRateUl
  */
  @ApiModelProperty(value = "")

  @Valid

  public MaxIntegrityProtectedDataRate getMaxIntegrityProtectedDataRateUl() {
    return maxIntegrityProtectedDataRateUl;
  }

  public void setMaxIntegrityProtectedDataRateUl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl) {
    this.maxIntegrityProtectedDataRateUl = maxIntegrityProtectedDataRateUl;
  }

  public PduSessionCreateData maxIntegrityProtectedDataRateDl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl) {
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

  public PduSessionCreateData cpCiotEnabled(Boolean cpCiotEnabled) {
    this.cpCiotEnabled = cpCiotEnabled;
    return this;
  }

  /**
   * Get cpCiotEnabled
   * @return cpCiotEnabled
  */
  @ApiModelProperty(value = "")


  public Boolean getCpCiotEnabled() {
    return cpCiotEnabled;
  }

  public void setCpCiotEnabled(Boolean cpCiotEnabled) {
    this.cpCiotEnabled = cpCiotEnabled;
  }

  public PduSessionCreateData cpOnlyInd(Boolean cpOnlyInd) {
    this.cpOnlyInd = cpOnlyInd;
    return this;
  }

  /**
   * Get cpOnlyInd
   * @return cpOnlyInd
  */
  @ApiModelProperty(value = "")


  public Boolean getCpOnlyInd() {
    return cpOnlyInd;
  }

  public void setCpOnlyInd(Boolean cpOnlyInd) {
    this.cpOnlyInd = cpOnlyInd;
  }

  public PduSessionCreateData invokeNef(Boolean invokeNef) {
    this.invokeNef = invokeNef;
    return this;
  }

  /**
   * Get invokeNef
   * @return invokeNef
  */
  @ApiModelProperty(value = "")


  public Boolean getInvokeNef() {
    return invokeNef;
  }

  public void setInvokeNef(Boolean invokeNef) {
    this.invokeNef = invokeNef;
  }

  public PduSessionCreateData maRequestInd(Boolean maRequestInd) {
    this.maRequestInd = maRequestInd;
    return this;
  }

  /**
   * Get maRequestInd
   * @return maRequestInd
  */
  @ApiModelProperty(value = "")


  public Boolean getMaRequestInd() {
    return maRequestInd;
  }

  public void setMaRequestInd(Boolean maRequestInd) {
    this.maRequestInd = maRequestInd;
  }

  public PduSessionCreateData maNwUpgradeInd(Boolean maNwUpgradeInd) {
    this.maNwUpgradeInd = maNwUpgradeInd;
    return this;
  }

  /**
   * Get maNwUpgradeInd
   * @return maNwUpgradeInd
  */
  @ApiModelProperty(value = "")


  public Boolean getMaNwUpgradeInd() {
    return maNwUpgradeInd;
  }

  public void setMaNwUpgradeInd(Boolean maNwUpgradeInd) {
    this.maNwUpgradeInd = maNwUpgradeInd;
  }

  public PduSessionCreateData dnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public PduSessionCreateData addDnaiListItem(String dnaiListItem) {
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

  public PduSessionCreateData presenceInLadn(PresenceState presenceInLadn) {
    this.presenceInLadn = presenceInLadn;
    return this;
  }

  /**
   * Get presenceInLadn
   * @return presenceInLadn
  */
  @ApiModelProperty(value = "")

  @Valid

  public PresenceState getPresenceInLadn() {
    return presenceInLadn;
  }

  public void setPresenceInLadn(PresenceState presenceInLadn) {
    this.presenceInLadn = presenceInLadn;
  }

  public PduSessionCreateData secondaryRatUsageInfo(List<SecondaryRatUsageInfo> secondaryRatUsageInfo) {
    this.secondaryRatUsageInfo = secondaryRatUsageInfo;
    return this;
  }

  public PduSessionCreateData addSecondaryRatUsageInfoItem(SecondaryRatUsageInfo secondaryRatUsageInfoItem) {
    if (this.secondaryRatUsageInfo == null) {
      this.secondaryRatUsageInfo = new ArrayList<>();
    }
    this.secondaryRatUsageInfo.add(secondaryRatUsageInfoItem);
    return this;
  }

  /**
   * Get secondaryRatUsageInfo
   * @return secondaryRatUsageInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<SecondaryRatUsageInfo> getSecondaryRatUsageInfo() {
    return secondaryRatUsageInfo;
  }

  public void setSecondaryRatUsageInfo(List<SecondaryRatUsageInfo> secondaryRatUsageInfo) {
    this.secondaryRatUsageInfo = secondaryRatUsageInfo;
  }

  public PduSessionCreateData smallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
    this.smallDataRateStatus = smallDataRateStatus;
    return this;
  }

  /**
   * Get smallDataRateStatus
   * @return smallDataRateStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmallDataRateStatus getSmallDataRateStatus() {
    return smallDataRateStatus;
  }

  public void setSmallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
    this.smallDataRateStatus = smallDataRateStatus;
  }

  public PduSessionCreateData apnRateStatus(ApnRateStatus apnRateStatus) {
    this.apnRateStatus = apnRateStatus;
    return this;
  }

  /**
   * Get apnRateStatus
   * @return apnRateStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApnRateStatus getApnRateStatus() {
    return apnRateStatus;
  }

  public void setApnRateStatus(ApnRateStatus apnRateStatus) {
    this.apnRateStatus = apnRateStatus;
  }

  public PduSessionCreateData dlServingPlmnRateCtl(Integer dlServingPlmnRateCtl) {
    this.dlServingPlmnRateCtl = dlServingPlmnRateCtl;
    return this;
  }

  /**
   * Get dlServingPlmnRateCtl
   * minimum: 10
   * @return dlServingPlmnRateCtl
  */
  @ApiModelProperty(value = "")

@Min(10)
  public Integer getDlServingPlmnRateCtl() {
    return dlServingPlmnRateCtl;
  }

  public void setDlServingPlmnRateCtl(Integer dlServingPlmnRateCtl) {
    this.dlServingPlmnRateCtl = dlServingPlmnRateCtl;
  }

  public PduSessionCreateData upSecurityInfo(UpSecurityInfo upSecurityInfo) {
    this.upSecurityInfo = upSecurityInfo;
    return this;
  }

  /**
   * Get upSecurityInfo
   * @return upSecurityInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpSecurityInfo getUpSecurityInfo() {
    return upSecurityInfo;
  }

  public void setUpSecurityInfo(UpSecurityInfo upSecurityInfo) {
    this.upSecurityInfo = upSecurityInfo;
  }

  public PduSessionCreateData vplmnQos(VplmnQos vplmnQos) {
    this.vplmnQos = vplmnQos;
    return this;
  }

  /**
   * Get vplmnQos
   * @return vplmnQos
  */
  @ApiModelProperty(value = "")

  @Valid

  public VplmnQos getVplmnQos() {
    return vplmnQos;
  }

  public void setVplmnQos(VplmnQos vplmnQos) {
    this.vplmnQos = vplmnQos;
  }

  public PduSessionCreateData oldSmContextRef(String oldSmContextRef) {
    this.oldSmContextRef = oldSmContextRef;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return oldSmContextRef
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getOldSmContextRef() {
    return oldSmContextRef;
  }

  public void setOldSmContextRef(String oldSmContextRef) {
    this.oldSmContextRef = oldSmContextRef;
  }

  public PduSessionCreateData redundantPduSessionInfo(RedundantPduSessionInformation redundantPduSessionInfo) {
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

  public PduSessionCreateData oldPduSessionRef(String oldPduSessionRef) {
    this.oldPduSessionRef = oldPduSessionRef;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return oldPduSessionRef
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getOldPduSessionRef() {
    return oldPduSessionRef;
  }

  public void setOldPduSessionRef(String oldPduSessionRef) {
    this.oldPduSessionRef = oldPduSessionRef;
  }

  public PduSessionCreateData smPolicyNotifyInd(Boolean smPolicyNotifyInd) {
    this.smPolicyNotifyInd = smPolicyNotifyInd;
    return this;
  }

  /**
   * Get smPolicyNotifyInd
   * @return smPolicyNotifyInd
  */
  @ApiModelProperty(value = "")


  public Boolean getSmPolicyNotifyInd() {
    return smPolicyNotifyInd;
  }

  public void setSmPolicyNotifyInd(Boolean smPolicyNotifyInd) {
    this.smPolicyNotifyInd = smPolicyNotifyInd;
  }

  public PduSessionCreateData pcfUeCallbackInfo(PcfUeCallbackInfo pcfUeCallbackInfo) {
    this.pcfUeCallbackInfo = JsonNullable.of(pcfUeCallbackInfo);
    return this;
  }

  /**
   * Get pcfUeCallbackInfo
   * @return pcfUeCallbackInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PcfUeCallbackInfo> getPcfUeCallbackInfo() {
    return pcfUeCallbackInfo;
  }

  public void setPcfUeCallbackInfo(JsonNullable<PcfUeCallbackInfo> pcfUeCallbackInfo) {
    this.pcfUeCallbackInfo = pcfUeCallbackInfo;
  }

  public PduSessionCreateData satelliteBackhaulCat(SatelliteBackhaulCategory satelliteBackhaulCat) {
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

  public PduSessionCreateData upipSupported(Boolean upipSupported) {
    this.upipSupported = upipSupported;
    return this;
  }

  /**
   * Get upipSupported
   * @return upipSupported
  */
  @ApiModelProperty(value = "")


  public Boolean getUpipSupported() {
    return upipSupported;
  }

  public void setUpipSupported(Boolean upipSupported) {
    this.upipSupported = upipSupported;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PduSessionCreateData pduSessionCreateData = (PduSessionCreateData) o;
    return Objects.equals(this.supi, pduSessionCreateData.supi) &&
        Objects.equals(this.unauthenticatedSupi, pduSessionCreateData.unauthenticatedSupi) &&
        Objects.equals(this.pei, pduSessionCreateData.pei) &&
        Objects.equals(this.pduSessionId, pduSessionCreateData.pduSessionId) &&
        Objects.equals(this.dnn, pduSessionCreateData.dnn) &&
        Objects.equals(this.selectedDnn, pduSessionCreateData.selectedDnn) &&
        Objects.equals(this.sNssai, pduSessionCreateData.sNssai) &&
        Objects.equals(this.vsmfId, pduSessionCreateData.vsmfId) &&
        Objects.equals(this.ismfId, pduSessionCreateData.ismfId) &&
        Objects.equals(this.servingNetwork, pduSessionCreateData.servingNetwork) &&
        Objects.equals(this.requestType, pduSessionCreateData.requestType) &&
        Objects.equals(this.epsBearerId, pduSessionCreateData.epsBearerId) &&
        Arrays.equals(this.pgwS8cFteid, pduSessionCreateData.pgwS8cFteid) &&
        Objects.equals(this.vsmfPduSessionUri, pduSessionCreateData.vsmfPduSessionUri) &&
        Objects.equals(this.ismfPduSessionUri, pduSessionCreateData.ismfPduSessionUri) &&
        Objects.equals(this.vcnTunnelInfo, pduSessionCreateData.vcnTunnelInfo) &&
        Objects.equals(this.icnTunnelInfo, pduSessionCreateData.icnTunnelInfo) &&
        Objects.equals(this.n9ForwardingTunnelInfo, pduSessionCreateData.n9ForwardingTunnelInfo) &&
        Objects.equals(this.additionalCnTunnelInfo, pduSessionCreateData.additionalCnTunnelInfo) &&
        Objects.equals(this.anType, pduSessionCreateData.anType) &&
        Objects.equals(this.additionalAnType, pduSessionCreateData.additionalAnType) &&
        Objects.equals(this.ratType, pduSessionCreateData.ratType) &&
        Objects.equals(this.ueLocation, pduSessionCreateData.ueLocation) &&
        Objects.equals(this.ueTimeZone, pduSessionCreateData.ueTimeZone) &&
        Objects.equals(this.addUeLocation, pduSessionCreateData.addUeLocation) &&
        Objects.equals(this.gpsi, pduSessionCreateData.gpsi) &&
        Objects.equals(this.n1SmInfoFromUe, pduSessionCreateData.n1SmInfoFromUe) &&
        Objects.equals(this.unknownN1SmInfo, pduSessionCreateData.unknownN1SmInfo) &&
        Objects.equals(this.supportedFeatures, pduSessionCreateData.supportedFeatures) &&
        Objects.equals(this.hPcfId, pduSessionCreateData.hPcfId) &&
        Objects.equals(this.pcfId, pduSessionCreateData.pcfId) &&
        Objects.equals(this.pcfGroupId, pduSessionCreateData.pcfGroupId) &&
        Objects.equals(this.pcfSetId, pduSessionCreateData.pcfSetId) &&
        Objects.equals(this.hoPreparationIndication, pduSessionCreateData.hoPreparationIndication) &&
        Objects.equals(this.selMode, pduSessionCreateData.selMode) &&
        Objects.equals(this.alwaysOnRequested, pduSessionCreateData.alwaysOnRequested) &&
        Objects.equals(this.udmGroupId, pduSessionCreateData.udmGroupId) &&
        Objects.equals(this.routingIndicator, pduSessionCreateData.routingIndicator) &&
        Objects.equals(this.hNwPubKeyId, pduSessionCreateData.hNwPubKeyId) &&
        Objects.equals(this.epsInterworkingInd, pduSessionCreateData.epsInterworkingInd) &&
        Objects.equals(this.vSmfServiceInstanceId, pduSessionCreateData.vSmfServiceInstanceId) &&
        Objects.equals(this.iSmfServiceInstanceId, pduSessionCreateData.iSmfServiceInstanceId) &&
        Objects.equals(this.recoveryTime, pduSessionCreateData.recoveryTime) &&
        Objects.equals(this.roamingChargingProfile, pduSessionCreateData.roamingChargingProfile) &&
        Objects.equals(this.chargingId, pduSessionCreateData.chargingId) &&
        Objects.equals(this.oldPduSessionId, pduSessionCreateData.oldPduSessionId) &&
        Objects.equals(this.epsBearerCtxStatus, pduSessionCreateData.epsBearerCtxStatus) &&
        Objects.equals(this.amfNfId, pduSessionCreateData.amfNfId) &&
        Objects.equals(this.guami, pduSessionCreateData.guami) &&
        Objects.equals(this.maxIntegrityProtectedDataRateUl, pduSessionCreateData.maxIntegrityProtectedDataRateUl) &&
        Objects.equals(this.maxIntegrityProtectedDataRateDl, pduSessionCreateData.maxIntegrityProtectedDataRateDl) &&
        Objects.equals(this.cpCiotEnabled, pduSessionCreateData.cpCiotEnabled) &&
        Objects.equals(this.cpOnlyInd, pduSessionCreateData.cpOnlyInd) &&
        Objects.equals(this.invokeNef, pduSessionCreateData.invokeNef) &&
        Objects.equals(this.maRequestInd, pduSessionCreateData.maRequestInd) &&
        Objects.equals(this.maNwUpgradeInd, pduSessionCreateData.maNwUpgradeInd) &&
        Objects.equals(this.dnaiList, pduSessionCreateData.dnaiList) &&
        Objects.equals(this.presenceInLadn, pduSessionCreateData.presenceInLadn) &&
        Objects.equals(this.secondaryRatUsageInfo, pduSessionCreateData.secondaryRatUsageInfo) &&
        Objects.equals(this.smallDataRateStatus, pduSessionCreateData.smallDataRateStatus) &&
        Objects.equals(this.apnRateStatus, pduSessionCreateData.apnRateStatus) &&
        Objects.equals(this.dlServingPlmnRateCtl, pduSessionCreateData.dlServingPlmnRateCtl) &&
        Objects.equals(this.upSecurityInfo, pduSessionCreateData.upSecurityInfo) &&
        Objects.equals(this.vplmnQos, pduSessionCreateData.vplmnQos) &&
        Objects.equals(this.oldSmContextRef, pduSessionCreateData.oldSmContextRef) &&
        Objects.equals(this.redundantPduSessionInfo, pduSessionCreateData.redundantPduSessionInfo) &&
        Objects.equals(this.oldPduSessionRef, pduSessionCreateData.oldPduSessionRef) &&
        Objects.equals(this.smPolicyNotifyInd, pduSessionCreateData.smPolicyNotifyInd) &&
        Objects.equals(this.pcfUeCallbackInfo, pduSessionCreateData.pcfUeCallbackInfo) &&
        Objects.equals(this.satelliteBackhaulCat, pduSessionCreateData.satelliteBackhaulCat) &&
        Objects.equals(this.upipSupported, pduSessionCreateData.upipSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supi, unauthenticatedSupi, pei, pduSessionId, dnn, selectedDnn, sNssai, vsmfId, ismfId, servingNetwork, requestType, epsBearerId, Arrays.hashCode(pgwS8cFteid), vsmfPduSessionUri, ismfPduSessionUri, vcnTunnelInfo, icnTunnelInfo, n9ForwardingTunnelInfo, additionalCnTunnelInfo, anType, additionalAnType, ratType, ueLocation, ueTimeZone, addUeLocation, gpsi, n1SmInfoFromUe, unknownN1SmInfo, supportedFeatures, hPcfId, pcfId, pcfGroupId, pcfSetId, hoPreparationIndication, selMode, alwaysOnRequested, udmGroupId, routingIndicator, hNwPubKeyId, epsInterworkingInd, vSmfServiceInstanceId, iSmfServiceInstanceId, recoveryTime, roamingChargingProfile, chargingId, oldPduSessionId, epsBearerCtxStatus, amfNfId, guami, maxIntegrityProtectedDataRateUl, maxIntegrityProtectedDataRateDl, cpCiotEnabled, cpOnlyInd, invokeNef, maRequestInd, maNwUpgradeInd, dnaiList, presenceInLadn, secondaryRatUsageInfo, smallDataRateStatus, apnRateStatus, dlServingPlmnRateCtl, upSecurityInfo, vplmnQos, oldSmContextRef, redundantPduSessionInfo, oldPduSessionRef, smPolicyNotifyInd, pcfUeCallbackInfo, satelliteBackhaulCat, upipSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PduSessionCreateData {\n");
    
    sb.append("    supi: ").append(toIndentedString(supi)).append("\n");
    sb.append("    unauthenticatedSupi: ").append(toIndentedString(unauthenticatedSupi)).append("\n");
    sb.append("    pei: ").append(toIndentedString(pei)).append("\n");
    sb.append("    pduSessionId: ").append(toIndentedString(pduSessionId)).append("\n");
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    selectedDnn: ").append(toIndentedString(selectedDnn)).append("\n");
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    vsmfId: ").append(toIndentedString(vsmfId)).append("\n");
    sb.append("    ismfId: ").append(toIndentedString(ismfId)).append("\n");
    sb.append("    servingNetwork: ").append(toIndentedString(servingNetwork)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    epsBearerId: ").append(toIndentedString(epsBearerId)).append("\n");
    sb.append("    pgwS8cFteid: ").append(toIndentedString(pgwS8cFteid)).append("\n");
    sb.append("    vsmfPduSessionUri: ").append(toIndentedString(vsmfPduSessionUri)).append("\n");
    sb.append("    ismfPduSessionUri: ").append(toIndentedString(ismfPduSessionUri)).append("\n");
    sb.append("    vcnTunnelInfo: ").append(toIndentedString(vcnTunnelInfo)).append("\n");
    sb.append("    icnTunnelInfo: ").append(toIndentedString(icnTunnelInfo)).append("\n");
    sb.append("    n9ForwardingTunnelInfo: ").append(toIndentedString(n9ForwardingTunnelInfo)).append("\n");
    sb.append("    additionalCnTunnelInfo: ").append(toIndentedString(additionalCnTunnelInfo)).append("\n");
    sb.append("    anType: ").append(toIndentedString(anType)).append("\n");
    sb.append("    additionalAnType: ").append(toIndentedString(additionalAnType)).append("\n");
    sb.append("    ratType: ").append(toIndentedString(ratType)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
    sb.append("    ueTimeZone: ").append(toIndentedString(ueTimeZone)).append("\n");
    sb.append("    addUeLocation: ").append(toIndentedString(addUeLocation)).append("\n");
    sb.append("    gpsi: ").append(toIndentedString(gpsi)).append("\n");
    sb.append("    n1SmInfoFromUe: ").append(toIndentedString(n1SmInfoFromUe)).append("\n");
    sb.append("    unknownN1SmInfo: ").append(toIndentedString(unknownN1SmInfo)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    hPcfId: ").append(toIndentedString(hPcfId)).append("\n");
    sb.append("    pcfId: ").append(toIndentedString(pcfId)).append("\n");
    sb.append("    pcfGroupId: ").append(toIndentedString(pcfGroupId)).append("\n");
    sb.append("    pcfSetId: ").append(toIndentedString(pcfSetId)).append("\n");
    sb.append("    hoPreparationIndication: ").append(toIndentedString(hoPreparationIndication)).append("\n");
    sb.append("    selMode: ").append(toIndentedString(selMode)).append("\n");
    sb.append("    alwaysOnRequested: ").append(toIndentedString(alwaysOnRequested)).append("\n");
    sb.append("    udmGroupId: ").append(toIndentedString(udmGroupId)).append("\n");
    sb.append("    routingIndicator: ").append(toIndentedString(routingIndicator)).append("\n");
    sb.append("    hNwPubKeyId: ").append(toIndentedString(hNwPubKeyId)).append("\n");
    sb.append("    epsInterworkingInd: ").append(toIndentedString(epsInterworkingInd)).append("\n");
    sb.append("    vSmfServiceInstanceId: ").append(toIndentedString(vSmfServiceInstanceId)).append("\n");
    sb.append("    iSmfServiceInstanceId: ").append(toIndentedString(iSmfServiceInstanceId)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
    sb.append("    roamingChargingProfile: ").append(toIndentedString(roamingChargingProfile)).append("\n");
    sb.append("    chargingId: ").append(toIndentedString(chargingId)).append("\n");
    sb.append("    oldPduSessionId: ").append(toIndentedString(oldPduSessionId)).append("\n");
    sb.append("    epsBearerCtxStatus: ").append(toIndentedString(epsBearerCtxStatus)).append("\n");
    sb.append("    amfNfId: ").append(toIndentedString(amfNfId)).append("\n");
    sb.append("    guami: ").append(toIndentedString(guami)).append("\n");
    sb.append("    maxIntegrityProtectedDataRateUl: ").append(toIndentedString(maxIntegrityProtectedDataRateUl)).append("\n");
    sb.append("    maxIntegrityProtectedDataRateDl: ").append(toIndentedString(maxIntegrityProtectedDataRateDl)).append("\n");
    sb.append("    cpCiotEnabled: ").append(toIndentedString(cpCiotEnabled)).append("\n");
    sb.append("    cpOnlyInd: ").append(toIndentedString(cpOnlyInd)).append("\n");
    sb.append("    invokeNef: ").append(toIndentedString(invokeNef)).append("\n");
    sb.append("    maRequestInd: ").append(toIndentedString(maRequestInd)).append("\n");
    sb.append("    maNwUpgradeInd: ").append(toIndentedString(maNwUpgradeInd)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
    sb.append("    presenceInLadn: ").append(toIndentedString(presenceInLadn)).append("\n");
    sb.append("    secondaryRatUsageInfo: ").append(toIndentedString(secondaryRatUsageInfo)).append("\n");
    sb.append("    smallDataRateStatus: ").append(toIndentedString(smallDataRateStatus)).append("\n");
    sb.append("    apnRateStatus: ").append(toIndentedString(apnRateStatus)).append("\n");
    sb.append("    dlServingPlmnRateCtl: ").append(toIndentedString(dlServingPlmnRateCtl)).append("\n");
    sb.append("    upSecurityInfo: ").append(toIndentedString(upSecurityInfo)).append("\n");
    sb.append("    vplmnQos: ").append(toIndentedString(vplmnQos)).append("\n");
    sb.append("    oldSmContextRef: ").append(toIndentedString(oldSmContextRef)).append("\n");
    sb.append("    redundantPduSessionInfo: ").append(toIndentedString(redundantPduSessionInfo)).append("\n");
    sb.append("    oldPduSessionRef: ").append(toIndentedString(oldPduSessionRef)).append("\n");
    sb.append("    smPolicyNotifyInd: ").append(toIndentedString(smPolicyNotifyInd)).append("\n");
    sb.append("    pcfUeCallbackInfo: ").append(toIndentedString(pcfUeCallbackInfo)).append("\n");
    sb.append("    satelliteBackhaulCat: ").append(toIndentedString(satelliteBackhaulCat)).append("\n");
    sb.append("    upipSupported: ").append(toIndentedString(upipSupported)).append("\n");
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

