package aaaa;

import java.util.Objects;
import aaaa.DddTrafficDescriptor;
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
 * DDN Failure Subscription Information
 */
@ApiModel(description = "DDN Failure Subscription Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class DdnFailureSubInfo   {
  @JsonProperty("notifyCorrelationId")
  private String notifyCorrelationId;

  @JsonProperty("dddTrafficDescriptorList")
  @Valid
  private List<DddTrafficDescriptor> dddTrafficDescriptorList = null;

  public DdnFailureSubInfo notifyCorrelationId(String notifyCorrelationId) {
    this.notifyCorrelationId = notifyCorrelationId;
    return this;
  }

  /**
   * Get notifyCorrelationId
   * @return notifyCorrelationId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNotifyCorrelationId() {
    return notifyCorrelationId;
  }

  public void setNotifyCorrelationId(String notifyCorrelationId) {
    this.notifyCorrelationId = notifyCorrelationId;
  }

  public DdnFailureSubInfo dddTrafficDescriptorList(List<DddTrafficDescriptor> dddTrafficDescriptorList) {
    this.dddTrafficDescriptorList = dddTrafficDescriptorList;
    return this;
  }

  public DdnFailureSubInfo addDddTrafficDescriptorListItem(DddTrafficDescriptor dddTrafficDescriptorListItem) {
    if (this.dddTrafficDescriptorList == null) {
      this.dddTrafficDescriptorList = new ArrayList<>();
    }
    this.dddTrafficDescriptorList.add(dddTrafficDescriptorListItem);
    return this;
  }

  /**
   * Get dddTrafficDescriptorList
   * @return dddTrafficDescriptorList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<DddTrafficDescriptor> getDddTrafficDescriptorList() {
    return dddTrafficDescriptorList;
  }

  public void setDddTrafficDescriptorList(List<DddTrafficDescriptor> dddTrafficDescriptorList) {
    this.dddTrafficDescriptorList = dddTrafficDescriptorList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DdnFailureSubInfo ddnFailureSubInfo = (DdnFailureSubInfo) o;
    return Objects.equals(this.notifyCorrelationId, ddnFailureSubInfo.notifyCorrelationId) &&
        Objects.equals(this.dddTrafficDescriptorList, ddnFailureSubInfo.dddTrafficDescriptorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyCorrelationId, dddTrafficDescriptorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DdnFailureSubInfo {\n");
    
    sb.append("    notifyCorrelationId: ").append(toIndentedString(notifyCorrelationId)).append("\n");
    sb.append("    dddTrafficDescriptorList: ").append(toIndentedString(dddTrafficDescriptorList)).append("\n");
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

