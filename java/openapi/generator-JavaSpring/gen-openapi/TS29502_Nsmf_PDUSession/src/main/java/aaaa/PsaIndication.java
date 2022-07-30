package aaaa;

import java.util.Objects;
import aaaa.PsaIndicationAnyOf;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indication of whether a PSA is inserted or removed. Possible values are   - PSA_INSERTED   - PSA_REMOVED   - PSA_INSERTED_ONLY   - PSA_REMOVED_ONLY 
 */
@ApiModel(description = "Indication of whether a PSA is inserted or removed. Possible values are   - PSA_INSERTED   - PSA_REMOVED   - PSA_INSERTED_ONLY   - PSA_REMOVED_ONLY ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class PsaIndication   {

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
    sb.append("class PsaIndication {\n");
    
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

