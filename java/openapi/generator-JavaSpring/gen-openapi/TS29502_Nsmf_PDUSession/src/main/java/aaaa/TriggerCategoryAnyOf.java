package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TriggerCategory_anyOf
 */
public enum TriggerCategoryAnyOf {
  
  IMMEDIATE_REPORT("IMMEDIATE_REPORT"),
  
  DEFERRED_REPORT("DEFERRED_REPORT");

  private String value;

  TriggerCategoryAnyOf(String value) {
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
  public static TriggerCategoryAnyOf fromValue(String value) {
    for (TriggerCategoryAnyOf b : TriggerCategoryAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

