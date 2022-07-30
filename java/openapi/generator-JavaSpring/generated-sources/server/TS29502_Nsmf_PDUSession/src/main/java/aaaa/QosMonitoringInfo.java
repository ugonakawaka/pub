package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QoS Monitoring Information
 */
@ApiModel(description = "QoS Monitoring Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class QosMonitoringInfo   {
  @JsonProperty("qosMonitoringInd")
  private Boolean qosMonitoringInd = false;

  public QosMonitoringInfo qosMonitoringInd(Boolean qosMonitoringInd) {
    this.qosMonitoringInd = qosMonitoringInd;
    return this;
  }

  /**
   * Get qosMonitoringInd
   * @return qosMonitoringInd
  */
  @ApiModelProperty(value = "")


  public Boolean getQosMonitoringInd() {
    return qosMonitoringInd;
  }

  public void setQosMonitoringInd(Boolean qosMonitoringInd) {
    this.qosMonitoringInd = qosMonitoringInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosMonitoringInfo qosMonitoringInfo = (QosMonitoringInfo) o;
    return Objects.equals(this.qosMonitoringInd, qosMonitoringInfo.qosMonitoringInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qosMonitoringInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosMonitoringInfo {\n");
    
    sb.append("    qosMonitoringInd: ").append(toIndentedString(qosMonitoringInd)).append("\n");
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

