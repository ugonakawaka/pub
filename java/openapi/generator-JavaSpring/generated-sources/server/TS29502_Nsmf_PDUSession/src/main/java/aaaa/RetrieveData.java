package aaaa;

import java.util.Objects;
import aaaa.PduSessionContextType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Retrieve Request
 */
@ApiModel(description = "Data within Retrieve Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class RetrieveData   {
  @JsonProperty("smallDataRateStatusReq")
  private Boolean smallDataRateStatusReq = false;

  @JsonProperty("pduSessionContextType")
  private PduSessionContextType pduSessionContextType;

  public RetrieveData smallDataRateStatusReq(Boolean smallDataRateStatusReq) {
    this.smallDataRateStatusReq = smallDataRateStatusReq;
    return this;
  }

  /**
   * Get smallDataRateStatusReq
   * @return smallDataRateStatusReq
  */
  @ApiModelProperty(value = "")


  public Boolean getSmallDataRateStatusReq() {
    return smallDataRateStatusReq;
  }

  public void setSmallDataRateStatusReq(Boolean smallDataRateStatusReq) {
    this.smallDataRateStatusReq = smallDataRateStatusReq;
  }

  public RetrieveData pduSessionContextType(PduSessionContextType pduSessionContextType) {
    this.pduSessionContextType = pduSessionContextType;
    return this;
  }

  /**
   * Get pduSessionContextType
   * @return pduSessionContextType
  */
  @ApiModelProperty(value = "")

  @Valid

  public PduSessionContextType getPduSessionContextType() {
    return pduSessionContextType;
  }

  public void setPduSessionContextType(PduSessionContextType pduSessionContextType) {
    this.pduSessionContextType = pduSessionContextType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveData retrieveData = (RetrieveData) o;
    return Objects.equals(this.smallDataRateStatusReq, retrieveData.smallDataRateStatusReq) &&
        Objects.equals(this.pduSessionContextType, retrieveData.pduSessionContextType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallDataRateStatusReq, pduSessionContextType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveData {\n");
    
    sb.append("    smallDataRateStatusReq: ").append(toIndentedString(smallDataRateStatusReq)).append("\n");
    sb.append("    pduSessionContextType: ").append(toIndentedString(pduSessionContextType)).append("\n");
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

