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
 * Gets or Sets NwdafEvent_anyOf
 */
public enum NwdafEventAnyOf {
  
  SLICE_LOAD_LEVEL("SLICE_LOAD_LEVEL"),
  
  NETWORK_PERFORMANCE("NETWORK_PERFORMANCE"),
  
  NF_LOAD("NF_LOAD"),
  
  SERVICE_EXPERIENCE("SERVICE_EXPERIENCE"),
  
  UE_MOBILITY("UE_MOBILITY"),
  
  UE_COMMUNICATION("UE_COMMUNICATION"),
  
  QOS_SUSTAINABILITY("QOS_SUSTAINABILITY"),
  
  ABNORMAL_BEHAVIOUR("ABNORMAL_BEHAVIOUR"),
  
  USER_DATA_CONGESTION("USER_DATA_CONGESTION"),
  
  NSI_LOAD_LEVEL("NSI_LOAD_LEVEL");

  private String value;

  NwdafEventAnyOf(String value) {
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
  public static NwdafEventAnyOf fromValue(String value) {
    for (NwdafEventAnyOf b : NwdafEventAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

