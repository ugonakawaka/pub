package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This parameter provides information about the referenced binary body data.
 */
@ApiModel(description = "This parameter provides information about the referenced binary body data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class RefToBinaryData   {
  @JsonProperty("contentId")
  private String contentId;

  public RefToBinaryData contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * This IE shall contain the value of the Content-ID header of the referenced binary body part.
   * @return contentId
  */
  @ApiModelProperty(required = true, value = "This IE shall contain the value of the Content-ID header of the referenced binary body part.")
  @NotNull


  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefToBinaryData refToBinaryData = (RefToBinaryData) o;
    return Objects.equals(this.contentId, refToBinaryData.contentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefToBinaryData {\n");
    
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
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

