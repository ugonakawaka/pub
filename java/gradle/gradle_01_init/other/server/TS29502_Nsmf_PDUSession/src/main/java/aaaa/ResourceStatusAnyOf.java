package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ResourceStatus_anyOf
 */
public enum ResourceStatusAnyOf {
  
  RELEASED("RELEASED"),
  
  UNCHANGED("UNCHANGED"),
  
  TRANSFERRED("TRANSFERRED"),
  
  UPDATED("UPDATED"),
  
  ALT_ANCHOR_SMF("ALT_ANCHOR_SMF");

  private String value;

  ResourceStatusAnyOf(String value) {
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
  public static ResourceStatusAnyOf fromValue(String value) {
    for (ResourceStatusAnyOf b : ResourceStatusAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

