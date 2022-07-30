package aaaa;

import java.util.Objects;
import aaaa.AccessType;
import aaaa.Cause;
import aaaa.EpsInterworkingIndication;
import aaaa.Guami;
import aaaa.MaReleaseIndication;
import aaaa.MoExpDataCounter;
import aaaa.N4Information;
import aaaa.NgApCause;
import aaaa.PcfUeCallbackInfo;
import aaaa.PduSessionNotifyItem;
import aaaa.PlmnIdNid;
import aaaa.PresenceState;
import aaaa.PsaInformation;
import aaaa.QosFlowItem;
import aaaa.QosFlowNotifyItem;
import aaaa.RatType;
import aaaa.RefToBinaryData;
import aaaa.RequestIndication;
import aaaa.RoamingChargingProfile;
import aaaa.SatelliteBackhaulCategory;
import aaaa.SecondaryRatUsageInfo;
import aaaa.SecondaryRatUsageReport;
import aaaa.SecurityResult;
import aaaa.TunnelInfo;
import aaaa.UlclBpInformation;
import aaaa.UnavailableAccessIndication;
import aaaa.UpSecurityInfo;
import aaaa.UserLocation;
import aaaa.VplmnQos;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Update Request towards H-SMF, or from I-SMF to SMF
 */
@ApiModel(description = "Data within Update Request towards H-SMF, or from I-SMF to SMF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class HsmfUpdateData   {
  @JsonProperty("requestIndication")
  private RequestIndication requestIndication;

  @JsonProperty("pei")
  private String pei;

  @JsonProperty("vcnTunnelInfo")
  private TunnelInfo vcnTunnelInfo;

  @JsonProperty("icnTunnelInfo")
  private TunnelInfo icnTunnelInfo;

  @JsonProperty("additionalCnTunnelInfo")
  private TunnelInfo additionalCnTunnelInfo;

  @JsonProperty("servingNetwork")
  private PlmnIdNid servingNetwork;

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

  @JsonProperty("pauseCharging")
  private Boolean pauseCharging;

  @JsonProperty("pti")
  private Integer pti;

  @JsonProperty("n1SmInfoFromUe")
  private RefToBinaryData n1SmInfoFromUe;

  @JsonProperty("unknownN1SmInfo")
  private RefToBinaryData unknownN1SmInfo;

  @JsonProperty("qosFlowsRelNotifyList")
  @Valid
  private List<QosFlowItem> qosFlowsRelNotifyList = null;

  @JsonProperty("qosFlowsNotifyList")
  @Valid
  private List<QosFlowNotifyItem> qosFlowsNotifyList = null;

  @JsonProperty("NotifyList")
  @Valid
  private List<PduSessionNotifyItem> notifyList = null;

  @JsonProperty("epsBearerId")
  @Valid
  private List<Integer> epsBearerId = null;

  @JsonProperty("hoPreparationIndication")
  private Boolean hoPreparationIndication;

  @JsonProperty("revokeEbiList")
  @Valid
  private List<Integer> revokeEbiList = null;

  @JsonProperty("cause")
  private Cause cause;

  @JsonProperty("ngApCause")
  private NgApCause ngApCause;

  @JsonProperty("5gMmCauseValue")
  private Integer _5gMmCauseValue;

  @JsonProperty("alwaysOnRequested")
  private Boolean alwaysOnRequested = false;

  @JsonProperty("epsInterworkingInd")
  private EpsInterworkingIndication epsInterworkingInd;

  @JsonProperty("secondaryRatUsageReport")
  @Valid
  private List<SecondaryRatUsageReport> secondaryRatUsageReport = null;

  @JsonProperty("secondaryRatUsageInfo")
  @Valid
  private List<SecondaryRatUsageInfo> secondaryRatUsageInfo = null;

  @JsonProperty("anTypeCanBeChanged")
  private Boolean anTypeCanBeChanged = false;

  @JsonProperty("maReleaseInd")
  private MaReleaseIndication maReleaseInd;

  @JsonProperty("maNwUpgradeInd")
  private Boolean maNwUpgradeInd = false;

  @JsonProperty("maRequestInd")
  private Boolean maRequestInd = false;

  @JsonProperty("unavailableAccessInd")
  private UnavailableAccessIndication unavailableAccessInd;

  @JsonProperty("psaInfo")
  @Valid
  private List<PsaInformation> psaInfo = null;

  @JsonProperty("ulclBpInfo")
  private UlclBpInformation ulclBpInfo;

  @JsonProperty("n4Info")
  private N4Information n4Info;

  @JsonProperty("n4InfoExt1")
  private N4Information n4InfoExt1;

  @JsonProperty("n4InfoExt2")
  private N4Information n4InfoExt2;

  @JsonProperty("presenceInLadn")
  private PresenceState presenceInLadn;

  @JsonProperty("vsmfPduSessionUri")
  private String vsmfPduSessionUri;

  @JsonProperty("vsmfId")
  private UUID vsmfId;

  @JsonProperty("vSmfServiceInstanceId")
  private String vSmfServiceInstanceId;

  @JsonProperty("ismfPduSessionUri")
  private String ismfPduSessionUri;

  @JsonProperty("ismfId")
  private UUID ismfId;

  @JsonProperty("iSmfServiceInstanceId")
  private String iSmfServiceInstanceId;

  @JsonProperty("dlServingPlmnRateCtl")
  private JsonNullable<Integer> dlServingPlmnRateCtl = JsonNullable.undefined();

  @JsonProperty("dnaiList")
  @Valid
  private List<String> dnaiList = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("roamingChargingProfile")
  private RoamingChargingProfile roamingChargingProfile;

  @JsonProperty("moExpDataCounter")
  private MoExpDataCounter moExpDataCounter;

  @JsonProperty("vplmnQos")
  private VplmnQos vplmnQos;

  @JsonProperty("securityResult")
  private SecurityResult securityResult;

  @JsonProperty("upSecurityInfo")
  private UpSecurityInfo upSecurityInfo;

  @JsonProperty("amfNfId")
  private UUID amfNfId;

  @JsonProperty("guami")
  private Guami guami;

  @JsonProperty("secondaryRatUsageDataReportContainer")
  @Valid
  private List<byte[]> secondaryRatUsageDataReportContainer = null;

  /**
   * Gets or Sets smPolicyNotifyInd
   */
  public enum SmPolicyNotifyIndEnum {
    TRUE("true");

    private Boolean value;

    SmPolicyNotifyIndEnum(Boolean value) {
      this.value = value;
    }

    @JsonValue
    public Boolean getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SmPolicyNotifyIndEnum fromValue(Boolean value) {
      for (SmPolicyNotifyIndEnum b : SmPolicyNotifyIndEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("smPolicyNotifyInd")
  private SmPolicyNotifyIndEnum smPolicyNotifyInd;

  @JsonProperty("pcfUeCallbackInfo")
  private JsonNullable<PcfUeCallbackInfo> pcfUeCallbackInfo = JsonNullable.undefined();

  @JsonProperty("satelliteBackhaulCat")
  private SatelliteBackhaulCategory satelliteBackhaulCat;

  public HsmfUpdateData requestIndication(RequestIndication requestIndication) {
    this.requestIndication = requestIndication;
    return this;
  }

  /**
   * Get requestIndication
   * @return requestIndication
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestIndication getRequestIndication() {
    return requestIndication;
  }

  public void setRequestIndication(RequestIndication requestIndication) {
    this.requestIndication = requestIndication;
  }

  public HsmfUpdateData pei(String pei) {
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

  public HsmfUpdateData vcnTunnelInfo(TunnelInfo vcnTunnelInfo) {
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

  public HsmfUpdateData icnTunnelInfo(TunnelInfo icnTunnelInfo) {
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

  public HsmfUpdateData additionalCnTunnelInfo(TunnelInfo additionalCnTunnelInfo) {
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

  public HsmfUpdateData servingNetwork(PlmnIdNid servingNetwork) {
    this.servingNetwork = servingNetwork;
    return this;
  }

  /**
   * Get servingNetwork
   * @return servingNetwork
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlmnIdNid getServingNetwork() {
    return servingNetwork;
  }

  public void setServingNetwork(PlmnIdNid servingNetwork) {
    this.servingNetwork = servingNetwork;
  }

  public HsmfUpdateData anType(AccessType anType) {
    this.anType = anType;
    return this;
  }

  /**
   * Get anType
   * @return anType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessType getAnType() {
    return anType;
  }

  public void setAnType(AccessType anType) {
    this.anType = anType;
  }

  public HsmfUpdateData additionalAnType(AccessType additionalAnType) {
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

  public HsmfUpdateData ratType(RatType ratType) {
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

  public HsmfUpdateData ueLocation(UserLocation ueLocation) {
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

  public HsmfUpdateData ueTimeZone(String ueTimeZone) {
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

  public HsmfUpdateData addUeLocation(UserLocation addUeLocation) {
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

  public HsmfUpdateData pauseCharging(Boolean pauseCharging) {
    this.pauseCharging = pauseCharging;
    return this;
  }

  /**
   * Get pauseCharging
   * @return pauseCharging
  */
  @ApiModelProperty(value = "")


  public Boolean getPauseCharging() {
    return pauseCharging;
  }

  public void setPauseCharging(Boolean pauseCharging) {
    this.pauseCharging = pauseCharging;
  }

  public HsmfUpdateData pti(Integer pti) {
    this.pti = pti;
    return this;
  }

  /**
   * Procedure Transaction Identifier
   * minimum: 0
   * maximum: 255
   * @return pti
  */
  @ApiModelProperty(value = "Procedure Transaction Identifier")

@Min(0) @Max(255) 
  public Integer getPti() {
    return pti;
  }

  public void setPti(Integer pti) {
    this.pti = pti;
  }

  public HsmfUpdateData n1SmInfoFromUe(RefToBinaryData n1SmInfoFromUe) {
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

  public HsmfUpdateData unknownN1SmInfo(RefToBinaryData unknownN1SmInfo) {
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

  public HsmfUpdateData qosFlowsRelNotifyList(List<QosFlowItem> qosFlowsRelNotifyList) {
    this.qosFlowsRelNotifyList = qosFlowsRelNotifyList;
    return this;
  }

  public HsmfUpdateData addQosFlowsRelNotifyListItem(QosFlowItem qosFlowsRelNotifyListItem) {
    if (this.qosFlowsRelNotifyList == null) {
      this.qosFlowsRelNotifyList = new ArrayList<>();
    }
    this.qosFlowsRelNotifyList.add(qosFlowsRelNotifyListItem);
    return this;
  }

  /**
   * Get qosFlowsRelNotifyList
   * @return qosFlowsRelNotifyList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowItem> getQosFlowsRelNotifyList() {
    return qosFlowsRelNotifyList;
  }

  public void setQosFlowsRelNotifyList(List<QosFlowItem> qosFlowsRelNotifyList) {
    this.qosFlowsRelNotifyList = qosFlowsRelNotifyList;
  }

  public HsmfUpdateData qosFlowsNotifyList(List<QosFlowNotifyItem> qosFlowsNotifyList) {
    this.qosFlowsNotifyList = qosFlowsNotifyList;
    return this;
  }

  public HsmfUpdateData addQosFlowsNotifyListItem(QosFlowNotifyItem qosFlowsNotifyListItem) {
    if (this.qosFlowsNotifyList == null) {
      this.qosFlowsNotifyList = new ArrayList<>();
    }
    this.qosFlowsNotifyList.add(qosFlowsNotifyListItem);
    return this;
  }

  /**
   * Get qosFlowsNotifyList
   * @return qosFlowsNotifyList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowNotifyItem> getQosFlowsNotifyList() {
    return qosFlowsNotifyList;
  }

  public void setQosFlowsNotifyList(List<QosFlowNotifyItem> qosFlowsNotifyList) {
    this.qosFlowsNotifyList = qosFlowsNotifyList;
  }

  public HsmfUpdateData notifyList(List<PduSessionNotifyItem> notifyList) {
    this.notifyList = notifyList;
    return this;
  }

  public HsmfUpdateData addNotifyListItem(PduSessionNotifyItem notifyListItem) {
    if (this.notifyList == null) {
      this.notifyList = new ArrayList<>();
    }
    this.notifyList.add(notifyListItem);
    return this;
  }

  /**
   * Get notifyList
   * @return notifyList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<PduSessionNotifyItem> getNotifyList() {
    return notifyList;
  }

  public void setNotifyList(List<PduSessionNotifyItem> notifyList) {
    this.notifyList = notifyList;
  }

  public HsmfUpdateData epsBearerId(List<Integer> epsBearerId) {
    this.epsBearerId = epsBearerId;
    return this;
  }

  public HsmfUpdateData addEpsBearerIdItem(Integer epsBearerIdItem) {
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

@Size(min=0) 
  public List<Integer> getEpsBearerId() {
    return epsBearerId;
  }

  public void setEpsBearerId(List<Integer> epsBearerId) {
    this.epsBearerId = epsBearerId;
  }

  public HsmfUpdateData hoPreparationIndication(Boolean hoPreparationIndication) {
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

  public HsmfUpdateData revokeEbiList(List<Integer> revokeEbiList) {
    this.revokeEbiList = revokeEbiList;
    return this;
  }

  public HsmfUpdateData addRevokeEbiListItem(Integer revokeEbiListItem) {
    if (this.revokeEbiList == null) {
      this.revokeEbiList = new ArrayList<>();
    }
    this.revokeEbiList.add(revokeEbiListItem);
    return this;
  }

  /**
   * Get revokeEbiList
   * @return revokeEbiList
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<Integer> getRevokeEbiList() {
    return revokeEbiList;
  }

  public void setRevokeEbiList(List<Integer> revokeEbiList) {
    this.revokeEbiList = revokeEbiList;
  }

  public HsmfUpdateData cause(Cause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @ApiModelProperty(value = "")

  @Valid

  public Cause getCause() {
    return cause;
  }

  public void setCause(Cause cause) {
    this.cause = cause;
  }

  public HsmfUpdateData ngApCause(NgApCause ngApCause) {
    this.ngApCause = ngApCause;
    return this;
  }

  /**
   * Get ngApCause
   * @return ngApCause
  */
  @ApiModelProperty(value = "")

  @Valid

  public NgApCause getNgApCause() {
    return ngApCause;
  }

  public void setNgApCause(NgApCause ngApCause) {
    this.ngApCause = ngApCause;
  }

  public HsmfUpdateData _5gMmCauseValue(Integer _5gMmCauseValue) {
    this._5gMmCauseValue = _5gMmCauseValue;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return _5gMmCauseValue
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0)
  public Integer get5gMmCauseValue() {
    return _5gMmCauseValue;
  }

  public void set5gMmCauseValue(Integer _5gMmCauseValue) {
    this._5gMmCauseValue = _5gMmCauseValue;
  }

  public HsmfUpdateData alwaysOnRequested(Boolean alwaysOnRequested) {
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

  public HsmfUpdateData epsInterworkingInd(EpsInterworkingIndication epsInterworkingInd) {
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

  public HsmfUpdateData secondaryRatUsageReport(List<SecondaryRatUsageReport> secondaryRatUsageReport) {
    this.secondaryRatUsageReport = secondaryRatUsageReport;
    return this;
  }

  public HsmfUpdateData addSecondaryRatUsageReportItem(SecondaryRatUsageReport secondaryRatUsageReportItem) {
    if (this.secondaryRatUsageReport == null) {
      this.secondaryRatUsageReport = new ArrayList<>();
    }
    this.secondaryRatUsageReport.add(secondaryRatUsageReportItem);
    return this;
  }

  /**
   * Get secondaryRatUsageReport
   * @return secondaryRatUsageReport
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<SecondaryRatUsageReport> getSecondaryRatUsageReport() {
    return secondaryRatUsageReport;
  }

  public void setSecondaryRatUsageReport(List<SecondaryRatUsageReport> secondaryRatUsageReport) {
    this.secondaryRatUsageReport = secondaryRatUsageReport;
  }

  public HsmfUpdateData secondaryRatUsageInfo(List<SecondaryRatUsageInfo> secondaryRatUsageInfo) {
    this.secondaryRatUsageInfo = secondaryRatUsageInfo;
    return this;
  }

  public HsmfUpdateData addSecondaryRatUsageInfoItem(SecondaryRatUsageInfo secondaryRatUsageInfoItem) {
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

  public HsmfUpdateData anTypeCanBeChanged(Boolean anTypeCanBeChanged) {
    this.anTypeCanBeChanged = anTypeCanBeChanged;
    return this;
  }

  /**
   * Get anTypeCanBeChanged
   * @return anTypeCanBeChanged
  */
  @ApiModelProperty(value = "")


  public Boolean getAnTypeCanBeChanged() {
    return anTypeCanBeChanged;
  }

  public void setAnTypeCanBeChanged(Boolean anTypeCanBeChanged) {
    this.anTypeCanBeChanged = anTypeCanBeChanged;
  }

  public HsmfUpdateData maReleaseInd(MaReleaseIndication maReleaseInd) {
    this.maReleaseInd = maReleaseInd;
    return this;
  }

  /**
   * Get maReleaseInd
   * @return maReleaseInd
  */
  @ApiModelProperty(value = "")

  @Valid

  public MaReleaseIndication getMaReleaseInd() {
    return maReleaseInd;
  }

  public void setMaReleaseInd(MaReleaseIndication maReleaseInd) {
    this.maReleaseInd = maReleaseInd;
  }

  public HsmfUpdateData maNwUpgradeInd(Boolean maNwUpgradeInd) {
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

  public HsmfUpdateData maRequestInd(Boolean maRequestInd) {
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

  public HsmfUpdateData unavailableAccessInd(UnavailableAccessIndication unavailableAccessInd) {
    this.unavailableAccessInd = unavailableAccessInd;
    return this;
  }

  /**
   * Get unavailableAccessInd
   * @return unavailableAccessInd
  */
  @ApiModelProperty(value = "")

  @Valid

  public UnavailableAccessIndication getUnavailableAccessInd() {
    return unavailableAccessInd;
  }

  public void setUnavailableAccessInd(UnavailableAccessIndication unavailableAccessInd) {
    this.unavailableAccessInd = unavailableAccessInd;
  }

  public HsmfUpdateData psaInfo(List<PsaInformation> psaInfo) {
    this.psaInfo = psaInfo;
    return this;
  }

  public HsmfUpdateData addPsaInfoItem(PsaInformation psaInfoItem) {
    if (this.psaInfo == null) {
      this.psaInfo = new ArrayList<>();
    }
    this.psaInfo.add(psaInfoItem);
    return this;
  }

  /**
   * Get psaInfo
   * @return psaInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<PsaInformation> getPsaInfo() {
    return psaInfo;
  }

  public void setPsaInfo(List<PsaInformation> psaInfo) {
    this.psaInfo = psaInfo;
  }

  public HsmfUpdateData ulclBpInfo(UlclBpInformation ulclBpInfo) {
    this.ulclBpInfo = ulclBpInfo;
    return this;
  }

  /**
   * Get ulclBpInfo
   * @return ulclBpInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public UlclBpInformation getUlclBpInfo() {
    return ulclBpInfo;
  }

  public void setUlclBpInfo(UlclBpInformation ulclBpInfo) {
    this.ulclBpInfo = ulclBpInfo;
  }

  public HsmfUpdateData n4Info(N4Information n4Info) {
    this.n4Info = n4Info;
    return this;
  }

  /**
   * Get n4Info
   * @return n4Info
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4Info() {
    return n4Info;
  }

  public void setN4Info(N4Information n4Info) {
    this.n4Info = n4Info;
  }

  public HsmfUpdateData n4InfoExt1(N4Information n4InfoExt1) {
    this.n4InfoExt1 = n4InfoExt1;
    return this;
  }

  /**
   * Get n4InfoExt1
   * @return n4InfoExt1
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt1() {
    return n4InfoExt1;
  }

  public void setN4InfoExt1(N4Information n4InfoExt1) {
    this.n4InfoExt1 = n4InfoExt1;
  }

  public HsmfUpdateData n4InfoExt2(N4Information n4InfoExt2) {
    this.n4InfoExt2 = n4InfoExt2;
    return this;
  }

  /**
   * Get n4InfoExt2
   * @return n4InfoExt2
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt2() {
    return n4InfoExt2;
  }

  public void setN4InfoExt2(N4Information n4InfoExt2) {
    this.n4InfoExt2 = n4InfoExt2;
  }

  public HsmfUpdateData presenceInLadn(PresenceState presenceInLadn) {
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

  public HsmfUpdateData vsmfPduSessionUri(String vsmfPduSessionUri) {
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

  public HsmfUpdateData vsmfId(UUID vsmfId) {
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

  public HsmfUpdateData vSmfServiceInstanceId(String vSmfServiceInstanceId) {
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

  public HsmfUpdateData ismfPduSessionUri(String ismfPduSessionUri) {
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

  public HsmfUpdateData ismfId(UUID ismfId) {
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

  public HsmfUpdateData iSmfServiceInstanceId(String iSmfServiceInstanceId) {
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

  public HsmfUpdateData dlServingPlmnRateCtl(Integer dlServingPlmnRateCtl) {
    this.dlServingPlmnRateCtl = JsonNullable.of(dlServingPlmnRateCtl);
    return this;
  }

  /**
   * Get dlServingPlmnRateCtl
   * minimum: 10
   * @return dlServingPlmnRateCtl
  */
  @ApiModelProperty(value = "")

@Min(10)
  public JsonNullable<Integer> getDlServingPlmnRateCtl() {
    return dlServingPlmnRateCtl;
  }

  public void setDlServingPlmnRateCtl(JsonNullable<Integer> dlServingPlmnRateCtl) {
    this.dlServingPlmnRateCtl = dlServingPlmnRateCtl;
  }

  public HsmfUpdateData dnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public HsmfUpdateData addDnaiListItem(String dnaiListItem) {
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

  public HsmfUpdateData supportedFeatures(String supportedFeatures) {
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

  public HsmfUpdateData roamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
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

  public HsmfUpdateData moExpDataCounter(MoExpDataCounter moExpDataCounter) {
    this.moExpDataCounter = moExpDataCounter;
    return this;
  }

  /**
   * Get moExpDataCounter
   * @return moExpDataCounter
  */
  @ApiModelProperty(value = "")

  @Valid

  public MoExpDataCounter getMoExpDataCounter() {
    return moExpDataCounter;
  }

  public void setMoExpDataCounter(MoExpDataCounter moExpDataCounter) {
    this.moExpDataCounter = moExpDataCounter;
  }

  public HsmfUpdateData vplmnQos(VplmnQos vplmnQos) {
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

  public HsmfUpdateData securityResult(SecurityResult securityResult) {
    this.securityResult = securityResult;
    return this;
  }

  /**
   * Get securityResult
   * @return securityResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityResult getSecurityResult() {
    return securityResult;
  }

  public void setSecurityResult(SecurityResult securityResult) {
    this.securityResult = securityResult;
  }

  public HsmfUpdateData upSecurityInfo(UpSecurityInfo upSecurityInfo) {
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

  public HsmfUpdateData amfNfId(UUID amfNfId) {
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

  public HsmfUpdateData guami(Guami guami) {
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

  public HsmfUpdateData secondaryRatUsageDataReportContainer(List<byte[]> secondaryRatUsageDataReportContainer) {
    this.secondaryRatUsageDataReportContainer = secondaryRatUsageDataReportContainer;
    return this;
  }

  public HsmfUpdateData addSecondaryRatUsageDataReportContainerItem(byte[] secondaryRatUsageDataReportContainerItem) {
    if (this.secondaryRatUsageDataReportContainer == null) {
      this.secondaryRatUsageDataReportContainer = new ArrayList<>();
    }
    this.secondaryRatUsageDataReportContainer.add(secondaryRatUsageDataReportContainerItem);
    return this;
  }

  /**
   * Get secondaryRatUsageDataReportContainer
   * @return secondaryRatUsageDataReportContainer
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<byte[]> getSecondaryRatUsageDataReportContainer() {
    return secondaryRatUsageDataReportContainer;
  }

  public void setSecondaryRatUsageDataReportContainer(List<byte[]> secondaryRatUsageDataReportContainer) {
    this.secondaryRatUsageDataReportContainer = secondaryRatUsageDataReportContainer;
  }

  public HsmfUpdateData smPolicyNotifyInd(SmPolicyNotifyIndEnum smPolicyNotifyInd) {
    this.smPolicyNotifyInd = smPolicyNotifyInd;
    return this;
  }

  /**
   * Get smPolicyNotifyInd
   * @return smPolicyNotifyInd
  */
  @ApiModelProperty(value = "")


  public SmPolicyNotifyIndEnum getSmPolicyNotifyInd() {
    return smPolicyNotifyInd;
  }

  public void setSmPolicyNotifyInd(SmPolicyNotifyIndEnum smPolicyNotifyInd) {
    this.smPolicyNotifyInd = smPolicyNotifyInd;
  }

  public HsmfUpdateData pcfUeCallbackInfo(PcfUeCallbackInfo pcfUeCallbackInfo) {
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

  public HsmfUpdateData satelliteBackhaulCat(SatelliteBackhaulCategory satelliteBackhaulCat) {
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
    HsmfUpdateData hsmfUpdateData = (HsmfUpdateData) o;
    return Objects.equals(this.requestIndication, hsmfUpdateData.requestIndication) &&
        Objects.equals(this.pei, hsmfUpdateData.pei) &&
        Objects.equals(this.vcnTunnelInfo, hsmfUpdateData.vcnTunnelInfo) &&
        Objects.equals(this.icnTunnelInfo, hsmfUpdateData.icnTunnelInfo) &&
        Objects.equals(this.additionalCnTunnelInfo, hsmfUpdateData.additionalCnTunnelInfo) &&
        Objects.equals(this.servingNetwork, hsmfUpdateData.servingNetwork) &&
        Objects.equals(this.anType, hsmfUpdateData.anType) &&
        Objects.equals(this.additionalAnType, hsmfUpdateData.additionalAnType) &&
        Objects.equals(this.ratType, hsmfUpdateData.ratType) &&
        Objects.equals(this.ueLocation, hsmfUpdateData.ueLocation) &&
        Objects.equals(this.ueTimeZone, hsmfUpdateData.ueTimeZone) &&
        Objects.equals(this.addUeLocation, hsmfUpdateData.addUeLocation) &&
        Objects.equals(this.pauseCharging, hsmfUpdateData.pauseCharging) &&
        Objects.equals(this.pti, hsmfUpdateData.pti) &&
        Objects.equals(this.n1SmInfoFromUe, hsmfUpdateData.n1SmInfoFromUe) &&
        Objects.equals(this.unknownN1SmInfo, hsmfUpdateData.unknownN1SmInfo) &&
        Objects.equals(this.qosFlowsRelNotifyList, hsmfUpdateData.qosFlowsRelNotifyList) &&
        Objects.equals(this.qosFlowsNotifyList, hsmfUpdateData.qosFlowsNotifyList) &&
        Objects.equals(this.notifyList, hsmfUpdateData.notifyList) &&
        Objects.equals(this.epsBearerId, hsmfUpdateData.epsBearerId) &&
        Objects.equals(this.hoPreparationIndication, hsmfUpdateData.hoPreparationIndication) &&
        Objects.equals(this.revokeEbiList, hsmfUpdateData.revokeEbiList) &&
        Objects.equals(this.cause, hsmfUpdateData.cause) &&
        Objects.equals(this.ngApCause, hsmfUpdateData.ngApCause) &&
        Objects.equals(this._5gMmCauseValue, hsmfUpdateData._5gMmCauseValue) &&
        Objects.equals(this.alwaysOnRequested, hsmfUpdateData.alwaysOnRequested) &&
        Objects.equals(this.epsInterworkingInd, hsmfUpdateData.epsInterworkingInd) &&
        Objects.equals(this.secondaryRatUsageReport, hsmfUpdateData.secondaryRatUsageReport) &&
        Objects.equals(this.secondaryRatUsageInfo, hsmfUpdateData.secondaryRatUsageInfo) &&
        Objects.equals(this.anTypeCanBeChanged, hsmfUpdateData.anTypeCanBeChanged) &&
        Objects.equals(this.maReleaseInd, hsmfUpdateData.maReleaseInd) &&
        Objects.equals(this.maNwUpgradeInd, hsmfUpdateData.maNwUpgradeInd) &&
        Objects.equals(this.maRequestInd, hsmfUpdateData.maRequestInd) &&
        Objects.equals(this.unavailableAccessInd, hsmfUpdateData.unavailableAccessInd) &&
        Objects.equals(this.psaInfo, hsmfUpdateData.psaInfo) &&
        Objects.equals(this.ulclBpInfo, hsmfUpdateData.ulclBpInfo) &&
        Objects.equals(this.n4Info, hsmfUpdateData.n4Info) &&
        Objects.equals(this.n4InfoExt1, hsmfUpdateData.n4InfoExt1) &&
        Objects.equals(this.n4InfoExt2, hsmfUpdateData.n4InfoExt2) &&
        Objects.equals(this.presenceInLadn, hsmfUpdateData.presenceInLadn) &&
        Objects.equals(this.vsmfPduSessionUri, hsmfUpdateData.vsmfPduSessionUri) &&
        Objects.equals(this.vsmfId, hsmfUpdateData.vsmfId) &&
        Objects.equals(this.vSmfServiceInstanceId, hsmfUpdateData.vSmfServiceInstanceId) &&
        Objects.equals(this.ismfPduSessionUri, hsmfUpdateData.ismfPduSessionUri) &&
        Objects.equals(this.ismfId, hsmfUpdateData.ismfId) &&
        Objects.equals(this.iSmfServiceInstanceId, hsmfUpdateData.iSmfServiceInstanceId) &&
        Objects.equals(this.dlServingPlmnRateCtl, hsmfUpdateData.dlServingPlmnRateCtl) &&
        Objects.equals(this.dnaiList, hsmfUpdateData.dnaiList) &&
        Objects.equals(this.supportedFeatures, hsmfUpdateData.supportedFeatures) &&
        Objects.equals(this.roamingChargingProfile, hsmfUpdateData.roamingChargingProfile) &&
        Objects.equals(this.moExpDataCounter, hsmfUpdateData.moExpDataCounter) &&
        Objects.equals(this.vplmnQos, hsmfUpdateData.vplmnQos) &&
        Objects.equals(this.securityResult, hsmfUpdateData.securityResult) &&
        Objects.equals(this.upSecurityInfo, hsmfUpdateData.upSecurityInfo) &&
        Objects.equals(this.amfNfId, hsmfUpdateData.amfNfId) &&
        Objects.equals(this.guami, hsmfUpdateData.guami) &&
        Objects.equals(this.secondaryRatUsageDataReportContainer, hsmfUpdateData.secondaryRatUsageDataReportContainer) &&
        Objects.equals(this.smPolicyNotifyInd, hsmfUpdateData.smPolicyNotifyInd) &&
        Objects.equals(this.pcfUeCallbackInfo, hsmfUpdateData.pcfUeCallbackInfo) &&
        Objects.equals(this.satelliteBackhaulCat, hsmfUpdateData.satelliteBackhaulCat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestIndication, pei, vcnTunnelInfo, icnTunnelInfo, additionalCnTunnelInfo, servingNetwork, anType, additionalAnType, ratType, ueLocation, ueTimeZone, addUeLocation, pauseCharging, pti, n1SmInfoFromUe, unknownN1SmInfo, qosFlowsRelNotifyList, qosFlowsNotifyList, notifyList, epsBearerId, hoPreparationIndication, revokeEbiList, cause, ngApCause, _5gMmCauseValue, alwaysOnRequested, epsInterworkingInd, secondaryRatUsageReport, secondaryRatUsageInfo, anTypeCanBeChanged, maReleaseInd, maNwUpgradeInd, maRequestInd, unavailableAccessInd, psaInfo, ulclBpInfo, n4Info, n4InfoExt1, n4InfoExt2, presenceInLadn, vsmfPduSessionUri, vsmfId, vSmfServiceInstanceId, ismfPduSessionUri, ismfId, iSmfServiceInstanceId, dlServingPlmnRateCtl, dnaiList, supportedFeatures, roamingChargingProfile, moExpDataCounter, vplmnQos, securityResult, upSecurityInfo, amfNfId, guami, secondaryRatUsageDataReportContainer, smPolicyNotifyInd, pcfUeCallbackInfo, satelliteBackhaulCat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HsmfUpdateData {\n");
    
    sb.append("    requestIndication: ").append(toIndentedString(requestIndication)).append("\n");
    sb.append("    pei: ").append(toIndentedString(pei)).append("\n");
    sb.append("    vcnTunnelInfo: ").append(toIndentedString(vcnTunnelInfo)).append("\n");
    sb.append("    icnTunnelInfo: ").append(toIndentedString(icnTunnelInfo)).append("\n");
    sb.append("    additionalCnTunnelInfo: ").append(toIndentedString(additionalCnTunnelInfo)).append("\n");
    sb.append("    servingNetwork: ").append(toIndentedString(servingNetwork)).append("\n");
    sb.append("    anType: ").append(toIndentedString(anType)).append("\n");
    sb.append("    additionalAnType: ").append(toIndentedString(additionalAnType)).append("\n");
    sb.append("    ratType: ").append(toIndentedString(ratType)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
    sb.append("    ueTimeZone: ").append(toIndentedString(ueTimeZone)).append("\n");
    sb.append("    addUeLocation: ").append(toIndentedString(addUeLocation)).append("\n");
    sb.append("    pauseCharging: ").append(toIndentedString(pauseCharging)).append("\n");
    sb.append("    pti: ").append(toIndentedString(pti)).append("\n");
    sb.append("    n1SmInfoFromUe: ").append(toIndentedString(n1SmInfoFromUe)).append("\n");
    sb.append("    unknownN1SmInfo: ").append(toIndentedString(unknownN1SmInfo)).append("\n");
    sb.append("    qosFlowsRelNotifyList: ").append(toIndentedString(qosFlowsRelNotifyList)).append("\n");
    sb.append("    qosFlowsNotifyList: ").append(toIndentedString(qosFlowsNotifyList)).append("\n");
    sb.append("    notifyList: ").append(toIndentedString(notifyList)).append("\n");
    sb.append("    epsBearerId: ").append(toIndentedString(epsBearerId)).append("\n");
    sb.append("    hoPreparationIndication: ").append(toIndentedString(hoPreparationIndication)).append("\n");
    sb.append("    revokeEbiList: ").append(toIndentedString(revokeEbiList)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    ngApCause: ").append(toIndentedString(ngApCause)).append("\n");
    sb.append("    _5gMmCauseValue: ").append(toIndentedString(_5gMmCauseValue)).append("\n");
    sb.append("    alwaysOnRequested: ").append(toIndentedString(alwaysOnRequested)).append("\n");
    sb.append("    epsInterworkingInd: ").append(toIndentedString(epsInterworkingInd)).append("\n");
    sb.append("    secondaryRatUsageReport: ").append(toIndentedString(secondaryRatUsageReport)).append("\n");
    sb.append("    secondaryRatUsageInfo: ").append(toIndentedString(secondaryRatUsageInfo)).append("\n");
    sb.append("    anTypeCanBeChanged: ").append(toIndentedString(anTypeCanBeChanged)).append("\n");
    sb.append("    maReleaseInd: ").append(toIndentedString(maReleaseInd)).append("\n");
    sb.append("    maNwUpgradeInd: ").append(toIndentedString(maNwUpgradeInd)).append("\n");
    sb.append("    maRequestInd: ").append(toIndentedString(maRequestInd)).append("\n");
    sb.append("    unavailableAccessInd: ").append(toIndentedString(unavailableAccessInd)).append("\n");
    sb.append("    psaInfo: ").append(toIndentedString(psaInfo)).append("\n");
    sb.append("    ulclBpInfo: ").append(toIndentedString(ulclBpInfo)).append("\n");
    sb.append("    n4Info: ").append(toIndentedString(n4Info)).append("\n");
    sb.append("    n4InfoExt1: ").append(toIndentedString(n4InfoExt1)).append("\n");
    sb.append("    n4InfoExt2: ").append(toIndentedString(n4InfoExt2)).append("\n");
    sb.append("    presenceInLadn: ").append(toIndentedString(presenceInLadn)).append("\n");
    sb.append("    vsmfPduSessionUri: ").append(toIndentedString(vsmfPduSessionUri)).append("\n");
    sb.append("    vsmfId: ").append(toIndentedString(vsmfId)).append("\n");
    sb.append("    vSmfServiceInstanceId: ").append(toIndentedString(vSmfServiceInstanceId)).append("\n");
    sb.append("    ismfPduSessionUri: ").append(toIndentedString(ismfPduSessionUri)).append("\n");
    sb.append("    ismfId: ").append(toIndentedString(ismfId)).append("\n");
    sb.append("    iSmfServiceInstanceId: ").append(toIndentedString(iSmfServiceInstanceId)).append("\n");
    sb.append("    dlServingPlmnRateCtl: ").append(toIndentedString(dlServingPlmnRateCtl)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    roamingChargingProfile: ").append(toIndentedString(roamingChargingProfile)).append("\n");
    sb.append("    moExpDataCounter: ").append(toIndentedString(moExpDataCounter)).append("\n");
    sb.append("    vplmnQos: ").append(toIndentedString(vplmnQos)).append("\n");
    sb.append("    securityResult: ").append(toIndentedString(securityResult)).append("\n");
    sb.append("    upSecurityInfo: ").append(toIndentedString(upSecurityInfo)).append("\n");
    sb.append("    amfNfId: ").append(toIndentedString(amfNfId)).append("\n");
    sb.append("    guami: ").append(toIndentedString(guami)).append("\n");
    sb.append("    secondaryRatUsageDataReportContainer: ").append(toIndentedString(secondaryRatUsageDataReportContainer)).append("\n");
    sb.append("    smPolicyNotifyInd: ").append(toIndentedString(smPolicyNotifyInd)).append("\n");
    sb.append("    pcfUeCallbackInfo: ").append(toIndentedString(pcfUeCallbackInfo)).append("\n");
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

