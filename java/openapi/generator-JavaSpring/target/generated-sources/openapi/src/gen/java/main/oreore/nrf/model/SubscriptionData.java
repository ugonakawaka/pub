package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import oreore.nrf.model.NFType;
import oreore.nrf.model.NotifCondition;
import oreore.nrf.model.NotificationEventType;
import oreore.nrf.model.OneOfNfInstanceIdCondNfInstanceIdListCondNfTypeCondServiceNameCondAmfCondGuamiListCondNetworkSliceCondNfGroupCondNfSetCondNfServiceSetCondUpfCondScpDomainCondNwdafCondNefCond;
import oreore.nrf.model.PlmnId;
import oreore.nrf.model.PlmnIdNid;
import oreore.nrf.model.PlmnSnssai;
import oreore.nrf.model.Snssai;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a subscription to notifications to NRF events, included in subscription requests and responses
 */
@ApiModel(description = "Information of a subscription to notifications to NRF events, included in subscription requests and responses")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SubscriptionData  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nfStatusNotificationUri")
  private String nfStatusNotificationUri;

  @JsonProperty("subscriptionId")
  private String subscriptionId;

  @JsonProperty("reqNfInstanceId")
  private UUID reqNfInstanceId;

  @JsonProperty("subscrCond")
  private JsonNullable<OneOfNfInstanceIdCondNfInstanceIdListCondNfTypeCondServiceNameCondAmfCondGuamiListCondNetworkSliceCondNfGroupCondNfSetCondNfServiceSetCondUpfCondScpDomainCondNwdafCondNefCond> subscrCond = JsonNullable.undefined();

  @JsonProperty("validityTime")
  private OffsetDateTime validityTime;

  @JsonProperty("reqNotifEvents")
  @Valid
  private List<NotificationEventType> reqNotifEvents = null;

  @JsonProperty("plmnId")
  private PlmnId plmnId;

  @JsonProperty("nid")
  private String nid;

  @JsonProperty("notifCondition")
  private NotifCondition notifCondition;

  @JsonProperty("reqNfType")
  private NFType reqNfType;

  @JsonProperty("reqNfFqdn")
  private String reqNfFqdn;

  @JsonProperty("reqSnssais")
  @Valid
  private List<Snssai> reqSnssais = null;

  @JsonProperty("reqPerPlmnSnssais")
  @Valid
  private List<PlmnSnssai> reqPerPlmnSnssais = null;

  @JsonProperty("reqPlmnList")
  @Valid
  private List<PlmnId> reqPlmnList = null;

  @JsonProperty("reqSnpnList")
  @Valid
  private List<PlmnIdNid> reqSnpnList = null;

  @JsonProperty("servingScope")
  @Valid
  private List<String> servingScope = null;

  @JsonProperty("requesterFeatures")
  private JsonNullable<String> requesterFeatures = JsonNullable.undefined();

  @JsonProperty("nrfSupportedFeatures")
  private JsonNullable<String> nrfSupportedFeatures = JsonNullable.undefined();

  @JsonProperty("hnrfUri")
  private String hnrfUri;

  public SubscriptionData nfStatusNotificationUri(String nfStatusNotificationUri) {
    this.nfStatusNotificationUri = nfStatusNotificationUri;
    return this;
  }

  /**
   * Get nfStatusNotificationUri
   * @return nfStatusNotificationUri
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNfStatusNotificationUri() {
    return nfStatusNotificationUri;
  }

  public void setNfStatusNotificationUri(String nfStatusNotificationUri) {
    this.nfStatusNotificationUri = nfStatusNotificationUri;
  }

  public SubscriptionData subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId
   * @return subscriptionId
  */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  @NotNull

@Pattern(regexp = "^([0-9]{5,6}-)?[^-]+$") 
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionData reqNfInstanceId(UUID reqNfInstanceId) {
    this.reqNfInstanceId = reqNfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return reqNfInstanceId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getReqNfInstanceId() {
    return reqNfInstanceId;
  }

  public void setReqNfInstanceId(UUID reqNfInstanceId) {
    this.reqNfInstanceId = reqNfInstanceId;
  }

  public SubscriptionData subscrCond(OneOfNfInstanceIdCondNfInstanceIdListCondNfTypeCondServiceNameCondAmfCondGuamiListCondNetworkSliceCondNfGroupCondNfSetCondNfServiceSetCondUpfCondScpDomainCondNwdafCondNefCond subscrCond) {
    this.subscrCond = JsonNullable.of(subscrCond);
    return this;
  }

  /**
   * Get subscrCond
   * @return subscrCond
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OneOfNfInstanceIdCondNfInstanceIdListCondNfTypeCondServiceNameCondAmfCondGuamiListCondNetworkSliceCondNfGroupCondNfSetCondNfServiceSetCondUpfCondScpDomainCondNwdafCondNefCond> getSubscrCond() {
    return subscrCond;
  }

  public void setSubscrCond(JsonNullable<OneOfNfInstanceIdCondNfInstanceIdListCondNfTypeCondServiceNameCondAmfCondGuamiListCondNetworkSliceCondNfGroupCondNfSetCondNfServiceSetCondUpfCondScpDomainCondNwdafCondNefCond> subscrCond) {
    this.subscrCond = subscrCond;
  }

  public SubscriptionData validityTime(OffsetDateTime validityTime) {
    this.validityTime = validityTime;
    return this;
  }

  /**
   * Get validityTime
   * @return validityTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getValidityTime() {
    return validityTime;
  }

  public void setValidityTime(OffsetDateTime validityTime) {
    this.validityTime = validityTime;
  }

  public SubscriptionData reqNotifEvents(List<NotificationEventType> reqNotifEvents) {
    this.reqNotifEvents = reqNotifEvents;
    return this;
  }

  public SubscriptionData addReqNotifEventsItem(NotificationEventType reqNotifEventsItem) {
    if (this.reqNotifEvents == null) {
      this.reqNotifEvents = new ArrayList<>();
    }
    this.reqNotifEvents.add(reqNotifEventsItem);
    return this;
  }

  /**
   * Get reqNotifEvents
   * @return reqNotifEvents
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NotificationEventType> getReqNotifEvents() {
    return reqNotifEvents;
  }

  public void setReqNotifEvents(List<NotificationEventType> reqNotifEvents) {
    this.reqNotifEvents = reqNotifEvents;
  }

  public SubscriptionData plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }

  /**
   * Get plmnId
   * @return plmnId
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlmnId getPlmnId() {
    return plmnId;
  }

  public void setPlmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
  }

  public SubscriptionData nid(String nid) {
    this.nid = nid;
    return this;
  }

  /**
   * This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).
   * @return nid
  */
  @ApiModelProperty(value = "This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).")

@Pattern(regexp = "^[A-Fa-f0-9]{11}$") 
  public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
    this.nid = nid;
  }

  public SubscriptionData notifCondition(NotifCondition notifCondition) {
    this.notifCondition = notifCondition;
    return this;
  }

  /**
   * Get notifCondition
   * @return notifCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public NotifCondition getNotifCondition() {
    return notifCondition;
  }

  public void setNotifCondition(NotifCondition notifCondition) {
    this.notifCondition = notifCondition;
  }

  public SubscriptionData reqNfType(NFType reqNfType) {
    this.reqNfType = reqNfType;
    return this;
  }

  /**
   * Get reqNfType
   * @return reqNfType
  */
  @ApiModelProperty(value = "")

  @Valid

  public NFType getReqNfType() {
    return reqNfType;
  }

  public void setReqNfType(NFType reqNfType) {
    this.reqNfType = reqNfType;
  }

  public SubscriptionData reqNfFqdn(String reqNfFqdn) {
    this.reqNfFqdn = reqNfFqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return reqNfFqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getReqNfFqdn() {
    return reqNfFqdn;
  }

  public void setReqNfFqdn(String reqNfFqdn) {
    this.reqNfFqdn = reqNfFqdn;
  }

  public SubscriptionData reqSnssais(List<Snssai> reqSnssais) {
    this.reqSnssais = reqSnssais;
    return this;
  }

  public SubscriptionData addReqSnssaisItem(Snssai reqSnssaisItem) {
    if (this.reqSnssais == null) {
      this.reqSnssais = new ArrayList<>();
    }
    this.reqSnssais.add(reqSnssaisItem);
    return this;
  }

  /**
   * Get reqSnssais
   * @return reqSnssais
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Snssai> getReqSnssais() {
    return reqSnssais;
  }

  public void setReqSnssais(List<Snssai> reqSnssais) {
    this.reqSnssais = reqSnssais;
  }

  public SubscriptionData reqPerPlmnSnssais(List<PlmnSnssai> reqPerPlmnSnssais) {
    this.reqPerPlmnSnssais = reqPerPlmnSnssais;
    return this;
  }

  public SubscriptionData addReqPerPlmnSnssaisItem(PlmnSnssai reqPerPlmnSnssaisItem) {
    if (this.reqPerPlmnSnssais == null) {
      this.reqPerPlmnSnssais = new ArrayList<>();
    }
    this.reqPerPlmnSnssais.add(reqPerPlmnSnssaisItem);
    return this;
  }

  /**
   * Get reqPerPlmnSnssais
   * @return reqPerPlmnSnssais
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnSnssai> getReqPerPlmnSnssais() {
    return reqPerPlmnSnssais;
  }

  public void setReqPerPlmnSnssais(List<PlmnSnssai> reqPerPlmnSnssais) {
    this.reqPerPlmnSnssais = reqPerPlmnSnssais;
  }

  public SubscriptionData reqPlmnList(List<PlmnId> reqPlmnList) {
    this.reqPlmnList = reqPlmnList;
    return this;
  }

  public SubscriptionData addReqPlmnListItem(PlmnId reqPlmnListItem) {
    if (this.reqPlmnList == null) {
      this.reqPlmnList = new ArrayList<>();
    }
    this.reqPlmnList.add(reqPlmnListItem);
    return this;
  }

  /**
   * Get reqPlmnList
   * @return reqPlmnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnId> getReqPlmnList() {
    return reqPlmnList;
  }

  public void setReqPlmnList(List<PlmnId> reqPlmnList) {
    this.reqPlmnList = reqPlmnList;
  }

  public SubscriptionData reqSnpnList(List<PlmnIdNid> reqSnpnList) {
    this.reqSnpnList = reqSnpnList;
    return this;
  }

  public SubscriptionData addReqSnpnListItem(PlmnIdNid reqSnpnListItem) {
    if (this.reqSnpnList == null) {
      this.reqSnpnList = new ArrayList<>();
    }
    this.reqSnpnList.add(reqSnpnListItem);
    return this;
  }

  /**
   * Get reqSnpnList
   * @return reqSnpnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnIdNid> getReqSnpnList() {
    return reqSnpnList;
  }

  public void setReqSnpnList(List<PlmnIdNid> reqSnpnList) {
    this.reqSnpnList = reqSnpnList;
  }

  public SubscriptionData servingScope(List<String> servingScope) {
    this.servingScope = servingScope;
    return this;
  }

  public SubscriptionData addServingScopeItem(String servingScopeItem) {
    if (this.servingScope == null) {
      this.servingScope = new ArrayList<>();
    }
    this.servingScope.add(servingScopeItem);
    return this;
  }

  /**
   * Get servingScope
   * @return servingScope
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getServingScope() {
    return servingScope;
  }

  public void setServingScope(List<String> servingScope) {
    this.servingScope = servingScope;
  }

  public SubscriptionData requesterFeatures(String requesterFeatures) {
    this.requesterFeatures = JsonNullable.of(requesterFeatures);
    return this;
  }

  /**
   * Get requesterFeatures
   * @return requesterFeatures
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getRequesterFeatures() {
    return requesterFeatures;
  }

  public void setRequesterFeatures(JsonNullable<String> requesterFeatures) {
    this.requesterFeatures = requesterFeatures;
  }

  public SubscriptionData nrfSupportedFeatures(String nrfSupportedFeatures) {
    this.nrfSupportedFeatures = JsonNullable.of(nrfSupportedFeatures);
    return this;
  }

  /**
   * Get nrfSupportedFeatures
   * @return nrfSupportedFeatures
  */
  @ApiModelProperty(readOnly = true, value = "")


  public JsonNullable<String> getNrfSupportedFeatures() {
    return nrfSupportedFeatures;
  }

  public void setNrfSupportedFeatures(JsonNullable<String> nrfSupportedFeatures) {
    this.nrfSupportedFeatures = nrfSupportedFeatures;
  }

  public SubscriptionData hnrfUri(String hnrfUri) {
    this.hnrfUri = hnrfUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return hnrfUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getHnrfUri() {
    return hnrfUri;
  }

  public void setHnrfUri(String hnrfUri) {
    this.hnrfUri = hnrfUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionData subscriptionData = (SubscriptionData) o;
    return Objects.equals(this.nfStatusNotificationUri, subscriptionData.nfStatusNotificationUri) &&
        Objects.equals(this.subscriptionId, subscriptionData.subscriptionId) &&
        Objects.equals(this.reqNfInstanceId, subscriptionData.reqNfInstanceId) &&
        Objects.equals(this.subscrCond, subscriptionData.subscrCond) &&
        Objects.equals(this.validityTime, subscriptionData.validityTime) &&
        Objects.equals(this.reqNotifEvents, subscriptionData.reqNotifEvents) &&
        Objects.equals(this.plmnId, subscriptionData.plmnId) &&
        Objects.equals(this.nid, subscriptionData.nid) &&
        Objects.equals(this.notifCondition, subscriptionData.notifCondition) &&
        Objects.equals(this.reqNfType, subscriptionData.reqNfType) &&
        Objects.equals(this.reqNfFqdn, subscriptionData.reqNfFqdn) &&
        Objects.equals(this.reqSnssais, subscriptionData.reqSnssais) &&
        Objects.equals(this.reqPerPlmnSnssais, subscriptionData.reqPerPlmnSnssais) &&
        Objects.equals(this.reqPlmnList, subscriptionData.reqPlmnList) &&
        Objects.equals(this.reqSnpnList, subscriptionData.reqSnpnList) &&
        Objects.equals(this.servingScope, subscriptionData.servingScope) &&
        Objects.equals(this.requesterFeatures, subscriptionData.requesterFeatures) &&
        Objects.equals(this.nrfSupportedFeatures, subscriptionData.nrfSupportedFeatures) &&
        Objects.equals(this.hnrfUri, subscriptionData.hnrfUri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfStatusNotificationUri, subscriptionId, reqNfInstanceId, subscrCond, validityTime, reqNotifEvents, plmnId, nid, notifCondition, reqNfType, reqNfFqdn, reqSnssais, reqPerPlmnSnssais, reqPlmnList, reqSnpnList, servingScope, requesterFeatures, nrfSupportedFeatures, hnrfUri);
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
    sb.append("class SubscriptionData {\n");
    
    sb.append("    nfStatusNotificationUri: ").append(toIndentedString(nfStatusNotificationUri)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    reqNfInstanceId: ").append(toIndentedString(reqNfInstanceId)).append("\n");
    sb.append("    subscrCond: ").append(toIndentedString(subscrCond)).append("\n");
    sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
    sb.append("    reqNotifEvents: ").append(toIndentedString(reqNotifEvents)).append("\n");
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
    sb.append("    notifCondition: ").append(toIndentedString(notifCondition)).append("\n");
    sb.append("    reqNfType: ").append(toIndentedString(reqNfType)).append("\n");
    sb.append("    reqNfFqdn: ").append(toIndentedString(reqNfFqdn)).append("\n");
    sb.append("    reqSnssais: ").append(toIndentedString(reqSnssais)).append("\n");
    sb.append("    reqPerPlmnSnssais: ").append(toIndentedString(reqPerPlmnSnssais)).append("\n");
    sb.append("    reqPlmnList: ").append(toIndentedString(reqPlmnList)).append("\n");
    sb.append("    reqSnpnList: ").append(toIndentedString(reqSnpnList)).append("\n");
    sb.append("    servingScope: ").append(toIndentedString(servingScope)).append("\n");
    sb.append("    requesterFeatures: ").append(toIndentedString(requesterFeatures)).append("\n");
    sb.append("    nrfSupportedFeatures: ").append(toIndentedString(nrfSupportedFeatures)).append("\n");
    sb.append("    hnrfUri: ").append(toIndentedString(hnrfUri)).append("\n");
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

