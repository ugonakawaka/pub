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
 * Contains Usage data information.
 */
@ApiModel(description = "Contains Usage data information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class VolumeTimedReport   {
  @JsonProperty("startTimeStamp")
  private OffsetDateTime startTimeStamp;

  @JsonProperty("endTimeStamp")
  private OffsetDateTime endTimeStamp;

  @JsonProperty("downlinkVolume")
  private Long downlinkVolume;

  @JsonProperty("uplinkVolume")
  private Long uplinkVolume;

  public VolumeTimedReport startTimeStamp(OffsetDateTime startTimeStamp) {
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

  public VolumeTimedReport endTimeStamp(OffsetDateTime endTimeStamp) {
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

  public VolumeTimedReport downlinkVolume(Long downlinkVolume) {
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

  public VolumeTimedReport uplinkVolume(Long uplinkVolume) {
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
    VolumeTimedReport volumeTimedReport = (VolumeTimedReport) o;
    return Objects.equals(this.startTimeStamp, volumeTimedReport.startTimeStamp) &&
        Objects.equals(this.endTimeStamp, volumeTimedReport.endTimeStamp) &&
        Objects.equals(this.downlinkVolume, volumeTimedReport.downlinkVolume) &&
        Objects.equals(this.uplinkVolume, volumeTimedReport.uplinkVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeStamp, endTimeStamp, downlinkVolume, uplinkVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeTimedReport {\n");
    
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

