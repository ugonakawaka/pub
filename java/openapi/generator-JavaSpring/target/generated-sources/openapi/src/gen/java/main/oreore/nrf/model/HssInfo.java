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
import oreore.nrf.model.ImsiRange;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an HSS NF Instance
 */
@ApiModel(description = "Information of an HSS NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class HssInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("imsiRanges")
  @Valid
  private List<ImsiRange> imsiRanges = null;

  @JsonProperty("imsPrivateIdentityRanges")
  @Valid
  private List<IdentityRange> imsPrivateIdentityRanges = null;

  @JsonProperty("imsPublicIdentityRanges")
  @Valid
  private List<IdentityRange> imsPublicIdentityRanges = null;

  @JsonProperty("msisdnRanges")
  @Valid
  private List<IdentityRange> msisdnRanges = null;

  public HssInfo groupId(String groupId) {
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

  public HssInfo imsiRanges(List<ImsiRange> imsiRanges) {
    this.imsiRanges = imsiRanges;
    return this;
  }

  public HssInfo addImsiRangesItem(ImsiRange imsiRangesItem) {
    if (this.imsiRanges == null) {
      this.imsiRanges = new ArrayList<>();
    }
    this.imsiRanges.add(imsiRangesItem);
    return this;
  }

  /**
   * Get imsiRanges
   * @return imsiRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<ImsiRange> getImsiRanges() {
    return imsiRanges;
  }

  public void setImsiRanges(List<ImsiRange> imsiRanges) {
    this.imsiRanges = imsiRanges;
  }

  public HssInfo imsPrivateIdentityRanges(List<IdentityRange> imsPrivateIdentityRanges) {
    this.imsPrivateIdentityRanges = imsPrivateIdentityRanges;
    return this;
  }

  public HssInfo addImsPrivateIdentityRangesItem(IdentityRange imsPrivateIdentityRangesItem) {
    if (this.imsPrivateIdentityRanges == null) {
      this.imsPrivateIdentityRanges = new ArrayList<>();
    }
    this.imsPrivateIdentityRanges.add(imsPrivateIdentityRangesItem);
    return this;
  }

  /**
   * Get imsPrivateIdentityRanges
   * @return imsPrivateIdentityRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getImsPrivateIdentityRanges() {
    return imsPrivateIdentityRanges;
  }

  public void setImsPrivateIdentityRanges(List<IdentityRange> imsPrivateIdentityRanges) {
    this.imsPrivateIdentityRanges = imsPrivateIdentityRanges;
  }

  public HssInfo imsPublicIdentityRanges(List<IdentityRange> imsPublicIdentityRanges) {
    this.imsPublicIdentityRanges = imsPublicIdentityRanges;
    return this;
  }

  public HssInfo addImsPublicIdentityRangesItem(IdentityRange imsPublicIdentityRangesItem) {
    if (this.imsPublicIdentityRanges == null) {
      this.imsPublicIdentityRanges = new ArrayList<>();
    }
    this.imsPublicIdentityRanges.add(imsPublicIdentityRangesItem);
    return this;
  }

  /**
   * Get imsPublicIdentityRanges
   * @return imsPublicIdentityRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getImsPublicIdentityRanges() {
    return imsPublicIdentityRanges;
  }

  public void setImsPublicIdentityRanges(List<IdentityRange> imsPublicIdentityRanges) {
    this.imsPublicIdentityRanges = imsPublicIdentityRanges;
  }

  public HssInfo msisdnRanges(List<IdentityRange> msisdnRanges) {
    this.msisdnRanges = msisdnRanges;
    return this;
  }

  public HssInfo addMsisdnRangesItem(IdentityRange msisdnRangesItem) {
    if (this.msisdnRanges == null) {
      this.msisdnRanges = new ArrayList<>();
    }
    this.msisdnRanges.add(msisdnRangesItem);
    return this;
  }

  /**
   * Get msisdnRanges
   * @return msisdnRanges
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IdentityRange> getMsisdnRanges() {
    return msisdnRanges;
  }

  public void setMsisdnRanges(List<IdentityRange> msisdnRanges) {
    this.msisdnRanges = msisdnRanges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HssInfo hssInfo = (HssInfo) o;
    return Objects.equals(this.groupId, hssInfo.groupId) &&
        Objects.equals(this.imsiRanges, hssInfo.imsiRanges) &&
        Objects.equals(this.imsPrivateIdentityRanges, hssInfo.imsPrivateIdentityRanges) &&
        Objects.equals(this.imsPublicIdentityRanges, hssInfo.imsPublicIdentityRanges) &&
        Objects.equals(this.msisdnRanges, hssInfo.msisdnRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, imsiRanges, imsPrivateIdentityRanges, imsPublicIdentityRanges, msisdnRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HssInfo {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    imsiRanges: ").append(toIndentedString(imsiRanges)).append("\n");
    sb.append("    imsPrivateIdentityRanges: ").append(toIndentedString(imsPrivateIdentityRanges)).append("\n");
    sb.append("    imsPublicIdentityRanges: ").append(toIndentedString(imsPublicIdentityRanges)).append("\n");
    sb.append("    msisdnRanges: ").append(toIndentedString(msisdnRanges)).append("\n");
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

