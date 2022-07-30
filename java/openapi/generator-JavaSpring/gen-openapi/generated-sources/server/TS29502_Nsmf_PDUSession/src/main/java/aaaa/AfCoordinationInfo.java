package aaaa;

import java.util.Objects;
import aaaa.Ipv6Prefix;
import aaaa.NotificationInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AF Coordination Information
 */
@ApiModel(description = "AF Coordination Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class AfCoordinationInfo   {
  @JsonProperty("sourceDnai")
  private String sourceDnai;

  @JsonProperty("sourceUeIpv4Addr")
  private String sourceUeIpv4Addr;

  @JsonProperty("sourceUeIpv6Prefix")
  private Ipv6Prefix sourceUeIpv6Prefix;

  @JsonProperty("notificationInfoList")
  @Valid
  private List<NotificationInfo> notificationInfoList = null;

  public AfCoordinationInfo sourceDnai(String sourceDnai) {
    this.sourceDnai = sourceDnai;
    return this;
  }

  /**
   * DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.
   * @return sourceDnai
  */
  @ApiModelProperty(value = "DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.")


  public String getSourceDnai() {
    return sourceDnai;
  }

  public void setSourceDnai(String sourceDnai) {
    this.sourceDnai = sourceDnai;
  }

  public AfCoordinationInfo sourceUeIpv4Addr(String sourceUeIpv4Addr) {
    this.sourceUeIpv4Addr = sourceUeIpv4Addr;
    return this;
  }

  /**
   * String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.
   * @return sourceUeIpv4Addr
  */
  @ApiModelProperty(example = "198.51.100.1", value = "String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.")

@Pattern(regexp="^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$") 
  public String getSourceUeIpv4Addr() {
    return sourceUeIpv4Addr;
  }

  public void setSourceUeIpv4Addr(String sourceUeIpv4Addr) {
    this.sourceUeIpv4Addr = sourceUeIpv4Addr;
  }

  public AfCoordinationInfo sourceUeIpv6Prefix(Ipv6Prefix sourceUeIpv6Prefix) {
    this.sourceUeIpv6Prefix = sourceUeIpv6Prefix;
    return this;
  }

  /**
   * Get sourceUeIpv6Prefix
   * @return sourceUeIpv6Prefix
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Prefix getSourceUeIpv6Prefix() {
    return sourceUeIpv6Prefix;
  }

  public void setSourceUeIpv6Prefix(Ipv6Prefix sourceUeIpv6Prefix) {
    this.sourceUeIpv6Prefix = sourceUeIpv6Prefix;
  }

  public AfCoordinationInfo notificationInfoList(List<NotificationInfo> notificationInfoList) {
    this.notificationInfoList = notificationInfoList;
    return this;
  }

  public AfCoordinationInfo addNotificationInfoListItem(NotificationInfo notificationInfoListItem) {
    if (this.notificationInfoList == null) {
      this.notificationInfoList = new ArrayList<>();
    }
    this.notificationInfoList.add(notificationInfoListItem);
    return this;
  }

  /**
   * Get notificationInfoList
   * @return notificationInfoList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<NotificationInfo> getNotificationInfoList() {
    return notificationInfoList;
  }

  public void setNotificationInfoList(List<NotificationInfo> notificationInfoList) {
    this.notificationInfoList = notificationInfoList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AfCoordinationInfo afCoordinationInfo = (AfCoordinationInfo) o;
    return Objects.equals(this.sourceDnai, afCoordinationInfo.sourceDnai) &&
        Objects.equals(this.sourceUeIpv4Addr, afCoordinationInfo.sourceUeIpv4Addr) &&
        Objects.equals(this.sourceUeIpv6Prefix, afCoordinationInfo.sourceUeIpv6Prefix) &&
        Objects.equals(this.notificationInfoList, afCoordinationInfo.notificationInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDnai, sourceUeIpv4Addr, sourceUeIpv6Prefix, notificationInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfCoordinationInfo {\n");
    
    sb.append("    sourceDnai: ").append(toIndentedString(sourceDnai)).append("\n");
    sb.append("    sourceUeIpv4Addr: ").append(toIndentedString(sourceUeIpv4Addr)).append("\n");
    sb.append("    sourceUeIpv6Prefix: ").append(toIndentedString(sourceUeIpv6Prefix)).append("\n");
    sb.append("    notificationInfoList: ").append(toIndentedString(notificationInfoList)).append("\n");
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

