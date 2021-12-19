package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.DataSetId;
import oreore.nrf.model.IdentityRange;
import oreore.nrf.model.SupiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an UDR NF Instance
 */
@ApiModel(description = "Information of an UDR NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class UdrInfo  implements Serializable {
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

  @JsonProperty("supportedDataSets")
  @Valid
  private List<DataSetId> supportedDataSets = null;

  public UdrInfo groupId(String groupId) {
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

  public UdrInfo supiRanges(List<SupiRange> supiRanges) {
    this.supiRanges = supiRanges;
    return this;
  }

  public UdrInfo addSupiRangesItem(SupiRange supiRangesItem) {
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

  public UdrInfo gpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
    return this;
  }

  public UdrInfo addGpsiRangesItem(IdentityRange gpsiRangesItem) {
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

  public UdrInfo externalGroupIdentifiersRanges(List<IdentityRange> externalGroupIdentifiersRanges) {
    this.externalGroupIdentifiersRanges = externalGroupIdentifiersRanges;
    return this;
  }

  public UdrInfo addExternalGroupIdentifiersRangesItem(IdentityRange externalGroupIdentifiersRangesItem) {
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

  public UdrInfo supportedDataSets(List<DataSetId> supportedDataSets) {
    this.supportedDataSets = supportedDataSets;
    return this;
  }

  public UdrInfo addSupportedDataSetsItem(DataSetId supportedDataSetsItem) {
    if (this.supportedDataSets == null) {
      this.supportedDataSets = new ArrayList<>();
    }
    this.supportedDataSets.add(supportedDataSetsItem);
    return this;
  }

  /**
   * Get supportedDataSets
   * @return supportedDataSets
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<DataSetId> getSupportedDataSets() {
    return supportedDataSets;
  }

  public void setSupportedDataSets(List<DataSetId> supportedDataSets) {
    this.supportedDataSets = supportedDataSets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UdrInfo udrInfo = (UdrInfo) o;
    return Objects.equals(this.groupId, udrInfo.groupId) &&
        Objects.equals(this.supiRanges, udrInfo.supiRanges) &&
        Objects.equals(this.gpsiRanges, udrInfo.gpsiRanges) &&
        Objects.equals(this.externalGroupIdentifiersRanges, udrInfo.externalGroupIdentifiersRanges) &&
        Objects.equals(this.supportedDataSets, udrInfo.supportedDataSets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, supiRanges, gpsiRanges, externalGroupIdentifiersRanges, supportedDataSets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UdrInfo {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    supiRanges: ").append(toIndentedString(supiRanges)).append("\n");
    sb.append("    gpsiRanges: ").append(toIndentedString(gpsiRanges)).append("\n");
    sb.append("    externalGroupIdentifiersRanges: ").append(toIndentedString(externalGroupIdentifiersRanges)).append("\n");
    sb.append("    supportedDataSets: ").append(toIndentedString(supportedDataSets)).append("\n");
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

