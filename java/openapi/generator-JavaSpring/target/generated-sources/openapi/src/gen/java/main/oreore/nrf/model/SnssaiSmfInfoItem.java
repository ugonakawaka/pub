package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.DnnSmfInfoItem;
import oreore.nrf.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Set of parameters supported by SMF for a given S-NSSAI
 */
@ApiModel(description = "Set of parameters supported by SMF for a given S-NSSAI")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SnssaiSmfInfoItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sNssai")
  private Snssai sNssai;

  @JsonProperty("dnnSmfInfoList")
  @Valid
  private List<DnnSmfInfoItem> dnnSmfInfoList = new ArrayList<>();

  public SnssaiSmfInfoItem sNssai(Snssai sNssai) {
    this.sNssai = sNssai;
    return this;
  }

  /**
   * Get sNssai
   * @return sNssai
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Snssai getsNssai() {
    return sNssai;
  }

  public void setsNssai(Snssai sNssai) {
    this.sNssai = sNssai;
  }

  public SnssaiSmfInfoItem dnnSmfInfoList(List<DnnSmfInfoItem> dnnSmfInfoList) {
    this.dnnSmfInfoList = dnnSmfInfoList;
    return this;
  }

  public SnssaiSmfInfoItem addDnnSmfInfoListItem(DnnSmfInfoItem dnnSmfInfoListItem) {
    this.dnnSmfInfoList.add(dnnSmfInfoListItem);
    return this;
  }

  /**
   * Get dnnSmfInfoList
   * @return dnnSmfInfoList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<DnnSmfInfoItem> getDnnSmfInfoList() {
    return dnnSmfInfoList;
  }

  public void setDnnSmfInfoList(List<DnnSmfInfoItem> dnnSmfInfoList) {
    this.dnnSmfInfoList = dnnSmfInfoList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnssaiSmfInfoItem snssaiSmfInfoItem = (SnssaiSmfInfoItem) o;
    return Objects.equals(this.sNssai, snssaiSmfInfoItem.sNssai) &&
        Objects.equals(this.dnnSmfInfoList, snssaiSmfInfoItem.dnnSmfInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sNssai, dnnSmfInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnssaiSmfInfoItem {\n");
    
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    dnnSmfInfoList: ").append(toIndentedString(dnnSmfInfoList)).append("\n");
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

