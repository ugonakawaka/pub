package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.NFType;
import oreore.nrf.model.Tai;
import oreore.nrf.model.TaiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a DCCF NF Instance
 */
@ApiModel(description = "Information of a DCCF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class DccfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("servingNfTypeList")
  @Valid
  private List<NFType> servingNfTypeList = null;

  @JsonProperty("servingNfSetIdList")
  @Valid
  private List<String> servingNfSetIdList = null;

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  @JsonProperty("taiRangeList")
  @Valid
  private List<TaiRange> taiRangeList = null;

  public DccfInfo servingNfTypeList(List<NFType> servingNfTypeList) {
    this.servingNfTypeList = servingNfTypeList;
    return this;
  }

  public DccfInfo addServingNfTypeListItem(NFType servingNfTypeListItem) {
    if (this.servingNfTypeList == null) {
      this.servingNfTypeList = new ArrayList<>();
    }
    this.servingNfTypeList.add(servingNfTypeListItem);
    return this;
  }

  /**
   * Get servingNfTypeList
   * @return servingNfTypeList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NFType> getServingNfTypeList() {
    return servingNfTypeList;
  }

  public void setServingNfTypeList(List<NFType> servingNfTypeList) {
    this.servingNfTypeList = servingNfTypeList;
  }

  public DccfInfo servingNfSetIdList(List<String> servingNfSetIdList) {
    this.servingNfSetIdList = servingNfSetIdList;
    return this;
  }

  public DccfInfo addServingNfSetIdListItem(String servingNfSetIdListItem) {
    if (this.servingNfSetIdList == null) {
      this.servingNfSetIdList = new ArrayList<>();
    }
    this.servingNfSetIdList.add(servingNfSetIdListItem);
    return this;
  }

  /**
   * Get servingNfSetIdList
   * @return servingNfSetIdList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getServingNfSetIdList() {
    return servingNfSetIdList;
  }

  public void setServingNfSetIdList(List<String> servingNfSetIdList) {
    this.servingNfSetIdList = servingNfSetIdList;
  }

  public DccfInfo taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public DccfInfo addTaiListItem(Tai taiListItem) {
    if (this.taiList == null) {
      this.taiList = new ArrayList<>();
    }
    this.taiList.add(taiListItem);
    return this;
  }

  /**
   * Get taiList
   * @return taiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Tai> getTaiList() {
    return taiList;
  }

  public void setTaiList(List<Tai> taiList) {
    this.taiList = taiList;
  }

  public DccfInfo taiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
    return this;
  }

  public DccfInfo addTaiRangeListItem(TaiRange taiRangeListItem) {
    if (this.taiRangeList == null) {
      this.taiRangeList = new ArrayList<>();
    }
    this.taiRangeList.add(taiRangeListItem);
    return this;
  }

  /**
   * Get taiRangeList
   * @return taiRangeList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<TaiRange> getTaiRangeList() {
    return taiRangeList;
  }

  public void setTaiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DccfInfo dccfInfo = (DccfInfo) o;
    return Objects.equals(this.servingNfTypeList, dccfInfo.servingNfTypeList) &&
        Objects.equals(this.servingNfSetIdList, dccfInfo.servingNfSetIdList) &&
        Objects.equals(this.taiList, dccfInfo.taiList) &&
        Objects.equals(this.taiRangeList, dccfInfo.taiRangeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servingNfTypeList, servingNfSetIdList, taiList, taiRangeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DccfInfo {\n");
    
    sb.append("    servingNfTypeList: ").append(toIndentedString(servingNfTypeList)).append("\n");
    sb.append("    servingNfSetIdList: ").append(toIndentedString(servingNfSetIdList)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
    sb.append("    taiRangeList: ").append(toIndentedString(taiRangeList)).append("\n");
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

