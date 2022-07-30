package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets DnnSelectionMode_anyOf
 */
public enum DnnSelectionModeAnyOf {
  
  VERIFIED("VERIFIED"),
  
  UE_DNN_NOT_VERIFIED("UE_DNN_NOT_VERIFIED"),
  
  NW_DNN_NOT_VERIFIED("NW_DNN_NOT_VERIFIED");

  private String value;

  DnnSelectionModeAnyOf(String value) {
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
  public static DnnSelectionModeAnyOf fromValue(String value) {
    for (DnnSelectionModeAnyOf b : DnnSelectionModeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

