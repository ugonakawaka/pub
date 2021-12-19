package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oreore.nrf.model.ServiceName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NFs based on their support for a given Service Name
 */
@ApiModel(description = "Subscription to a set of NFs based on their support for a given Service Name")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class ServiceNameCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("serviceName")
  private ServiceName serviceName;

  public ServiceNameCond serviceName(ServiceName serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ServiceName getServiceName() {
    return serviceName;
  }

  public void setServiceName(ServiceName serviceName) {
    this.serviceName = serviceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNameCond serviceNameCond = (ServiceNameCond) o;
    return Objects.equals(this.serviceName, serviceNameCond.serviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNameCond {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

