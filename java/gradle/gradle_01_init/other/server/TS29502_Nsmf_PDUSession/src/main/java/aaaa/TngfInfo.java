package aaaa;

import java.util.Objects;
import aaaa.Ipv6Addr;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Infomation of the TNGF endpoints
 */
@ApiModel(description = "Infomation of the TNGF endpoints")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class TngfInfo   {
  @JsonProperty("ipv4EndpointAddresses")
  @Valid
  private List<String> ipv4EndpointAddresses = null;

  @JsonProperty("ipv6EndpointAddresses")
  @Valid
  private List<Ipv6Addr> ipv6EndpointAddresses = null;

  @JsonProperty("endpointFqdn")
  private String endpointFqdn;

  public TngfInfo ipv4EndpointAddresses(List<String> ipv4EndpointAddresses) {
    this.ipv4EndpointAddresses = ipv4EndpointAddresses;
    return this;
  }

  public TngfInfo addIpv4EndpointAddressesItem(String ipv4EndpointAddressesItem) {
    if (this.ipv4EndpointAddresses == null) {
      this.ipv4EndpointAddresses = new ArrayList<>();
    }
    this.ipv4EndpointAddresses.add(ipv4EndpointAddressesItem);
    return this;
  }

  /**
   * Get ipv4EndpointAddresses
   * @return ipv4EndpointAddresses
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getIpv4EndpointAddresses() {
    return ipv4EndpointAddresses;
  }

  public void setIpv4EndpointAddresses(List<String> ipv4EndpointAddresses) {
    this.ipv4EndpointAddresses = ipv4EndpointAddresses;
  }

  public TngfInfo ipv6EndpointAddresses(List<Ipv6Addr> ipv6EndpointAddresses) {
    this.ipv6EndpointAddresses = ipv6EndpointAddresses;
    return this;
  }

  public TngfInfo addIpv6EndpointAddressesItem(Ipv6Addr ipv6EndpointAddressesItem) {
    if (this.ipv6EndpointAddresses == null) {
      this.ipv6EndpointAddresses = new ArrayList<>();
    }
    this.ipv6EndpointAddresses.add(ipv6EndpointAddressesItem);
    return this;
  }

  /**
   * Get ipv6EndpointAddresses
   * @return ipv6EndpointAddresses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<Ipv6Addr> getIpv6EndpointAddresses() {
    return ipv6EndpointAddresses;
  }

  public void setIpv6EndpointAddresses(List<Ipv6Addr> ipv6EndpointAddresses) {
    this.ipv6EndpointAddresses = ipv6EndpointAddresses;
  }

  public TngfInfo endpointFqdn(String endpointFqdn) {
    this.endpointFqdn = endpointFqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return endpointFqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getEndpointFqdn() {
    return endpointFqdn;
  }

  public void setEndpointFqdn(String endpointFqdn) {
    this.endpointFqdn = endpointFqdn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TngfInfo tngfInfo = (TngfInfo) o;
    return Objects.equals(this.ipv4EndpointAddresses, tngfInfo.ipv4EndpointAddresses) &&
        Objects.equals(this.ipv6EndpointAddresses, tngfInfo.ipv6EndpointAddresses) &&
        Objects.equals(this.endpointFqdn, tngfInfo.endpointFqdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4EndpointAddresses, ipv6EndpointAddresses, endpointFqdn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TngfInfo {\n");
    
    sb.append("    ipv4EndpointAddresses: ").append(toIndentedString(ipv4EndpointAddresses)).append("\n");
    sb.append("    ipv6EndpointAddresses: ").append(toIndentedString(ipv6EndpointAddresses)).append("\n");
    sb.append("    endpointFqdn: ").append(toIndentedString(endpointFqdn)).append("\n");
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

