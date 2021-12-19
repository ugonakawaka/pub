package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Contains the version details of an NF service
 */
@ApiModel(description = "Contains the version details of an NF service")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NFServiceVersion  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("apiVersionInUri")
  private String apiVersionInUri;

  @JsonProperty("apiFullVersion")
  private String apiFullVersion;

  @JsonProperty("expiry")
  private OffsetDateTime expiry;

  public NFServiceVersion apiVersionInUri(String apiVersionInUri) {
    this.apiVersionInUri = apiVersionInUri;
    return this;
  }

  /**
   * Get apiVersionInUri
   * @return apiVersionInUri
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getApiVersionInUri() {
    return apiVersionInUri;
  }

  public void setApiVersionInUri(String apiVersionInUri) {
    this.apiVersionInUri = apiVersionInUri;
  }

  public NFServiceVersion apiFullVersion(String apiFullVersion) {
    this.apiFullVersion = apiFullVersion;
    return this;
  }

  /**
   * Get apiFullVersion
   * @return apiFullVersion
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getApiFullVersion() {
    return apiFullVersion;
  }

  public void setApiFullVersion(String apiFullVersion) {
    this.apiFullVersion = apiFullVersion;
  }

  public NFServiceVersion expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Get expiry
   * @return expiry
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFServiceVersion nfServiceVersion = (NFServiceVersion) o;
    return Objects.equals(this.apiVersionInUri, nfServiceVersion.apiVersionInUri) &&
        Objects.equals(this.apiFullVersion, nfServiceVersion.apiFullVersion) &&
        Objects.equals(this.expiry, nfServiceVersion.expiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersionInUri, apiFullVersion, expiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFServiceVersion {\n");
    
    sb.append("    apiVersionInUri: ").append(toIndentedString(apiVersionInUri)).append("\n");
    sb.append("    apiFullVersion: ").append(toIndentedString(apiFullVersion)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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

