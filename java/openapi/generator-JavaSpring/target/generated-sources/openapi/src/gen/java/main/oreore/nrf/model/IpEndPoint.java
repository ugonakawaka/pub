package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oreore.nrf.model.Ipv6Addr;
import oreore.nrf.model.TransportProtocol;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * IP addressing information of a given NFService; it consists on, e.g. IP address, TCP port, transport protocol...
 */
@ApiModel(description = "IP addressing information of a given NFService; it consists on, e.g. IP address, TCP port, transport protocol...")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class IpEndPoint  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ipv4Address")
  private String ipv4Address;

  @JsonProperty("ipv6Address")
  private Ipv6Addr ipv6Address;

  @JsonProperty("transport")
  private TransportProtocol transport;

  @JsonProperty("port")
  private Integer port;

  public IpEndPoint ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.
   * @return ipv4Address
  */
  @ApiModelProperty(example = "198.51.100.1", value = "String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.")

@Pattern(regexp = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$") 
  public String getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  public IpEndPoint ipv6Address(Ipv6Addr ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * Get ipv6Address
   * @return ipv6Address
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Addr getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(Ipv6Addr ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  public IpEndPoint transport(TransportProtocol transport) {
    this.transport = transport;
    return this;
  }

  /**
   * Get transport
   * @return transport
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransportProtocol getTransport() {
    return transport;
  }

  public void setTransport(TransportProtocol transport) {
    this.transport = transport;
  }

  public IpEndPoint port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * minimum: 0
   * maximum: 65535
   * @return port
  */
  @ApiModelProperty(value = "")

@Min(0) @Max(65535) 
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpEndPoint ipEndPoint = (IpEndPoint) o;
    return Objects.equals(this.ipv4Address, ipEndPoint.ipv4Address) &&
        Objects.equals(this.ipv6Address, ipEndPoint.ipv6Address) &&
        Objects.equals(this.transport, ipEndPoint.transport) &&
        Objects.equals(this.port, ipEndPoint.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Address, ipv6Address, transport, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpEndPoint {\n");
    
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

