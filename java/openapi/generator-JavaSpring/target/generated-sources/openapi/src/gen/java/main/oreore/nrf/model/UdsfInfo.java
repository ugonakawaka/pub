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
import oreore.nrf.model.IdentityRange;
import oreore.nrf.model.SupiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information related to UDSF
 */
@ApiModel(description = "Information related to UDSF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class UdsfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("supiRanges")
  @Valid
  private List<SupiRange> supiRanges = null;

  @JsonProperty("storageIdRanges")
  @Valid
  private Map<String, List<IdentityRange>> storageIdRanges = null;

  public UdsfInfo groupId(String groupId) {
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

  public UdsfInfo supiRanges(List<SupiRange> supiRanges) {
    this.supiRanges = supiRanges;
    return this;
  }

  public UdsfInfo addSupiRangesItem(SupiRange supiRangesItem) {
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

  public UdsfInfo storageIdRanges(Map<String, List<IdentityRange>> storageIdRanges) {
    this.storageIdRanges = storageIdRanges;
    return this;
  }

  public UdsfInfo putStorageIdRangesItem(String key, List<IdentityRange> storageIdRangesItem) {
    if (this.storageIdRanges == null) {
      this.storageIdRanges = new HashMap<>();
    }
    this.storageIdRanges.put(key, storageIdRangesItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where realmId serves as key and each value in the map is an array of IdentityRanges. Each IdentityRange is a range of storageIds.
   * @return storageIdRanges
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where realmId serves as key and each value in the map is an array of IdentityRanges. Each IdentityRange is a range of storageIds.")

  @Valid
@Size(min = 1) 
  public Map<String, List<IdentityRange>> getStorageIdRanges() {
    return storageIdRanges;
  }

  public void setStorageIdRanges(Map<String, List<IdentityRange>> storageIdRanges) {
    this.storageIdRanges = storageIdRanges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UdsfInfo udsfInfo = (UdsfInfo) o;
    return Objects.equals(this.groupId, udsfInfo.groupId) &&
        Objects.equals(this.supiRanges, udsfInfo.supiRanges) &&
        Objects.equals(this.storageIdRanges, udsfInfo.storageIdRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, supiRanges, storageIdRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UdsfInfo {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    supiRanges: ").append(toIndentedString(supiRanges)).append("\n");
    sb.append("    storageIdRanges: ").append(toIndentedString(storageIdRanges)).append("\n");
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

