package aaaa;

import java.util.Objects;
import aaaa.N4MessageTypeAnyOf;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * N4 Message Type. Possible values are   - PFCP_SES_EST_REQ   - PFCP_SES_EST_RSP   - PFCP_SES_MOD_REQ   - PFCP_SES_MOD_RSP   - PFCP_SES_DEL_REQ   - PFCP_SES_DEL_RSP   - PFCP_SES_REP_REQ   - PFCP_SES_REP_RSP 
 */
@ApiModel(description = "N4 Message Type. Possible values are   - PFCP_SES_EST_REQ   - PFCP_SES_EST_RSP   - PFCP_SES_MOD_REQ   - PFCP_SES_MOD_RSP   - PFCP_SES_DEL_REQ   - PFCP_SES_DEL_RSP   - PFCP_SES_REP_REQ   - PFCP_SES_REP_RSP ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class N4MessageType   {

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
    sb.append("class N4MessageType {\n");
    
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

