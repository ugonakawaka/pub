package aaaa;

import java.util.Objects;
import aaaa.GlobalRanNodeId;
import aaaa.Tai;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates a NG RAN as target of the handover
 */
@ApiModel(description = "Indicates a NG RAN as target of the handover")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class NgRanTargetId   {
  @JsonProperty("ranNodeId")
  private GlobalRanNodeId ranNodeId;

  @JsonProperty("tai")
  private Tai tai;

  public NgRanTargetId ranNodeId(GlobalRanNodeId ranNodeId) {
    this.ranNodeId = ranNodeId;
    return this;
  }

  /**
   * Get ranNodeId
   * @return ranNodeId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GlobalRanNodeId getRanNodeId() {
    return ranNodeId;
  }

  public void setRanNodeId(GlobalRanNodeId ranNodeId) {
    this.ranNodeId = ranNodeId;
  }

  public NgRanTargetId tai(Tai tai) {
    this.tai = tai;
    return this;
  }

  /**
   * Get tai
   * @return tai
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Tai getTai() {
    return tai;
  }

  public void setTai(Tai tai) {
    this.tai = tai;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NgRanTargetId ngRanTargetId = (NgRanTargetId) o;
    return Objects.equals(this.ranNodeId, ngRanTargetId.ranNodeId) &&
        Objects.equals(this.tai, ngRanTargetId.tai);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranNodeId, tai);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NgRanTargetId {\n");
    
    sb.append("    ranNodeId: ").append(toIndentedString(ranNodeId)).append("\n");
    sb.append("    tai: ").append(toIndentedString(tai)).append("\n");
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

