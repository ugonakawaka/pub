package aaaa;

import java.util.Objects;
import aaaa.SendMoDataReqData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class InlineObject1   {
  @JsonProperty("jsonData")
  private SendMoDataReqData jsonData;

  @JsonProperty("binaryMoData")
  private org.springframework.web.multipart.MultipartFile binaryMoData;

  public InlineObject1 jsonData(SendMoDataReqData jsonData) {
    this.jsonData = jsonData;
    return this;
  }

  /**
   * Get jsonData
   * @return jsonData
  */
  @ApiModelProperty(value = "")

  @Valid

  public SendMoDataReqData getJsonData() {
    return jsonData;
  }

  public void setJsonData(SendMoDataReqData jsonData) {
    this.jsonData = jsonData;
  }

  public InlineObject1 binaryMoData(org.springframework.web.multipart.MultipartFile binaryMoData) {
    this.binaryMoData = binaryMoData;
    return this;
  }

  /**
   * Get binaryMoData
   * @return binaryMoData
  */
  @ApiModelProperty(value = "")

  @Valid

  public org.springframework.web.multipart.MultipartFile getBinaryMoData() {
    return binaryMoData;
  }

  public void setBinaryMoData(org.springframework.web.multipart.MultipartFile binaryMoData) {
    this.binaryMoData = binaryMoData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(this.jsonData, inlineObject1.jsonData) &&
        Objects.equals(this.binaryMoData, inlineObject1.binaryMoData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonData, binaryMoData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    
    sb.append("    jsonData: ").append(toIndentedString(jsonData)).append("\n");
    sb.append("    binaryMoData: ").append(toIndentedString(binaryMoData)).append("\n");
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
