package aaaa;

import java.util.Objects;
import aaaa.Ambr;
import aaaa.EpsBearerInfo;
import aaaa.EpsPdnCnxInfo;
import aaaa.MaxIntegrityProtectedDataRate;
import aaaa.N4Information;
import aaaa.QosFlowSetupItem;
import aaaa.RefToBinaryData;
import aaaa.RoamingChargingProfile;
import aaaa.UpSecurity;
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
 * Data within Update Response from H-SMF, or from SMF to I-SMF
 */
@ApiModel(description = "Data within Update Response from H-SMF, or from SMF to I-SMF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class HsmfUpdatedData   {
  @JsonProperty("n1SmInfoToUe")
  private RefToBinaryData n1SmInfoToUe;

  @JsonProperty("n4Info")
  private N4Information n4Info;

  @JsonProperty("n4InfoExt1")
  private N4Information n4InfoExt1;

  @JsonProperty("n4InfoExt2")
  private N4Information n4InfoExt2;

  @JsonProperty("dnaiList")
  @Valid
  private List<String> dnaiList = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("roamingChargingProfile")
  private RoamingChargingProfile roamingChargingProfile;

  @JsonProperty("upSecurity")
  private UpSecurity upSecurity;

  @JsonProperty("maxIntegrityProtectedDataRateUl")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl;

  @JsonProperty("maxIntegrityProtectedDataRateDl")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl;

  @JsonProperty("ipv6MultiHomingInd")
  private Boolean ipv6MultiHomingInd = false;

  @JsonProperty("qosFlowsSetupList")
  @Valid
  private List<QosFlowSetupItem> qosFlowsSetupList = null;

  @JsonProperty("sessionAmbr")
  private Ambr sessionAmbr;

  @JsonProperty("epsPdnCnxInfo")
  private EpsPdnCnxInfo epsPdnCnxInfo;

  @JsonProperty("epsBearerInfo")
  @Valid
  private List<EpsBearerInfo> epsBearerInfo = null;

  @JsonProperty("pti")
  private Integer pti;

  public HsmfUpdatedData n1SmInfoToUe(RefToBinaryData n1SmInfoToUe) {
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

  public HsmfUpdatedData n4Info(N4Information n4Info) {
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

  public HsmfUpdatedData n4InfoExt1(N4Information n4InfoExt1) {
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

  public HsmfUpdatedData n4InfoExt2(N4Information n4InfoExt2) {
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

  public HsmfUpdatedData dnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public HsmfUpdatedData addDnaiListItem(String dnaiListItem) {
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

  public HsmfUpdatedData supportedFeatures(String supportedFeatures) {
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

  public HsmfUpdatedData roamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
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

  public HsmfUpdatedData upSecurity(UpSecurity upSecurity) {
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

  public HsmfUpdatedData maxIntegrityProtectedDataRateUl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl) {
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

  public HsmfUpdatedData maxIntegrityProtectedDataRateDl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl) {
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

  public HsmfUpdatedData ipv6MultiHomingInd(Boolean ipv6MultiHomingInd) {
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

  public HsmfUpdatedData qosFlowsSetupList(List<QosFlowSetupItem> qosFlowsSetupList) {
    this.qosFlowsSetupList = qosFlowsSetupList;
    return this;
  }

  public HsmfUpdatedData addQosFlowsSetupListItem(QosFlowSetupItem qosFlowsSetupListItem) {
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

  public HsmfUpdatedData sessionAmbr(Ambr sessionAmbr) {
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

  public HsmfUpdatedData epsPdnCnxInfo(EpsPdnCnxInfo epsPdnCnxInfo) {
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

  public HsmfUpdatedData epsBearerInfo(List<EpsBearerInfo> epsBearerInfo) {
    this.epsBearerInfo = epsBearerInfo;
    return this;
  }

  public HsmfUpdatedData addEpsBearerInfoItem(EpsBearerInfo epsBearerInfoItem) {
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

  public HsmfUpdatedData pti(Integer pti) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HsmfUpdatedData hsmfUpdatedData = (HsmfUpdatedData) o;
    return Objects.equals(this.n1SmInfoToUe, hsmfUpdatedData.n1SmInfoToUe) &&
        Objects.equals(this.n4Info, hsmfUpdatedData.n4Info) &&
        Objects.equals(this.n4InfoExt1, hsmfUpdatedData.n4InfoExt1) &&
        Objects.equals(this.n4InfoExt2, hsmfUpdatedData.n4InfoExt2) &&
        Objects.equals(this.dnaiList, hsmfUpdatedData.dnaiList) &&
        Objects.equals(this.supportedFeatures, hsmfUpdatedData.supportedFeatures) &&
        Objects.equals(this.roamingChargingProfile, hsmfUpdatedData.roamingChargingProfile) &&
        Objects.equals(this.upSecurity, hsmfUpdatedData.upSecurity) &&
        Objects.equals(this.maxIntegrityProtectedDataRateUl, hsmfUpdatedData.maxIntegrityProtectedDataRateUl) &&
        Objects.equals(this.maxIntegrityProtectedDataRateDl, hsmfUpdatedData.maxIntegrityProtectedDataRateDl) &&
        Objects.equals(this.ipv6MultiHomingInd, hsmfUpdatedData.ipv6MultiHomingInd) &&
        Objects.equals(this.qosFlowsSetupList, hsmfUpdatedData.qosFlowsSetupList) &&
        Objects.equals(this.sessionAmbr, hsmfUpdatedData.sessionAmbr) &&
        Objects.equals(this.epsPdnCnxInfo, hsmfUpdatedData.epsPdnCnxInfo) &&
        Objects.equals(this.epsBearerInfo, hsmfUpdatedData.epsBearerInfo) &&
        Objects.equals(this.pti, hsmfUpdatedData.pti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(n1SmInfoToUe, n4Info, n4InfoExt1, n4InfoExt2, dnaiList, supportedFeatures, roamingChargingProfile, upSecurity, maxIntegrityProtectedDataRateUl, maxIntegrityProtectedDataRateDl, ipv6MultiHomingInd, qosFlowsSetupList, sessionAmbr, epsPdnCnxInfo, epsBearerInfo, pti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HsmfUpdatedData {\n");
    
    sb.append("    n1SmInfoToUe: ").append(toIndentedString(n1SmInfoToUe)).append("\n");
    sb.append("    n4Info: ").append(toIndentedString(n4Info)).append("\n");
    sb.append("    n4InfoExt1: ").append(toIndentedString(n4InfoExt1)).append("\n");
    sb.append("    n4InfoExt2: ").append(toIndentedString(n4InfoExt2)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    roamingChargingProfile: ").append(toIndentedString(roamingChargingProfile)).append("\n");
    sb.append("    upSecurity: ").append(toIndentedString(upSecurity)).append("\n");
    sb.append("    maxIntegrityProtectedDataRateUl: ").append(toIndentedString(maxIntegrityProtectedDataRateUl)).append("\n");
    sb.append("    maxIntegrityProtectedDataRateDl: ").append(toIndentedString(maxIntegrityProtectedDataRateDl)).append("\n");
    sb.append("    ipv6MultiHomingInd: ").append(toIndentedString(ipv6MultiHomingInd)).append("\n");
    sb.append("    qosFlowsSetupList: ").append(toIndentedString(qosFlowsSetupList)).append("\n");
    sb.append("    sessionAmbr: ").append(toIndentedString(sessionAmbr)).append("\n");
    sb.append("    epsPdnCnxInfo: ").append(toIndentedString(epsPdnCnxInfo)).append("\n");
    sb.append("    epsBearerInfo: ").append(toIndentedString(epsBearerInfo)).append("\n");
    sb.append("    pti: ").append(toIndentedString(pti)).append("\n");
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

