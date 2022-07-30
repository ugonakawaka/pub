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
 * EPS PDN Connection Information from H-SMF to V-SMF, or from SMF to I-SMF
 */
@ApiModel(description = "EPS PDN Connection Information from H-SMF to V-SMF, or from SMF to I-SMF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class EpsPdnCnxInfo   {
  @JsonProperty("pgwS8cFteid")
  private byte[] pgwS8cFteid;

  @JsonProperty("pgwNodeName")
  private byte[] pgwNodeName;

  @JsonProperty("linkedBearerId")
  private Integer linkedBearerId;

  public EpsPdnCnxInfo pgwS8cFteid(byte[] pgwS8cFteid) {
    this.pgwS8cFteid = pgwS8cFteid;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return pgwS8cFteid
  */
  @ApiModelProperty(required = true, value = "string with format \"bytes\" as defined in OpenAPI")
  @NotNull


  public byte[] getPgwS8cFteid() {
    return pgwS8cFteid;
  }

  public void setPgwS8cFteid(byte[] pgwS8cFteid) {
    this.pgwS8cFteid = pgwS8cFteid;
  }

  public EpsPdnCnxInfo pgwNodeName(byte[] pgwNodeName) {
    this.pgwNodeName = pgwNodeName;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return pgwNodeName
  */
  @ApiModelProperty(value = "string with format \"bytes\" as defined in OpenAPI")


  public byte[] getPgwNodeName() {
    return pgwNodeName;
  }

  public void setPgwNodeName(byte[] pgwNodeName) {
    this.pgwNodeName = pgwNodeName;
  }

  public EpsPdnCnxInfo linkedBearerId(Integer linkedBearerId) {
    this.linkedBearerId = linkedBearerId;
    return this;
  }

  /**
   * EPS Bearer Identifier
   * minimum: 0
   * maximum: 15
   * @return linkedBearerId
  */
  @ApiModelProperty(value = "EPS Bearer Identifier")

@Min(0) @Max(15) 
  public Integer getLinkedBearerId() {
    return linkedBearerId;
  }

  public void setLinkedBearerId(Integer linkedBearerId) {
    this.linkedBearerId = linkedBearerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EpsPdnCnxInfo epsPdnCnxInfo = (EpsPdnCnxInfo) o;
    return Arrays.equals(this.pgwS8cFteid, epsPdnCnxInfo.pgwS8cFteid) &&
        Arrays.equals(this.pgwNodeName, epsPdnCnxInfo.pgwNodeName) &&
        Objects.equals(this.linkedBearerId, epsPdnCnxInfo.linkedBearerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(pgwS8cFteid), Arrays.hashCode(pgwNodeName), linkedBearerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpsPdnCnxInfo {\n");
    
    sb.append("    pgwS8cFteid: ").append(toIndentedString(pgwS8cFteid)).append("\n");
    sb.append("    pgwNodeName: ").append(toIndentedString(pgwNodeName)).append("\n");
    sb.append("    linkedBearerId: ").append(toIndentedString(linkedBearerId)).append("\n");
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

