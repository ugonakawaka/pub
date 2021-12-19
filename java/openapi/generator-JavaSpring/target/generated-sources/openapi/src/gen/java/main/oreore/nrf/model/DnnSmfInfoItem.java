package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.AnyOfstringstring;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Set of parameters supported by SMF for a given DNN
 */
@ApiModel(description = "Set of parameters supported by SMF for a given DNN")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class DnnSmfInfoItem  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dnn")
  private JsonNullable<AnyOfstringstring> dnn = JsonNullable.undefined();

  @JsonProperty("dnaiList")
  @Valid
  private List<AnyOfstringstring> dnaiList = null;

  public DnnSmfInfoItem dnn(AnyOfstringstring dnn) {
    this.dnn = JsonNullable.of(dnn);
    return this;
  }

  /**
   * Get dnn
   * @return dnn
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<AnyOfstringstring> getDnn() {
    return dnn;
  }

  public void setDnn(JsonNullable<AnyOfstringstring> dnn) {
    this.dnn = dnn;
  }

  public DnnSmfInfoItem dnaiList(List<AnyOfstringstring> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public DnnSmfInfoItem addDnaiListItem(AnyOfstringstring dnaiListItem) {
    if (this.dnaiList == null) {
      this.dnaiList = new ArrayList<>();
    }
    this.dnaiList.add(dnaiListItem);
    return this;
  }

  /**
   * Get dnaiList
   * @return dnaiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<AnyOfstringstring> getDnaiList() {
    return dnaiList;
  }

  public void setDnaiList(List<AnyOfstringstring> dnaiList) {
    this.dnaiList = dnaiList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnnSmfInfoItem dnnSmfInfoItem = (DnnSmfInfoItem) o;
    return Objects.equals(this.dnn, dnnSmfInfoItem.dnn) &&
        Objects.equals(this.dnaiList, dnnSmfInfoItem.dnaiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnn, dnaiList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnnSmfInfoItem {\n");
    
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
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

