package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NFs based on their Service Set Id
 */
@ApiModel(description = "Subscription to a set of NFs based on their Service Set Id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NfServiceSetCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nfServiceSetId")
  private String nfServiceSetId;

  @JsonProperty("nfSetId")
  private String nfSetId;

  public NfServiceSetCond nfServiceSetId(String nfServiceSetId) {
    this.nfServiceSetId = nfServiceSetId;
    return this;
  }

  /**
   * NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return nfServiceSetId
  */
  @ApiModelProperty(required = true, value = "NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")
  @NotNull


  public String getNfServiceSetId() {
    return nfServiceSetId;
  }

  public void setNfServiceSetId(String nfServiceSetId) {
    this.nfServiceSetId = nfServiceSetId;
  }

  public NfServiceSetCond nfSetId(String nfSetId) {
    this.nfSetId = nfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return nfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getNfSetId() {
    return nfSetId;
  }

  public void setNfSetId(String nfSetId) {
    this.nfSetId = nfSetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfServiceSetCond nfServiceSetCond = (NfServiceSetCond) o;
    return Objects.equals(this.nfServiceSetId, nfServiceSetCond.nfServiceSetId) &&
        Objects.equals(this.nfSetId, nfServiceSetCond.nfSetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfServiceSetId, nfSetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfServiceSetCond {\n");
    
    sb.append("    nfServiceSetId: ").append(toIndentedString(nfServiceSetId)).append("\n");
    sb.append("    nfSetId: ").append(toIndentedString(nfSetId)).append("\n");
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

