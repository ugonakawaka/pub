package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * It indicates the QoS Characteristics for a standardized or pre-configured 5QI for downlink and uplink.
 */
@ApiModel(description = "It indicates the QoS Characteristics for a standardized or pre-configured 5QI for downlink and uplink.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class NonDynamic5Qi   {
  @JsonProperty("priorityLevel")
  private Integer priorityLevel;

  @JsonProperty("averWindow")
  private Integer averWindow = 2000;

  @JsonProperty("maxDataBurstVol")
  private Integer maxDataBurstVol;

  @JsonProperty("extMaxDataBurstVol")
  private Integer extMaxDataBurstVol;

  @JsonProperty("cnPacketDelayBudgetDl")
  private Integer cnPacketDelayBudgetDl;

  @JsonProperty("cnPacketDelayBudgetUl")
  private Integer cnPacketDelayBudgetUl;

  public NonDynamic5Qi priorityLevel(Integer priorityLevel) {
    this.priorityLevel = priorityLevel;
    return this;
  }

  /**
   * Unsigned integer indicating the 5QI Priority Level (see clauses 5.7.3.3 and 5.7.4 of 3GPP TS 23.501, within the range 1 to 127.Values are ordered in decreasing order of priority, i.e. with 1 as the highest priority and 127 as the lowest priority.
   * minimum: 1
   * maximum: 127
   * @return priorityLevel
  */
  @ApiModelProperty(value = "Unsigned integer indicating the 5QI Priority Level (see clauses 5.7.3.3 and 5.7.4 of 3GPP TS 23.501, within the range 1 to 127.Values are ordered in decreasing order of priority, i.e. with 1 as the highest priority and 127 as the lowest priority.")

@Min(1) @Max(127) 
  public Integer getPriorityLevel() {
    return priorityLevel;
  }

  public void setPriorityLevel(Integer priorityLevel) {
    this.priorityLevel = priorityLevel;
  }

  public NonDynamic5Qi averWindow(Integer averWindow) {
    this.averWindow = averWindow;
    return this;
  }

  /**
   * Unsigned integer indicating Averaging Window (see clause 5.7.3.6 and 5.7.4 of 3GPP TS 23.501), expressed in milliseconds.
   * minimum: 1
   * maximum: 4095
   * @return averWindow
  */
  @ApiModelProperty(value = "Unsigned integer indicating Averaging Window (see clause 5.7.3.6 and 5.7.4 of 3GPP TS 23.501), expressed in milliseconds.")

@Min(1) @Max(4095) 
  public Integer getAverWindow() {
    return averWindow;
  }

  public void setAverWindow(Integer averWindow) {
    this.averWindow = averWindow;
  }

  public NonDynamic5Qi maxDataBurstVol(Integer maxDataBurstVol) {
    this.maxDataBurstVol = maxDataBurstVol;
    return this;
  }

  /**
   * Unsigned integer indicating Maximum Data Burst Volume (see clauses 5.7.3.7 and 5.7.4 of 3GPP TS 23.501), expressed in Bytes.
   * minimum: 1
   * maximum: 4095
   * @return maxDataBurstVol
  */
  @ApiModelProperty(value = "Unsigned integer indicating Maximum Data Burst Volume (see clauses 5.7.3.7 and 5.7.4 of 3GPP TS 23.501), expressed in Bytes.")

@Min(1) @Max(4095) 
  public Integer getMaxDataBurstVol() {
    return maxDataBurstVol;
  }

  public void setMaxDataBurstVol(Integer maxDataBurstVol) {
    this.maxDataBurstVol = maxDataBurstVol;
  }

  public NonDynamic5Qi extMaxDataBurstVol(Integer extMaxDataBurstVol) {
    this.extMaxDataBurstVol = extMaxDataBurstVol;
    return this;
  }

  /**
   * Unsigned integer indicating Maximum Data Burst Volume (see clauses 5.7.3.7 and 5.7.4 of 3GPP TS 23.501), expressed in Bytes.
   * minimum: 4096
   * maximum: 2000000
   * @return extMaxDataBurstVol
  */
  @ApiModelProperty(value = "Unsigned integer indicating Maximum Data Burst Volume (see clauses 5.7.3.7 and 5.7.4 of 3GPP TS 23.501), expressed in Bytes.")

@Min(4096) @Max(2000000) 
  public Integer getExtMaxDataBurstVol() {
    return extMaxDataBurstVol;
  }

  public void setExtMaxDataBurstVol(Integer extMaxDataBurstVol) {
    this.extMaxDataBurstVol = extMaxDataBurstVol;
  }

  public NonDynamic5Qi cnPacketDelayBudgetDl(Integer cnPacketDelayBudgetDl) {
    this.cnPacketDelayBudgetDl = cnPacketDelayBudgetDl;
    return this;
  }

  /**
   * Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501 [8])), expressed in 0.01 milliseconds.
   * minimum: 1
   * @return cnPacketDelayBudgetDl
  */
  @ApiModelProperty(value = "Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501 [8])), expressed in 0.01 milliseconds.")

@Min(1)
  public Integer getCnPacketDelayBudgetDl() {
    return cnPacketDelayBudgetDl;
  }

  public void setCnPacketDelayBudgetDl(Integer cnPacketDelayBudgetDl) {
    this.cnPacketDelayBudgetDl = cnPacketDelayBudgetDl;
  }

  public NonDynamic5Qi cnPacketDelayBudgetUl(Integer cnPacketDelayBudgetUl) {
    this.cnPacketDelayBudgetUl = cnPacketDelayBudgetUl;
    return this;
  }

  /**
   * Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501 [8])), expressed in 0.01 milliseconds.
   * minimum: 1
   * @return cnPacketDelayBudgetUl
  */
  @ApiModelProperty(value = "Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501 [8])), expressed in 0.01 milliseconds.")

@Min(1)
  public Integer getCnPacketDelayBudgetUl() {
    return cnPacketDelayBudgetUl;
  }

  public void setCnPacketDelayBudgetUl(Integer cnPacketDelayBudgetUl) {
    this.cnPacketDelayBudgetUl = cnPacketDelayBudgetUl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonDynamic5Qi nonDynamic5Qi = (NonDynamic5Qi) o;
    return Objects.equals(this.priorityLevel, nonDynamic5Qi.priorityLevel) &&
        Objects.equals(this.averWindow, nonDynamic5Qi.averWindow) &&
        Objects.equals(this.maxDataBurstVol, nonDynamic5Qi.maxDataBurstVol) &&
        Objects.equals(this.extMaxDataBurstVol, nonDynamic5Qi.extMaxDataBurstVol) &&
        Objects.equals(this.cnPacketDelayBudgetDl, nonDynamic5Qi.cnPacketDelayBudgetDl) &&
        Objects.equals(this.cnPacketDelayBudgetUl, nonDynamic5Qi.cnPacketDelayBudgetUl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityLevel, averWindow, maxDataBurstVol, extMaxDataBurstVol, cnPacketDelayBudgetDl, cnPacketDelayBudgetUl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonDynamic5Qi {\n");
    
    sb.append("    priorityLevel: ").append(toIndentedString(priorityLevel)).append("\n");
    sb.append("    averWindow: ").append(toIndentedString(averWindow)).append("\n");
    sb.append("    maxDataBurstVol: ").append(toIndentedString(maxDataBurstVol)).append("\n");
    sb.append("    extMaxDataBurstVol: ").append(toIndentedString(extMaxDataBurstVol)).append("\n");
    sb.append("    cnPacketDelayBudgetDl: ").append(toIndentedString(cnPacketDelayBudgetDl)).append("\n");
    sb.append("    cnPacketDelayBudgetUl: ").append(toIndentedString(cnPacketDelayBudgetUl)).append("\n");
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

