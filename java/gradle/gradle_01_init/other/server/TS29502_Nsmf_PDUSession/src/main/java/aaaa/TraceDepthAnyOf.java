package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TraceDepth_anyOf
 */
public enum TraceDepthAnyOf {
  
  MINIMUM("MINIMUM"),
  
  MEDIUM("MEDIUM"),
  
  MAXIMUM("MAXIMUM"),
  
  MINIMUM_WO_VENDOR_EXTENSION("MINIMUM_WO_VENDOR_EXTENSION"),
  
  MEDIUM_WO_VENDOR_EXTENSION("MEDIUM_WO_VENDOR_EXTENSION"),
  
  MAXIMUM_WO_VENDOR_EXTENSION("MAXIMUM_WO_VENDOR_EXTENSION");

  private String value;

  TraceDepthAnyOf(String value) {
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
  public static TraceDepthAnyOf fromValue(String value) {
    for (TraceDepthAnyOf b : TraceDepthAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

