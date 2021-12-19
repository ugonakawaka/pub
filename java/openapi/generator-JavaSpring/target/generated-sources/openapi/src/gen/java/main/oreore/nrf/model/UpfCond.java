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
import oreore.nrf.model.Tai;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NF Instances (UPFs), able to serve a certain service area (i.e. SMF serving area or TAI list)
 */
@ApiModel(description = "Subscription to a set of NF Instances (UPFs), able to serve a certain service area (i.e. SMF serving area or TAI list)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class UpfCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets conditionType
   */
  public enum ConditionTypeEnum {
    UPF_COND("UPF_COND");

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

  @JsonProperty("smfServingArea")
  @Valid
  private List<String> smfServingArea = null;

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  public UpfCond conditionType(ConditionTypeEnum conditionType) {
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

  public UpfCond smfServingArea(List<String> smfServingArea) {
    this.smfServingArea = smfServingArea;
    return this;
  }

  public UpfCond addSmfServingAreaItem(String smfServingAreaItem) {
    if (this.smfServingArea == null) {
      this.smfServingArea = new ArrayList<>();
    }
    this.smfServingArea.add(smfServingAreaItem);
    return this;
  }

  /**
   * Get smfServingArea
   * @return smfServingArea
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getSmfServingArea() {
    return smfServingArea;
  }

  public void setSmfServingArea(List<String> smfServingArea) {
    this.smfServingArea = smfServingArea;
  }

  public UpfCond taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public UpfCond addTaiListItem(Tai taiListItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpfCond upfCond = (UpfCond) o;
    return Objects.equals(this.conditionType, upfCond.conditionType) &&
        Objects.equals(this.smfServingArea, upfCond.smfServingArea) &&
        Objects.equals(this.taiList, upfCond.taiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, smfServingArea, taiList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpfCond {\n");
    
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    smfServingArea: ").append(toIndentedString(smfServingArea)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
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

