package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import oreore.nrf.model.PatchOperation;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * PatchItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class PatchItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("op")
  private PatchOperation op;

  @JsonProperty("path")
  private String path;

  @JsonProperty("from")
  private String from;

  @JsonProperty("value")
  private JsonNullable<Object> value = JsonNullable.undefined();

  public PatchItem op(PatchOperation op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PatchOperation getOp() {
    return op;
  }

  public void setOp(PatchOperation op) {
    this.op = op;
  }

  public PatchItem path(String path) {
    this.path = path;
    return this;
  }

  /**
   * contains a JSON pointer value (as defined in IETF RFC 6901) that references a location of a resource on which the patch operation shall be performed.
   * @return path
  */
  @ApiModelProperty(required = true, value = "contains a JSON pointer value (as defined in IETF RFC 6901) that references a location of a resource on which the patch operation shall be performed.")
  @NotNull


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PatchItem from(String from) {
    this.from = from;
    return this;
  }

  /**
   * indicates the path of the source JSON element (according to JSON Pointer syntax) being moved or copied to the location indicated by the \"path\" attribute.
   * @return from
  */
  @ApiModelProperty(value = "indicates the path of the source JSON element (according to JSON Pointer syntax) being moved or copied to the location indicated by the \"path\" attribute.")


  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public PatchItem value(Object value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getValue() {
    return value;
  }

  public void setValue(JsonNullable<Object> value) {
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
    PatchItem patchItem = (PatchItem) o;
    return Objects.equals(this.op, patchItem.op) &&
        Objects.equals(this.path, patchItem.path) &&
        Objects.equals(this.from, patchItem.from) &&
        Objects.equals(this.value, patchItem.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, from, value);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchItem {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

