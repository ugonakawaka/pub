package aaaa;

import java.util.Objects;
import aaaa.PlmnId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains a Cell Global Identification as defined in 3GPP TS 23.003, clause 4.3.1.
 */
@ApiModel(description = "Contains a Cell Global Identification as defined in 3GPP TS 23.003, clause 4.3.1.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class CellGlobalId   {
  @JsonProperty("plmnId")
  private PlmnId plmnId;

  @JsonProperty("lac")
  private String lac;

  @JsonProperty("cellId")
  private String cellId;

  public CellGlobalId plmnId(PlmnId plmnId) {
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

  public CellGlobalId lac(String lac) {
    this.lac = lac;
    return this;
  }

  /**
   * Get lac
   * @return lac
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]{4}$") 
  public String getLac() {
    return lac;
  }

  public void setLac(String lac) {
    this.lac = lac;
  }

  public CellGlobalId cellId(String cellId) {
    this.cellId = cellId;
    return this;
  }

  /**
   * Get cellId
   * @return cellId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]{4}$") 
  public String getCellId() {
    return cellId;
  }

  public void setCellId(String cellId) {
    this.cellId = cellId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellGlobalId cellGlobalId = (CellGlobalId) o;
    return Objects.equals(this.plmnId, cellGlobalId.plmnId) &&
        Objects.equals(this.lac, cellGlobalId.lac) &&
        Objects.equals(this.cellId, cellGlobalId.cellId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, lac, cellId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellGlobalId {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    lac: ").append(toIndentedString(lac)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
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

