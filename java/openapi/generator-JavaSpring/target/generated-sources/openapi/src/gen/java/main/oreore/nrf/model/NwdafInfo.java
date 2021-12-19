package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.EventId;
import oreore.nrf.model.NFType;
import oreore.nrf.model.NwdafCapability;
import oreore.nrf.model.NwdafEvent;
import oreore.nrf.model.Tai;
import oreore.nrf.model.TaiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a NWDAF NF Instance
 */
@ApiModel(description = "Information of a NWDAF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NwdafInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("eventIds")
  @Valid
  private List<EventId> eventIds = null;

  @JsonProperty("nwdafEvents")
  @Valid
  private List<NwdafEvent> nwdafEvents = null;

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  @JsonProperty("taiRangeList")
  @Valid
  private List<TaiRange> taiRangeList = null;

  @JsonProperty("nwdafCapability")
  private NwdafCapability nwdafCapability;

  @JsonProperty("analyticsDelay")
  private Integer analyticsDelay;

  @JsonProperty("servingNfSetIdList")
  @Valid
  private List<String> servingNfSetIdList = null;

  @JsonProperty("servingNfTypeList")
  @Valid
  private List<NFType> servingNfTypeList = null;

  @JsonProperty("mlAnalyticsIds")
  @Valid
  private List<NwdafEvent> mlAnalyticsIds = null;

  public NwdafInfo eventIds(List<EventId> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public NwdafInfo addEventIdsItem(EventId eventIdsItem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<>();
    }
    this.eventIds.add(eventIdsItem);
    return this;
  }

  /**
   * Get eventIds
   * @return eventIds
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<EventId> getEventIds() {
    return eventIds;
  }

  public void setEventIds(List<EventId> eventIds) {
    this.eventIds = eventIds;
  }

  public NwdafInfo nwdafEvents(List<NwdafEvent> nwdafEvents) {
    this.nwdafEvents = nwdafEvents;
    return this;
  }

  public NwdafInfo addNwdafEventsItem(NwdafEvent nwdafEventsItem) {
    if (this.nwdafEvents == null) {
      this.nwdafEvents = new ArrayList<>();
    }
    this.nwdafEvents.add(nwdafEventsItem);
    return this;
  }

  /**
   * Get nwdafEvents
   * @return nwdafEvents
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NwdafEvent> getNwdafEvents() {
    return nwdafEvents;
  }

  public void setNwdafEvents(List<NwdafEvent> nwdafEvents) {
    this.nwdafEvents = nwdafEvents;
  }

  public NwdafInfo taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public NwdafInfo addTaiListItem(Tai taiListItem) {
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

  public NwdafInfo taiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
    return this;
  }

  public NwdafInfo addTaiRangeListItem(TaiRange taiRangeListItem) {
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

  public NwdafInfo nwdafCapability(NwdafCapability nwdafCapability) {
    this.nwdafCapability = nwdafCapability;
    return this;
  }

  /**
   * Get nwdafCapability
   * @return nwdafCapability
  */
  @ApiModelProperty(value = "")

  @Valid

  public NwdafCapability getNwdafCapability() {
    return nwdafCapability;
  }

  public void setNwdafCapability(NwdafCapability nwdafCapability) {
    this.nwdafCapability = nwdafCapability;
  }

  public NwdafInfo analyticsDelay(Integer analyticsDelay) {
    this.analyticsDelay = analyticsDelay;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return analyticsDelay
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getAnalyticsDelay() {
    return analyticsDelay;
  }

  public void setAnalyticsDelay(Integer analyticsDelay) {
    this.analyticsDelay = analyticsDelay;
  }

  public NwdafInfo servingNfSetIdList(List<String> servingNfSetIdList) {
    this.servingNfSetIdList = servingNfSetIdList;
    return this;
  }

  public NwdafInfo addServingNfSetIdListItem(String servingNfSetIdListItem) {
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

  public NwdafInfo servingNfTypeList(List<NFType> servingNfTypeList) {
    this.servingNfTypeList = servingNfTypeList;
    return this;
  }

  public NwdafInfo addServingNfTypeListItem(NFType servingNfTypeListItem) {
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

  public NwdafInfo mlAnalyticsIds(List<NwdafEvent> mlAnalyticsIds) {
    this.mlAnalyticsIds = mlAnalyticsIds;
    return this;
  }

  public NwdafInfo addMlAnalyticsIdsItem(NwdafEvent mlAnalyticsIdsItem) {
    if (this.mlAnalyticsIds == null) {
      this.mlAnalyticsIds = new ArrayList<>();
    }
    this.mlAnalyticsIds.add(mlAnalyticsIdsItem);
    return this;
  }

  /**
   * Get mlAnalyticsIds
   * @return mlAnalyticsIds
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NwdafEvent> getMlAnalyticsIds() {
    return mlAnalyticsIds;
  }

  public void setMlAnalyticsIds(List<NwdafEvent> mlAnalyticsIds) {
    this.mlAnalyticsIds = mlAnalyticsIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NwdafInfo nwdafInfo = (NwdafInfo) o;
    return Objects.equals(this.eventIds, nwdafInfo.eventIds) &&
        Objects.equals(this.nwdafEvents, nwdafInfo.nwdafEvents) &&
        Objects.equals(this.taiList, nwdafInfo.taiList) &&
        Objects.equals(this.taiRangeList, nwdafInfo.taiRangeList) &&
        Objects.equals(this.nwdafCapability, nwdafInfo.nwdafCapability) &&
        Objects.equals(this.analyticsDelay, nwdafInfo.analyticsDelay) &&
        Objects.equals(this.servingNfSetIdList, nwdafInfo.servingNfSetIdList) &&
        Objects.equals(this.servingNfTypeList, nwdafInfo.servingNfTypeList) &&
        Objects.equals(this.mlAnalyticsIds, nwdafInfo.mlAnalyticsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventIds, nwdafEvents, taiList, taiRangeList, nwdafCapability, analyticsDelay, servingNfSetIdList, servingNfTypeList, mlAnalyticsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NwdafInfo {\n");
    
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
    sb.append("    nwdafEvents: ").append(toIndentedString(nwdafEvents)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
    sb.append("    taiRangeList: ").append(toIndentedString(taiRangeList)).append("\n");
    sb.append("    nwdafCapability: ").append(toIndentedString(nwdafCapability)).append("\n");
    sb.append("    analyticsDelay: ").append(toIndentedString(analyticsDelay)).append("\n");
    sb.append("    servingNfSetIdList: ").append(toIndentedString(servingNfSetIdList)).append("\n");
    sb.append("    servingNfTypeList: ").append(toIndentedString(servingNfTypeList)).append("\n");
    sb.append("    mlAnalyticsIds: ").append(toIndentedString(mlAnalyticsIds)).append("\n");
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

