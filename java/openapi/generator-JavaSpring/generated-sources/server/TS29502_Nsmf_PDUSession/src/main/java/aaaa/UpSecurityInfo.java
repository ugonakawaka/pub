package aaaa;

import java.util.Objects;
import aaaa.MaxIntegrityProtectedDataRate;
import aaaa.SecurityResult;
import aaaa.UpSecurity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User Plane Security Information
 */
@ApiModel(description = "User Plane Security Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class UpSecurityInfo   {
  @JsonProperty("upSecurity")
  private UpSecurity upSecurity;

  @JsonProperty("maxIntegrityProtectedDataRateUl")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl;

  @JsonProperty("maxIntegrityProtectedDataRateDl")
  private MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl;

  @JsonProperty("securityResult")
  private SecurityResult securityResult;

  public UpSecurityInfo upSecurity(UpSecurity upSecurity) {
    this.upSecurity = upSecurity;
    return this;
  }

  /**
   * Get upSecurity
   * @return upSecurity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UpSecurity getUpSecurity() {
    return upSecurity;
  }

  public void setUpSecurity(UpSecurity upSecurity) {
    this.upSecurity = upSecurity;
  }

  public UpSecurityInfo maxIntegrityProtectedDataRateUl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl) {
    this.maxIntegrityProtectedDataRateUl = maxIntegrityProtectedDataRateUl;
    return this;
  }

  /**
   * Get maxIntegrityProtectedDataRateUl
   * @return maxIntegrityProtectedDataRateUl
  */
  @ApiModelProperty(value = "")

  @Valid

  public MaxIntegrityProtectedDataRate getMaxIntegrityProtectedDataRateUl() {
    return maxIntegrityProtectedDataRateUl;
  }

  public void setMaxIntegrityProtectedDataRateUl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateUl) {
    this.maxIntegrityProtectedDataRateUl = maxIntegrityProtectedDataRateUl;
  }

  public UpSecurityInfo maxIntegrityProtectedDataRateDl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl) {
    this.maxIntegrityProtectedDataRateDl = maxIntegrityProtectedDataRateDl;
    return this;
  }

  /**
   * Get maxIntegrityProtectedDataRateDl
   * @return maxIntegrityProtectedDataRateDl
  */
  @ApiModelProperty(value = "")

  @Valid

  public MaxIntegrityProtectedDataRate getMaxIntegrityProtectedDataRateDl() {
    return maxIntegrityProtectedDataRateDl;
  }

  public void setMaxIntegrityProtectedDataRateDl(MaxIntegrityProtectedDataRate maxIntegrityProtectedDataRateDl) {
    this.maxIntegrityProtectedDataRateDl = maxIntegrityProtectedDataRateDl;
  }

  public UpSecurityInfo securityResult(SecurityResult securityResult) {
    this.securityResult = securityResult;
    return this;
  }

  /**
   * Get securityResult
   * @return securityResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityResult getSecurityResult() {
    return securityResult;
  }

  public void setSecurityResult(SecurityResult securityResult) {
    this.securityResult = securityResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpSecurityInfo upSecurityInfo = (UpSecurityInfo) o;
    return Objects.equals(this.upSecurity, upSecurityInfo.upSecurity) &&
        Objects.equals(this.maxIntegrityProtectedDataRateUl, upSecurityInfo.maxIntegrityProtectedDataRateUl) &&
        Objects.equals(this.maxIntegrityProtectedDataRateDl, upSecurityInfo.maxIntegrityProtectedDataRateDl) &&
        Objects.equals(this.securityResult, upSecurityInfo.securityResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upSecurity, maxIntegrityProtectedDataRateUl, maxIntegrityProtectedDataRateDl, securityResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpSecurityInfo {\n");
    
    sb.append("    upSecurity: ").append(toIndentedString(upSecurity)).append("\n");
    sb.append("    maxIntegrityProtectedDataRateUl: ").append(toIndentedString(maxIntegrityProtectedDataRateUl)).append("\n");
    sb.append("    maxIntegrityProtectedDataRateDl: ").append(toIndentedString(maxIntegrityProtectedDataRateDl)).append("\n");
    sb.append("    securityResult: ").append(toIndentedString(securityResult)).append("\n");
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

