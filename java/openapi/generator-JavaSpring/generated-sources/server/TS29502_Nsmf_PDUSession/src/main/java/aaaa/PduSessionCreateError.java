package aaaa;

import java.util.Objects;
import aaaa.ProblemDetails;
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
 * Error within Create Response
 */
@ApiModel(description = "Error within Create Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class PduSessionCreateError   {
  @JsonProperty("error")
  private ProblemDetails error;

  @JsonProperty("n1smCause")
  private String n1smCause;

  @JsonProperty("n1SmInfoToUe")
  private RefToBinaryData n1SmInfoToUe;

  @JsonProperty("backOffTimer")
  private Integer backOffTimer;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  public PduSessionCreateError error(ProblemDetails error) {
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

  public ProblemDetails getError() {
    return error;
  }

  public void setError(ProblemDetails error) {
    this.error = error;
  }

  public PduSessionCreateError n1smCause(String n1smCause) {
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

  public PduSessionCreateError n1SmInfoToUe(RefToBinaryData n1SmInfoToUe) {
    this.n1SmInfoToUe = n1SmInfoToUe;
    return this;
  }

  /**
   * Get n1SmInfoToUe
   * @return n1SmInfoToUe
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN1SmInfoToUe() {
    return n1SmInfoToUe;
  }

  public void setN1SmInfoToUe(RefToBinaryData n1SmInfoToUe) {
    this.n1SmInfoToUe = n1SmInfoToUe;
  }

  public PduSessionCreateError backOffTimer(Integer backOffTimer) {
    this.backOffTimer = backOffTimer;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return backOffTimer
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getBackOffTimer() {
    return backOffTimer;
  }

  public void setBackOffTimer(Integer backOffTimer) {
    this.backOffTimer = backOffTimer;
  }

  public PduSessionCreateError recoveryTime(OffsetDateTime recoveryTime) {
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
    PduSessionCreateError pduSessionCreateError = (PduSessionCreateError) o;
    return Objects.equals(this.error, pduSessionCreateError.error) &&
        Objects.equals(this.n1smCause, pduSessionCreateError.n1smCause) &&
        Objects.equals(this.n1SmInfoToUe, pduSessionCreateError.n1SmInfoToUe) &&
        Objects.equals(this.backOffTimer, pduSessionCreateError.backOffTimer) &&
        Objects.equals(this.recoveryTime, pduSessionCreateError.recoveryTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, n1smCause, n1SmInfoToUe, backOffTimer, recoveryTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PduSessionCreateError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    n1smCause: ").append(toIndentedString(n1smCause)).append("\n");
    sb.append("    n1SmInfoToUe: ").append(toIndentedString(n1SmInfoToUe)).append("\n");
    sb.append("    backOffTimer: ").append(toIndentedString(backOffTimer)).append("\n");
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

