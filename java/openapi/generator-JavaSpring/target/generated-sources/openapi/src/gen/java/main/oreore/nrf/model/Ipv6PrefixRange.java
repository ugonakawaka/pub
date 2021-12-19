package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oreore.nrf.model.Ipv6Prefix;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Range of IPv6 prefixes
 */
@ApiModel(description = "Range of IPv6 prefixes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class Ipv6PrefixRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("start")
  private Ipv6Prefix start;

  @JsonProperty("end")
  private Ipv6Prefix end;

  public Ipv6PrefixRange start(Ipv6Prefix start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Prefix getStart() {
    return start;
  }

  public void setStart(Ipv6Prefix start) {
    this.start = start;
  }

  public Ipv6PrefixRange end(Ipv6Prefix end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Prefix getEnd() {
    return end;
  }

  public void setEnd(Ipv6Prefix end) {
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
    Ipv6PrefixRange ipv6PrefixRange = (Ipv6PrefixRange) o;
    return Objects.equals(this.start, ipv6PrefixRange.start) &&
        Objects.equals(this.end, ipv6PrefixRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv6PrefixRange {\n");
    
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

