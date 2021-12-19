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
 * Gets or Sets N2InformationClass_anyOf
 */
public enum N2InformationClassAnyOf {
  
  SM("SM"),
  
  NRPPA("NRPPa"),
  
  PWS("PWS"),
  
  PWS_BCAL("PWS-BCAL"),
  
  PWS_RF("PWS-RF"),
  
  RAN("RAN"),
  
  V2X("V2X"),
  
  PROSE("PROSE");

  private String value;

  N2InformationClassAnyOf(String value) {
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
  public static N2InformationClassAnyOf fromValue(String value) {
    for (N2InformationClassAnyOf b : N2InformationClassAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

