package aaaa;

import java.util.Objects;
import aaaa.N2SmInfoTypeAnyOf;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * N2 SM Information Type. Possible values are - PDU_RES_SETUP_REQ - PDU_RES_SETUP_RSP - PDU_RES_SETUP_FAIL - PDU_RES_REL_CMD - PDU_RES_REL_RSP - PDU_RES_MOD_REQ - PDU_RES_MOD_RSP - PDU_RES_MOD_FAIL - PDU_RES_NTY - PDU_RES_NTY_REL - PDU_RES_MOD_IND - PDU_RES_MOD_CFM - PATH_SWITCH_REQ - PATH_SWITCH_SETUP_FAIL - PATH_SWITCH_REQ_ACK - PATH_SWITCH_REQ_FAIL - HANDOVER_REQUIRED - HANDOVER_CMD - HANDOVER_PREP_FAIL - HANDOVER_REQ_ACK - HANDOVER_RES_ALLOC_FAIL - SECONDARY_RAT_USAGE - PDU_RES_MOD_IND_FAIL 
 */
@ApiModel(description = "N2 SM Information Type. Possible values are - PDU_RES_SETUP_REQ - PDU_RES_SETUP_RSP - PDU_RES_SETUP_FAIL - PDU_RES_REL_CMD - PDU_RES_REL_RSP - PDU_RES_MOD_REQ - PDU_RES_MOD_RSP - PDU_RES_MOD_FAIL - PDU_RES_NTY - PDU_RES_NTY_REL - PDU_RES_MOD_IND - PDU_RES_MOD_CFM - PATH_SWITCH_REQ - PATH_SWITCH_SETUP_FAIL - PATH_SWITCH_REQ_ACK - PATH_SWITCH_REQ_FAIL - HANDOVER_REQUIRED - HANDOVER_CMD - HANDOVER_PREP_FAIL - HANDOVER_REQ_ACK - HANDOVER_RES_ALLOC_FAIL - SECONDARY_RAT_USAGE - PDU_RES_MOD_IND_FAIL ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class N2SmInfoType   {

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
    sb.append("class N2SmInfoType {\n");
    
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

