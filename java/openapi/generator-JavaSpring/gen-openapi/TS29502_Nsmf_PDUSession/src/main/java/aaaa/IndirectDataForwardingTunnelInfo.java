package aaaa;

import java.util.Objects;
import aaaa.Ipv6Addr;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indirect Data Forwarding Tunnel Information
 */
@ApiModel(description = "Indirect Data Forwarding Tunnel Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class IndirectDataForwardingTunnelInfo   {
  @JsonProperty("ipv4Addr")
  private String ipv4Addr;

  @JsonProperty("ipv6Addr")
  private Ipv6Addr ipv6Addr;

  @JsonProperty("gtpTeid")
  private String gtpTeid;

  @JsonProperty("drbId")
  private Integer drbId;

  @JsonProperty("additionalTnlNb")
  private Integer additionalTnlNb;

  public IndirectDataForwardingTunnelInfo ipv4Addr(String ipv4Addr) {
    this.ipv4Addr = ipv4Addr;
    return this;
  }

  /**
   * String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.
   * @return ipv4Addr
  */
  @ApiModelProperty(example = "198.51.100.1", value = "String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.")

@Pattern(regexp="^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$") 
  public String getIpv4Addr() {
    return ipv4Addr;
  }

  public void setIpv4Addr(String ipv4Addr) {
    this.ipv4Addr = ipv4Addr;
  }

  public IndirectDataForwardingTunnelInfo ipv6Addr(Ipv6Addr ipv6Addr) {
    this.ipv6Addr = ipv6Addr;
    return this;
  }

  /**
   * Get ipv6Addr
   * @return ipv6Addr
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Addr getIpv6Addr() {
    return ipv6Addr;
  }

  public void setIpv6Addr(Ipv6Addr ipv6Addr) {
    this.ipv6Addr = ipv6Addr;
  }

  public IndirectDataForwardingTunnelInfo gtpTeid(String gtpTeid) {
    this.gtpTeid = gtpTeid;
    return this;
  }

  /**
   * GTP Tunnel Endpoint Identifier
   * @return gtpTeid
  */
  @ApiModelProperty(required = true, value = "GTP Tunnel Endpoint Identifier")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]{8}$") 
  public String getGtpTeid() {
    return gtpTeid;
  }

  public void setGtpTeid(String gtpTeid) {
    this.gtpTeid = gtpTeid;
  }

  public IndirectDataForwardingTunnelInfo drbId(Integer drbId) {
    this.drbId = drbId;
    return this;
  }

  /**
   * Data Radio Bearer Identity
   * minimum: 1
   * maximum: 32
   * @return drbId
  */
  @ApiModelProperty(value = "Data Radio Bearer Identity")

@Min(1) @Max(32) 
  public Integer getDrbId() {
    return drbId;
  }

  public void setDrbId(Integer drbId) {
    this.drbId = drbId;
  }

  public IndirectDataForwardingTunnelInfo additionalTnlNb(Integer additionalTnlNb) {
    this.additionalTnlNb = additionalTnlNb;
    return this;
  }

  /**
   * indicates first, second or third additional indirect data forwarding tunnel
   * minimum: 1
   * maximum: 3
   * @return additionalTnlNb
  */
  @ApiModelProperty(value = "indicates first, second or third additional indirect data forwarding tunnel")

@Min(1) @Max(3) 
  public Integer getAdditionalTnlNb() {
    return additionalTnlNb;
  }

  public void setAdditionalTnlNb(Integer additionalTnlNb) {
    this.additionalTnlNb = additionalTnlNb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndirectDataForwardingTunnelInfo indirectDataForwardingTunnelInfo = (IndirectDataForwardingTunnelInfo) o;
    return Objects.equals(this.ipv4Addr, indirectDataForwardingTunnelInfo.ipv4Addr) &&
        Objects.equals(this.ipv6Addr, indirectDataForwardingTunnelInfo.ipv6Addr) &&
        Objects.equals(this.gtpTeid, indirectDataForwardingTunnelInfo.gtpTeid) &&
        Objects.equals(this.drbId, indirectDataForwardingTunnelInfo.drbId) &&
        Objects.equals(this.additionalTnlNb, indirectDataForwardingTunnelInfo.additionalTnlNb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Addr, ipv6Addr, gtpTeid, drbId, additionalTnlNb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirectDataForwardingTunnelInfo {\n");
    
    sb.append("    ipv4Addr: ").append(toIndentedString(ipv4Addr)).append("\n");
    sb.append("    ipv6Addr: ").append(toIndentedString(ipv6Addr)).append("\n");
    sb.append("    gtpTeid: ").append(toIndentedString(gtpTeid)).append("\n");
    sb.append("    drbId: ").append(toIndentedString(drbId)).append("\n");
    sb.append("    additionalTnlNb: ").append(toIndentedString(additionalTnlNb)).append("\n");
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

