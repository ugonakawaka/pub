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
 * Gets or Sets RatType_anyOf
 */
public enum RatTypeAnyOf {
  
  NR("NR"),
  
  EUTRA("EUTRA"),
  
  WLAN("WLAN"),
  
  VIRTUAL("VIRTUAL"),
  
  NBIOT("NBIOT"),
  
  WIRELINE("WIRELINE"),
  
  WIRELINE_CABLE("WIRELINE_CABLE"),
  
  WIRELINE_BBF("WIRELINE_BBF"),
  
  LTE_M("LTE-M"),
  
  NR_U("NR_U"),
  
  EUTRA_U("EUTRA_U"),
  
  TRUSTED_N3GA("TRUSTED_N3GA"),
  
  TRUSTED_WLAN("TRUSTED_WLAN"),
  
  UTRA("UTRA"),
  
  GERA("GERA"),
  
  NR_LEO("NR_LEO"),
  
  NR_MEO("NR_MEO"),
  
  NR_GEO("NR_GEO"),
  
  NR_OTHER_SAT("NR_OTHER_SAT");

  private String value;

  RatTypeAnyOf(String value) {
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
  public static RatTypeAnyOf fromValue(String value) {
    for (RatTypeAnyOf b : RatTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

