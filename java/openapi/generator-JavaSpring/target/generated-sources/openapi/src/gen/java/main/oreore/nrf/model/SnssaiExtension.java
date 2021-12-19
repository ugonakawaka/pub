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
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Extensions to the Snssai data type, sdRanges and wildcardSd shall not be present simultaneously
 */
@ApiModel(description = "Extensions to the Snssai data type, sdRanges and wildcardSd shall not be present simultaneously")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SnssaiExtension  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sdRanges")
  @Valid
  private List<SdRange> sdRanges = null;

  @JsonProperty("wildcardSd")
  private Boolean wildcardSd = false;

  public SnssaiExtension sdRanges(List<SdRange> sdRanges) {
    this.sdRanges = sdRanges;
    return this;
  }

  public SnssaiExtension addSdRangesItem(SdRange sdRangesItem) {
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

  public SnssaiExtension wildcardSd(Boolean wildcardSd) {
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
    SnssaiExtension snssaiExtension = (SnssaiExtension) o;
    return Objects.equals(this.sdRanges, snssaiExtension.sdRanges) &&
        Objects.equals(this.wildcardSd, snssaiExtension.wildcardSd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdRanges, wildcardSd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnssaiExtension {\n");
    
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

