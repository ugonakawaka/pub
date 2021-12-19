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
 * Gets or Sets ExternalClientType_anyOf
 */
public enum ExternalClientTypeAnyOf {
  
  EMERGENCY_SERVICES("EMERGENCY_SERVICES"),
  
  VALUE_ADDED_SERVICES("VALUE_ADDED_SERVICES"),
  
  PLMN_OPERATOR_SERVICES("PLMN_OPERATOR_SERVICES"),
  
  LAWFUL_INTERCEPT_SERVICES("LAWFUL_INTERCEPT_SERVICES"),
  
  PLMN_OPERATOR_BROADCAST_SERVICES("PLMN_OPERATOR_BROADCAST_SERVICES"),
  
  PLMN_OPERATOR_OM("PLMN_OPERATOR_OM"),
  
  PLMN_OPERATOR_ANONYMOUS_STATISTICS("PLMN_OPERATOR_ANONYMOUS_STATISTICS"),
  
  PLMN_OPERATOR_TARGET_MS_SERVICE_SUPPORT("PLMN_OPERATOR_TARGET_MS_SERVICE_SUPPORT");

  private String value;

  ExternalClientTypeAnyOf(String value) {
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
  public static ExternalClientTypeAnyOf fromValue(String value) {
    for (ExternalClientTypeAnyOf b : ExternalClientTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

