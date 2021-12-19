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
 * When PlmnId needs to be converted to string (e.g. when used in maps as key), the string shall be composed of three digits \&quot;mcc\&quot; followed by \&quot;-\&quot; and two or three digits \&quot;mnc\&quot;.
 */
@ApiModel(description = "When PlmnId needs to be converted to string (e.g. when used in maps as key), the string shall be composed of three digits \"mcc\" followed by \"-\" and two or three digits \"mnc\".")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class PlmnId  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("mcc")
  private String mcc;

  @JsonProperty("mnc")
  private String mnc;

  public PlmnId mcc(String mcc) {
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

  public PlmnId mnc(String mnc) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnId plmnId = (PlmnId) o;
    return Objects.equals(this.mcc, plmnId.mcc) &&
        Objects.equals(this.mnc, plmnId.mnc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnId {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
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

