package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.AfEventExposureData;
import oreore.nrf.model.IdentityRange;
import oreore.nrf.model.PfdData;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an NEF NF Instance
 */
@ApiModel(description = "Information of an NEF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NefInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nefId")
  private String nefId;

  @JsonProperty("pfdData")
  private PfdData pfdData;

  @JsonProperty("afEeData")
  private AfEventExposureData afEeData;

  @JsonProperty("gpsiRanges")
  @Valid
  private List<IdentityRange> gpsiRanges = null;

  @JsonProperty("externalGroupIdentifiersRanges")
  @Valid
  private List<IdentityRange> externalGroupIdentifiersRanges = null;

  @JsonProperty("servedFqdnList")
  @Valid
  private List<String> servedFqdnList = null;

  public NefInfo nefId(String nefId) {
    this.nefId = nefId;
    return this;
  }

  /**
   * Identity of the NEF
   * @return nefId
  */
  @ApiModelProperty(value = "Identity of the NEF")


  public String getNefId() {
    return nefId;
  }

  public void setNefId(String nefId) {
    this.nefId = nefId;
  }

  public NefInfo pfdData(PfdData pfdData) {
    this.pfdData = pfdData;
    return this;
  }

  /**
   * Get pfdData
   * @return pfdData
  */
  @ApiModelProperty(value = "")

  @Valid

  public PfdData getPfdData() {
    return pfdData;
  }

  public void setPfdData(PfdData pfdData) {
    this.pfdData = pfdData;
  }

  public NefInfo afEeData(AfEventExposureData afEeData) {
    this.afEeData = afEeData;
    return this;
  }

  /**
   * Get afEeData
   * @return afEeData
  */
  @ApiModelProperty(value = "")

  @Valid

  public AfEventExposureData getAfEeData() {
    return afEeData;
  }

  public void setAfEeData(AfEventExposureData afEeData) {
    this.afEeData = afEeData;
  }

  public NefInfo gpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
    return this;
  }

  public NefInfo addGpsiRangesItem(IdentityRange gpsiRangesItem) {
    if (this.gpsiRanges == null) {
      this.gpsiRanges = new ArrayList<>();
    }
    this.gpsiRanges.add(gpsiRangesItem);
    return this;
  }

  /**
   * Get gpsiRanges
   * @return gpsiRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getGpsiRanges() {
    return gpsiRanges;
  }

  public void setGpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
  }

  public NefInfo externalGroupIdentifiersRanges(List<IdentityRange> externalGroupIdentifiersRanges) {
    this.externalGroupIdentifiersRanges = externalGroupIdentifiersRanges;
    return this;
  }

  public NefInfo addExternalGroupIdentifiersRangesItem(IdentityRange externalGroupIdentifiersRangesItem) {
    if (this.externalGroupIdentifiersRanges == null) {
      this.externalGroupIdentifiersRanges = new ArrayList<>();
    }
    this.externalGroupIdentifiersRanges.add(externalGroupIdentifiersRangesItem);
    return this;
  }

  /**
   * Get externalGroupIdentifiersRanges
   * @return externalGroupIdentifiersRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getExternalGroupIdentifiersRanges() {
    return externalGroupIdentifiersRanges;
  }

  public void setExternalGroupIdentifiersRanges(List<IdentityRange> externalGroupIdentifiersRanges) {
    this.externalGroupIdentifiersRanges = externalGroupIdentifiersRanges;
  }

  public NefInfo servedFqdnList(List<String> servedFqdnList) {
    this.servedFqdnList = servedFqdnList;
    return this;
  }

  public NefInfo addServedFqdnListItem(String servedFqdnListItem) {
    if (this.servedFqdnList == null) {
      this.servedFqdnList = new ArrayList<>();
    }
    this.servedFqdnList.add(servedFqdnListItem);
    return this;
  }

  /**
   * Get servedFqdnList
   * @return servedFqdnList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getServedFqdnList() {
    return servedFqdnList;
  }

  public void setServedFqdnList(List<String> servedFqdnList) {
    this.servedFqdnList = servedFqdnList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NefInfo nefInfo = (NefInfo) o;
    return Objects.equals(this.nefId, nefInfo.nefId) &&
        Objects.equals(this.pfdData, nefInfo.pfdData) &&
        Objects.equals(this.afEeData, nefInfo.afEeData) &&
        Objects.equals(this.gpsiRanges, nefInfo.gpsiRanges) &&
        Objects.equals(this.externalGroupIdentifiersRanges, nefInfo.externalGroupIdentifiersRanges) &&
        Objects.equals(this.servedFqdnList, nefInfo.servedFqdnList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nefId, pfdData, afEeData, gpsiRanges, externalGroupIdentifiersRanges, servedFqdnList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NefInfo {\n");
    
    sb.append("    nefId: ").append(toIndentedString(nefId)).append("\n");
    sb.append("    pfdData: ").append(toIndentedString(pfdData)).append("\n");
    sb.append("    afEeData: ").append(toIndentedString(afEeData)).append("\n");
    sb.append("    gpsiRanges: ").append(toIndentedString(gpsiRanges)).append("\n");
    sb.append("    externalGroupIdentifiersRanges: ").append(toIndentedString(externalGroupIdentifiersRanges)).append("\n");
    sb.append("    servedFqdnList: ").append(toIndentedString(servedFqdnList)).append("\n");
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

