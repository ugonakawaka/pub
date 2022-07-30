package aaaa;

import java.util.Objects;
import aaaa.DnaiInformation;
import aaaa.N4MessageType;
import aaaa.RefToBinaryData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * N4 Information
 */
@ApiModel(description = "N4 Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class N4Information   {
  @JsonProperty("n4MessageType")
  private N4MessageType n4MessageType;

  @JsonProperty("n4MessagePayload")
  private RefToBinaryData n4MessagePayload;

  @JsonProperty("n4DnaiInfo")
  private DnaiInformation n4DnaiInfo;

  @JsonProperty("psaUpfId")
  private UUID psaUpfId;

  public N4Information n4MessageType(N4MessageType n4MessageType) {
    this.n4MessageType = n4MessageType;
    return this;
  }

  /**
   * Get n4MessageType
   * @return n4MessageType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public N4MessageType getN4MessageType() {
    return n4MessageType;
  }

  public void setN4MessageType(N4MessageType n4MessageType) {
    this.n4MessageType = n4MessageType;
  }

  public N4Information n4MessagePayload(RefToBinaryData n4MessagePayload) {
    this.n4MessagePayload = n4MessagePayload;
    return this;
  }

  /**
   * Get n4MessagePayload
   * @return n4MessagePayload
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RefToBinaryData getN4MessagePayload() {
    return n4MessagePayload;
  }

  public void setN4MessagePayload(RefToBinaryData n4MessagePayload) {
    this.n4MessagePayload = n4MessagePayload;
  }

  public N4Information n4DnaiInfo(DnaiInformation n4DnaiInfo) {
    this.n4DnaiInfo = n4DnaiInfo;
    return this;
  }

  /**
   * Get n4DnaiInfo
   * @return n4DnaiInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DnaiInformation getN4DnaiInfo() {
    return n4DnaiInfo;
  }

  public void setN4DnaiInfo(DnaiInformation n4DnaiInfo) {
    this.n4DnaiInfo = n4DnaiInfo;
  }

  public N4Information psaUpfId(UUID psaUpfId) {
    this.psaUpfId = psaUpfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return psaUpfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getPsaUpfId() {
    return psaUpfId;
  }

  public void setPsaUpfId(UUID psaUpfId) {
    this.psaUpfId = psaUpfId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    N4Information n4Information = (N4Information) o;
    return Objects.equals(this.n4MessageType, n4Information.n4MessageType) &&
        Objects.equals(this.n4MessagePayload, n4Information.n4MessagePayload) &&
        Objects.equals(this.n4DnaiInfo, n4Information.n4DnaiInfo) &&
        Objects.equals(this.psaUpfId, n4Information.psaUpfId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(n4MessageType, n4MessagePayload, n4DnaiInfo, psaUpfId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class N4Information {\n");
    
    sb.append("    n4MessageType: ").append(toIndentedString(n4MessageType)).append("\n");
    sb.append("    n4MessagePayload: ").append(toIndentedString(n4MessagePayload)).append("\n");
    sb.append("    n4DnaiInfo: ").append(toIndentedString(n4DnaiInfo)).append("\n");
    sb.append("    psaUpfId: ").append(toIndentedString(psaUpfId)).append("\n");
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

