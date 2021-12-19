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
 * Range of TACs (Tracking Area Codes)
 */
@ApiModel(description = "Range of TACs (Tracking Area Codes)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class TacRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  @JsonProperty("pattern")
  private String pattern;

  public TacRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @ApiModelProperty(value = "")

@Pattern(regexp = "^([A-Fa-f0-9]{4}|[A-Fa-f0-9]{6})$") 
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public TacRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")

@Pattern(regexp = "^([A-Fa-f0-9]{4}|[A-Fa-f0-9]{6})$") 
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public TacRange pattern(String pattern) {
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
    TacRange tacRange = (TacRange) o;
    return Objects.equals(this.start, tacRange.start) &&
        Objects.equals(this.end, tacRange.end) &&
        Objects.equals(this.pattern, tacRange.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TacRange {\n");
    
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

