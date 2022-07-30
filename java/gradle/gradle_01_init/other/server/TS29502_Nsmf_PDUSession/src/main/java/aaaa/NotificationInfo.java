package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notification Correlation ID and Notification URI provided by the NF service consumer
 */
@ApiModel(description = "Notification Correlation ID and Notification URI provided by the NF service consumer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class NotificationInfo   {
  @JsonProperty("notifId")
  private String notifId;

  @JsonProperty("notifUri")
  private String notifUri;

  @JsonProperty("upBufferInd")
  private Boolean upBufferInd = false;

  public NotificationInfo notifId(String notifId) {
    this.notifId = notifId;
    return this;
  }

  /**
   * Get notifId
   * @return notifId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNotifId() {
    return notifId;
  }

  public void setNotifId(String notifId) {
    this.notifId = notifId;
  }

  public NotificationInfo notifUri(String notifUri) {
    this.notifUri = notifUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return notifUri
  */
  @ApiModelProperty(required = true, value = "String providing an URI formatted according to RFC 3986")
  @NotNull


  public String getNotifUri() {
    return notifUri;
  }

  public void setNotifUri(String notifUri) {
    this.notifUri = notifUri;
  }

  public NotificationInfo upBufferInd(Boolean upBufferInd) {
    this.upBufferInd = upBufferInd;
    return this;
  }

  /**
   * Get upBufferInd
   * @return upBufferInd
  */
  @ApiModelProperty(value = "")


  public Boolean getUpBufferInd() {
    return upBufferInd;
  }

  public void setUpBufferInd(Boolean upBufferInd) {
    this.upBufferInd = upBufferInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationInfo notificationInfo = (NotificationInfo) o;
    return Objects.equals(this.notifId, notificationInfo.notifId) &&
        Objects.equals(this.notifUri, notificationInfo.notifUri) &&
        Objects.equals(this.upBufferInd, notificationInfo.upBufferInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifId, notifUri, upBufferInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationInfo {\n");
    
    sb.append("    notifId: ").append(toIndentedString(notifId)).append("\n");
    sb.append("    notifUri: ").append(toIndentedString(notifUri)).append("\n");
    sb.append("    upBufferInd: ").append(toIndentedString(upBufferInd)).append("\n");
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

