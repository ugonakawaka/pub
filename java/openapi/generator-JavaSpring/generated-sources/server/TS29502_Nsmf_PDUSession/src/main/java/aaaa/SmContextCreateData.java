package aaaa;

import java.util.Objects;
import aaaa.AccessType;
import aaaa.ApnRateStatus;
import aaaa.BackupAmfInfo;
import aaaa.DdnFailureSubs;
import aaaa.DnnSelectionMode;
import aaaa.EpsInterworkingIndication;
import aaaa.Guami;
import aaaa.HoState;
import aaaa.N2SmInfoType;
import aaaa.NgRanTargetId;
import aaaa.PcfUeCallbackInfo;
import aaaa.PlmnIdNid;
import aaaa.PresenceState;
import aaaa.PvsInfo;
import aaaa.RatType;
import aaaa.RefToBinaryData;
import aaaa.RequestType;
import aaaa.SatelliteBackhaulCategory;
import aaaa.SbiBindingLevel;
import aaaa.ServiceName;
import aaaa.SmallDataRateStatus;
import aaaa.Snssai;
import aaaa.TngfInfo;
import aaaa.TraceData;
import aaaa.TwifInfo;
import aaaa.UpCnxState;
import aaaa.UserLocation;
import aaaa.WAgfInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Create SM Context Request
 */
@ApiModel(description = "Data within Create SM Context Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class SmContextCreateData   {
  @JsonProperty("supi")
  private String supi;

  @JsonProperty("unauthenticatedSupi")
  private Boolean unauthenticatedSupi = false;

  @JsonProperty("pei")
  private String pei;

  @JsonProperty("gpsi")
  private String gpsi;

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

  @JsonProperty("servingNfId")
  private UUID servingNfId;

  @JsonProperty("guami")
  private Guami guami;

  @JsonProperty("serviceName")
  private ServiceName serviceName;

  @JsonProperty("servingNetwork")
  private PlmnIdNid servingNetwork;

  @JsonProperty("requestType")
  private RequestType requestType;

  @JsonProperty("n1SmMsg")
  private RefToBinaryData n1SmMsg;

  @JsonProperty("anType")
  private AccessType anType;

  @JsonProperty("additionalAnType")
  private AccessType additionalAnType;

  @JsonProperty("ratType")
  private RatType ratType;

  @JsonProperty("presenceInLadn")
  private PresenceState presenceInLadn;

  @JsonProperty("ueLocation")
  private UserLocation ueLocation;

  @JsonProperty("ueTimeZone")
  private String ueTimeZone;

  @JsonProperty("addUeLocation")
  private UserLocation addUeLocation;

  @JsonProperty("smContextStatusUri")
  private String smContextStatusUri;

  @JsonProperty("hSmfUri")
  private String hSmfUri;

  @JsonProperty("hSmfId")
  private UUID hSmfId;

  @JsonProperty("smfUri")
  private String smfUri;

  @JsonProperty("smfId")
  private UUID smfId;

  @JsonProperty("additionalHsmfUri")
  @Valid
  private List<String> additionalHsmfUri = null;

  @JsonProperty("additionalHsmfId")
  @Valid
  private List<UUID> additionalHsmfId = null;

  @JsonProperty("additionalSmfUri")
  @Valid
  private List<String> additionalSmfUri = null;

  @JsonProperty("additionalSmfId")
  @Valid
  private List<UUID> additionalSmfId = null;

  @JsonProperty("oldPduSessionId")
  private Integer oldPduSessionId;

  @JsonProperty("pduSessionsActivateList")
  @Valid
  private List<Integer> pduSessionsActivateList = null;

  @JsonProperty("ueEpsPdnConnection")
  private String ueEpsPdnConnection;

  @JsonProperty("hoState")
  private HoState hoState;

  @JsonProperty("pcfId")
  private UUID pcfId;

  @JsonProperty("pcfGroupId")
  private String pcfGroupId;

  @JsonProperty("pcfSetId")
  private String pcfSetId;

  @JsonProperty("nrfUri")
  private String nrfUri;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("selMode")
  private DnnSelectionMode selMode;

  @JsonProperty("backupAmfInfo")
  @Valid
  private List<BackupAmfInfo> backupAmfInfo = null;

  @JsonProperty("traceData")
  private JsonNullable<TraceData> traceData = JsonNullable.undefined();

  @JsonProperty("udmGroupId")
  private String udmGroupId;

  @JsonProperty("routingIndicator")
  private String routingIndicator;

  @JsonProperty("hNwPubKeyId")
  private Integer hNwPubKeyId;

  @JsonProperty("epsInterworkingInd")
  private EpsInterworkingIndication epsInterworkingInd;

  @JsonProperty("indirectForwardingFlag")
  private Boolean indirectForwardingFlag;

  @JsonProperty("directForwardingFlag")
  private Boolean directForwardingFlag;

  @JsonProperty("targetId")
  private NgRanTargetId targetId;

  @JsonProperty("epsBearerCtxStatus")
  private String epsBearerCtxStatus;

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

  @JsonProperty("n2SmInfo")
  private RefToBinaryData n2SmInfo;

  @JsonProperty("n2SmInfoType")
  private N2SmInfoType n2SmInfoType;

  @JsonProperty("n2SmInfoExt1")
  private RefToBinaryData n2SmInfoExt1;

  @JsonProperty("n2SmInfoTypeExt1")
  private N2SmInfoType n2SmInfoTypeExt1;

  @JsonProperty("smContextRef")
  private String smContextRef;

  @JsonProperty("smContextSmfId")
  private UUID smContextSmfId;

  @JsonProperty("smContextSmfSetId")
  private String smContextSmfSetId;

  @JsonProperty("smContextSmfServiceSetId")
  private String smContextSmfServiceSetId;

  @JsonProperty("smContextSmfBinding")
  private SbiBindingLevel smContextSmfBinding;

  @JsonProperty("upCnxState")
  private UpCnxState upCnxState;

  @JsonProperty("smallDataRateStatus")
  private SmallDataRateStatus smallDataRateStatus;

  @JsonProperty("apnRateStatus")
  private ApnRateStatus apnRateStatus;

  @JsonProperty("extendedNasSmTimerInd")
  private Boolean extendedNasSmTimerInd = false;

  @JsonProperty("dlDataWaitingInd")
  private Boolean dlDataWaitingInd = false;

  @JsonProperty("ddnFailureSubs")
  private DdnFailureSubs ddnFailureSubs;

  @JsonProperty("smfTransferInd")
  private Boolean smfTransferInd = false;

  @JsonProperty("oldSmfId")
  private UUID oldSmfId;

  @JsonProperty("oldSmContextRef")
  private String oldSmContextRef;

  @JsonProperty("wAgfInfo")
  private WAgfInfo wAgfInfo;

  @JsonProperty("tngfInfo")
  private TngfInfo tngfInfo;

  @JsonProperty("twifInfo")
  private TwifInfo twifInfo;

  @JsonProperty("ranUnchangedInd")
  private Boolean ranUnchangedInd;

  @JsonProperty("samePcfSelectionInd")
  private Boolean samePcfSelectionInd = false;

  @JsonProperty("targetDnai")
  private String targetDnai;

  @JsonProperty("nrfManagementUri")
  private String nrfManagementUri;

  @JsonProperty("nrfDiscoveryUri")
  private String nrfDiscoveryUri;

  @JsonProperty("nrfAccessTokenUri")
  private String nrfAccessTokenUri;

  @JsonProperty("smfBindingInfo")
  private String smfBindingInfo;

  @JsonProperty("pvsInfo")
  private PvsInfo pvsInfo;

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

  public SmContextCreateData supi(String supi) {
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

  public SmContextCreateData unauthenticatedSupi(Boolean unauthenticatedSupi) {
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

  public SmContextCreateData pei(String pei) {
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

  public SmContextCreateData gpsi(String gpsi) {
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

  public SmContextCreateData pduSessionId(Integer pduSessionId) {
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

  public SmContextCreateData dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").
   * @return dnn
  */
  @ApiModelProperty(value = "String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").")


  public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public SmContextCreateData selectedDnn(String selectedDnn) {
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

  public SmContextCreateData sNssai(Snssai sNssai) {
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

  public SmContextCreateData hplmnSnssai(Snssai hplmnSnssai) {
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

  public SmContextCreateData servingNfId(UUID servingNfId) {
    this.servingNfId = servingNfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return servingNfId
  */
  @ApiModelProperty(required = true, value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")
  @NotNull

  @Valid

  public UUID getServingNfId() {
    return servingNfId;
  }

  public void setServingNfId(UUID servingNfId) {
    this.servingNfId = servingNfId;
  }

  public SmContextCreateData guami(Guami guami) {
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

  public SmContextCreateData serviceName(ServiceName serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceName getServiceName() {
    return serviceName;
  }

  public void setServiceName(ServiceName serviceName) {
    this.serviceName = serviceName;
  }

  public SmContextCreateData servingNetwork(PlmnIdNid servingNetwork) {
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

  public SmContextCreateData requestType(RequestType requestType) {
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

  public SmContextCreateData n1SmMsg(RefToBinaryData n1SmMsg) {
    this.n1SmMsg = n1SmMsg;
    return this;
  }

  /**
   * Get n1SmMsg
   * @return n1SmMsg
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN1SmMsg() {
    return n1SmMsg;
  }

  public void setN1SmMsg(RefToBinaryData n1SmMsg) {
    this.n1SmMsg = n1SmMsg;
  }

  public SmContextCreateData anType(AccessType anType) {
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

  public SmContextCreateData additionalAnType(AccessType additionalAnType) {
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

  public SmContextCreateData ratType(RatType ratType) {
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

  public SmContextCreateData presenceInLadn(PresenceState presenceInLadn) {
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

  public SmContextCreateData ueLocation(UserLocation ueLocation) {
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

  public SmContextCreateData ueTimeZone(String ueTimeZone) {
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

  public SmContextCreateData addUeLocation(UserLocation addUeLocation) {
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

  public SmContextCreateData smContextStatusUri(String smContextStatusUri) {
    this.smContextStatusUri = smContextStatusUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return smContextStatusUri
  */
  @ApiModelProperty(required = true, value = "String providing an URI formatted according to RFC 3986")
  @NotNull


  public String getSmContextStatusUri() {
    return smContextStatusUri;
  }

  public void setSmContextStatusUri(String smContextStatusUri) {
    this.smContextStatusUri = smContextStatusUri;
  }

  public SmContextCreateData hSmfUri(String hSmfUri) {
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

  public SmContextCreateData hSmfId(UUID hSmfId) {
    this.hSmfId = hSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return hSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID gethSmfId() {
    return hSmfId;
  }

  public void sethSmfId(UUID hSmfId) {
    this.hSmfId = hSmfId;
  }

  public SmContextCreateData smfUri(String smfUri) {
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

  public SmContextCreateData smfId(UUID smfId) {
    this.smfId = smfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return smfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getSmfId() {
    return smfId;
  }

  public void setSmfId(UUID smfId) {
    this.smfId = smfId;
  }

  public SmContextCreateData additionalHsmfUri(List<String> additionalHsmfUri) {
    this.additionalHsmfUri = additionalHsmfUri;
    return this;
  }

  public SmContextCreateData addAdditionalHsmfUriItem(String additionalHsmfUriItem) {
    if (this.additionalHsmfUri == null) {
      this.additionalHsmfUri = new ArrayList<>();
    }
    this.additionalHsmfUri.add(additionalHsmfUriItem);
    return this;
  }

  /**
   * Get additionalHsmfUri
   * @return additionalHsmfUri
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getAdditionalHsmfUri() {
    return additionalHsmfUri;
  }

  public void setAdditionalHsmfUri(List<String> additionalHsmfUri) {
    this.additionalHsmfUri = additionalHsmfUri;
  }

  public SmContextCreateData additionalHsmfId(List<UUID> additionalHsmfId) {
    this.additionalHsmfId = additionalHsmfId;
    return this;
  }

  public SmContextCreateData addAdditionalHsmfIdItem(UUID additionalHsmfIdItem) {
    if (this.additionalHsmfId == null) {
      this.additionalHsmfId = new ArrayList<>();
    }
    this.additionalHsmfId.add(additionalHsmfIdItem);
    return this;
  }

  /**
   * Get additionalHsmfId
   * @return additionalHsmfId
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<UUID> getAdditionalHsmfId() {
    return additionalHsmfId;
  }

  public void setAdditionalHsmfId(List<UUID> additionalHsmfId) {
    this.additionalHsmfId = additionalHsmfId;
  }

  public SmContextCreateData additionalSmfUri(List<String> additionalSmfUri) {
    this.additionalSmfUri = additionalSmfUri;
    return this;
  }

  public SmContextCreateData addAdditionalSmfUriItem(String additionalSmfUriItem) {
    if (this.additionalSmfUri == null) {
      this.additionalSmfUri = new ArrayList<>();
    }
    this.additionalSmfUri.add(additionalSmfUriItem);
    return this;
  }

  /**
   * Get additionalSmfUri
   * @return additionalSmfUri
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getAdditionalSmfUri() {
    return additionalSmfUri;
  }

  public void setAdditionalSmfUri(List<String> additionalSmfUri) {
    this.additionalSmfUri = additionalSmfUri;
  }

  public SmContextCreateData additionalSmfId(List<UUID> additionalSmfId) {
    this.additionalSmfId = additionalSmfId;
    return this;
  }

  public SmContextCreateData addAdditionalSmfIdItem(UUID additionalSmfIdItem) {
    if (this.additionalSmfId == null) {
      this.additionalSmfId = new ArrayList<>();
    }
    this.additionalSmfId.add(additionalSmfIdItem);
    return this;
  }

  /**
   * Get additionalSmfId
   * @return additionalSmfId
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<UUID> getAdditionalSmfId() {
    return additionalSmfId;
  }

  public void setAdditionalSmfId(List<UUID> additionalSmfId) {
    this.additionalSmfId = additionalSmfId;
  }

  public SmContextCreateData oldPduSessionId(Integer oldPduSessionId) {
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

  public SmContextCreateData pduSessionsActivateList(List<Integer> pduSessionsActivateList) {
    this.pduSessionsActivateList = pduSessionsActivateList;
    return this;
  }

  public SmContextCreateData addPduSessionsActivateListItem(Integer pduSessionsActivateListItem) {
    if (this.pduSessionsActivateList == null) {
      this.pduSessionsActivateList = new ArrayList<>();
    }
    this.pduSessionsActivateList.add(pduSessionsActivateListItem);
    return this;
  }

  /**
   * Get pduSessionsActivateList
   * @return pduSessionsActivateList
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<Integer> getPduSessionsActivateList() {
    return pduSessionsActivateList;
  }

  public void setPduSessionsActivateList(List<Integer> pduSessionsActivateList) {
    this.pduSessionsActivateList = pduSessionsActivateList;
  }

  public SmContextCreateData ueEpsPdnConnection(String ueEpsPdnConnection) {
    this.ueEpsPdnConnection = ueEpsPdnConnection;
    return this;
  }

  /**
   * UE EPS PDN Connection container from SMF to AMF
   * @return ueEpsPdnConnection
  */
  @ApiModelProperty(value = "UE EPS PDN Connection container from SMF to AMF")


  public String getUeEpsPdnConnection() {
    return ueEpsPdnConnection;
  }

  public void setUeEpsPdnConnection(String ueEpsPdnConnection) {
    this.ueEpsPdnConnection = ueEpsPdnConnection;
  }

  public SmContextCreateData hoState(HoState hoState) {
    this.hoState = hoState;
    return this;
  }

  /**
   * Get hoState
   * @return hoState
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoState getHoState() {
    return hoState;
  }

  public void setHoState(HoState hoState) {
    this.hoState = hoState;
  }

  public SmContextCreateData pcfId(UUID pcfId) {
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

  public SmContextCreateData pcfGroupId(String pcfGroupId) {
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

  public SmContextCreateData pcfSetId(String pcfSetId) {
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

  public SmContextCreateData nrfUri(String nrfUri) {
    this.nrfUri = nrfUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return nrfUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getNrfUri() {
    return nrfUri;
  }

  public void setNrfUri(String nrfUri) {
    this.nrfUri = nrfUri;
  }

  public SmContextCreateData supportedFeatures(String supportedFeatures) {
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

  public SmContextCreateData selMode(DnnSelectionMode selMode) {
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

  public SmContextCreateData backupAmfInfo(List<BackupAmfInfo> backupAmfInfo) {
    this.backupAmfInfo = backupAmfInfo;
    return this;
  }

  public SmContextCreateData addBackupAmfInfoItem(BackupAmfInfo backupAmfInfoItem) {
    if (this.backupAmfInfo == null) {
      this.backupAmfInfo = new ArrayList<>();
    }
    this.backupAmfInfo.add(backupAmfInfoItem);
    return this;
  }

  /**
   * Get backupAmfInfo
   * @return backupAmfInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<BackupAmfInfo> getBackupAmfInfo() {
    return backupAmfInfo;
  }

  public void setBackupAmfInfo(List<BackupAmfInfo> backupAmfInfo) {
    this.backupAmfInfo = backupAmfInfo;
  }

  public SmContextCreateData traceData(TraceData traceData) {
    this.traceData = JsonNullable.of(traceData);
    return this;
  }

  /**
   * Get traceData
   * @return traceData
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<TraceData> getTraceData() {
    return traceData;
  }

  public void setTraceData(JsonNullable<TraceData> traceData) {
    this.traceData = traceData;
  }

  public SmContextCreateData udmGroupId(String udmGroupId) {
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

  public SmContextCreateData routingIndicator(String routingIndicator) {
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

  public SmContextCreateData hNwPubKeyId(Integer hNwPubKeyId) {
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

  public SmContextCreateData epsInterworkingInd(EpsInterworkingIndication epsInterworkingInd) {
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

  public SmContextCreateData indirectForwardingFlag(Boolean indirectForwardingFlag) {
    this.indirectForwardingFlag = indirectForwardingFlag;
    return this;
  }

  /**
   * Get indirectForwardingFlag
   * @return indirectForwardingFlag
  */
  @ApiModelProperty(value = "")


  public Boolean getIndirectForwardingFlag() {
    return indirectForwardingFlag;
  }

  public void setIndirectForwardingFlag(Boolean indirectForwardingFlag) {
    this.indirectForwardingFlag = indirectForwardingFlag;
  }

  public SmContextCreateData directForwardingFlag(Boolean directForwardingFlag) {
    this.directForwardingFlag = directForwardingFlag;
    return this;
  }

  /**
   * Get directForwardingFlag
   * @return directForwardingFlag
  */
  @ApiModelProperty(value = "")


  public Boolean getDirectForwardingFlag() {
    return directForwardingFlag;
  }

  public void setDirectForwardingFlag(Boolean directForwardingFlag) {
    this.directForwardingFlag = directForwardingFlag;
  }

  public SmContextCreateData targetId(NgRanTargetId targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
  */
  @ApiModelProperty(value = "")

  @Valid

  public NgRanTargetId getTargetId() {
    return targetId;
  }

  public void setTargetId(NgRanTargetId targetId) {
    this.targetId = targetId;
  }

  public SmContextCreateData epsBearerCtxStatus(String epsBearerCtxStatus) {
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

  public SmContextCreateData cpCiotEnabled(Boolean cpCiotEnabled) {
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

  public SmContextCreateData cpOnlyInd(Boolean cpOnlyInd) {
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

  public SmContextCreateData invokeNef(Boolean invokeNef) {
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

  public SmContextCreateData maRequestInd(Boolean maRequestInd) {
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

  public SmContextCreateData maNwUpgradeInd(Boolean maNwUpgradeInd) {
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

  public SmContextCreateData n2SmInfo(RefToBinaryData n2SmInfo) {
    this.n2SmInfo = n2SmInfo;
    return this;
  }

  /**
   * Get n2SmInfo
   * @return n2SmInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN2SmInfo() {
    return n2SmInfo;
  }

  public void setN2SmInfo(RefToBinaryData n2SmInfo) {
    this.n2SmInfo = n2SmInfo;
  }

  public SmContextCreateData n2SmInfoType(N2SmInfoType n2SmInfoType) {
    this.n2SmInfoType = n2SmInfoType;
    return this;
  }

  /**
   * Get n2SmInfoType
   * @return n2SmInfoType
  */
  @ApiModelProperty(value = "")

  @Valid

  public N2SmInfoType getN2SmInfoType() {
    return n2SmInfoType;
  }

  public void setN2SmInfoType(N2SmInfoType n2SmInfoType) {
    this.n2SmInfoType = n2SmInfoType;
  }

  public SmContextCreateData n2SmInfoExt1(RefToBinaryData n2SmInfoExt1) {
    this.n2SmInfoExt1 = n2SmInfoExt1;
    return this;
  }

  /**
   * Get n2SmInfoExt1
   * @return n2SmInfoExt1
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN2SmInfoExt1() {
    return n2SmInfoExt1;
  }

  public void setN2SmInfoExt1(RefToBinaryData n2SmInfoExt1) {
    this.n2SmInfoExt1 = n2SmInfoExt1;
  }

  public SmContextCreateData n2SmInfoTypeExt1(N2SmInfoType n2SmInfoTypeExt1) {
    this.n2SmInfoTypeExt1 = n2SmInfoTypeExt1;
    return this;
  }

  /**
   * Get n2SmInfoTypeExt1
   * @return n2SmInfoTypeExt1
  */
  @ApiModelProperty(value = "")

  @Valid

  public N2SmInfoType getN2SmInfoTypeExt1() {
    return n2SmInfoTypeExt1;
  }

  public void setN2SmInfoTypeExt1(N2SmInfoType n2SmInfoTypeExt1) {
    this.n2SmInfoTypeExt1 = n2SmInfoTypeExt1;
  }

  public SmContextCreateData smContextRef(String smContextRef) {
    this.smContextRef = smContextRef;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return smContextRef
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getSmContextRef() {
    return smContextRef;
  }

  public void setSmContextRef(String smContextRef) {
    this.smContextRef = smContextRef;
  }

  public SmContextCreateData smContextSmfId(UUID smContextSmfId) {
    this.smContextSmfId = smContextSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return smContextSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getSmContextSmfId() {
    return smContextSmfId;
  }

  public void setSmContextSmfId(UUID smContextSmfId) {
    this.smContextSmfId = smContextSmfId;
  }

  public SmContextCreateData smContextSmfSetId(String smContextSmfSetId) {
    this.smContextSmfSetId = smContextSmfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return smContextSmfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getSmContextSmfSetId() {
    return smContextSmfSetId;
  }

  public void setSmContextSmfSetId(String smContextSmfSetId) {
    this.smContextSmfSetId = smContextSmfSetId;
  }

  public SmContextCreateData smContextSmfServiceSetId(String smContextSmfServiceSetId) {
    this.smContextSmfServiceSetId = smContextSmfServiceSetId;
    return this;
  }

  /**
   * NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return smContextSmfServiceSetId
  */
  @ApiModelProperty(value = "NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getSmContextSmfServiceSetId() {
    return smContextSmfServiceSetId;
  }

  public void setSmContextSmfServiceSetId(String smContextSmfServiceSetId) {
    this.smContextSmfServiceSetId = smContextSmfServiceSetId;
  }

  public SmContextCreateData smContextSmfBinding(SbiBindingLevel smContextSmfBinding) {
    this.smContextSmfBinding = smContextSmfBinding;
    return this;
  }

  /**
   * Get smContextSmfBinding
   * @return smContextSmfBinding
  */
  @ApiModelProperty(value = "")

  @Valid

  public SbiBindingLevel getSmContextSmfBinding() {
    return smContextSmfBinding;
  }

  public void setSmContextSmfBinding(SbiBindingLevel smContextSmfBinding) {
    this.smContextSmfBinding = smContextSmfBinding;
  }

  public SmContextCreateData upCnxState(UpCnxState upCnxState) {
    this.upCnxState = upCnxState;
    return this;
  }

  /**
   * Get upCnxState
   * @return upCnxState
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpCnxState getUpCnxState() {
    return upCnxState;
  }

  public void setUpCnxState(UpCnxState upCnxState) {
    this.upCnxState = upCnxState;
  }

  public SmContextCreateData smallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
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

  public SmContextCreateData apnRateStatus(ApnRateStatus apnRateStatus) {
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

  public SmContextCreateData extendedNasSmTimerInd(Boolean extendedNasSmTimerInd) {
    this.extendedNasSmTimerInd = extendedNasSmTimerInd;
    return this;
  }

  /**
   * Get extendedNasSmTimerInd
   * @return extendedNasSmTimerInd
  */
  @ApiModelProperty(value = "")


  public Boolean getExtendedNasSmTimerInd() {
    return extendedNasSmTimerInd;
  }

  public void setExtendedNasSmTimerInd(Boolean extendedNasSmTimerInd) {
    this.extendedNasSmTimerInd = extendedNasSmTimerInd;
  }

  public SmContextCreateData dlDataWaitingInd(Boolean dlDataWaitingInd) {
    this.dlDataWaitingInd = dlDataWaitingInd;
    return this;
  }

  /**
   * Get dlDataWaitingInd
   * @return dlDataWaitingInd
  */
  @ApiModelProperty(value = "")


  public Boolean getDlDataWaitingInd() {
    return dlDataWaitingInd;
  }

  public void setDlDataWaitingInd(Boolean dlDataWaitingInd) {
    this.dlDataWaitingInd = dlDataWaitingInd;
  }

  public SmContextCreateData ddnFailureSubs(DdnFailureSubs ddnFailureSubs) {
    this.ddnFailureSubs = ddnFailureSubs;
    return this;
  }

  /**
   * Get ddnFailureSubs
   * @return ddnFailureSubs
  */
  @ApiModelProperty(value = "")

  @Valid

  public DdnFailureSubs getDdnFailureSubs() {
    return ddnFailureSubs;
  }

  public void setDdnFailureSubs(DdnFailureSubs ddnFailureSubs) {
    this.ddnFailureSubs = ddnFailureSubs;
  }

  public SmContextCreateData smfTransferInd(Boolean smfTransferInd) {
    this.smfTransferInd = smfTransferInd;
    return this;
  }

  /**
   * Get smfTransferInd
   * @return smfTransferInd
  */
  @ApiModelProperty(value = "")


  public Boolean getSmfTransferInd() {
    return smfTransferInd;
  }

  public void setSmfTransferInd(Boolean smfTransferInd) {
    this.smfTransferInd = smfTransferInd;
  }

  public SmContextCreateData oldSmfId(UUID oldSmfId) {
    this.oldSmfId = oldSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return oldSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getOldSmfId() {
    return oldSmfId;
  }

  public void setOldSmfId(UUID oldSmfId) {
    this.oldSmfId = oldSmfId;
  }

  public SmContextCreateData oldSmContextRef(String oldSmContextRef) {
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

  public SmContextCreateData wAgfInfo(WAgfInfo wAgfInfo) {
    this.wAgfInfo = wAgfInfo;
    return this;
  }

  /**
   * Get wAgfInfo
   * @return wAgfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public WAgfInfo getwAgfInfo() {
    return wAgfInfo;
  }

  public void setwAgfInfo(WAgfInfo wAgfInfo) {
    this.wAgfInfo = wAgfInfo;
  }

  public SmContextCreateData tngfInfo(TngfInfo tngfInfo) {
    this.tngfInfo = tngfInfo;
    return this;
  }

  /**
   * Get tngfInfo
   * @return tngfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TngfInfo getTngfInfo() {
    return tngfInfo;
  }

  public void setTngfInfo(TngfInfo tngfInfo) {
    this.tngfInfo = tngfInfo;
  }

  public SmContextCreateData twifInfo(TwifInfo twifInfo) {
    this.twifInfo = twifInfo;
    return this;
  }

  /**
   * Get twifInfo
   * @return twifInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TwifInfo getTwifInfo() {
    return twifInfo;
  }

  public void setTwifInfo(TwifInfo twifInfo) {
    this.twifInfo = twifInfo;
  }

  public SmContextCreateData ranUnchangedInd(Boolean ranUnchangedInd) {
    this.ranUnchangedInd = ranUnchangedInd;
    return this;
  }

  /**
   * Get ranUnchangedInd
   * @return ranUnchangedInd
  */
  @ApiModelProperty(value = "")


  public Boolean getRanUnchangedInd() {
    return ranUnchangedInd;
  }

  public void setRanUnchangedInd(Boolean ranUnchangedInd) {
    this.ranUnchangedInd = ranUnchangedInd;
  }

  public SmContextCreateData samePcfSelectionInd(Boolean samePcfSelectionInd) {
    this.samePcfSelectionInd = samePcfSelectionInd;
    return this;
  }

  /**
   * Get samePcfSelectionInd
   * @return samePcfSelectionInd
  */
  @ApiModelProperty(value = "")


  public Boolean getSamePcfSelectionInd() {
    return samePcfSelectionInd;
  }

  public void setSamePcfSelectionInd(Boolean samePcfSelectionInd) {
    this.samePcfSelectionInd = samePcfSelectionInd;
  }

  public SmContextCreateData targetDnai(String targetDnai) {
    this.targetDnai = targetDnai;
    return this;
  }

  /**
   * DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.
   * @return targetDnai
  */
  @ApiModelProperty(value = "DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.")


  public String getTargetDnai() {
    return targetDnai;
  }

  public void setTargetDnai(String targetDnai) {
    this.targetDnai = targetDnai;
  }

  public SmContextCreateData nrfManagementUri(String nrfManagementUri) {
    this.nrfManagementUri = nrfManagementUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return nrfManagementUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getNrfManagementUri() {
    return nrfManagementUri;
  }

  public void setNrfManagementUri(String nrfManagementUri) {
    this.nrfManagementUri = nrfManagementUri;
  }

  public SmContextCreateData nrfDiscoveryUri(String nrfDiscoveryUri) {
    this.nrfDiscoveryUri = nrfDiscoveryUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return nrfDiscoveryUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getNrfDiscoveryUri() {
    return nrfDiscoveryUri;
  }

  public void setNrfDiscoveryUri(String nrfDiscoveryUri) {
    this.nrfDiscoveryUri = nrfDiscoveryUri;
  }

  public SmContextCreateData nrfAccessTokenUri(String nrfAccessTokenUri) {
    this.nrfAccessTokenUri = nrfAccessTokenUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return nrfAccessTokenUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getNrfAccessTokenUri() {
    return nrfAccessTokenUri;
  }

  public void setNrfAccessTokenUri(String nrfAccessTokenUri) {
    this.nrfAccessTokenUri = nrfAccessTokenUri;
  }

  public SmContextCreateData smfBindingInfo(String smfBindingInfo) {
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

  public SmContextCreateData pvsInfo(PvsInfo pvsInfo) {
    this.pvsInfo = pvsInfo;
    return this;
  }

  /**
   * Get pvsInfo
   * @return pvsInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PvsInfo getPvsInfo() {
    return pvsInfo;
  }

  public void setPvsInfo(PvsInfo pvsInfo) {
    this.pvsInfo = pvsInfo;
  }

  public SmContextCreateData oldPduSessionRef(String oldPduSessionRef) {
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

  public SmContextCreateData smPolicyNotifyInd(Boolean smPolicyNotifyInd) {
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

  public SmContextCreateData pcfUeCallbackInfo(PcfUeCallbackInfo pcfUeCallbackInfo) {
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

  public SmContextCreateData satelliteBackhaulCat(SatelliteBackhaulCategory satelliteBackhaulCat) {
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

  public SmContextCreateData upipSupported(Boolean upipSupported) {
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
    SmContextCreateData smContextCreateData = (SmContextCreateData) o;
    return Objects.equals(this.supi, smContextCreateData.supi) &&
        Objects.equals(this.unauthenticatedSupi, smContextCreateData.unauthenticatedSupi) &&
        Objects.equals(this.pei, smContextCreateData.pei) &&
        Objects.equals(this.gpsi, smContextCreateData.gpsi) &&
        Objects.equals(this.pduSessionId, smContextCreateData.pduSessionId) &&
        Objects.equals(this.dnn, smContextCreateData.dnn) &&
        Objects.equals(this.selectedDnn, smContextCreateData.selectedDnn) &&
        Objects.equals(this.sNssai, smContextCreateData.sNssai) &&
        Objects.equals(this.hplmnSnssai, smContextCreateData.hplmnSnssai) &&
        Objects.equals(this.servingNfId, smContextCreateData.servingNfId) &&
        Objects.equals(this.guami, smContextCreateData.guami) &&
        Objects.equals(this.serviceName, smContextCreateData.serviceName) &&
        Objects.equals(this.servingNetwork, smContextCreateData.servingNetwork) &&
        Objects.equals(this.requestType, smContextCreateData.requestType) &&
        Objects.equals(this.n1SmMsg, smContextCreateData.n1SmMsg) &&
        Objects.equals(this.anType, smContextCreateData.anType) &&
        Objects.equals(this.additionalAnType, smContextCreateData.additionalAnType) &&
        Objects.equals(this.ratType, smContextCreateData.ratType) &&
        Objects.equals(this.presenceInLadn, smContextCreateData.presenceInLadn) &&
        Objects.equals(this.ueLocation, smContextCreateData.ueLocation) &&
        Objects.equals(this.ueTimeZone, smContextCreateData.ueTimeZone) &&
        Objects.equals(this.addUeLocation, smContextCreateData.addUeLocation) &&
        Objects.equals(this.smContextStatusUri, smContextCreateData.smContextStatusUri) &&
        Objects.equals(this.hSmfUri, smContextCreateData.hSmfUri) &&
        Objects.equals(this.hSmfId, smContextCreateData.hSmfId) &&
        Objects.equals(this.smfUri, smContextCreateData.smfUri) &&
        Objects.equals(this.smfId, smContextCreateData.smfId) &&
        Objects.equals(this.additionalHsmfUri, smContextCreateData.additionalHsmfUri) &&
        Objects.equals(this.additionalHsmfId, smContextCreateData.additionalHsmfId) &&
        Objects.equals(this.additionalSmfUri, smContextCreateData.additionalSmfUri) &&
        Objects.equals(this.additionalSmfId, smContextCreateData.additionalSmfId) &&
        Objects.equals(this.oldPduSessionId, smContextCreateData.oldPduSessionId) &&
        Objects.equals(this.pduSessionsActivateList, smContextCreateData.pduSessionsActivateList) &&
        Objects.equals(this.ueEpsPdnConnection, smContextCreateData.ueEpsPdnConnection) &&
        Objects.equals(this.hoState, smContextCreateData.hoState) &&
        Objects.equals(this.pcfId, smContextCreateData.pcfId) &&
        Objects.equals(this.pcfGroupId, smContextCreateData.pcfGroupId) &&
        Objects.equals(this.pcfSetId, smContextCreateData.pcfSetId) &&
        Objects.equals(this.nrfUri, smContextCreateData.nrfUri) &&
        Objects.equals(this.supportedFeatures, smContextCreateData.supportedFeatures) &&
        Objects.equals(this.selMode, smContextCreateData.selMode) &&
        Objects.equals(this.backupAmfInfo, smContextCreateData.backupAmfInfo) &&
        Objects.equals(this.traceData, smContextCreateData.traceData) &&
        Objects.equals(this.udmGroupId, smContextCreateData.udmGroupId) &&
        Objects.equals(this.routingIndicator, smContextCreateData.routingIndicator) &&
        Objects.equals(this.hNwPubKeyId, smContextCreateData.hNwPubKeyId) &&
        Objects.equals(this.epsInterworkingInd, smContextCreateData.epsInterworkingInd) &&
        Objects.equals(this.indirectForwardingFlag, smContextCreateData.indirectForwardingFlag) &&
        Objects.equals(this.directForwardingFlag, smContextCreateData.directForwardingFlag) &&
        Objects.equals(this.targetId, smContextCreateData.targetId) &&
        Objects.equals(this.epsBearerCtxStatus, smContextCreateData.epsBearerCtxStatus) &&
        Objects.equals(this.cpCiotEnabled, smContextCreateData.cpCiotEnabled) &&
        Objects.equals(this.cpOnlyInd, smContextCreateData.cpOnlyInd) &&
        Objects.equals(this.invokeNef, smContextCreateData.invokeNef) &&
        Objects.equals(this.maRequestInd, smContextCreateData.maRequestInd) &&
        Objects.equals(this.maNwUpgradeInd, smContextCreateData.maNwUpgradeInd) &&
        Objects.equals(this.n2SmInfo, smContextCreateData.n2SmInfo) &&
        Objects.equals(this.n2SmInfoType, smContextCreateData.n2SmInfoType) &&
        Objects.equals(this.n2SmInfoExt1, smContextCreateData.n2SmInfoExt1) &&
        Objects.equals(this.n2SmInfoTypeExt1, smContextCreateData.n2SmInfoTypeExt1) &&
        Objects.equals(this.smContextRef, smContextCreateData.smContextRef) &&
        Objects.equals(this.smContextSmfId, smContextCreateData.smContextSmfId) &&
        Objects.equals(this.smContextSmfSetId, smContextCreateData.smContextSmfSetId) &&
        Objects.equals(this.smContextSmfServiceSetId, smContextCreateData.smContextSmfServiceSetId) &&
        Objects.equals(this.smContextSmfBinding, smContextCreateData.smContextSmfBinding) &&
        Objects.equals(this.upCnxState, smContextCreateData.upCnxState) &&
        Objects.equals(this.smallDataRateStatus, smContextCreateData.smallDataRateStatus) &&
        Objects.equals(this.apnRateStatus, smContextCreateData.apnRateStatus) &&
        Objects.equals(this.extendedNasSmTimerInd, smContextCreateData.extendedNasSmTimerInd) &&
        Objects.equals(this.dlDataWaitingInd, smContextCreateData.dlDataWaitingInd) &&
        Objects.equals(this.ddnFailureSubs, smContextCreateData.ddnFailureSubs) &&
        Objects.equals(this.smfTransferInd, smContextCreateData.smfTransferInd) &&
        Objects.equals(this.oldSmfId, smContextCreateData.oldSmfId) &&
        Objects.equals(this.oldSmContextRef, smContextCreateData.oldSmContextRef) &&
        Objects.equals(this.wAgfInfo, smContextCreateData.wAgfInfo) &&
        Objects.equals(this.tngfInfo, smContextCreateData.tngfInfo) &&
        Objects.equals(this.twifInfo, smContextCreateData.twifInfo) &&
        Objects.equals(this.ranUnchangedInd, smContextCreateData.ranUnchangedInd) &&
        Objects.equals(this.samePcfSelectionInd, smContextCreateData.samePcfSelectionInd) &&
        Objects.equals(this.targetDnai, smContextCreateData.targetDnai) &&
        Objects.equals(this.nrfManagementUri, smContextCreateData.nrfManagementUri) &&
        Objects.equals(this.nrfDiscoveryUri, smContextCreateData.nrfDiscoveryUri) &&
        Objects.equals(this.nrfAccessTokenUri, smContextCreateData.nrfAccessTokenUri) &&
        Objects.equals(this.smfBindingInfo, smContextCreateData.smfBindingInfo) &&
        Objects.equals(this.pvsInfo, smContextCreateData.pvsInfo) &&
        Objects.equals(this.oldPduSessionRef, smContextCreateData.oldPduSessionRef) &&
        Objects.equals(this.smPolicyNotifyInd, smContextCreateData.smPolicyNotifyInd) &&
        Objects.equals(this.pcfUeCallbackInfo, smContextCreateData.pcfUeCallbackInfo) &&
        Objects.equals(this.satelliteBackhaulCat, smContextCreateData.satelliteBackhaulCat) &&
        Objects.equals(this.upipSupported, smContextCreateData.upipSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supi, unauthenticatedSupi, pei, gpsi, pduSessionId, dnn, selectedDnn, sNssai, hplmnSnssai, servingNfId, guami, serviceName, servingNetwork, requestType, n1SmMsg, anType, additionalAnType, ratType, presenceInLadn, ueLocation, ueTimeZone, addUeLocation, smContextStatusUri, hSmfUri, hSmfId, smfUri, smfId, additionalHsmfUri, additionalHsmfId, additionalSmfUri, additionalSmfId, oldPduSessionId, pduSessionsActivateList, ueEpsPdnConnection, hoState, pcfId, pcfGroupId, pcfSetId, nrfUri, supportedFeatures, selMode, backupAmfInfo, traceData, udmGroupId, routingIndicator, hNwPubKeyId, epsInterworkingInd, indirectForwardingFlag, directForwardingFlag, targetId, epsBearerCtxStatus, cpCiotEnabled, cpOnlyInd, invokeNef, maRequestInd, maNwUpgradeInd, n2SmInfo, n2SmInfoType, n2SmInfoExt1, n2SmInfoTypeExt1, smContextRef, smContextSmfId, smContextSmfSetId, smContextSmfServiceSetId, smContextSmfBinding, upCnxState, smallDataRateStatus, apnRateStatus, extendedNasSmTimerInd, dlDataWaitingInd, ddnFailureSubs, smfTransferInd, oldSmfId, oldSmContextRef, wAgfInfo, tngfInfo, twifInfo, ranUnchangedInd, samePcfSelectionInd, targetDnai, nrfManagementUri, nrfDiscoveryUri, nrfAccessTokenUri, smfBindingInfo, pvsInfo, oldPduSessionRef, smPolicyNotifyInd, pcfUeCallbackInfo, satelliteBackhaulCat, upipSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextCreateData {\n");
    
    sb.append("    supi: ").append(toIndentedString(supi)).append("\n");
    sb.append("    unauthenticatedSupi: ").append(toIndentedString(unauthenticatedSupi)).append("\n");
    sb.append("    pei: ").append(toIndentedString(pei)).append("\n");
    sb.append("    gpsi: ").append(toIndentedString(gpsi)).append("\n");
    sb.append("    pduSessionId: ").append(toIndentedString(pduSessionId)).append("\n");
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    selectedDnn: ").append(toIndentedString(selectedDnn)).append("\n");
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    hplmnSnssai: ").append(toIndentedString(hplmnSnssai)).append("\n");
    sb.append("    servingNfId: ").append(toIndentedString(servingNfId)).append("\n");
    sb.append("    guami: ").append(toIndentedString(guami)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servingNetwork: ").append(toIndentedString(servingNetwork)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    n1SmMsg: ").append(toIndentedString(n1SmMsg)).append("\n");
    sb.append("    anType: ").append(toIndentedString(anType)).append("\n");
    sb.append("    additionalAnType: ").append(toIndentedString(additionalAnType)).append("\n");
    sb.append("    ratType: ").append(toIndentedString(ratType)).append("\n");
    sb.append("    presenceInLadn: ").append(toIndentedString(presenceInLadn)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
    sb.append("    ueTimeZone: ").append(toIndentedString(ueTimeZone)).append("\n");
    sb.append("    addUeLocation: ").append(toIndentedString(addUeLocation)).append("\n");
    sb.append("    smContextStatusUri: ").append(toIndentedString(smContextStatusUri)).append("\n");
    sb.append("    hSmfUri: ").append(toIndentedString(hSmfUri)).append("\n");
    sb.append("    hSmfId: ").append(toIndentedString(hSmfId)).append("\n");
    sb.append("    smfUri: ").append(toIndentedString(smfUri)).append("\n");
    sb.append("    smfId: ").append(toIndentedString(smfId)).append("\n");
    sb.append("    additionalHsmfUri: ").append(toIndentedString(additionalHsmfUri)).append("\n");
    sb.append("    additionalHsmfId: ").append(toIndentedString(additionalHsmfId)).append("\n");
    sb.append("    additionalSmfUri: ").append(toIndentedString(additionalSmfUri)).append("\n");
    sb.append("    additionalSmfId: ").append(toIndentedString(additionalSmfId)).append("\n");
    sb.append("    oldPduSessionId: ").append(toIndentedString(oldPduSessionId)).append("\n");
    sb.append("    pduSessionsActivateList: ").append(toIndentedString(pduSessionsActivateList)).append("\n");
    sb.append("    ueEpsPdnConnection: ").append(toIndentedString(ueEpsPdnConnection)).append("\n");
    sb.append("    hoState: ").append(toIndentedString(hoState)).append("\n");
    sb.append("    pcfId: ").append(toIndentedString(pcfId)).append("\n");
    sb.append("    pcfGroupId: ").append(toIndentedString(pcfGroupId)).append("\n");
    sb.append("    pcfSetId: ").append(toIndentedString(pcfSetId)).append("\n");
    sb.append("    nrfUri: ").append(toIndentedString(nrfUri)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    selMode: ").append(toIndentedString(selMode)).append("\n");
    sb.append("    backupAmfInfo: ").append(toIndentedString(backupAmfInfo)).append("\n");
    sb.append("    traceData: ").append(toIndentedString(traceData)).append("\n");
    sb.append("    udmGroupId: ").append(toIndentedString(udmGroupId)).append("\n");
    sb.append("    routingIndicator: ").append(toIndentedString(routingIndicator)).append("\n");
    sb.append("    hNwPubKeyId: ").append(toIndentedString(hNwPubKeyId)).append("\n");
    sb.append("    epsInterworkingInd: ").append(toIndentedString(epsInterworkingInd)).append("\n");
    sb.append("    indirectForwardingFlag: ").append(toIndentedString(indirectForwardingFlag)).append("\n");
    sb.append("    directForwardingFlag: ").append(toIndentedString(directForwardingFlag)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    epsBearerCtxStatus: ").append(toIndentedString(epsBearerCtxStatus)).append("\n");
    sb.append("    cpCiotEnabled: ").append(toIndentedString(cpCiotEnabled)).append("\n");
    sb.append("    cpOnlyInd: ").append(toIndentedString(cpOnlyInd)).append("\n");
    sb.append("    invokeNef: ").append(toIndentedString(invokeNef)).append("\n");
    sb.append("    maRequestInd: ").append(toIndentedString(maRequestInd)).append("\n");
    sb.append("    maNwUpgradeInd: ").append(toIndentedString(maNwUpgradeInd)).append("\n");
    sb.append("    n2SmInfo: ").append(toIndentedString(n2SmInfo)).append("\n");
    sb.append("    n2SmInfoType: ").append(toIndentedString(n2SmInfoType)).append("\n");
    sb.append("    n2SmInfoExt1: ").append(toIndentedString(n2SmInfoExt1)).append("\n");
    sb.append("    n2SmInfoTypeExt1: ").append(toIndentedString(n2SmInfoTypeExt1)).append("\n");
    sb.append("    smContextRef: ").append(toIndentedString(smContextRef)).append("\n");
    sb.append("    smContextSmfId: ").append(toIndentedString(smContextSmfId)).append("\n");
    sb.append("    smContextSmfSetId: ").append(toIndentedString(smContextSmfSetId)).append("\n");
    sb.append("    smContextSmfServiceSetId: ").append(toIndentedString(smContextSmfServiceSetId)).append("\n");
    sb.append("    smContextSmfBinding: ").append(toIndentedString(smContextSmfBinding)).append("\n");
    sb.append("    upCnxState: ").append(toIndentedString(upCnxState)).append("\n");
    sb.append("    smallDataRateStatus: ").append(toIndentedString(smallDataRateStatus)).append("\n");
    sb.append("    apnRateStatus: ").append(toIndentedString(apnRateStatus)).append("\n");
    sb.append("    extendedNasSmTimerInd: ").append(toIndentedString(extendedNasSmTimerInd)).append("\n");
    sb.append("    dlDataWaitingInd: ").append(toIndentedString(dlDataWaitingInd)).append("\n");
    sb.append("    ddnFailureSubs: ").append(toIndentedString(ddnFailureSubs)).append("\n");
    sb.append("    smfTransferInd: ").append(toIndentedString(smfTransferInd)).append("\n");
    sb.append("    oldSmfId: ").append(toIndentedString(oldSmfId)).append("\n");
    sb.append("    oldSmContextRef: ").append(toIndentedString(oldSmContextRef)).append("\n");
    sb.append("    wAgfInfo: ").append(toIndentedString(wAgfInfo)).append("\n");
    sb.append("    tngfInfo: ").append(toIndentedString(tngfInfo)).append("\n");
    sb.append("    twifInfo: ").append(toIndentedString(twifInfo)).append("\n");
    sb.append("    ranUnchangedInd: ").append(toIndentedString(ranUnchangedInd)).append("\n");
    sb.append("    samePcfSelectionInd: ").append(toIndentedString(samePcfSelectionInd)).append("\n");
    sb.append("    targetDnai: ").append(toIndentedString(targetDnai)).append("\n");
    sb.append("    nrfManagementUri: ").append(toIndentedString(nrfManagementUri)).append("\n");
    sb.append("    nrfDiscoveryUri: ").append(toIndentedString(nrfDiscoveryUri)).append("\n");
    sb.append("    nrfAccessTokenUri: ").append(toIndentedString(nrfAccessTokenUri)).append("\n");
    sb.append("    smfBindingInfo: ").append(toIndentedString(smfBindingInfo)).append("\n");
    sb.append("    pvsInfo: ").append(toIndentedString(pvsInfo)).append("\n");
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

