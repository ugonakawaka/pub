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
 * The response shall include a Location header field containing a different URI (pointing to a different URI of an other service instance), or the same URI if a request is redirected to the same target resource via a different SCP.
 */
@ApiModel(description = "The response shall include a Location header field containing a different URI (pointing to a different URI of an other service instance), or the same URI if a request is redirected to the same target resource via a different SCP.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class RedirectResponse   {
  @JsonProperty("cause")
  private String cause;

  @JsonProperty("targetScp")
  private String targetScp;

  @JsonProperty("targetSepp")
  private String targetSepp;

  public RedirectResponse cause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @ApiModelProperty(value = "")


  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public RedirectResponse targetScp(String targetScp) {
    this.targetScp = targetScp;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return targetScp
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getTargetScp() {
    return targetScp;
  }

  public void setTargetScp(String targetScp) {
    this.targetScp = targetScp;
  }

  public RedirectResponse targetSepp(String targetSepp) {
    this.targetSepp = targetSepp;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return targetSepp
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getTargetSepp() {
    return targetSepp;
  }

  public void setTargetSepp(String targetSepp) {
    this.targetSepp = targetSepp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectResponse redirectResponse = (RedirectResponse) o;
    return Objects.equals(this.cause, redirectResponse.cause) &&
        Objects.equals(this.targetScp, redirectResponse.targetScp) &&
        Objects.equals(this.targetSepp, redirectResponse.targetSepp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, targetScp, targetSepp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectResponse {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    targetScp: ").append(toIndentedString(targetScp)).append("\n");
    sb.append("    targetSepp: ").append(toIndentedString(targetSepp)).append("\n");
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

