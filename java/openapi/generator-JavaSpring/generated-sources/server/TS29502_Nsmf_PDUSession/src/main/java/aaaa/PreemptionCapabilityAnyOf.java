package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PreemptionCapability_anyOf
 */
public enum PreemptionCapabilityAnyOf {
  
  NOT_PREEMPT("NOT_PREEMPT"),
  
  MAY_PREEMPT("MAY_PREEMPT");

  private String value;

  PreemptionCapabilityAnyOf(String value) {
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
  public static PreemptionCapabilityAnyOf fromValue(String value) {
    for (PreemptionCapabilityAnyOf b : PreemptionCapabilityAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

