package aaaa;

import java.util.Objects;
import aaaa.TransferMtDataReqData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class InlineObject3   {
  @JsonProperty("jsonData")
  private TransferMtDataReqData jsonData;

  @JsonProperty("binaryMtData")
  private org.springframework.web.multipart.MultipartFile binaryMtData;

  public InlineObject3 jsonData(TransferMtDataReqData jsonData) {
    this.jsonData = jsonData;
    return this;
  }

  /**
   * Get jsonData
   * @return jsonData
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransferMtDataReqData getJsonData() {
    return jsonData;
  }

  public void setJsonData(TransferMtDataReqData jsonData) {
    this.jsonData = jsonData;
  }

  public InlineObject3 binaryMtData(org.springframework.web.multipart.MultipartFile binaryMtData) {
    this.binaryMtData = binaryMtData;
    return this;
  }

  /**
   * Get binaryMtData
   * @return binaryMtData
  */
  @ApiModelProperty(value = "")

  @Valid

  public org.springframework.web.multipart.MultipartFile getBinaryMtData() {
    return binaryMtData;
  }

  public void setBinaryMtData(org.springframework.web.multipart.MultipartFile binaryMtData) {
    this.binaryMtData = binaryMtData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject3 inlineObject3 = (InlineObject3) o;
    return Objects.equals(this.jsonData, inlineObject3.jsonData) &&
        Objects.equals(this.binaryMtData, inlineObject3.binaryMtData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonData, binaryMtData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    
    sb.append("    jsonData: ").append(toIndentedString(jsonData)).append("\n");
    sb.append("    binaryMtData: ").append(toIndentedString(binaryMtData)).append("\n");
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

