package aaaa;

import java.util.Objects;
import aaaa.Arp;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EBI to ARP mapping
 */
@ApiModel(description = "EBI to ARP mapping")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
public class EbiArpMapping   {
  @JsonProperty("epsBearerId")
  private Integer epsBearerId;

  @JsonProperty("arp")
  private Arp arp;

  public EbiArpMapping epsBearerId(Integer epsBearerId) {
    this.epsBearerId = epsBearerId;
    return this;
  }

  /**
   * EPS Bearer Identifier
   * minimum: 0
   * maximum: 15
   * @return epsBearerId
  */
  @ApiModelProperty(required = true, value = "EPS Bearer Identifier")
  @NotNull

@Min(0) @Max(15) 
  public Integer getEpsBearerId() {
    return epsBearerId;
  }

  public void setEpsBearerId(Integer epsBearerId) {
    this.epsBearerId = epsBearerId;
  }

  public EbiArpMapping arp(Arp arp) {
    this.arp = arp;
    return this;
  }

  /**
   * Get arp
   * @return arp
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Arp getArp() {
    return arp;
  }

  public void setArp(Arp arp) {
    this.arp = arp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EbiArpMapping ebiArpMapping = (EbiArpMapping) o;
    return Objects.equals(this.epsBearerId, ebiArpMapping.epsBearerId) &&
        Objects.equals(this.arp, ebiArpMapping.arp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsBearerId, arp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EbiArpMapping {\n");
    
    sb.append("    epsBearerId: ").append(toIndentedString(epsBearerId)).append("\n");
    sb.append("    arp: ").append(toIndentedString(arp)).append("\n");
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

