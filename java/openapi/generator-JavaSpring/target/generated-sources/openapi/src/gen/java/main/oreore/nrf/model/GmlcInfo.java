package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.ExternalClientType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a GMLC NF Instance
 */
@ApiModel(description = "Information of a GMLC NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class GmlcInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("servingClientTypes")
  @Valid
  private List<ExternalClientType> servingClientTypes = null;

  public GmlcInfo servingClientTypes(List<ExternalClientType> servingClientTypes) {
    this.servingClientTypes = servingClientTypes;
    return this;
  }

  public GmlcInfo addServingClientTypesItem(ExternalClientType servingClientTypesItem) {
    if (this.servingClientTypes == null) {
      this.servingClientTypes = new ArrayList<>();
    }
    this.servingClientTypes.add(servingClientTypesItem);
    return this;
  }

  /**
   * Get servingClientTypes
   * @return servingClientTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<ExternalClientType> getServingClientTypes() {
    return servingClientTypes;
  }

  public void setServingClientTypes(List<ExternalClientType> servingClientTypes) {
    this.servingClientTypes = servingClientTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmlcInfo gmlcInfo = (GmlcInfo) o;
    return Objects.equals(this.servingClientTypes, gmlcInfo.servingClientTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servingClientTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmlcInfo {\n");
    
    sb.append("    servingClientTypes: ").append(toIndentedString(servingClientTypes)).append("\n");
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

