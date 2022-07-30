package aaaa;

import java.util.Objects;
import aaaa.MoExpDataCounter;
import aaaa.RefToBinaryData;
import aaaa.UserLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Send MO Data Request
 */
@ApiModel(description = "Data within Send MO Data Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class SendMoDataReqData   {
  @JsonProperty("moData")
  private RefToBinaryData moData;

  @JsonProperty("moExpDataCounter")
  private MoExpDataCounter moExpDataCounter;

  @JsonProperty("ueLocation")
  private UserLocation ueLocation;

  public SendMoDataReqData moData(RefToBinaryData moData) {
    this.moData = moData;
    return this;
  }

  /**
   * Get moData
   * @return moData
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RefToBinaryData getMoData() {
    return moData;
  }

  public void setMoData(RefToBinaryData moData) {
    this.moData = moData;
  }

  public SendMoDataReqData moExpDataCounter(MoExpDataCounter moExpDataCounter) {
    this.moExpDataCounter = moExpDataCounter;
    return this;
  }

  /**
   * Get moExpDataCounter
   * @return moExpDataCounter
  */
  @ApiModelProperty(value = "")

  @Valid

  public MoExpDataCounter getMoExpDataCounter() {
    return moExpDataCounter;
  }

  public void setMoExpDataCounter(MoExpDataCounter moExpDataCounter) {
    this.moExpDataCounter = moExpDataCounter;
  }

  public SendMoDataReqData ueLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
    return this;
  }

  /**
   * Get ueLocation
   * @return ueLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserLocation getUeLocation() {
    return ueLocation;
  }

  public void setUeLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMoDataReqData sendMoDataReqData = (SendMoDataReqData) o;
    return Objects.equals(this.moData, sendMoDataReqData.moData) &&
        Objects.equals(this.moExpDataCounter, sendMoDataReqData.moExpDataCounter) &&
        Objects.equals(this.ueLocation, sendMoDataReqData.ueLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moData, moExpDataCounter, ueLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMoDataReqData {\n");
    
    sb.append("    moData: ").append(toIndentedString(moData)).append("\n");
    sb.append("    moExpDataCounter: ").append(toIndentedString(moExpDataCounter)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
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

