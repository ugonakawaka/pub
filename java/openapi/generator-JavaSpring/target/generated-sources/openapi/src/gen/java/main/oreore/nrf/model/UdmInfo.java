package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.IdentityRange;
import oreore.nrf.model.InternalGroupIdRange;
import oreore.nrf.model.SuciInfo;
import oreore.nrf.model.SupiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an UDM NF Instance
 */
@ApiModel(description = "Information of an UDM NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class UdmInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("supiRanges")
  @Valid
  private List<SupiRange> supiRanges = null;

  @JsonProperty("gpsiRanges")
  @Valid
  private List<IdentityRange> gpsiRanges = null;

  @JsonProperty("externalGroupIdentifiersRanges")
  @Valid
  private List<IdentityRange> externalGroupIdentifiersRanges = null;

  @JsonProperty("routingIndicators")
  @Valid
  private List<String> routingIndicators = null;

  @JsonProperty("internalGroupIdentifiersRanges")
  @Valid
  private List<InternalGroupIdRange> internalGroupIdentifiersRanges = null;

  @JsonProperty("suciInfos")
  @Valid
  private List<SuciInfo> suciInfos = null;

  public UdmInfo groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Identifier of a group of NFs.
   * @return groupId
  */
  @ApiModelProperty(value = "Identifier of a group of NFs.")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public UdmInfo supiRanges(List<SupiRange> supiRanges) {
    this.supiRanges = supiRanges;
    return this;
  }

  public UdmInfo addSupiRangesItem(SupiRange supiRangesItem) {
    if (this.supiRanges == null) {
      this.supiRanges = new ArrayList<>();
    }
    this.supiRanges.add(supiRangesItem);
    return this;
  }

  /**
   * Get supiRanges
   * @return supiRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<SupiRange> getSupiRanges() {
    return supiRanges;
  }

  public void setSupiRanges(List<SupiRange> supiRanges) {
    this.supiRanges = supiRanges;
  }

  public UdmInfo gpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
    return this;
  }

  public UdmInfo addGpsiRangesItem(IdentityRange gpsiRangesItem) {
    if (this.gpsiRanges == null) {
      this.gpsiRanges = new ArrayList<>();
    }
    this.gpsiRanges.add(gpsiRangesItem);
    return this;
  }

  /**
   * Get gpsiRanges
   * @return gpsiRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getGpsiRanges() {
    return gpsiRanges;
  }

  public void setGpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
  }

  public UdmInfo externalGroupIdentifiersRanges(List<IdentityRange> externalGroupIdentifiersRanges) {
    this.externalGroupIdentifiersRanges = externalGroupIdentifiersRanges;
    return this;
  }

  public UdmInfo addExternalGroupIdentifiersRangesItem(IdentityRange externalGroupIdentifiersRangesItem) {
    if (this.externalGroupIdentifiersRanges == null) {
      this.externalGroupIdentifiersRanges = new ArrayList<>();
    }
    this.externalGroupIdentifiersRanges.add(externalGroupIdentifiersRangesItem);
    return this;
  }

  /**
   * Get externalGroupIdentifiersRanges
   * @return externalGroupIdentifiersRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getExternalGroupIdentifiersRanges() {
    return externalGroupIdentifiersRanges;
  }

  public void setExternalGroupIdentifiersRanges(List<IdentityRange> externalGroupIdentifiersRanges) {
    this.externalGroupIdentifiersRanges = externalGroupIdentifiersRanges;
  }

  public UdmInfo routingIndicators(List<String> routingIndicators) {
    this.routingIndicators = routingIndicators;
    return this;
  }

  public UdmInfo addRoutingIndicatorsItem(String routingIndicatorsItem) {
    if (this.routingIndicators == null) {
      this.routingIndicators = new ArrayList<>();
    }
    this.routingIndicators.add(routingIndicatorsItem);
    return this;
  }

  /**
   * Get routingIndicators
   * @return routingIndicators
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getRoutingIndicators() {
    return routingIndicators;
  }

  public void setRoutingIndicators(List<String> routingIndicators) {
    this.routingIndicators = routingIndicators;
  }

  public UdmInfo internalGroupIdentifiersRanges(List<InternalGroupIdRange> internalGroupIdentifiersRanges) {
    this.internalGroupIdentifiersRanges = internalGroupIdentifiersRanges;
    return this;
  }

  public UdmInfo addInternalGroupIdentifiersRangesItem(InternalGroupIdRange internalGroupIdentifiersRangesItem) {
    if (this.internalGroupIdentifiersRanges == null) {
      this.internalGroupIdentifiersRanges = new ArrayList<>();
    }
    this.internalGroupIdentifiersRanges.add(internalGroupIdentifiersRangesItem);
    return this;
  }

  /**
   * Get internalGroupIdentifiersRanges
   * @return internalGroupIdentifiersRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<InternalGroupIdRange> getInternalGroupIdentifiersRanges() {
    return internalGroupIdentifiersRanges;
  }

  public void setInternalGroupIdentifiersRanges(List<InternalGroupIdRange> internalGroupIdentifiersRanges) {
    this.internalGroupIdentifiersRanges = internalGroupIdentifiersRanges;
  }

  public UdmInfo suciInfos(List<SuciInfo> suciInfos) {
    this.suciInfos = suciInfos;
    return this;
  }

  public UdmInfo addSuciInfosItem(SuciInfo suciInfosItem) {
    if (this.suciInfos == null) {
      this.suciInfos = new ArrayList<>();
    }
    this.suciInfos.add(suciInfosItem);
    return this;
  }

  /**
   * Get suciInfos
   * @return suciInfos
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<SuciInfo> getSuciInfos() {
    return suciInfos;
  }

  public void setSuciInfos(List<SuciInfo> suciInfos) {
    this.suciInfos = suciInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UdmInfo udmInfo = (UdmInfo) o;
    return Objects.equals(this.groupId, udmInfo.groupId) &&
        Objects.equals(this.supiRanges, udmInfo.supiRanges) &&
        Objects.equals(this.gpsiRanges, udmInfo.gpsiRanges) &&
        Objects.equals(this.externalGroupIdentifiersRanges, udmInfo.externalGroupIdentifiersRanges) &&
        Objects.equals(this.routingIndicators, udmInfo.routingIndicators) &&
        Objects.equals(this.internalGroupIdentifiersRanges, udmInfo.internalGroupIdentifiersRanges) &&
        Objects.equals(this.suciInfos, udmInfo.suciInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, supiRanges, gpsiRanges, externalGroupIdentifiersRanges, routingIndicators, internalGroupIdentifiersRanges, suciInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UdmInfo {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    supiRanges: ").append(toIndentedString(supiRanges)).append("\n");
    sb.append("    gpsiRanges: ").append(toIndentedString(gpsiRanges)).append("\n");
    sb.append("    externalGroupIdentifiersRanges: ").append(toIndentedString(externalGroupIdentifiersRanges)).append("\n");
    sb.append("    routingIndicators: ").append(toIndentedString(routingIndicators)).append("\n");
    sb.append("    internalGroupIdentifiersRanges: ").append(toIndentedString(internalGroupIdentifiersRanges)).append("\n");
    sb.append("    suciInfos: ").append(toIndentedString(suciInfos)).append("\n");
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

