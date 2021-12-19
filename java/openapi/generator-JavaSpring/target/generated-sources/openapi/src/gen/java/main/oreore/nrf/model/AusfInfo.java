package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.SuciInfo;
import oreore.nrf.model.SupiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an AUSF NF Instance
 */
@ApiModel(description = "Information of an AUSF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class AusfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("supiRanges")
  @Valid
  private List<SupiRange> supiRanges = null;

  @JsonProperty("routingIndicators")
  @Valid
  private List<String> routingIndicators = null;

  @JsonProperty("suciInfos")
  @Valid
  private List<SuciInfo> suciInfos = null;

  public AusfInfo groupId(String groupId) {
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

  public AusfInfo supiRanges(List<SupiRange> supiRanges) {
    this.supiRanges = supiRanges;
    return this;
  }

  public AusfInfo addSupiRangesItem(SupiRange supiRangesItem) {
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

  public AusfInfo routingIndicators(List<String> routingIndicators) {
    this.routingIndicators = routingIndicators;
    return this;
  }

  public AusfInfo addRoutingIndicatorsItem(String routingIndicatorsItem) {
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

  public AusfInfo suciInfos(List<SuciInfo> suciInfos) {
    this.suciInfos = suciInfos;
    return this;
  }

  public AusfInfo addSuciInfosItem(SuciInfo suciInfosItem) {
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
    AusfInfo ausfInfo = (AusfInfo) o;
    return Objects.equals(this.groupId, ausfInfo.groupId) &&
        Objects.equals(this.supiRanges, ausfInfo.supiRanges) &&
        Objects.equals(this.routingIndicators, ausfInfo.routingIndicators) &&
        Objects.equals(this.suciInfos, ausfInfo.suciInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, supiRanges, routingIndicators, suciInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AusfInfo {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    supiRanges: ").append(toIndentedString(supiRanges)).append("\n");
    sb.append("    routingIndicators: ").append(toIndentedString(routingIndicators)).append("\n");
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

