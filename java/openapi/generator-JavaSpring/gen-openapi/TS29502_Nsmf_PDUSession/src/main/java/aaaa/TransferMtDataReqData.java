package aaaa;

import java.util.Objects;
import aaaa.RefToBinaryData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Transfer MT Data Request
 */
@ApiModel(description = "Data within Transfer MT Data Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class TransferMtDataReqData   {
  @JsonProperty("mtData")
  private RefToBinaryData mtData;

  public TransferMtDataReqData mtData(RefToBinaryData mtData) {
    this.mtData = mtData;
    return this;
  }

  /**
   * Get mtData
   * @return mtData
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RefToBinaryData getMtData() {
    return mtData;
  }

  public void setMtData(RefToBinaryData mtData) {
    this.mtData = mtData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferMtDataReqData transferMtDataReqData = (TransferMtDataReqData) o;
    return Objects.equals(this.mtData, transferMtDataReqData.mtData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mtData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferMtDataReqData {\n");
    
    sb.append("    mtData: ").append(toIndentedString(mtData)).append("\n");
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

