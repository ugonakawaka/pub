package aaaa;

import java.util.Objects;
import aaaa.NotificationControlAnyOf;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The enumeration NotificationControl indicates whether notifications are requested from the RAN when the GFBR can no longer (or again) be fulfilled for a QoS Flow during the lifetime of the QoS Flow (see clause 5.7.2.4 of 3GPP TS 23.501). It shall comply with the provisions defined in table 5.5.3.5-1.
 */
@ApiModel(description = "The enumeration NotificationControl indicates whether notifications are requested from the RAN when the GFBR can no longer (or again) be fulfilled for a QoS Flow during the lifetime of the QoS Flow (see clause 5.7.2.4 of 3GPP TS 23.501). It shall comply with the provisions defined in table 5.5.3.5-1.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class NotificationControl   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationControl {\n");
    
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

