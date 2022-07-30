package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QosResourceType_anyOf
 */
public enum QosResourceTypeAnyOf {
  
  NON_GBR("NON_GBR"),
  
  NON_CRITICAL_GBR("NON_CRITICAL_GBR"),
  
  CRITICAL_GBR("CRITICAL_GBR");

  private String value;

  QosResourceTypeAnyOf(String value) {
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
  public static QosResourceTypeAnyOf fromValue(String value) {
    for (QosResourceTypeAnyOf b : QosResourceTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

