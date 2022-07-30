package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Exemption Indication
 */
@ApiModel(description = "Exemption Indication")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class ExemptionInd   {
  @JsonProperty("dnnCongestion")
  private Boolean dnnCongestion = false;

  @JsonProperty("snssaiOnlyCongestion")
  private Boolean snssaiOnlyCongestion = false;

  @JsonProperty("snssaiDnnCongestion")
  private Boolean snssaiDnnCongestion = false;

  public ExemptionInd dnnCongestion(Boolean dnnCongestion) {
    this.dnnCongestion = dnnCongestion;
    return this;
  }

  /**
   * Get dnnCongestion
   * @return dnnCongestion
  */
  @ApiModelProperty(value = "")


  public Boolean getDnnCongestion() {
    return dnnCongestion;
  }

  public void setDnnCongestion(Boolean dnnCongestion) {
    this.dnnCongestion = dnnCongestion;
  }

  public ExemptionInd snssaiOnlyCongestion(Boolean snssaiOnlyCongestion) {
    this.snssaiOnlyCongestion = snssaiOnlyCongestion;
    return this;
  }

  /**
   * Get snssaiOnlyCongestion
   * @return snssaiOnlyCongestion
  */
  @ApiModelProperty(value = "")


  public Boolean getSnssaiOnlyCongestion() {
    return snssaiOnlyCongestion;
  }

  public void setSnssaiOnlyCongestion(Boolean snssaiOnlyCongestion) {
    this.snssaiOnlyCongestion = snssaiOnlyCongestion;
  }

  public ExemptionInd snssaiDnnCongestion(Boolean snssaiDnnCongestion) {
    this.snssaiDnnCongestion = snssaiDnnCongestion;
    return this;
  }

  /**
   * Get snssaiDnnCongestion
   * @return snssaiDnnCongestion
  */
  @ApiModelProperty(value = "")


  public Boolean getSnssaiDnnCongestion() {
    return snssaiDnnCongestion;
  }

  public void setSnssaiDnnCongestion(Boolean snssaiDnnCongestion) {
    this.snssaiDnnCongestion = snssaiDnnCongestion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExemptionInd exemptionInd = (ExemptionInd) o;
    return Objects.equals(this.dnnCongestion, exemptionInd.dnnCongestion) &&
        Objects.equals(this.snssaiOnlyCongestion, exemptionInd.snssaiOnlyCongestion) &&
        Objects.equals(this.snssaiDnnCongestion, exemptionInd.snssaiDnnCongestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnnCongestion, snssaiOnlyCongestion, snssaiDnnCongestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExemptionInd {\n");
    
    sb.append("    dnnCongestion: ").append(toIndentedString(dnnCongestion)).append("\n");
    sb.append("    snssaiOnlyCongestion: ").append(toIndentedString(snssaiOnlyCongestion)).append("\n");
    sb.append("    snssaiDnnCongestion: ").append(toIndentedString(snssaiDnnCongestion)).append("\n");
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

