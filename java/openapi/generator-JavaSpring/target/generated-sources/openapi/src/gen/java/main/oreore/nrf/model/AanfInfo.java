package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Represents the information relative to an AAnF NF Instance.
 */
@ApiModel(description = "Represents the information relative to an AAnF NF Instance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class AanfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("routingIndicators")
  @Valid
  private List<String> routingIndicators = null;

  public AanfInfo routingIndicators(List<String> routingIndicators) {
    this.routingIndicators = routingIndicators;
    return this;
  }

  public AanfInfo addRoutingIndicatorsItem(String routingIndicatorsItem) {
    if (this.routingIndicators == null) {
      this.routingIndicators = new ArrayList<>();
    }
    this.routingIndicators.add(routingIndicatorsItem);
    return this;
  }

  /**
   * Get routingIndicators
   * @return routingIndicators
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getRoutingIndicators() {
    return routingIndicators;
  }

  public void setRoutingIndicators(List<String> routingIndicators) {
    this.routingIndicators = routingIndicators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AanfInfo aanfInfo = (AanfInfo) o;
    return Objects.equals(this.routingIndicators, aanfInfo.routingIndicators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingIndicators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AanfInfo {\n");
    
    sb.append("    routingIndicators: ").append(toIndentedString(routingIndicators)).append("\n");
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

