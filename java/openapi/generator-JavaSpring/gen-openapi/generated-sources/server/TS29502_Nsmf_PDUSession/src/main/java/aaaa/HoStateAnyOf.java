package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets HoState_anyOf
 */
public enum HoStateAnyOf {
  
  NONE("NONE"),
  
  PREPARING("PREPARING"),
  
  PREPARED("PREPARED"),
  
  COMPLETED("COMPLETED"),
  
  CANCELLED("CANCELLED");

  private String value;

  HoStateAnyOf(String value) {
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
  public static HoStateAnyOf fromValue(String value) {
    for (HoStateAnyOf b : HoStateAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

