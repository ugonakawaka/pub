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
 * Represents the NGAP cause.
 */
@ApiModel(description = "Represents the NGAP cause.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class NgApCause   {
  @JsonProperty("group")
  private Integer group;

  @JsonProperty("value")
  private Integer value;

  public NgApCause group(Integer group) {
    this.group = group;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return group
  */
  @ApiModelProperty(required = true, value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")
  @NotNull

@Min(0)
  public Integer getGroup() {
    return group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public NgApCause value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
   * minimum: 0
   * @return value
  */
  @ApiModelProperty(required = true, value = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")
  @NotNull

@Min(0)
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NgApCause ngApCause = (NgApCause) o;
    return Objects.equals(this.group, ngApCause.group) &&
        Objects.equals(this.value, ngApCause.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NgApCause {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

