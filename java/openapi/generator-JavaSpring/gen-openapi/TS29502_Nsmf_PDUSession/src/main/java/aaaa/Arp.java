package aaaa;

import java.util.Objects;
import aaaa.PreemptionCapability;
import aaaa.PreemptionVulnerability;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains Allocation and Retention Priority information.
 */
@ApiModel(description = "Contains Allocation and Retention Priority information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class Arp   {
  @JsonProperty("priorityLevel")
  private JsonNullable<Integer> priorityLevel = JsonNullable.undefined();

  @JsonProperty("preemptCap")
  private PreemptionCapability preemptCap;

  @JsonProperty("preemptVuln")
  private PreemptionVulnerability preemptVuln;

  public Arp priorityLevel(Integer priorityLevel) {
    this.priorityLevel = JsonNullable.of(priorityLevel);
    return this;
  }

  /**
   * nullable true shall not be used for this attribute. Unsigned integer indicating the ARP Priority Level (see clause 5.7.2.2 of 3GPP TS 23.501, within the range 1 to 15.Values are ordered in decreasing order of priority, i.e. with 1 as the highest priority and 15 as the lowest priority.
   * minimum: 1
   * maximum: 15
   * @return priorityLevel
  */
  @ApiModelProperty(required = true, value = "nullable true shall not be used for this attribute. Unsigned integer indicating the ARP Priority Level (see clause 5.7.2.2 of 3GPP TS 23.501, within the range 1 to 15.Values are ordered in decreasing order of priority, i.e. with 1 as the highest priority and 15 as the lowest priority.")
  @NotNull

@Min(1) @Max(15) 
  public JsonNullable<Integer> getPriorityLevel() {
    return priorityLevel;
  }

  public void setPriorityLevel(JsonNullable<Integer> priorityLevel) {
    this.priorityLevel = priorityLevel;
  }

  public Arp preemptCap(PreemptionCapability preemptCap) {
    this.preemptCap = preemptCap;
    return this;
  }

  /**
   * Get preemptCap
   * @return preemptCap
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PreemptionCapability getPreemptCap() {
    return preemptCap;
  }

  public void setPreemptCap(PreemptionCapability preemptCap) {
    this.preemptCap = preemptCap;
  }

  public Arp preemptVuln(PreemptionVulnerability preemptVuln) {
    this.preemptVuln = preemptVuln;
    return this;
  }

  /**
   * Get preemptVuln
   * @return preemptVuln
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PreemptionVulnerability getPreemptVuln() {
    return preemptVuln;
  }

  public void setPreemptVuln(PreemptionVulnerability preemptVuln) {
    this.preemptVuln = preemptVuln;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Arp arp = (Arp) o;
    return Objects.equals(this.priorityLevel, arp.priorityLevel) &&
        Objects.equals(this.preemptCap, arp.preemptCap) &&
        Objects.equals(this.preemptVuln, arp.preemptVuln);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityLevel, preemptCap, preemptVuln);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Arp {\n");
    
    sb.append("    priorityLevel: ").append(toIndentedString(priorityLevel)).append("\n");
    sb.append("    preemptCap: ").append(toIndentedString(preemptCap)).append("\n");
    sb.append("    preemptVuln: ").append(toIndentedString(preemptVuln)).append("\n");
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

