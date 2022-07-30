package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains QoS flows usage data information.
 */
@ApiModel(description = "Contains QoS flows usage data information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class QosFlowUsageReport   {
  @JsonProperty("qfi")
  private Integer qfi;

  @JsonProperty("startTimeStamp")
  private OffsetDateTime startTimeStamp;

  @JsonProperty("endTimeStamp")
  private OffsetDateTime endTimeStamp;

  @JsonProperty("downlinkVolume")
  private Long downlinkVolume;

  @JsonProperty("uplinkVolume")
  private Long uplinkVolume;

  public QosFlowUsageReport qfi(Integer qfi) {
    this.qfi = qfi;
    return this;
  }

  /**
   * Unsigned integer identifying a QoS flow, within the range 0 to 63.
   * minimum: 0
   * maximum: 63
   * @return qfi
  */
  @ApiModelProperty(required = true, value = "Unsigned integer identifying a QoS flow, within the range 0 to 63.")
  @NotNull

@Min(0) @Max(63) 
  public Integer getQfi() {
    return qfi;
  }

  public void setQfi(Integer qfi) {
    this.qfi = qfi;
  }

  public QosFlowUsageReport startTimeStamp(OffsetDateTime startTimeStamp) {
    this.startTimeStamp = startTimeStamp;
    return this;
  }

  /**
   * Get startTimeStamp
   * @return startTimeStamp
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getStartTimeStamp() {
    return startTimeStamp;
  }

  public void setStartTimeStamp(OffsetDateTime startTimeStamp) {
    this.startTimeStamp = startTimeStamp;
  }

  public QosFlowUsageReport endTimeStamp(OffsetDateTime endTimeStamp) {
    this.endTimeStamp = endTimeStamp;
    return this;
  }

  /**
   * Get endTimeStamp
   * @return endTimeStamp
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getEndTimeStamp() {
    return endTimeStamp;
  }

  public void setEndTimeStamp(OffsetDateTime endTimeStamp) {
    this.endTimeStamp = endTimeStamp;
  }

  public QosFlowUsageReport downlinkVolume(Long downlinkVolume) {
    this.downlinkVolume = downlinkVolume;
    return this;
  }

  /**
   * string with format \"int64\" as defined in OpenAPI.
   * @return downlinkVolume
  */
  @ApiModelProperty(required = true, value = "string with format \"int64\" as defined in OpenAPI.")
  @NotNull


  public Long getDownlinkVolume() {
    return downlinkVolume;
  }

  public void setDownlinkVolume(Long downlinkVolume) {
    this.downlinkVolume = downlinkVolume;
  }

  public QosFlowUsageReport uplinkVolume(Long uplinkVolume) {
    this.uplinkVolume = uplinkVolume;
    return this;
  }

  /**
   * string with format \"int64\" as defined in OpenAPI.
   * @return uplinkVolume
  */
  @ApiModelProperty(required = true, value = "string with format \"int64\" as defined in OpenAPI.")
  @NotNull


  public Long getUplinkVolume() {
    return uplinkVolume;
  }

  public void setUplinkVolume(Long uplinkVolume) {
    this.uplinkVolume = uplinkVolume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosFlowUsageReport qosFlowUsageReport = (QosFlowUsageReport) o;
    return Objects.equals(this.qfi, qosFlowUsageReport.qfi) &&
        Objects.equals(this.startTimeStamp, qosFlowUsageReport.startTimeStamp) &&
        Objects.equals(this.endTimeStamp, qosFlowUsageReport.endTimeStamp) &&
        Objects.equals(this.downlinkVolume, qosFlowUsageReport.downlinkVolume) &&
        Objects.equals(this.uplinkVolume, qosFlowUsageReport.uplinkVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qfi, startTimeStamp, endTimeStamp, downlinkVolume, uplinkVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosFlowUsageReport {\n");
    
    sb.append("    qfi: ").append(toIndentedString(qfi)).append("\n");
    sb.append("    startTimeStamp: ").append(toIndentedString(startTimeStamp)).append("\n");
    sb.append("    endTimeStamp: ").append(toIndentedString(endTimeStamp)).append("\n");
    sb.append("    downlinkVolume: ").append(toIndentedString(downlinkVolume)).append("\n");
    sb.append("    uplinkVolume: ").append(toIndentedString(uplinkVolume)).append("\n");
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

