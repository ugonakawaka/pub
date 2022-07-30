package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets UpCnxState_anyOf
 */
public enum UpCnxStateAnyOf {
  
  ACTIVATED("ACTIVATED"),
  
  DEACTIVATED("DEACTIVATED"),
  
  ACTIVATING("ACTIVATING"),
  
  SUSPENDED("SUSPENDED");

  private String value;

  UpCnxStateAnyOf(String value) {
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
  public static UpCnxStateAnyOf fromValue(String value) {
    for (UpCnxStateAnyOf b : UpCnxStateAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

