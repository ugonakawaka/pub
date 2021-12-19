package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import oreore.nrf.model.ChangeType;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * ChangeItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class ChangeItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("op")
  private ChangeType op;

  @JsonProperty("path")
  private String path;

  @JsonProperty("from")
  private String from;

  @JsonProperty("origValue")
  private JsonNullable<Object> origValue = JsonNullable.undefined();

  @JsonProperty("newValue")
  private JsonNullable<Object> newValue = JsonNullable.undefined();

  public ChangeItem op(ChangeType op) {
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

  public ChangeType getOp() {
    return op;
  }

  public void setOp(ChangeType op) {
    this.op = op;
  }

  public ChangeItem path(String path) {
    this.path = path;
    return this;
  }

  /**
   * contains a JSON pointer value (as defined in IETF RFC 6901) that references a target location within the resource on which the change has been applied.
   * @return path
  */
  @ApiModelProperty(required = true, value = "contains a JSON pointer value (as defined in IETF RFC 6901) that references a target location within the resource on which the change has been applied.")
  @NotNull


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ChangeItem from(String from) {
    this.from = from;
    return this;
  }

  /**
   * indicates the path of the source JSON element (according to JSON Pointer syntax) being moved or copied to the location indicated by the \"path\" attribute. It shall be present if the \"op\" attribute is of value \"MOVE\".
   * @return from
  */
  @ApiModelProperty(value = "indicates the path of the source JSON element (according to JSON Pointer syntax) being moved or copied to the location indicated by the \"path\" attribute. It shall be present if the \"op\" attribute is of value \"MOVE\".")


  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public ChangeItem origValue(Object origValue) {
    this.origValue = JsonNullable.of(origValue);
    return this;
  }

  /**
   * Get origValue
   * @return origValue
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getOrigValue() {
    return origValue;
  }

  public void setOrigValue(JsonNullable<Object> origValue) {
    this.origValue = origValue;
  }

  public ChangeItem newValue(Object newValue) {
    this.newValue = JsonNullable.of(newValue);
    return this;
  }

  /**
   * Get newValue
   * @return newValue
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getNewValue() {
    return newValue;
  }

  public void setNewValue(JsonNullable<Object> newValue) {
    this.newValue = newValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeItem changeItem = (ChangeItem) o;
    return Objects.equals(this.op, changeItem.op) &&
        Objects.equals(this.path, changeItem.path) &&
        Objects.equals(this.from, changeItem.from) &&
        Objects.equals(this.origValue, changeItem.origValue) &&
        Objects.equals(this.newValue, changeItem.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, from, origValue, newValue);
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
    sb.append("class ChangeItem {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    origValue: ").append(toIndentedString(origValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

