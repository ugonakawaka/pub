package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a given NF Instance Id
 */
@ApiModel(description = "Subscription to a given NF Instance Id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NfInstanceIdCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nfInstanceId")
  private UUID nfInstanceId;

  public NfInstanceIdCond nfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return nfInstanceId
  */
  @ApiModelProperty(required = true, value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")
  @NotNull

  @Valid

  public UUID getNfInstanceId() {
    return nfInstanceId;
  }

  public void setNfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfInstanceIdCond nfInstanceIdCond = (NfInstanceIdCond) o;
    return Objects.equals(this.nfInstanceId, nfInstanceIdCond.nfInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfInstanceIdCond {\n");
    
    sb.append("    nfInstanceId: ").append(toIndentedString(nfInstanceId)).append("\n");
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

