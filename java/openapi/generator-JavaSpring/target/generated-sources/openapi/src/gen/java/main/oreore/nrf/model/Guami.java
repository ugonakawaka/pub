package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oreore.nrf.model.PlmnIdNid;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Globally Unique AMF Identifier constructed out of PLMN, Network and AMF identity.
 */
@ApiModel(description = "Globally Unique AMF Identifier constructed out of PLMN, Network and AMF identity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class Guami  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("plmnId")
  private PlmnIdNid plmnId;

  @JsonProperty("amfId")
  private String amfId;

  public Guami plmnId(PlmnIdNid plmnId) {
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

  public PlmnIdNid getPlmnId() {
    return plmnId;
  }

  public void setPlmnId(PlmnIdNid plmnId) {
    this.plmnId = plmnId;
  }

  public Guami amfId(String amfId) {
    this.amfId = amfId;
    return this;
  }

  /**
   * String identifying the AMF ID composed of AMF Region ID (8 bits), AMF Set ID (10 bits) and AMF Pointer (6 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 6 hexadecimal characters (i.e., 24 bits)
   * @return amfId
  */
  @ApiModelProperty(required = true, value = "String identifying the AMF ID composed of AMF Region ID (8 bits), AMF Set ID (10 bits) and AMF Pointer (6 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 6 hexadecimal characters (i.e., 24 bits)")
  @NotNull

@Pattern(regexp = "^[A-Fa-f0-9]{6}$") 
  public String getAmfId() {
    return amfId;
  }

  public void setAmfId(String amfId) {
    this.amfId = amfId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guami guami = (Guami) o;
    return Objects.equals(this.plmnId, guami.plmnId) &&
        Objects.equals(this.amfId, guami.amfId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, amfId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guami {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    amfId: ").append(toIndentedString(amfId)).append("\n");
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

