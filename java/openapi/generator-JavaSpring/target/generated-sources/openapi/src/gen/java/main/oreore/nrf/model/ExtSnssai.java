package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.SdRange;
import oreore.nrf.model.Snssai;
import oreore.nrf.model.SnssaiExtension;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * The sdRanges and wildcardSd attributes shall be exclusive from each other. If one of these attributes is present, the sd attribute shall also be present and it shall contain one Slice Differentiator value within the range of SD (if the sdRanges attribute is present) or with any value (if the wildcardSd attribute is present).
 */
@ApiModel(description = "The sdRanges and wildcardSd attributes shall be exclusive from each other. If one of these attributes is present, the sd attribute shall also be present and it shall contain one Slice Differentiator value within the range of SD (if the sdRanges attribute is present) or with any value (if the wildcardSd attribute is present).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class ExtSnssai  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sst")
  private Integer sst;

  @JsonProperty("sd")
  private String sd;

  @JsonProperty("sdRanges")
  @Valid
  private List<SdRange> sdRanges = null;

  @JsonProperty("wildcardSd")
  private Boolean wildcardSd = false;

  public ExtSnssai sst(Integer sst) {
    this.sst = sst;
    return this;
  }

  /**
   * Unsigned integer, within the range 0 to 255, representing the Slice/Service Type. It indicates the expected Network Slice behaviour in terms of features and services.  Values 0 to 127 correspond to the standardized SST range. Values 128 to 255 correspond to the Operator-specific range. See clause 28.4.2 of 3GPP TS 23.003.  Standardized values are defined in clause 5.15.2.2 of 3GPP TS 23.501. 
   * minimum: 0
   * maximum: 255
   * @return sst
  */
  @ApiModelProperty(required = true, value = "Unsigned integer, within the range 0 to 255, representing the Slice/Service Type. It indicates the expected Network Slice behaviour in terms of features and services.  Values 0 to 127 correspond to the standardized SST range. Values 128 to 255 correspond to the Operator-specific range. See clause 28.4.2 of 3GPP TS 23.003.  Standardized values are defined in clause 5.15.2.2 of 3GPP TS 23.501. ")
  @NotNull

@Min(0) @Max(255) 
  public Integer getSst() {
    return sst;
  }

  public void setSst(Integer sst) {
    this.sst = sst;
  }

  public ExtSnssai sd(String sd) {
    this.sd = sd;
    return this;
  }

  /**
   * 3-octet string, representing the Slice Differentiator, in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the SD shall appear first in the string, and the character representing the 4 least significant bit of the SD shall appear last in the string.  This is an optional parameter that complements the Slice/Service type(s) to allow to differentiate amongst multiple Network Slices of the same Slice/Service type. This IE shall be absent if no SD value is associated with the SST. 
   * @return sd
  */
  @ApiModelProperty(value = "3-octet string, representing the Slice Differentiator, in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the SD shall appear first in the string, and the character representing the 4 least significant bit of the SD shall appear last in the string.  This is an optional parameter that complements the Slice/Service type(s) to allow to differentiate amongst multiple Network Slices of the same Slice/Service type. This IE shall be absent if no SD value is associated with the SST. ")

@Pattern(regexp = "^[A-Fa-f0-9]{6}$") 
  public String getSd() {
    return sd;
  }

  public void setSd(String sd) {
    this.sd = sd;
  }

  public ExtSnssai sdRanges(List<SdRange> sdRanges) {
    this.sdRanges = sdRanges;
    return this;
  }

  public ExtSnssai addSdRangesItem(SdRange sdRangesItem) {
    if (this.sdRanges == null) {
      this.sdRanges = new ArrayList<>();
    }
    this.sdRanges.add(sdRangesItem);
    return this;
  }

  /**
   * When present, it shall contain the range(s) of Slice Differentiator values supported for the Slice/Service Type value indicated in the sst attribute of the Snssai data type (see clause 5.4.4.2).
   * @return sdRanges
  */
  @ApiModelProperty(value = "When present, it shall contain the range(s) of Slice Differentiator values supported for the Slice/Service Type value indicated in the sst attribute of the Snssai data type (see clause 5.4.4.2).")

  @Valid
@Size(min = 1) 
  public List<SdRange> getSdRanges() {
    return sdRanges;
  }

  public void setSdRanges(List<SdRange> sdRanges) {
    this.sdRanges = sdRanges;
  }

  public ExtSnssai wildcardSd(Boolean wildcardSd) {
    this.wildcardSd = wildcardSd;
    return this;
  }

  /**
   * When present, it shall be set to \"true\", to indicate that all SD values are supported for the Slice/Service Type value indicated in the sst attribute of the Snssai data type (see clause 5.4.4.2).
   * @return wildcardSd
  */
  @ApiModelProperty(value = "When present, it shall be set to \"true\", to indicate that all SD values are supported for the Slice/Service Type value indicated in the sst attribute of the Snssai data type (see clause 5.4.4.2).")


  public Boolean getWildcardSd() {
    return wildcardSd;
  }

  public void setWildcardSd(Boolean wildcardSd) {
    this.wildcardSd = wildcardSd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtSnssai extSnssai = (ExtSnssai) o;
    return Objects.equals(this.sst, extSnssai.sst) &&
        Objects.equals(this.sd, extSnssai.sd) &&
        Objects.equals(this.sdRanges, extSnssai.sdRanges) &&
        Objects.equals(this.wildcardSd, extSnssai.wildcardSd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sst, sd, sdRanges, wildcardSd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtSnssai {\n");
    
    sb.append("    sst: ").append(toIndentedString(sst)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
    sb.append("    sdRanges: ").append(toIndentedString(sdRanges)).append("\n");
    sb.append("    wildcardSd: ").append(toIndentedString(wildcardSd)).append("\n");
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

