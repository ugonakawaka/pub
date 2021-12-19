package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.DnnEasdfInfoItem;
import oreore.nrf.model.ExtSnssai;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Set of parameters supported by EASDF for a given S-NSSAI
 */
@ApiModel(description = "Set of parameters supported by EASDF for a given S-NSSAI")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SnssaiEasdfInfoItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sNssai")
  private ExtSnssai sNssai;

  @JsonProperty("dnnEasdfInfoList")
  @Valid
  private List<DnnEasdfInfoItem> dnnEasdfInfoList = new ArrayList<>();

  public SnssaiEasdfInfoItem sNssai(ExtSnssai sNssai) {
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

  public ExtSnssai getsNssai() {
    return sNssai;
  }

  public void setsNssai(ExtSnssai sNssai) {
    this.sNssai = sNssai;
  }

  public SnssaiEasdfInfoItem dnnEasdfInfoList(List<DnnEasdfInfoItem> dnnEasdfInfoList) {
    this.dnnEasdfInfoList = dnnEasdfInfoList;
    return this;
  }

  public SnssaiEasdfInfoItem addDnnEasdfInfoListItem(DnnEasdfInfoItem dnnEasdfInfoListItem) {
    this.dnnEasdfInfoList.add(dnnEasdfInfoListItem);
    return this;
  }

  /**
   * Get dnnEasdfInfoList
   * @return dnnEasdfInfoList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<DnnEasdfInfoItem> getDnnEasdfInfoList() {
    return dnnEasdfInfoList;
  }

  public void setDnnEasdfInfoList(List<DnnEasdfInfoItem> dnnEasdfInfoList) {
    this.dnnEasdfInfoList = dnnEasdfInfoList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnssaiEasdfInfoItem snssaiEasdfInfoItem = (SnssaiEasdfInfoItem) o;
    return Objects.equals(this.sNssai, snssaiEasdfInfoItem.sNssai) &&
        Objects.equals(this.dnnEasdfInfoList, snssaiEasdfInfoItem.dnnEasdfInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sNssai, dnnEasdfInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnssaiEasdfInfoItem {\n");
    
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    dnnEasdfInfoList: ").append(toIndentedString(dnnEasdfInfoList)).append("\n");
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

