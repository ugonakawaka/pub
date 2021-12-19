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
 * Gets or Sets ChangeType_anyOf
 */
public enum ChangeTypeAnyOf {
  
  ADD("ADD"),
  
  MOVE("MOVE"),
  
  REMOVE("REMOVE"),
  
  REPLACE("REPLACE");

  private String value;

  ChangeTypeAnyOf(String value) {
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
  public static ChangeTypeAnyOf fromValue(String value) {
    for (ChangeTypeAnyOf b : ChangeTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

