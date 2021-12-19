package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.Guami;
import oreore.nrf.model.N2InterfaceAmfInfo;
import oreore.nrf.model.Tai;
import oreore.nrf.model.TaiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an AMF NF Instance
 */
@ApiModel(description = "Information of an AMF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class AmfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amfSetId")
  private String amfSetId;

  @JsonProperty("amfRegionId")
  private String amfRegionId;

  @JsonProperty("guamiList")
  @Valid
  private List<Guami> guamiList = new ArrayList<>();

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  @JsonProperty("taiRangeList")
  @Valid
  private List<TaiRange> taiRangeList = null;

  @JsonProperty("backupInfoAmfFailure")
  @Valid
  private List<Guami> backupInfoAmfFailure = null;

  @JsonProperty("backupInfoAmfRemoval")
  @Valid
  private List<Guami> backupInfoAmfRemoval = null;

  @JsonProperty("n2InterfaceAmfInfo")
  private N2InterfaceAmfInfo n2InterfaceAmfInfo;

  public AmfInfo amfSetId(String amfSetId) {
    this.amfSetId = amfSetId;
    return this;
  }

  /**
   * String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)
   * @return amfSetId
  */
  @ApiModelProperty(required = true, value = "String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)")
  @NotNull

@Pattern(regexp = "^[0-3][A-Fa-f0-9]{2}$") 
  public String getAmfSetId() {
    return amfSetId;
  }

  public void setAmfSetId(String amfSetId) {
    this.amfSetId = amfSetId;
  }

  public AmfInfo amfRegionId(String amfRegionId) {
    this.amfRegionId = amfRegionId;
    return this;
  }

  /**
   * String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)
   * @return amfRegionId
  */
  @ApiModelProperty(required = true, value = "String identifying the AMF Set ID (10 bits) as specified in clause 2.10.1 of 3GPP TS 23.003. It is encoded as a string of 3 hexadecimal characters where the first character is limited to values 0 to 3 (i.e. 10 bits)")
  @NotNull

@Pattern(regexp = "^[A-Fa-f0-9]{2}$") 
  public String getAmfRegionId() {
    return amfRegionId;
  }

  public void setAmfRegionId(String amfRegionId) {
    this.amfRegionId = amfRegionId;
  }

  public AmfInfo guamiList(List<Guami> guamiList) {
    this.guamiList = guamiList;
    return this;
  }

  public AmfInfo addGuamiListItem(Guami guamiListItem) {
    this.guamiList.add(guamiListItem);
    return this;
  }

  /**
   * Get guamiList
   * @return guamiList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<Guami> getGuamiList() {
    return guamiList;
  }

  public void setGuamiList(List<Guami> guamiList) {
    this.guamiList = guamiList;
  }

  public AmfInfo taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public AmfInfo addTaiListItem(Tai taiListItem) {
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

  public AmfInfo taiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
    return this;
  }

  public AmfInfo addTaiRangeListItem(TaiRange taiRangeListItem) {
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

  public AmfInfo backupInfoAmfFailure(List<Guami> backupInfoAmfFailure) {
    this.backupInfoAmfFailure = backupInfoAmfFailure;
    return this;
  }

  public AmfInfo addBackupInfoAmfFailureItem(Guami backupInfoAmfFailureItem) {
    if (this.backupInfoAmfFailure == null) {
      this.backupInfoAmfFailure = new ArrayList<>();
    }
    this.backupInfoAmfFailure.add(backupInfoAmfFailureItem);
    return this;
  }

  /**
   * Get backupInfoAmfFailure
   * @return backupInfoAmfFailure
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Guami> getBackupInfoAmfFailure() {
    return backupInfoAmfFailure;
  }

  public void setBackupInfoAmfFailure(List<Guami> backupInfoAmfFailure) {
    this.backupInfoAmfFailure = backupInfoAmfFailure;
  }

  public AmfInfo backupInfoAmfRemoval(List<Guami> backupInfoAmfRemoval) {
    this.backupInfoAmfRemoval = backupInfoAmfRemoval;
    return this;
  }

  public AmfInfo addBackupInfoAmfRemovalItem(Guami backupInfoAmfRemovalItem) {
    if (this.backupInfoAmfRemoval == null) {
      this.backupInfoAmfRemoval = new ArrayList<>();
    }
    this.backupInfoAmfRemoval.add(backupInfoAmfRemovalItem);
    return this;
  }

  /**
   * Get backupInfoAmfRemoval
   * @return backupInfoAmfRemoval
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Guami> getBackupInfoAmfRemoval() {
    return backupInfoAmfRemoval;
  }

  public void setBackupInfoAmfRemoval(List<Guami> backupInfoAmfRemoval) {
    this.backupInfoAmfRemoval = backupInfoAmfRemoval;
  }

  public AmfInfo n2InterfaceAmfInfo(N2InterfaceAmfInfo n2InterfaceAmfInfo) {
    this.n2InterfaceAmfInfo = n2InterfaceAmfInfo;
    return this;
  }

  /**
   * Get n2InterfaceAmfInfo
   * @return n2InterfaceAmfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public N2InterfaceAmfInfo getN2InterfaceAmfInfo() {
    return n2InterfaceAmfInfo;
  }

  public void setN2InterfaceAmfInfo(N2InterfaceAmfInfo n2InterfaceAmfInfo) {
    this.n2InterfaceAmfInfo = n2InterfaceAmfInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmfInfo amfInfo = (AmfInfo) o;
    return Objects.equals(this.amfSetId, amfInfo.amfSetId) &&
        Objects.equals(this.amfRegionId, amfInfo.amfRegionId) &&
        Objects.equals(this.guamiList, amfInfo.guamiList) &&
        Objects.equals(this.taiList, amfInfo.taiList) &&
        Objects.equals(this.taiRangeList, amfInfo.taiRangeList) &&
        Objects.equals(this.backupInfoAmfFailure, amfInfo.backupInfoAmfFailure) &&
        Objects.equals(this.backupInfoAmfRemoval, amfInfo.backupInfoAmfRemoval) &&
        Objects.equals(this.n2InterfaceAmfInfo, amfInfo.n2InterfaceAmfInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amfSetId, amfRegionId, guamiList, taiList, taiRangeList, backupInfoAmfFailure, backupInfoAmfRemoval, n2InterfaceAmfInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmfInfo {\n");
    
    sb.append("    amfSetId: ").append(toIndentedString(amfSetId)).append("\n");
    sb.append("    amfRegionId: ").append(toIndentedString(amfRegionId)).append("\n");
    sb.append("    guamiList: ").append(toIndentedString(guamiList)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
    sb.append("    taiRangeList: ").append(toIndentedString(taiRangeList)).append("\n");
    sb.append("    backupInfoAmfFailure: ").append(toIndentedString(backupInfoAmfFailure)).append("\n");
    sb.append("    backupInfoAmfRemoval: ").append(toIndentedString(backupInfoAmfRemoval)).append("\n");
    sb.append("    n2InterfaceAmfInfo: ").append(toIndentedString(n2InterfaceAmfInfo)).append("\n");
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

