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
 * Condition (list of attributes in the NF Profile) to determine whether a notification must be sent by NRF
 */
@ApiModel(description = "Condition (list of attributes in the NF Profile) to determine whether a notification must be sent by NRF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NotifCondition  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("monitoredAttributes")
  @Valid
  private List<String> monitoredAttributes = null;

  @JsonProperty("unmonitoredAttributes")
  @Valid
  private List<String> unmonitoredAttributes = null;

  public NotifCondition monitoredAttributes(List<String> monitoredAttributes) {
    this.monitoredAttributes = monitoredAttributes;
    return this;
  }

  public NotifCondition addMonitoredAttributesItem(String monitoredAttributesItem) {
    if (this.monitoredAttributes == null) {
      this.monitoredAttributes = new ArrayList<>();
    }
    this.monitoredAttributes.add(monitoredAttributesItem);
    return this;
  }

  /**
   * Get monitoredAttributes
   * @return monitoredAttributes
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getMonitoredAttributes() {
    return monitoredAttributes;
  }

  public void setMonitoredAttributes(List<String> monitoredAttributes) {
    this.monitoredAttributes = monitoredAttributes;
  }

  public NotifCondition unmonitoredAttributes(List<String> unmonitoredAttributes) {
    this.unmonitoredAttributes = unmonitoredAttributes;
    return this;
  }

  public NotifCondition addUnmonitoredAttributesItem(String unmonitoredAttributesItem) {
    if (this.unmonitoredAttributes == null) {
      this.unmonitoredAttributes = new ArrayList<>();
    }
    this.unmonitoredAttributes.add(unmonitoredAttributesItem);
    return this;
  }

  /**
   * Get unmonitoredAttributes
   * @return unmonitoredAttributes
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getUnmonitoredAttributes() {
    return unmonitoredAttributes;
  }

  public void setUnmonitoredAttributes(List<String> unmonitoredAttributes) {
    this.unmonitoredAttributes = unmonitoredAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifCondition notifCondition = (NotifCondition) o;
    return Objects.equals(this.monitoredAttributes, notifCondition.monitoredAttributes) &&
        Objects.equals(this.unmonitoredAttributes, notifCondition.unmonitoredAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitoredAttributes, unmonitoredAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifCondition {\n");
    
    sb.append("    monitoredAttributes: ").append(toIndentedString(monitoredAttributes)).append("\n");
    sb.append("    unmonitoredAttributes: ").append(toIndentedString(unmonitoredAttributes)).append("\n");
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

