package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contain the MO Exception Data Counter.
 */
@ApiModel(description = "Contain the MO Exception Data Counter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class MoExpDataCounter   {
  @JsonProperty("counter")
  private Integer counter;

  @JsonProperty("timeStamp")
  private OffsetDateTime timeStamp;

  public MoExpDataCounter counter(Integer counter) {
    this.counter = counter;
    return this;
  }

  /**
   * Unsigned integer identifying the MO Exception Data Counter, as specified in clause 5.31.14.3 of 3GPP TS 23.501.
   * @return counter
  */
  @ApiModelProperty(required = true, value = "Unsigned integer identifying the MO Exception Data Counter, as specified in clause 5.31.14.3 of 3GPP TS 23.501.")
  @NotNull


  public Integer getCounter() {
    return counter;
  }

  public void setCounter(Integer counter) {
    this.counter = counter;
  }

  public MoExpDataCounter timeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoExpDataCounter moExpDataCounter = (MoExpDataCounter) o;
    return Objects.equals(this.counter, moExpDataCounter.counter) &&
        Objects.equals(this.timeStamp, moExpDataCounter.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counter, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoExpDataCounter {\n");
    
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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

