package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.AccessType;
import oreore.nrf.model.Ipv4AddressRange;
import oreore.nrf.model.Ipv6Addr;
import oreore.nrf.model.Ipv6PrefixRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a P-CSCF NF Instance
 */
@ApiModel(description = "Information of a P-CSCF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class PcscfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accessType")
  @Valid
  private List<AccessType> accessType = null;

  @JsonProperty("dnnList")
  @Valid
  private List<String> dnnList = null;

  @JsonProperty("gmFqdn")
  private String gmFqdn;

  @JsonProperty("gmIpv4Addresses")
  @Valid
  private List<String> gmIpv4Addresses = null;

  @JsonProperty("gmIpv6Addresses")
  @Valid
  private List<Ipv6Addr> gmIpv6Addresses = null;

  @JsonProperty("servedIpv4AddressRanges")
  @Valid
  private List<Ipv4AddressRange> servedIpv4AddressRanges = null;

  @JsonProperty("servedIpv6PrefixRanges")
  @Valid
  private List<Ipv6PrefixRange> servedIpv6PrefixRanges = null;

  public PcscfInfo accessType(List<AccessType> accessType) {
    this.accessType = accessType;
    return this;
  }

  public PcscfInfo addAccessTypeItem(AccessType accessTypeItem) {
    if (this.accessType == null) {
      this.accessType = new ArrayList<>();
    }
    this.accessType.add(accessTypeItem);
    return this;
  }

  /**
   * Get accessType
   * @return accessType
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<AccessType> getAccessType() {
    return accessType;
  }

  public void setAccessType(List<AccessType> accessType) {
    this.accessType = accessType;
  }

  public PcscfInfo dnnList(List<String> dnnList) {
    this.dnnList = dnnList;
    return this;
  }

  public PcscfInfo addDnnListItem(String dnnListItem) {
    if (this.dnnList == null) {
      this.dnnList = new ArrayList<>();
    }
    this.dnnList.add(dnnListItem);
    return this;
  }

  /**
   * Get dnnList
   * @return dnnList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getDnnList() {
    return dnnList;
  }

  public void setDnnList(List<String> dnnList) {
    this.dnnList = dnnList;
  }

  public PcscfInfo gmFqdn(String gmFqdn) {
    this.gmFqdn = gmFqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return gmFqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getGmFqdn() {
    return gmFqdn;
  }

  public void setGmFqdn(String gmFqdn) {
    this.gmFqdn = gmFqdn;
  }

  public PcscfInfo gmIpv4Addresses(List<String> gmIpv4Addresses) {
    this.gmIpv4Addresses = gmIpv4Addresses;
    return this;
  }

  public PcscfInfo addGmIpv4AddressesItem(String gmIpv4AddressesItem) {
    if (this.gmIpv4Addresses == null) {
      this.gmIpv4Addresses = new ArrayList<>();
    }
    this.gmIpv4Addresses.add(gmIpv4AddressesItem);
    return this;
  }

  /**
   * Get gmIpv4Addresses
   * @return gmIpv4Addresses
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getGmIpv4Addresses() {
    return gmIpv4Addresses;
  }

  public void setGmIpv4Addresses(List<String> gmIpv4Addresses) {
    this.gmIpv4Addresses = gmIpv4Addresses;
  }

  public PcscfInfo gmIpv6Addresses(List<Ipv6Addr> gmIpv6Addresses) {
    this.gmIpv6Addresses = gmIpv6Addresses;
    return this;
  }

  public PcscfInfo addGmIpv6AddressesItem(Ipv6Addr gmIpv6AddressesItem) {
    if (this.gmIpv6Addresses == null) {
      this.gmIpv6Addresses = new ArrayList<>();
    }
    this.gmIpv6Addresses.add(gmIpv6AddressesItem);
    return this;
  }

  /**
   * Get gmIpv6Addresses
   * @return gmIpv6Addresses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv6Addr> getGmIpv6Addresses() {
    return gmIpv6Addresses;
  }

  public void setGmIpv6Addresses(List<Ipv6Addr> gmIpv6Addresses) {
    this.gmIpv6Addresses = gmIpv6Addresses;
  }

  public PcscfInfo servedIpv4AddressRanges(List<Ipv4AddressRange> servedIpv4AddressRanges) {
    this.servedIpv4AddressRanges = servedIpv4AddressRanges;
    return this;
  }

  public PcscfInfo addServedIpv4AddressRangesItem(Ipv4AddressRange servedIpv4AddressRangesItem) {
    if (this.servedIpv4AddressRanges == null) {
      this.servedIpv4AddressRanges = new ArrayList<>();
    }
    this.servedIpv4AddressRanges.add(servedIpv4AddressRangesItem);
    return this;
  }

  /**
   * Get servedIpv4AddressRanges
   * @return servedIpv4AddressRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv4AddressRange> getServedIpv4AddressRanges() {
    return servedIpv4AddressRanges;
  }

  public void setServedIpv4AddressRanges(List<Ipv4AddressRange> servedIpv4AddressRanges) {
    this.servedIpv4AddressRanges = servedIpv4AddressRanges;
  }

  public PcscfInfo servedIpv6PrefixRanges(List<Ipv6PrefixRange> servedIpv6PrefixRanges) {
    this.servedIpv6PrefixRanges = servedIpv6PrefixRanges;
    return this;
  }

  public PcscfInfo addServedIpv6PrefixRangesItem(Ipv6PrefixRange servedIpv6PrefixRangesItem) {
    if (this.servedIpv6PrefixRanges == null) {
      this.servedIpv6PrefixRanges = new ArrayList<>();
    }
    this.servedIpv6PrefixRanges.add(servedIpv6PrefixRangesItem);
    return this;
  }

  /**
   * Get servedIpv6PrefixRanges
   * @return servedIpv6PrefixRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv6PrefixRange> getServedIpv6PrefixRanges() {
    return servedIpv6PrefixRanges;
  }

  public void setServedIpv6PrefixRanges(List<Ipv6PrefixRange> servedIpv6PrefixRanges) {
    this.servedIpv6PrefixRanges = servedIpv6PrefixRanges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PcscfInfo pcscfInfo = (PcscfInfo) o;
    return Objects.equals(this.accessType, pcscfInfo.accessType) &&
        Objects.equals(this.dnnList, pcscfInfo.dnnList) &&
        Objects.equals(this.gmFqdn, pcscfInfo.gmFqdn) &&
        Objects.equals(this.gmIpv4Addresses, pcscfInfo.gmIpv4Addresses) &&
        Objects.equals(this.gmIpv6Addresses, pcscfInfo.gmIpv6Addresses) &&
        Objects.equals(this.servedIpv4AddressRanges, pcscfInfo.servedIpv4AddressRanges) &&
        Objects.equals(this.servedIpv6PrefixRanges, pcscfInfo.servedIpv6PrefixRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, dnnList, gmFqdn, gmIpv4Addresses, gmIpv6Addresses, servedIpv4AddressRanges, servedIpv6PrefixRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PcscfInfo {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    dnnList: ").append(toIndentedString(dnnList)).append("\n");
    sb.append("    gmFqdn: ").append(toIndentedString(gmFqdn)).append("\n");
    sb.append("    gmIpv4Addresses: ").append(toIndentedString(gmIpv4Addresses)).append("\n");
    sb.append("    gmIpv6Addresses: ").append(toIndentedString(gmIpv6Addresses)).append("\n");
    sb.append("    servedIpv4AddressRanges: ").append(toIndentedString(servedIpv4AddressRanges)).append("\n");
    sb.append("    servedIpv6PrefixRanges: ").append(toIndentedString(servedIpv6PrefixRanges)).append("\n");
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

