package aaaa;

import java.util.Objects;
import aaaa.Cause;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Individual QoS flow
 */
@ApiModel(description = "Individual QoS flow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class QosFlowItem   {
  @JsonProperty("qfi")
  private Integer qfi;

  @JsonProperty("cause")
  private Cause cause;

  @JsonProperty("currentQosProfileIndex")
  private Integer currentQosProfileIndex;

  @JsonProperty("nullQoSProfileIndex")
  private Boolean nullQoSProfileIndex;

  public QosFlowItem qfi(Integer qfi) {
    this.qfi = qfi;
    return this;
  }

  /**
   * Unsigned integer identifying a QoS flow, within the range 0 to 63.
   * minimum: 0
   * maximum: 63
   * @return qfi
  */
  @ApiModelProperty(required = true, value = "Unsigned integer identifying a QoS flow, within the range 0 to 63.")
  @NotNull

@Min(0) @Max(63) 
  public Integer getQfi() {
    return qfi;
  }

  public void setQfi(Integer qfi) {
    this.qfi = qfi;
  }

  public QosFlowItem cause(Cause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @ApiModelProperty(value = "")

  @Valid

  public Cause getCause() {
    return cause;
  }

  public void setCause(Cause cause) {
    this.cause = cause;
  }

  public QosFlowItem currentQosProfileIndex(Integer currentQosProfileIndex) {
    this.currentQosProfileIndex = currentQosProfileIndex;
    return this;
  }

  /**
   * Get currentQosProfileIndex
   * minimum: 1
   * maximum: 8
   * @return currentQosProfileIndex
  */
  @ApiModelProperty(value = "")

@Min(1) @Max(8) 
  public Integer getCurrentQosProfileIndex() {
    return currentQosProfileIndex;
  }

  public void setCurrentQosProfileIndex(Integer currentQosProfileIndex) {
    this.currentQosProfileIndex = currentQosProfileIndex;
  }

  public QosFlowItem nullQoSProfileIndex(Boolean nullQoSProfileIndex) {
    this.nullQoSProfileIndex = nullQoSProfileIndex;
    return this;
  }

  /**
   * Get nullQoSProfileIndex
   * @return nullQoSProfileIndex
  */
  @ApiModelProperty(value = "")


  public Boolean getNullQoSProfileIndex() {
    return nullQoSProfileIndex;
  }

  public void setNullQoSProfileIndex(Boolean nullQoSProfileIndex) {
    this.nullQoSProfileIndex = nullQoSProfileIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosFlowItem qosFlowItem = (QosFlowItem) o;
    return Objects.equals(this.qfi, qosFlowItem.qfi) &&
        Objects.equals(this.cause, qosFlowItem.cause) &&
        Objects.equals(this.currentQosProfileIndex, qosFlowItem.currentQosProfileIndex) &&
        Objects.equals(this.nullQoSProfileIndex, qosFlowItem.nullQoSProfileIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qfi, cause, currentQosProfileIndex, nullQoSProfileIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosFlowItem {\n");
    
    sb.append("    qfi: ").append(toIndentedString(qfi)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    currentQosProfileIndex: ").append(toIndentedString(currentQosProfileIndex)).append("\n");
    sb.append("    nullQoSProfileIndex: ").append(toIndentedString(nullQoSProfileIndex)).append("\n");
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

