package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oreore.nrf.model.IpReachability;
import oreore.nrf.model.Ipv4AddressRange;
import oreore.nrf.model.Ipv6Prefix;
import oreore.nrf.model.Ipv6PrefixRange;
import oreore.nrf.model.PlmnId;
import oreore.nrf.model.ScpCapability;
import oreore.nrf.model.ScpDomainInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an SCP Instance
 */
@ApiModel(description = "Information of an SCP Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class ScpInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scpDomainInfoList")
  @Valid
  private Map<String, List<ScpDomainInfo>> scpDomainInfoList = null;

  @JsonProperty("scpPrefix")
  private String scpPrefix;

  @JsonProperty("scpPorts")
  @Valid
  private Map<String, Integer> scpPorts = null;

  @JsonProperty("addressDomains")
  @Valid
  private List<String> addressDomains = null;

  @JsonProperty("ipv4Addresses")
  @Valid
  private List<String> ipv4Addresses = null;

  @JsonProperty("ipv6Prefixes")
  @Valid
  private List<Ipv6Prefix> ipv6Prefixes = null;

  @JsonProperty("ipv4AddrRanges")
  @Valid
  private List<Ipv4AddressRange> ipv4AddrRanges = null;

  @JsonProperty("ipv6PrefixRanges")
  @Valid
  private List<Ipv6PrefixRange> ipv6PrefixRanges = null;

  @JsonProperty("servedNfSetIdList")
  @Valid
  private List<String> servedNfSetIdList = null;

  @JsonProperty("remotePlmnList")
  @Valid
  private List<PlmnId> remotePlmnList = null;

  @JsonProperty("ipReachability")
  private IpReachability ipReachability;

  @JsonProperty("scpCapabilities")
  @Valid
  private List<ScpCapability> scpCapabilities = null;

  public ScpInfo scpDomainInfoList(Map<String, List<ScpDomainInfo>> scpDomainInfoList) {
    this.scpDomainInfoList = scpDomainInfoList;
    return this;
  }

  public ScpInfo putScpDomainInfoListItem(String key, List<ScpDomainInfo> scpDomainInfoListItem) {
    if (this.scpDomainInfoList == null) {
      this.scpDomainInfoList = new HashMap<>();
    }
    this.scpDomainInfoList.put(key, scpDomainInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where the key of the map shall be the string identifying an SCP domain
   * @return scpDomainInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where the key of the map shall be the string identifying an SCP domain")

  @Valid
@Size(min = 1) 
  public Map<String, List<ScpDomainInfo>> getScpDomainInfoList() {
    return scpDomainInfoList;
  }

  public void setScpDomainInfoList(Map<String, List<ScpDomainInfo>> scpDomainInfoList) {
    this.scpDomainInfoList = scpDomainInfoList;
  }

  public ScpInfo scpPrefix(String scpPrefix) {
    this.scpPrefix = scpPrefix;
    return this;
  }

  /**
   * Get scpPrefix
   * @return scpPrefix
  */
  @ApiModelProperty(value = "")


  public String getScpPrefix() {
    return scpPrefix;
  }

  public void setScpPrefix(String scpPrefix) {
    this.scpPrefix = scpPrefix;
  }

  public ScpInfo scpPorts(Map<String, Integer> scpPorts) {
    this.scpPorts = scpPorts;
    return this;
  }

  public ScpInfo putScpPortsItem(String key, Integer scpPortsItem) {
    if (this.scpPorts == null) {
      this.scpPorts = new HashMap<>();
    }
    this.scpPorts.put(key, scpPortsItem);
    return this;
  }

  /**
   * Port numbers for HTTP and HTTPS. The key of the map shall be \"http\" or \"https\"
   * @return scpPorts
  */
  @ApiModelProperty(value = "Port numbers for HTTP and HTTPS. The key of the map shall be \"http\" or \"https\"")

@Size(min = 1) 
  public Map<String, Integer> getScpPorts() {
    return scpPorts;
  }

  public void setScpPorts(Map<String, Integer> scpPorts) {
    this.scpPorts = scpPorts;
  }

  public ScpInfo addressDomains(List<String> addressDomains) {
    this.addressDomains = addressDomains;
    return this;
  }

  public ScpInfo addAddressDomainsItem(String addressDomainsItem) {
    if (this.addressDomains == null) {
      this.addressDomains = new ArrayList<>();
    }
    this.addressDomains.add(addressDomainsItem);
    return this;
  }

  /**
   * Get addressDomains
   * @return addressDomains
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getAddressDomains() {
    return addressDomains;
  }

  public void setAddressDomains(List<String> addressDomains) {
    this.addressDomains = addressDomains;
  }

  public ScpInfo ipv4Addresses(List<String> ipv4Addresses) {
    this.ipv4Addresses = ipv4Addresses;
    return this;
  }

  public ScpInfo addIpv4AddressesItem(String ipv4AddressesItem) {
    if (this.ipv4Addresses == null) {
      this.ipv4Addresses = new ArrayList<>();
    }
    this.ipv4Addresses.add(ipv4AddressesItem);
    return this;
  }

  /**
   * Get ipv4Addresses
   * @return ipv4Addresses
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getIpv4Addresses() {
    return ipv4Addresses;
  }

  public void setIpv4Addresses(List<String> ipv4Addresses) {
    this.ipv4Addresses = ipv4Addresses;
  }

  public ScpInfo ipv6Prefixes(List<Ipv6Prefix> ipv6Prefixes) {
    this.ipv6Prefixes = ipv6Prefixes;
    return this;
  }

  public ScpInfo addIpv6PrefixesItem(Ipv6Prefix ipv6PrefixesItem) {
    if (this.ipv6Prefixes == null) {
      this.ipv6Prefixes = new ArrayList<>();
    }
    this.ipv6Prefixes.add(ipv6PrefixesItem);
    return this;
  }

  /**
   * Get ipv6Prefixes
   * @return ipv6Prefixes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv6Prefix> getIpv6Prefixes() {
    return ipv6Prefixes;
  }

  public void setIpv6Prefixes(List<Ipv6Prefix> ipv6Prefixes) {
    this.ipv6Prefixes = ipv6Prefixes;
  }

  public ScpInfo ipv4AddrRanges(List<Ipv4AddressRange> ipv4AddrRanges) {
    this.ipv4AddrRanges = ipv4AddrRanges;
    return this;
  }

  public ScpInfo addIpv4AddrRangesItem(Ipv4AddressRange ipv4AddrRangesItem) {
    if (this.ipv4AddrRanges == null) {
      this.ipv4AddrRanges = new ArrayList<>();
    }
    this.ipv4AddrRanges.add(ipv4AddrRangesItem);
    return this;
  }

  /**
   * Get ipv4AddrRanges
   * @return ipv4AddrRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv4AddressRange> getIpv4AddrRanges() {
    return ipv4AddrRanges;
  }

  public void setIpv4AddrRanges(List<Ipv4AddressRange> ipv4AddrRanges) {
    this.ipv4AddrRanges = ipv4AddrRanges;
  }

  public ScpInfo ipv6PrefixRanges(List<Ipv6PrefixRange> ipv6PrefixRanges) {
    this.ipv6PrefixRanges = ipv6PrefixRanges;
    return this;
  }

  public ScpInfo addIpv6PrefixRangesItem(Ipv6PrefixRange ipv6PrefixRangesItem) {
    if (this.ipv6PrefixRanges == null) {
      this.ipv6PrefixRanges = new ArrayList<>();
    }
    this.ipv6PrefixRanges.add(ipv6PrefixRangesItem);
    return this;
  }

  /**
   * Get ipv6PrefixRanges
   * @return ipv6PrefixRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv6PrefixRange> getIpv6PrefixRanges() {
    return ipv6PrefixRanges;
  }

  public void setIpv6PrefixRanges(List<Ipv6PrefixRange> ipv6PrefixRanges) {
    this.ipv6PrefixRanges = ipv6PrefixRanges;
  }

  public ScpInfo servedNfSetIdList(List<String> servedNfSetIdList) {
    this.servedNfSetIdList = servedNfSetIdList;
    return this;
  }

  public ScpInfo addServedNfSetIdListItem(String servedNfSetIdListItem) {
    if (this.servedNfSetIdList == null) {
      this.servedNfSetIdList = new ArrayList<>();
    }
    this.servedNfSetIdList.add(servedNfSetIdListItem);
    return this;
  }

  /**
   * Get servedNfSetIdList
   * @return servedNfSetIdList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getServedNfSetIdList() {
    return servedNfSetIdList;
  }

  public void setServedNfSetIdList(List<String> servedNfSetIdList) {
    this.servedNfSetIdList = servedNfSetIdList;
  }

  public ScpInfo remotePlmnList(List<PlmnId> remotePlmnList) {
    this.remotePlmnList = remotePlmnList;
    return this;
  }

  public ScpInfo addRemotePlmnListItem(PlmnId remotePlmnListItem) {
    if (this.remotePlmnList == null) {
      this.remotePlmnList = new ArrayList<>();
    }
    this.remotePlmnList.add(remotePlmnListItem);
    return this;
  }

  /**
   * Get remotePlmnList
   * @return remotePlmnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnId> getRemotePlmnList() {
    return remotePlmnList;
  }

  public void setRemotePlmnList(List<PlmnId> remotePlmnList) {
    this.remotePlmnList = remotePlmnList;
  }

  public ScpInfo ipReachability(IpReachability ipReachability) {
    this.ipReachability = ipReachability;
    return this;
  }

  /**
   * Get ipReachability
   * @return ipReachability
  */
  @ApiModelProperty(value = "")

  @Valid

  public IpReachability getIpReachability() {
    return ipReachability;
  }

  public void setIpReachability(IpReachability ipReachability) {
    this.ipReachability = ipReachability;
  }

  public ScpInfo scpCapabilities(List<ScpCapability> scpCapabilities) {
    this.scpCapabilities = scpCapabilities;
    return this;
  }

  public ScpInfo addScpCapabilitiesItem(ScpCapability scpCapabilitiesItem) {
    if (this.scpCapabilities == null) {
      this.scpCapabilities = new ArrayList<>();
    }
    this.scpCapabilities.add(scpCapabilitiesItem);
    return this;
  }

  /**
   * Get scpCapabilities
   * @return scpCapabilities
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ScpCapability> getScpCapabilities() {
    return scpCapabilities;
  }

  public void setScpCapabilities(List<ScpCapability> scpCapabilities) {
    this.scpCapabilities = scpCapabilities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScpInfo scpInfo = (ScpInfo) o;
    return Objects.equals(this.scpDomainInfoList, scpInfo.scpDomainInfoList) &&
        Objects.equals(this.scpPrefix, scpInfo.scpPrefix) &&
        Objects.equals(this.scpPorts, scpInfo.scpPorts) &&
        Objects.equals(this.addressDomains, scpInfo.addressDomains) &&
        Objects.equals(this.ipv4Addresses, scpInfo.ipv4Addresses) &&
        Objects.equals(this.ipv6Prefixes, scpInfo.ipv6Prefixes) &&
        Objects.equals(this.ipv4AddrRanges, scpInfo.ipv4AddrRanges) &&
        Objects.equals(this.ipv6PrefixRanges, scpInfo.ipv6PrefixRanges) &&
        Objects.equals(this.servedNfSetIdList, scpInfo.servedNfSetIdList) &&
        Objects.equals(this.remotePlmnList, scpInfo.remotePlmnList) &&
        Objects.equals(this.ipReachability, scpInfo.ipReachability) &&
        Objects.equals(this.scpCapabilities, scpInfo.scpCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scpDomainInfoList, scpPrefix, scpPorts, addressDomains, ipv4Addresses, ipv6Prefixes, ipv4AddrRanges, ipv6PrefixRanges, servedNfSetIdList, remotePlmnList, ipReachability, scpCapabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScpInfo {\n");
    
    sb.append("    scpDomainInfoList: ").append(toIndentedString(scpDomainInfoList)).append("\n");
    sb.append("    scpPrefix: ").append(toIndentedString(scpPrefix)).append("\n");
    sb.append("    scpPorts: ").append(toIndentedString(scpPorts)).append("\n");
    sb.append("    addressDomains: ").append(toIndentedString(addressDomains)).append("\n");
    sb.append("    ipv4Addresses: ").append(toIndentedString(ipv4Addresses)).append("\n");
    sb.append("    ipv6Prefixes: ").append(toIndentedString(ipv6Prefixes)).append("\n");
    sb.append("    ipv4AddrRanges: ").append(toIndentedString(ipv4AddrRanges)).append("\n");
    sb.append("    ipv6PrefixRanges: ").append(toIndentedString(ipv6PrefixRanges)).append("\n");
    sb.append("    servedNfSetIdList: ").append(toIndentedString(servedNfSetIdList)).append("\n");
    sb.append("    remotePlmnList: ").append(toIndentedString(remotePlmnList)).append("\n");
    sb.append("    ipReachability: ").append(toIndentedString(ipReachability)).append("\n");
    sb.append("    scpCapabilities: ").append(toIndentedString(scpCapabilities)).append("\n");
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

