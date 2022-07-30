package aaaa;

import java.util.Objects;
import aaaa.AdditionalQosFlowInfo;
import aaaa.Arp;
import aaaa.Dynamic5Qi;
import aaaa.GbrQosFlowInformation;
import aaaa.NonDynamic5Qi;
import aaaa.QosMonitoringReq;
import aaaa.ReflectiveQoSAttribute;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QoS flow profile
 */
@ApiModel(description = "QoS flow profile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class QosFlowProfile   {
  @JsonProperty("5qi")
  private Integer _5qi;

  @JsonProperty("nonDynamic5Qi")
  private NonDynamic5Qi nonDynamic5Qi;

  @JsonProperty("dynamic5Qi")
  private Dynamic5Qi dynamic5Qi;

  @JsonProperty("arp")
  private Arp arp;

  @JsonProperty("gbrQosFlowInfo")
  private GbrQosFlowInformation gbrQosFlowInfo;

  @JsonProperty("rqa")
  private ReflectiveQoSAttribute rqa;

  @JsonProperty("additionalQosFlowInfo")
  private AdditionalQosFlowInfo additionalQosFlowInfo;

  @JsonProperty("qosMonitoringReq")
  private QosMonitoringReq qosMonitoringReq;

  @JsonProperty("qosRepPeriod")
  private Integer qosRepPeriod;

  public QosFlowProfile _5qi(Integer _5qi) {
    this._5qi = _5qi;
    return this;
  }

  /**
   * Unsigned integer representing a 5G QoS Identifier (see clause 5.7.2.1 of 3GPP TS 23.501, within the range 0 to 255
   * minimum: 0
   * maximum: 255
   * @return _5qi
  */
  @ApiModelProperty(required = true, value = "Unsigned integer representing a 5G QoS Identifier (see clause 5.7.2.1 of 3GPP TS 23.501, within the range 0 to 255")
  @NotNull

@Min(0) @Max(255) 
  public Integer get5qi() {
    return _5qi;
  }

  public void set5qi(Integer _5qi) {
    this._5qi = _5qi;
  }

  public QosFlowProfile nonDynamic5Qi(NonDynamic5Qi nonDynamic5Qi) {
    this.nonDynamic5Qi = nonDynamic5Qi;
    return this;
  }

  /**
   * Get nonDynamic5Qi
   * @return nonDynamic5Qi
  */
  @ApiModelProperty(value = "")

  @Valid

  public NonDynamic5Qi getNonDynamic5Qi() {
    return nonDynamic5Qi;
  }

  public void setNonDynamic5Qi(NonDynamic5Qi nonDynamic5Qi) {
    this.nonDynamic5Qi = nonDynamic5Qi;
  }

  public QosFlowProfile dynamic5Qi(Dynamic5Qi dynamic5Qi) {
    this.dynamic5Qi = dynamic5Qi;
    return this;
  }

  /**
   * Get dynamic5Qi
   * @return dynamic5Qi
  */
  @ApiModelProperty(value = "")

  @Valid

  public Dynamic5Qi getDynamic5Qi() {
    return dynamic5Qi;
  }

  public void setDynamic5Qi(Dynamic5Qi dynamic5Qi) {
    this.dynamic5Qi = dynamic5Qi;
  }

  public QosFlowProfile arp(Arp arp) {
    this.arp = arp;
    return this;
  }

  /**
   * Get arp
   * @return arp
  */
  @ApiModelProperty(value = "")

  @Valid

  public Arp getArp() {
    return arp;
  }

  public void setArp(Arp arp) {
    this.arp = arp;
  }

  public QosFlowProfile gbrQosFlowInfo(GbrQosFlowInformation gbrQosFlowInfo) {
    this.gbrQosFlowInfo = gbrQosFlowInfo;
    return this;
  }

  /**
   * Get gbrQosFlowInfo
   * @return gbrQosFlowInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GbrQosFlowInformation getGbrQosFlowInfo() {
    return gbrQosFlowInfo;
  }

  public void setGbrQosFlowInfo(GbrQosFlowInformation gbrQosFlowInfo) {
    this.gbrQosFlowInfo = gbrQosFlowInfo;
  }

  public QosFlowProfile rqa(ReflectiveQoSAttribute rqa) {
    this.rqa = rqa;
    return this;
  }

  /**
   * Get rqa
   * @return rqa
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReflectiveQoSAttribute getRqa() {
    return rqa;
  }

  public void setRqa(ReflectiveQoSAttribute rqa) {
    this.rqa = rqa;
  }

  public QosFlowProfile additionalQosFlowInfo(AdditionalQosFlowInfo additionalQosFlowInfo) {
    this.additionalQosFlowInfo = additionalQosFlowInfo;
    return this;
  }

  /**
   * Get additionalQosFlowInfo
   * @return additionalQosFlowInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalQosFlowInfo getAdditionalQosFlowInfo() {
    return additionalQosFlowInfo;
  }

  public void setAdditionalQosFlowInfo(AdditionalQosFlowInfo additionalQosFlowInfo) {
    this.additionalQosFlowInfo = additionalQosFlowInfo;
  }

  public QosFlowProfile qosMonitoringReq(QosMonitoringReq qosMonitoringReq) {
    this.qosMonitoringReq = qosMonitoringReq;
    return this;
  }

  /**
   * Get qosMonitoringReq
   * @return qosMonitoringReq
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosMonitoringReq getQosMonitoringReq() {
    return qosMonitoringReq;
  }

  public void setQosMonitoringReq(QosMonitoringReq qosMonitoringReq) {
    this.qosMonitoringReq = qosMonitoringReq;
  }

  public QosFlowProfile qosRepPeriod(Integer qosRepPeriod) {
    this.qosRepPeriod = qosRepPeriod;
    return this;
  }

  /**
   * indicating a time in seconds.
   * @return qosRepPeriod
  */
  @ApiModelProperty(value = "indicating a time in seconds.")


  public Integer getQosRepPeriod() {
    return qosRepPeriod;
  }

  public void setQosRepPeriod(Integer qosRepPeriod) {
    this.qosRepPeriod = qosRepPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosFlowProfile qosFlowProfile = (QosFlowProfile) o;
    return Objects.equals(this._5qi, qosFlowProfile._5qi) &&
        Objects.equals(this.nonDynamic5Qi, qosFlowProfile.nonDynamic5Qi) &&
        Objects.equals(this.dynamic5Qi, qosFlowProfile.dynamic5Qi) &&
        Objects.equals(this.arp, qosFlowProfile.arp) &&
        Objects.equals(this.gbrQosFlowInfo, qosFlowProfile.gbrQosFlowInfo) &&
        Objects.equals(this.rqa, qosFlowProfile.rqa) &&
        Objects.equals(this.additionalQosFlowInfo, qosFlowProfile.additionalQosFlowInfo) &&
        Objects.equals(this.qosMonitoringReq, qosFlowProfile.qosMonitoringReq) &&
        Objects.equals(this.qosRepPeriod, qosFlowProfile.qosRepPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5qi, nonDynamic5Qi, dynamic5Qi, arp, gbrQosFlowInfo, rqa, additionalQosFlowInfo, qosMonitoringReq, qosRepPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosFlowProfile {\n");
    
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    nonDynamic5Qi: ").append(toIndentedString(nonDynamic5Qi)).append("\n");
    sb.append("    dynamic5Qi: ").append(toIndentedString(dynamic5Qi)).append("\n");
    sb.append("    arp: ").append(toIndentedString(arp)).append("\n");
    sb.append("    gbrQosFlowInfo: ").append(toIndentedString(gbrQosFlowInfo)).append("\n");
    sb.append("    rqa: ").append(toIndentedString(rqa)).append("\n");
    sb.append("    additionalQosFlowInfo: ").append(toIndentedString(additionalQosFlowInfo)).append("\n");
    sb.append("    qosMonitoringReq: ").append(toIndentedString(qosMonitoringReq)).append("\n");
    sb.append("    qosRepPeriod: ").append(toIndentedString(qosRepPeriod)).append("\n");
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

