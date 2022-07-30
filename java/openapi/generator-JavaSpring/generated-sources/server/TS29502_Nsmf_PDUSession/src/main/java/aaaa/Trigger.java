package aaaa;

import java.util.Objects;
import aaaa.TriggerCategory;
import aaaa.TriggerType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Trigger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class Trigger   {
  @JsonProperty("triggerType")
  private TriggerType triggerType;

  @JsonProperty("triggerCategory")
  private TriggerCategory triggerCategory;

  @JsonProperty("timeLimit")
  private Integer timeLimit;

  @JsonProperty("volumeLimit")
  private Integer volumeLimit;

  @JsonProperty("volumeLimit64")
  private Integer volumeLimit64;

  @JsonProperty("eventLimit")
  private Integer eventLimit;

  @JsonProperty("maxNumberOfccc")
  private Integer maxNumberOfccc;

  @JsonProperty("tariffTimeChange")
  private OffsetDateTime tariffTimeChange;

  public Trigger triggerType(TriggerType triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  /**
   * Get triggerType
   * @return triggerType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TriggerType getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(TriggerType triggerType) {
    this.triggerType = triggerType;
  }

  public Trigger triggerCategory(TriggerCategory triggerCategory) {
    this.triggerCategory = triggerCategory;
    return this;
  }

  /**
   * Get triggerCategory
   * @return triggerCategory
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TriggerCategory getTriggerCategory() {
    return triggerCategory;
  }

  public void setTriggerCategory(TriggerCategory triggerCategory) {
    this.triggerCategory = triggerCategory;
  }

  public Trigger timeLimit(Integer timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return timeLimit
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(Integer timeLimit) {
    this.timeLimit = timeLimit;
  }

  public Trigger volumeLimit(Integer volumeLimit) {
    this.volumeLimit = volumeLimit;
    return this;
  }

  /**
   * Integer where the allowed values correspond to the value range of an unsigned 32-bit integer.
   * minimum: 0
   * maximum: 4294967295
   * @return volumeLimit
  */
  @ApiModelProperty(value = "Integer where the allowed values correspond to the value range of an unsigned 32-bit integer.")

@Min(0) @Max(4294967295) 
  public Integer getVolumeLimit() {
    return volumeLimit;
  }

  public void setVolumeLimit(Integer volumeLimit) {
    this.volumeLimit = volumeLimit;
  }

  public Trigger volumeLimit64(Integer volumeLimit64) {
    this.volumeLimit64 = volumeLimit64;
    return this;
  }

  /**
   * Integer where the allowed values correspond to the value range of an unsigned 64-bit integer.
   * minimum: 0
   * maximum: -1
   * @return volumeLimit64
  */
  @ApiModelProperty(value = "Integer where the allowed values correspond to the value range of an unsigned 64-bit integer.")

@Min(0) @Max(-1) 
  public Integer getVolumeLimit64() {
    return volumeLimit64;
  }

  public void setVolumeLimit64(Integer volumeLimit64) {
    this.volumeLimit64 = volumeLimit64;
  }

  public Trigger eventLimit(Integer eventLimit) {
    this.eventLimit = eventLimit;
    return this;
  }

  /**
   * Integer where the allowed values correspond to the value range of an unsigned 32-bit integer.
   * minimum: 0
   * maximum: 4294967295
   * @return eventLimit
  */
  @ApiModelProperty(value = "Integer where the allowed values correspond to the value range of an unsigned 32-bit integer.")

@Min(0) @Max(4294967295) 
  public Integer getEventLimit() {
    return eventLimit;
  }

  public void setEventLimit(Integer eventLimit) {
    this.eventLimit = eventLimit;
  }

  public Trigger maxNumberOfccc(Integer maxNumberOfccc) {
    this.maxNumberOfccc = maxNumberOfccc;
    return this;
  }

  /**
   * Integer where the allowed values correspond to the value range of an unsigned 32-bit integer.
   * minimum: 0
   * maximum: 4294967295
   * @return maxNumberOfccc
  */
  @ApiModelProperty(value = "Integer where the allowed values correspond to the value range of an unsigned 32-bit integer.")

@Min(0) @Max(4294967295) 
  public Integer getMaxNumberOfccc() {
    return maxNumberOfccc;
  }

  public void setMaxNumberOfccc(Integer maxNumberOfccc) {
    this.maxNumberOfccc = maxNumberOfccc;
  }

  public Trigger tariffTimeChange(OffsetDateTime tariffTimeChange) {
    this.tariffTimeChange = tariffTimeChange;
    return this;
  }

  /**
   * Get tariffTimeChange
   * @return tariffTimeChange
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTariffTimeChange() {
    return tariffTimeChange;
  }

  public void setTariffTimeChange(OffsetDateTime tariffTimeChange) {
    this.tariffTimeChange = tariffTimeChange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trigger trigger = (Trigger) o;
    return Objects.equals(this.triggerType, trigger.triggerType) &&
        Objects.equals(this.triggerCategory, trigger.triggerCategory) &&
        Objects.equals(this.timeLimit, trigger.timeLimit) &&
        Objects.equals(this.volumeLimit, trigger.volumeLimit) &&
        Objects.equals(this.volumeLimit64, trigger.volumeLimit64) &&
        Objects.equals(this.eventLimit, trigger.eventLimit) &&
        Objects.equals(this.maxNumberOfccc, trigger.maxNumberOfccc) &&
        Objects.equals(this.tariffTimeChange, trigger.tariffTimeChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerType, triggerCategory, timeLimit, volumeLimit, volumeLimit64, eventLimit, maxNumberOfccc, tariffTimeChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trigger {\n");
    
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    triggerCategory: ").append(toIndentedString(triggerCategory)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    volumeLimit: ").append(toIndentedString(volumeLimit)).append("\n");
    sb.append("    volumeLimit64: ").append(toIndentedString(volumeLimit64)).append("\n");
    sb.append("    eventLimit: ").append(toIndentedString(eventLimit)).append("\n");
    sb.append("    maxNumberOfccc: ").append(toIndentedString(maxNumberOfccc)).append("\n");
    sb.append("    tariffTimeChange: ").append(toIndentedString(tariffTimeChange)).append("\n");
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

