package aaaa;

import java.util.Objects;
import aaaa.RequestIndicationAnyOf;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request Indication in Update (SM context) service operation. Possible values are - UE_REQ_PDU_SES_MOD - UE_REQ_PDU_SES_REL - PDU_SES_MOB - NW_REQ_PDU_SES_AUTH - NW_REQ_PDU_SES_MOD - NW_REQ_PDU_SES_REL - EBI_ASSIGNMENT_REQ - REL_DUE_TO_5G_AN_REQUEST 
 */
@ApiModel(description = "Request Indication in Update (SM context) service operation. Possible values are - UE_REQ_PDU_SES_MOD - UE_REQ_PDU_SES_REL - PDU_SES_MOB - NW_REQ_PDU_SES_AUTH - NW_REQ_PDU_SES_MOD - NW_REQ_PDU_SES_REL - EBI_ASSIGNMENT_REQ - REL_DUE_TO_5G_AN_REQUEST ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class RequestIndication   {

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
    sb.append("class RequestIndication {\n");
    
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

