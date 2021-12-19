package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import oreore.nrf.model.IdentityRange;
import oreore.nrf.model.PlmnRange;
import oreore.nrf.model.SupiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a CHF NF Instance
 */
@ApiModel(description = "Information of a CHF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class ChfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("supiRangeList")
  @Valid
  private List<SupiRange> supiRangeList = null;

  @JsonProperty("gpsiRangeList")
  @Valid
  private List<IdentityRange> gpsiRangeList = null;

  @JsonProperty("plmnRangeList")
  @Valid
  private List<PlmnRange> plmnRangeList = null;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("primaryChfInstance")
  private UUID primaryChfInstance;

  @JsonProperty("secondaryChfInstance")
  private UUID secondaryChfInstance;

  public ChfInfo supiRangeList(List<SupiRange> supiRangeList) {
    this.supiRangeList = supiRangeList;
    return this;
  }

  public ChfInfo addSupiRangeListItem(SupiRange supiRangeListItem) {
    if (this.supiRangeList == null) {
      this.supiRangeList = new ArrayList<>();
    }
    this.supiRangeList.add(supiRangeListItem);
    return this;
  }

  /**
   * Get supiRangeList
   * @return supiRangeList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<SupiRange> getSupiRangeList() {
    return supiRangeList;
  }

  public void setSupiRangeList(List<SupiRange> supiRangeList) {
    this.supiRangeList = supiRangeList;
  }

  public ChfInfo gpsiRangeList(List<IdentityRange> gpsiRangeList) {
    this.gpsiRangeList = gpsiRangeList;
    return this;
  }

  public ChfInfo addGpsiRangeListItem(IdentityRange gpsiRangeListItem) {
    if (this.gpsiRangeList == null) {
      this.gpsiRangeList = new ArrayList<>();
    }
    this.gpsiRangeList.add(gpsiRangeListItem);
    return this;
  }

  /**
   * Get gpsiRangeList
   * @return gpsiRangeList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getGpsiRangeList() {
    return gpsiRangeList;
  }

  public void setGpsiRangeList(List<IdentityRange> gpsiRangeList) {
    this.gpsiRangeList = gpsiRangeList;
  }

  public ChfInfo plmnRangeList(List<PlmnRange> plmnRangeList) {
    this.plmnRangeList = plmnRangeList;
    return this;
  }

  public ChfInfo addPlmnRangeListItem(PlmnRange plmnRangeListItem) {
    if (this.plmnRangeList == null) {
      this.plmnRangeList = new ArrayList<>();
    }
    this.plmnRangeList.add(plmnRangeListItem);
    return this;
  }

  /**
   * Get plmnRangeList
   * @return plmnRangeList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnRange> getPlmnRangeList() {
    return plmnRangeList;
  }

  public void setPlmnRangeList(List<PlmnRange> plmnRangeList) {
    this.plmnRangeList = plmnRangeList;
  }

  public ChfInfo groupId(String groupId) {
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

  public ChfInfo primaryChfInstance(UUID primaryChfInstance) {
    this.primaryChfInstance = primaryChfInstance;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return primaryChfInstance
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getPrimaryChfInstance() {
    return primaryChfInstance;
  }

  public void setPrimaryChfInstance(UUID primaryChfInstance) {
    this.primaryChfInstance = primaryChfInstance;
  }

  public ChfInfo secondaryChfInstance(UUID secondaryChfInstance) {
    this.secondaryChfInstance = secondaryChfInstance;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return secondaryChfInstance
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getSecondaryChfInstance() {
    return secondaryChfInstance;
  }

  public void setSecondaryChfInstance(UUID secondaryChfInstance) {
    this.secondaryChfInstance = secondaryChfInstance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChfInfo chfInfo = (ChfInfo) o;
    return Objects.equals(this.supiRangeList, chfInfo.supiRangeList) &&
        Objects.equals(this.gpsiRangeList, chfInfo.gpsiRangeList) &&
        Objects.equals(this.plmnRangeList, chfInfo.plmnRangeList) &&
        Objects.equals(this.groupId, chfInfo.groupId) &&
        Objects.equals(this.primaryChfInstance, chfInfo.primaryChfInstance) &&
        Objects.equals(this.secondaryChfInstance, chfInfo.secondaryChfInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supiRangeList, gpsiRangeList, plmnRangeList, groupId, primaryChfInstance, secondaryChfInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChfInfo {\n");
    
    sb.append("    supiRangeList: ").append(toIndentedString(supiRangeList)).append("\n");
    sb.append("    gpsiRangeList: ").append(toIndentedString(gpsiRangeList)).append("\n");
    sb.append("    plmnRangeList: ").append(toIndentedString(plmnRangeList)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    primaryChfInstance: ").append(toIndentedString(primaryChfInstance)).append("\n");
    sb.append("    secondaryChfInstance: ").append(toIndentedString(secondaryChfInstance)).append("\n");
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

