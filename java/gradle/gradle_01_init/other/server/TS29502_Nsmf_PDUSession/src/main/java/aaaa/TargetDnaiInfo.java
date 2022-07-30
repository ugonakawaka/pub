package aaaa;

import java.util.Objects;
import aaaa.SmfSelectionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Target DNAI Information
 */
@ApiModel(description = "Target DNAI Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class TargetDnaiInfo   {
  @JsonProperty("targetDnai")
  private String targetDnai;

  @JsonProperty("smfSelectionType")
  private SmfSelectionType smfSelectionType;

  public TargetDnaiInfo targetDnai(String targetDnai) {
    this.targetDnai = targetDnai;
    return this;
  }

  /**
   * DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.
   * @return targetDnai
  */
  @ApiModelProperty(required = true, value = "DNAI (Data network access identifier), see clause 5.6.7 of 3GPP TS 23.501.")
  @NotNull


  public String getTargetDnai() {
    return targetDnai;
  }

  public void setTargetDnai(String targetDnai) {
    this.targetDnai = targetDnai;
  }

  public TargetDnaiInfo smfSelectionType(SmfSelectionType smfSelectionType) {
    this.smfSelectionType = smfSelectionType;
    return this;
  }

  /**
   * Get smfSelectionType
   * @return smfSelectionType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SmfSelectionType getSmfSelectionType() {
    return smfSelectionType;
  }

  public void setSmfSelectionType(SmfSelectionType smfSelectionType) {
    this.smfSelectionType = smfSelectionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetDnaiInfo targetDnaiInfo = (TargetDnaiInfo) o;
    return Objects.equals(this.targetDnai, targetDnaiInfo.targetDnai) &&
        Objects.equals(this.smfSelectionType, targetDnaiInfo.smfSelectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetDnai, smfSelectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetDnaiInfo {\n");
    
    sb.append("    targetDnai: ").append(toIndentedString(targetDnai)).append("\n");
    sb.append("    smfSelectionType: ").append(toIndentedString(smfSelectionType)).append("\n");
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

