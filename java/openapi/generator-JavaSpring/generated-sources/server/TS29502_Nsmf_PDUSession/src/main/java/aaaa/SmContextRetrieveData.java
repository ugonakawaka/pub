package aaaa;

import java.util.Objects;
import aaaa.MmeCapabilities;
import aaaa.PlmnId;
import aaaa.SmContextType;
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
 * Data within Retrieve SM Context Request
 */
@ApiModel(description = "Data within Retrieve SM Context Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class SmContextRetrieveData   {
  @JsonProperty("targetMmeCap")
  private MmeCapabilities targetMmeCap;

  @JsonProperty("smContextType")
  private SmContextType smContextType;

  @JsonProperty("servingNetwork")
  private PlmnId servingNetwork;

  @JsonProperty("notToTransferEbiList")
  @Valid
  private List<Integer> notToTransferEbiList = null;

  @JsonProperty("ranUnchangedInd")
  private Boolean ranUnchangedInd = false;

  public SmContextRetrieveData targetMmeCap(MmeCapabilities targetMmeCap) {
    this.targetMmeCap = targetMmeCap;
    return this;
  }

  /**
   * Get targetMmeCap
   * @return targetMmeCap
  */
  @ApiModelProperty(value = "")

  @Valid

  public MmeCapabilities getTargetMmeCap() {
    return targetMmeCap;
  }

  public void setTargetMmeCap(MmeCapabilities targetMmeCap) {
    this.targetMmeCap = targetMmeCap;
  }

  public SmContextRetrieveData smContextType(SmContextType smContextType) {
    this.smContextType = smContextType;
    return this;
  }

  /**
   * Get smContextType
   * @return smContextType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmContextType getSmContextType() {
    return smContextType;
  }

  public void setSmContextType(SmContextType smContextType) {
    this.smContextType = smContextType;
  }

  public SmContextRetrieveData servingNetwork(PlmnId servingNetwork) {
    this.servingNetwork = servingNetwork;
    return this;
  }

  /**
   * Get servingNetwork
   * @return servingNetwork
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlmnId getServingNetwork() {
    return servingNetwork;
  }

  public void setServingNetwork(PlmnId servingNetwork) {
    this.servingNetwork = servingNetwork;
  }

  public SmContextRetrieveData notToTransferEbiList(List<Integer> notToTransferEbiList) {
    this.notToTransferEbiList = notToTransferEbiList;
    return this;
  }

  public SmContextRetrieveData addNotToTransferEbiListItem(Integer notToTransferEbiListItem) {
    if (this.notToTransferEbiList == null) {
      this.notToTransferEbiList = new ArrayList<>();
    }
    this.notToTransferEbiList.add(notToTransferEbiListItem);
    return this;
  }

  /**
   * Get notToTransferEbiList
   * @return notToTransferEbiList
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<Integer> getNotToTransferEbiList() {
    return notToTransferEbiList;
  }

  public void setNotToTransferEbiList(List<Integer> notToTransferEbiList) {
    this.notToTransferEbiList = notToTransferEbiList;
  }

  public SmContextRetrieveData ranUnchangedInd(Boolean ranUnchangedInd) {
    this.ranUnchangedInd = ranUnchangedInd;
    return this;
  }

  /**
   * Get ranUnchangedInd
   * @return ranUnchangedInd
  */
  @ApiModelProperty(value = "")


  public Boolean getRanUnchangedInd() {
    return ranUnchangedInd;
  }

  public void setRanUnchangedInd(Boolean ranUnchangedInd) {
    this.ranUnchangedInd = ranUnchangedInd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmContextRetrieveData smContextRetrieveData = (SmContextRetrieveData) o;
    return Objects.equals(this.targetMmeCap, smContextRetrieveData.targetMmeCap) &&
        Objects.equals(this.smContextType, smContextRetrieveData.smContextType) &&
        Objects.equals(this.servingNetwork, smContextRetrieveData.servingNetwork) &&
        Objects.equals(this.notToTransferEbiList, smContextRetrieveData.notToTransferEbiList) &&
        Objects.equals(this.ranUnchangedInd, smContextRetrieveData.ranUnchangedInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetMmeCap, smContextType, servingNetwork, notToTransferEbiList, ranUnchangedInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmContextRetrieveData {\n");
    
    sb.append("    targetMmeCap: ").append(toIndentedString(targetMmeCap)).append("\n");
    sb.append("    smContextType: ").append(toIndentedString(smContextType)).append("\n");
    sb.append("    servingNetwork: ").append(toIndentedString(servingNetwork)).append("\n");
    sb.append("    notToTransferEbiList: ").append(toIndentedString(notToTransferEbiList)).append("\n");
    sb.append("    ranUnchangedInd: ").append(toIndentedString(ranUnchangedInd)).append("\n");
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

