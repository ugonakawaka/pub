package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Individual QoS flow requested to be released
 */
@ApiModel(description = "Individual QoS flow requested to be released")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class QosFlowReleaseRequestItem   {
  @JsonProperty("qfi")
  private Integer qfi;

  @JsonProperty("qosRules")
  private byte[] qosRules;

  @JsonProperty("qosFlowDescription")
  private byte[] qosFlowDescription;

  public QosFlowReleaseRequestItem qfi(Integer qfi) {
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

  public QosFlowReleaseRequestItem qosRules(byte[] qosRules) {
    this.qosRules = qosRules;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return qosRules
  */
  @ApiModelProperty(value = "string with format \"bytes\" as defined in OpenAPI")


  public byte[] getQosRules() {
    return qosRules;
  }

  public void setQosRules(byte[] qosRules) {
    this.qosRules = qosRules;
  }

  public QosFlowReleaseRequestItem qosFlowDescription(byte[] qosFlowDescription) {
    this.qosFlowDescription = qosFlowDescription;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return qosFlowDescription
  */
  @ApiModelProperty(value = "string with format \"bytes\" as defined in OpenAPI")


  public byte[] getQosFlowDescription() {
    return qosFlowDescription;
  }

  public void setQosFlowDescription(byte[] qosFlowDescription) {
    this.qosFlowDescription = qosFlowDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosFlowReleaseRequestItem qosFlowReleaseRequestItem = (QosFlowReleaseRequestItem) o;
    return Objects.equals(this.qfi, qosFlowReleaseRequestItem.qfi) &&
        Arrays.equals(this.qosRules, qosFlowReleaseRequestItem.qosRules) &&
        Arrays.equals(this.qosFlowDescription, qosFlowReleaseRequestItem.qosFlowDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qfi, Arrays.hashCode(qosRules), Arrays.hashCode(qosFlowDescription));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosFlowReleaseRequestItem {\n");
    
    sb.append("    qfi: ").append(toIndentedString(qfi)).append("\n");
    sb.append("    qosRules: ").append(toIndentedString(qosRules)).append("\n");
    sb.append("    qosFlowDescription: ").append(toIndentedString(qosFlowDescription)).append("\n");
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

