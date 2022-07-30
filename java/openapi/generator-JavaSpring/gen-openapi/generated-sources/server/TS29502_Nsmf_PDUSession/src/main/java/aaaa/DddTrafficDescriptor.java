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
 * Contains a Traffic Descriptor.
 */
@ApiModel(description = "Contains a Traffic Descriptor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class DddTrafficDescriptor   {
  @JsonProperty("ipv4Addr")
  private String ipv4Addr;

  @JsonProperty("ipv6Addr")
  private Ipv6Addr ipv6Addr;

  @JsonProperty("portNumber")
  private Integer portNumber;

  @JsonProperty("macAddr")
  private String macAddr;

  public DddTrafficDescriptor ipv4Addr(String ipv4Addr) {
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

  public DddTrafficDescriptor ipv6Addr(Ipv6Addr ipv6Addr) {
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

  public DddTrafficDescriptor portNumber(Integer portNumber) {
    this.portNumber = portNumber;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return portNumber
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0)
  public Integer getPortNumber() {
    return portNumber;
  }

  public void setPortNumber(Integer portNumber) {
    this.portNumber = portNumber;
  }

  public DddTrafficDescriptor macAddr(String macAddr) {
    this.macAddr = macAddr;
    return this;
  }

  /**
   * String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042
   * @return macAddr
  */
  @ApiModelProperty(value = "String identifying a MAC address formatted in the hexadecimal notation according to clause 1.1 and clause 2.1 of RFC 7042")

@Pattern(regexp="^([0-9a-fA-F]{2})((-[0-9a-fA-F]{2}){5})$") 
  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DddTrafficDescriptor dddTrafficDescriptor = (DddTrafficDescriptor) o;
    return Objects.equals(this.ipv4Addr, dddTrafficDescriptor.ipv4Addr) &&
        Objects.equals(this.ipv6Addr, dddTrafficDescriptor.ipv6Addr) &&
        Objects.equals(this.portNumber, dddTrafficDescriptor.portNumber) &&
        Objects.equals(this.macAddr, dddTrafficDescriptor.macAddr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Addr, ipv6Addr, portNumber, macAddr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DddTrafficDescriptor {\n");
    
    sb.append("    ipv4Addr: ").append(toIndentedString(ipv4Addr)).append("\n");
    sb.append("    ipv6Addr: ").append(toIndentedString(ipv6Addr)).append("\n");
    sb.append("    portNumber: ").append(toIndentedString(portNumber)).append("\n");
    sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
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

