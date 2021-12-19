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
 * Subscription to a set of AMFs, based on AMF Set Id and/or AMF Region Id
 */
@ApiModel(description = "Subscription to a set of AMFs, based on AMF Set Id and/or AMF Region Id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class AmfCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amfSetId")
  private String amfSetId;

  @JsonProperty("amfRegionId")
  private String amfRegionId;

  public AmfCond amfSetId(String amfSetId) {
    this.amfSetId = amfSetId;
    return this;
  }

  /**
   * String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)
   * @return amfSetId
  */
  @ApiModelProperty(value = "String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)")

@Pattern(regexp = "^[0-3][A-Fa-f0-9]{2}$") 
  public String getAmfSetId() {
    return amfSetId;
  }

  public void setAmfSetId(String amfSetId) {
    this.amfSetId = amfSetId;
  }

  public AmfCond amfRegionId(String amfRegionId) {
    this.amfRegionId = amfRegionId;
    return this;
  }

  /**
   * String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)
   * @return amfRegionId
  */
  @ApiModelProperty(value = "String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)")

@Pattern(regexp = "^[A-Fa-f0-9]{2}$") 
  public String getAmfRegionId() {
    return amfRegionId;
  }

  public void setAmfRegionId(String amfRegionId) {
    this.amfRegionId = amfRegionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmfCond amfCond = (AmfCond) o;
    return Objects.equals(this.amfSetId, amfCond.amfSetId) &&
        Objects.equals(this.amfRegionId, amfCond.amfRegionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amfSetId, amfRegionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmfCond {\n");
    
    sb.append("    amfSetId: ").append(toIndentedString(amfSetId)).append("\n");
    sb.append("    amfRegionId: ").append(toIndentedString(amfRegionId)).append("\n");
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

