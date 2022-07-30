package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the PCF for the UE information necessary for the PCF for the PDU session to send SM Policy Association Establishment and Termination events.
 */
@ApiModel(description = "Contains the PCF for the UE information necessary for the PCF for the PDU session to send SM Policy Association Establishment and Termination events.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class PcfUeCallbackInfo   {
  @JsonProperty("callbackUri")
  private String callbackUri;

  @JsonProperty("bindingInfo")
  private String bindingInfo;

  public PcfUeCallbackInfo callbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return callbackUri
  */
  @ApiModelProperty(required = true, value = "String providing an URI formatted according to RFC 3986")
  @NotNull


  public String getCallbackUri() {
    return callbackUri;
  }

  public void setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
  }

  public PcfUeCallbackInfo bindingInfo(String bindingInfo) {
    this.bindingInfo = bindingInfo;
    return this;
  }

  /**
   * Get bindingInfo
   * @return bindingInfo
  */
  @ApiModelProperty(value = "")


  public String getBindingInfo() {
    return bindingInfo;
  }

  public void setBindingInfo(String bindingInfo) {
    this.bindingInfo = bindingInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PcfUeCallbackInfo pcfUeCallbackInfo = (PcfUeCallbackInfo) o;
    return Objects.equals(this.callbackUri, pcfUeCallbackInfo.callbackUri) &&
        Objects.equals(this.bindingInfo, pcfUeCallbackInfo.bindingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUri, bindingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PcfUeCallbackInfo {\n");
    
    sb.append("    callbackUri: ").append(toIndentedString(callbackUri)).append("\n");
    sb.append("    bindingInfo: ").append(toIndentedString(bindingInfo)).append("\n");
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

