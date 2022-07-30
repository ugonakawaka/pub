package aaaa;

import java.util.Objects;
import aaaa.AccessType;
import aaaa.Cause;
import aaaa.CnAssistedRanPara;
import aaaa.ResourceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Status of SM context or of PDU session
 */
@ApiModel(description = "Status of SM context or of PDU session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class StatusInfo   {
  @JsonProperty("resourceStatus")
  private ResourceStatus resourceStatus;

  @JsonProperty("cause")
  private Cause cause;

  @JsonProperty("cnAssistedRanPara")
  private CnAssistedRanPara cnAssistedRanPara;

  @JsonProperty("anType")
  private AccessType anType;

  public StatusInfo resourceStatus(ResourceStatus resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

  /**
   * Get resourceStatus
   * @return resourceStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResourceStatus getResourceStatus() {
    return resourceStatus;
  }

  public void setResourceStatus(ResourceStatus resourceStatus) {
    this.resourceStatus = resourceStatus;
  }

  public StatusInfo cause(Cause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @ApiModelProperty(value = "")

  @Valid

  public Cause getCause() {
    return cause;
  }

  public void setCause(Cause cause) {
    this.cause = cause;
  }

  public StatusInfo cnAssistedRanPara(CnAssistedRanPara cnAssistedRanPara) {
    this.cnAssistedRanPara = cnAssistedRanPara;
    return this;
  }

  /**
   * Get cnAssistedRanPara
   * @return cnAssistedRanPara
  */
  @ApiModelProperty(value = "")

  @Valid

  public CnAssistedRanPara getCnAssistedRanPara() {
    return cnAssistedRanPara;
  }

  public void setCnAssistedRanPara(CnAssistedRanPara cnAssistedRanPara) {
    this.cnAssistedRanPara = cnAssistedRanPara;
  }

  public StatusInfo anType(AccessType anType) {
    this.anType = anType;
    return this;
  }

  /**
   * Get anType
   * @return anType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessType getAnType() {
    return anType;
  }

  public void setAnType(AccessType anType) {
    this.anType = anType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusInfo statusInfo = (StatusInfo) o;
    return Objects.equals(this.resourceStatus, statusInfo.resourceStatus) &&
        Objects.equals(this.cause, statusInfo.cause) &&
        Objects.equals(this.cnAssistedRanPara, statusInfo.cnAssistedRanPara) &&
        Objects.equals(this.anType, statusInfo.anType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceStatus, cause, cnAssistedRanPara, anType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusInfo {\n");
    
    sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    cnAssistedRanPara: ").append(toIndentedString(cnAssistedRanPara)).append("\n");
    sb.append("    anType: ").append(toIndentedString(anType)).append("\n");
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

