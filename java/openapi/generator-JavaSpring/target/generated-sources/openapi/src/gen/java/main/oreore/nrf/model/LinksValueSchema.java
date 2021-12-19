package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import oreore.nrf.model.Link;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * A list of mutually exclusive alternatives of 1 or more links
 */
@ApiModel(description = "A list of mutually exclusive alternatives of 1 or more links")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class LinksValueSchema  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("href")
  private String href;

  public LinksValueSchema href(String href) {
    this.href = href;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return href
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksValueSchema linksValueSchema = (LinksValueSchema) o;
    return Objects.equals(this.href, linksValueSchema.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksValueSchema {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

