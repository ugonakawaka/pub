package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oreore.nrf.model.ChangeItem;
import oreore.nrf.model.ConditionEventType;
import oreore.nrf.model.NFProfile;
import oreore.nrf.model.NotificationEventType;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Data sent in notifications from NRF to subscribed NF Instances
 */
@ApiModel(description = "Data sent in notifications from NRF to subscribed NF Instances")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NotificationData  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("event")
  private NotificationEventType event;

  @JsonProperty("nfInstanceUri")
  private String nfInstanceUri;

  @JsonProperty("nfProfile")
  private JsonNullable<NFProfile> nfProfile = JsonNullable.undefined();

  @JsonProperty("profileChanges")
  @Valid
  private List<ChangeItem> profileChanges = null;

  @JsonProperty("conditionEvent")
  private ConditionEventType conditionEvent;

  public NotificationData event(NotificationEventType event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NotificationEventType getEvent() {
    return event;
  }

  public void setEvent(NotificationEventType event) {
    this.event = event;
  }

  public NotificationData nfInstanceUri(String nfInstanceUri) {
    this.nfInstanceUri = nfInstanceUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return nfInstanceUri
  */
  @ApiModelProperty(required = true, value = "String providing an URI formatted according to RFC 3986")
  @NotNull


  public String getNfInstanceUri() {
    return nfInstanceUri;
  }

  public void setNfInstanceUri(String nfInstanceUri) {
    this.nfInstanceUri = nfInstanceUri;
  }

  public NotificationData nfProfile(NFProfile nfProfile) {
    this.nfProfile = JsonNullable.of(nfProfile);
    return this;
  }

  /**
   * Get nfProfile
   * @return nfProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<NFProfile> getNfProfile() {
    return nfProfile;
  }

  public void setNfProfile(JsonNullable<NFProfile> nfProfile) {
    this.nfProfile = nfProfile;
  }

  public NotificationData profileChanges(List<ChangeItem> profileChanges) {
    this.profileChanges = profileChanges;
    return this;
  }

  public NotificationData addProfileChangesItem(ChangeItem profileChangesItem) {
    if (this.profileChanges == null) {
      this.profileChanges = new ArrayList<>();
    }
    this.profileChanges.add(profileChangesItem);
    return this;
  }

  /**
   * Get profileChanges
   * @return profileChanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<ChangeItem> getProfileChanges() {
    return profileChanges;
  }

  public void setProfileChanges(List<ChangeItem> profileChanges) {
    this.profileChanges = profileChanges;
  }

  public NotificationData conditionEvent(ConditionEventType conditionEvent) {
    this.conditionEvent = conditionEvent;
    return this;
  }

  /**
   * Get conditionEvent
   * @return conditionEvent
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConditionEventType getConditionEvent() {
    return conditionEvent;
  }

  public void setConditionEvent(ConditionEventType conditionEvent) {
    this.conditionEvent = conditionEvent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationData notificationData = (NotificationData) o;
    return Objects.equals(this.event, notificationData.event) &&
        Objects.equals(this.nfInstanceUri, notificationData.nfInstanceUri) &&
        Objects.equals(this.nfProfile, notificationData.nfProfile) &&
        Objects.equals(this.profileChanges, notificationData.profileChanges) &&
        Objects.equals(this.conditionEvent, notificationData.conditionEvent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, nfInstanceUri, nfProfile, profileChanges, conditionEvent);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationData {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    nfInstanceUri: ").append(toIndentedString(nfInstanceUri)).append("\n");
    sb.append("    nfProfile: ").append(toIndentedString(nfProfile)).append("\n");
    sb.append("    profileChanges: ").append(toIndentedString(profileChanges)).append("\n");
    sb.append("    conditionEvent: ").append(toIndentedString(conditionEvent)).append("\n");
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

