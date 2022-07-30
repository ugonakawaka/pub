package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the addresses of the charging functions.
 */
@ApiModel(description = "Contains the addresses of the charging functions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class ChargingInformation   {
  @JsonProperty("primaryChfAddress")
  private String primaryChfAddress;

  @JsonProperty("secondaryChfAddress")
  private String secondaryChfAddress;

  @JsonProperty("primaryChfSetId")
  private String primaryChfSetId;

  @JsonProperty("primaryChfInstanceId")
  private UUID primaryChfInstanceId;

  @JsonProperty("secondaryChfSetId")
  private String secondaryChfSetId;

  @JsonProperty("secondaryChfInstanceId")
  private UUID secondaryChfInstanceId;

  public ChargingInformation primaryChfAddress(String primaryChfAddress) {
    this.primaryChfAddress = primaryChfAddress;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return primaryChfAddress
  */
  @ApiModelProperty(required = true, value = "String providing an URI formatted according to RFC 3986")
  @NotNull


  public String getPrimaryChfAddress() {
    return primaryChfAddress;
  }

  public void setPrimaryChfAddress(String primaryChfAddress) {
    this.primaryChfAddress = primaryChfAddress;
  }

  public ChargingInformation secondaryChfAddress(String secondaryChfAddress) {
    this.secondaryChfAddress = secondaryChfAddress;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return secondaryChfAddress
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getSecondaryChfAddress() {
    return secondaryChfAddress;
  }

  public void setSecondaryChfAddress(String secondaryChfAddress) {
    this.secondaryChfAddress = secondaryChfAddress;
  }

  public ChargingInformation primaryChfSetId(String primaryChfSetId) {
    this.primaryChfSetId = primaryChfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return primaryChfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getPrimaryChfSetId() {
    return primaryChfSetId;
  }

  public void setPrimaryChfSetId(String primaryChfSetId) {
    this.primaryChfSetId = primaryChfSetId;
  }

  public ChargingInformation primaryChfInstanceId(UUID primaryChfInstanceId) {
    this.primaryChfInstanceId = primaryChfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return primaryChfInstanceId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getPrimaryChfInstanceId() {
    return primaryChfInstanceId;
  }

  public void setPrimaryChfInstanceId(UUID primaryChfInstanceId) {
    this.primaryChfInstanceId = primaryChfInstanceId;
  }

  public ChargingInformation secondaryChfSetId(String secondaryChfSetId) {
    this.secondaryChfSetId = secondaryChfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return secondaryChfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getSecondaryChfSetId() {
    return secondaryChfSetId;
  }

  public void setSecondaryChfSetId(String secondaryChfSetId) {
    this.secondaryChfSetId = secondaryChfSetId;
  }

  public ChargingInformation secondaryChfInstanceId(UUID secondaryChfInstanceId) {
    this.secondaryChfInstanceId = secondaryChfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return secondaryChfInstanceId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getSecondaryChfInstanceId() {
    return secondaryChfInstanceId;
  }

  public void setSecondaryChfInstanceId(UUID secondaryChfInstanceId) {
    this.secondaryChfInstanceId = secondaryChfInstanceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingInformation chargingInformation = (ChargingInformation) o;
    return Objects.equals(this.primaryChfAddress, chargingInformation.primaryChfAddress) &&
        Objects.equals(this.secondaryChfAddress, chargingInformation.secondaryChfAddress) &&
        Objects.equals(this.primaryChfSetId, chargingInformation.primaryChfSetId) &&
        Objects.equals(this.primaryChfInstanceId, chargingInformation.primaryChfInstanceId) &&
        Objects.equals(this.secondaryChfSetId, chargingInformation.secondaryChfSetId) &&
        Objects.equals(this.secondaryChfInstanceId, chargingInformation.secondaryChfInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryChfAddress, secondaryChfAddress, primaryChfSetId, primaryChfInstanceId, secondaryChfSetId, secondaryChfInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingInformation {\n");
    
    sb.append("    primaryChfAddress: ").append(toIndentedString(primaryChfAddress)).append("\n");
    sb.append("    secondaryChfAddress: ").append(toIndentedString(secondaryChfAddress)).append("\n");
    sb.append("    primaryChfSetId: ").append(toIndentedString(primaryChfSetId)).append("\n");
    sb.append("    primaryChfInstanceId: ").append(toIndentedString(primaryChfInstanceId)).append("\n");
    sb.append("    secondaryChfSetId: ").append(toIndentedString(secondaryChfSetId)).append("\n");
    sb.append("    secondaryChfInstanceId: ").append(toIndentedString(secondaryChfInstanceId)).append("\n");
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

