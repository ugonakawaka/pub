package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information about a vendor-specific feature
 */
@ApiModel(description = "Information about a vendor-specific feature")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class VendorSpecificFeature  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("featureName")
  private String featureName;

  @JsonProperty("featureVersion")
  private String featureVersion;

  public VendorSpecificFeature featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  /**
   * Get featureName
   * @return featureName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  public VendorSpecificFeature featureVersion(String featureVersion) {
    this.featureVersion = featureVersion;
    return this;
  }

  /**
   * Get featureVersion
   * @return featureVersion
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFeatureVersion() {
    return featureVersion;
  }

  public void setFeatureVersion(String featureVersion) {
    this.featureVersion = featureVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorSpecificFeature vendorSpecificFeature = (VendorSpecificFeature) o;
    return Objects.equals(this.featureName, vendorSpecificFeature.featureName) &&
        Objects.equals(this.featureVersion, vendorSpecificFeature.featureVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSpecificFeature {\n");
    
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    featureVersion: ").append(toIndentedString(featureVersion)).append("\n");
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

