package aaaa;

import java.util.Objects;
import aaaa.ExtProblemDetails;
import aaaa.N2SmInfoType;
import aaaa.RefToBinaryData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error within Create SM Context Response
 */
@ApiModel(description = "Error within Create SM Context Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class SmContextCreateError   {
  @JsonProperty("error")
  private ExtProblemDetails error;

  @JsonProperty("n1SmMsg")
  private RefToBinaryData n1SmMsg;

  @JsonProperty("n2SmInfo")
  private RefToBinaryData n2SmInfo;

  @JsonProperty("n2SmInfoType")
  private N2SmInfoType n2SmInfoType;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  public SmContextCreateError error(ExtProblemDetails error) {
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

  public SmContextCreateError n1SmMsg(RefToBinaryData n1SmMsg) {
    this.n1SmMsg = n1SmMsg;
    return this;
  }

  /**
   * Get n1SmMsg
   * @return n1SmMsg
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN1SmMsg() {
    return n1SmMsg;
  }

  public void setN1SmMsg(RefToBinaryData n1SmMsg) {
    this.n1SmMsg = n1SmMsg;
  }

  public SmContextCreateError n2SmInfo(RefToBinaryData n2SmInfo) {
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

  public SmContextCreateError n2SmInfoType(N2SmInfoType n2SmInfoType) {
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

  public SmContextCreateError recoveryTime(OffsetDateTime recoveryTime) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContextCreateError smContextCreateError = (SmContextCreateError) o;
    return Objects.equals(this.error, smContextCreateError.error) &&
        Objects.equals(this.n1SmMsg, smContextCreateError.n1SmMsg) &&
        Objects.equals(this.n2SmInfo, smContextCreateError.n2SmInfo) &&
        Objects.equals(this.n2SmInfoType, smContextCreateError.n2SmInfoType) &&
        Objects.equals(this.recoveryTime, smContextCreateError.recoveryTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, n1SmMsg, n2SmInfo, n2SmInfoType, recoveryTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextCreateError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    n1SmMsg: ").append(toIndentedString(n1SmMsg)).append("\n");
    sb.append("    n2SmInfo: ").append(toIndentedString(n2SmInfo)).append("\n");
    sb.append("    n2SmInfoType: ").append(toIndentedString(n2SmInfoType)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
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

