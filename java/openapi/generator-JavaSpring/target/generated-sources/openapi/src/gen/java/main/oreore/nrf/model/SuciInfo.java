package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * SUCI information containing Routing Indicator and Home Network Public Key ID
 */
@ApiModel(description = "SUCI information containing Routing Indicator and Home Network Public Key ID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SuciInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("routingInds")
  @Valid
  private List<String> routingInds = null;

  @JsonProperty("hNwPubKeyIds")
  @Valid
  private List<Integer> hNwPubKeyIds = null;

  public SuciInfo routingInds(List<String> routingInds) {
    this.routingInds = routingInds;
    return this;
  }

  public SuciInfo addRoutingIndsItem(String routingIndsItem) {
    if (this.routingInds == null) {
      this.routingInds = new ArrayList<>();
    }
    this.routingInds.add(routingIndsItem);
    return this;
  }

  /**
   * Get routingInds
   * @return routingInds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getRoutingInds() {
    return routingInds;
  }

  public void setRoutingInds(List<String> routingInds) {
    this.routingInds = routingInds;
  }

  public SuciInfo hNwPubKeyIds(List<Integer> hNwPubKeyIds) {
    this.hNwPubKeyIds = hNwPubKeyIds;
    return this;
  }

  public SuciInfo addHNwPubKeyIdsItem(Integer hNwPubKeyIdsItem) {
    if (this.hNwPubKeyIds == null) {
      this.hNwPubKeyIds = new ArrayList<>();
    }
    this.hNwPubKeyIds.add(hNwPubKeyIdsItem);
    return this;
  }

  /**
   * Get hNwPubKeyIds
   * @return hNwPubKeyIds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<Integer> gethNwPubKeyIds() {
    return hNwPubKeyIds;
  }

  public void sethNwPubKeyIds(List<Integer> hNwPubKeyIds) {
    this.hNwPubKeyIds = hNwPubKeyIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuciInfo suciInfo = (SuciInfo) o;
    return Objects.equals(this.routingInds, suciInfo.routingInds) &&
        Objects.equals(this.hNwPubKeyIds, suciInfo.hNwPubKeyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingInds, hNwPubKeyIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuciInfo {\n");
    
    sb.append("    routingInds: ").append(toIndentedString(routingInds)).append("\n");
    sb.append("    hNwPubKeyIds: ").append(toIndentedString(hNwPubKeyIds)).append("\n");
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

