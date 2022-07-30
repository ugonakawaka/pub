package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets StationaryIndication_anyOf
 */
public enum StationaryIndicationAnyOf {
  
  STATIONARY("STATIONARY"),
  
  MOBILE("MOBILE");

  private String value;

  StationaryIndicationAnyOf(String value) {
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
  public static StationaryIndicationAnyOf fromValue(String value) {
    for (StationaryIndicationAnyOf b : StationaryIndicationAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

