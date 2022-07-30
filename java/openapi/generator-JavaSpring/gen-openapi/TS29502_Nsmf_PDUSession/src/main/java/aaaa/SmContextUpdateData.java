package aaaa;

import java.util.Objects;
import aaaa.AccessType;
import aaaa.BackupAmfInfo;
import aaaa.Cause;
import aaaa.DdnFailureSubs;
import aaaa.EpsInterworkingIndication;
import aaaa.ExemptionInd;
import aaaa.Guami;
import aaaa.HoState;
import aaaa.IndirectDataForwardingTunnelInfo;
import aaaa.MaReleaseIndication;
import aaaa.MoExpDataCounter;
import aaaa.N2SmInfoType;
import aaaa.NgApCause;
import aaaa.NgRanTargetId;
import aaaa.PcfUeCallbackInfo;
import aaaa.PlmnIdNid;
import aaaa.PresenceState;
import aaaa.RatType;
import aaaa.RefToBinaryData;
import aaaa.SatelliteBackhaulCategory;
import aaaa.Snssai;
import aaaa.TraceData;
import aaaa.TunnelInfo;
import aaaa.UpCnxState;
import aaaa.UserLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Update SM Context Request
 */
@ApiModel(description = "Data within Update SM Context Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class SmContextUpdateData   {
  @JsonProperty("pei")
  private String pei;

  @JsonProperty("servingNfId")
  private UUID servingNfId;

  @JsonProperty("guami")
  private Guami guami;

  @JsonProperty("servingNetwork")
  private PlmnIdNid servingNetwork;

  @JsonProperty("backupAmfInfo")
  @Valid
  private JsonNullable<List<BackupAmfInfo>> backupAmfInfo = JsonNullable.undefined();

  @JsonProperty("anType")
  private AccessType anType;

  @JsonProperty("additionalAnType")
  private AccessType additionalAnType;

  @JsonProperty("anTypeToReactivate")
  private AccessType anTypeToReactivate;

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

  @JsonProperty("upCnxState")
  private UpCnxState upCnxState;

  @JsonProperty("hoState")
  private HoState hoState;

  @JsonProperty("toBeSwitched")
  private Boolean toBeSwitched = false;

  @JsonProperty("failedToBeSwitched")
  private Boolean failedToBeSwitched;

  @JsonProperty("n1SmMsg")
  private RefToBinaryData n1SmMsg;

  @JsonProperty("n2SmInfo")
  private RefToBinaryData n2SmInfo;

  @JsonProperty("n2SmInfoType")
  private N2SmInfoType n2SmInfoType;

  @JsonProperty("targetId")
  private NgRanTargetId targetId;

  @JsonProperty("targetServingNfId")
  private UUID targetServingNfId;

  @JsonProperty("smContextStatusUri")
  private String smContextStatusUri;

  @JsonProperty("dataForwarding")
  private Boolean dataForwarding = false;

  @JsonProperty("n9ForwardingTunnel")
  private TunnelInfo n9ForwardingTunnel;

  @JsonProperty("n9DlForwardingTnlList")
  @Valid
  private List<IndirectDataForwardingTunnelInfo> n9DlForwardingTnlList = null;

  @JsonProperty("n9UlForwardingTnlList")
  @Valid
  private List<IndirectDataForwardingTunnelInfo> n9UlForwardingTnlList = null;

  @JsonProperty("epsBearerSetup")
  @Valid
  private List<String> epsBearerSetup = null;

  @JsonProperty("revokeEbiList")
  @Valid
  private List<Integer> revokeEbiList = null;

  @JsonProperty("release")
  private Boolean release = false;

  @JsonProperty("cause")
  private Cause cause;

  @JsonProperty("ngApCause")
  private NgApCause ngApCause;

  @JsonProperty("5gMmCauseValue")
  private Integer _5gMmCauseValue;

  @JsonProperty("sNssai")
  private Snssai sNssai;

  @JsonProperty("traceData")
  private JsonNullable<TraceData> traceData = JsonNullable.undefined();

  @JsonProperty("epsInterworkingInd")
  private EpsInterworkingIndication epsInterworkingInd;

  @JsonProperty("anTypeCanBeChanged")
  private Boolean anTypeCanBeChanged = false;

  @JsonProperty("n2SmInfoExt1")
  private RefToBinaryData n2SmInfoExt1;

  @JsonProperty("n2SmInfoTypeExt1")
  private N2SmInfoType n2SmInfoTypeExt1;

  @JsonProperty("maReleaseInd")
  private MaReleaseIndication maReleaseInd;

  @JsonProperty("maNwUpgradeInd")
  private Boolean maNwUpgradeInd = false;

  @JsonProperty("maRequestInd")
  private Boolean maRequestInd = false;

  @JsonProperty("exemptionInd")
  private ExemptionInd exemptionInd;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("moExpDataCounter")
  private MoExpDataCounter moExpDataCounter;

  @JsonProperty("extendedNasSmTimerInd")
  private Boolean extendedNasSmTimerInd;

  @JsonProperty("forwardingFTeid")
  private byte[] forwardingFTeid;

  @JsonProperty("forwardingBearerContexts")
  @Valid
  private List<String> forwardingBearerContexts = null;

  @JsonProperty("ddnFailureSubs")
  private DdnFailureSubs ddnFailureSubs;

  @JsonProperty("skipN2PduSessionResRelInd")
  private Boolean skipN2PduSessionResRelInd = false;

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

  public SmContextUpdateData pei(String pei) {
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

  public SmContextUpdateData servingNfId(UUID servingNfId) {
    this.servingNfId = servingNfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return servingNfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getServingNfId() {
    return servingNfId;
  }

  public void setServingNfId(UUID servingNfId) {
    this.servingNfId = servingNfId;
  }

  public SmContextUpdateData guami(Guami guami) {
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

  public SmContextUpdateData servingNetwork(PlmnIdNid servingNetwork) {
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

  public SmContextUpdateData backupAmfInfo(List<BackupAmfInfo> backupAmfInfo) {
    this.backupAmfInfo = JsonNullable.of(backupAmfInfo);
    return this;
  }

  public SmContextUpdateData addBackupAmfInfoItem(BackupAmfInfo backupAmfInfoItem) {
    if (this.backupAmfInfo == null || !this.backupAmfInfo.isPresent()) {
      this.backupAmfInfo = JsonNullable.of(new ArrayList<>());
    }
    this.backupAmfInfo.get().add(backupAmfInfoItem);
    return this;
  }

  /**
   * Get backupAmfInfo
   * @return backupAmfInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public JsonNullable<List<BackupAmfInfo>> getBackupAmfInfo() {
    return backupAmfInfo;
  }

  public void setBackupAmfInfo(JsonNullable<List<BackupAmfInfo>> backupAmfInfo) {
    this.backupAmfInfo = backupAmfInfo;
  }

  public SmContextUpdateData anType(AccessType anType) {
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

  public SmContextUpdateData additionalAnType(AccessType additionalAnType) {
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

  public SmContextUpdateData anTypeToReactivate(AccessType anTypeToReactivate) {
    this.anTypeToReactivate = anTypeToReactivate;
    return this;
  }

  /**
   * Get anTypeToReactivate
   * @return anTypeToReactivate
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessType getAnTypeToReactivate() {
    return anTypeToReactivate;
  }

  public void setAnTypeToReactivate(AccessType anTypeToReactivate) {
    this.anTypeToReactivate = anTypeToReactivate;
  }

  public SmContextUpdateData ratType(RatType ratType) {
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

  public SmContextUpdateData presenceInLadn(PresenceState presenceInLadn) {
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

  public SmContextUpdateData ueLocation(UserLocation ueLocation) {
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

  public SmContextUpdateData ueTimeZone(String ueTimeZone) {
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

  public SmContextUpdateData addUeLocation(UserLocation addUeLocation) {
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

  public SmContextUpdateData upCnxState(UpCnxState upCnxState) {
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

  public SmContextUpdateData hoState(HoState hoState) {
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

  public SmContextUpdateData toBeSwitched(Boolean toBeSwitched) {
    this.toBeSwitched = toBeSwitched;
    return this;
  }

  /**
   * Get toBeSwitched
   * @return toBeSwitched
  */
  @ApiModelProperty(value = "")


  public Boolean getToBeSwitched() {
    return toBeSwitched;
  }

  public void setToBeSwitched(Boolean toBeSwitched) {
    this.toBeSwitched = toBeSwitched;
  }

  public SmContextUpdateData failedToBeSwitched(Boolean failedToBeSwitched) {
    this.failedToBeSwitched = failedToBeSwitched;
    return this;
  }

  /**
   * Get failedToBeSwitched
   * @return failedToBeSwitched
  */
  @ApiModelProperty(value = "")


  public Boolean getFailedToBeSwitched() {
    return failedToBeSwitched;
  }

  public void setFailedToBeSwitched(Boolean failedToBeSwitched) {
    this.failedToBeSwitched = failedToBeSwitched;
  }

  public SmContextUpdateData n1SmMsg(RefToBinaryData n1SmMsg) {
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

  public SmContextUpdateData n2SmInfo(RefToBinaryData n2SmInfo) {
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

  public SmContextUpdateData n2SmInfoType(N2SmInfoType n2SmInfoType) {
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

  public SmContextUpdateData targetId(NgRanTargetId targetId) {
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

  public SmContextUpdateData targetServingNfId(UUID targetServingNfId) {
    this.targetServingNfId = targetServingNfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return targetServingNfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getTargetServingNfId() {
    return targetServingNfId;
  }

  public void setTargetServingNfId(UUID targetServingNfId) {
    this.targetServingNfId = targetServingNfId;
  }

  public SmContextUpdateData smContextStatusUri(String smContextStatusUri) {
    this.smContextStatusUri = smContextStatusUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return smContextStatusUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getSmContextStatusUri() {
    return smContextStatusUri;
  }

  public void setSmContextStatusUri(String smContextStatusUri) {
    this.smContextStatusUri = smContextStatusUri;
  }

  public SmContextUpdateData dataForwarding(Boolean dataForwarding) {
    this.dataForwarding = dataForwarding;
    return this;
  }

  /**
   * Get dataForwarding
   * @return dataForwarding
  */
  @ApiModelProperty(value = "")


  public Boolean getDataForwarding() {
    return dataForwarding;
  }

  public void setDataForwarding(Boolean dataForwarding) {
    this.dataForwarding = dataForwarding;
  }

  public SmContextUpdateData n9ForwardingTunnel(TunnelInfo n9ForwardingTunnel) {
    this.n9ForwardingTunnel = n9ForwardingTunnel;
    return this;
  }

  /**
   * Get n9ForwardingTunnel
   * @return n9ForwardingTunnel
  */
  @ApiModelProperty(value = "")

  @Valid

  public TunnelInfo getN9ForwardingTunnel() {
    return n9ForwardingTunnel;
  }

  public void setN9ForwardingTunnel(TunnelInfo n9ForwardingTunnel) {
    this.n9ForwardingTunnel = n9ForwardingTunnel;
  }

  public SmContextUpdateData n9DlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n9DlForwardingTnlList) {
    this.n9DlForwardingTnlList = n9DlForwardingTnlList;
    return this;
  }

  public SmContextUpdateData addN9DlForwardingTnlListItem(IndirectDataForwardingTunnelInfo n9DlForwardingTnlListItem) {
    if (this.n9DlForwardingTnlList == null) {
      this.n9DlForwardingTnlList = new ArrayList<>();
    }
    this.n9DlForwardingTnlList.add(n9DlForwardingTnlListItem);
    return this;
  }

  /**
   * Get n9DlForwardingTnlList
   * @return n9DlForwardingTnlList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<IndirectDataForwardingTunnelInfo> getN9DlForwardingTnlList() {
    return n9DlForwardingTnlList;
  }

  public void setN9DlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n9DlForwardingTnlList) {
    this.n9DlForwardingTnlList = n9DlForwardingTnlList;
  }

  public SmContextUpdateData n9UlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n9UlForwardingTnlList) {
    this.n9UlForwardingTnlList = n9UlForwardingTnlList;
    return this;
  }

  public SmContextUpdateData addN9UlForwardingTnlListItem(IndirectDataForwardingTunnelInfo n9UlForwardingTnlListItem) {
    if (this.n9UlForwardingTnlList == null) {
      this.n9UlForwardingTnlList = new ArrayList<>();
    }
    this.n9UlForwardingTnlList.add(n9UlForwardingTnlListItem);
    return this;
  }

  /**
   * Get n9UlForwardingTnlList
   * @return n9UlForwardingTnlList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<IndirectDataForwardingTunnelInfo> getN9UlForwardingTnlList() {
    return n9UlForwardingTnlList;
  }

  public void setN9UlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n9UlForwardingTnlList) {
    this.n9UlForwardingTnlList = n9UlForwardingTnlList;
  }

  public SmContextUpdateData epsBearerSetup(List<String> epsBearerSetup) {
    this.epsBearerSetup = epsBearerSetup;
    return this;
  }

  public SmContextUpdateData addEpsBearerSetupItem(String epsBearerSetupItem) {
    if (this.epsBearerSetup == null) {
      this.epsBearerSetup = new ArrayList<>();
    }
    this.epsBearerSetup.add(epsBearerSetupItem);
    return this;
  }

  /**
   * Get epsBearerSetup
   * @return epsBearerSetup
  */
  @ApiModelProperty(value = "")

@Size(min=0) 
  public List<String> getEpsBearerSetup() {
    return epsBearerSetup;
  }

  public void setEpsBearerSetup(List<String> epsBearerSetup) {
    this.epsBearerSetup = epsBearerSetup;
  }

  public SmContextUpdateData revokeEbiList(List<Integer> revokeEbiList) {
    this.revokeEbiList = revokeEbiList;
    return this;
  }

  public SmContextUpdateData addRevokeEbiListItem(Integer revokeEbiListItem) {
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

  public SmContextUpdateData release(Boolean release) {
    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
  */
  @ApiModelProperty(value = "")


  public Boolean getRelease() {
    return release;
  }

  public void setRelease(Boolean release) {
    this.release = release;
  }

  public SmContextUpdateData cause(Cause cause) {
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

  public SmContextUpdateData ngApCause(NgApCause ngApCause) {
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

  public SmContextUpdateData _5gMmCauseValue(Integer _5gMmCauseValue) {
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

  public SmContextUpdateData sNssai(Snssai sNssai) {
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

  public SmContextUpdateData traceData(TraceData traceData) {
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

  public SmContextUpdateData epsInterworkingInd(EpsInterworkingIndication epsInterworkingInd) {
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

  public SmContextUpdateData anTypeCanBeChanged(Boolean anTypeCanBeChanged) {
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

  public SmContextUpdateData n2SmInfoExt1(RefToBinaryData n2SmInfoExt1) {
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

  public SmContextUpdateData n2SmInfoTypeExt1(N2SmInfoType n2SmInfoTypeExt1) {
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

  public SmContextUpdateData maReleaseInd(MaReleaseIndication maReleaseInd) {
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

  public SmContextUpdateData maNwUpgradeInd(Boolean maNwUpgradeInd) {
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

  public SmContextUpdateData maRequestInd(Boolean maRequestInd) {
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

  public SmContextUpdateData exemptionInd(ExemptionInd exemptionInd) {
    this.exemptionInd = exemptionInd;
    return this;
  }

  /**
   * Get exemptionInd
   * @return exemptionInd
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExemptionInd getExemptionInd() {
    return exemptionInd;
  }

  public void setExemptionInd(ExemptionInd exemptionInd) {
    this.exemptionInd = exemptionInd;
  }

  public SmContextUpdateData supportedFeatures(String supportedFeatures) {
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

  public SmContextUpdateData moExpDataCounter(MoExpDataCounter moExpDataCounter) {
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

  public SmContextUpdateData extendedNasSmTimerInd(Boolean extendedNasSmTimerInd) {
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

  public SmContextUpdateData forwardingFTeid(byte[] forwardingFTeid) {
    this.forwardingFTeid = forwardingFTeid;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return forwardingFTeid
  */
  @ApiModelProperty(value = "string with format \"bytes\" as defined in OpenAPI")


  public byte[] getForwardingFTeid() {
    return forwardingFTeid;
  }

  public void setForwardingFTeid(byte[] forwardingFTeid) {
    this.forwardingFTeid = forwardingFTeid;
  }

  public SmContextUpdateData forwardingBearerContexts(List<String> forwardingBearerContexts) {
    this.forwardingBearerContexts = forwardingBearerContexts;
    return this;
  }

  public SmContextUpdateData addForwardingBearerContextsItem(String forwardingBearerContextsItem) {
    if (this.forwardingBearerContexts == null) {
      this.forwardingBearerContexts = new ArrayList<>();
    }
    this.forwardingBearerContexts.add(forwardingBearerContextsItem);
    return this;
  }

  /**
   * Get forwardingBearerContexts
   * @return forwardingBearerContexts
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getForwardingBearerContexts() {
    return forwardingBearerContexts;
  }

  public void setForwardingBearerContexts(List<String> forwardingBearerContexts) {
    this.forwardingBearerContexts = forwardingBearerContexts;
  }

  public SmContextUpdateData ddnFailureSubs(DdnFailureSubs ddnFailureSubs) {
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

  public SmContextUpdateData skipN2PduSessionResRelInd(Boolean skipN2PduSessionResRelInd) {
    this.skipN2PduSessionResRelInd = skipN2PduSessionResRelInd;
    return this;
  }

  /**
   * Get skipN2PduSessionResRelInd
   * @return skipN2PduSessionResRelInd
  */
  @ApiModelProperty(value = "")


  public Boolean getSkipN2PduSessionResRelInd() {
    return skipN2PduSessionResRelInd;
  }

  public void setSkipN2PduSessionResRelInd(Boolean skipN2PduSessionResRelInd) {
    this.skipN2PduSessionResRelInd = skipN2PduSessionResRelInd;
  }

  public SmContextUpdateData secondaryRatUsageDataReportContainer(List<byte[]> secondaryRatUsageDataReportContainer) {
    this.secondaryRatUsageDataReportContainer = secondaryRatUsageDataReportContainer;
    return this;
  }

  public SmContextUpdateData addSecondaryRatUsageDataReportContainerItem(byte[] secondaryRatUsageDataReportContainerItem) {
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

  public SmContextUpdateData smPolicyNotifyInd(SmPolicyNotifyIndEnum smPolicyNotifyInd) {
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

  public SmContextUpdateData pcfUeCallbackInfo(PcfUeCallbackInfo pcfUeCallbackInfo) {
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

  public SmContextUpdateData satelliteBackhaulCat(SatelliteBackhaulCategory satelliteBackhaulCat) {
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
    SmContextUpdateData smContextUpdateData = (SmContextUpdateData) o;
    return Objects.equals(this.pei, smContextUpdateData.pei) &&
        Objects.equals(this.servingNfId, smContextUpdateData.servingNfId) &&
        Objects.equals(this.guami, smContextUpdateData.guami) &&
        Objects.equals(this.servingNetwork, smContextUpdateData.servingNetwork) &&
        Objects.equals(this.backupAmfInfo, smContextUpdateData.backupAmfInfo) &&
        Objects.equals(this.anType, smContextUpdateData.anType) &&
        Objects.equals(this.additionalAnType, smContextUpdateData.additionalAnType) &&
        Objects.equals(this.anTypeToReactivate, smContextUpdateData.anTypeToReactivate) &&
        Objects.equals(this.ratType, smContextUpdateData.ratType) &&
        Objects.equals(this.presenceInLadn, smContextUpdateData.presenceInLadn) &&
        Objects.equals(this.ueLocation, smContextUpdateData.ueLocation) &&
        Objects.equals(this.ueTimeZone, smContextUpdateData.ueTimeZone) &&
        Objects.equals(this.addUeLocation, smContextUpdateData.addUeLocation) &&
        Objects.equals(this.upCnxState, smContextUpdateData.upCnxState) &&
        Objects.equals(this.hoState, smContextUpdateData.hoState) &&
        Objects.equals(this.toBeSwitched, smContextUpdateData.toBeSwitched) &&
        Objects.equals(this.failedToBeSwitched, smContextUpdateData.failedToBeSwitched) &&
        Objects.equals(this.n1SmMsg, smContextUpdateData.n1SmMsg) &&
        Objects.equals(this.n2SmInfo, smContextUpdateData.n2SmInfo) &&
        Objects.equals(this.n2SmInfoType, smContextUpdateData.n2SmInfoType) &&
        Objects.equals(this.targetId, smContextUpdateData.targetId) &&
        Objects.equals(this.targetServingNfId, smContextUpdateData.targetServingNfId) &&
        Objects.equals(this.smContextStatusUri, smContextUpdateData.smContextStatusUri) &&
        Objects.equals(this.dataForwarding, smContextUpdateData.dataForwarding) &&
        Objects.equals(this.n9ForwardingTunnel, smContextUpdateData.n9ForwardingTunnel) &&
        Objects.equals(this.n9DlForwardingTnlList, smContextUpdateData.n9DlForwardingTnlList) &&
        Objects.equals(this.n9UlForwardingTnlList, smContextUpdateData.n9UlForwardingTnlList) &&
        Objects.equals(this.epsBearerSetup, smContextUpdateData.epsBearerSetup) &&
        Objects.equals(this.revokeEbiList, smContextUpdateData.revokeEbiList) &&
        Objects.equals(this.release, smContextUpdateData.release) &&
        Objects.equals(this.cause, smContextUpdateData.cause) &&
        Objects.equals(this.ngApCause, smContextUpdateData.ngApCause) &&
        Objects.equals(this._5gMmCauseValue, smContextUpdateData._5gMmCauseValue) &&
        Objects.equals(this.sNssai, smContextUpdateData.sNssai) &&
        Objects.equals(this.traceData, smContextUpdateData.traceData) &&
        Objects.equals(this.epsInterworkingInd, smContextUpdateData.epsInterworkingInd) &&
        Objects.equals(this.anTypeCanBeChanged, smContextUpdateData.anTypeCanBeChanged) &&
        Objects.equals(this.n2SmInfoExt1, smContextUpdateData.n2SmInfoExt1) &&
        Objects.equals(this.n2SmInfoTypeExt1, smContextUpdateData.n2SmInfoTypeExt1) &&
        Objects.equals(this.maReleaseInd, smContextUpdateData.maReleaseInd) &&
        Objects.equals(this.maNwUpgradeInd, smContextUpdateData.maNwUpgradeInd) &&
        Objects.equals(this.maRequestInd, smContextUpdateData.maRequestInd) &&
        Objects.equals(this.exemptionInd, smContextUpdateData.exemptionInd) &&
        Objects.equals(this.supportedFeatures, smContextUpdateData.supportedFeatures) &&
        Objects.equals(this.moExpDataCounter, smContextUpdateData.moExpDataCounter) &&
        Objects.equals(this.extendedNasSmTimerInd, smContextUpdateData.extendedNasSmTimerInd) &&
        Arrays.equals(this.forwardingFTeid, smContextUpdateData.forwardingFTeid) &&
        Objects.equals(this.forwardingBearerContexts, smContextUpdateData.forwardingBearerContexts) &&
        Objects.equals(this.ddnFailureSubs, smContextUpdateData.ddnFailureSubs) &&
        Objects.equals(this.skipN2PduSessionResRelInd, smContextUpdateData.skipN2PduSessionResRelInd) &&
        Objects.equals(this.secondaryRatUsageDataReportContainer, smContextUpdateData.secondaryRatUsageDataReportContainer) &&
        Objects.equals(this.smPolicyNotifyInd, smContextUpdateData.smPolicyNotifyInd) &&
        Objects.equals(this.pcfUeCallbackInfo, smContextUpdateData.pcfUeCallbackInfo) &&
        Objects.equals(this.satelliteBackhaulCat, smContextUpdateData.satelliteBackhaulCat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pei, servingNfId, guami, servingNetwork, backupAmfInfo, anType, additionalAnType, anTypeToReactivate, ratType, presenceInLadn, ueLocation, ueTimeZone, addUeLocation, upCnxState, hoState, toBeSwitched, failedToBeSwitched, n1SmMsg, n2SmInfo, n2SmInfoType, targetId, targetServingNfId, smContextStatusUri, dataForwarding, n9ForwardingTunnel, n9DlForwardingTnlList, n9UlForwardingTnlList, epsBearerSetup, revokeEbiList, release, cause, ngApCause, _5gMmCauseValue, sNssai, traceData, epsInterworkingInd, anTypeCanBeChanged, n2SmInfoExt1, n2SmInfoTypeExt1, maReleaseInd, maNwUpgradeInd, maRequestInd, exemptionInd, supportedFeatures, moExpDataCounter, extendedNasSmTimerInd, Arrays.hashCode(forwardingFTeid), forwardingBearerContexts, ddnFailureSubs, skipN2PduSessionResRelInd, secondaryRatUsageDataReportContainer, smPolicyNotifyInd, pcfUeCallbackInfo, satelliteBackhaulCat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextUpdateData {\n");
    
    sb.append("    pei: ").append(toIndentedString(pei)).append("\n");
    sb.append("    servingNfId: ").append(toIndentedString(servingNfId)).append("\n");
    sb.append("    guami: ").append(toIndentedString(guami)).append("\n");
    sb.append("    servingNetwork: ").append(toIndentedString(servingNetwork)).append("\n");
    sb.append("    backupAmfInfo: ").append(toIndentedString(backupAmfInfo)).append("\n");
    sb.append("    anType: ").append(toIndentedString(anType)).append("\n");
    sb.append("    additionalAnType: ").append(toIndentedString(additionalAnType)).append("\n");
    sb.append("    anTypeToReactivate: ").append(toIndentedString(anTypeToReactivate)).append("\n");
    sb.append("    ratType: ").append(toIndentedString(ratType)).append("\n");
    sb.append("    presenceInLadn: ").append(toIndentedString(presenceInLadn)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
    sb.append("    ueTimeZone: ").append(toIndentedString(ueTimeZone)).append("\n");
    sb.append("    addUeLocation: ").append(toIndentedString(addUeLocation)).append("\n");
    sb.append("    upCnxState: ").append(toIndentedString(upCnxState)).append("\n");
    sb.append("    hoState: ").append(toIndentedString(hoState)).append("\n");
    sb.append("    toBeSwitched: ").append(toIndentedString(toBeSwitched)).append("\n");
    sb.append("    failedToBeSwitched: ").append(toIndentedString(failedToBeSwitched)).append("\n");
    sb.append("    n1SmMsg: ").append(toIndentedString(n1SmMsg)).append("\n");
    sb.append("    n2SmInfo: ").append(toIndentedString(n2SmInfo)).append("\n");
    sb.append("    n2SmInfoType: ").append(toIndentedString(n2SmInfoType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetServingNfId: ").append(toIndentedString(targetServingNfId)).append("\n");
    sb.append("    smContextStatusUri: ").append(toIndentedString(smContextStatusUri)).append("\n");
    sb.append("    dataForwarding: ").append(toIndentedString(dataForwarding)).append("\n");
    sb.append("    n9ForwardingTunnel: ").append(toIndentedString(n9ForwardingTunnel)).append("\n");
    sb.append("    n9DlForwardingTnlList: ").append(toIndentedString(n9DlForwardingTnlList)).append("\n");
    sb.append("    n9UlForwardingTnlList: ").append(toIndentedString(n9UlForwardingTnlList)).append("\n");
    sb.append("    epsBearerSetup: ").append(toIndentedString(epsBearerSetup)).append("\n");
    sb.append("    revokeEbiList: ").append(toIndentedString(revokeEbiList)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    ngApCause: ").append(toIndentedString(ngApCause)).append("\n");
    sb.append("    _5gMmCauseValue: ").append(toIndentedString(_5gMmCauseValue)).append("\n");
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    traceData: ").append(toIndentedString(traceData)).append("\n");
    sb.append("    epsInterworkingInd: ").append(toIndentedString(epsInterworkingInd)).append("\n");
    sb.append("    anTypeCanBeChanged: ").append(toIndentedString(anTypeCanBeChanged)).append("\n");
    sb.append("    n2SmInfoExt1: ").append(toIndentedString(n2SmInfoExt1)).append("\n");
    sb.append("    n2SmInfoTypeExt1: ").append(toIndentedString(n2SmInfoTypeExt1)).append("\n");
    sb.append("    maReleaseInd: ").append(toIndentedString(maReleaseInd)).append("\n");
    sb.append("    maNwUpgradeInd: ").append(toIndentedString(maNwUpgradeInd)).append("\n");
    sb.append("    maRequestInd: ").append(toIndentedString(maRequestInd)).append("\n");
    sb.append("    exemptionInd: ").append(toIndentedString(exemptionInd)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    moExpDataCounter: ").append(toIndentedString(moExpDataCounter)).append("\n");
    sb.append("    extendedNasSmTimerInd: ").append(toIndentedString(extendedNasSmTimerInd)).append("\n");
    sb.append("    forwardingFTeid: ").append(toIndentedString(forwardingFTeid)).append("\n");
    sb.append("    forwardingBearerContexts: ").append(toIndentedString(forwardingBearerContexts)).append("\n");
    sb.append("    ddnFailureSubs: ").append(toIndentedString(ddnFailureSubs)).append("\n");
    sb.append("    skipN2PduSessionResRelInd: ").append(toIndentedString(skipN2PduSessionResRelInd)).append("\n");
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

