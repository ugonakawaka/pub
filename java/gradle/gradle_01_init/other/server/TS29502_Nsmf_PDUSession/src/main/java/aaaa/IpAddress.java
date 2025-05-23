package aaaa;

import java.util.Objects;
import aaaa.Ipv6Addr;
import aaaa.Ipv6Prefix;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IP Address
 */
@ApiModel(description = "IP Address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class IpAddress   {
  @JsonProperty("ipv4Addr")
  private String ipv4Addr;

  @JsonProperty("ipv6Addr")
  private Ipv6Addr ipv6Addr;

  @JsonProperty("ipv6Prefix")
  private Ipv6Prefix ipv6Prefix;

  public IpAddress ipv4Addr(String ipv4Addr) {
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

  public IpAddress ipv6Addr(Ipv6Addr ipv6Addr) {
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

  public IpAddress ipv6Prefix(Ipv6Prefix ipv6Prefix) {
    this.ipv6Prefix = ipv6Prefix;
    return this;
  }

  /**
   * Get ipv6Prefix
   * @return ipv6Prefix
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Prefix getIpv6Prefix() {
    return ipv6Prefix;
  }

  public void setIpv6Prefix(Ipv6Prefix ipv6Prefix) {
    this.ipv6Prefix = ipv6Prefix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddress ipAddress = (IpAddress) o;
    return Objects.equals(this.ipv4Addr, ipAddress.ipv4Addr) &&
        Objects.equals(this.ipv6Addr, ipAddress.ipv6Addr) &&
        Objects.equals(this.ipv6Prefix, ipAddress.ipv6Prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Addr, ipv6Addr, ipv6Prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddress {\n");
    
    sb.append("    ipv4Addr: ").append(toIndentedString(ipv4Addr)).append("\n");
    sb.append("    ipv6Addr: ").append(toIndentedString(ipv6Addr)).append("\n");
    sb.append("    ipv6Prefix: ").append(toIndentedString(ipv6Prefix)).append("\n");
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

