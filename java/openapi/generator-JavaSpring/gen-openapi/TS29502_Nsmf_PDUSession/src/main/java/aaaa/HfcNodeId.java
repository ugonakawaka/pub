package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * REpresents the HFC Node Identifer received over NGAP.
 */
@ApiModel(description = "REpresents the HFC Node Identifer received over NGAP.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class HfcNodeId   {
  @JsonProperty("hfcNId")
  private String hfcNId;

  public HfcNodeId hfcNId(String hfcNId) {
    this.hfcNId = hfcNId;
    return this;
  }

  /**
   * This IE represents the identifier of the HFC node Id as specified in CableLabs WR-TR-5WWC-ARCH. It is provisioned by the wireline operator as part of wireline operations and may contain up to six characters.
   * @return hfcNId
  */
  @ApiModelProperty(required = true, value = "This IE represents the identifier of the HFC node Id as specified in CableLabs WR-TR-5WWC-ARCH. It is provisioned by the wireline operator as part of wireline operations and may contain up to six characters.")
  @NotNull

@Size(max=6) 
  public String getHfcNId() {
    return hfcNId;
  }

  public void setHfcNId(String hfcNId) {
    this.hfcNId = hfcNId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HfcNodeId hfcNodeId = (HfcNodeId) o;
    return Objects.equals(this.hfcNId, hfcNodeId.hfcNId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hfcNId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HfcNodeId {\n");
    
    sb.append("    hfcNId: ").append(toIndentedString(hfcNId)).append("\n");
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

