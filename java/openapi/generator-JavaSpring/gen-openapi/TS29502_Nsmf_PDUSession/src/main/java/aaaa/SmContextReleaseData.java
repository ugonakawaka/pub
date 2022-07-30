package aaaa;

import java.util.Objects;
import aaaa.Cause;
import aaaa.N2SmInfoType;
import aaaa.NgApCause;
import aaaa.RefToBinaryData;
import aaaa.UserLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Release SM Context Request
 */
@ApiModel(description = "Data within Release SM Context Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class SmContextReleaseData   {
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

  @JsonProperty("vsmfReleaseOnly")
  private Boolean vsmfReleaseOnly = false;

  @JsonProperty("n2SmInfo")
  private RefToBinaryData n2SmInfo;

  @JsonProperty("n2SmInfoType")
  private N2SmInfoType n2SmInfoType;

  @JsonProperty("ismfReleaseOnly")
  private Boolean ismfReleaseOnly = false;

  public SmContextReleaseData cause(Cause cause) {
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

  public SmContextReleaseData ngApCause(NgApCause ngApCause) {
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

  public SmContextReleaseData _5gMmCauseValue(Integer _5gMmCauseValue) {
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

  public SmContextReleaseData ueLocation(UserLocation ueLocation) {
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

  public SmContextReleaseData ueTimeZone(String ueTimeZone) {
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

  public SmContextReleaseData addUeLocation(UserLocation addUeLocation) {
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

  public SmContextReleaseData vsmfReleaseOnly(Boolean vsmfReleaseOnly) {
    this.vsmfReleaseOnly = vsmfReleaseOnly;
    return this;
  }

  /**
   * Get vsmfReleaseOnly
   * @return vsmfReleaseOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getVsmfReleaseOnly() {
    return vsmfReleaseOnly;
  }

  public void setVsmfReleaseOnly(Boolean vsmfReleaseOnly) {
    this.vsmfReleaseOnly = vsmfReleaseOnly;
  }

  public SmContextReleaseData n2SmInfo(RefToBinaryData n2SmInfo) {
    this.n2SmInfo = n2SmInfo;
    return this;
  }

  /**
   * Get n2SmInfo
   * @return n2SmInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN2SmInfo() {
    return n2SmInfo;
  }

  public void setN2SmInfo(RefToBinaryData n2SmInfo) {
    this.n2SmInfo = n2SmInfo;
  }

  public SmContextReleaseData n2SmInfoType(N2SmInfoType n2SmInfoType) {
    this.n2SmInfoType = n2SmInfoType;
    return this;
  }

  /**
   * Get n2SmInfoType
   * @return n2SmInfoType
  */
  @ApiModelProperty(value = "")

  @Valid

  public N2SmInfoType getN2SmInfoType() {
    return n2SmInfoType;
  }

  public void setN2SmInfoType(N2SmInfoType n2SmInfoType) {
    this.n2SmInfoType = n2SmInfoType;
  }

  public SmContextReleaseData ismfReleaseOnly(Boolean ismfReleaseOnly) {
    this.ismfReleaseOnly = ismfReleaseOnly;
    return this;
  }

  /**
   * Get ismfReleaseOnly
   * @return ismfReleaseOnly
  */
  @ApiModelProperty(value = "")


  public Boolean getIsmfReleaseOnly() {
    return ismfReleaseOnly;
  }

  public void setIsmfReleaseOnly(Boolean ismfReleaseOnly) {
    this.ismfReleaseOnly = ismfReleaseOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContextReleaseData smContextReleaseData = (SmContextReleaseData) o;
    return Objects.equals(this.cause, smContextReleaseData.cause) &&
        Objects.equals(this.ngApCause, smContextReleaseData.ngApCause) &&
        Objects.equals(this._5gMmCauseValue, smContextReleaseData._5gMmCauseValue) &&
        Objects.equals(this.ueLocation, smContextReleaseData.ueLocation) &&
        Objects.equals(this.ueTimeZone, smContextReleaseData.ueTimeZone) &&
        Objects.equals(this.addUeLocation, smContextReleaseData.addUeLocation) &&
        Objects.equals(this.vsmfReleaseOnly, smContextReleaseData.vsmfReleaseOnly) &&
        Objects.equals(this.n2SmInfo, smContextReleaseData.n2SmInfo) &&
        Objects.equals(this.n2SmInfoType, smContextReleaseData.n2SmInfoType) &&
        Objects.equals(this.ismfReleaseOnly, smContextReleaseData.ismfReleaseOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, ngApCause, _5gMmCauseValue, ueLocation, ueTimeZone, addUeLocation, vsmfReleaseOnly, n2SmInfo, n2SmInfoType, ismfReleaseOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextReleaseData {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    ngApCause: ").append(toIndentedString(ngApCause)).append("\n");
    sb.append("    _5gMmCauseValue: ").append(toIndentedString(_5gMmCauseValue)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
    sb.append("    ueTimeZone: ").append(toIndentedString(ueTimeZone)).append("\n");
    sb.append("    addUeLocation: ").append(toIndentedString(addUeLocation)).append("\n");
    sb.append("    vsmfReleaseOnly: ").append(toIndentedString(vsmfReleaseOnly)).append("\n");
    sb.append("    n2SmInfo: ").append(toIndentedString(n2SmInfo)).append("\n");
    sb.append("    n2SmInfoType: ").append(toIndentedString(n2SmInfoType)).append("\n");
    sb.append("    ismfReleaseOnly: ").append(toIndentedString(ismfReleaseOnly)).append("\n");
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

