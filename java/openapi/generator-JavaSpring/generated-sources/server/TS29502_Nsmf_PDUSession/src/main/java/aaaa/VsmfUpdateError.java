package aaaa;

import java.util.Objects;
import aaaa.Arp;
import aaaa.ExtProblemDetails;
import aaaa.N4Information;
import aaaa.NgApCause;
import aaaa.RefToBinaryData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error within Update Response from V-SMF, or from I-SMF to SMF
 */
@ApiModel(description = "Error within Update Response from V-SMF, or from I-SMF to SMF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class VsmfUpdateError   {
  @JsonProperty("error")
  private ExtProblemDetails error;

  @JsonProperty("pti")
  private Integer pti;

  @JsonProperty("n1smCause")
  private String n1smCause;

  @JsonProperty("n1SmInfoFromUe")
  private RefToBinaryData n1SmInfoFromUe;

  @JsonProperty("unknownN1SmInfo")
  private RefToBinaryData unknownN1SmInfo;

  @JsonProperty("failedToAssignEbiList")
  @Valid
  private List<Arp> failedToAssignEbiList = null;

  @JsonProperty("ngApCause")
  private NgApCause ngApCause;

  @JsonProperty("5gMmCauseValue")
  private Integer _5gMmCauseValue;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  @JsonProperty("n4Info")
  private N4Information n4Info;

  @JsonProperty("n4InfoExt1")
  private N4Information n4InfoExt1;

  @JsonProperty("n4InfoExt2")
  private N4Information n4InfoExt2;

  @JsonProperty("n4InfoExt3")
  private N4Information n4InfoExt3;

  public VsmfUpdateError error(ExtProblemDetails error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ExtProblemDetails getError() {
    return error;
  }

  public void setError(ExtProblemDetails error) {
    this.error = error;
  }

  public VsmfUpdateError pti(Integer pti) {
    this.pti = pti;
    return this;
  }

  /**
   * Procedure Transaction Identifier
   * minimum: 0
   * maximum: 255
   * @return pti
  */
  @ApiModelProperty(value = "Procedure Transaction Identifier")

@Min(0) @Max(255) 
  public Integer getPti() {
    return pti;
  }

  public void setPti(Integer pti) {
    this.pti = pti;
  }

  public VsmfUpdateError n1smCause(String n1smCause) {
    this.n1smCause = n1smCause;
    return this;
  }

  /**
   * Get n1smCause
   * @return n1smCause
  */
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-F0-9]{2}$") 
  public String getN1smCause() {
    return n1smCause;
  }

  public void setN1smCause(String n1smCause) {
    this.n1smCause = n1smCause;
  }

  public VsmfUpdateError n1SmInfoFromUe(RefToBinaryData n1SmInfoFromUe) {
    this.n1SmInfoFromUe = n1SmInfoFromUe;
    return this;
  }

  /**
   * Get n1SmInfoFromUe
   * @return n1SmInfoFromUe
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN1SmInfoFromUe() {
    return n1SmInfoFromUe;
  }

  public void setN1SmInfoFromUe(RefToBinaryData n1SmInfoFromUe) {
    this.n1SmInfoFromUe = n1SmInfoFromUe;
  }

  public VsmfUpdateError unknownN1SmInfo(RefToBinaryData unknownN1SmInfo) {
    this.unknownN1SmInfo = unknownN1SmInfo;
    return this;
  }

  /**
   * Get unknownN1SmInfo
   * @return unknownN1SmInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getUnknownN1SmInfo() {
    return unknownN1SmInfo;
  }

  public void setUnknownN1SmInfo(RefToBinaryData unknownN1SmInfo) {
    this.unknownN1SmInfo = unknownN1SmInfo;
  }

  public VsmfUpdateError failedToAssignEbiList(List<Arp> failedToAssignEbiList) {
    this.failedToAssignEbiList = failedToAssignEbiList;
    return this;
  }

  public VsmfUpdateError addFailedToAssignEbiListItem(Arp failedToAssignEbiListItem) {
    if (this.failedToAssignEbiList == null) {
      this.failedToAssignEbiList = new ArrayList<>();
    }
    this.failedToAssignEbiList.add(failedToAssignEbiListItem);
    return this;
  }

  /**
   * Get failedToAssignEbiList
   * @return failedToAssignEbiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<Arp> getFailedToAssignEbiList() {
    return failedToAssignEbiList;
  }

  public void setFailedToAssignEbiList(List<Arp> failedToAssignEbiList) {
    this.failedToAssignEbiList = failedToAssignEbiList;
  }

  public VsmfUpdateError ngApCause(NgApCause ngApCause) {
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

  public VsmfUpdateError _5gMmCauseValue(Integer _5gMmCauseValue) {
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

  public VsmfUpdateError recoveryTime(OffsetDateTime recoveryTime) {
    this.recoveryTime = recoveryTime;
    return this;
  }

  /**
   * Get recoveryTime
   * @return recoveryTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRecoveryTime() {
    return recoveryTime;
  }

  public void setRecoveryTime(OffsetDateTime recoveryTime) {
    this.recoveryTime = recoveryTime;
  }

  public VsmfUpdateError n4Info(N4Information n4Info) {
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

  public VsmfUpdateError n4InfoExt1(N4Information n4InfoExt1) {
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

  public VsmfUpdateError n4InfoExt2(N4Information n4InfoExt2) {
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

  public VsmfUpdateError n4InfoExt3(N4Information n4InfoExt3) {
    this.n4InfoExt3 = n4InfoExt3;
    return this;
  }

  /**
   * Get n4InfoExt3
   * @return n4InfoExt3
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt3() {
    return n4InfoExt3;
  }

  public void setN4InfoExt3(N4Information n4InfoExt3) {
    this.n4InfoExt3 = n4InfoExt3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsmfUpdateError vsmfUpdateError = (VsmfUpdateError) o;
    return Objects.equals(this.error, vsmfUpdateError.error) &&
        Objects.equals(this.pti, vsmfUpdateError.pti) &&
        Objects.equals(this.n1smCause, vsmfUpdateError.n1smCause) &&
        Objects.equals(this.n1SmInfoFromUe, vsmfUpdateError.n1SmInfoFromUe) &&
        Objects.equals(this.unknownN1SmInfo, vsmfUpdateError.unknownN1SmInfo) &&
        Objects.equals(this.failedToAssignEbiList, vsmfUpdateError.failedToAssignEbiList) &&
        Objects.equals(this.ngApCause, vsmfUpdateError.ngApCause) &&
        Objects.equals(this._5gMmCauseValue, vsmfUpdateError._5gMmCauseValue) &&
        Objects.equals(this.recoveryTime, vsmfUpdateError.recoveryTime) &&
        Objects.equals(this.n4Info, vsmfUpdateError.n4Info) &&
        Objects.equals(this.n4InfoExt1, vsmfUpdateError.n4InfoExt1) &&
        Objects.equals(this.n4InfoExt2, vsmfUpdateError.n4InfoExt2) &&
        Objects.equals(this.n4InfoExt3, vsmfUpdateError.n4InfoExt3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, pti, n1smCause, n1SmInfoFromUe, unknownN1SmInfo, failedToAssignEbiList, ngApCause, _5gMmCauseValue, recoveryTime, n4Info, n4InfoExt1, n4InfoExt2, n4InfoExt3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsmfUpdateError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    pti: ").append(toIndentedString(pti)).append("\n");
    sb.append("    n1smCause: ").append(toIndentedString(n1smCause)).append("\n");
    sb.append("    n1SmInfoFromUe: ").append(toIndentedString(n1SmInfoFromUe)).append("\n");
    sb.append("    unknownN1SmInfo: ").append(toIndentedString(unknownN1SmInfo)).append("\n");
    sb.append("    failedToAssignEbiList: ").append(toIndentedString(failedToAssignEbiList)).append("\n");
    sb.append("    ngApCause: ").append(toIndentedString(ngApCause)).append("\n");
    sb.append("    _5gMmCauseValue: ").append(toIndentedString(_5gMmCauseValue)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
    sb.append("    n4Info: ").append(toIndentedString(n4Info)).append("\n");
    sb.append("    n4InfoExt1: ").append(toIndentedString(n4InfoExt1)).append("\n");
    sb.append("    n4InfoExt2: ").append(toIndentedString(n4InfoExt2)).append("\n");
    sb.append("    n4InfoExt3: ").append(toIndentedString(n4InfoExt3)).append("\n");
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

