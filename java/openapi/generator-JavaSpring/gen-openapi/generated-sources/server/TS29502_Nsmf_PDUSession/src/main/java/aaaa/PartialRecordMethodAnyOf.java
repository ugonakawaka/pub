package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PartialRecordMethod_anyOf
 */
public enum PartialRecordMethodAnyOf {
  
  DEFAULT("DEFAULT"),
  
  INDIVIDUAL("INDIVIDUAL");

  private String value;

  PartialRecordMethodAnyOf(String value) {
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
  public static PartialRecordMethodAnyOf fromValue(String value) {
    for (PartialRecordMethodAnyOf b : PartialRecordMethodAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

