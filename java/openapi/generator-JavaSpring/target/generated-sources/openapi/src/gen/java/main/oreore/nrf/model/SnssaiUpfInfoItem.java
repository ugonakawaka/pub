package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.DnnUpfInfoItem;
import oreore.nrf.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Set of parameters supported by UPF for a given S-NSSAI
 */
@ApiModel(description = "Set of parameters supported by UPF for a given S-NSSAI")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SnssaiUpfInfoItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sNssai")
  private Snssai sNssai;

  @JsonProperty("dnnUpfInfoList")
  @Valid
  private List<DnnUpfInfoItem> dnnUpfInfoList = new ArrayList<>();

  @JsonProperty("redundantTransport")
  private Boolean redundantTransport = false;

  public SnssaiUpfInfoItem sNssai(Snssai sNssai) {
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

  public SnssaiUpfInfoItem dnnUpfInfoList(List<DnnUpfInfoItem> dnnUpfInfoList) {
    this.dnnUpfInfoList = dnnUpfInfoList;
    return this;
  }

  public SnssaiUpfInfoItem addDnnUpfInfoListItem(DnnUpfInfoItem dnnUpfInfoListItem) {
    this.dnnUpfInfoList.add(dnnUpfInfoListItem);
    return this;
  }

  /**
   * Get dnnUpfInfoList
   * @return dnnUpfInfoList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<DnnUpfInfoItem> getDnnUpfInfoList() {
    return dnnUpfInfoList;
  }

  public void setDnnUpfInfoList(List<DnnUpfInfoItem> dnnUpfInfoList) {
    this.dnnUpfInfoList = dnnUpfInfoList;
  }

  public SnssaiUpfInfoItem redundantTransport(Boolean redundantTransport) {
    this.redundantTransport = redundantTransport;
    return this;
  }

  /**
   * Get redundantTransport
   * @return redundantTransport
  */
  @ApiModelProperty(value = "")


  public Boolean getRedundantTransport() {
    return redundantTransport;
  }

  public void setRedundantTransport(Boolean redundantTransport) {
    this.redundantTransport = redundantTransport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnssaiUpfInfoItem snssaiUpfInfoItem = (SnssaiUpfInfoItem) o;
    return Objects.equals(this.sNssai, snssaiUpfInfoItem.sNssai) &&
        Objects.equals(this.dnnUpfInfoList, snssaiUpfInfoItem.dnnUpfInfoList) &&
        Objects.equals(this.redundantTransport, snssaiUpfInfoItem.redundantTransport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sNssai, dnnUpfInfoList, redundantTransport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnssaiUpfInfoItem {\n");
    
    sb.append("    sNssai: ").append(toIndentedString(sNssai)).append("\n");
    sb.append("    dnnUpfInfoList: ").append(toIndentedString(dnnUpfInfoList)).append("\n");
    sb.append("    redundantTransport: ").append(toIndentedString(redundantTransport)).append("\n");
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

