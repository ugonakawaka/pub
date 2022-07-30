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
 * MME capabilities
 */
@ApiModel(description = "MME capabilities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class MmeCapabilities   {
  @JsonProperty("nonIpSupported")
  private Boolean nonIpSupported = false;

  @JsonProperty("ethernetSupported")
  private Boolean ethernetSupported = false;

  @JsonProperty("upipSupported")
  private Boolean upipSupported = false;

  public MmeCapabilities nonIpSupported(Boolean nonIpSupported) {
    this.nonIpSupported = nonIpSupported;
    return this;
  }

  /**
   * Get nonIpSupported
   * @return nonIpSupported
  */
  @ApiModelProperty(value = "")


  public Boolean getNonIpSupported() {
    return nonIpSupported;
  }

  public void setNonIpSupported(Boolean nonIpSupported) {
    this.nonIpSupported = nonIpSupported;
  }

  public MmeCapabilities ethernetSupported(Boolean ethernetSupported) {
    this.ethernetSupported = ethernetSupported;
    return this;
  }

  /**
   * Get ethernetSupported
   * @return ethernetSupported
  */
  @ApiModelProperty(value = "")


  public Boolean getEthernetSupported() {
    return ethernetSupported;
  }

  public void setEthernetSupported(Boolean ethernetSupported) {
    this.ethernetSupported = ethernetSupported;
  }

  public MmeCapabilities upipSupported(Boolean upipSupported) {
    this.upipSupported = upipSupported;
    return this;
  }

  /**
   * Get upipSupported
   * @return upipSupported
  */
  @ApiModelProperty(value = "")


  public Boolean getUpipSupported() {
    return upipSupported;
  }

  public void setUpipSupported(Boolean upipSupported) {
    this.upipSupported = upipSupported;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MmeCapabilities mmeCapabilities = (MmeCapabilities) o;
    return Objects.equals(this.nonIpSupported, mmeCapabilities.nonIpSupported) &&
        Objects.equals(this.ethernetSupported, mmeCapabilities.ethernetSupported) &&
        Objects.equals(this.upipSupported, mmeCapabilities.upipSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonIpSupported, ethernetSupported, upipSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MmeCapabilities {\n");
    
    sb.append("    nonIpSupported: ").append(toIndentedString(nonIpSupported)).append("\n");
    sb.append("    ethernetSupported: ").append(toIndentedString(ethernetSupported)).append("\n");
    sb.append("    upipSupported: ").append(toIndentedString(upipSupported)).append("\n");
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

