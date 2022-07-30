package aaaa;

import java.util.Objects;
import aaaa.NotificationCause;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notification related to a QoS flow
 */
@ApiModel(description = "Notification related to a QoS flow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class QosFlowNotifyItem   {
  @JsonProperty("qfi")
  private Integer qfi;

  @JsonProperty("notificationCause")
  private NotificationCause notificationCause;

  @JsonProperty("currentQosProfileIndex")
  private Integer currentQosProfileIndex;

  @JsonProperty("nullQoSProfileIndex")
  private Boolean nullQoSProfileIndex;

  public QosFlowNotifyItem qfi(Integer qfi) {
    this.qfi = qfi;
    return this;
  }

  /**
   * Unsigned integer identifying a QoS flow, within the range 0 to 63.
   * minimum: 0
   * maximum: 63
   * @return qfi
  */
  @ApiModelProperty(required = true, value = "Unsigned integer identifying a QoS flow, within the range 0 to 63.")
  @NotNull

@Min(0) @Max(63) 
  public Integer getQfi() {
    return qfi;
  }

  public void setQfi(Integer qfi) {
    this.qfi = qfi;
  }

  public QosFlowNotifyItem notificationCause(NotificationCause notificationCause) {
    this.notificationCause = notificationCause;
    return this;
  }

  /**
   * Get notificationCause
   * @return notificationCause
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NotificationCause getNotificationCause() {
    return notificationCause;
  }

  public void setNotificationCause(NotificationCause notificationCause) {
    this.notificationCause = notificationCause;
  }

  public QosFlowNotifyItem currentQosProfileIndex(Integer currentQosProfileIndex) {
    this.currentQosProfileIndex = currentQosProfileIndex;
    return this;
  }

  /**
   * Get currentQosProfileIndex
   * minimum: 1
   * maximum: 8
   * @return currentQosProfileIndex
  */
  @ApiModelProperty(value = "")

@Min(1) @Max(8) 
  public Integer getCurrentQosProfileIndex() {
    return currentQosProfileIndex;
  }

  public void setCurrentQosProfileIndex(Integer currentQosProfileIndex) {
    this.currentQosProfileIndex = currentQosProfileIndex;
  }

  public QosFlowNotifyItem nullQoSProfileIndex(Boolean nullQoSProfileIndex) {
    this.nullQoSProfileIndex = nullQoSProfileIndex;
    return this;
  }

  /**
   * Get nullQoSProfileIndex
   * @return nullQoSProfileIndex
  */
  @ApiModelProperty(value = "")


  public Boolean getNullQoSProfileIndex() {
    return nullQoSProfileIndex;
  }

  public void setNullQoSProfileIndex(Boolean nullQoSProfileIndex) {
    this.nullQoSProfileIndex = nullQoSProfileIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosFlowNotifyItem qosFlowNotifyItem = (QosFlowNotifyItem) o;
    return Objects.equals(this.qfi, qosFlowNotifyItem.qfi) &&
        Objects.equals(this.notificationCause, qosFlowNotifyItem.notificationCause) &&
        Objects.equals(this.currentQosProfileIndex, qosFlowNotifyItem.currentQosProfileIndex) &&
        Objects.equals(this.nullQoSProfileIndex, qosFlowNotifyItem.nullQoSProfileIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qfi, notificationCause, currentQosProfileIndex, nullQoSProfileIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosFlowNotifyItem {\n");
    
    sb.append("    qfi: ").append(toIndentedString(qfi)).append("\n");
    sb.append("    notificationCause: ").append(toIndentedString(notificationCause)).append("\n");
    sb.append("    currentQosProfileIndex: ").append(toIndentedString(currentQosProfileIndex)).append("\n");
    sb.append("    nullQoSProfileIndex: ").append(toIndentedString(nullQoSProfileIndex)).append("\n");
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

