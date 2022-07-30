package aaaa;

import java.util.Objects;
import aaaa.ProtectionResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Security Result
 */
@ApiModel(description = "Security Result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class SecurityResult   {
  @JsonProperty("integrityProtectionResult")
  private ProtectionResult integrityProtectionResult;

  @JsonProperty("confidentialityProtectionResult")
  private ProtectionResult confidentialityProtectionResult;

  public SecurityResult integrityProtectionResult(ProtectionResult integrityProtectionResult) {
    this.integrityProtectionResult = integrityProtectionResult;
    return this;
  }

  /**
   * Get integrityProtectionResult
   * @return integrityProtectionResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProtectionResult getIntegrityProtectionResult() {
    return integrityProtectionResult;
  }

  public void setIntegrityProtectionResult(ProtectionResult integrityProtectionResult) {
    this.integrityProtectionResult = integrityProtectionResult;
  }

  public SecurityResult confidentialityProtectionResult(ProtectionResult confidentialityProtectionResult) {
    this.confidentialityProtectionResult = confidentialityProtectionResult;
    return this;
  }

  /**
   * Get confidentialityProtectionResult
   * @return confidentialityProtectionResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProtectionResult getConfidentialityProtectionResult() {
    return confidentialityProtectionResult;
  }

  public void setConfidentialityProtectionResult(ProtectionResult confidentialityProtectionResult) {
    this.confidentialityProtectionResult = confidentialityProtectionResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityResult securityResult = (SecurityResult) o;
    return Objects.equals(this.integrityProtectionResult, securityResult.integrityProtectionResult) &&
        Objects.equals(this.confidentialityProtectionResult, securityResult.confidentialityProtectionResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrityProtectionResult, confidentialityProtectionResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityResult {\n");
    
    sb.append("    integrityProtectionResult: ").append(toIndentedString(integrityProtectionResult)).append("\n");
    sb.append("    confidentialityProtectionResult: ").append(toIndentedString(confidentialityProtectionResult)).append("\n");
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

