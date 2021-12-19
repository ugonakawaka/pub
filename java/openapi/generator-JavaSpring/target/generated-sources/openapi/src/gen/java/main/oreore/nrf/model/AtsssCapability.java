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
 * AtsssCapability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class AtsssCapability  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("atsssLL")
  private Boolean atsssLL = false;

  @JsonProperty("mptcp")
  private Boolean mptcp = false;

  @JsonProperty("rttWithoutPmf")
  private Boolean rttWithoutPmf = false;

  public AtsssCapability atsssLL(Boolean atsssLL) {
    this.atsssLL = atsssLL;
    return this;
  }

  /**
   * Indicates the ATSSS-LL capability to support procedures related to Access Traffic Steering, Switching, Splitting (see clauses 4.2.10, 5.32 of 3GPP TS 23.501) true: Supported false (default): Not Supported 
   * @return atsssLL
  */
  @ApiModelProperty(value = "Indicates the ATSSS-LL capability to support procedures related to Access Traffic Steering, Switching, Splitting (see clauses 4.2.10, 5.32 of 3GPP TS 23.501) true: Supported false (default): Not Supported ")


  public Boolean getAtsssLL() {
    return atsssLL;
  }

  public void setAtsssLL(Boolean atsssLL) {
    this.atsssLL = atsssLL;
  }

  public AtsssCapability mptcp(Boolean mptcp) {
    this.mptcp = mptcp;
    return this;
  }

  /**
   * Indicates the MPTCP capability to support procedures related to Access Traffic Steering, Switching, Splitting (see clauses 4.2.10, 5.32 of 3GPP TS 23.501 true: Supported false (default): Not Supported 
   * @return mptcp
  */
  @ApiModelProperty(value = "Indicates the MPTCP capability to support procedures related to Access Traffic Steering, Switching, Splitting (see clauses 4.2.10, 5.32 of 3GPP TS 23.501 true: Supported false (default): Not Supported ")


  public Boolean getMptcp() {
    return mptcp;
  }

  public void setMptcp(Boolean mptcp) {
    this.mptcp = mptcp;
  }

  public AtsssCapability rttWithoutPmf(Boolean rttWithoutPmf) {
    this.rttWithoutPmf = rttWithoutPmf;
    return this;
  }

  /**
   * This IE is only used by the UPF to indicate whether the UPF supports RTT measurement without PMF (see clauses 5.32.2, 6.3.3.3 of 3GPP TS 23.501 true: Supported false (default): Not Supported 
   * @return rttWithoutPmf
  */
  @ApiModelProperty(value = "This IE is only used by the UPF to indicate whether the UPF supports RTT measurement without PMF (see clauses 5.32.2, 6.3.3.3 of 3GPP TS 23.501 true: Supported false (default): Not Supported ")


  public Boolean getRttWithoutPmf() {
    return rttWithoutPmf;
  }

  public void setRttWithoutPmf(Boolean rttWithoutPmf) {
    this.rttWithoutPmf = rttWithoutPmf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtsssCapability atsssCapability = (AtsssCapability) o;
    return Objects.equals(this.atsssLL, atsssCapability.atsssLL) &&
        Objects.equals(this.mptcp, atsssCapability.mptcp) &&
        Objects.equals(this.rttWithoutPmf, atsssCapability.rttWithoutPmf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atsssLL, mptcp, rttWithoutPmf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtsssCapability {\n");
    
    sb.append("    atsssLL: ").append(toIndentedString(atsssLL)).append("\n");
    sb.append("    mptcp: ").append(toIndentedString(mptcp)).append("\n");
    sb.append("    rttWithoutPmf: ").append(toIndentedString(rttWithoutPmf)).append("\n");
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

