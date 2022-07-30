package aaaa;

import java.util.Objects;
import aaaa.CauseAnyOf;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cause information. Possible values are - REL_DUE_TO_HO - EPS_FALLBACK - REL_DUE_TO_UP_SEC - DNN_CONGESTION - S_NSSAI_CONGESTION - REL_DUE_TO_REACTIVATION - 5G_AN_NOT_RESPONDING - REL_DUE_TO_SLICE_NOT_AVAILABLE - REL_DUE_TO_DUPLICATE_SESSION_ID - PDU_SESSION_STATUS_MISMATCH - HO_FAILURE - INSUFFICIENT_UP_RESOURCES - PDU_SESSION_HANDED_OVER - PDU_SESSION_RESUMED - CN_ASSISTED_RAN_PARAMETER_TUNING - ISMF_CONTEXT_TRANSFER - SMF_CONTEXT_TRANSFER - REL_DUE_TO_PS_TO_CS_HO - REL_DUE_TO_SUBSCRIPTION_CHANGE - HO_CANCEL - REL_DUE_TO_SLICE_NOT_AUTHORIZED - PDU_SESSION_HAND_OVER_FAILURE - DDN_FAILURE_STATUS - REL_DUE_TO_CP_ONLY_NOT_APPLICABLE - NOT_SUPPORTED_WITH_ISMF - CHANGED_ANCHOR_SMF - CHANGED_INTERMEDIATE_SMF - TARGET_DNAI_NOTIFICATION 
 */
@ApiModel(description = "Cause information. Possible values are - REL_DUE_TO_HO - EPS_FALLBACK - REL_DUE_TO_UP_SEC - DNN_CONGESTION - S_NSSAI_CONGESTION - REL_DUE_TO_REACTIVATION - 5G_AN_NOT_RESPONDING - REL_DUE_TO_SLICE_NOT_AVAILABLE - REL_DUE_TO_DUPLICATE_SESSION_ID - PDU_SESSION_STATUS_MISMATCH - HO_FAILURE - INSUFFICIENT_UP_RESOURCES - PDU_SESSION_HANDED_OVER - PDU_SESSION_RESUMED - CN_ASSISTED_RAN_PARAMETER_TUNING - ISMF_CONTEXT_TRANSFER - SMF_CONTEXT_TRANSFER - REL_DUE_TO_PS_TO_CS_HO - REL_DUE_TO_SUBSCRIPTION_CHANGE - HO_CANCEL - REL_DUE_TO_SLICE_NOT_AUTHORIZED - PDU_SESSION_HAND_OVER_FAILURE - DDN_FAILURE_STATUS - REL_DUE_TO_CP_ONLY_NOT_APPLICABLE - NOT_SUPPORTED_WITH_ISMF - CHANGED_ANCHOR_SMF - CHANGED_INTERMEDIATE_SMF - TARGET_DNAI_NOTIFICATION ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class Cause   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cause {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

