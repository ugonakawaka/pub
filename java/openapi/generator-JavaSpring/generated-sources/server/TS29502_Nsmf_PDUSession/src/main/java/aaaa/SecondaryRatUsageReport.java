package aaaa;

import java.util.Objects;
import aaaa.QosFlowUsageReport;
import aaaa.RatType;
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
 * Secondary RAT Usage Report to report usage data for a secondary RAT for QoS flows.
 */
@ApiModel(description = "Secondary RAT Usage Report to report usage data for a secondary RAT for QoS flows.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class SecondaryRatUsageReport   {
  @JsonProperty("secondaryRatType")
  private RatType secondaryRatType;

  @JsonProperty("qosFlowsUsageData")
  @Valid
  private List<QosFlowUsageReport> qosFlowsUsageData = new ArrayList<>();

  public SecondaryRatUsageReport secondaryRatType(RatType secondaryRatType) {
    this.secondaryRatType = secondaryRatType;
    return this;
  }

  /**
   * Get secondaryRatType
   * @return secondaryRatType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RatType getSecondaryRatType() {
    return secondaryRatType;
  }

  public void setSecondaryRatType(RatType secondaryRatType) {
    this.secondaryRatType = secondaryRatType;
  }

  public SecondaryRatUsageReport qosFlowsUsageData(List<QosFlowUsageReport> qosFlowsUsageData) {
    this.qosFlowsUsageData = qosFlowsUsageData;
    return this;
  }

  public SecondaryRatUsageReport addQosFlowsUsageDataItem(QosFlowUsageReport qosFlowsUsageDataItem) {
    this.qosFlowsUsageData.add(qosFlowsUsageDataItem);
    return this;
  }

  /**
   * Get qosFlowsUsageData
   * @return qosFlowsUsageData
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1) 
  public List<QosFlowUsageReport> getQosFlowsUsageData() {
    return qosFlowsUsageData;
  }

  public void setQosFlowsUsageData(List<QosFlowUsageReport> qosFlowsUsageData) {
    this.qosFlowsUsageData = qosFlowsUsageData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryRatUsageReport secondaryRatUsageReport = (SecondaryRatUsageReport) o;
    return Objects.equals(this.secondaryRatType, secondaryRatUsageReport.secondaryRatType) &&
        Objects.equals(this.qosFlowsUsageData, secondaryRatUsageReport.qosFlowsUsageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondaryRatType, qosFlowsUsageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryRatUsageReport {\n");
    
    sb.append("    secondaryRatType: ").append(toIndentedString(secondaryRatType)).append("\n");
    sb.append("    qosFlowsUsageData: ").append(toIndentedString(qosFlowsUsageData)).append("\n");
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

