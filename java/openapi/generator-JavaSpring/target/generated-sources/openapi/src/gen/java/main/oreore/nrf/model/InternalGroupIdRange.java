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
 * A range of Group IDs (internal group identities), either based on a numeric range, or based on regular-expression matching
 */
@ApiModel(description = "A range of Group IDs (internal group identities), either based on a numeric range, or based on regular-expression matching")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class InternalGroupIdRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  @JsonProperty("pattern")
  private String pattern;

  public InternalGroupIdRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * String identifying a group of devices network internal globally unique ID which identifies a set of IMSIs, as specified in clause 19.9 of 3GPP TS 23.003.
   * @return start
  */
  @ApiModelProperty(value = "String identifying a group of devices network internal globally unique ID which identifies a set of IMSIs, as specified in clause 19.9 of 3GPP TS 23.003.")

@Pattern(regexp = "^[A-Fa-f0-9]{8}-[0-9]{3}-[0-9]{2,3}-([A-Fa-f0-9][A-Fa-f0-9]){1,10}$") 
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public InternalGroupIdRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * String identifying a group of devices network internal globally unique ID which identifies a set of IMSIs, as specified in clause 19.9 of 3GPP TS 23.003.
   * @return end
  */
  @ApiModelProperty(value = "String identifying a group of devices network internal globally unique ID which identifies a set of IMSIs, as specified in clause 19.9 of 3GPP TS 23.003.")

@Pattern(regexp = "^[A-Fa-f0-9]{8}-[0-9]{3}-[0-9]{2,3}-([A-Fa-f0-9][A-Fa-f0-9]){1,10}$") 
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public InternalGroupIdRange pattern(String pattern) {
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
    InternalGroupIdRange internalGroupIdRange = (InternalGroupIdRange) o;
    return Objects.equals(this.start, internalGroupIdRange.start) &&
        Objects.equals(this.end, internalGroupIdRange.end) &&
        Objects.equals(this.pattern, internalGroupIdRange.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalGroupIdRange {\n");
    
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

