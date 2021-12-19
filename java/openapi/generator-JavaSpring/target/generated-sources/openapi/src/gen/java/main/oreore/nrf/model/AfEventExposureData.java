package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.AfEvent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * AF Event Exposure data managed by a given NEF Instance
 */
@ApiModel(description = "AF Event Exposure data managed by a given NEF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class AfEventExposureData  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("afEvents")
  @Valid
  private List<AfEvent> afEvents = new ArrayList<>();

  @JsonProperty("afIds")
  @Valid
  private List<String> afIds = null;

  @JsonProperty("appIds")
  @Valid
  private List<String> appIds = null;

  public AfEventExposureData afEvents(List<AfEvent> afEvents) {
    this.afEvents = afEvents;
    return this;
  }

  public AfEventExposureData addAfEventsItem(AfEvent afEventsItem) {
    this.afEvents.add(afEventsItem);
    return this;
  }

  /**
   * Get afEvents
   * @return afEvents
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<AfEvent> getAfEvents() {
    return afEvents;
  }

  public void setAfEvents(List<AfEvent> afEvents) {
    this.afEvents = afEvents;
  }

  public AfEventExposureData afIds(List<String> afIds) {
    this.afIds = afIds;
    return this;
  }

  public AfEventExposureData addAfIdsItem(String afIdsItem) {
    if (this.afIds == null) {
      this.afIds = new ArrayList<>();
    }
    this.afIds.add(afIdsItem);
    return this;
  }

  /**
   * Get afIds
   * @return afIds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getAfIds() {
    return afIds;
  }

  public void setAfIds(List<String> afIds) {
    this.afIds = afIds;
  }

  public AfEventExposureData appIds(List<String> appIds) {
    this.appIds = appIds;
    return this;
  }

  public AfEventExposureData addAppIdsItem(String appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

  /**
   * Get appIds
   * @return appIds
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getAppIds() {
    return appIds;
  }

  public void setAppIds(List<String> appIds) {
    this.appIds = appIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AfEventExposureData afEventExposureData = (AfEventExposureData) o;
    return Objects.equals(this.afEvents, afEventExposureData.afEvents) &&
        Objects.equals(this.afIds, afEventExposureData.afIds) &&
        Objects.equals(this.appIds, afEventExposureData.appIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afEvents, afIds, appIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfEventExposureData {\n");
    
    sb.append("    afEvents: ").append(toIndentedString(afEvents)).append("\n");
    sb.append("    afIds: ").append(toIndentedString(afIds)).append("\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
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

