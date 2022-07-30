package aaaa;

import java.util.Objects;
import aaaa.BatteryIndication;
import aaaa.ScheduledCommunicationTime;
import aaaa.ScheduledCommunicationType;
import aaaa.StationaryIndication;
import aaaa.TrafficProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SMF derived CN assisted RAN parameters tuning
 */
@ApiModel(description = "SMF derived CN assisted RAN parameters tuning")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class CnAssistedRanPara   {
  @JsonProperty("stationaryIndication")
  private StationaryIndication stationaryIndication;

  @JsonProperty("communicationDurationTime")
  private Integer communicationDurationTime;

  @JsonProperty("periodicTime")
  private Integer periodicTime;

  @JsonProperty("scheduledCommunicationTime")
  private ScheduledCommunicationTime scheduledCommunicationTime;

  @JsonProperty("scheduledCommunicationType")
  private ScheduledCommunicationType scheduledCommunicationType;

  @JsonProperty("trafficProfile")
  private TrafficProfile trafficProfile;

  @JsonProperty("batteryIndication")
  private BatteryIndication batteryIndication;

  public CnAssistedRanPara stationaryIndication(StationaryIndication stationaryIndication) {
    this.stationaryIndication = stationaryIndication;
    return this;
  }

  /**
   * Get stationaryIndication
   * @return stationaryIndication
  */
  @ApiModelProperty(value = "")

  @Valid

  public StationaryIndication getStationaryIndication() {
    return stationaryIndication;
  }

  public void setStationaryIndication(StationaryIndication stationaryIndication) {
    this.stationaryIndication = stationaryIndication;
  }

  public CnAssistedRanPara communicationDurationTime(Integer communicationDurationTime) {
    this.communicationDurationTime = communicationDurationTime;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return communicationDurationTime
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getCommunicationDurationTime() {
    return communicationDurationTime;
  }

  public void setCommunicationDurationTime(Integer communicationDurationTime) {
    this.communicationDurationTime = communicationDurationTime;
  }

  public CnAssistedRanPara periodicTime(Integer periodicTime) {
    this.periodicTime = periodicTime;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return periodicTime
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getPeriodicTime() {
    return periodicTime;
  }

  public void setPeriodicTime(Integer periodicTime) {
    this.periodicTime = periodicTime;
  }

  public CnAssistedRanPara scheduledCommunicationTime(ScheduledCommunicationTime scheduledCommunicationTime) {
    this.scheduledCommunicationTime = scheduledCommunicationTime;
    return this;
  }

  /**
   * Get scheduledCommunicationTime
   * @return scheduledCommunicationTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public ScheduledCommunicationTime getScheduledCommunicationTime() {
    return scheduledCommunicationTime;
  }

  public void setScheduledCommunicationTime(ScheduledCommunicationTime scheduledCommunicationTime) {
    this.scheduledCommunicationTime = scheduledCommunicationTime;
  }

  public CnAssistedRanPara scheduledCommunicationType(ScheduledCommunicationType scheduledCommunicationType) {
    this.scheduledCommunicationType = scheduledCommunicationType;
    return this;
  }

  /**
   * Get scheduledCommunicationType
   * @return scheduledCommunicationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ScheduledCommunicationType getScheduledCommunicationType() {
    return scheduledCommunicationType;
  }

  public void setScheduledCommunicationType(ScheduledCommunicationType scheduledCommunicationType) {
    this.scheduledCommunicationType = scheduledCommunicationType;
  }

  public CnAssistedRanPara trafficProfile(TrafficProfile trafficProfile) {
    this.trafficProfile = trafficProfile;
    return this;
  }

  /**
   * Get trafficProfile
   * @return trafficProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public TrafficProfile getTrafficProfile() {
    return trafficProfile;
  }

  public void setTrafficProfile(TrafficProfile trafficProfile) {
    this.trafficProfile = trafficProfile;
  }

  public CnAssistedRanPara batteryIndication(BatteryIndication batteryIndication) {
    this.batteryIndication = batteryIndication;
    return this;
  }

  /**
   * Get batteryIndication
   * @return batteryIndication
  */
  @ApiModelProperty(value = "")

  @Valid

  public BatteryIndication getBatteryIndication() {
    return batteryIndication;
  }

  public void setBatteryIndication(BatteryIndication batteryIndication) {
    this.batteryIndication = batteryIndication;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CnAssistedRanPara cnAssistedRanPara = (CnAssistedRanPara) o;
    return Objects.equals(this.stationaryIndication, cnAssistedRanPara.stationaryIndication) &&
        Objects.equals(this.communicationDurationTime, cnAssistedRanPara.communicationDurationTime) &&
        Objects.equals(this.periodicTime, cnAssistedRanPara.periodicTime) &&
        Objects.equals(this.scheduledCommunicationTime, cnAssistedRanPara.scheduledCommunicationTime) &&
        Objects.equals(this.scheduledCommunicationType, cnAssistedRanPara.scheduledCommunicationType) &&
        Objects.equals(this.trafficProfile, cnAssistedRanPara.trafficProfile) &&
        Objects.equals(this.batteryIndication, cnAssistedRanPara.batteryIndication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stationaryIndication, communicationDurationTime, periodicTime, scheduledCommunicationTime, scheduledCommunicationType, trafficProfile, batteryIndication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CnAssistedRanPara {\n");
    
    sb.append("    stationaryIndication: ").append(toIndentedString(stationaryIndication)).append("\n");
    sb.append("    communicationDurationTime: ").append(toIndentedString(communicationDurationTime)).append("\n");
    sb.append("    periodicTime: ").append(toIndentedString(periodicTime)).append("\n");
    sb.append("    scheduledCommunicationTime: ").append(toIndentedString(scheduledCommunicationTime)).append("\n");
    sb.append("    scheduledCommunicationType: ").append(toIndentedString(scheduledCommunicationType)).append("\n");
    sb.append("    trafficProfile: ").append(toIndentedString(trafficProfile)).append("\n");
    sb.append("    batteryIndication: ").append(toIndentedString(batteryIndication)).append("\n");
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

