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
 * Contains the maximum aggregated uplink and downlink bit rates.
 */
@ApiModel(description = "Contains the maximum aggregated uplink and downlink bit rates.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class Ambr   {
  @JsonProperty("uplink")
  private String uplink;

  @JsonProperty("downlink")
  private String downlink;

  public Ambr uplink(String uplink) {
    this.uplink = uplink;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return uplink
  */
  @ApiModelProperty(required = true, value = "String representing a bit rate that shall be formatted as follows.")
  @NotNull

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getUplink() {
    return uplink;
  }

  public void setUplink(String uplink) {
    this.uplink = uplink;
  }

  public Ambr downlink(String downlink) {
    this.downlink = downlink;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return downlink
  */
  @ApiModelProperty(required = true, value = "String representing a bit rate that shall be formatted as follows.")
  @NotNull

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getDownlink() {
    return downlink;
  }

  public void setDownlink(String downlink) {
    this.downlink = downlink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ambr ambr = (Ambr) o;
    return Objects.equals(this.uplink, ambr.uplink) &&
        Objects.equals(this.downlink, ambr.downlink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uplink, downlink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ambr {\n");
    
    sb.append("    uplink: ").append(toIndentedString(uplink)).append("\n");
    sb.append("    downlink: ").append(toIndentedString(downlink)).append("\n");
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

