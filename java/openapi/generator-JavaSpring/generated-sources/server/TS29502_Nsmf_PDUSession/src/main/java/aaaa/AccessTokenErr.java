package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error returned in the access token response message
 */
@ApiModel(description = "Error returned in the access token response message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class AccessTokenErr   {
  /**
   * Gets or Sets error
   */
  public enum ErrorEnum {
    INVALID_REQUEST("invalid_request"),
    
    INVALID_CLIENT("invalid_client"),
    
    INVALID_GRANT("invalid_grant"),
    
    UNAUTHORIZED_CLIENT("unauthorized_client"),
    
    UNSUPPORTED_GRANT_TYPE("unsupported_grant_type"),
    
    INVALID_SCOPE("invalid_scope");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("error")
  private ErrorEnum error;

  @JsonProperty("error_description")
  private String errorDescription;

  @JsonProperty("error_uri")
  private String errorUri;

  public AccessTokenErr error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public AccessTokenErr errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
  */
  @ApiModelProperty(value = "")


  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public AccessTokenErr errorUri(String errorUri) {
    this.errorUri = errorUri;
    return this;
  }

  /**
   * Get errorUri
   * @return errorUri
  */
  @ApiModelProperty(value = "")


  public String getErrorUri() {
    return errorUri;
  }

  public void setErrorUri(String errorUri) {
    this.errorUri = errorUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenErr accessTokenErr = (AccessTokenErr) o;
    return Objects.equals(this.error, accessTokenErr.error) &&
        Objects.equals(this.errorDescription, accessTokenErr.errorDescription) &&
        Objects.equals(this.errorUri, accessTokenErr.errorUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription, errorUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenErr {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorUri: ").append(toIndentedString(errorUri)).append("\n");
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

