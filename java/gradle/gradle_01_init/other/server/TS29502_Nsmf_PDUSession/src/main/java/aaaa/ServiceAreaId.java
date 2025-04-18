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
 * Contains a Service Area Identifier as defined in 3GPP TS 23.003, clause 12.5.
 */
@ApiModel(description = "Contains a Service Area Identifier as defined in 3GPP TS 23.003, clause 12.5.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class ServiceAreaId   {
  @JsonProperty("plmnId")
  private PlmnId plmnId;

  @JsonProperty("lac")
  private String lac;

  @JsonProperty("sac")
  private String sac;

  public ServiceAreaId plmnId(PlmnId plmnId) {
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

  public ServiceAreaId lac(String lac) {
    this.lac = lac;
    return this;
  }

  /**
   * Location Area Code.
   * @return lac
  */
  @ApiModelProperty(required = true, value = "Location Area Code.")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]{4}$") 
  public String getLac() {
    return lac;
  }

  public void setLac(String lac) {
    this.lac = lac;
  }

  public ServiceAreaId sac(String sac) {
    this.sac = sac;
    return this;
  }

  /**
   * Service Area Code.
   * @return sac
  */
  @ApiModelProperty(required = true, value = "Service Area Code.")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]{4}$") 
  public String getSac() {
    return sac;
  }

  public void setSac(String sac) {
    this.sac = sac;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAreaId serviceAreaId = (ServiceAreaId) o;
    return Objects.equals(this.plmnId, serviceAreaId.plmnId) &&
        Objects.equals(this.lac, serviceAreaId.lac) &&
        Objects.equals(this.sac, serviceAreaId.sac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, lac, sac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAreaId {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    lac: ").append(toIndentedString(lac)).append("\n");
    sb.append("    sac: ").append(toIndentedString(sac)).append("\n");
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

