package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets NotificationCause_anyOf
 */
public enum NotificationCauseAnyOf {
  
  QOS_FULFILLED("QOS_FULFILLED"),
  
  QOS_NOT_FULFILLED("QOS_NOT_FULFILLED"),
  
  UP_SEC_FULFILLED("UP_SEC_FULFILLED"),
  
  UP_SEC_NOT_FULFILLED("UP_SEC_NOT_FULFILLED");

  private String value;

  NotificationCauseAnyOf(String value) {
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
  public static NotificationCauseAnyOf fromValue(String value) {
    for (NotificationCauseAnyOf b : NotificationCauseAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

