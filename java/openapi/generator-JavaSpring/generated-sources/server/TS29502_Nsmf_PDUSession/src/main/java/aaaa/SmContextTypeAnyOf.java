package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SmContextType_anyOf
 */
public enum SmContextTypeAnyOf {
  
  EPS_PDN_CONNECTION("EPS_PDN_CONNECTION"),
  
  SM_CONTEXT("SM_CONTEXT"),
  
  AF_COORDINATION_INFO("AF_COORDINATION_INFO");

  private String value;

  SmContextTypeAnyOf(String value) {
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
  public static SmContextTypeAnyOf fromValue(String value) {
    for (SmContextTypeAnyOf b : SmContextTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

