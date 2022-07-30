package aaaa;

import java.util.Objects;
import aaaa.PartialRecordMethod;
import aaaa.Trigger;
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
 * RoamingChargingProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class RoamingChargingProfile   {
  @JsonProperty("triggers")
  @Valid
  private List<Trigger> triggers = null;

  @JsonProperty("partialRecordMethod")
  private PartialRecordMethod partialRecordMethod;

  public RoamingChargingProfile triggers(List<Trigger> triggers) {
    this.triggers = triggers;
    return this;
  }

  public RoamingChargingProfile addTriggersItem(Trigger triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

  /**
   * Get triggers
   * @return triggers
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=0) 
  public List<Trigger> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<Trigger> triggers) {
    this.triggers = triggers;
  }

  public RoamingChargingProfile partialRecordMethod(PartialRecordMethod partialRecordMethod) {
    this.partialRecordMethod = partialRecordMethod;
    return this;
  }

  /**
   * Get partialRecordMethod
   * @return partialRecordMethod
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartialRecordMethod getPartialRecordMethod() {
    return partialRecordMethod;
  }

  public void setPartialRecordMethod(PartialRecordMethod partialRecordMethod) {
    this.partialRecordMethod = partialRecordMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoamingChargingProfile roamingChargingProfile = (RoamingChargingProfile) o;
    return Objects.equals(this.triggers, roamingChargingProfile.triggers) &&
        Objects.equals(this.partialRecordMethod, roamingChargingProfile.partialRecordMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggers, partialRecordMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoamingChargingProfile {\n");
    
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    partialRecordMethod: ").append(toIndentedString(partialRecordMethod)).append("\n");
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

