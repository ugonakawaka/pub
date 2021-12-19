package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Range of IPv4 addresses
 */
@ApiModel(description = "Range of IPv4 addresses")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class Ipv4AddressRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  public Ipv4AddressRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.
   * @return start
  */
  @ApiModelProperty(example = "198.51.100.1", value = "String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.")

@Pattern(regexp = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$") 
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public Ipv4AddressRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.
   * @return end
  */
  @ApiModelProperty(example = "198.51.100.1", value = "String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.")

@Pattern(regexp = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$") 
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipv4AddressRange ipv4AddressRange = (Ipv4AddressRange) o;
    return Objects.equals(this.start, ipv4AddressRange.start) &&
        Objects.equals(this.end, ipv4AddressRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv4AddressRange {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

