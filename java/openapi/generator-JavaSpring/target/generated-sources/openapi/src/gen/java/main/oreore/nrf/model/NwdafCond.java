package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.Snssai;
import oreore.nrf.model.Tai;
import oreore.nrf.model.TaiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NF Instances (NWDAFs), identified by Analytics ID(s), S-NSSAI(s) or NWDAF Serving Area information, i.e. list of TAIs for which the NWDAF can provide analytics.
 */
@ApiModel(description = "Subscription to a set of NF Instances (NWDAFs), identified by Analytics ID(s), S-NSSAI(s) or NWDAF Serving Area information, i.e. list of TAIs for which the NWDAF can provide analytics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NwdafCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets conditionType
   */
  public enum ConditionTypeEnum {
    NWDAF_COND("NWDAF_COND");

    private String value;

    ConditionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConditionTypeEnum fromValue(String value) {
      for (ConditionTypeEnum b : ConditionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("conditionType")
  private ConditionTypeEnum conditionType;

  @JsonProperty("analyticsIds")
  @Valid
  private List<String> analyticsIds = null;

  @JsonProperty("snssaiList")
  @Valid
  private List<Snssai> snssaiList = null;

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  @JsonProperty("taiRangeList")
  @Valid
  private List<TaiRange> taiRangeList = null;

  public NwdafCond conditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
    return this;
  }

  /**
   * Get conditionType
   * @return conditionType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public ConditionTypeEnum getConditionType() {
    return conditionType;
  }

  public void setConditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
  }

  public NwdafCond analyticsIds(List<String> analyticsIds) {
    this.analyticsIds = analyticsIds;
    return this;
  }

  public NwdafCond addAnalyticsIdsItem(String analyticsIdsItem) {
    if (this.analyticsIds == null) {
      this.analyticsIds = new ArrayList<>();
    }
    this.analyticsIds.add(analyticsIdsItem);
    return this;
  }

  /**
   * Get analyticsIds
   * @return analyticsIds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getAnalyticsIds() {
    return analyticsIds;
  }

  public void setAnalyticsIds(List<String> analyticsIds) {
    this.analyticsIds = analyticsIds;
  }

  public NwdafCond snssaiList(List<Snssai> snssaiList) {
    this.snssaiList = snssaiList;
    return this;
  }

  public NwdafCond addSnssaiListItem(Snssai snssaiListItem) {
    if (this.snssaiList == null) {
      this.snssaiList = new ArrayList<>();
    }
    this.snssaiList.add(snssaiListItem);
    return this;
  }

  /**
   * Get snssaiList
   * @return snssaiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Snssai> getSnssaiList() {
    return snssaiList;
  }

  public void setSnssaiList(List<Snssai> snssaiList) {
    this.snssaiList = snssaiList;
  }

  public NwdafCond taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public NwdafCond addTaiListItem(Tai taiListItem) {
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

  public NwdafCond taiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
    return this;
  }

  public NwdafCond addTaiRangeListItem(TaiRange taiRangeListItem) {
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
    NwdafCond nwdafCond = (NwdafCond) o;
    return Objects.equals(this.conditionType, nwdafCond.conditionType) &&
        Objects.equals(this.analyticsIds, nwdafCond.analyticsIds) &&
        Objects.equals(this.snssaiList, nwdafCond.snssaiList) &&
        Objects.equals(this.taiList, nwdafCond.taiList) &&
        Objects.equals(this.taiRangeList, nwdafCond.taiRangeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, analyticsIds, snssaiList, taiList, taiRangeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NwdafCond {\n");
    
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    analyticsIds: ").append(toIndentedString(analyticsIds)).append("\n");
    sb.append("    snssaiList: ").append(toIndentedString(snssaiList)).append("\n");
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

