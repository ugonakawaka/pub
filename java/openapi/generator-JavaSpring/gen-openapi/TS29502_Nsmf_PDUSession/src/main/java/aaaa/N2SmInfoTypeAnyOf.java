package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets N2SmInfoType_anyOf
 */
public enum N2SmInfoTypeAnyOf {
  
  PDU_RES_SETUP_REQ("PDU_RES_SETUP_REQ"),
  
  PDU_RES_SETUP_RSP("PDU_RES_SETUP_RSP"),
  
  PDU_RES_SETUP_FAIL("PDU_RES_SETUP_FAIL"),
  
  PDU_RES_REL_CMD("PDU_RES_REL_CMD"),
  
  PDU_RES_REL_RSP("PDU_RES_REL_RSP"),
  
  PDU_RES_MOD_REQ("PDU_RES_MOD_REQ"),
  
  PDU_RES_MOD_RSP("PDU_RES_MOD_RSP"),
  
  PDU_RES_MOD_FAIL("PDU_RES_MOD_FAIL"),
  
  PDU_RES_NTY("PDU_RES_NTY"),
  
  PDU_RES_NTY_REL("PDU_RES_NTY_REL"),
  
  PDU_RES_MOD_IND("PDU_RES_MOD_IND"),
  
  PDU_RES_MOD_CFM("PDU_RES_MOD_CFM"),
  
  PATH_SWITCH_REQ("PATH_SWITCH_REQ"),
  
  PATH_SWITCH_SETUP_FAIL("PATH_SWITCH_SETUP_FAIL"),
  
  PATH_SWITCH_REQ_ACK("PATH_SWITCH_REQ_ACK"),
  
  PATH_SWITCH_REQ_FAIL("PATH_SWITCH_REQ_FAIL"),
  
  HANDOVER_REQUIRED("HANDOVER_REQUIRED"),
  
  HANDOVER_CMD("HANDOVER_CMD"),
  
  HANDOVER_PREP_FAIL("HANDOVER_PREP_FAIL"),
  
  HANDOVER_REQ_ACK("HANDOVER_REQ_ACK"),
  
  HANDOVER_RES_ALLOC_FAIL("HANDOVER_RES_ALLOC_FAIL"),
  
  SECONDARY_RAT_USAGE("SECONDARY_RAT_USAGE"),
  
  PDU_RES_MOD_IND_FAIL("PDU_RES_MOD_IND_FAIL");

  private String value;

  N2SmInfoTypeAnyOf(String value) {
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
  public static N2SmInfoTypeAnyOf fromValue(String value) {
    for (N2SmInfoTypeAnyOf b : N2SmInfoTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

