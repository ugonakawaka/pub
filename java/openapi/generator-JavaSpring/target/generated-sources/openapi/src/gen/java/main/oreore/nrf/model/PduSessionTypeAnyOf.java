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
 * Gets or Sets PduSessionType_anyOf
 */
public enum PduSessionTypeAnyOf {
  
  IPV4("IPV4"),
  
  IPV6("IPV6"),
  
  IPV4V6("IPV4V6"),
  
  UNSTRUCTURED("UNSTRUCTURED"),
  
  ETHERNET("ETHERNET");

  private String value;

  PduSessionTypeAnyOf(String value) {
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
  public static PduSessionTypeAnyOf fromValue(String value) {
    for (PduSessionTypeAnyOf b : PduSessionTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

