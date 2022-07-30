package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RequestIndication_anyOf
 */
public enum RequestIndicationAnyOf {
  
  UE_REQ_PDU_SES_MOD("UE_REQ_PDU_SES_MOD"),
  
  UE_REQ_PDU_SES_REL("UE_REQ_PDU_SES_REL"),
  
  PDU_SES_MOB("PDU_SES_MOB"),
  
  NW_REQ_PDU_SES_AUTH("NW_REQ_PDU_SES_AUTH"),
  
  NW_REQ_PDU_SES_MOD("NW_REQ_PDU_SES_MOD"),
  
  NW_REQ_PDU_SES_REL("NW_REQ_PDU_SES_REL"),
  
  EBI_ASSIGNMENT_REQ("EBI_ASSIGNMENT_REQ"),
  
  REL_DUE_TO_5G_AN_REQUEST("REL_DUE_TO_5G_AN_REQUEST");

  private String value;

  RequestIndicationAnyOf(String value) {
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
  public static RequestIndicationAnyOf fromValue(String value) {
    for (RequestIndicationAnyOf b : RequestIndicationAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

