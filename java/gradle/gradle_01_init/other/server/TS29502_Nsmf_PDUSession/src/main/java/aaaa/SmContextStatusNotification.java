package aaaa;

import java.util.Objects;
import aaaa.ApnRateStatus;
import aaaa.SmallDataRateStatus;
import aaaa.StatusInfo;
import aaaa.TargetDnaiInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Notify SM Context Status Request
 */
@ApiModel(description = "Data within Notify SM Context Status Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class SmContextStatusNotification   {
  @JsonProperty("statusInfo")
  private StatusInfo statusInfo;

  @JsonProperty("smallDataRateStatus")
  private SmallDataRateStatus smallDataRateStatus;

  @JsonProperty("apnRateStatus")
  private ApnRateStatus apnRateStatus;

  @JsonProperty("ddnFailureStatus")
  private Boolean ddnFailureStatus = false;

  @JsonProperty("notifyCorrelationIdsForddnFailure")
  @Valid
  private List<String> notifyCorrelationIdsForddnFailure = null;

  @JsonProperty("newSmfId")
  private UUID newSmfId;

  @JsonProperty("newSmfSetId")
  private String newSmfSetId;

  @JsonProperty("oldSmfId")
  private UUID oldSmfId;

  @JsonProperty("oldSmContextRef")
  private String oldSmContextRef;

  @JsonProperty("altAnchorSmfUri")
  private String altAnchorSmfUri;

  @JsonProperty("altAnchorSmfId")
  private UUID altAnchorSmfId;

  @JsonProperty("targetDnaiInfo")
  private TargetDnaiInfo targetDnaiInfo;

  @JsonProperty("oldPduSessionRef")
  private String oldPduSessionRef;

  public SmContextStatusNotification statusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Get statusInfo
   * @return statusInfo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public StatusInfo getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }

  public SmContextStatusNotification smallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
    this.smallDataRateStatus = smallDataRateStatus;
    return this;
  }

  /**
   * Get smallDataRateStatus
   * @return smallDataRateStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmallDataRateStatus getSmallDataRateStatus() {
    return smallDataRateStatus;
  }

  public void setSmallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
    this.smallDataRateStatus = smallDataRateStatus;
  }

  public SmContextStatusNotification apnRateStatus(ApnRateStatus apnRateStatus) {
    this.apnRateStatus = apnRateStatus;
    return this;
  }

  /**
   * Get apnRateStatus
   * @return apnRateStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApnRateStatus getApnRateStatus() {
    return apnRateStatus;
  }

  public void setApnRateStatus(ApnRateStatus apnRateStatus) {
    this.apnRateStatus = apnRateStatus;
  }

  public SmContextStatusNotification ddnFailureStatus(Boolean ddnFailureStatus) {
    this.ddnFailureStatus = ddnFailureStatus;
    return this;
  }

  /**
   * Get ddnFailureStatus
   * @return ddnFailureStatus
  */
  @ApiModelProperty(value = "")


  public Boolean getDdnFailureStatus() {
    return ddnFailureStatus;
  }

  public void setDdnFailureStatus(Boolean ddnFailureStatus) {
    this.ddnFailureStatus = ddnFailureStatus;
  }

  public SmContextStatusNotification notifyCorrelationIdsForddnFailure(List<String> notifyCorrelationIdsForddnFailure) {
    this.notifyCorrelationIdsForddnFailure = notifyCorrelationIdsForddnFailure;
    return this;
  }

  public SmContextStatusNotification addNotifyCorrelationIdsForddnFailureItem(String notifyCorrelationIdsForddnFailureItem) {
    if (this.notifyCorrelationIdsForddnFailure == null) {
      this.notifyCorrelationIdsForddnFailure = new ArrayList<>();
    }
    this.notifyCorrelationIdsForddnFailure.add(notifyCorrelationIdsForddnFailureItem);
    return this;
  }

  /**
   * Get notifyCorrelationIdsForddnFailure
   * @return notifyCorrelationIdsForddnFailure
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getNotifyCorrelationIdsForddnFailure() {
    return notifyCorrelationIdsForddnFailure;
  }

  public void setNotifyCorrelationIdsForddnFailure(List<String> notifyCorrelationIdsForddnFailure) {
    this.notifyCorrelationIdsForddnFailure = notifyCorrelationIdsForddnFailure;
  }

  public SmContextStatusNotification newSmfId(UUID newSmfId) {
    this.newSmfId = newSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return newSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getNewSmfId() {
    return newSmfId;
  }

  public void setNewSmfId(UUID newSmfId) {
    this.newSmfId = newSmfId;
  }

  public SmContextStatusNotification newSmfSetId(String newSmfSetId) {
    this.newSmfSetId = newSmfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return newSmfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getNewSmfSetId() {
    return newSmfSetId;
  }

  public void setNewSmfSetId(String newSmfSetId) {
    this.newSmfSetId = newSmfSetId;
  }

  public SmContextStatusNotification oldSmfId(UUID oldSmfId) {
    this.oldSmfId = oldSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return oldSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getOldSmfId() {
    return oldSmfId;
  }

  public void setOldSmfId(UUID oldSmfId) {
    this.oldSmfId = oldSmfId;
  }

  public SmContextStatusNotification oldSmContextRef(String oldSmContextRef) {
    this.oldSmContextRef = oldSmContextRef;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return oldSmContextRef
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getOldSmContextRef() {
    return oldSmContextRef;
  }

  public void setOldSmContextRef(String oldSmContextRef) {
    this.oldSmContextRef = oldSmContextRef;
  }

  public SmContextStatusNotification altAnchorSmfUri(String altAnchorSmfUri) {
    this.altAnchorSmfUri = altAnchorSmfUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return altAnchorSmfUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getAltAnchorSmfUri() {
    return altAnchorSmfUri;
  }

  public void setAltAnchorSmfUri(String altAnchorSmfUri) {
    this.altAnchorSmfUri = altAnchorSmfUri;
  }

  public SmContextStatusNotification altAnchorSmfId(UUID altAnchorSmfId) {
    this.altAnchorSmfId = altAnchorSmfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return altAnchorSmfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getAltAnchorSmfId() {
    return altAnchorSmfId;
  }

  public void setAltAnchorSmfId(UUID altAnchorSmfId) {
    this.altAnchorSmfId = altAnchorSmfId;
  }

  public SmContextStatusNotification targetDnaiInfo(TargetDnaiInfo targetDnaiInfo) {
    this.targetDnaiInfo = targetDnaiInfo;
    return this;
  }

  /**
   * Get targetDnaiInfo
   * @return targetDnaiInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TargetDnaiInfo getTargetDnaiInfo() {
    return targetDnaiInfo;
  }

  public void setTargetDnaiInfo(TargetDnaiInfo targetDnaiInfo) {
    this.targetDnaiInfo = targetDnaiInfo;
  }

  public SmContextStatusNotification oldPduSessionRef(String oldPduSessionRef) {
    this.oldPduSessionRef = oldPduSessionRef;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return oldPduSessionRef
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getOldPduSessionRef() {
    return oldPduSessionRef;
  }

  public void setOldPduSessionRef(String oldPduSessionRef) {
    this.oldPduSessionRef = oldPduSessionRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContextStatusNotification smContextStatusNotification = (SmContextStatusNotification) o;
    return Objects.equals(this.statusInfo, smContextStatusNotification.statusInfo) &&
        Objects.equals(this.smallDataRateStatus, smContextStatusNotification.smallDataRateStatus) &&
        Objects.equals(this.apnRateStatus, smContextStatusNotification.apnRateStatus) &&
        Objects.equals(this.ddnFailureStatus, smContextStatusNotification.ddnFailureStatus) &&
        Objects.equals(this.notifyCorrelationIdsForddnFailure, smContextStatusNotification.notifyCorrelationIdsForddnFailure) &&
        Objects.equals(this.newSmfId, smContextStatusNotification.newSmfId) &&
        Objects.equals(this.newSmfSetId, smContextStatusNotification.newSmfSetId) &&
        Objects.equals(this.oldSmfId, smContextStatusNotification.oldSmfId) &&
        Objects.equals(this.oldSmContextRef, smContextStatusNotification.oldSmContextRef) &&
        Objects.equals(this.altAnchorSmfUri, smContextStatusNotification.altAnchorSmfUri) &&
        Objects.equals(this.altAnchorSmfId, smContextStatusNotification.altAnchorSmfId) &&
        Objects.equals(this.targetDnaiInfo, smContextStatusNotification.targetDnaiInfo) &&
        Objects.equals(this.oldPduSessionRef, smContextStatusNotification.oldPduSessionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusInfo, smallDataRateStatus, apnRateStatus, ddnFailureStatus, notifyCorrelationIdsForddnFailure, newSmfId, newSmfSetId, oldSmfId, oldSmContextRef, altAnchorSmfUri, altAnchorSmfId, targetDnaiInfo, oldPduSessionRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextStatusNotification {\n");
    
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    smallDataRateStatus: ").append(toIndentedString(smallDataRateStatus)).append("\n");
    sb.append("    apnRateStatus: ").append(toIndentedString(apnRateStatus)).append("\n");
    sb.append("    ddnFailureStatus: ").append(toIndentedString(ddnFailureStatus)).append("\n");
    sb.append("    notifyCorrelationIdsForddnFailure: ").append(toIndentedString(notifyCorrelationIdsForddnFailure)).append("\n");
    sb.append("    newSmfId: ").append(toIndentedString(newSmfId)).append("\n");
    sb.append("    newSmfSetId: ").append(toIndentedString(newSmfSetId)).append("\n");
    sb.append("    oldSmfId: ").append(toIndentedString(oldSmfId)).append("\n");
    sb.append("    oldSmContextRef: ").append(toIndentedString(oldSmContextRef)).append("\n");
    sb.append("    altAnchorSmfUri: ").append(toIndentedString(altAnchorSmfUri)).append("\n");
    sb.append("    altAnchorSmfId: ").append(toIndentedString(altAnchorSmfId)).append("\n");
    sb.append("    targetDnaiInfo: ").append(toIndentedString(targetDnaiInfo)).append("\n");
    sb.append("    oldPduSessionRef: ").append(toIndentedString(oldPduSessionRef)).append("\n");
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

