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
 * A range of SUPIs (subscriber identities), either based on a numeric range, or based on regular-expression matching
 */
@ApiModel(description = "A range of SUPIs (subscriber identities), either based on a numeric range, or based on regular-expression matching")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SupiRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  @JsonProperty("pattern")
  private String pattern;

  public SupiRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @ApiModelProperty(value = "")

@Pattern(regexp = "^[0-9]+$") 
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public SupiRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")

@Pattern(regexp = "^[0-9]+$") 
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public SupiRange pattern(String pattern) {
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
    SupiRange supiRange = (SupiRange) o;
    return Objects.equals(this.start, supiRange.start) &&
        Objects.equals(this.end, supiRange.end) &&
        Objects.equals(this.pattern, supiRange.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupiRange {\n");
    
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

