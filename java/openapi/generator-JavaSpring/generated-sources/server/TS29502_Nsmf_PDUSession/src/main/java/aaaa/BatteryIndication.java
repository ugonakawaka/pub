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
 * Parameters \&quot;replaceableInd\&quot; and \&quot;rechargeableInd\&quot; are only included if the value of Parameter \&quot;batteryInd\&quot; is true.
 */
@ApiModel(description = "Parameters \"replaceableInd\" and \"rechargeableInd\" are only included if the value of Parameter \"batteryInd\" is true.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class BatteryIndication   {
  @JsonProperty("batteryInd")
  private Boolean batteryInd;

  @JsonProperty("replaceableInd")
  private Boolean replaceableInd;

  @JsonProperty("rechargeableInd")
  private Boolean rechargeableInd;

  public BatteryIndication batteryInd(Boolean batteryInd) {
    this.batteryInd = batteryInd;
    return this;
  }

  /**
   * This IE shall indicate whether the UE is battery powered or not. true: the UE is battery powered; false or absent: the UE is not battery powered 
   * @return batteryInd
  */
  @ApiModelProperty(value = "This IE shall indicate whether the UE is battery powered or not. true: the UE is battery powered; false or absent: the UE is not battery powered ")


  public Boolean getBatteryInd() {
    return batteryInd;
  }

  public void setBatteryInd(Boolean batteryInd) {
    this.batteryInd = batteryInd;
  }

  public BatteryIndication replaceableInd(Boolean replaceableInd) {
    this.replaceableInd = replaceableInd;
    return this;
  }

  /**
   * This IE shall indicate whether the battery of the UE is replaceable or not. true: the battery of the UE is replaceable; false or absent: the battery of the UE is not replaceable. 
   * @return replaceableInd
  */
  @ApiModelProperty(value = "This IE shall indicate whether the battery of the UE is replaceable or not. true: the battery of the UE is replaceable; false or absent: the battery of the UE is not replaceable. ")


  public Boolean getReplaceableInd() {
    return replaceableInd;
  }

  public void setReplaceableInd(Boolean replaceableInd) {
    this.replaceableInd = replaceableInd;
  }

  public BatteryIndication rechargeableInd(Boolean rechargeableInd) {
    this.rechargeableInd = rechargeableInd;
    return this;
  }

  /**
   * This IE shall indicate whether the battery of the UE is rechargeable or not. true: the battery of UE is rechargeable; false or absent: the battery of the UE is not rechargeable. 
   * @return rechargeableInd
  */
  @ApiModelProperty(value = "This IE shall indicate whether the battery of the UE is rechargeable or not. true: the battery of UE is rechargeable; false or absent: the battery of the UE is not rechargeable. ")


  public Boolean getRechargeableInd() {
    return rechargeableInd;
  }

  public void setRechargeableInd(Boolean rechargeableInd) {
    this.rechargeableInd = rechargeableInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatteryIndication batteryIndication = (BatteryIndication) o;
    return Objects.equals(this.batteryInd, batteryIndication.batteryInd) &&
        Objects.equals(this.replaceableInd, batteryIndication.replaceableInd) &&
        Objects.equals(this.rechargeableInd, batteryIndication.rechargeableInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryInd, replaceableInd, rechargeableInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatteryIndication {\n");
    
    sb.append("    batteryInd: ").append(toIndentedString(batteryInd)).append("\n");
    sb.append("    replaceableInd: ").append(toIndentedString(replaceableInd)).append("\n");
    sb.append("    rechargeableInd: ").append(toIndentedString(rechargeableInd)).append("\n");
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

