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
 * Notification related to a PDU session
 */
@ApiModel(description = "Notification related to a PDU session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class PduSessionNotifyItem   {
  @JsonProperty("notificationCause")
  private NotificationCause notificationCause;

  public PduSessionNotifyItem notificationCause(NotificationCause notificationCause) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PduSessionNotifyItem pduSessionNotifyItem = (PduSessionNotifyItem) o;
    return Objects.equals(this.notificationCause, pduSessionNotifyItem.notificationCause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationCause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PduSessionNotifyItem {\n");
    
    sb.append("    notificationCause: ").append(toIndentedString(notificationCause)).append("\n");
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

