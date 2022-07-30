package aaaa;

import java.util.Objects;
import aaaa.AfCoordinationInfo;
import aaaa.ApnRateStatus;
import aaaa.SmContext;
import aaaa.SmallDataRateStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Retrieve SM Context Response
 */
@ApiModel(description = "Data within Retrieve SM Context Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class SmContextRetrievedData   {
  @JsonProperty("ueEpsPdnConnection")
  private String ueEpsPdnConnection;

  @JsonProperty("smContext")
  private SmContext smContext;

  @JsonProperty("smallDataRateStatus")
  private SmallDataRateStatus smallDataRateStatus;

  @JsonProperty("apnRateStatus")
  private ApnRateStatus apnRateStatus;

  @JsonProperty("dlDataWaitingInd")
  private Boolean dlDataWaitingInd = false;

  @JsonProperty("afCoordinationInfo")
  private AfCoordinationInfo afCoordinationInfo;

  public SmContextRetrievedData ueEpsPdnConnection(String ueEpsPdnConnection) {
    this.ueEpsPdnConnection = ueEpsPdnConnection;
    return this;
  }

  /**
   * UE EPS PDN Connection container from SMF to AMF
   * @return ueEpsPdnConnection
  */
  @ApiModelProperty(required = true, value = "UE EPS PDN Connection container from SMF to AMF")
  @NotNull


  public String getUeEpsPdnConnection() {
    return ueEpsPdnConnection;
  }

  public void setUeEpsPdnConnection(String ueEpsPdnConnection) {
    this.ueEpsPdnConnection = ueEpsPdnConnection;
  }

  public SmContextRetrievedData smContext(SmContext smContext) {
    this.smContext = smContext;
    return this;
  }

  /**
   * Get smContext
   * @return smContext
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmContext getSmContext() {
    return smContext;
  }

  public void setSmContext(SmContext smContext) {
    this.smContext = smContext;
  }

  public SmContextRetrievedData smallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
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

  public SmContextRetrievedData apnRateStatus(ApnRateStatus apnRateStatus) {
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

  public SmContextRetrievedData dlDataWaitingInd(Boolean dlDataWaitingInd) {
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

  public SmContextRetrievedData afCoordinationInfo(AfCoordinationInfo afCoordinationInfo) {
    this.afCoordinationInfo = afCoordinationInfo;
    return this;
  }

  /**
   * Get afCoordinationInfo
   * @return afCoordinationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AfCoordinationInfo getAfCoordinationInfo() {
    return afCoordinationInfo;
  }

  public void setAfCoordinationInfo(AfCoordinationInfo afCoordinationInfo) {
    this.afCoordinationInfo = afCoordinationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContextRetrievedData smContextRetrievedData = (SmContextRetrievedData) o;
    return Objects.equals(this.ueEpsPdnConnection, smContextRetrievedData.ueEpsPdnConnection) &&
        Objects.equals(this.smContext, smContextRetrievedData.smContext) &&
        Objects.equals(this.smallDataRateStatus, smContextRetrievedData.smallDataRateStatus) &&
        Objects.equals(this.apnRateStatus, smContextRetrievedData.apnRateStatus) &&
        Objects.equals(this.dlDataWaitingInd, smContextRetrievedData.dlDataWaitingInd) &&
        Objects.equals(this.afCoordinationInfo, smContextRetrievedData.afCoordinationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ueEpsPdnConnection, smContext, smallDataRateStatus, apnRateStatus, dlDataWaitingInd, afCoordinationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextRetrievedData {\n");
    
    sb.append("    ueEpsPdnConnection: ").append(toIndentedString(ueEpsPdnConnection)).append("\n");
    sb.append("    smContext: ").append(toIndentedString(smContext)).append("\n");
    sb.append("    smallDataRateStatus: ").append(toIndentedString(smallDataRateStatus)).append("\n");
    sb.append("    apnRateStatus: ").append(toIndentedString(apnRateStatus)).append("\n");
    sb.append("    dlDataWaitingInd: ").append(toIndentedString(dlDataWaitingInd)).append("\n");
    sb.append("    afCoordinationInfo: ").append(toIndentedString(afCoordinationInfo)).append("\n");
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

