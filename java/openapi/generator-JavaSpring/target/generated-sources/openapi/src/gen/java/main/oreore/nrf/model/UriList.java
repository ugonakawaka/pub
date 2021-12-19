package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oreore.nrf.model.LinksValueSchema;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Represents a set of URIs following the 3GPP hypermedia format (containing a \&quot;_links\&quot; attribute).
 */
@ApiModel(description = "Represents a set of URIs following the 3GPP hypermedia format (containing a \"_links\" attribute).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class UriList  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("_links")
  @Valid
  private Map<String, LinksValueSchema> links = null;

  @JsonProperty("totalItemCount")
  private Integer totalItemCount;

  public UriList links(Map<String, LinksValueSchema> links) {
    this.links = links;
    return this;
  }

  public UriList putLinksItem(String key, LinksValueSchema linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * List of the URI of NF instances. It has two members whose names are item and self. The item attribute contains an array of URIs.'
   * @return links
  */
  @ApiModelProperty(value = "List of the URI of NF instances. It has two members whose names are item and self. The item attribute contains an array of URIs.'")

  @Valid
@Size(min = 1) 
  public Map<String, LinksValueSchema> getLinks() {
    return links;
  }

  public void setLinks(Map<String, LinksValueSchema> links) {
    this.links = links;
  }

  public UriList totalItemCount(Integer totalItemCount) {
    this.totalItemCount = totalItemCount;
    return this;
  }

  /**
   * Get totalItemCount
   * @return totalItemCount
  */
  @ApiModelProperty(value = "")


  public Integer getTotalItemCount() {
    return totalItemCount;
  }

  public void setTotalItemCount(Integer totalItemCount) {
    this.totalItemCount = totalItemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UriList uriList = (UriList) o;
    return Objects.equals(this.links, uriList.links) &&
        Objects.equals(this.totalItemCount, uriList.totalItemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, totalItemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UriList {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    totalItemCount: ").append(toIndentedString(totalItemCount)).append("\n");
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

