package aaaa;

import java.util.Objects;
import aaaa.Rsn;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Redundant PDU Session Information
 */
@ApiModel(description = "Redundant PDU Session Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class RedundantPduSessionInformation   {
  @JsonProperty("rsn")
  private Rsn rsn;

  @JsonProperty("pduSessionPairId")
  private Integer pduSessionPairId;

  public RedundantPduSessionInformation rsn(Rsn rsn) {
    this.rsn = rsn;
    return this;
  }

  /**
   * Get rsn
   * @return rsn
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Rsn getRsn() {
    return rsn;
  }

  public void setRsn(Rsn rsn) {
    this.rsn = rsn;
  }

  public RedundantPduSessionInformation pduSessionPairId(Integer pduSessionPairId) {
    this.pduSessionPairId = pduSessionPairId;
    return this;
  }

  /**
   * Get pduSessionPairId
   * minimum: 0
   * maximum: 255
   * @return pduSessionPairId
  */
  @ApiModelProperty(value = "")

@Min(0) @Max(255) 
  public Integer getPduSessionPairId() {
    return pduSessionPairId;
  }

  public void setPduSessionPairId(Integer pduSessionPairId) {
    this.pduSessionPairId = pduSessionPairId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedundantPduSessionInformation redundantPduSessionInformation = (RedundantPduSessionInformation) o;
    return Objects.equals(this.rsn, redundantPduSessionInformation.rsn) &&
        Objects.equals(this.pduSessionPairId, redundantPduSessionInformation.pduSessionPairId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rsn, pduSessionPairId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedundantPduSessionInformation {\n");
    
    sb.append("    rsn: ").append(toIndentedString(rsn)).append("\n");
    sb.append("    pduSessionPairId: ").append(toIndentedString(pduSessionPairId)).append("\n");
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

