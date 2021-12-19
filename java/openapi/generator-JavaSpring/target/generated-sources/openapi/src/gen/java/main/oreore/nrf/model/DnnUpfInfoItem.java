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
import oreore.nrf.model.Ipv4AddressRange;
import oreore.nrf.model.Ipv6PrefixRange;
import oreore.nrf.model.PduSessionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Set of parameters supported by UPF for a given DNN
 */
@ApiModel(description = "Set of parameters supported by UPF for a given DNN")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class DnnUpfInfoItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dnn")
  private String dnn;

  @JsonProperty("dnaiList")
  @Valid
  private List<String> dnaiList = null;

  @JsonProperty("pduSessionTypes")
  @Valid
  private List<PduSessionType> pduSessionTypes = null;

  @JsonProperty("ipv4AddressRanges")
  @Valid
  private List<Ipv4AddressRange> ipv4AddressRanges = null;

  @JsonProperty("ipv6PrefixRanges")
  @Valid
  private List<Ipv6PrefixRange> ipv6PrefixRanges = null;

  @JsonProperty("dnaiNwInstanceList")
  @Valid
  private Map<String, String> dnaiNwInstanceList = null;

  public DnnUpfInfoItem dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").
   * @return dnn
  */
  @ApiModelProperty(required = true, value = "String representing a Data Network as defined in clause 9A of 3GPP TS 23.003; it shall contain either a DNN Network Identifier, or a full DNN with both the Network Identifier and Operator Identifier, as specified in 3GPP TS 23.003 clause 9.1.1 and 9.1.2. It shall be coded as string in which the labels are separated by dots (e.g. \"Label1.Label2.Label3\").")
  @NotNull


  public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public DnnUpfInfoItem dnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public DnnUpfInfoItem addDnaiListItem(String dnaiListItem) {
    if (this.dnaiList == null) {
      this.dnaiList = new ArrayList<>();
    }
    this.dnaiList.add(dnaiListItem);
    return this;
  }

  /**
   * Get dnaiList
   * @return dnaiList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getDnaiList() {
    return dnaiList;
  }

  public void setDnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
  }

  public DnnUpfInfoItem pduSessionTypes(List<PduSessionType> pduSessionTypes) {
    this.pduSessionTypes = pduSessionTypes;
    return this;
  }

  public DnnUpfInfoItem addPduSessionTypesItem(PduSessionType pduSessionTypesItem) {
    if (this.pduSessionTypes == null) {
      this.pduSessionTypes = new ArrayList<>();
    }
    this.pduSessionTypes.add(pduSessionTypesItem);
    return this;
  }

  /**
   * Get pduSessionTypes
   * @return pduSessionTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PduSessionType> getPduSessionTypes() {
    return pduSessionTypes;
  }

  public void setPduSessionTypes(List<PduSessionType> pduSessionTypes) {
    this.pduSessionTypes = pduSessionTypes;
  }

  public DnnUpfInfoItem ipv4AddressRanges(List<Ipv4AddressRange> ipv4AddressRanges) {
    this.ipv4AddressRanges = ipv4AddressRanges;
    return this;
  }

  public DnnUpfInfoItem addIpv4AddressRangesItem(Ipv4AddressRange ipv4AddressRangesItem) {
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

  public DnnUpfInfoItem ipv6PrefixRanges(List<Ipv6PrefixRange> ipv6PrefixRanges) {
    this.ipv6PrefixRanges = ipv6PrefixRanges;
    return this;
  }

  public DnnUpfInfoItem addIpv6PrefixRangesItem(Ipv6PrefixRange ipv6PrefixRangesItem) {
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

  public DnnUpfInfoItem dnaiNwInstanceList(Map<String, String> dnaiNwInstanceList) {
    this.dnaiNwInstanceList = dnaiNwInstanceList;
    return this;
  }

  public DnnUpfInfoItem putDnaiNwInstanceListItem(String key, String dnaiNwInstanceListItem) {
    if (this.dnaiNwInstanceList == null) {
      this.dnaiNwInstanceList = new HashMap<>();
    }
    this.dnaiNwInstanceList.put(key, dnaiNwInstanceListItem);
    return this;
  }

  /**
   * Map of network instance per DNAI for the DNN, where the key of the map is the DNAI. When present, the value of each entry of the map shall contain a N6 network instance that is configured for the DNAI indicated by the key.
   * @return dnaiNwInstanceList
  */
  @ApiModelProperty(value = "Map of network instance per DNAI for the DNN, where the key of the map is the DNAI. When present, the value of each entry of the map shall contain a N6 network instance that is configured for the DNAI indicated by the key.")

@Size(min = 1) 
  public Map<String, String> getDnaiNwInstanceList() {
    return dnaiNwInstanceList;
  }

  public void setDnaiNwInstanceList(Map<String, String> dnaiNwInstanceList) {
    this.dnaiNwInstanceList = dnaiNwInstanceList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnnUpfInfoItem dnnUpfInfoItem = (DnnUpfInfoItem) o;
    return Objects.equals(this.dnn, dnnUpfInfoItem.dnn) &&
        Objects.equals(this.dnaiList, dnnUpfInfoItem.dnaiList) &&
        Objects.equals(this.pduSessionTypes, dnnUpfInfoItem.pduSessionTypes) &&
        Objects.equals(this.ipv4AddressRanges, dnnUpfInfoItem.ipv4AddressRanges) &&
        Objects.equals(this.ipv6PrefixRanges, dnnUpfInfoItem.ipv6PrefixRanges) &&
        Objects.equals(this.dnaiNwInstanceList, dnnUpfInfoItem.dnaiNwInstanceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnn, dnaiList, pduSessionTypes, ipv4AddressRanges, ipv6PrefixRanges, dnaiNwInstanceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnnUpfInfoItem {\n");
    
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
    sb.append("    pduSessionTypes: ").append(toIndentedString(pduSessionTypes)).append("\n");
    sb.append("    ipv4AddressRanges: ").append(toIndentedString(ipv4AddressRanges)).append("\n");
    sb.append("    ipv6PrefixRanges: ").append(toIndentedString(ipv6PrefixRanges)).append("\n");
    sb.append("    dnaiNwInstanceList: ").append(toIndentedString(dnaiNwInstanceList)).append("\n");
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

