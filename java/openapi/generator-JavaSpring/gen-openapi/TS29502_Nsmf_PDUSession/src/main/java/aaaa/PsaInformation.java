package aaaa;

import java.util.Objects;
import aaaa.Ipv6Prefix;
import aaaa.PsaIndication;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PSA Information
 */
@ApiModel(description = "PSA Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class PsaInformation   {
  @JsonProperty("psaInd")
  private PsaIndication psaInd;

  @JsonProperty("dnaiList")
  @Valid
  private List<String> dnaiList = null;

  @JsonProperty("ueIpv6Prefix")
  private Ipv6Prefix ueIpv6Prefix;

  @JsonProperty("psaUpfId")
  private UUID psaUpfId;

  public PsaInformation psaInd(PsaIndication psaInd) {
    this.psaInd = psaInd;
    return this;
  }

  /**
   * Get psaInd
   * @return psaInd
  */
  @ApiModelProperty(value = "")

  @Valid

  public PsaIndication getPsaInd() {
    return psaInd;
  }

  public void setPsaInd(PsaIndication psaInd) {
    this.psaInd = psaInd;
  }

  public PsaInformation dnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
    return this;
  }

  public PsaInformation addDnaiListItem(String dnaiListItem) {
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

@Size(min=1) 
  public List<String> getDnaiList() {
    return dnaiList;
  }

  public void setDnaiList(List<String> dnaiList) {
    this.dnaiList = dnaiList;
  }

  public PsaInformation ueIpv6Prefix(Ipv6Prefix ueIpv6Prefix) {
    this.ueIpv6Prefix = ueIpv6Prefix;
    return this;
  }

  /**
   * Get ueIpv6Prefix
   * @return ueIpv6Prefix
  */
  @ApiModelProperty(value = "")

  @Valid

  public Ipv6Prefix getUeIpv6Prefix() {
    return ueIpv6Prefix;
  }

  public void setUeIpv6Prefix(Ipv6Prefix ueIpv6Prefix) {
    this.ueIpv6Prefix = ueIpv6Prefix;
  }

  public PsaInformation psaUpfId(UUID psaUpfId) {
    this.psaUpfId = psaUpfId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return psaUpfId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getPsaUpfId() {
    return psaUpfId;
  }

  public void setPsaUpfId(UUID psaUpfId) {
    this.psaUpfId = psaUpfId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PsaInformation psaInformation = (PsaInformation) o;
    return Objects.equals(this.psaInd, psaInformation.psaInd) &&
        Objects.equals(this.dnaiList, psaInformation.dnaiList) &&
        Objects.equals(this.ueIpv6Prefix, psaInformation.ueIpv6Prefix) &&
        Objects.equals(this.psaUpfId, psaInformation.psaUpfId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psaInd, dnaiList, ueIpv6Prefix, psaUpfId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsaInformation {\n");
    
    sb.append("    psaInd: ").append(toIndentedString(psaInd)).append("\n");
    sb.append("    dnaiList: ").append(toIndentedString(dnaiList)).append("\n");
    sb.append("    ueIpv6Prefix: ").append(toIndentedString(ueIpv6Prefix)).append("\n");
    sb.append("    psaUpfId: ").append(toIndentedString(psaUpfId)).append("\n");
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

