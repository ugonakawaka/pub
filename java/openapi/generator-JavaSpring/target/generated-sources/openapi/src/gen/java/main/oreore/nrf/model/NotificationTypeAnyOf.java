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
 * Gets or Sets NotificationType_anyOf
 */
public enum NotificationTypeAnyOf {
  
  N1_MESSAGES("N1_MESSAGES"),
  
  N2_INFORMATION("N2_INFORMATION"),
  
  LOCATION_NOTIFICATION("LOCATION_NOTIFICATION"),
  
  DATA_REMOVAL_NOTIFICATION("DATA_REMOVAL_NOTIFICATION"),
  
  DATA_CHANGE_NOTIFICATION("DATA_CHANGE_NOTIFICATION"),
  
  LOCATION_UPDATE_NOTIFICATION("LOCATION_UPDATE_NOTIFICATION"),
  
  NSSAA_REAUTH_NOTIFICATION("NSSAA_REAUTH_NOTIFICATION"),
  
  NSSAA_REVOC_NOTIFICATION("NSSAA_REVOC_NOTIFICATION"),
  
  MATCH_INFO_NOTIFICATION("MATCH_INFO_NOTIFICATION");

  private String value;

  NotificationTypeAnyOf(String value) {
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
  public static NotificationTypeAnyOf fromValue(String value) {
    for (NotificationTypeAnyOf b : NotificationTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

