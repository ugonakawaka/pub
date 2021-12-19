package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets NotificationEventType_anyOf
 */
public enum NotificationEventTypeAnyOf {
  
  REGISTERED("NF_REGISTERED"),
  
  DEREGISTERED("NF_DEREGISTERED"),
  
  PROFILE_CHANGED("NF_PROFILE_CHANGED");

  private String value;

  NotificationEventTypeAnyOf(String value) {
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
  public static NotificationEventTypeAnyOf fromValue(String value) {
    for (NotificationEventTypeAnyOf b : NotificationEventTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

