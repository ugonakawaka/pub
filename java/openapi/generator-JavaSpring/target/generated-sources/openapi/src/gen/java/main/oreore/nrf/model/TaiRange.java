package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.PlmnId;
import oreore.nrf.model.TacRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Range of TAIs (Tracking Area Identities)
 */
@ApiModel(description = "Range of TAIs (Tracking Area Identities)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class TaiRange  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("plmnId")
  private PlmnId plmnId;

  @JsonProperty("tacRangeList")
  @Valid
  private List<TacRange> tacRangeList = new ArrayList<>();

  @JsonProperty("nid")
  private String nid;

  public TaiRange plmnId(PlmnId plmnId) {
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

  public TaiRange tacRangeList(List<TacRange> tacRangeList) {
    this.tacRangeList = tacRangeList;
    return this;
  }

  public TaiRange addTacRangeListItem(TacRange tacRangeListItem) {
    this.tacRangeList.add(tacRangeListItem);
    return this;
  }

  /**
   * Get tacRangeList
   * @return tacRangeList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<TacRange> getTacRangeList() {
    return tacRangeList;
  }

  public void setTacRangeList(List<TacRange> tacRangeList) {
    this.tacRangeList = tacRangeList;
  }

  public TaiRange nid(String nid) {
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
    TaiRange taiRange = (TaiRange) o;
    return Objects.equals(this.plmnId, taiRange.plmnId) &&
        Objects.equals(this.tacRangeList, taiRange.tacRangeList) &&
        Objects.equals(this.nid, taiRange.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, tacRangeList, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaiRange {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    tacRangeList: ").append(toIndentedString(tacRangeList)).append("\n");
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

