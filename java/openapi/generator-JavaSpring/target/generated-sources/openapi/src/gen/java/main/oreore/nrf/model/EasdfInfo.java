package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.IpAddr;
import oreore.nrf.model.SnssaiEasdfInfoItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an EASDF NF Instance
 */
@ApiModel(description = "Information of an EASDF NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class EasdfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sNssaiEasdfInfoList")
  @Valid
  private List<SnssaiEasdfInfoItem> sNssaiEasdfInfoList = null;

  @JsonProperty("easdfN6IpAddressList")
  @Valid
  private List<IpAddr> easdfN6IpAddressList = null;

  @JsonProperty("upfN6IpAddressList")
  @Valid
  private List<IpAddr> upfN6IpAddressList = null;

  public EasdfInfo sNssaiEasdfInfoList(List<SnssaiEasdfInfoItem> sNssaiEasdfInfoList) {
    this.sNssaiEasdfInfoList = sNssaiEasdfInfoList;
    return this;
  }

  public EasdfInfo addSNssaiEasdfInfoListItem(SnssaiEasdfInfoItem sNssaiEasdfInfoListItem) {
    if (this.sNssaiEasdfInfoList == null) {
      this.sNssaiEasdfInfoList = new ArrayList<>();
    }
    this.sNssaiEasdfInfoList.add(sNssaiEasdfInfoListItem);
    return this;
  }

  /**
   * Get sNssaiEasdfInfoList
   * @return sNssaiEasdfInfoList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<SnssaiEasdfInfoItem> getsNssaiEasdfInfoList() {
    return sNssaiEasdfInfoList;
  }

  public void setsNssaiEasdfInfoList(List<SnssaiEasdfInfoItem> sNssaiEasdfInfoList) {
    this.sNssaiEasdfInfoList = sNssaiEasdfInfoList;
  }

  public EasdfInfo easdfN6IpAddressList(List<IpAddr> easdfN6IpAddressList) {
    this.easdfN6IpAddressList = easdfN6IpAddressList;
    return this;
  }

  public EasdfInfo addEasdfN6IpAddressListItem(IpAddr easdfN6IpAddressListItem) {
    if (this.easdfN6IpAddressList == null) {
      this.easdfN6IpAddressList = new ArrayList<>();
    }
    this.easdfN6IpAddressList.add(easdfN6IpAddressListItem);
    return this;
  }

  /**
   * Get easdfN6IpAddressList
   * @return easdfN6IpAddressList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IpAddr> getEasdfN6IpAddressList() {
    return easdfN6IpAddressList;
  }

  public void setEasdfN6IpAddressList(List<IpAddr> easdfN6IpAddressList) {
    this.easdfN6IpAddressList = easdfN6IpAddressList;
  }

  public EasdfInfo upfN6IpAddressList(List<IpAddr> upfN6IpAddressList) {
    this.upfN6IpAddressList = upfN6IpAddressList;
    return this;
  }

  public EasdfInfo addUpfN6IpAddressListItem(IpAddr upfN6IpAddressListItem) {
    if (this.upfN6IpAddressList == null) {
      this.upfN6IpAddressList = new ArrayList<>();
    }
    this.upfN6IpAddressList.add(upfN6IpAddressListItem);
    return this;
  }

  /**
   * Get upfN6IpAddressList
   * @return upfN6IpAddressList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IpAddr> getUpfN6IpAddressList() {
    return upfN6IpAddressList;
  }

  public void setUpfN6IpAddressList(List<IpAddr> upfN6IpAddressList) {
    this.upfN6IpAddressList = upfN6IpAddressList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EasdfInfo easdfInfo = (EasdfInfo) o;
    return Objects.equals(this.sNssaiEasdfInfoList, easdfInfo.sNssaiEasdfInfoList) &&
        Objects.equals(this.easdfN6IpAddressList, easdfInfo.easdfN6IpAddressList) &&
        Objects.equals(this.upfN6IpAddressList, easdfInfo.upfN6IpAddressList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sNssaiEasdfInfoList, easdfN6IpAddressList, upfN6IpAddressList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EasdfInfo {\n");
    
    sb.append("    sNssaiEasdfInfoList: ").append(toIndentedString(sNssaiEasdfInfoList)).append("\n");
    sb.append("    easdfN6IpAddressList: ").append(toIndentedString(easdfN6IpAddressList)).append("\n");
    sb.append("    upfN6IpAddressList: ").append(toIndentedString(upfN6IpAddressList)).append("\n");
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

