package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.AccessType;
import oreore.nrf.model.AnNodeType;
import oreore.nrf.model.ExternalClientType;
import oreore.nrf.model.RatType;
import oreore.nrf.model.SupportedGADShapes;
import oreore.nrf.model.Tai;
import oreore.nrf.model.TaiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an LMF NF Instance
 */
@ApiModel(description = "Information of an LMF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class LmfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("servingClientTypes")
  @Valid
  private List<ExternalClientType> servingClientTypes = null;

  @JsonProperty("lmfId")
  private String lmfId;

  @JsonProperty("servingAccessTypes")
  @Valid
  private List<AccessType> servingAccessTypes = null;

  @JsonProperty("servingAnNodeTypes")
  @Valid
  private List<AnNodeType> servingAnNodeTypes = null;

  @JsonProperty("servingRatTypes")
  @Valid
  private List<RatType> servingRatTypes = null;

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  @JsonProperty("taiRangeList")
  @Valid
  private List<TaiRange> taiRangeList = null;

  @JsonProperty("supportedGADShapes")
  @Valid
  private List<SupportedGADShapes> supportedGADShapes = null;

  public LmfInfo servingClientTypes(List<ExternalClientType> servingClientTypes) {
    this.servingClientTypes = servingClientTypes;
    return this;
  }

  public LmfInfo addServingClientTypesItem(ExternalClientType servingClientTypesItem) {
    if (this.servingClientTypes == null) {
      this.servingClientTypes = new ArrayList<>();
    }
    this.servingClientTypes.add(servingClientTypesItem);
    return this;
  }

  /**
   * Get servingClientTypes
   * @return servingClientTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<ExternalClientType> getServingClientTypes() {
    return servingClientTypes;
  }

  public void setServingClientTypes(List<ExternalClientType> servingClientTypes) {
    this.servingClientTypes = servingClientTypes;
  }

  public LmfInfo lmfId(String lmfId) {
    this.lmfId = lmfId;
    return this;
  }

  /**
   * LMF identification.
   * @return lmfId
  */
  @ApiModelProperty(value = "LMF identification.")


  public String getLmfId() {
    return lmfId;
  }

  public void setLmfId(String lmfId) {
    this.lmfId = lmfId;
  }

  public LmfInfo servingAccessTypes(List<AccessType> servingAccessTypes) {
    this.servingAccessTypes = servingAccessTypes;
    return this;
  }

  public LmfInfo addServingAccessTypesItem(AccessType servingAccessTypesItem) {
    if (this.servingAccessTypes == null) {
      this.servingAccessTypes = new ArrayList<>();
    }
    this.servingAccessTypes.add(servingAccessTypesItem);
    return this;
  }

  /**
   * Get servingAccessTypes
   * @return servingAccessTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<AccessType> getServingAccessTypes() {
    return servingAccessTypes;
  }

  public void setServingAccessTypes(List<AccessType> servingAccessTypes) {
    this.servingAccessTypes = servingAccessTypes;
  }

  public LmfInfo servingAnNodeTypes(List<AnNodeType> servingAnNodeTypes) {
    this.servingAnNodeTypes = servingAnNodeTypes;
    return this;
  }

  public LmfInfo addServingAnNodeTypesItem(AnNodeType servingAnNodeTypesItem) {
    if (this.servingAnNodeTypes == null) {
      this.servingAnNodeTypes = new ArrayList<>();
    }
    this.servingAnNodeTypes.add(servingAnNodeTypesItem);
    return this;
  }

  /**
   * Get servingAnNodeTypes
   * @return servingAnNodeTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<AnNodeType> getServingAnNodeTypes() {
    return servingAnNodeTypes;
  }

  public void setServingAnNodeTypes(List<AnNodeType> servingAnNodeTypes) {
    this.servingAnNodeTypes = servingAnNodeTypes;
  }

  public LmfInfo servingRatTypes(List<RatType> servingRatTypes) {
    this.servingRatTypes = servingRatTypes;
    return this;
  }

  public LmfInfo addServingRatTypesItem(RatType servingRatTypesItem) {
    if (this.servingRatTypes == null) {
      this.servingRatTypes = new ArrayList<>();
    }
    this.servingRatTypes.add(servingRatTypesItem);
    return this;
  }

  /**
   * Get servingRatTypes
   * @return servingRatTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<RatType> getServingRatTypes() {
    return servingRatTypes;
  }

  public void setServingRatTypes(List<RatType> servingRatTypes) {
    this.servingRatTypes = servingRatTypes;
  }

  public LmfInfo taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public LmfInfo addTaiListItem(Tai taiListItem) {
    if (this.taiList == null) {
      this.taiList = new ArrayList<>();
    }
    this.taiList.add(taiListItem);
    return this;
  }

  /**
   * Get taiList
   * @return taiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Tai> getTaiList() {
    return taiList;
  }

  public void setTaiList(List<Tai> taiList) {
    this.taiList = taiList;
  }

  public LmfInfo taiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
    return this;
  }

  public LmfInfo addTaiRangeListItem(TaiRange taiRangeListItem) {
    if (this.taiRangeList == null) {
      this.taiRangeList = new ArrayList<>();
    }
    this.taiRangeList.add(taiRangeListItem);
    return this;
  }

  /**
   * Get taiRangeList
   * @return taiRangeList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<TaiRange> getTaiRangeList() {
    return taiRangeList;
  }

  public void setTaiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
  }

  public LmfInfo supportedGADShapes(List<SupportedGADShapes> supportedGADShapes) {
    this.supportedGADShapes = supportedGADShapes;
    return this;
  }

  public LmfInfo addSupportedGADShapesItem(SupportedGADShapes supportedGADShapesItem) {
    if (this.supportedGADShapes == null) {
      this.supportedGADShapes = new ArrayList<>();
    }
    this.supportedGADShapes.add(supportedGADShapesItem);
    return this;
  }

  /**
   * Get supportedGADShapes
   * @return supportedGADShapes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<SupportedGADShapes> getSupportedGADShapes() {
    return supportedGADShapes;
  }

  public void setSupportedGADShapes(List<SupportedGADShapes> supportedGADShapes) {
    this.supportedGADShapes = supportedGADShapes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LmfInfo lmfInfo = (LmfInfo) o;
    return Objects.equals(this.servingClientTypes, lmfInfo.servingClientTypes) &&
        Objects.equals(this.lmfId, lmfInfo.lmfId) &&
        Objects.equals(this.servingAccessTypes, lmfInfo.servingAccessTypes) &&
        Objects.equals(this.servingAnNodeTypes, lmfInfo.servingAnNodeTypes) &&
        Objects.equals(this.servingRatTypes, lmfInfo.servingRatTypes) &&
        Objects.equals(this.taiList, lmfInfo.taiList) &&
        Objects.equals(this.taiRangeList, lmfInfo.taiRangeList) &&
        Objects.equals(this.supportedGADShapes, lmfInfo.supportedGADShapes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servingClientTypes, lmfId, servingAccessTypes, servingAnNodeTypes, servingRatTypes, taiList, taiRangeList, supportedGADShapes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LmfInfo {\n");
    
    sb.append("    servingClientTypes: ").append(toIndentedString(servingClientTypes)).append("\n");
    sb.append("    lmfId: ").append(toIndentedString(lmfId)).append("\n");
    sb.append("    servingAccessTypes: ").append(toIndentedString(servingAccessTypes)).append("\n");
    sb.append("    servingAnNodeTypes: ").append(toIndentedString(servingAnNodeTypes)).append("\n");
    sb.append("    servingRatTypes: ").append(toIndentedString(servingRatTypes)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
    sb.append("    taiRangeList: ").append(toIndentedString(taiRangeList)).append("\n");
    sb.append("    supportedGADShapes: ").append(toIndentedString(supportedGADShapes)).append("\n");
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

