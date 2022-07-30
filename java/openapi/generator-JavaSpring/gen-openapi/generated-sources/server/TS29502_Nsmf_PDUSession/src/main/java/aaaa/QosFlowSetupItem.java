package aaaa;

import java.util.Objects;
import aaaa.QosFlowAccessType;
import aaaa.QosFlowProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Individual QoS flow to setup
 */
@ApiModel(description = "Individual QoS flow to setup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class QosFlowSetupItem   {
  @JsonProperty("qfi")
  private Integer qfi;

  @JsonProperty("qosRules")
  private byte[] qosRules;

  @JsonProperty("ebi")
  private Integer ebi;

  @JsonProperty("qosFlowDescription")
  private byte[] qosFlowDescription;

  @JsonProperty("qosFlowProfile")
  private QosFlowProfile qosFlowProfile;

  @JsonProperty("associatedAnType")
  private QosFlowAccessType associatedAnType;

  @JsonProperty("defaultQosRuleInd")
  private Boolean defaultQosRuleInd;

  public QosFlowSetupItem qfi(Integer qfi) {
    this.qfi = qfi;
    return this;
  }

  /**
   * Unsigned integer identifying a QoS flow, within the range 0 to 63.
   * minimum: 0
   * maximum: 63
   * @return qfi
  */
  @ApiModelProperty(required = true, value = "Unsigned integer identifying a QoS flow, within the range 0 to 63.")
  @NotNull

@Min(0) @Max(63) 
  public Integer getQfi() {
    return qfi;
  }

  public void setQfi(Integer qfi) {
    this.qfi = qfi;
  }

  public QosFlowSetupItem qosRules(byte[] qosRules) {
    this.qosRules = qosRules;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return qosRules
  */
  @ApiModelProperty(required = true, value = "string with format \"bytes\" as defined in OpenAPI")
  @NotNull


  public byte[] getQosRules() {
    return qosRules;
  }

  public void setQosRules(byte[] qosRules) {
    this.qosRules = qosRules;
  }

  public QosFlowSetupItem ebi(Integer ebi) {
    this.ebi = ebi;
    return this;
  }

  /**
   * EPS Bearer Identifier
   * minimum: 0
   * maximum: 15
   * @return ebi
  */
  @ApiModelProperty(value = "EPS Bearer Identifier")

@Min(0) @Max(15) 
  public Integer getEbi() {
    return ebi;
  }

  public void setEbi(Integer ebi) {
    this.ebi = ebi;
  }

  public QosFlowSetupItem qosFlowDescription(byte[] qosFlowDescription) {
    this.qosFlowDescription = qosFlowDescription;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return qosFlowDescription
  */
  @ApiModelProperty(value = "string with format \"bytes\" as defined in OpenAPI")


  public byte[] getQosFlowDescription() {
    return qosFlowDescription;
  }

  public void setQosFlowDescription(byte[] qosFlowDescription) {
    this.qosFlowDescription = qosFlowDescription;
  }

  public QosFlowSetupItem qosFlowProfile(QosFlowProfile qosFlowProfile) {
    this.qosFlowProfile = qosFlowProfile;
    return this;
  }

  /**
   * Get qosFlowProfile
   * @return qosFlowProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosFlowProfile getQosFlowProfile() {
    return qosFlowProfile;
  }

  public void setQosFlowProfile(QosFlowProfile qosFlowProfile) {
    this.qosFlowProfile = qosFlowProfile;
  }

  public QosFlowSetupItem associatedAnType(QosFlowAccessType associatedAnType) {
    this.associatedAnType = associatedAnType;
    return this;
  }

  /**
   * Get associatedAnType
   * @return associatedAnType
  */
  @ApiModelProperty(value = "")

  @Valid

  public QosFlowAccessType getAssociatedAnType() {
    return associatedAnType;
  }

  public void setAssociatedAnType(QosFlowAccessType associatedAnType) {
    this.associatedAnType = associatedAnType;
  }

  public QosFlowSetupItem defaultQosRuleInd(Boolean defaultQosRuleInd) {
    this.defaultQosRuleInd = defaultQosRuleInd;
    return this;
  }

  /**
   * Get defaultQosRuleInd
   * @return defaultQosRuleInd
  */
  @ApiModelProperty(value = "")


  public Boolean getDefaultQosRuleInd() {
    return defaultQosRuleInd;
  }

  public void setDefaultQosRuleInd(Boolean defaultQosRuleInd) {
    this.defaultQosRuleInd = defaultQosRuleInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosFlowSetupItem qosFlowSetupItem = (QosFlowSetupItem) o;
    return Objects.equals(this.qfi, qosFlowSetupItem.qfi) &&
        Arrays.equals(this.qosRules, qosFlowSetupItem.qosRules) &&
        Objects.equals(this.ebi, qosFlowSetupItem.ebi) &&
        Arrays.equals(this.qosFlowDescription, qosFlowSetupItem.qosFlowDescription) &&
        Objects.equals(this.qosFlowProfile, qosFlowSetupItem.qosFlowProfile) &&
        Objects.equals(this.associatedAnType, qosFlowSetupItem.associatedAnType) &&
        Objects.equals(this.defaultQosRuleInd, qosFlowSetupItem.defaultQosRuleInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qfi, Arrays.hashCode(qosRules), ebi, Arrays.hashCode(qosFlowDescription), qosFlowProfile, associatedAnType, defaultQosRuleInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosFlowSetupItem {\n");
    
    sb.append("    qfi: ").append(toIndentedString(qfi)).append("\n");
    sb.append("    qosRules: ").append(toIndentedString(qosRules)).append("\n");
    sb.append("    ebi: ").append(toIndentedString(ebi)).append("\n");
    sb.append("    qosFlowDescription: ").append(toIndentedString(qosFlowDescription)).append("\n");
    sb.append("    qosFlowProfile: ").append(toIndentedString(qosFlowProfile)).append("\n");
    sb.append("    associatedAnType: ").append(toIndentedString(associatedAnType)).append("\n");
    sb.append("    defaultQosRuleInd: ").append(toIndentedString(defaultQosRuleInd)).append("\n");
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

