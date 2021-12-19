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
 * Subscription to a set of NF or SCP or SEPP instances belonging to certain SCP domains
 */
@ApiModel(description = "Subscription to a set of NF or SCP or SEPP instances belonging to certain SCP domains")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class ScpDomainCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scpDomains")
  @Valid
  private List<String> scpDomains = null;

  public ScpDomainCond scpDomains(List<String> scpDomains) {
    this.scpDomains = scpDomains;
    return this;
  }

  public ScpDomainCond addScpDomainsItem(String scpDomainsItem) {
    if (this.scpDomains == null) {
      this.scpDomains = new ArrayList<>();
    }
    this.scpDomains.add(scpDomainsItem);
    return this;
  }

  /**
   * Get scpDomains
   * @return scpDomains
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getScpDomains() {
    return scpDomains;
  }

  public void setScpDomains(List<String> scpDomains) {
    this.scpDomains = scpDomains;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScpDomainCond scpDomainCond = (ScpDomainCond) o;
    return Objects.equals(this.scpDomains, scpDomainCond.scpDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scpDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScpDomainCond {\n");
    
    sb.append("    scpDomains: ").append(toIndentedString(scpDomains)).append("\n");
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

