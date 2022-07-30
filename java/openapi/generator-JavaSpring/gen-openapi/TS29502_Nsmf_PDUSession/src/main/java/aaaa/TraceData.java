package aaaa;

import java.util.Objects;
import aaaa.Ipv6Addr;
import aaaa.TraceDepth;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * contains Trace control and configuration parameters.
 */
@ApiModel(description = "contains Trace control and configuration parameters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class TraceData   {
  @JsonProperty("traceRef")
  private String traceRef;

  @JsonProperty("traceDepth")
  private TraceDepth traceDepth;

  @JsonProperty("neTypeList")
  private String neTypeList;

  @JsonProperty("eventList")
  private String eventList;

  @JsonProperty("collectionEntityIpv4Addr")
  private String collectionEntityIpv4Addr;

  @JsonProperty("collectionEntityIpv6Addr")
  private Ipv6Addr collectionEntityIpv6Addr;

  @JsonProperty("interfaceList")
  private String interfaceList;

  public TraceData traceRef(String traceRef) {
    this.traceRef = traceRef;
    return this;
  }

  /**
   * Trace Reference (see 3GPP TS 32.422).It shall be encoded as the concatenation of MCC, MNC and Trace ID as follows:<MCC><MNC>-<Trace ID>The Trace ID shall be encoded as a 3 octet string in hexadecimal representation. Each character in the Trace ID string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the Trace ID shall appear first in the string, and the character representing the 4 least significant bit of the Trace ID shall appear last in the string.
   * @return traceRef
  */
  @ApiModelProperty(required = true, value = "Trace Reference (see 3GPP TS 32.422).It shall be encoded as the concatenation of MCC, MNC and Trace ID as follows:<MCC><MNC>-<Trace ID>The Trace ID shall be encoded as a 3 octet string in hexadecimal representation. Each character in the Trace ID string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits of the Trace ID shall appear first in the string, and the character representing the 4 least significant bit of the Trace ID shall appear last in the string.")
  @NotNull

@Pattern(regexp="^[0-9]{3}[0-9]{2,3}-[A-Fa-f0-9]{6}$") 
  public String getTraceRef() {
    return traceRef;
  }

  public void setTraceRef(String traceRef) {
    this.traceRef = traceRef;
  }

  public TraceData traceDepth(TraceDepth traceDepth) {
    this.traceDepth = traceDepth;
    return this;
  }

  /**
   * Get traceDepth
   * @return traceDepth
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TraceDepth getTraceDepth() {
    return traceDepth;
  }

  public void setTraceDepth(TraceDepth traceDepth) {
    this.traceDepth = traceDepth;
  }

  public TraceData neTypeList(String neTypeList) {
    this.neTypeList = neTypeList;
    return this;
  }

  /**
   * List of NE Types (see 3GPP TS 32.422).It shall be encoded as an octet string in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits shall appear first in the string, and the character representing the 4 least significant bit shall appear last in the string.Octets shall be coded according to 3GPP TS 32.422.
   * @return neTypeList
  */
  @ApiModelProperty(required = true, value = "List of NE Types (see 3GPP TS 32.422).It shall be encoded as an octet string in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits shall appear first in the string, and the character representing the 4 least significant bit shall appear last in the string.Octets shall be coded according to 3GPP TS 32.422.")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]+$") 
  public String getNeTypeList() {
    return neTypeList;
  }

  public void setNeTypeList(String neTypeList) {
    this.neTypeList = neTypeList;
  }

  public TraceData eventList(String eventList) {
    this.eventList = eventList;
    return this;
  }

  /**
   * Triggering events (see 3GPP TS 32.422).It shall be encoded as an octet string in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits shall appear first in the string, and the character representing the 4 least significant bit shall appear last in the string.Octets shall be coded according to 3GPP TS 32.422.
   * @return eventList
  */
  @ApiModelProperty(required = true, value = "Triggering events (see 3GPP TS 32.422).It shall be encoded as an octet string in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits shall appear first in the string, and the character representing the 4 least significant bit shall appear last in the string.Octets shall be coded according to 3GPP TS 32.422.")
  @NotNull

@Pattern(regexp="^[A-Fa-f0-9]+$") 
  public String getEventList() {
    return eventList;
  }

  public void setEventList(String eventList) {
    this.eventList = eventList;
  }

  public TraceData collectionEntityIpv4Addr(String collectionEntityIpv4Addr) {
    this.collectionEntityIpv4Addr = collectionEntityIpv4Addr;
    return this;
  }

  /**
   * String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.
   * @return collectionEntityIpv4Addr
  */
  @ApiModelProperty(example = "198.51.100.1", value = "String identifying a IPv4 address formatted in the \"dotted decimal\" notation as defined in RFC 1166.")

@Pattern(regexp="^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$") 
  public String getCollectionEntityIpv4Addr() {
    return collectionEntityIpv4Addr;
  }

  public void setCollectionEntityIpv4Addr(String collectionEntityIpv4Addr) {
    this.collectionEntityIpv4Addr = collectionEntityIpv4Addr;
  }

  public TraceData collectionEntityIpv6Addr(Ipv6Addr collectionEntityIpv6Addr) {
    this.collectionEntityIpv6Addr = collectionEntityIpv6Addr;
    return this;
  }

  /**
   * Get collectionEntityIpv6Addr
   * @return collectionEntityIpv6Addr
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Addr getCollectionEntityIpv6Addr() {
    return collectionEntityIpv6Addr;
  }

  public void setCollectionEntityIpv6Addr(Ipv6Addr collectionEntityIpv6Addr) {
    this.collectionEntityIpv6Addr = collectionEntityIpv6Addr;
  }

  public TraceData interfaceList(String interfaceList) {
    this.interfaceList = interfaceList;
    return this;
  }

  /**
   * List of Interfaces (see 3GPP TS 32.422).It shall be encoded as an octet string in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits shall appear first in the string, and the character representing the 4 least significant bit shall appear last in the string.Octets shall be coded according to 3GPP TS 32.422. If this attribute is not present, all the interfaces applicable to the list of NE types indicated in the neTypeList attribute should be traced.
   * @return interfaceList
  */
  @ApiModelProperty(value = "List of Interfaces (see 3GPP TS 32.422).It shall be encoded as an octet string in hexadecimal representation. Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent 4 bits. The most significant character representing the 4 most significant bits shall appear first in the string, and the character representing the 4 least significant bit shall appear last in the string.Octets shall be coded according to 3GPP TS 32.422. If this attribute is not present, all the interfaces applicable to the list of NE types indicated in the neTypeList attribute should be traced.")

@Pattern(regexp="^[A-Fa-f0-9]+$") 
  public String getInterfaceList() {
    return interfaceList;
  }

  public void setInterfaceList(String interfaceList) {
    this.interfaceList = interfaceList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceData traceData = (TraceData) o;
    return Objects.equals(this.traceRef, traceData.traceRef) &&
        Objects.equals(this.traceDepth, traceData.traceDepth) &&
        Objects.equals(this.neTypeList, traceData.neTypeList) &&
        Objects.equals(this.eventList, traceData.eventList) &&
        Objects.equals(this.collectionEntityIpv4Addr, traceData.collectionEntityIpv4Addr) &&
        Objects.equals(this.collectionEntityIpv6Addr, traceData.collectionEntityIpv6Addr) &&
        Objects.equals(this.interfaceList, traceData.interfaceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceRef, traceDepth, neTypeList, eventList, collectionEntityIpv4Addr, collectionEntityIpv6Addr, interfaceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceData {\n");
    
    sb.append("    traceRef: ").append(toIndentedString(traceRef)).append("\n");
    sb.append("    traceDepth: ").append(toIndentedString(traceDepth)).append("\n");
    sb.append("    neTypeList: ").append(toIndentedString(neTypeList)).append("\n");
    sb.append("    eventList: ").append(toIndentedString(eventList)).append("\n");
    sb.append("    collectionEntityIpv4Addr: ").append(toIndentedString(collectionEntityIpv4Addr)).append("\n");
    sb.append("    collectionEntityIpv6Addr: ").append(toIndentedString(collectionEntityIpv6Addr)).append("\n");
    sb.append("    interfaceList: ").append(toIndentedString(interfaceList)).append("\n");
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

