package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NFs, based on the slices (S-NSSAI and NSI) they support
 */
@ApiModel(description = "Subscription to a set of NFs, based on the slices (S-NSSAI and NSI) they support")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NetworkSliceCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("snssaiList")
  @Valid
  private List<Snssai> snssaiList = new ArrayList<>();

  @JsonProperty("nsiList")
  @Valid
  private List<String> nsiList = null;

  public NetworkSliceCond snssaiList(List<Snssai> snssaiList) {
    this.snssaiList = snssaiList;
    return this;
  }

  public NetworkSliceCond addSnssaiListItem(Snssai snssaiListItem) {
    this.snssaiList.add(snssaiListItem);
    return this;
  }

  /**
   * Get snssaiList
   * @return snssaiList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Snssai> getSnssaiList() {
    return snssaiList;
  }

  public void setSnssaiList(List<Snssai> snssaiList) {
    this.snssaiList = snssaiList;
  }

  public NetworkSliceCond nsiList(List<String> nsiList) {
    this.nsiList = nsiList;
    return this;
  }

  public NetworkSliceCond addNsiListItem(String nsiListItem) {
    if (this.nsiList == null) {
      this.nsiList = new ArrayList<>();
    }
    this.nsiList.add(nsiListItem);
    return this;
  }

  /**
   * Get nsiList
   * @return nsiList
  */
  @ApiModelProperty(value = "")


  public List<String> getNsiList() {
    return nsiList;
  }

  public void setNsiList(List<String> nsiList) {
    this.nsiList = nsiList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSliceCond networkSliceCond = (NetworkSliceCond) o;
    return Objects.equals(this.snssaiList, networkSliceCond.snssaiList) &&
        Objects.equals(this.nsiList, networkSliceCond.nsiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snssaiList, nsiList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSliceCond {\n");
    
    sb.append("    snssaiList: ").append(toIndentedString(snssaiList)).append("\n");
    sb.append("    nsiList: ").append(toIndentedString(nsiList)).append("\n");
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

