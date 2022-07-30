package aaaa;

import java.util.Objects;
import aaaa.AccessType;
import aaaa.Ipv6Addr;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tunnel Information
 */
@ApiModel(description = "Tunnel Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class TunnelInfo   {
  @JsonProperty("ipv4Addr")
  private String ipv4Addr;

  @JsonProperty("ipv6Addr")
  private Ipv6Addr ipv6Addr;

  @JsonProperty("gtpTeid")
  private String gtpTeid;

  @JsonProperty("anType")
  private AccessType anType;

  public TunnelInfo ipv4Addr(String ipv4Addr) {
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

  public TunnelInfo ipv6Addr(Ipv6Addr ipv6Addr) {
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

  public TunnelInfo gtpTeid(String gtpTeid) {
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

  public TunnelInfo anType(AccessType anType) {
    this.anType = anType;
    return this;
  }

  /**
   * Get anType
   * @return anType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessType getAnType() {
    return anType;
  }

  public void setAnType(AccessType anType) {
    this.anType = anType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TunnelInfo tunnelInfo = (TunnelInfo) o;
    return Objects.equals(this.ipv4Addr, tunnelInfo.ipv4Addr) &&
        Objects.equals(this.ipv6Addr, tunnelInfo.ipv6Addr) &&
        Objects.equals(this.gtpTeid, tunnelInfo.gtpTeid) &&
        Objects.equals(this.anType, tunnelInfo.anType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Addr, ipv6Addr, gtpTeid, anType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TunnelInfo {\n");
    
    sb.append("    ipv4Addr: ").append(toIndentedString(ipv4Addr)).append("\n");
    sb.append("    ipv6Addr: ").append(toIndentedString(ipv6Addr)).append("\n");
    sb.append("    gtpTeid: ").append(toIndentedString(gtpTeid)).append("\n");
    sb.append("    anType: ").append(toIndentedString(anType)).append("\n");
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

