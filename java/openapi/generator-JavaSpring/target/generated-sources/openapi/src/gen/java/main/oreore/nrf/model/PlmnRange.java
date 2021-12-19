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
 * Range of PLMN IDs
 */
@ApiModel(description = "Range of PLMN IDs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class PlmnRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  @JsonProperty("pattern")
  private String pattern;

  public PlmnRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @ApiModelProperty(value = "")

@Pattern(regexp = "^[0-9]{3}[0-9]{2,3}$") 
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public PlmnRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")

@Pattern(regexp = "^[0-9]{3}[0-9]{2,3}$") 
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public PlmnRange pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   * @return pattern
  */
  @ApiModelProperty(value = "")


  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnRange plmnRange = (PlmnRange) o;
    return Objects.equals(this.start, plmnRange.start) &&
        Objects.equals(this.end, plmnRange.end) &&
        Objects.equals(this.pattern, plmnRange.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnRange {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

