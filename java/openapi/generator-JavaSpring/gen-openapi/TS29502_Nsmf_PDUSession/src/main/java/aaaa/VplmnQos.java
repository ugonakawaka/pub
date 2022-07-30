package aaaa;

import java.util.Objects;
import aaaa.Ambr;
import aaaa.Arp;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VPLMN QoS
 */
@ApiModel(description = "VPLMN QoS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class VplmnQos   {
  @JsonProperty("5qi")
  private Integer _5qi;

  @JsonProperty("arp")
  private Arp arp;

  @JsonProperty("sessionAmbr")
  private Ambr sessionAmbr;

  @JsonProperty("maxFbrDl")
  private String maxFbrDl;

  @JsonProperty("maxFbrUl")
  private String maxFbrUl;

  @JsonProperty("guaFbrDl")
  private String guaFbrDl;

  @JsonProperty("guaFbrUl")
  private String guaFbrUl;

  public VplmnQos _5qi(Integer _5qi) {
    this._5qi = _5qi;
    return this;
  }

  /**
   * Unsigned integer representing a 5G QoS Identifier (see clause 5.7.2.1 of 3GPP TS 23.501, within the range 0 to 255
   * minimum: 0
   * maximum: 255
   * @return _5qi
  */
  @ApiModelProperty(value = "Unsigned integer representing a 5G QoS Identifier (see clause 5.7.2.1 of 3GPP TS 23.501, within the range 0 to 255")

@Min(0) @Max(255) 
  public Integer get5qi() {
    return _5qi;
  }

  public void set5qi(Integer _5qi) {
    this._5qi = _5qi;
  }

  public VplmnQos arp(Arp arp) {
    this.arp = arp;
    return this;
  }

  /**
   * Get arp
   * @return arp
  */
  @ApiModelProperty(value = "")

  @Valid

  public Arp getArp() {
    return arp;
  }

  public void setArp(Arp arp) {
    this.arp = arp;
  }

  public VplmnQos sessionAmbr(Ambr sessionAmbr) {
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

  public VplmnQos maxFbrDl(String maxFbrDl) {
    this.maxFbrDl = maxFbrDl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return maxFbrDl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMaxFbrDl() {
    return maxFbrDl;
  }

  public void setMaxFbrDl(String maxFbrDl) {
    this.maxFbrDl = maxFbrDl;
  }

  public VplmnQos maxFbrUl(String maxFbrUl) {
    this.maxFbrUl = maxFbrUl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return maxFbrUl
  */
  @ApiModelProperty(value = "String representing a bit rate that shall be formatted as follows.")

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMaxFbrUl() {
    return maxFbrUl;
  }

  public void setMaxFbrUl(String maxFbrUl) {
    this.maxFbrUl = maxFbrUl;
  }

  public VplmnQos guaFbrDl(String guaFbrDl) {
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

  public VplmnQos guaFbrUl(String guaFbrUl) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VplmnQos vplmnQos = (VplmnQos) o;
    return Objects.equals(this._5qi, vplmnQos._5qi) &&
        Objects.equals(this.arp, vplmnQos.arp) &&
        Objects.equals(this.sessionAmbr, vplmnQos.sessionAmbr) &&
        Objects.equals(this.maxFbrDl, vplmnQos.maxFbrDl) &&
        Objects.equals(this.maxFbrUl, vplmnQos.maxFbrUl) &&
        Objects.equals(this.guaFbrDl, vplmnQos.guaFbrDl) &&
        Objects.equals(this.guaFbrUl, vplmnQos.guaFbrUl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5qi, arp, sessionAmbr, maxFbrDl, maxFbrUl, guaFbrDl, guaFbrUl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VplmnQos {\n");
    
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    arp: ").append(toIndentedString(arp)).append("\n");
    sb.append("    sessionAmbr: ").append(toIndentedString(sessionAmbr)).append("\n");
    sb.append("    maxFbrDl: ").append(toIndentedString(maxFbrDl)).append("\n");
    sb.append("    maxFbrUl: ").append(toIndentedString(maxFbrUl)).append("\n");
    sb.append("    guaFbrDl: ").append(toIndentedString(guaFbrDl)).append("\n");
    sb.append("    guaFbrUl: ").append(toIndentedString(guaFbrUl)).append("\n");
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

