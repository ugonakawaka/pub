package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.Ipv4AddressRange;
import oreore.nrf.model.Ipv6PrefixRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a BSF NF Instance
 */
@ApiModel(description = "Information of a BSF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class BsfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dnnList")
  @Valid
  private List<String> dnnList = null;

  @JsonProperty("ipDomainList")
  @Valid
  private List<String> ipDomainList = null;

  @JsonProperty("ipv4AddressRanges")
  @Valid
  private List<Ipv4AddressRange> ipv4AddressRanges = null;

  @JsonProperty("ipv6PrefixRanges")
  @Valid
  private List<Ipv6PrefixRange> ipv6PrefixRanges = null;

  @JsonProperty("rxDiamHost")
  private String rxDiamHost;

  @JsonProperty("rxDiamRealm")
  private String rxDiamRealm;

  public BsfInfo dnnList(List<String> dnnList) {
    this.dnnList = dnnList;
    return this;
  }

  public BsfInfo addDnnListItem(String dnnListItem) {
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

  public BsfInfo ipDomainList(List<String> ipDomainList) {
    this.ipDomainList = ipDomainList;
    return this;
  }

  public BsfInfo addIpDomainListItem(String ipDomainListItem) {
    if (this.ipDomainList == null) {
      this.ipDomainList = new ArrayList<>();
    }
    this.ipDomainList.add(ipDomainListItem);
    return this;
  }

  /**
   * Get ipDomainList
   * @return ipDomainList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getIpDomainList() {
    return ipDomainList;
  }

  public void setIpDomainList(List<String> ipDomainList) {
    this.ipDomainList = ipDomainList;
  }

  public BsfInfo ipv4AddressRanges(List<Ipv4AddressRange> ipv4AddressRanges) {
    this.ipv4AddressRanges = ipv4AddressRanges;
    return this;
  }

  public BsfInfo addIpv4AddressRangesItem(Ipv4AddressRange ipv4AddressRangesItem) {
    if (this.ipv4AddressRanges == null) {
      this.ipv4AddressRanges = new ArrayList<>();
    }
    this.ipv4AddressRanges.add(ipv4AddressRangesItem);
    return this;
  }

  /**
   * Get ipv4AddressRanges
   * @return ipv4AddressRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv4AddressRange> getIpv4AddressRanges() {
    return ipv4AddressRanges;
  }

  public void setIpv4AddressRanges(List<Ipv4AddressRange> ipv4AddressRanges) {
    this.ipv4AddressRanges = ipv4AddressRanges;
  }

  public BsfInfo ipv6PrefixRanges(List<Ipv6PrefixRange> ipv6PrefixRanges) {
    this.ipv6PrefixRanges = ipv6PrefixRanges;
    return this;
  }

  public BsfInfo addIpv6PrefixRangesItem(Ipv6PrefixRange ipv6PrefixRangesItem) {
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

  public BsfInfo rxDiamHost(String rxDiamHost) {
    this.rxDiamHost = rxDiamHost;
    return this;
  }

  /**
   * string containing an FQDN or realm as defined in RFC 6733.
   * @return rxDiamHost
  */
  @ApiModelProperty(value = "string containing an FQDN or realm as defined in RFC 6733.")

@Pattern(regexp = "^([A-Za-z0-9]+([-A-Za-z0-9]+)\\.)+[a-z]{2,}$") 
  public String getRxDiamHost() {
    return rxDiamHost;
  }

  public void setRxDiamHost(String rxDiamHost) {
    this.rxDiamHost = rxDiamHost;
  }

  public BsfInfo rxDiamRealm(String rxDiamRealm) {
    this.rxDiamRealm = rxDiamRealm;
    return this;
  }

  /**
   * string containing an FQDN or realm as defined in RFC 6733.
   * @return rxDiamRealm
  */
  @ApiModelProperty(value = "string containing an FQDN or realm as defined in RFC 6733.")

@Pattern(regexp = "^([A-Za-z0-9]+([-A-Za-z0-9]+)\\.)+[a-z]{2,}$") 
  public String getRxDiamRealm() {
    return rxDiamRealm;
  }

  public void setRxDiamRealm(String rxDiamRealm) {
    this.rxDiamRealm = rxDiamRealm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BsfInfo bsfInfo = (BsfInfo) o;
    return Objects.equals(this.dnnList, bsfInfo.dnnList) &&
        Objects.equals(this.ipDomainList, bsfInfo.ipDomainList) &&
        Objects.equals(this.ipv4AddressRanges, bsfInfo.ipv4AddressRanges) &&
        Objects.equals(this.ipv6PrefixRanges, bsfInfo.ipv6PrefixRanges) &&
        Objects.equals(this.rxDiamHost, bsfInfo.rxDiamHost) &&
        Objects.equals(this.rxDiamRealm, bsfInfo.rxDiamRealm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnnList, ipDomainList, ipv4AddressRanges, ipv6PrefixRanges, rxDiamHost, rxDiamRealm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BsfInfo {\n");
    
    sb.append("    dnnList: ").append(toIndentedString(dnnList)).append("\n");
    sb.append("    ipDomainList: ").append(toIndentedString(ipDomainList)).append("\n");
    sb.append("    ipv4AddressRanges: ").append(toIndentedString(ipv4AddressRanges)).append("\n");
    sb.append("    ipv6PrefixRanges: ").append(toIndentedString(ipv6PrefixRanges)).append("\n");
    sb.append("    rxDiamHost: ").append(toIndentedString(rxDiamHost)).append("\n");
    sb.append("    rxDiamRealm: ").append(toIndentedString(rxDiamRealm)).append("\n");
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

