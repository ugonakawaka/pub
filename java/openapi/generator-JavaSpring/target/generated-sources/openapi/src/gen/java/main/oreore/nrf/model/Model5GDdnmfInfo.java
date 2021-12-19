package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oreore.nrf.model.PlmnId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an 5G DDNMF NF Instance
 */
@ApiModel(description = "Information of an 5G DDNMF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class Model5GDdnmfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("plmnId")
  private PlmnId plmnId;

  public Model5GDdnmfInfo plmnId(PlmnId plmnId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model5GDdnmfInfo _5gDdnmfInfo = (Model5GDdnmfInfo) o;
    return Objects.equals(this.plmnId, _5gDdnmfInfo.plmnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model5GDdnmfInfo {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
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

