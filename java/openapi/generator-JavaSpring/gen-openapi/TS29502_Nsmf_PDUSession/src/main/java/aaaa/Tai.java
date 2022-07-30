package aaaa;

import java.util.Objects;
import aaaa.PlmnId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the tracking area identity as described in 3GPP 23.003
 */
@ApiModel(description = "Contains the tracking area identity as described in 3GPP 23.003")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class Tai   {
  @JsonProperty("plmnId")
  private PlmnId plmnId;

  @JsonProperty("tac")
  private String tac;

  @JsonProperty("nid")
  private String nid;

  public Tai plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }

  /**
   * Get plmnId
   * @return plmnId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PlmnId getPlmnId() {
    return plmnId;
  }

  public void setPlmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
  }

  public Tai tac(String tac) {
    this.tac = tac;
    return this;
  }

  /**
   * 2 or 3-octet string identifying a tracking area code as specified in clause 9.3.3.10 of 3GPP TS 38.413, in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the TAC shall appear first in the string, and the character representing the 4 least significant bit of the TAC shall appear last in the string.
   * @return tac
  */
  @ApiModelProperty(required = true, value = "2 or 3-octet string identifying a tracking area code as specified in clause 9.3.3.10 of 3GPP TS 38.413, in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the TAC shall appear first in the string, and the character representing the 4 least significant bit of the TAC shall appear last in the string.")
  @NotNull

@Pattern(regexp="(^[A-Fa-f0-9]{4}$)|(^[A-Fa-f0-9]{6}$)") 
  public String getTac() {
    return tac;
  }

  public void setTac(String tac) {
    this.tac = tac;
  }

  public Tai nid(String nid) {
    this.nid = nid;
    return this;
  }

  /**
   * This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).
   * @return nid
  */
  @ApiModelProperty(value = "This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).")

@Pattern(regexp="^[A-Fa-f0-9]{11}$") 
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
    Tai tai = (Tai) o;
    return Objects.equals(this.plmnId, tai.plmnId) &&
        Objects.equals(this.tac, tai.tac) &&
        Objects.equals(this.nid, tai.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, tac, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tai {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    tac: ").append(toIndentedString(tac)).append("\n");
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

