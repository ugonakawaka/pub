package aaaa;

import java.util.Objects;
import aaaa.SmContextCreateData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class InlineObject   {
  @JsonProperty("jsonData")
  private SmContextCreateData jsonData;

  @JsonProperty("binaryDataN1SmMessage")
  private org.springframework.web.multipart.MultipartFile binaryDataN1SmMessage;

  @JsonProperty("binaryDataN2SmInformation")
  private org.springframework.web.multipart.MultipartFile binaryDataN2SmInformation;

  @JsonProperty("binaryDataN2SmInformationExt1")
  private org.springframework.web.multipart.MultipartFile binaryDataN2SmInformationExt1;

  public InlineObject jsonData(SmContextCreateData jsonData) {
    this.jsonData = jsonData;
    return this;
  }

  /**
   * Get jsonData
   * @return jsonData
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmContextCreateData getJsonData() {
    return jsonData;
  }

  public void setJsonData(SmContextCreateData jsonData) {
    this.jsonData = jsonData;
  }

  public InlineObject binaryDataN1SmMessage(org.springframework.web.multipart.MultipartFile binaryDataN1SmMessage) {
    this.binaryDataN1SmMessage = binaryDataN1SmMessage;
    return this;
  }

  /**
   * Get binaryDataN1SmMessage
   * @return binaryDataN1SmMessage
  */
  @ApiModelProperty(value = "")

  @Valid

  public org.springframework.web.multipart.MultipartFile getBinaryDataN1SmMessage() {
    return binaryDataN1SmMessage;
  }

  public void setBinaryDataN1SmMessage(org.springframework.web.multipart.MultipartFile binaryDataN1SmMessage) {
    this.binaryDataN1SmMessage = binaryDataN1SmMessage;
  }

  public InlineObject binaryDataN2SmInformation(org.springframework.web.multipart.MultipartFile binaryDataN2SmInformation) {
    this.binaryDataN2SmInformation = binaryDataN2SmInformation;
    return this;
  }

  /**
   * Get binaryDataN2SmInformation
   * @return binaryDataN2SmInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public org.springframework.web.multipart.MultipartFile getBinaryDataN2SmInformation() {
    return binaryDataN2SmInformation;
  }

  public void setBinaryDataN2SmInformation(org.springframework.web.multipart.MultipartFile binaryDataN2SmInformation) {
    this.binaryDataN2SmInformation = binaryDataN2SmInformation;
  }

  public InlineObject binaryDataN2SmInformationExt1(org.springframework.web.multipart.MultipartFile binaryDataN2SmInformationExt1) {
    this.binaryDataN2SmInformationExt1 = binaryDataN2SmInformationExt1;
    return this;
  }

  /**
   * Get binaryDataN2SmInformationExt1
   * @return binaryDataN2SmInformationExt1
  */
  @ApiModelProperty(value = "")

  @Valid

  public org.springframework.web.multipart.MultipartFile getBinaryDataN2SmInformationExt1() {
    return binaryDataN2SmInformationExt1;
  }

  public void setBinaryDataN2SmInformationExt1(org.springframework.web.multipart.MultipartFile binaryDataN2SmInformationExt1) {
    this.binaryDataN2SmInformationExt1 = binaryDataN2SmInformationExt1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.jsonData, inlineObject.jsonData) &&
        Objects.equals(this.binaryDataN1SmMessage, inlineObject.binaryDataN1SmMessage) &&
        Objects.equals(this.binaryDataN2SmInformation, inlineObject.binaryDataN2SmInformation) &&
        Objects.equals(this.binaryDataN2SmInformationExt1, inlineObject.binaryDataN2SmInformationExt1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonData, binaryDataN1SmMessage, binaryDataN2SmInformation, binaryDataN2SmInformationExt1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    jsonData: ").append(toIndentedString(jsonData)).append("\n");
    sb.append("    binaryDataN1SmMessage: ").append(toIndentedString(binaryDataN1SmMessage)).append("\n");
    sb.append("    binaryDataN2SmInformation: ").append(toIndentedString(binaryDataN2SmInformation)).append("\n");
    sb.append("    binaryDataN2SmInformationExt1: ").append(toIndentedString(binaryDataN2SmInformationExt1)).append("\n");
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

