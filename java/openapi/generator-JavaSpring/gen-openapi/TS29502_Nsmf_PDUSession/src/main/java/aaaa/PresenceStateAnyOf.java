package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PresenceState_anyOf
 */
public enum PresenceStateAnyOf {
  
  IN_AREA("IN_AREA"),
  
  OUT_OF_AREA("OUT_OF_AREA"),
  
  UNKNOWN("UNKNOWN"),
  
  INACTIVE("INACTIVE");

  private String value;

  PresenceStateAnyOf(String value) {
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
  public static PresenceStateAnyOf fromValue(String value) {
    for (PresenceStateAnyOf b : PresenceStateAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

