package aaaa;

import java.util.Objects;
import aaaa.AfCoordinationInfo;
import aaaa.SmallDataRateStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Retrieve Response
 */
@ApiModel(description = "Data within Retrieve Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class RetrievedData   {
  @JsonProperty("smallDataRateStatus")
  private SmallDataRateStatus smallDataRateStatus;

  @JsonProperty("afCoordinationInfo")
  private AfCoordinationInfo afCoordinationInfo;

  public RetrievedData smallDataRateStatus(SmallDataRateStatus smallDataRateStatus) {
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

  public RetrievedData afCoordinationInfo(AfCoordinationInfo afCoordinationInfo) {
    this.afCoordinationInfo = afCoordinationInfo;
    return this;
  }

  /**
   * Get afCoordinationInfo
   * @return afCoordinationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AfCoordinationInfo getAfCoordinationInfo() {
    return afCoordinationInfo;
  }

  public void setAfCoordinationInfo(AfCoordinationInfo afCoordinationInfo) {
    this.afCoordinationInfo = afCoordinationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievedData retrievedData = (RetrievedData) o;
    return Objects.equals(this.smallDataRateStatus, retrievedData.smallDataRateStatus) &&
        Objects.equals(this.afCoordinationInfo, retrievedData.afCoordinationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallDataRateStatus, afCoordinationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievedData {\n");
    
    sb.append("    smallDataRateStatus: ").append(toIndentedString(smallDataRateStatus)).append("\n");
    sb.append("    afCoordinationInfo: ").append(toIndentedString(afCoordinationInfo)).append("\n");
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

