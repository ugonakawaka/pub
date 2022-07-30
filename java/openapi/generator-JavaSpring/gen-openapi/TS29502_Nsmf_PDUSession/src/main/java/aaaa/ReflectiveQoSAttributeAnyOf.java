package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ReflectiveQoSAttribute_anyOf
 */
public enum ReflectiveQoSAttributeAnyOf {
  
  RQOS("RQOS"),
  
  NO_RQOS("NO_RQOS");

  private String value;

  ReflectiveQoSAttributeAnyOf(String value) {
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
  public static ReflectiveQoSAttributeAnyOf fromValue(String value) {
    for (ReflectiveQoSAttributeAnyOf b : ReflectiveQoSAttributeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

