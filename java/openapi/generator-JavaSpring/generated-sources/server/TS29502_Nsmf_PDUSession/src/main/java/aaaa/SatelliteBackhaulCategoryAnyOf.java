package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SatelliteBackhaulCategory_anyOf
 */
public enum SatelliteBackhaulCategoryAnyOf {
  
  GEO("GEO"),
  
  MEO("MEO"),
  
  LEO("LEO"),
  
  OTHER_SAT("OTHER_SAT"),
  
  NON_SATELLITE("NON_SATELLITE");

  private String value;

  SatelliteBackhaulCategoryAnyOf(String value) {
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
  public static SatelliteBackhaulCategoryAnyOf fromValue(String value) {
    for (SatelliteBackhaulCategoryAnyOf b : SatelliteBackhaulCategoryAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

