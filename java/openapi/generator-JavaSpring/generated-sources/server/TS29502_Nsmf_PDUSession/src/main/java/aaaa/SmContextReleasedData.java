package aaaa;

import java.util.Objects;
import aaaa.ApnRateStatus;
import aaaa.SmallDataRateStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Release SM Context Response
 */
@ApiModel(description = "Data within Release SM Context Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class SmContextReleasedData   {
  @JsonProperty("smallDataRateStatus")
  private SmallDataRateStatus smallDataRateStatus;

  @JsonProperty("apnRateStatus")
  private ApnRateStatus apnRateStatus;

  public SmContextReleasedData smallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
    this.smallDataRateStatus = smallDataRateStatus;
    return this;
  }

  /**
   * Get smallDataRateStatus
   * @return smallDataRateStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmallDataRateStatus getSmallDataRateStatus() {
    return smallDataRateStatus;
  }

  public void setSmallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
    this.smallDataRateStatus = smallDataRateStatus;
  }

  public SmContextReleasedData apnRateStatus(ApnRateStatus apnRateStatus) {
    this.apnRateStatus = apnRateStatus;
    return this;
  }

  /**
   * Get apnRateStatus
   * @return apnRateStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApnRateStatus getApnRateStatus() {
    return apnRateStatus;
  }

  public void setApnRateStatus(ApnRateStatus apnRateStatus) {
    this.apnRateStatus = apnRateStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContextReleasedData smContextReleasedData = (SmContextReleasedData) o;
    return Objects.equals(this.smallDataRateStatus, smContextReleasedData.smallDataRateStatus) &&
        Objects.equals(this.apnRateStatus, smContextReleasedData.apnRateStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallDataRateStatus, apnRateStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextReleasedData {\n");
    
    sb.append("    smallDataRateStatus: ").append(toIndentedString(smallDataRateStatus)).append("\n");
    sb.append("    apnRateStatus: ").append(toIndentedString(apnRateStatus)).append("\n");
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

