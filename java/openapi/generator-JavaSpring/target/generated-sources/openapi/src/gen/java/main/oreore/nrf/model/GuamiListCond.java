package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.Guami;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of AMFs, based on their GUAMIs
 */
@ApiModel(description = "Subscription to a set of AMFs, based on their GUAMIs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class GuamiListCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("guamiList")
  @Valid
  private List<Guami> guamiList = new ArrayList<>();

  public GuamiListCond guamiList(List<Guami> guamiList) {
    this.guamiList = guamiList;
    return this;
  }

  public GuamiListCond addGuamiListItem(Guami guamiListItem) {
    this.guamiList.add(guamiListItem);
    return this;
  }

  /**
   * Get guamiList
   * @return guamiList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Guami> getGuamiList() {
    return guamiList;
  }

  public void setGuamiList(List<Guami> guamiList) {
    this.guamiList = guamiList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuamiListCond guamiListCond = (GuamiListCond) o;
    return Objects.equals(this.guamiList, guamiListCond.guamiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guamiList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuamiListCond {\n");
    
    sb.append("    guamiList: ").append(toIndentedString(guamiList)).append("\n");
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

