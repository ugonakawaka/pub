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
 * Problem Details Additional Information
 */
@ApiModel(description = "Problem Details Additional Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class ProblemDetailsAddInfo   {
  @JsonProperty("remoteError")
  private Boolean remoteError;

  public ProblemDetailsAddInfo remoteError(Boolean remoteError) {
    this.remoteError = remoteError;
    return this;
  }

  /**
   * Get remoteError
   * @return remoteError
  */
  @ApiModelProperty(value = "")


  public Boolean getRemoteError() {
    return remoteError;
  }

  public void setRemoteError(Boolean remoteError) {
    this.remoteError = remoteError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetailsAddInfo problemDetailsAddInfo = (ProblemDetailsAddInfo) o;
    return Objects.equals(this.remoteError, problemDetailsAddInfo.remoteError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetailsAddInfo {\n");
    
    sb.append("    remoteError: ").append(toIndentedString(remoteError)).append("\n");
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

