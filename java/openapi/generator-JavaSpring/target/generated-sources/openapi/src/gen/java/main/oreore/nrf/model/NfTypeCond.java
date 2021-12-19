package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oreore.nrf.model.NFType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NFs based on their NF Type
 */
@ApiModel(description = "Subscription to a set of NFs based on their NF Type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NfTypeCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nfType")
  private NFType nfType;

  public NfTypeCond nfType(NFType nfType) {
    this.nfType = nfType;
    return this;
  }

  /**
   * Get nfType
   * @return nfType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NFType getNfType() {
    return nfType;
  }

  public void setNfType(NFType nfType) {
    this.nfType = nfType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfTypeCond nfTypeCond = (NfTypeCond) o;
    return Objects.equals(this.nfType, nfTypeCond.nfType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfTypeCond {\n");
    
    sb.append("    nfType: ").append(toIndentedString(nfType)).append("\n");
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

