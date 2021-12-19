package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets UPInterfaceType_anyOf
 */
public enum UPInterfaceTypeAnyOf {
  
  N3("N3"),
  
  N6("N6"),
  
  N9("N9"),
  
  DATA_FORWARDING("DATA_FORWARDING");

  private String value;

  UPInterfaceTypeAnyOf(String value) {
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
  public static UPInterfaceTypeAnyOf fromValue(String value) {
    for (UPInterfaceTypeAnyOf b : UPInterfaceTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

