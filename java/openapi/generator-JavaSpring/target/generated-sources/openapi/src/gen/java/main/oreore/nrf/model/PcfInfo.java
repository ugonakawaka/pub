package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.IdentityRange;
import oreore.nrf.model.SupiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a PCF NF Instance
 */
@ApiModel(description = "Information of a PCF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class PcfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("dnnList")
  @Valid
  private List<String> dnnList = null;

  @JsonProperty("supiRanges")
  @Valid
  private List<SupiRange> supiRanges = null;

  @JsonProperty("gpsiRanges")
  @Valid
  private List<IdentityRange> gpsiRanges = null;

  @JsonProperty("rxDiamHost")
  private String rxDiamHost;

  @JsonProperty("rxDiamRealm")
  private String rxDiamRealm;

  @JsonProperty("v2xSupportInd")
  private Boolean v2xSupportInd = false;

  @JsonProperty("proseSupportInd")
  private Boolean proseSupportInd = false;

  public PcfInfo groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Identifier of a group of NFs.
   * @return groupId
  */
  @ApiModelProperty(value = "Identifier of a group of NFs.")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public PcfInfo dnnList(List<String> dnnList) {
    this.dnnList = dnnList;
    return this;
  }

  public PcfInfo addDnnListItem(String dnnListItem) {
    if (this.dnnList == null) {
      this.dnnList = new ArrayList<>();
    }
    this.dnnList.add(dnnListItem);
    return this;
  }

  /**
   * Get dnnList
   * @return dnnList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getDnnList() {
    return dnnList;
  }

  public void setDnnList(List<String> dnnList) {
    this.dnnList = dnnList;
  }

  public PcfInfo supiRanges(List<SupiRange> supiRanges) {
    this.supiRanges = supiRanges;
    return this;
  }

  public PcfInfo addSupiRangesItem(SupiRange supiRangesItem) {
    if (this.supiRanges == null) {
      this.supiRanges = new ArrayList<>();
    }
    this.supiRanges.add(supiRangesItem);
    return this;
  }

  /**
   * Get supiRanges
   * @return supiRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<SupiRange> getSupiRanges() {
    return supiRanges;
  }

  public void setSupiRanges(List<SupiRange> supiRanges) {
    this.supiRanges = supiRanges;
  }

  public PcfInfo gpsiRanges(List<IdentityRange> gpsiRanges) {
    this.gpsiRanges = gpsiRanges;
    return this;
  }

  public PcfInfo addGpsiRangesItem(IdentityRange gpsiRangesItem) {
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

  public PcfInfo rxDiamHost(String rxDiamHost) {
    this.rxDiamHost = rxDiamHost;
    return this;
  }

  /**
   * string containing an FQDN or realm as defined in RFC 6733.
   * @return rxDiamHost
  */
  @ApiModelProperty(value = "string containing an FQDN or realm as defined in RFC 6733.")

@Pattern(regexp = "^([A-Za-z0-9]+([-A-Za-z0-9]+)\\.)+[a-z]{2,}$") 
  public String getRxDiamHost() {
    return rxDiamHost;
  }

  public void setRxDiamHost(String rxDiamHost) {
    this.rxDiamHost = rxDiamHost;
  }

  public PcfInfo rxDiamRealm(String rxDiamRealm) {
    this.rxDiamRealm = rxDiamRealm;
    return this;
  }

  /**
   * string containing an FQDN or realm as defined in RFC 6733.
   * @return rxDiamRealm
  */
  @ApiModelProperty(value = "string containing an FQDN or realm as defined in RFC 6733.")

@Pattern(regexp = "^([A-Za-z0-9]+([-A-Za-z0-9]+)\\.)+[a-z]{2,}$") 
  public String getRxDiamRealm() {
    return rxDiamRealm;
  }

  public void setRxDiamRealm(String rxDiamRealm) {
    this.rxDiamRealm = rxDiamRealm;
  }

  public PcfInfo v2xSupportInd(Boolean v2xSupportInd) {
    this.v2xSupportInd = v2xSupportInd;
    return this;
  }

  /**
   * Get v2xSupportInd
   * @return v2xSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getV2xSupportInd() {
    return v2xSupportInd;
  }

  public void setV2xSupportInd(Boolean v2xSupportInd) {
    this.v2xSupportInd = v2xSupportInd;
  }

  public PcfInfo proseSupportInd(Boolean proseSupportInd) {
    this.proseSupportInd = proseSupportInd;
    return this;
  }

  /**
   * Get proseSupportInd
   * @return proseSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getProseSupportInd() {
    return proseSupportInd;
  }

  public void setProseSupportInd(Boolean proseSupportInd) {
    this.proseSupportInd = proseSupportInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PcfInfo pcfInfo = (PcfInfo) o;
    return Objects.equals(this.groupId, pcfInfo.groupId) &&
        Objects.equals(this.dnnList, pcfInfo.dnnList) &&
        Objects.equals(this.supiRanges, pcfInfo.supiRanges) &&
        Objects.equals(this.gpsiRanges, pcfInfo.gpsiRanges) &&
        Objects.equals(this.rxDiamHost, pcfInfo.rxDiamHost) &&
        Objects.equals(this.rxDiamRealm, pcfInfo.rxDiamRealm) &&
        Objects.equals(this.v2xSupportInd, pcfInfo.v2xSupportInd) &&
        Objects.equals(this.proseSupportInd, pcfInfo.proseSupportInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, dnnList, supiRanges, gpsiRanges, rxDiamHost, rxDiamRealm, v2xSupportInd, proseSupportInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PcfInfo {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    dnnList: ").append(toIndentedString(dnnList)).append("\n");
    sb.append("    supiRanges: ").append(toIndentedString(supiRanges)).append("\n");
    sb.append("    gpsiRanges: ").append(toIndentedString(gpsiRanges)).append("\n");
    sb.append("    rxDiamHost: ").append(toIndentedString(rxDiamHost)).append("\n");
    sb.append("    rxDiamRealm: ").append(toIndentedString(rxDiamRealm)).append("\n");
    sb.append("    v2xSupportInd: ").append(toIndentedString(v2xSupportInd)).append("\n");
    sb.append("    proseSupportInd: ").append(toIndentedString(proseSupportInd)).append("\n");
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

