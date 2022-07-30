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
 * Contains a Routing Area Identification as defined in 3GPP TS 23.003, clause 4.2.
 */
@ApiModel(description = "Contains a Routing Area Identification as defined in 3GPP TS 23.003, clause 4.2.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class RoutingAreaId   {
  @JsonProperty("plmnId")
  private PlmnId plmnId;

  @JsonProperty("lac")
  private String lac;

  @JsonProperty("rac")
  private String rac;

  public RoutingAreaId plmnId(PlmnId plmnId) {
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

  public RoutingAreaId lac(String lac) {
    this.lac = lac;
    return this;
  }

  /**
   * Location Area Code
   * @return lac
  */
  @ApiModelProperty(required = true, value = "Location Area Code")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]{4}$") 
  public String getLac() {
    return lac;
  }

  public void setLac(String lac) {
    this.lac = lac;
  }

  public RoutingAreaId rac(String rac) {
    this.rac = rac;
    return this;
  }

  /**
   * Routing Area Code
   * @return rac
  */
  @ApiModelProperty(required = true, value = "Routing Area Code")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]{2}$") 
  public String getRac() {
    return rac;
  }

  public void setRac(String rac) {
    this.rac = rac;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingAreaId routingAreaId = (RoutingAreaId) o;
    return Objects.equals(this.plmnId, routingAreaId.plmnId) &&
        Objects.equals(this.lac, routingAreaId.lac) &&
        Objects.equals(this.rac, routingAreaId.rac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, lac, rac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingAreaId {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    lac: ").append(toIndentedString(lac)).append("\n");
    sb.append("    rac: ").append(toIndentedString(rac)).append("\n");
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

