package aaaa;

import java.util.Objects;
import aaaa.AccessTokenErr;
import aaaa.AccessTokenReq;
import aaaa.InvalidParam;
import aaaa.ProblemDetails;
import aaaa.ProblemDetailsAddInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Extended Problem Details
 */
@ApiModel(description = "Extended Problem Details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class ExtProblemDetails   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("instance")
  private String instance;

  @JsonProperty("cause")
  private String cause;

  @JsonProperty("invalidParams")
  @Valid
  private List<InvalidParam> invalidParams = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("accessTokenError")
  private AccessTokenErr accessTokenError;

  @JsonProperty("accessTokenRequest")
  private AccessTokenReq accessTokenRequest;

  @JsonProperty("nrfId")
  private String nrfId;

  @JsonProperty("remoteError")
  private Boolean remoteError;

  public ExtProblemDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return type
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ExtProblemDetails title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ExtProblemDetails status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ExtProblemDetails detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  */
  @ApiModelProperty(value = "A human-readable explanation specific to this occurrence of the problem.")


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ExtProblemDetails instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return instance
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public ExtProblemDetails cause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * A machine-readable application error cause specific to this occurrence of the problem. This IE should be present and provide application-related error information, if available.
   * @return cause
  */
  @ApiModelProperty(value = "A machine-readable application error cause specific to this occurrence of the problem. This IE should be present and provide application-related error information, if available.")


  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public ExtProblemDetails invalidParams(List<InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  public ExtProblemDetails addInvalidParamsItem(InvalidParam invalidParamsItem) {
    if (this.invalidParams == null) {
      this.invalidParams = new ArrayList<>();
    }
    this.invalidParams.add(invalidParamsItem);
    return this;
  }

  /**
   * Get invalidParams
   * @return invalidParams
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<InvalidParam> getInvalidParams() {
    return invalidParams;
  }

  public void setInvalidParams(List<InvalidParam> invalidParams) {
    this.invalidParams = invalidParams;
  }

  public ExtProblemDetails supportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported
   * @return supportedFeatures
  */
  @ApiModelProperty(value = "A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported")

@Pattern(regexp="^[A-Fa-f0-9]*$") 
  public String getSupportedFeatures() {
    return supportedFeatures;
  }

  public void setSupportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }

  public ExtProblemDetails accessTokenError(AccessTokenErr accessTokenError) {
    this.accessTokenError = accessTokenError;
    return this;
  }

  /**
   * Get accessTokenError
   * @return accessTokenError
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessTokenErr getAccessTokenError() {
    return accessTokenError;
  }

  public void setAccessTokenError(AccessTokenErr accessTokenError) {
    this.accessTokenError = accessTokenError;
  }

  public ExtProblemDetails accessTokenRequest(AccessTokenReq accessTokenRequest) {
    this.accessTokenRequest = accessTokenRequest;
    return this;
  }

  /**
   * Get accessTokenRequest
   * @return accessTokenRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessTokenReq getAccessTokenRequest() {
    return accessTokenRequest;
  }

  public void setAccessTokenRequest(AccessTokenReq accessTokenRequest) {
    this.accessTokenRequest = accessTokenRequest;
  }

  public ExtProblemDetails nrfId(String nrfId) {
    this.nrfId = nrfId;
    return this;
  }

  /**
   * Get nrfId
   * @return nrfId
  */
  @ApiModelProperty(value = "")


  public String getNrfId() {
    return nrfId;
  }

  public void setNrfId(String nrfId) {
    this.nrfId = nrfId;
  }

  public ExtProblemDetails remoteError(Boolean remoteError) {
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
    ExtProblemDetails extProblemDetails = (ExtProblemDetails) o;
    return Objects.equals(this.type, extProblemDetails.type) &&
        Objects.equals(this.title, extProblemDetails.title) &&
        Objects.equals(this.status, extProblemDetails.status) &&
        Objects.equals(this.detail, extProblemDetails.detail) &&
        Objects.equals(this.instance, extProblemDetails.instance) &&
        Objects.equals(this.cause, extProblemDetails.cause) &&
        Objects.equals(this.invalidParams, extProblemDetails.invalidParams) &&
        Objects.equals(this.supportedFeatures, extProblemDetails.supportedFeatures) &&
        Objects.equals(this.accessTokenError, extProblemDetails.accessTokenError) &&
        Objects.equals(this.accessTokenRequest, extProblemDetails.accessTokenRequest) &&
        Objects.equals(this.nrfId, extProblemDetails.nrfId) &&
        Objects.equals(this.remoteError, extProblemDetails.remoteError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, cause, invalidParams, supportedFeatures, accessTokenError, accessTokenRequest, nrfId, remoteError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtProblemDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    invalidParams: ").append(toIndentedString(invalidParams)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    accessTokenError: ").append(toIndentedString(accessTokenError)).append("\n");
    sb.append("    accessTokenRequest: ").append(toIndentedString(accessTokenRequest)).append("\n");
    sb.append("    nrfId: ").append(toIndentedString(nrfId)).append("\n");
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

