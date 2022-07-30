package aaaa;

import java.util.Objects;
import aaaa.DdnFailureSubInfo;
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
 * DDN Failure Subscription
 */
@ApiModel(description = "DDN Failure Subscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class DdnFailureSubs   {
  @JsonProperty("ddnFailureSubsInd")
  private Boolean ddnFailureSubsInd = false;

  @JsonProperty("ddnFailureSubsInfoList")
  @Valid
  private List<DdnFailureSubInfo> ddnFailureSubsInfoList = null;

  public DdnFailureSubs ddnFailureSubsInd(Boolean ddnFailureSubsInd) {
    this.ddnFailureSubsInd = ddnFailureSubsInd;
    return this;
  }

  /**
   * Get ddnFailureSubsInd
   * @return ddnFailureSubsInd
  */
  @ApiModelProperty(value = "")


  public Boolean getDdnFailureSubsInd() {
    return ddnFailureSubsInd;
  }

  public void setDdnFailureSubsInd(Boolean ddnFailureSubsInd) {
    this.ddnFailureSubsInd = ddnFailureSubsInd;
  }

  public DdnFailureSubs ddnFailureSubsInfoList(List<DdnFailureSubInfo> ddnFailureSubsInfoList) {
    this.ddnFailureSubsInfoList = ddnFailureSubsInfoList;
    return this;
  }

  public DdnFailureSubs addDdnFailureSubsInfoListItem(DdnFailureSubInfo ddnFailureSubsInfoListItem) {
    if (this.ddnFailureSubsInfoList == null) {
      this.ddnFailureSubsInfoList = new ArrayList<>();
    }
    this.ddnFailureSubsInfoList.add(ddnFailureSubsInfoListItem);
    return this;
  }

  /**
   * Get ddnFailureSubsInfoList
   * @return ddnFailureSubsInfoList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<DdnFailureSubInfo> getDdnFailureSubsInfoList() {
    return ddnFailureSubsInfoList;
  }

  public void setDdnFailureSubsInfoList(List<DdnFailureSubInfo> ddnFailureSubsInfoList) {
    this.ddnFailureSubsInfoList = ddnFailureSubsInfoList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DdnFailureSubs ddnFailureSubs = (DdnFailureSubs) o;
    return Objects.equals(this.ddnFailureSubsInd, ddnFailureSubs.ddnFailureSubsInd) &&
        Objects.equals(this.ddnFailureSubsInfoList, ddnFailureSubs.ddnFailureSubsInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddnFailureSubsInd, ddnFailureSubsInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DdnFailureSubs {\n");
    
    sb.append("    ddnFailureSubsInd: ").append(toIndentedString(ddnFailureSubsInd)).append("\n");
    sb.append("    ddnFailureSubsInfoList: ").append(toIndentedString(ddnFailureSubsInfoList)).append("\n");
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

