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
 * Alternative QoS Profile
 */
@ApiModel(description = "Alternative QoS Profile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class AlternativeQosProfile   {
  @JsonProperty("index")
  private Integer index;

  @JsonProperty("guaFbrDl")
  private String guaFbrDl;

  @JsonProperty("guaFbrUl")
  private String guaFbrUl;

  @JsonProperty("packetDelayBudget")
  private Integer packetDelayBudget;

  @JsonProperty("packetErrRate")
  private String packetErrRate;

  public AlternativeQosProfile index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * minimum: 1
   * maximum: 8
   * @return index
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Min(1) @Max(8) 
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public AlternativeQosProfile guaFbrDl(String guaFbrDl) {
    this.guaFbrDl = guaFbrDl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return guaFbrDl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getGuaFbrDl() {
    return guaFbrDl;
  }

  public void setGuaFbrDl(String guaFbrDl) {
    this.guaFbrDl = guaFbrDl;
  }

  public AlternativeQosProfile guaFbrUl(String guaFbrUl) {
    this.guaFbrUl = guaFbrUl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return guaFbrUl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getGuaFbrUl() {
    return guaFbrUl;
  }

  public void setGuaFbrUl(String guaFbrUl) {
    this.guaFbrUl = guaFbrUl;
  }

  public AlternativeQosProfile packetDelayBudget(Integer packetDelayBudget) {
    this.packetDelayBudget = packetDelayBudget;
    return this;
  }

  /**
   * Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501), expressed in milliseconds.
   * minimum: 1
   * @return packetDelayBudget
  */
  @ApiModelProperty(value = "Unsigned integer indicating Packet Delay Budget (see clauses 5.7.3.4 and 5.7.4 of 3GPP TS 23.501), expressed in milliseconds.")

@Min(1)
  public Integer getPacketDelayBudget() {
    return packetDelayBudget;
  }

  public void setPacketDelayBudget(Integer packetDelayBudget) {
    this.packetDelayBudget = packetDelayBudget;
  }

  public AlternativeQosProfile packetErrRate(String packetErrRate) {
    this.packetErrRate = packetErrRate;
    return this;
  }

  /**
   * String representing Packet Error Rate (see clause 5.7.3.5 and 5.7.4 of 3GPP TS 23.501, expressed as a \"scalar x 10-k\" where the scalar and the exponent k are each encoded as one decimal digit
   * @return packetErrRate
  */
  @ApiModelProperty(value = "String representing Packet Error Rate (see clause 5.7.3.5 and 5.7.4 of 3GPP TS 23.501, expressed as a \"scalar x 10-k\" where the scalar and the exponent k are each encoded as one decimal digit")

@Pattern(regexp="^([0-9]E-[0-9])$") 
  public String getPacketErrRate() {
    return packetErrRate;
  }

  public void setPacketErrRate(String packetErrRate) {
    this.packetErrRate = packetErrRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeQosProfile alternativeQosProfile = (AlternativeQosProfile) o;
    return Objects.equals(this.index, alternativeQosProfile.index) &&
        Objects.equals(this.guaFbrDl, alternativeQosProfile.guaFbrDl) &&
        Objects.equals(this.guaFbrUl, alternativeQosProfile.guaFbrUl) &&
        Objects.equals(this.packetDelayBudget, alternativeQosProfile.packetDelayBudget) &&
        Objects.equals(this.packetErrRate, alternativeQosProfile.packetErrRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, guaFbrDl, guaFbrUl, packetDelayBudget, packetErrRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeQosProfile {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    guaFbrDl: ").append(toIndentedString(guaFbrDl)).append("\n");
    sb.append("    guaFbrUl: ").append(toIndentedString(guaFbrUl)).append("\n");
    sb.append("    packetDelayBudget: ").append(toIndentedString(packetDelayBudget)).append("\n");
    sb.append("    packetErrRate: ").append(toIndentedString(packetErrRate)).append("\n");
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

