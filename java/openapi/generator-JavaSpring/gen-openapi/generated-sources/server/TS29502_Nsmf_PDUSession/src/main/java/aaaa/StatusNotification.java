package aaaa;

import java.util.Objects;
import aaaa.ApnRateStatus;
import aaaa.SmallDataRateStatus;
import aaaa.StatusInfo;
import aaaa.TargetDnaiInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Notify Status Request
 */
@ApiModel(description = "Data within Notify Status Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class StatusNotification   {
  @JsonProperty("statusInfo")
  private StatusInfo statusInfo;

  @JsonProperty("smallDataRateStatus")
  private SmallDataRateStatus smallDataRateStatus;

  @JsonProperty("apnRateStatus")
  private ApnRateStatus apnRateStatus;

  @JsonProperty("targetDnaiInfo")
  private TargetDnaiInfo targetDnaiInfo;

  @JsonProperty("oldPduSessionRef")
  private String oldPduSessionRef;

  public StatusNotification statusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Get statusInfo
   * @return statusInfo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public StatusInfo getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }

  public StatusNotification smallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
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

  public StatusNotification apnRateStatus(ApnRateStatus apnRateStatus) {
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

  public StatusNotification targetDnaiInfo(TargetDnaiInfo targetDnaiInfo) {
    this.targetDnaiInfo = targetDnaiInfo;
    return this;
  }

  /**
   * Get targetDnaiInfo
   * @return targetDnaiInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TargetDnaiInfo getTargetDnaiInfo() {
    return targetDnaiInfo;
  }

  public void setTargetDnaiInfo(TargetDnaiInfo targetDnaiInfo) {
    this.targetDnaiInfo = targetDnaiInfo;
  }

  public StatusNotification oldPduSessionRef(String oldPduSessionRef) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusNotification statusNotification = (StatusNotification) o;
    return Objects.equals(this.statusInfo, statusNotification.statusInfo) &&
        Objects.equals(this.smallDataRateStatus, statusNotification.smallDataRateStatus) &&
        Objects.equals(this.apnRateStatus, statusNotification.apnRateStatus) &&
        Objects.equals(this.targetDnaiInfo, statusNotification.targetDnaiInfo) &&
        Objects.equals(this.oldPduSessionRef, statusNotification.oldPduSessionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusInfo, smallDataRateStatus, apnRateStatus, targetDnaiInfo, oldPduSessionRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusNotification {\n");
    
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    smallDataRateStatus: ").append(toIndentedString(smallDataRateStatus)).append("\n");
    sb.append("    apnRateStatus: ").append(toIndentedString(apnRateStatus)).append("\n");
    sb.append("    targetDnaiInfo: ").append(toIndentedString(targetDnaiInfo)).append("\n");
    sb.append("    oldPduSessionRef: ").append(toIndentedString(oldPduSessionRef)).append("\n");
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

