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
 * DNAI Information
 */
@ApiModel(description = "DNAI Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class DnaiInformation   {
  @JsonProperty("dnai")
  private String dnai;

  @JsonProperty("noDnaiChangeInd")
  private Boolean noDnaiChangeInd;

  @JsonProperty("noLocalPsaChangeInd")
  private Boolean noLocalPsaChangeInd;

  public DnaiInformation dnai(String dnai) {
    this.dnai = dnai;
    return this;
  }

  /**
   * DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.
   * @return dnai
  */
  @ApiModelProperty(required = true, value = "DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.")
  @NotNull


  public String getDnai() {
    return dnai;
  }

  public void setDnai(String dnai) {
    this.dnai = dnai;
  }

  public DnaiInformation noDnaiChangeInd(Boolean noDnaiChangeInd) {
    this.noDnaiChangeInd = noDnaiChangeInd;
    return this;
  }

  /**
   * Get noDnaiChangeInd
   * @return noDnaiChangeInd
  */
  @ApiModelProperty(value = "")


  public Boolean getNoDnaiChangeInd() {
    return noDnaiChangeInd;
  }

  public void setNoDnaiChangeInd(Boolean noDnaiChangeInd) {
    this.noDnaiChangeInd = noDnaiChangeInd;
  }

  public DnaiInformation noLocalPsaChangeInd(Boolean noLocalPsaChangeInd) {
    this.noLocalPsaChangeInd = noLocalPsaChangeInd;
    return this;
  }

  /**
   * Get noLocalPsaChangeInd
   * @return noLocalPsaChangeInd
  */
  @ApiModelProperty(value = "")


  public Boolean getNoLocalPsaChangeInd() {
    return noLocalPsaChangeInd;
  }

  public void setNoLocalPsaChangeInd(Boolean noLocalPsaChangeInd) {
    this.noLocalPsaChangeInd = noLocalPsaChangeInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnaiInformation dnaiInformation = (DnaiInformation) o;
    return Objects.equals(this.dnai, dnaiInformation.dnai) &&
        Objects.equals(this.noDnaiChangeInd, dnaiInformation.noDnaiChangeInd) &&
        Objects.equals(this.noLocalPsaChangeInd, dnaiInformation.noLocalPsaChangeInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnai, noDnaiChangeInd, noLocalPsaChangeInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnaiInformation {\n");
    
    sb.append("    dnai: ").append(toIndentedString(dnai)).append("\n");
    sb.append("    noDnaiChangeInd: ").append(toIndentedString(noDnaiChangeInd)).append("\n");
    sb.append("    noLocalPsaChangeInd: ").append(toIndentedString(noLocalPsaChangeInd)).append("\n");
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

