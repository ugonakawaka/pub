package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.AtsssCapability;
import oreore.nrf.model.InterfaceUpfInfoItem;
import oreore.nrf.model.PduSessionType;
import oreore.nrf.model.SnssaiUpfInfoItem;
import oreore.nrf.model.Tai;
import oreore.nrf.model.TaiRange;
import oreore.nrf.model.TngfInfo;
import oreore.nrf.model.TwifInfo;
import oreore.nrf.model.WAgfInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an UPF NF Instance
 */
@ApiModel(description = "Information of an UPF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class UpfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sNssaiUpfInfoList")
  @Valid
  private List<SnssaiUpfInfoItem> sNssaiUpfInfoList = new ArrayList<>();

  @JsonProperty("smfServingArea")
  @Valid
  private List<String> smfServingArea = null;

  @JsonProperty("interfaceUpfInfoList")
  @Valid
  private List<InterfaceUpfInfoItem> interfaceUpfInfoList = null;

  @JsonProperty("iwkEpsInd")
  private Boolean iwkEpsInd = false;

  @JsonProperty("pduSessionTypes")
  @Valid
  private List<PduSessionType> pduSessionTypes = null;

  @JsonProperty("atsssCapability")
  private AtsssCapability atsssCapability;

  @JsonProperty("ueIpAddrInd")
  private Boolean ueIpAddrInd = false;

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  @JsonProperty("taiRangeList")
  @Valid
  private List<TaiRange> taiRangeList = null;

  @JsonProperty("wAgfInfo")
  private WAgfInfo wAgfInfo;

  @JsonProperty("tngfInfo")
  private TngfInfo tngfInfo;

  @JsonProperty("twifInfo")
  private TwifInfo twifInfo;

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("redundantGtpu")
  private Boolean redundantGtpu = false;

  @JsonProperty("ipups")
  private Boolean ipups = false;

  @JsonProperty("dataForwarding")
  private Boolean dataForwarding = false;

  @JsonProperty("supportedPfcpFeatures")
  private String supportedPfcpFeatures;

  public UpfInfo sNssaiUpfInfoList(List<SnssaiUpfInfoItem> sNssaiUpfInfoList) {
    this.sNssaiUpfInfoList = sNssaiUpfInfoList;
    return this;
  }

  public UpfInfo addSNssaiUpfInfoListItem(SnssaiUpfInfoItem sNssaiUpfInfoListItem) {
    this.sNssaiUpfInfoList.add(sNssaiUpfInfoListItem);
    return this;
  }

  /**
   * Get sNssaiUpfInfoList
   * @return sNssaiUpfInfoList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<SnssaiUpfInfoItem> getsNssaiUpfInfoList() {
    return sNssaiUpfInfoList;
  }

  public void setsNssaiUpfInfoList(List<SnssaiUpfInfoItem> sNssaiUpfInfoList) {
    this.sNssaiUpfInfoList = sNssaiUpfInfoList;
  }

  public UpfInfo smfServingArea(List<String> smfServingArea) {
    this.smfServingArea = smfServingArea;
    return this;
  }

  public UpfInfo addSmfServingAreaItem(String smfServingAreaItem) {
    if (this.smfServingArea == null) {
      this.smfServingArea = new ArrayList<>();
    }
    this.smfServingArea.add(smfServingAreaItem);
    return this;
  }

  /**
   * Get smfServingArea
   * @return smfServingArea
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getSmfServingArea() {
    return smfServingArea;
  }

  public void setSmfServingArea(List<String> smfServingArea) {
    this.smfServingArea = smfServingArea;
  }

  public UpfInfo interfaceUpfInfoList(List<InterfaceUpfInfoItem> interfaceUpfInfoList) {
    this.interfaceUpfInfoList = interfaceUpfInfoList;
    return this;
  }

  public UpfInfo addInterfaceUpfInfoListItem(InterfaceUpfInfoItem interfaceUpfInfoListItem) {
    if (this.interfaceUpfInfoList == null) {
      this.interfaceUpfInfoList = new ArrayList<>();
    }
    this.interfaceUpfInfoList.add(interfaceUpfInfoListItem);
    return this;
  }

  /**
   * Get interfaceUpfInfoList
   * @return interfaceUpfInfoList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<InterfaceUpfInfoItem> getInterfaceUpfInfoList() {
    return interfaceUpfInfoList;
  }

  public void setInterfaceUpfInfoList(List<InterfaceUpfInfoItem> interfaceUpfInfoList) {
    this.interfaceUpfInfoList = interfaceUpfInfoList;
  }

  public UpfInfo iwkEpsInd(Boolean iwkEpsInd) {
    this.iwkEpsInd = iwkEpsInd;
    return this;
  }

  /**
   * Get iwkEpsInd
   * @return iwkEpsInd
  */
  @ApiModelProperty(value = "")


  public Boolean getIwkEpsInd() {
    return iwkEpsInd;
  }

  public void setIwkEpsInd(Boolean iwkEpsInd) {
    this.iwkEpsInd = iwkEpsInd;
  }

  public UpfInfo pduSessionTypes(List<PduSessionType> pduSessionTypes) {
    this.pduSessionTypes = pduSessionTypes;
    return this;
  }

  public UpfInfo addPduSessionTypesItem(PduSessionType pduSessionTypesItem) {
    if (this.pduSessionTypes == null) {
      this.pduSessionTypes = new ArrayList<>();
    }
    this.pduSessionTypes.add(pduSessionTypesItem);
    return this;
  }

  /**
   * Get pduSessionTypes
   * @return pduSessionTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PduSessionType> getPduSessionTypes() {
    return pduSessionTypes;
  }

  public void setPduSessionTypes(List<PduSessionType> pduSessionTypes) {
    this.pduSessionTypes = pduSessionTypes;
  }

  public UpfInfo atsssCapability(AtsssCapability atsssCapability) {
    this.atsssCapability = atsssCapability;
    return this;
  }

  /**
   * Get atsssCapability
   * @return atsssCapability
  */
  @ApiModelProperty(value = "")

  @Valid

  public AtsssCapability getAtsssCapability() {
    return atsssCapability;
  }

  public void setAtsssCapability(AtsssCapability atsssCapability) {
    this.atsssCapability = atsssCapability;
  }

  public UpfInfo ueIpAddrInd(Boolean ueIpAddrInd) {
    this.ueIpAddrInd = ueIpAddrInd;
    return this;
  }

  /**
   * Get ueIpAddrInd
   * @return ueIpAddrInd
  */
  @ApiModelProperty(value = "")


  public Boolean getUeIpAddrInd() {
    return ueIpAddrInd;
  }

  public void setUeIpAddrInd(Boolean ueIpAddrInd) {
    this.ueIpAddrInd = ueIpAddrInd;
  }

  public UpfInfo taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public UpfInfo addTaiListItem(Tai taiListItem) {
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

  public UpfInfo taiRangeList(List<TaiRange> taiRangeList) {
    this.taiRangeList = taiRangeList;
    return this;
  }

  public UpfInfo addTaiRangeListItem(TaiRange taiRangeListItem) {
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

  public UpfInfo wAgfInfo(WAgfInfo wAgfInfo) {
    this.wAgfInfo = wAgfInfo;
    return this;
  }

  /**
   * Get wAgfInfo
   * @return wAgfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public WAgfInfo getwAgfInfo() {
    return wAgfInfo;
  }

  public void setwAgfInfo(WAgfInfo wAgfInfo) {
    this.wAgfInfo = wAgfInfo;
  }

  public UpfInfo tngfInfo(TngfInfo tngfInfo) {
    this.tngfInfo = tngfInfo;
    return this;
  }

  /**
   * Get tngfInfo
   * @return tngfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TngfInfo getTngfInfo() {
    return tngfInfo;
  }

  public void setTngfInfo(TngfInfo tngfInfo) {
    this.tngfInfo = tngfInfo;
  }

  public UpfInfo twifInfo(TwifInfo twifInfo) {
    this.twifInfo = twifInfo;
    return this;
  }

  /**
   * Get twifInfo
   * @return twifInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TwifInfo getTwifInfo() {
    return twifInfo;
  }

  public void setTwifInfo(TwifInfo twifInfo) {
    this.twifInfo = twifInfo;
  }

  public UpfInfo priority(Integer priority) {
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

  public UpfInfo redundantGtpu(Boolean redundantGtpu) {
    this.redundantGtpu = redundantGtpu;
    return this;
  }

  /**
   * Get redundantGtpu
   * @return redundantGtpu
  */
  @ApiModelProperty(value = "")


  public Boolean getRedundantGtpu() {
    return redundantGtpu;
  }

  public void setRedundantGtpu(Boolean redundantGtpu) {
    this.redundantGtpu = redundantGtpu;
  }

  public UpfInfo ipups(Boolean ipups) {
    this.ipups = ipups;
    return this;
  }

  /**
   * Get ipups
   * @return ipups
  */
  @ApiModelProperty(value = "")


  public Boolean getIpups() {
    return ipups;
  }

  public void setIpups(Boolean ipups) {
    this.ipups = ipups;
  }

  public UpfInfo dataForwarding(Boolean dataForwarding) {
    this.dataForwarding = dataForwarding;
    return this;
  }

  /**
   * Get dataForwarding
   * @return dataForwarding
  */
  @ApiModelProperty(value = "")


  public Boolean getDataForwarding() {
    return dataForwarding;
  }

  public void setDataForwarding(Boolean dataForwarding) {
    this.dataForwarding = dataForwarding;
  }

  public UpfInfo supportedPfcpFeatures(String supportedPfcpFeatures) {
    this.supportedPfcpFeatures = supportedPfcpFeatures;
    return this;
  }

  /**
   * Get supportedPfcpFeatures
   * @return supportedPfcpFeatures
  */
  @ApiModelProperty(value = "")


  public String getSupportedPfcpFeatures() {
    return supportedPfcpFeatures;
  }

  public void setSupportedPfcpFeatures(String supportedPfcpFeatures) {
    this.supportedPfcpFeatures = supportedPfcpFeatures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpfInfo upfInfo = (UpfInfo) o;
    return Objects.equals(this.sNssaiUpfInfoList, upfInfo.sNssaiUpfInfoList) &&
        Objects.equals(this.smfServingArea, upfInfo.smfServingArea) &&
        Objects.equals(this.interfaceUpfInfoList, upfInfo.interfaceUpfInfoList) &&
        Objects.equals(this.iwkEpsInd, upfInfo.iwkEpsInd) &&
        Objects.equals(this.pduSessionTypes, upfInfo.pduSessionTypes) &&
        Objects.equals(this.atsssCapability, upfInfo.atsssCapability) &&
        Objects.equals(this.ueIpAddrInd, upfInfo.ueIpAddrInd) &&
        Objects.equals(this.taiList, upfInfo.taiList) &&
        Objects.equals(this.taiRangeList, upfInfo.taiRangeList) &&
        Objects.equals(this.wAgfInfo, upfInfo.wAgfInfo) &&
        Objects.equals(this.tngfInfo, upfInfo.tngfInfo) &&
        Objects.equals(this.twifInfo, upfInfo.twifInfo) &&
        Objects.equals(this.priority, upfInfo.priority) &&
        Objects.equals(this.redundantGtpu, upfInfo.redundantGtpu) &&
        Objects.equals(this.ipups, upfInfo.ipups) &&
        Objects.equals(this.dataForwarding, upfInfo.dataForwarding) &&
        Objects.equals(this.supportedPfcpFeatures, upfInfo.supportedPfcpFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sNssaiUpfInfoList, smfServingArea, interfaceUpfInfoList, iwkEpsInd, pduSessionTypes, atsssCapability, ueIpAddrInd, taiList, taiRangeList, wAgfInfo, tngfInfo, twifInfo, priority, redundantGtpu, ipups, dataForwarding, supportedPfcpFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpfInfo {\n");
    
    sb.append("    sNssaiUpfInfoList: ").append(toIndentedString(sNssaiUpfInfoList)).append("\n");
    sb.append("    smfServingArea: ").append(toIndentedString(smfServingArea)).append("\n");
    sb.append("    interfaceUpfInfoList: ").append(toIndentedString(interfaceUpfInfoList)).append("\n");
    sb.append("    iwkEpsInd: ").append(toIndentedString(iwkEpsInd)).append("\n");
    sb.append("    pduSessionTypes: ").append(toIndentedString(pduSessionTypes)).append("\n");
    sb.append("    atsssCapability: ").append(toIndentedString(atsssCapability)).append("\n");
    sb.append("    ueIpAddrInd: ").append(toIndentedString(ueIpAddrInd)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
    sb.append("    taiRangeList: ").append(toIndentedString(taiRangeList)).append("\n");
    sb.append("    wAgfInfo: ").append(toIndentedString(wAgfInfo)).append("\n");
    sb.append("    tngfInfo: ").append(toIndentedString(tngfInfo)).append("\n");
    sb.append("    twifInfo: ").append(toIndentedString(twifInfo)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    redundantGtpu: ").append(toIndentedString(redundantGtpu)).append("\n");
    sb.append("    ipups: ").append(toIndentedString(ipups)).append("\n");
    sb.append("    dataForwarding: ").append(toIndentedString(dataForwarding)).append("\n");
    sb.append("    supportedPfcpFeatures: ").append(toIndentedString(supportedPfcpFeatures)).append("\n");
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

