package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EPS Bearer Information from H-SMF to V-SMF, or from SMF to I-SMF
 */
@ApiModel(description = "EPS Bearer Information from H-SMF to V-SMF, or from SMF to I-SMF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class EpsBearerInfo   {
  @JsonProperty("ebi")
  private Integer ebi;

  @JsonProperty("pgwS8uFteid")
  private byte[] pgwS8uFteid;

  @JsonProperty("bearerLevelQoS")
  private byte[] bearerLevelQoS;

  public EpsBearerInfo ebi(Integer ebi) {
    this.ebi = ebi;
    return this;
  }

  /**
   * EPS Bearer Identifier
   * minimum: 0
   * maximum: 15
   * @return ebi
  */
  @ApiModelProperty(required = true, value = "EPS Bearer Identifier")
  @NotNull

@Min(0) @Max(15) 
  public Integer getEbi() {
    return ebi;
  }

  public void setEbi(Integer ebi) {
    this.ebi = ebi;
  }

  public EpsBearerInfo pgwS8uFteid(byte[] pgwS8uFteid) {
    this.pgwS8uFteid = pgwS8uFteid;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return pgwS8uFteid
  */
  @ApiModelProperty(required = true, value = "string with format \"bytes\" as defined in OpenAPI")
  @NotNull


  public byte[] getPgwS8uFteid() {
    return pgwS8uFteid;
  }

  public void setPgwS8uFteid(byte[] pgwS8uFteid) {
    this.pgwS8uFteid = pgwS8uFteid;
  }

  public EpsBearerInfo bearerLevelQoS(byte[] bearerLevelQoS) {
    this.bearerLevelQoS = bearerLevelQoS;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return bearerLevelQoS
  */
  @ApiModelProperty(required = true, value = "string with format \"bytes\" as defined in OpenAPI")
  @NotNull


  public byte[] getBearerLevelQoS() {
    return bearerLevelQoS;
  }

  public void setBearerLevelQoS(byte[] bearerLevelQoS) {
    this.bearerLevelQoS = bearerLevelQoS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EpsBearerInfo epsBearerInfo = (EpsBearerInfo) o;
    return Objects.equals(this.ebi, epsBearerInfo.ebi) &&
        Arrays.equals(this.pgwS8uFteid, epsBearerInfo.pgwS8uFteid) &&
        Arrays.equals(this.bearerLevelQoS, epsBearerInfo.bearerLevelQoS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebi, Arrays.hashCode(pgwS8uFteid), Arrays.hashCode(bearerLevelQoS));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpsBearerInfo {\n");
    
    sb.append("    ebi: ").append(toIndentedString(ebi)).append("\n");
    sb.append("    pgwS8uFteid: ").append(toIndentedString(pgwS8uFteid)).append("\n");
    sb.append("    bearerLevelQoS: ").append(toIndentedString(bearerLevelQoS)).append("\n");
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

