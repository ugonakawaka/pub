package aaaa;

import java.util.Objects;
import aaaa.Ambr;
import aaaa.Arp;
import aaaa.Cause;
import aaaa.EbiArpMapping;
import aaaa.EpsBearerInfo;
import aaaa.EpsPdnCnxInfo;
import aaaa.MaReleaseIndication;
import aaaa.N4Information;
import aaaa.QosFlowAddModifyRequestItem;
import aaaa.QosFlowReleaseRequestItem;
import aaaa.QosMonitoringInfo;
import aaaa.RefToBinaryData;
import aaaa.RequestIndication;
import aaaa.TunnelInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Update Request towards V-SMF, or from SMF to I-SMF
 */
@ApiModel(description = "Data within Update Request towards V-SMF, or from SMF to I-SMF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class VsmfUpdateData   {
  @JsonProperty("requestIndication")
  private RequestIndication requestIndication;

  @JsonProperty("sessionAmbr")
  private Ambr sessionAmbr;

  @JsonProperty("qosFlowsAddModRequestList")
  @Valid
  private List<QosFlowAddModifyRequestItem> qosFlowsAddModRequestList = null;

  @JsonProperty("qosFlowsRelRequestList")
  @Valid
  private List<QosFlowReleaseRequestItem> qosFlowsRelRequestList = null;

  @JsonProperty("epsBearerInfo")
  @Valid
  private List<EpsBearerInfo> epsBearerInfo = null;

  @JsonProperty("assignEbiList")
  @Valid
  private List<Arp> assignEbiList = null;

  @JsonProperty("revokeEbiList")
  @Valid
  private List<Integer> revokeEbiList = null;

  @JsonProperty("modifiedEbiList")
  @Valid
  private List<EbiArpMapping> modifiedEbiList = null;

  @JsonProperty("pti")
  private Integer pti;

  @JsonProperty("n1SmInfoToUe")
  private RefToBinaryData n1SmInfoToUe;

  @JsonProperty("alwaysOnGranted")
  private Boolean alwaysOnGranted = false;

  @JsonProperty("hsmfPduSessionUri")
  private String hsmfPduSessionUri;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("cause")
  private Cause cause;

  @JsonProperty("n1smCause")
  private String n1smCause;

  @JsonProperty("backOffTimer")
  private Integer backOffTimer;

  @JsonProperty("maReleaseInd")
  private MaReleaseIndication maReleaseInd;

  @JsonProperty("maAcceptedInd")
  private Boolean maAcceptedInd = false;

  @JsonProperty("additionalCnTunnelInfo")
  private TunnelInfo additionalCnTunnelInfo;

  @JsonProperty("dnaiList")
  @Valid
  private List<String> dnaiList = null;

  @JsonProperty("n4Info")
  private N4Information n4Info;

  @JsonProperty("n4InfoExt1")
  private N4Information n4InfoExt1;

  @JsonProperty("n4InfoExt2")
  private N4Information n4InfoExt2;

  @JsonProperty("n4InfoExt3")
  private N4Information n4InfoExt3;

  @JsonProperty("smallDataRateControlEnabled")
  private Boolean smallDataRateControlEnabled;

  @JsonProperty("qosMonitoringInfo")
  private QosMonitoringInfo qosMonitoringInfo;

  @JsonProperty("epsPdnCnxInfo")
  private EpsPdnCnxInfo epsPdnCnxInfo;

  public VsmfUpdateData requestIndication(RequestIndication requestIndication) {
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

  public VsmfUpdateData sessionAmbr(Ambr sessionAmbr) {
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

  public VsmfUpdateData qosFlowsAddModRequestList(List<QosFlowAddModifyRequestItem> qosFlowsAddModRequestList) {
    this.qosFlowsAddModRequestList = qosFlowsAddModRequestList;
    return this;
  }

  public VsmfUpdateData addQosFlowsAddModRequestListItem(QosFlowAddModifyRequestItem qosFlowsAddModRequestListItem) {
    if (this.qosFlowsAddModRequestList == null) {
      this.qosFlowsAddModRequestList = new ArrayList<>();
    }
    this.qosFlowsAddModRequestList.add(qosFlowsAddModRequestListItem);
    return this;
  }

  /**
   * Get qosFlowsAddModRequestList
   * @return qosFlowsAddModRequestList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowAddModifyRequestItem> getQosFlowsAddModRequestList() {
    return qosFlowsAddModRequestList;
  }

  public void setQosFlowsAddModRequestList(List<QosFlowAddModifyRequestItem> qosFlowsAddModRequestList) {
    this.qosFlowsAddModRequestList = qosFlowsAddModRequestList;
  }

  public VsmfUpdateData qosFlowsRelRequestList(List<QosFlowReleaseRequestItem> qosFlowsRelRequestList) {
    this.qosFlowsRelRequestList = qosFlowsRelRequestList;
    return this;
  }

  public VsmfUpdateData addQosFlowsRelRequestListItem(QosFlowReleaseRequestItem qosFlowsRelRequestListItem) {
    if (this.qosFlowsRelRequestList == null) {
      this.qosFlowsRelRequestList = new ArrayList<>();
    }
    this.qosFlowsRelRequestList.add(qosFlowsRelRequestListItem);
    return this;
  }

  /**
   * Get qosFlowsRelRequestList
   * @return qosFlowsRelRequestList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowReleaseRequestItem> getQosFlowsRelRequestList() {
    return qosFlowsRelRequestList;
  }

  public void setQosFlowsRelRequestList(List<QosFlowReleaseRequestItem> qosFlowsRelRequestList) {
    this.qosFlowsRelRequestList = qosFlowsRelRequestList;
  }

  public VsmfUpdateData epsBearerInfo(List<EpsBearerInfo> epsBearerInfo) {
    this.epsBearerInfo = epsBearerInfo;
    return this;
  }

  public VsmfUpdateData addEpsBearerInfoItem(EpsBearerInfo epsBearerInfoItem) {
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

  public VsmfUpdateData assignEbiList(List<Arp> assignEbiList) {
    this.assignEbiList = assignEbiList;
    return this;
  }

  public VsmfUpdateData addAssignEbiListItem(Arp assignEbiListItem) {
    if (this.assignEbiList == null) {
      this.assignEbiList = new ArrayList<>();
    }
    this.assignEbiList.add(assignEbiListItem);
    return this;
  }

  /**
   * Get assignEbiList
   * @return assignEbiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<Arp> getAssignEbiList() {
    return assignEbiList;
  }

  public void setAssignEbiList(List<Arp> assignEbiList) {
    this.assignEbiList = assignEbiList;
  }

  public VsmfUpdateData revokeEbiList(List<Integer> revokeEbiList) {
    this.revokeEbiList = revokeEbiList;
    return this;
  }

  public VsmfUpdateData addRevokeEbiListItem(Integer revokeEbiListItem) {
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

  public VsmfUpdateData modifiedEbiList(List<EbiArpMapping> modifiedEbiList) {
    this.modifiedEbiList = modifiedEbiList;
    return this;
  }

  public VsmfUpdateData addModifiedEbiListItem(EbiArpMapping modifiedEbiListItem) {
    if (this.modifiedEbiList == null) {
      this.modifiedEbiList = new ArrayList<>();
    }
    this.modifiedEbiList.add(modifiedEbiListItem);
    return this;
  }

  /**
   * Get modifiedEbiList
   * @return modifiedEbiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<EbiArpMapping> getModifiedEbiList() {
    return modifiedEbiList;
  }

  public void setModifiedEbiList(List<EbiArpMapping> modifiedEbiList) {
    this.modifiedEbiList = modifiedEbiList;
  }

  public VsmfUpdateData pti(Integer pti) {
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

  public VsmfUpdateData n1SmInfoToUe(RefToBinaryData n1SmInfoToUe) {
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

  public VsmfUpdateData alwaysOnGranted(Boolean alwaysOnGranted) {
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

  public VsmfUpdateData hsmfPduSessionUri(String hsmfPduSessionUri) {
    this.hsmfPduSessionUri = hsmfPduSessionUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return hsmfPduSessionUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getHsmfPduSessionUri() {
    return hsmfPduSessionUri;
  }

  public void setHsmfPduSessionUri(String hsmfPduSessionUri) {
    this.hsmfPduSessionUri = hsmfPduSessionUri;
  }

  public VsmfUpdateData supportedFeatures(String supportedFeatures) {
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

  public VsmfUpdateData cause(Cause cause) {
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

  public VsmfUpdateData n1smCause(String n1smCause) {
    this.n1smCause = n1smCause;
    return this;
  }

  /**
   * Get n1smCause
   * @return n1smCause
  */
  @ApiModelProperty(value = "")


  public String getN1smCause() {
    return n1smCause;
  }

  public void setN1smCause(String n1smCause) {
    this.n1smCause = n1smCause;
  }

  public VsmfUpdateData backOffTimer(Integer backOffTimer) {
    this.backOffTimer = backOffTimer;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return backOffTimer
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getBackOffTimer() {
    return backOffTimer;
  }

  public void setBackOffTimer(Integer backOffTimer) {
    this.backOffTimer = backOffTimer;
  }

  public VsmfUpdateData maReleaseInd(MaReleaseIndication maReleaseInd) {
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

  public VsmfUpdateData maAcceptedInd(Boolean maAcceptedInd) {
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

  public VsmfUpdateData additionalCnTunnelInfo(TunnelInfo additionalCnTunnelInfo) {
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

  public VsmfUpdateData dnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public VsmfUpdateData addDnaiListItem(String dnaiListItem) {
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


  public List<String> getDnaiList() {
    return dnaiList;
  }

  public void setDnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
  }

  public VsmfUpdateData n4Info(N4Information n4Info) {
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

  public VsmfUpdateData n4InfoExt1(N4Information n4InfoExt1) {
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

  public VsmfUpdateData n4InfoExt2(N4Information n4InfoExt2) {
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

  public VsmfUpdateData n4InfoExt3(N4Information n4InfoExt3) {
    this.n4InfoExt3 = n4InfoExt3;
    return this;
  }

  /**
   * Get n4InfoExt3
   * @return n4InfoExt3
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt3() {
    return n4InfoExt3;
  }

  public void setN4InfoExt3(N4Information n4InfoExt3) {
    this.n4InfoExt3 = n4InfoExt3;
  }

  public VsmfUpdateData smallDataRateControlEnabled(Boolean smallDataRateControlEnabled) {
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

  public VsmfUpdateData qosMonitoringInfo(QosMonitoringInfo qosMonitoringInfo) {
    this.qosMonitoringInfo = qosMonitoringInfo;
    return this;
  }

  /**
   * Get qosMonitoringInfo
   * @return qosMonitoringInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosMonitoringInfo getQosMonitoringInfo() {
    return qosMonitoringInfo;
  }

  public void setQosMonitoringInfo(QosMonitoringInfo qosMonitoringInfo) {
    this.qosMonitoringInfo = qosMonitoringInfo;
  }

  public VsmfUpdateData epsPdnCnxInfo(EpsPdnCnxInfo epsPdnCnxInfo) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsmfUpdateData vsmfUpdateData = (VsmfUpdateData) o;
    return Objects.equals(this.requestIndication, vsmfUpdateData.requestIndication) &&
        Objects.equals(this.sessionAmbr, vsmfUpdateData.sessionAmbr) &&
        Objects.equals(this.qosFlowsAddModRequestList, vsmfUpdateData.qosFlowsAddModRequestList) &&
        Objects.equals(this.qosFlowsRelRequestList, vsmfUpdateData.qosFlowsRelRequestList) &&
        Objects.equals(this.epsBearerInfo, vsmfUpdateData.epsBearerInfo) &&
        Objects.equals(this.assignEbiList, vsmfUpdateData.assignEbiList) &&
        Objects.equals(this.revokeEbiList, vsmfUpdateData.revokeEbiList) &&
        Objects.equals(this.modifiedEbiList, vsmfUpdateData.modifiedEbiList) &&
        Objects.equals(this.pti, vsmfUpdateData.pti) &&
        Objects.equals(this.n1SmInfoToUe, vsmfUpdateData.n1SmInfoToUe) &&
        Objects.equals(this.alwaysOnGranted, vsmfUpdateData.alwaysOnGranted) &&
        Objects.equals(this.hsmfPduSessionUri, vsmfUpdateData.hsmfPduSessionUri) &&
        Objects.equals(this.supportedFeatures, vsmfUpdateData.supportedFeatures) &&
        Objects.equals(this.cause, vsmfUpdateData.cause) &&
        Objects.equals(this.n1smCause, vsmfUpdateData.n1smCause) &&
        Objects.equals(this.backOffTimer, vsmfUpdateData.backOffTimer) &&
        Objects.equals(this.maReleaseInd, vsmfUpdateData.maReleaseInd) &&
        Objects.equals(this.maAcceptedInd, vsmfUpdateData.maAcceptedInd) &&
        Objects.equals(this.additionalCnTunnelInfo, vsmfUpdateData.additionalCnTunnelInfo) &&
        Objects.equals(this.dnaiList, vsmfUpdateData.dnaiList) &&
        Objects.equals(this.n4Info, vsmfUpdateData.n4Info) &&
        Objects.equals(this.n4InfoExt1, vsmfUpdateData.n4InfoExt1) &&
        Objects.equals(this.n4InfoExt2, vsmfUpdateData.n4InfoExt2) &&
        Objects.equals(this.n4InfoExt3, vsmfUpdateData.n4InfoExt3) &&
        Objects.equals(this.smallDataRateControlEnabled, vsmfUpdateData.smallDataRateControlEnabled) &&
        Objects.equals(this.qosMonitoringInfo, vsmfUpdateData.qosMonitoringInfo) &&
        Objects.equals(this.epsPdnCnxInfo, vsmfUpdateData.epsPdnCnxInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestIndication, sessionAmbr, qosFlowsAddModRequestList, qosFlowsRelRequestList, epsBearerInfo, assignEbiList, revokeEbiList, modifiedEbiList, pti, n1SmInfoToUe, alwaysOnGranted, hsmfPduSessionUri, supportedFeatures, cause, n1smCause, backOffTimer, maReleaseInd, maAcceptedInd, additionalCnTunnelInfo, dnaiList, n4Info, n4InfoExt1, n4InfoExt2, n4InfoExt3, smallDataRateControlEnabled, qosMonitoringInfo, epsPdnCnxInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsmfUpdateData {\n");
    
    sb.append("    requestIndication: ").append(toIndentedString(requestIndication)).append("\n");
    sb.append("    sessionAmbr: ").append(toIndentedString(sessionAmbr)).append("\n");
    sb.append("    qosFlowsAddModRequestList: ").append(toIndentedString(qosFlowsAddModRequestList)).append("\n");
    sb.append("    qosFlowsRelRequestList: ").append(toIndentedString(qosFlowsRelRequestList)).append("\n");
    sb.append("    epsBearerInfo: ").append(toIndentedString(epsBearerInfo)).append("\n");
    sb.append("    assignEbiList: ").append(toIndentedString(assignEbiList)).append("\n");
    sb.append("    revokeEbiList: ").append(toIndentedString(revokeEbiList)).append("\n");
    sb.append("    modifiedEbiList: ").append(toIndentedString(modifiedEbiList)).append("\n");
    sb.append("    pti: ").append(toIndentedString(pti)).append("\n");
    sb.append("    n1SmInfoToUe: ").append(toIndentedString(n1SmInfoToUe)).append("\n");
    sb.append("    alwaysOnGranted: ").append(toIndentedString(alwaysOnGranted)).append("\n");
    sb.append("    hsmfPduSessionUri: ").append(toIndentedString(hsmfPduSessionUri)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    n1smCause: ").append(toIndentedString(n1smCause)).append("\n");
    sb.append("    backOffTimer: ").append(toIndentedString(backOffTimer)).append("\n");
    sb.append("    maReleaseInd: ").append(toIndentedString(maReleaseInd)).append("\n");
    sb.append("    maAcceptedInd: ").append(toIndentedString(maAcceptedInd)).append("\n");
    sb.append("    additionalCnTunnelInfo: ").append(toIndentedString(additionalCnTunnelInfo)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
    sb.append("    n4Info: ").append(toIndentedString(n4Info)).append("\n");
    sb.append("    n4InfoExt1: ").append(toIndentedString(n4InfoExt1)).append("\n");
    sb.append("    n4InfoExt2: ").append(toIndentedString(n4InfoExt2)).append("\n");
    sb.append("    n4InfoExt3: ").append(toIndentedString(n4InfoExt3)).append("\n");
    sb.append("    smallDataRateControlEnabled: ").append(toIndentedString(smallDataRateControlEnabled)).append("\n");
    sb.append("    qosMonitoringInfo: ").append(toIndentedString(qosMonitoringInfo)).append("\n");
    sb.append("    epsPdnCnxInfo: ").append(toIndentedString(epsPdnCnxInfo)).append("\n");
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

