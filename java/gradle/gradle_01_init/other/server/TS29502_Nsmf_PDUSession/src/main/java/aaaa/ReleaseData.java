package aaaa;

import java.util.Objects;
import aaaa.Cause;
import aaaa.N4Information;
import aaaa.NgApCause;
import aaaa.SecondaryRatUsageInfo;
import aaaa.SecondaryRatUsageReport;
import aaaa.UserLocation;
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
 * Data within Release Request
 */
@ApiModel(description = "Data within Release Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class ReleaseData   {
  @JsonProperty("cause")
  private Cause cause;

  @JsonProperty("ngApCause")
  private NgApCause ngApCause;

  @JsonProperty("5gMmCauseValue")
  private Integer _5gMmCauseValue;

  @JsonProperty("ueLocation")
  private UserLocation ueLocation;

  @JsonProperty("ueTimeZone")
  private String ueTimeZone;

  @JsonProperty("addUeLocation")
  private UserLocation addUeLocation;

  @JsonProperty("secondaryRatUsageReport")
  @Valid
  private List<SecondaryRatUsageReport> secondaryRatUsageReport = null;

  @JsonProperty("secondaryRatUsageInfo")
  @Valid
  private List<SecondaryRatUsageInfo> secondaryRatUsageInfo = null;

  @JsonProperty("n4Info")
  private N4Information n4Info;

  @JsonProperty("n4InfoExt1")
  private N4Information n4InfoExt1;

  @JsonProperty("n4InfoExt2")
  private N4Information n4InfoExt2;

  public ReleaseData cause(Cause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @ApiModelProperty(value = "")

  @Valid

  public Cause getCause() {
    return cause;
  }

  public void setCause(Cause cause) {
    this.cause = cause;
  }

  public ReleaseData ngApCause(NgApCause ngApCause) {
    this.ngApCause = ngApCause;
    return this;
  }

  /**
   * Get ngApCause
   * @return ngApCause
  */
  @ApiModelProperty(value = "")

  @Valid

  public NgApCause getNgApCause() {
    return ngApCause;
  }

  public void setNgApCause(NgApCause ngApCause) {
    this.ngApCause = ngApCause;
  }

  public ReleaseData _5gMmCauseValue(Integer _5gMmCauseValue) {
    this._5gMmCauseValue = _5gMmCauseValue;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return _5gMmCauseValue
  */
  @ApiModelProperty(value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

@Min(0)
  public Integer get5gMmCauseValue() {
    return _5gMmCauseValue;
  }

  public void set5gMmCauseValue(Integer _5gMmCauseValue) {
    this._5gMmCauseValue = _5gMmCauseValue;
  }

  public ReleaseData ueLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
    return this;
  }

  /**
   * Get ueLocation
   * @return ueLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserLocation getUeLocation() {
    return ueLocation;
  }

  public void setUeLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
  }

  public ReleaseData ueTimeZone(String ueTimeZone) {
    this.ueTimeZone = ueTimeZone;
    return this;
  }

  /**
   * String with format \"<time-numoffset>\" optionally appended by \"<daylightSavingTime>\", where -  <time-numoffset> shall represent the time zone adjusted for daylight saving time and be encoded as time-numoffset as defined in clause 5.6 of IETF RFC 3339; - <daylightSavingTime> shall represent the adjustment that has been made and shall be encoded as \"+1\" or \"+2\" for a +1 or +2 hours adjustment. The example is for 8 hours behind UTC, +1 hour adjustment for Daylight Saving Time.
   * @return ueTimeZone
  */
  @ApiModelProperty(example = "-08:00+1", value = "String with format \"<time-numoffset>\" optionally appended by \"<daylightSavingTime>\", where -  <time-numoffset> shall represent the time zone adjusted for daylight saving time and be encoded as time-numoffset as defined in clause 5.6 of IETF RFC 3339; - <daylightSavingTime> shall represent the adjustment that has been made and shall be encoded as \"+1\" or \"+2\" for a +1 or +2 hours adjustment. The example is for 8 hours behind UTC, +1 hour adjustment for Daylight Saving Time.")


  public String getUeTimeZone() {
    return ueTimeZone;
  }

  public void setUeTimeZone(String ueTimeZone) {
    this.ueTimeZone = ueTimeZone;
  }

  public ReleaseData addUeLocation(UserLocation addUeLocation) {
    this.addUeLocation = addUeLocation;
    return this;
  }

  /**
   * Get addUeLocation
   * @return addUeLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserLocation getAddUeLocation() {
    return addUeLocation;
  }

  public void setAddUeLocation(UserLocation addUeLocation) {
    this.addUeLocation = addUeLocation;
  }

  public ReleaseData secondaryRatUsageReport(List<SecondaryRatUsageReport> secondaryRatUsageReport) {
    this.secondaryRatUsageReport = secondaryRatUsageReport;
    return this;
  }

  public ReleaseData addSecondaryRatUsageReportItem(SecondaryRatUsageReport secondaryRatUsageReportItem) {
    if (this.secondaryRatUsageReport == null) {
      this.secondaryRatUsageReport = new ArrayList<>();
    }
    this.secondaryRatUsageReport.add(secondaryRatUsageReportItem);
    return this;
  }

  /**
   * Get secondaryRatUsageReport
   * @return secondaryRatUsageReport
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<SecondaryRatUsageReport> getSecondaryRatUsageReport() {
    return secondaryRatUsageReport;
  }

  public void setSecondaryRatUsageReport(List<SecondaryRatUsageReport> secondaryRatUsageReport) {
    this.secondaryRatUsageReport = secondaryRatUsageReport;
  }

  public ReleaseData secondaryRatUsageInfo(List<SecondaryRatUsageInfo> secondaryRatUsageInfo) {
    this.secondaryRatUsageInfo = secondaryRatUsageInfo;
    return this;
  }

  public ReleaseData addSecondaryRatUsageInfoItem(SecondaryRatUsageInfo secondaryRatUsageInfoItem) {
    if (this.secondaryRatUsageInfo == null) {
      this.secondaryRatUsageInfo = new ArrayList<>();
    }
    this.secondaryRatUsageInfo.add(secondaryRatUsageInfoItem);
    return this;
  }

  /**
   * Get secondaryRatUsageInfo
   * @return secondaryRatUsageInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<SecondaryRatUsageInfo> getSecondaryRatUsageInfo() {
    return secondaryRatUsageInfo;
  }

  public void setSecondaryRatUsageInfo(List<SecondaryRatUsageInfo> secondaryRatUsageInfo) {
    this.secondaryRatUsageInfo = secondaryRatUsageInfo;
  }

  public ReleaseData n4Info(N4Information n4Info) {
    this.n4Info = n4Info;
    return this;
  }

  /**
   * Get n4Info
   * @return n4Info
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4Info() {
    return n4Info;
  }

  public void setN4Info(N4Information n4Info) {
    this.n4Info = n4Info;
  }

  public ReleaseData n4InfoExt1(N4Information n4InfoExt1) {
    this.n4InfoExt1 = n4InfoExt1;
    return this;
  }

  /**
   * Get n4InfoExt1
   * @return n4InfoExt1
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt1() {
    return n4InfoExt1;
  }

  public void setN4InfoExt1(N4Information n4InfoExt1) {
    this.n4InfoExt1 = n4InfoExt1;
  }

  public ReleaseData n4InfoExt2(N4Information n4InfoExt2) {
    this.n4InfoExt2 = n4InfoExt2;
    return this;
  }

  /**
   * Get n4InfoExt2
   * @return n4InfoExt2
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt2() {
    return n4InfoExt2;
  }

  public void setN4InfoExt2(N4Information n4InfoExt2) {
    this.n4InfoExt2 = n4InfoExt2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseData releaseData = (ReleaseData) o;
    return Objects.equals(this.cause, releaseData.cause) &&
        Objects.equals(this.ngApCause, releaseData.ngApCause) &&
        Objects.equals(this._5gMmCauseValue, releaseData._5gMmCauseValue) &&
        Objects.equals(this.ueLocation, releaseData.ueLocation) &&
        Objects.equals(this.ueTimeZone, releaseData.ueTimeZone) &&
        Objects.equals(this.addUeLocation, releaseData.addUeLocation) &&
        Objects.equals(this.secondaryRatUsageReport, releaseData.secondaryRatUsageReport) &&
        Objects.equals(this.secondaryRatUsageInfo, releaseData.secondaryRatUsageInfo) &&
        Objects.equals(this.n4Info, releaseData.n4Info) &&
        Objects.equals(this.n4InfoExt1, releaseData.n4InfoExt1) &&
        Objects.equals(this.n4InfoExt2, releaseData.n4InfoExt2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, ngApCause, _5gMmCauseValue, ueLocation, ueTimeZone, addUeLocation, secondaryRatUsageReport, secondaryRatUsageInfo, n4Info, n4InfoExt1, n4InfoExt2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseData {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    ngApCause: ").append(toIndentedString(ngApCause)).append("\n");
    sb.append("    _5gMmCauseValue: ").append(toIndentedString(_5gMmCauseValue)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
    sb.append("    ueTimeZone: ").append(toIndentedString(ueTimeZone)).append("\n");
    sb.append("    addUeLocation: ").append(toIndentedString(addUeLocation)).append("\n");
    sb.append("    secondaryRatUsageReport: ").append(toIndentedString(secondaryRatUsageReport)).append("\n");
    sb.append("    secondaryRatUsageInfo: ").append(toIndentedString(secondaryRatUsageInfo)).append("\n");
    sb.append("    n4Info: ").append(toIndentedString(n4Info)).append("\n");
    sb.append("    n4InfoExt1: ").append(toIndentedString(n4InfoExt1)).append("\n");
    sb.append("    n4InfoExt2: ").append(toIndentedString(n4InfoExt2)).append("\n");
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

