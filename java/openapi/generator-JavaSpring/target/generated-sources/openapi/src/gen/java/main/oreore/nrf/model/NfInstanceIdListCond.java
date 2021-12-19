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
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a list of NF Instances
 */
@ApiModel(description = "Subscription to a list of NF Instances")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NfInstanceIdListCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nfInstanceIdList")
  @Valid
  private List<UUID> nfInstanceIdList = new ArrayList<>();

  public NfInstanceIdListCond nfInstanceIdList(List<UUID> nfInstanceIdList) {
    this.nfInstanceIdList = nfInstanceIdList;
    return this;
  }

  public NfInstanceIdListCond addNfInstanceIdListItem(UUID nfInstanceIdListItem) {
    this.nfInstanceIdList.add(nfInstanceIdListItem);
    return this;
  }

  /**
   * Get nfInstanceIdList
   * @return nfInstanceIdList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<UUID> getNfInstanceIdList() {
    return nfInstanceIdList;
  }

  public void setNfInstanceIdList(List<UUID> nfInstanceIdList) {
    this.nfInstanceIdList = nfInstanceIdList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfInstanceIdListCond nfInstanceIdListCond = (NfInstanceIdListCond) o;
    return Objects.equals(this.nfInstanceIdList, nfInstanceIdListCond.nfInstanceIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfInstanceIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfInstanceIdListCond {\n");
    
    sb.append("    nfInstanceIdList: ").append(toIndentedString(nfInstanceIdList)).append("\n");
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

