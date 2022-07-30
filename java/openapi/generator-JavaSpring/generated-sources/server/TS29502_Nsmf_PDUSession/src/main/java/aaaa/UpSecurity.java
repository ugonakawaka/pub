package aaaa;

import java.util.Objects;
import aaaa.UpConfidentiality;
import aaaa.UpIntegrity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains Userplain security information.
 */
@ApiModel(description = "Contains Userplain security information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class UpSecurity   {
  @JsonProperty("upIntegr")
  private UpIntegrity upIntegr;

  @JsonProperty("upConfid")
  private UpConfidentiality upConfid;

  public UpSecurity upIntegr(UpIntegrity upIntegr) {
    this.upIntegr = upIntegr;
    return this;
  }

  /**
   * Get upIntegr
   * @return upIntegr
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UpIntegrity getUpIntegr() {
    return upIntegr;
  }

  public void setUpIntegr(UpIntegrity upIntegr) {
    this.upIntegr = upIntegr;
  }

  public UpSecurity upConfid(UpConfidentiality upConfid) {
    this.upConfid = upConfid;
    return this;
  }

  /**
   * Get upConfid
   * @return upConfid
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UpConfidentiality getUpConfid() {
    return upConfid;
  }

  public void setUpConfid(UpConfidentiality upConfid) {
    this.upConfid = upConfid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpSecurity upSecurity = (UpSecurity) o;
    return Objects.equals(this.upIntegr, upSecurity.upIntegr) &&
        Objects.equals(this.upConfid, upSecurity.upConfid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upIntegr, upConfid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpSecurity {\n");
    
    sb.append("    upIntegr: ").append(toIndentedString(upIntegr)).append("\n");
    sb.append("    upConfid: ").append(toIndentedString(upConfid)).append("\n");
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

