package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TrafficProfile_anyOf
 */
public enum TrafficProfileAnyOf {
  
  SINGLE_TRANS_UL("SINGLE_TRANS_UL"),
  
  SINGLE_TRANS_DL("SINGLE_TRANS_DL"),
  
  DUAL_TRANS_UL_FIRST("DUAL_TRANS_UL_FIRST"),
  
  DUAL_TRANS_DL_FIRST("DUAL_TRANS_DL_FIRST"),
  
  MULTI_TRANS("MULTI_TRANS");

  private String value;

  TrafficProfileAnyOf(String value) {
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
  public static TrafficProfileAnyOf fromValue(String value) {
    for (TrafficProfileAnyOf b : TrafficProfileAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

