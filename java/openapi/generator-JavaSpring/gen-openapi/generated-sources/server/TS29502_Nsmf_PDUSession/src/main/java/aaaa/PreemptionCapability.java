package aaaa;

import java.util.Objects;
import aaaa.PreemptionCapabilityAnyOf;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The enumeration PreemptionCapability indicates the pre-emption capability of a request on other QoS flows. See clause 5.7.2.2 of 3GPP TS 23.501. It shall comply with the provisions defined in table 5.5.3.1-1.
 */
@ApiModel(description = "The enumeration PreemptionCapability indicates the pre-emption capability of a request on other QoS flows. See clause 5.7.2.2 of 3GPP TS 23.501. It shall comply with the provisions defined in table 5.5.3.1-1.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class PreemptionCapability   {

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
    sb.append("class PreemptionCapability {\n");
    
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

