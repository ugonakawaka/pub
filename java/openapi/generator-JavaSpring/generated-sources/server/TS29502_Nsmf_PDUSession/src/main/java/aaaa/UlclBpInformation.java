package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UL CL or BP Information
 */
@ApiModel(description = "UL CL or BP Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class UlclBpInformation   {
  @JsonProperty("ulclBpUpfId")
  private UUID ulclBpUpfId;

  public UlclBpInformation ulclBpUpfId(UUID ulclBpUpfId) {
    this.ulclBpUpfId = ulclBpUpfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return ulclBpUpfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getUlclBpUpfId() {
    return ulclBpUpfId;
  }

  public void setUlclBpUpfId(UUID ulclBpUpfId) {
    this.ulclBpUpfId = ulclBpUpfId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UlclBpInformation ulclBpInformation = (UlclBpInformation) o;
    return Objects.equals(this.ulclBpUpfId, ulclBpInformation.ulclBpUpfId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ulclBpUpfId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UlclBpInformation {\n");
    
    sb.append("    ulclBpUpfId: ").append(toIndentedString(ulclBpUpfId)).append("\n");
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

