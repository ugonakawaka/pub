package aaaa;

import java.util.Objects;
import aaaa.EbiArpMapping;
import aaaa.HoState;
import aaaa.N2SmInfoType;
import aaaa.RefToBinaryData;
import aaaa.Snssai;
import aaaa.UpCnxState;
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
 * Data within Create SM Context Response
 */
@ApiModel(description = "Data within Create SM Context Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class SmContextCreatedData   {
  @JsonProperty("hSmfUri")
  private String hSmfUri;

  @JsonProperty("smfUri")
  private String smfUri;

  @JsonProperty("pduSessionId")
  private Integer pduSessionId;

  @JsonProperty("sNssai")
  private Snssai sNssai;

  @JsonProperty("upCnxState")
  private UpCnxState upCnxState;

  @JsonProperty("n2SmInfo")
  private RefToBinaryData n2SmInfo;

  @JsonProperty("n2SmInfoType")
  private N2SmInfoType n2SmInfoType;

  @JsonProperty("allocatedEbiList")
  @Valid
  private List<EbiArpMapping> allocatedEbiList = null;

  @JsonProperty("hoState")
  private HoState hoState;

  @JsonProperty("gpsi")
  private String gpsi;

  @JsonProperty("smfServiceInstanceId")
  private String smfServiceInstanceId;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("selectedSmfId")
  private UUID selectedSmfId;

  @JsonProperty("selectedOldSmfId")
  private UUID selectedOldSmfId;

  public SmContextCreatedData hSmfUri(String hSmfUri) {
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

  public SmContextCreatedData smfUri(String smfUri) {
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

  public SmContextCreatedData pduSessionId(Integer pduSessionId) {
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

  public SmContextCreatedData sNssai(Snssai sNssai) {
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

  public SmContextCreatedData upCnxState(UpCnxState upCnxState) {
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

  public SmContextCreatedData n2SmInfo(RefToBinaryData n2SmInfo) {
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

  public SmContextCreatedData n2SmInfoType(N2SmInfoType n2SmInfoType) {
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

  public SmContextCreatedData allocatedEbiList(List<EbiArpMapping> allocatedEbiList) {
    this.allocatedEbiList = allocatedEbiList;
    return this;
  }

  public SmContextCreatedData addAllocatedEbiListItem(EbiArpMapping allocatedEbiListItem) {
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

  public SmContextCreatedData hoState(HoState hoState) {
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

  public SmContextCreatedData gpsi(String gpsi) {
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

  public SmContextCreatedData smfServiceInstanceId(String smfServiceInstanceId) {
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

  public SmContextCreatedData recoveryTime(OffsetDateTime recoveryTime) {
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

  public SmContextCreatedData supportedFeatures(String supportedFeatures) {
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

  public SmContextCreatedData selectedSmfId(UUID selectedSmfId) {
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

  public SmContextCreatedData selectedOldSmfId(UUID selectedOldSmfId) {
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
    SmContextCreatedData smContextCreatedData = (SmContextCreatedData) o;
    return Objects.equals(this.hSmfUri, smContextCreatedData.hSmfUri) &&
        Objects.equals(this.smfUri, smContextCreatedData.smfUri) &&
        Objects.equals(this.pduSessionId, smContextCreatedData.pduSessionId) &&
        Objects.equals(this.sNssai, smContextCreatedData.sNssai) &&
        Objects.equals(this.upCnxState, smContextCreatedData.upCnxState) &&
        Objects.equals(this.n2SmInfo, smContextCreatedData.n2SmInfo) &&
        Objects.equals(this.n2SmInfoType, smContextCreatedData.n2SmInfoType) &&
        Objects.equals(this.allocatedEbiList, smContextCreatedData.allocatedEbiList) &&
        Objects.equals(this.hoState, smContextCreatedData.hoState) &&
        Objects.equals(this.gpsi, smContextCreatedData.gpsi) &&
        Objects.equals(this.smfServiceInstanceId, smContextCreatedData.smfServiceInstanceId) &&
        Objects.equals(this.recoveryTime, smContextCreatedData.recoveryTime) &&
        Objects.equals(this.supportedFeatures, smContextCreatedData.supportedFeatures) &&
        Objects.equals(this.selectedSmfId, smContextCreatedData.selectedSmfId) &&
        Objects.equals(this.selectedOldSmfId, smContextCreatedData.selectedOldSmfId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hSmfUri, smfUri, pduSessionId, sNssai, upCnxState, n2SmInfo, n2SmInfoType, allocatedEbiList, hoState, gpsi, smfServiceInstanceId, recoveryTime, supportedFeatures, selectedSmfId, selectedOldSmfId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextCreatedData {\n");
    
    sb.append("    hSmfUri: ").append(toIndentedString(hSmfUri)).append("\n");
    sb.append("    smfUri: ").append(toIndentedString(smfUri)).append("\n");
    sb.append("    pduSessionId: ").append(toIndentedString(pduSessionId)).append("\n");
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    upCnxState: ").append(toIndentedString(upCnxState)).append("\n");
    sb.append("    n2SmInfo: ").append(toIndentedString(n2SmInfo)).append("\n");
    sb.append("    n2SmInfoType: ").append(toIndentedString(n2SmInfoType)).append("\n");
    sb.append("    allocatedEbiList: ").append(toIndentedString(allocatedEbiList)).append("\n");
    sb.append("    hoState: ").append(toIndentedString(hoState)).append("\n");
    sb.append("    gpsi: ").append(toIndentedString(gpsi)).append("\n");
    sb.append("    smfServiceInstanceId: ").append(toIndentedString(smfServiceInstanceId)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
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

