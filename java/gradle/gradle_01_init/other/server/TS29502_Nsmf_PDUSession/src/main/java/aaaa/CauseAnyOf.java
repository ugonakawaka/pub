package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Cause_anyOf
 */
public enum CauseAnyOf {
  
  REL_DUE_TO_HO("REL_DUE_TO_HO"),
  
  EPS_FALLBACK("EPS_FALLBACK"),
  
  REL_DUE_TO_UP_SEC("REL_DUE_TO_UP_SEC"),
  
  DNN_CONGESTION("DNN_CONGESTION"),
  
  S_NSSAI_CONGESTION("S_NSSAI_CONGESTION"),
  
  REL_DUE_TO_REACTIVATION("REL_DUE_TO_REACTIVATION"),
  
  _5G_AN_NOT_RESPONDING("5G_AN_NOT_RESPONDING"),
  
  REL_DUE_TO_SLICE_NOT_AVAILABLE("REL_DUE_TO_SLICE_NOT_AVAILABLE"),
  
  REL_DUE_TO_DUPLICATE_SESSION_ID("REL_DUE_TO_DUPLICATE_SESSION_ID"),
  
  PDU_SESSION_STATUS_MISMATCH("PDU_SESSION_STATUS_MISMATCH"),
  
  HO_FAILURE("HO_FAILURE"),
  
  INSUFFICIENT_UP_RESOURCES("INSUFFICIENT_UP_RESOURCES"),
  
  PDU_SESSION_HANDED_OVER("PDU_SESSION_HANDED_OVER"),
  
  PDU_SESSION_RESUMED("PDU_SESSION_RESUMED"),
  
  CN_ASSISTED_RAN_PARAMETER_TUNING("CN_ASSISTED_RAN_PARAMETER_TUNING"),
  
  ISMF_CONTEXT_TRANSFER("ISMF_CONTEXT_TRANSFER"),
  
  SMF_CONTEXT_TRANSFER("SMF_CONTEXT_TRANSFER"),
  
  REL_DUE_TO_PS_TO_CS_HO("REL_DUE_TO_PS_TO_CS_HO"),
  
  REL_DUE_TO_SUBSCRIPTION_CHANGE("REL_DUE_TO_SUBSCRIPTION_CHANGE"),
  
  HO_CANCEL("HO_CANCEL"),
  
  REL_DUE_TO_SLICE_NOT_AUTHORIZED("REL_DUE_TO_SLICE_NOT_AUTHORIZED"),
  
  PDU_SESSION_HAND_OVER_FAILURE("PDU_SESSION_HAND_OVER_FAILURE"),
  
  DDN_FAILURE_STATUS("DDN_FAILURE_STATUS"),
  
  REL_DUE_TO_CP_ONLY_NOT_APPLICABLE("REL_DUE_TO_CP_ONLY_NOT_APPLICABLE"),
  
  NOT_SUPPORTED_WITH_ISMF("NOT_SUPPORTED_WITH_ISMF"),
  
  CHANGED_ANCHOR_SMF("CHANGED_ANCHOR_SMF"),
  
  CHANGED_INTERMEDIATE_SMF("CHANGED_INTERMEDIATE_SMF"),
  
  TARGET_DNAI_NOTIFICATION("TARGET_DNAI_NOTIFICATION");

  private String value;

  CauseAnyOf(String value) {
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
  public static CauseAnyOf fromValue(String value) {
    for (CauseAnyOf b : CauseAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

