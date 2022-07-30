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
 * It indicates theSmall Data Rate Control Status
 */
@ApiModel(description = "It indicates theSmall Data Rate Control Status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class SmallDataRateStatus   {
  @JsonProperty("remainPacketsUl")
  private Integer remainPacketsUl;

  @JsonProperty("remainPacketsDl")
  private Integer remainPacketsDl;

  @JsonProperty("validityTime")
  private OffsetDateTime validityTime;

  @JsonProperty("remainExReportsUl")
  private Integer remainExReportsUl;

  @JsonProperty("remainExReportsDl")
  private Integer remainExReportsDl;

  public SmallDataRateStatus remainPacketsUl(Integer remainPacketsUl) {
    this.remainPacketsUl = remainPacketsUl;
    return this;
  }

  /**
   * When present, it shall contain the number of packets the UE is allowed to send uplink in the given time unit for the given PDU session (see clause 5.31.14.3 of 3GPP TS 23.501
   * minimum: 0
   * @return remainPacketsUl
  */
  @ApiModelProperty(value = "When present, it shall contain the number of packets the UE is allowed to send uplink in the given time unit for the given PDU session (see clause 5.31.14.3 of 3GPP TS 23.501")

@Min(0)
  public Integer getRemainPacketsUl() {
    return remainPacketsUl;
  }

  public void setRemainPacketsUl(Integer remainPacketsUl) {
    this.remainPacketsUl = remainPacketsUl;
  }

  public SmallDataRateStatus remainPacketsDl(Integer remainPacketsDl) {
    this.remainPacketsDl = remainPacketsDl;
    return this;
  }

  /**
   * When present it shall contain the number of packets the AF is allowed to send downlink in the given time unit for the given PDU session (see clause 5.31.14.3 of 3GPP TS 23.501
   * minimum: 0
   * @return remainPacketsDl
  */
  @ApiModelProperty(value = "When present it shall contain the number of packets the AF is allowed to send downlink in the given time unit for the given PDU session (see clause 5.31.14.3 of 3GPP TS 23.501")

@Min(0)
  public Integer getRemainPacketsDl() {
    return remainPacketsDl;
  }

  public void setRemainPacketsDl(Integer remainPacketsDl) {
    this.remainPacketsDl = remainPacketsDl;
  }

  public SmallDataRateStatus validityTime(OffsetDateTime validityTime) {
    this.validityTime = validityTime;
    return this;
  }

  /**
   * Get validityTime
   * @return validityTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getValidityTime() {
    return validityTime;
  }

  public void setValidityTime(OffsetDateTime validityTime) {
    this.validityTime = validityTime;
  }

  public SmallDataRateStatus remainExReportsUl(Integer remainExReportsUl) {
    this.remainExReportsUl = remainExReportsUl;
    return this;
  }

  /**
   * When present, it shall indicate number of additional exception reports the UE is allowed to send uplink in the given time unit for  the given PDU session (see clause 5.31.14.3 of 3GPP TS 23.501.
   * minimum: 0
   * @return remainExReportsUl
  */
  @ApiModelProperty(value = "When present, it shall indicate number of additional exception reports the UE is allowed to send uplink in the given time unit for  the given PDU session (see clause 5.31.14.3 of 3GPP TS 23.501.")

@Min(0)
  public Integer getRemainExReportsUl() {
    return remainExReportsUl;
  }

  public void setRemainExReportsUl(Integer remainExReportsUl) {
    this.remainExReportsUl = remainExReportsUl;
  }

  public SmallDataRateStatus remainExReportsDl(Integer remainExReportsDl) {
    this.remainExReportsDl = remainExReportsDl;
    return this;
  }

  /**
   * When present, it shall indicate number of additional exception reports the AF is allowed to send downlink in the given time unit for the given PDU session (see clause 5.31.14.3 in 3GPP TS 23.501
   * minimum: 0
   * @return remainExReportsDl
  */
  @ApiModelProperty(value = "When present, it shall indicate number of additional exception reports the AF is allowed to send downlink in the given time unit for the given PDU session (see clause 5.31.14.3 in 3GPP TS 23.501")

@Min(0)
  public Integer getRemainExReportsDl() {
    return remainExReportsDl;
  }

  public void setRemainExReportsDl(Integer remainExReportsDl) {
    this.remainExReportsDl = remainExReportsDl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmallDataRateStatus smallDataRateStatus = (SmallDataRateStatus) o;
    return Objects.equals(this.remainPacketsUl, smallDataRateStatus.remainPacketsUl) &&
        Objects.equals(this.remainPacketsDl, smallDataRateStatus.remainPacketsDl) &&
        Objects.equals(this.validityTime, smallDataRateStatus.validityTime) &&
        Objects.equals(this.remainExReportsUl, smallDataRateStatus.remainExReportsUl) &&
        Objects.equals(this.remainExReportsDl, smallDataRateStatus.remainExReportsDl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainPacketsUl, remainPacketsDl, validityTime, remainExReportsUl, remainExReportsDl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmallDataRateStatus {\n");
    
    sb.append("    remainPacketsUl: ").append(toIndentedString(remainPacketsUl)).append("\n");
    sb.append("    remainPacketsDl: ").append(toIndentedString(remainPacketsDl)).append("\n");
    sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
    sb.append("    remainExReportsUl: ").append(toIndentedString(remainExReportsUl)).append("\n");
    sb.append("    remainExReportsDl: ").append(toIndentedString(remainExReportsDl)).append("\n");
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

