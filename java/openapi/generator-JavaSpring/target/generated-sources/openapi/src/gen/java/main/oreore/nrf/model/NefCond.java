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
import oreore.nrf.model.AfEvent;
import oreore.nrf.model.IdentityRange;
import oreore.nrf.model.PfdData;
import oreore.nrf.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NF Instances (NEFs), identified by Event ID(s) provided by AF, S-NSSAI(s), AF Instance ID, Application Identifier, External Identifier, External Group Identifier, or domain name.
 */
@ApiModel(description = "Subscription to a set of NF Instances (NEFs), identified by Event ID(s) provided by AF, S-NSSAI(s), AF Instance ID, Application Identifier, External Identifier, External Group Identifier, or domain name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NefCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets conditionType
   */
  public enum ConditionTypeEnum {
    NEF_COND("NEF_COND");

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

  @JsonProperty("afEvents")
  @Valid
  private List<AfEvent> afEvents = null;

  @JsonProperty("snssaiList")
  @Valid
  private List<Snssai> snssaiList = null;

  @JsonProperty("pfdData")
  private PfdData pfdData;

  @JsonProperty("gpsiRanges")
  @Valid
  private List<IdentityRange> gpsiRanges = null;

  @JsonProperty("externalGroupIdentifiersRanges")
  @Valid
  private List<IdentityRange> externalGroupIdentifiersRanges = null;

  @JsonProperty("servedFqdnList")
  @Valid
  private List<String> servedFqdnList = null;

  public NefCond conditionType(ConditionTypeEnum conditionType) {
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

  public NefCond afEvents(List<AfEvent> afEvents) {
    this.afEvents = afEvents;
    return this;
  }

  public NefCond addAfEventsItem(AfEvent afEventsItem) {
    if (this.afEvents == null) {
      this.afEvents = new ArrayList<>();
    }
    this.afEvents.add(afEventsItem);
    return this;
  }

  /**
   * Get afEvents
   * @return afEvents
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<AfEvent> getAfEvents() {
    return afEvents;
  }

  public void setAfEvents(List<AfEvent> afEvents) {
    this.afEvents = afEvents;
  }

  public NefCond snssaiList(List<Snssai> snssaiList) {
    this.snssaiList = snssaiList;
    return this;
  }

  public NefCond addSnssaiListItem(Snssai snssaiListItem) {
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

  public NefCond pfdData(PfdData pfdData) {
    this.pfdData = pfdData;
    return this;
  }

  /**
   * Get pfdData
   * @return pfdData
  */
  @ApiModelProperty(value = "")

  @Valid

  public PfdData getPfdData() {
    return pfdData;
  }

  public void setPfdData(PfdData pfdData) {
    this.pfdData = pfdData;
  }

  public NefCond gpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
    return this;
  }

  public NefCond addGpsiRangesItem(IdentityRange gpsiRangesItem) {
    if (this.gpsiRanges == null) {
      this.gpsiRanges = new ArrayList<>();
    }
    this.gpsiRanges.add(gpsiRangesItem);
    return this;
  }

  /**
   * Get gpsiRanges
   * @return gpsiRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getGpsiRanges() {
    return gpsiRanges;
  }

  public void setGpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
  }

  public NefCond externalGroupIdentifiersRanges(List<IdentityRange> externalGroupIdentifiersRanges) {
    this.externalGroupIdentifiersRanges = externalGroupIdentifiersRanges;
    return this;
  }

  public NefCond addExternalGroupIdentifiersRangesItem(IdentityRange externalGroupIdentifiersRangesItem) {
    if (this.externalGroupIdentifiersRanges == null) {
      this.externalGroupIdentifiersRanges = new ArrayList<>();
    }
    this.externalGroupIdentifiersRanges.add(externalGroupIdentifiersRangesItem);
    return this;
  }

  /**
   * Get externalGroupIdentifiersRanges
   * @return externalGroupIdentifiersRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getExternalGroupIdentifiersRanges() {
    return externalGroupIdentifiersRanges;
  }

  public void setExternalGroupIdentifiersRanges(List<IdentityRange> externalGroupIdentifiersRanges) {
    this.externalGroupIdentifiersRanges = externalGroupIdentifiersRanges;
  }

  public NefCond servedFqdnList(List<String> servedFqdnList) {
    this.servedFqdnList = servedFqdnList;
    return this;
  }

  public NefCond addServedFqdnListItem(String servedFqdnListItem) {
    if (this.servedFqdnList == null) {
      this.servedFqdnList = new ArrayList<>();
    }
    this.servedFqdnList.add(servedFqdnListItem);
    return this;
  }

  /**
   * Get servedFqdnList
   * @return servedFqdnList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getServedFqdnList() {
    return servedFqdnList;
  }

  public void setServedFqdnList(List<String> servedFqdnList) {
    this.servedFqdnList = servedFqdnList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NefCond nefCond = (NefCond) o;
    return Objects.equals(this.conditionType, nefCond.conditionType) &&
        Objects.equals(this.afEvents, nefCond.afEvents) &&
        Objects.equals(this.snssaiList, nefCond.snssaiList) &&
        Objects.equals(this.pfdData, nefCond.pfdData) &&
        Objects.equals(this.gpsiRanges, nefCond.gpsiRanges) &&
        Objects.equals(this.externalGroupIdentifiersRanges, nefCond.externalGroupIdentifiersRanges) &&
        Objects.equals(this.servedFqdnList, nefCond.servedFqdnList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, afEvents, snssaiList, pfdData, gpsiRanges, externalGroupIdentifiersRanges, servedFqdnList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NefCond {\n");
    
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    afEvents: ").append(toIndentedString(afEvents)).append("\n");
    sb.append("    snssaiList: ").append(toIndentedString(snssaiList)).append("\n");
    sb.append("    pfdData: ").append(toIndentedString(pfdData)).append("\n");
    sb.append("    gpsiRanges: ").append(toIndentedString(gpsiRanges)).append("\n");
    sb.append("    externalGroupIdentifiersRanges: ").append(toIndentedString(externalGroupIdentifiersRanges)).append("\n");
    sb.append("    servedFqdnList: ").append(toIndentedString(servedFqdnList)).append("\n");
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

