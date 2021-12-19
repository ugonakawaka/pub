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
 * A range of SDs (Slice Differentiators)
 */
@ApiModel(description = "A range of SDs (Slice Differentiators)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SdRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  public SdRange start(String start) {
    this.start = start;
    return this;
  }

  /**
   * First value identifying the start of an SD range. This string shall be formatted as specified for the sd attribute of the Snssai data type in clause 5.4.4.2.
   * @return start
  */
  @ApiModelProperty(value = "First value identifying the start of an SD range. This string shall be formatted as specified for the sd attribute of the Snssai data type in clause 5.4.4.2.")

@Pattern(regexp = "^[A-Fa-f0-9]{6}$") 
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public SdRange end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Last value identifying the end of an SD range. This string shall be formatted as specified for the sd attribute of the Snssai data type in clause 5.4.4.2.
   * @return end
  */
  @ApiModelProperty(value = "Last value identifying the end of an SD range. This string shall be formatted as specified for the sd attribute of the Snssai data type in clause 5.4.4.2.")

@Pattern(regexp = "^[A-Fa-f0-9]{6}$") 
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
    SdRange sdRange = (SdRange) o;
    return Objects.equals(this.start, sdRange.start) &&
        Objects.equals(this.end, sdRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdRange {\n");
    
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

