package aaaa;

import java.util.Objects;
import aaaa.AlternativeQosProfile;
import aaaa.NotificationControl;
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
 * GBR QoS flow information
 */
@ApiModel(description = "GBR QoS flow information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class GbrQosFlowInformation   {
  @JsonProperty("maxFbrDl")
  private String maxFbrDl;

  @JsonProperty("maxFbrUl")
  private String maxFbrUl;

  @JsonProperty("guaFbrDl")
  private String guaFbrDl;

  @JsonProperty("guaFbrUl")
  private String guaFbrUl;

  @JsonProperty("notifControl")
  private NotificationControl notifControl;

  @JsonProperty("maxPacketLossRateDl")
  private Integer maxPacketLossRateDl;

  @JsonProperty("maxPacketLossRateUl")
  private Integer maxPacketLossRateUl;

  @JsonProperty("alternativeQosProfileList")
  @Valid
  private List<AlternativeQosProfile> alternativeQosProfileList = null;

  public GbrQosFlowInformation maxFbrDl(String maxFbrDl) {
    this.maxFbrDl = maxFbrDl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return maxFbrDl
  */
  @ApiModelProperty(required = true, value = "String representing a bit rate that shall be formatted as follows.")
  @NotNull

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMaxFbrDl() {
    return maxFbrDl;
  }

  public void setMaxFbrDl(String maxFbrDl) {
    this.maxFbrDl = maxFbrDl;
  }

  public GbrQosFlowInformation maxFbrUl(String maxFbrUl) {
    this.maxFbrUl = maxFbrUl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return maxFbrUl
  */
  @ApiModelProperty(required = true, value = "String representing a bit rate that shall be formatted as follows.")
  @NotNull

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getMaxFbrUl() {
    return maxFbrUl;
  }

  public void setMaxFbrUl(String maxFbrUl) {
    this.maxFbrUl = maxFbrUl;
  }

  public GbrQosFlowInformation guaFbrDl(String guaFbrDl) {
    this.guaFbrDl = guaFbrDl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return guaFbrDl
  */
  @ApiModelProperty(required = true, value = "String representing a bit rate that shall be formatted as follows.")
  @NotNull

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getGuaFbrDl() {
    return guaFbrDl;
  }

  public void setGuaFbrDl(String guaFbrDl) {
    this.guaFbrDl = guaFbrDl;
  }

  public GbrQosFlowInformation guaFbrUl(String guaFbrUl) {
    this.guaFbrUl = guaFbrUl;
    return this;
  }

  /**
   * String representing a bit rate that shall be formatted as follows.
   * @return guaFbrUl
  */
  @ApiModelProperty(required = true, value = "String representing a bit rate that shall be formatted as follows.")
  @NotNull

@Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$") 
  public String getGuaFbrUl() {
    return guaFbrUl;
  }

  public void setGuaFbrUl(String guaFbrUl) {
    this.guaFbrUl = guaFbrUl;
  }

  public GbrQosFlowInformation notifControl(NotificationControl notifControl) {
    this.notifControl = notifControl;
    return this;
  }

  /**
   * Get notifControl
   * @return notifControl
  */
  @ApiModelProperty(value = "")

  @Valid

  public NotificationControl getNotifControl() {
    return notifControl;
  }

  public void setNotifControl(NotificationControl notifControl) {
    this.notifControl = notifControl;
  }

  public GbrQosFlowInformation maxPacketLossRateDl(Integer maxPacketLossRateDl) {
    this.maxPacketLossRateDl = maxPacketLossRateDl;
    return this;
  }

  /**
   * Unsigned integer indicating Packet Loss Rate (see clauses 5.7.2.8 and 5.7.4 of 3GPP TS 23.501), expressed in tenth of percent.
   * minimum: 0
   * maximum: 1000
   * @return maxPacketLossRateDl
  */
  @ApiModelProperty(value = "Unsigned integer indicating Packet Loss Rate (see clauses 5.7.2.8 and 5.7.4 of 3GPP TS 23.501), expressed in tenth of percent.")

@Min(0) @Max(1000) 
  public Integer getMaxPacketLossRateDl() {
    return maxPacketLossRateDl;
  }

  public void setMaxPacketLossRateDl(Integer maxPacketLossRateDl) {
    this.maxPacketLossRateDl = maxPacketLossRateDl;
  }

  public GbrQosFlowInformation maxPacketLossRateUl(Integer maxPacketLossRateUl) {
    this.maxPacketLossRateUl = maxPacketLossRateUl;
    return this;
  }

  /**
   * Unsigned integer indicating Packet Loss Rate (see clauses 5.7.2.8 and 5.7.4 of 3GPP TS 23.501), expressed in tenth of percent.
   * minimum: 0
   * maximum: 1000
   * @return maxPacketLossRateUl
  */
  @ApiModelProperty(value = "Unsigned integer indicating Packet Loss Rate (see clauses 5.7.2.8 and 5.7.4 of 3GPP TS 23.501), expressed in tenth of percent.")

@Min(0) @Max(1000) 
  public Integer getMaxPacketLossRateUl() {
    return maxPacketLossRateUl;
  }

  public void setMaxPacketLossRateUl(Integer maxPacketLossRateUl) {
    this.maxPacketLossRateUl = maxPacketLossRateUl;
  }

  public GbrQosFlowInformation alternativeQosProfileList(List<AlternativeQosProfile> alternativeQosProfileList) {
    this.alternativeQosProfileList = alternativeQosProfileList;
    return this;
  }

  public GbrQosFlowInformation addAlternativeQosProfileListItem(AlternativeQosProfile alternativeQosProfileListItem) {
    if (this.alternativeQosProfileList == null) {
      this.alternativeQosProfileList = new ArrayList<>();
    }
    this.alternativeQosProfileList.add(alternativeQosProfileListItem);
    return this;
  }

  /**
   * Get alternativeQosProfileList
   * @return alternativeQosProfileList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AlternativeQosProfile> getAlternativeQosProfileList() {
    return alternativeQosProfileList;
  }

  public void setAlternativeQosProfileList(List<AlternativeQosProfile> alternativeQosProfileList) {
    this.alternativeQosProfileList = alternativeQosProfileList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GbrQosFlowInformation gbrQosFlowInformation = (GbrQosFlowInformation) o;
    return Objects.equals(this.maxFbrDl, gbrQosFlowInformation.maxFbrDl) &&
        Objects.equals(this.maxFbrUl, gbrQosFlowInformation.maxFbrUl) &&
        Objects.equals(this.guaFbrDl, gbrQosFlowInformation.guaFbrDl) &&
        Objects.equals(this.guaFbrUl, gbrQosFlowInformation.guaFbrUl) &&
        Objects.equals(this.notifControl, gbrQosFlowInformation.notifControl) &&
        Objects.equals(this.maxPacketLossRateDl, gbrQosFlowInformation.maxPacketLossRateDl) &&
        Objects.equals(this.maxPacketLossRateUl, gbrQosFlowInformation.maxPacketLossRateUl) &&
        Objects.equals(this.alternativeQosProfileList, gbrQosFlowInformation.alternativeQosProfileList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxFbrDl, maxFbrUl, guaFbrDl, guaFbrUl, notifControl, maxPacketLossRateDl, maxPacketLossRateUl, alternativeQosProfileList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GbrQosFlowInformation {\n");
    
    sb.append("    maxFbrDl: ").append(toIndentedString(maxFbrDl)).append("\n");
    sb.append("    maxFbrUl: ").append(toIndentedString(maxFbrUl)).append("\n");
    sb.append("    guaFbrDl: ").append(toIndentedString(guaFbrDl)).append("\n");
    sb.append("    guaFbrUl: ").append(toIndentedString(guaFbrUl)).append("\n");
    sb.append("    notifControl: ").append(toIndentedString(notifControl)).append("\n");
    sb.append("    maxPacketLossRateDl: ").append(toIndentedString(maxPacketLossRateDl)).append("\n");
    sb.append("    maxPacketLossRateUl: ").append(toIndentedString(maxPacketLossRateUl)).append("\n");
    sb.append("    alternativeQosProfileList: ").append(toIndentedString(alternativeQosProfileList)).append("\n");
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

