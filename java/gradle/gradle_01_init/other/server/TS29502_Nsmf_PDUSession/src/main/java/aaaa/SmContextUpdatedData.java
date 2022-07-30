package aaaa;

import java.util.Objects;
import aaaa.Cause;
import aaaa.EbiArpMapping;
import aaaa.HoState;
import aaaa.IndirectDataForwardingTunnelInfo;
import aaaa.N2SmInfoType;
import aaaa.RefToBinaryData;
import aaaa.UpCnxState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Data within Update SM Context Response
 */
@ApiModel(description = "Data within Update SM Context Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class SmContextUpdatedData   {
  @JsonProperty("upCnxState")
  private UpCnxState upCnxState;

  @JsonProperty("hoState")
  private HoState hoState;

  @JsonProperty("releaseEbiList")
  @Valid
  private List<Integer> releaseEbiList = null;

  @JsonProperty("allocatedEbiList")
  @Valid
  private List<EbiArpMapping> allocatedEbiList = null;

  @JsonProperty("modifiedEbiList")
  @Valid
  private List<EbiArpMapping> modifiedEbiList = null;

  @JsonProperty("n1SmMsg")
  private RefToBinaryData n1SmMsg;

  @JsonProperty("n2SmInfo")
  private RefToBinaryData n2SmInfo;

  @JsonProperty("n2SmInfoType")
  private N2SmInfoType n2SmInfoType;

  @JsonProperty("epsBearerSetup")
  @Valid
  private List<String> epsBearerSetup = null;

  @JsonProperty("dataForwarding")
  private Boolean dataForwarding;

  @JsonProperty("n3DlForwardingTnlList")
  @Valid
  private List<IndirectDataForwardingTunnelInfo> n3DlForwardingTnlList = null;

  @JsonProperty("n3UlForwardingTnlList")
  @Valid
  private List<IndirectDataForwardingTunnelInfo> n3UlForwardingTnlList = null;

  @JsonProperty("cause")
  private Cause cause;

  @JsonProperty("maAcceptedInd")
  private Boolean maAcceptedInd = false;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("forwardingFTeid")
  private byte[] forwardingFTeid;

  @JsonProperty("forwardingBearerContexts")
  @Valid
  private List<String> forwardingBearerContexts = null;

  @JsonProperty("selectedSmfId")
  private UUID selectedSmfId;

  @JsonProperty("selectedOldSmfId")
  private UUID selectedOldSmfId;

  public SmContextUpdatedData upCnxState(UpCnxState upCnxState) {
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

  public SmContextUpdatedData hoState(HoState hoState) {
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

  public SmContextUpdatedData releaseEbiList(List<Integer> releaseEbiList) {
    this.releaseEbiList = releaseEbiList;
    return this;
  }

  public SmContextUpdatedData addReleaseEbiListItem(Integer releaseEbiListItem) {
    if (this.releaseEbiList == null) {
      this.releaseEbiList = new ArrayList<>();
    }
    this.releaseEbiList.add(releaseEbiListItem);
    return this;
  }

  /**
   * Get releaseEbiList
   * @return releaseEbiList
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<Integer> getReleaseEbiList() {
    return releaseEbiList;
  }

  public void setReleaseEbiList(List<Integer> releaseEbiList) {
    this.releaseEbiList = releaseEbiList;
  }

  public SmContextUpdatedData allocatedEbiList(List<EbiArpMapping> allocatedEbiList) {
    this.allocatedEbiList = allocatedEbiList;
    return this;
  }

  public SmContextUpdatedData addAllocatedEbiListItem(EbiArpMapping allocatedEbiListItem) {
    if (this.allocatedEbiList == null) {
      this.allocatedEbiList = new ArrayList<>();
    }
    this.allocatedEbiList.add(allocatedEbiListItem);
    return this;
  }

  /**
   * Get allocatedEbiList
   * @return allocatedEbiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<EbiArpMapping> getAllocatedEbiList() {
    return allocatedEbiList;
  }

  public void setAllocatedEbiList(List<EbiArpMapping> allocatedEbiList) {
    this.allocatedEbiList = allocatedEbiList;
  }

  public SmContextUpdatedData modifiedEbiList(List<EbiArpMapping> modifiedEbiList) {
    this.modifiedEbiList = modifiedEbiList;
    return this;
  }

  public SmContextUpdatedData addModifiedEbiListItem(EbiArpMapping modifiedEbiListItem) {
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

  public SmContextUpdatedData n1SmMsg(RefToBinaryData n1SmMsg) {
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

  public SmContextUpdatedData n2SmInfo(RefToBinaryData n2SmInfo) {
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

  public SmContextUpdatedData n2SmInfoType(N2SmInfoType n2SmInfoType) {
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

  public SmContextUpdatedData epsBearerSetup(List<String> epsBearerSetup) {
    this.epsBearerSetup = epsBearerSetup;
    return this;
  }

  public SmContextUpdatedData addEpsBearerSetupItem(String epsBearerSetupItem) {
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

@Size(min=1) 
  public List<String> getEpsBearerSetup() {
    return epsBearerSetup;
  }

  public void setEpsBearerSetup(List<String> epsBearerSetup) {
    this.epsBearerSetup = epsBearerSetup;
  }

  public SmContextUpdatedData dataForwarding(Boolean dataForwarding) {
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

  public SmContextUpdatedData n3DlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n3DlForwardingTnlList) {
    this.n3DlForwardingTnlList = n3DlForwardingTnlList;
    return this;
  }

  public SmContextUpdatedData addN3DlForwardingTnlListItem(IndirectDataForwardingTunnelInfo n3DlForwardingTnlListItem) {
    if (this.n3DlForwardingTnlList == null) {
      this.n3DlForwardingTnlList = new ArrayList<>();
    }
    this.n3DlForwardingTnlList.add(n3DlForwardingTnlListItem);
    return this;
  }

  /**
   * Get n3DlForwardingTnlList
   * @return n3DlForwardingTnlList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<IndirectDataForwardingTunnelInfo> getN3DlForwardingTnlList() {
    return n3DlForwardingTnlList;
  }

  public void setN3DlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n3DlForwardingTnlList) {
    this.n3DlForwardingTnlList = n3DlForwardingTnlList;
  }

  public SmContextUpdatedData n3UlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n3UlForwardingTnlList) {
    this.n3UlForwardingTnlList = n3UlForwardingTnlList;
    return this;
  }

  public SmContextUpdatedData addN3UlForwardingTnlListItem(IndirectDataForwardingTunnelInfo n3UlForwardingTnlListItem) {
    if (this.n3UlForwardingTnlList == null) {
      this.n3UlForwardingTnlList = new ArrayList<>();
    }
    this.n3UlForwardingTnlList.add(n3UlForwardingTnlListItem);
    return this;
  }

  /**
   * Get n3UlForwardingTnlList
   * @return n3UlForwardingTnlList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<IndirectDataForwardingTunnelInfo> getN3UlForwardingTnlList() {
    return n3UlForwardingTnlList;
  }

  public void setN3UlForwardingTnlList(List<IndirectDataForwardingTunnelInfo> n3UlForwardingTnlList) {
    this.n3UlForwardingTnlList = n3UlForwardingTnlList;
  }

  public SmContextUpdatedData cause(Cause cause) {
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

  public SmContextUpdatedData maAcceptedInd(Boolean maAcceptedInd) {
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

  public SmContextUpdatedData supportedFeatures(String supportedFeatures) {
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

  public SmContextUpdatedData forwardingFTeid(byte[] forwardingFTeid) {
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

  public SmContextUpdatedData forwardingBearerContexts(List<String> forwardingBearerContexts) {
    this.forwardingBearerContexts = forwardingBearerContexts;
    return this;
  }

  public SmContextUpdatedData addForwardingBearerContextsItem(String forwardingBearerContextsItem) {
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

  public SmContextUpdatedData selectedSmfId(UUID selectedSmfId) {
    this.selectedSmfId = selectedSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return selectedSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getSelectedSmfId() {
    return selectedSmfId;
  }

  public void setSelectedSmfId(UUID selectedSmfId) {
    this.selectedSmfId = selectedSmfId;
  }

  public SmContextUpdatedData selectedOldSmfId(UUID selectedOldSmfId) {
    this.selectedOldSmfId = selectedOldSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return selectedOldSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getSelectedOldSmfId() {
    return selectedOldSmfId;
  }

  public void setSelectedOldSmfId(UUID selectedOldSmfId) {
    this.selectedOldSmfId = selectedOldSmfId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContextUpdatedData smContextUpdatedData = (SmContextUpdatedData) o;
    return Objects.equals(this.upCnxState, smContextUpdatedData.upCnxState) &&
        Objects.equals(this.hoState, smContextUpdatedData.hoState) &&
        Objects.equals(this.releaseEbiList, smContextUpdatedData.releaseEbiList) &&
        Objects.equals(this.allocatedEbiList, smContextUpdatedData.allocatedEbiList) &&
        Objects.equals(this.modifiedEbiList, smContextUpdatedData.modifiedEbiList) &&
        Objects.equals(this.n1SmMsg, smContextUpdatedData.n1SmMsg) &&
        Objects.equals(this.n2SmInfo, smContextUpdatedData.n2SmInfo) &&
        Objects.equals(this.n2SmInfoType, smContextUpdatedData.n2SmInfoType) &&
        Objects.equals(this.epsBearerSetup, smContextUpdatedData.epsBearerSetup) &&
        Objects.equals(this.dataForwarding, smContextUpdatedData.dataForwarding) &&
        Objects.equals(this.n3DlForwardingTnlList, smContextUpdatedData.n3DlForwardingTnlList) &&
        Objects.equals(this.n3UlForwardingTnlList, smContextUpdatedData.n3UlForwardingTnlList) &&
        Objects.equals(this.cause, smContextUpdatedData.cause) &&
        Objects.equals(this.maAcceptedInd, smContextUpdatedData.maAcceptedInd) &&
        Objects.equals(this.supportedFeatures, smContextUpdatedData.supportedFeatures) &&
        Arrays.equals(this.forwardingFTeid, smContextUpdatedData.forwardingFTeid) &&
        Objects.equals(this.forwardingBearerContexts, smContextUpdatedData.forwardingBearerContexts) &&
        Objects.equals(this.selectedSmfId, smContextUpdatedData.selectedSmfId) &&
        Objects.equals(this.selectedOldSmfId, smContextUpdatedData.selectedOldSmfId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upCnxState, hoState, releaseEbiList, allocatedEbiList, modifiedEbiList, n1SmMsg, n2SmInfo, n2SmInfoType, epsBearerSetup, dataForwarding, n3DlForwardingTnlList, n3UlForwardingTnlList, cause, maAcceptedInd, supportedFeatures, Arrays.hashCode(forwardingFTeid), forwardingBearerContexts, selectedSmfId, selectedOldSmfId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextUpdatedData {\n");
    
    sb.append("    upCnxState: ").append(toIndentedString(upCnxState)).append("\n");
    sb.append("    hoState: ").append(toIndentedString(hoState)).append("\n");
    sb.append("    releaseEbiList: ").append(toIndentedString(releaseEbiList)).append("\n");
    sb.append("    allocatedEbiList: ").append(toIndentedString(allocatedEbiList)).append("\n");
    sb.append("    modifiedEbiList: ").append(toIndentedString(modifiedEbiList)).append("\n");
    sb.append("    n1SmMsg: ").append(toIndentedString(n1SmMsg)).append("\n");
    sb.append("    n2SmInfo: ").append(toIndentedString(n2SmInfo)).append("\n");
    sb.append("    n2SmInfoType: ").append(toIndentedString(n2SmInfoType)).append("\n");
    sb.append("    epsBearerSetup: ").append(toIndentedString(epsBearerSetup)).append("\n");
    sb.append("    dataForwarding: ").append(toIndentedString(dataForwarding)).append("\n");
    sb.append("    n3DlForwardingTnlList: ").append(toIndentedString(n3DlForwardingTnlList)).append("\n");
    sb.append("    n3UlForwardingTnlList: ").append(toIndentedString(n3UlForwardingTnlList)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    maAcceptedInd: ").append(toIndentedString(maAcceptedInd)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    forwardingFTeid: ").append(toIndentedString(forwardingFTeid)).append("\n");
    sb.append("    forwardingBearerContexts: ").append(toIndentedString(forwardingBearerContexts)).append("\n");
    sb.append("    selectedSmfId: ").append(toIndentedString(selectedSmfId)).append("\n");
    sb.append("    selectedOldSmfId: ").append(toIndentedString(selectedOldSmfId)).append("\n");
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

