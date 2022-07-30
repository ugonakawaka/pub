package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies time and day of the week when the UE is available for communication.
 */
@ApiModel(description = "Identifies time and day of the week when the UE is available for communication.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class ScheduledCommunicationTime   {
  @JsonProperty("daysOfWeek")
  @Valid
  private List<Integer> daysOfWeek = null;

  @JsonProperty("timeOfDayStart")
  private String timeOfDayStart;

  @JsonProperty("timeOfDayEnd")
  private String timeOfDayEnd;

  public ScheduledCommunicationTime daysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public ScheduledCommunicationTime addDaysOfWeekItem(Integer daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

  /**
   * Identifies the day(s) of the week. If absent, it indicates every day of the week.
   * @return daysOfWeek
  */
  @ApiModelProperty(value = "Identifies the day(s) of the week. If absent, it indicates every day of the week.")

@Size(min=1,max=6) 
  public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public ScheduledCommunicationTime timeOfDayStart(String timeOfDayStart) {
    this.timeOfDayStart = timeOfDayStart;
    return this;
  }

  /**
   * String with format partial-time or full-time as defined in clause 5.6 of IETF RFC 3339. Examples, 20:15:00, 20:15:00-08:00 (for 8 hours behind UTC).
   * @return timeOfDayStart
  */
  @ApiModelProperty(value = "String with format partial-time or full-time as defined in clause 5.6 of IETF RFC 3339. Examples, 20:15:00, 20:15:00-08:00 (for 8 hours behind UTC).")


  public String getTimeOfDayStart() {
    return timeOfDayStart;
  }

  public void setTimeOfDayStart(String timeOfDayStart) {
    this.timeOfDayStart = timeOfDayStart;
  }

  public ScheduledCommunicationTime timeOfDayEnd(String timeOfDayEnd) {
    this.timeOfDayEnd = timeOfDayEnd;
    return this;
  }

  /**
   * String with format partial-time or full-time as defined in clause 5.6 of IETF RFC 3339. Examples, 20:15:00, 20:15:00-08:00 (for 8 hours behind UTC).
   * @return timeOfDayEnd
  */
  @ApiModelProperty(value = "String with format partial-time or full-time as defined in clause 5.6 of IETF RFC 3339. Examples, 20:15:00, 20:15:00-08:00 (for 8 hours behind UTC).")


  public String getTimeOfDayEnd() {
    return timeOfDayEnd;
  }

  public void setTimeOfDayEnd(String timeOfDayEnd) {
    this.timeOfDayEnd = timeOfDayEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledCommunicationTime scheduledCommunicationTime = (ScheduledCommunicationTime) o;
    return Objects.equals(this.daysOfWeek, scheduledCommunicationTime.daysOfWeek) &&
        Objects.equals(this.timeOfDayStart, scheduledCommunicationTime.timeOfDayStart) &&
        Objects.equals(this.timeOfDayEnd, scheduledCommunicationTime.timeOfDayEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfWeek, timeOfDayStart, timeOfDayEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledCommunicationTime {\n");
    
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    timeOfDayStart: ").append(toIndentedString(timeOfDayStart)).append("\n");
    sb.append("    timeOfDayEnd: ").append(toIndentedString(timeOfDayEnd)).append("\n");
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

