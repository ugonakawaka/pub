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
 * Contains the information of Provisioning Server.
 */
@ApiModel(description = "Contains the information of Provisioning Server.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class PvsInfo   {
  @JsonProperty("pvsIpv4Addresses")
  @Valid
  private List<String> pvsIpv4Addresses = null;

  @JsonProperty("pvsIpv6Addresses")
  @Valid
  private List<Ipv6Addr> pvsIpv6Addresses = null;

  @JsonProperty("pvsFqdnList")
  @Valid
  private List<String> pvsFqdnList = null;

  public PvsInfo pvsIpv4Addresses(List<String> pvsIpv4Addresses) {
    this.pvsIpv4Addresses = pvsIpv4Addresses;
    return this;
  }

  public PvsInfo addPvsIpv4AddressesItem(String pvsIpv4AddressesItem) {
    if (this.pvsIpv4Addresses == null) {
      this.pvsIpv4Addresses = new ArrayList<>();
    }
    this.pvsIpv4Addresses.add(pvsIpv4AddressesItem);
    return this;
  }

  /**
   * Get pvsIpv4Addresses
   * @return pvsIpv4Addresses
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getPvsIpv4Addresses() {
    return pvsIpv4Addresses;
  }

  public void setPvsIpv4Addresses(List<String> pvsIpv4Addresses) {
    this.pvsIpv4Addresses = pvsIpv4Addresses;
  }

  public PvsInfo pvsIpv6Addresses(List<Ipv6Addr> pvsIpv6Addresses) {
    this.pvsIpv6Addresses = pvsIpv6Addresses;
    return this;
  }

  public PvsInfo addPvsIpv6AddressesItem(Ipv6Addr pvsIpv6AddressesItem) {
    if (this.pvsIpv6Addresses == null) {
      this.pvsIpv6Addresses = new ArrayList<>();
    }
    this.pvsIpv6Addresses.add(pvsIpv6AddressesItem);
    return this;
  }

  /**
   * Get pvsIpv6Addresses
   * @return pvsIpv6Addresses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<Ipv6Addr> getPvsIpv6Addresses() {
    return pvsIpv6Addresses;
  }

  public void setPvsIpv6Addresses(List<Ipv6Addr> pvsIpv6Addresses) {
    this.pvsIpv6Addresses = pvsIpv6Addresses;
  }

  public PvsInfo pvsFqdnList(List<String> pvsFqdnList) {
    this.pvsFqdnList = pvsFqdnList;
    return this;
  }

  public PvsInfo addPvsFqdnListItem(String pvsFqdnListItem) {
    if (this.pvsFqdnList == null) {
      this.pvsFqdnList = new ArrayList<>();
    }
    this.pvsFqdnList.add(pvsFqdnListItem);
    return this;
  }

  /**
   * List of FQDNs (Fully Qualified Domain Name) of the Provisioning Server.
   * @return pvsFqdnList
  */
  @ApiModelProperty(value = "List of FQDNs (Fully Qualified Domain Name) of the Provisioning Server.")

@Size(min=1) 
  public List<String> getPvsFqdnList() {
    return pvsFqdnList;
  }

  public void setPvsFqdnList(List<String> pvsFqdnList) {
    this.pvsFqdnList = pvsFqdnList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PvsInfo pvsInfo = (PvsInfo) o;
    return Objects.equals(this.pvsIpv4Addresses, pvsInfo.pvsIpv4Addresses) &&
        Objects.equals(this.pvsIpv6Addresses, pvsInfo.pvsIpv6Addresses) &&
        Objects.equals(this.pvsFqdnList, pvsInfo.pvsFqdnList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pvsIpv4Addresses, pvsIpv6Addresses, pvsFqdnList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PvsInfo {\n");
    
    sb.append("    pvsIpv4Addresses: ").append(toIndentedString(pvsIpv4Addresses)).append("\n");
    sb.append("    pvsIpv6Addresses: ").append(toIndentedString(pvsIpv6Addresses)).append("\n");
    sb.append("    pvsFqdnList: ").append(toIndentedString(pvsFqdnList)).append("\n");
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

