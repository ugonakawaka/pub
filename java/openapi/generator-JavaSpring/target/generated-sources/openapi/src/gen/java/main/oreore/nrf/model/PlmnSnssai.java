package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.ExtSnssai;
import oreore.nrf.model.PlmnId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * List of network slices (S-NSSAIs) for a given PLMN ID
 */
@ApiModel(description = "List of network slices (S-NSSAIs) for a given PLMN ID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class PlmnSnssai  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("plmnId")
  private PlmnId plmnId;

  @JsonProperty("sNssaiList")
  @Valid
  private List<ExtSnssai> sNssaiList = new ArrayList<>();

  @JsonProperty("nid")
  private String nid;

  public PlmnSnssai plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }

  /**
   * Get plmnId
   * @return plmnId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PlmnId getPlmnId() {
    return plmnId;
  }

  public void setPlmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
  }

  public PlmnSnssai sNssaiList(List<ExtSnssai> sNssaiList) {
    this.sNssaiList = sNssaiList;
    return this;
  }

  public PlmnSnssai addSNssaiListItem(ExtSnssai sNssaiListItem) {
    this.sNssaiList.add(sNssaiListItem);
    return this;
  }

  /**
   * Get sNssaiList
   * @return sNssaiList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<ExtSnssai> getsNssaiList() {
    return sNssaiList;
  }

  public void setsNssaiList(List<ExtSnssai> sNssaiList) {
    this.sNssaiList = sNssaiList;
  }

  public PlmnSnssai nid(String nid) {
    this.nid = nid;
    return this;
  }

  /**
   * This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).
   * @return nid
  */
  @ApiModelProperty(value = "This represents the Network Identifier, which together with a PLMN ID is used to identify an SNPN (see 3GPP TS 23.003 and 3GPP TS 23.501 clause 5.30.2.1).")

@Pattern(regexp = "^[A-Fa-f0-9]{11}$") 
  public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
    this.nid = nid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnSnssai plmnSnssai = (PlmnSnssai) o;
    return Objects.equals(this.plmnId, plmnSnssai.plmnId) &&
        Objects.equals(this.sNssaiList, plmnSnssai.sNssaiList) &&
        Objects.equals(this.nid, plmnSnssai.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, sNssaiList, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnSnssai {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    sNssaiList: ").append(toIndentedString(sNssaiList)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
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

