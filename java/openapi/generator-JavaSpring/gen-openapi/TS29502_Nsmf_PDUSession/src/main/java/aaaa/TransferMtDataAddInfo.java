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
 * Transfer MT Data Error Response Additional Information
 */
@ApiModel(description = "Transfer MT Data Error Response Additional Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class TransferMtDataAddInfo   {
  @JsonProperty("maxWaitingTime")
  private Integer maxWaitingTime;

  public TransferMtDataAddInfo maxWaitingTime(Integer maxWaitingTime) {
    this.maxWaitingTime = maxWaitingTime;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return maxWaitingTime
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getMaxWaitingTime() {
    return maxWaitingTime;
  }

  public void setMaxWaitingTime(Integer maxWaitingTime) {
    this.maxWaitingTime = maxWaitingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferMtDataAddInfo transferMtDataAddInfo = (TransferMtDataAddInfo) o;
    return Objects.equals(this.maxWaitingTime, transferMtDataAddInfo.maxWaitingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWaitingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferMtDataAddInfo {\n");
    
    sb.append("    maxWaitingTime: ").append(toIndentedString(maxWaitingTime)).append("\n");
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

