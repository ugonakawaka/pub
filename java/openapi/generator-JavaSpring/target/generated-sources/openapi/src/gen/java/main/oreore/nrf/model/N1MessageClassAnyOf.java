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
 * Gets or Sets N1MessageClass_anyOf
 */
public enum N1MessageClassAnyOf {
  
  _5GMM("5GMM"),
  
  SM("SM"),
  
  LPP("LPP"),
  
  SMS("SMS"),
  
  UPDP("UPDP"),
  
  LCS("LCS");

  private String value;

  N1MessageClassAnyOf(String value) {
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
  public static N1MessageClassAnyOf fromValue(String value) {
    for (N1MessageClassAnyOf b : N1MessageClassAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

