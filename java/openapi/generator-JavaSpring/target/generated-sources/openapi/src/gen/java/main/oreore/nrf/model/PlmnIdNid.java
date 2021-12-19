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
 * PlmnIdNid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class PlmnIdNid  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("mcc")
  private String mcc;

  @JsonProperty("mnc")
  private String mnc;

  @JsonProperty("nid")
  private String nid;

  public PlmnIdNid mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * Mobile Country Code part of the PLMN, comprising 3 digits, as defined in clause 9.3.3.5 of 3GPP TS 38.413.
   * @return mcc
  */
  @ApiModelProperty(required = true, value = "Mobile Country Code part of the PLMN, comprising 3 digits, as defined in clause 9.3.3.5 of 3GPP TS 38.413.")
  @NotNull

@Pattern(regexp = "^\\d{3}$") 
  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public PlmnIdNid mnc(String mnc) {
    this.mnc = mnc;
    return this;
  }

  /**
   * Mobile Network Code part of the PLMN, comprising 2 or 3 digits, as defined in clause 9.3.3.5 of 3GPP TS 38.413.
   * @return mnc
  */
  @ApiModelProperty(required = true, value = "Mobile Network Code part of the PLMN, comprising 2 or 3 digits, as defined in clause 9.3.3.5 of 3GPP TS 38.413.")
  @NotNull

@Pattern(regexp = "^\\d{2,3}$") 
  public String getMnc() {
    return mnc;
  }

  public void setMnc(String mnc) {
    this.mnc = mnc;
  }

  public PlmnIdNid nid(String nid) {
    this.nid = nid;
    return this;
  }

  /**
   * This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).
   * @return nid
  */
  @ApiModelProperty(value = "This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).")

@Pattern(regexp = "^[A-Fa-f0-9]{11}$") 
  public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
    this.nid = nid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnIdNid plmnIdNid = (PlmnIdNid) o;
    return Objects.equals(this.mcc, plmnIdNid.mcc) &&
        Objects.equals(this.mnc, plmnIdNid.mnc) &&
        Objects.equals(this.nid, plmnIdNid.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnIdNid {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
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

