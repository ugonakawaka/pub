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
 * Gets or Sets NFType_anyOf
 */
public enum NFTypeAnyOf {
  
  NRF("NRF"),
  
  UDM("UDM"),
  
  AMF("AMF"),
  
  SMF("SMF"),
  
  AUSF("AUSF"),
  
  NEF("NEF"),
  
  PCF("PCF"),
  
  SMSF("SMSF"),
  
  NSSF("NSSF"),
  
  UDR("UDR"),
  
  LMF("LMF"),
  
  GMLC("GMLC"),
  
  _5G_EIR("5G_EIR"),
  
  SEPP("SEPP"),
  
  UPF("UPF"),
  
  N3IWF("N3IWF"),
  
  AF("AF"),
  
  UDSF("UDSF"),
  
  BSF("BSF"),
  
  CHF("CHF"),
  
  NWDAF("NWDAF"),
  
  PCSCF("PCSCF"),
  
  CBCF("CBCF"),
  
  HSS("HSS"),
  
  UCMF("UCMF"),
  
  SOR_AF("SOR_AF"),
  
  SPAF("SPAF"),
  
  MME("MME"),
  
  SCSAS("SCSAS"),
  
  SCEF("SCEF"),
  
  SCP("SCP"),
  
  NSSAAF("NSSAAF"),
  
  ICSCF("ICSCF"),
  
  SCSCF("SCSCF"),
  
  DRA("DRA"),
  
  AANF("AANF"),
  
  _5G_DDNMF("5G_DDNMF"),
  
  NSACF("NSACF"),
  
  MFAF("MFAF"),
  
  EASDF("EASDF"),
  
  DCCF("DCCF");

  private String value;

  NFTypeAnyOf(String value) {
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
  public static NFTypeAnyOf fromValue(String value) {
    for (NFTypeAnyOf b : NFTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

