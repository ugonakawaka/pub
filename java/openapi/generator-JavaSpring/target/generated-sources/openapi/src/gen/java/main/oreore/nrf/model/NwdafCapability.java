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
 * Indicates the capability supported by the NWDAF
 */
@ApiModel(description = "Indicates the capability supported by the NWDAF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NwdafCapability  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("analyticsAggregation")
  private Boolean analyticsAggregation = false;

  public NwdafCapability analyticsAggregation(Boolean analyticsAggregation) {
    this.analyticsAggregation = analyticsAggregation;
    return this;
  }

  /**
   * Get analyticsAggregation
   * @return analyticsAggregation
  */
  @ApiModelProperty(value = "")


  public Boolean getAnalyticsAggregation() {
    return analyticsAggregation;
  }

  public void setAnalyticsAggregation(Boolean analyticsAggregation) {
    this.analyticsAggregation = analyticsAggregation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NwdafCapability nwdafCapability = (NwdafCapability) o;
    return Objects.equals(this.analyticsAggregation, nwdafCapability.analyticsAggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyticsAggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NwdafCapability {\n");
    
    sb.append("    analyticsAggregation: ").append(toIndentedString(analyticsAggregation)).append("\n");
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

