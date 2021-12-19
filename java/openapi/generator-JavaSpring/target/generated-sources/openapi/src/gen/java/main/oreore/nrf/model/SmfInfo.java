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
import oreore.nrf.model.SnssaiSmfInfoItem;
import oreore.nrf.model.Tai;
import oreore.nrf.model.TaiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an SMF NF Instance
 */
@ApiModel(description = "Information of an SMF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SmfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sNssaiSmfInfoList")
  @Valid
  private List<SnssaiSmfInfoItem> sNssaiSmfInfoList = new ArrayList<>();

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  @JsonProperty("taiRangeList")
  @Valid
  private List<TaiRange> taiRangeList = null;

  @JsonProperty("pgwFqdn")
  private String pgwFqdn;

  @JsonProperty("accessType")
  @Valid
  private List<AccessType> accessType = null;

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("vsmfSupportInd")
  private Boolean vsmfSupportInd = false;

  public SmfInfo sNssaiSmfInfoList(List<SnssaiSmfInfoItem> sNssaiSmfInfoList) {
    this.sNssaiSmfInfoList = sNssaiSmfInfoList;
    return this;
  }

  public SmfInfo addSNssaiSmfInfoListItem(SnssaiSmfInfoItem sNssaiSmfInfoListItem) {
    this.sNssaiSmfInfoList.add(sNssaiSmfInfoListItem);
    return this;
  }

  /**
   * Get sNssaiSmfInfoList
   * @return sNssaiSmfInfoList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<SnssaiSmfInfoItem> getsNssaiSmfInfoList() {
    return sNssaiSmfInfoList;
  }

  public void setsNssaiSmfInfoList(List<SnssaiSmfInfoItem> sNssaiSmfInfoList) {
    this.sNssaiSmfInfoList = sNssaiSmfInfoList;
  }

  public SmfInfo taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public SmfInfo addTaiListItem(Tai taiListItem) {
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

  public SmfInfo taiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
    return this;
  }

  public SmfInfo addTaiRangeListItem(TaiRange taiRangeListItem) {
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

  public SmfInfo pgwFqdn(String pgwFqdn) {
    this.pgwFqdn = pgwFqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return pgwFqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getPgwFqdn() {
    return pgwFqdn;
  }

  public void setPgwFqdn(String pgwFqdn) {
    this.pgwFqdn = pgwFqdn;
  }

  public SmfInfo accessType(List<AccessType> accessType) {
    this.accessType = accessType;
    return this;
  }

  public SmfInfo addAccessTypeItem(AccessType accessTypeItem) {
    if (this.accessType == null) {
      this.accessType = new ArrayList<>();
    }
    this.accessType.add(accessTypeItem);
    return this;
  }

  /**
   * Get accessType
   * @return accessType
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<AccessType> getAccessType() {
    return accessType;
  }

  public void setAccessType(List<AccessType> accessType) {
    this.accessType = accessType;
  }

  public SmfInfo priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * minimum: 0
   * maximum: 65535
   * @return priority
  */
  @ApiModelProperty(value = "")

@Min(0) @Max(65535) 
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public SmfInfo vsmfSupportInd(Boolean vsmfSupportInd) {
    this.vsmfSupportInd = vsmfSupportInd;
    return this;
  }

  /**
   * Get vsmfSupportInd
   * @return vsmfSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getVsmfSupportInd() {
    return vsmfSupportInd;
  }

  public void setVsmfSupportInd(Boolean vsmfSupportInd) {
    this.vsmfSupportInd = vsmfSupportInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmfInfo smfInfo = (SmfInfo) o;
    return Objects.equals(this.sNssaiSmfInfoList, smfInfo.sNssaiSmfInfoList) &&
        Objects.equals(this.taiList, smfInfo.taiList) &&
        Objects.equals(this.taiRangeList, smfInfo.taiRangeList) &&
        Objects.equals(this.pgwFqdn, smfInfo.pgwFqdn) &&
        Objects.equals(this.accessType, smfInfo.accessType) &&
        Objects.equals(this.priority, smfInfo.priority) &&
        Objects.equals(this.vsmfSupportInd, smfInfo.vsmfSupportInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sNssaiSmfInfoList, taiList, taiRangeList, pgwFqdn, accessType, priority, vsmfSupportInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmfInfo {\n");
    
    sb.append("    sNssaiSmfInfoList: ").append(toIndentedString(sNssaiSmfInfoList)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
    sb.append("    taiRangeList: ").append(toIndentedString(taiRangeList)).append("\n");
    sb.append("    pgwFqdn: ").append(toIndentedString(pgwFqdn)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    vsmfSupportInd: ").append(toIndentedString(vsmfSupportInd)).append("\n");
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

