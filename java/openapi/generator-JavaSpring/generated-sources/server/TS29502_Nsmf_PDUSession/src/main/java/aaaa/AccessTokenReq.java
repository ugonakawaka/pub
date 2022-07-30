package aaaa;

import java.util.Objects;
import aaaa.NFType;
import aaaa.PlmnId;
import aaaa.PlmnIdNid;
import aaaa.Snssai;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains information related to the access token request
 */
@ApiModel(description = "Contains information related to the access token request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class AccessTokenReq   {
  /**
   * Gets or Sets grantType
   */
  public enum GrantTypeEnum {
    CLIENT_CREDENTIALS("client_credentials");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypeEnum fromValue(String value) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("grant_type")
  private GrantTypeEnum grantType;

  @JsonProperty("nfInstanceId")
  private UUID nfInstanceId;

  @JsonProperty("nfType")
  private NFType nfType;

  @JsonProperty("targetNfType")
  private NFType targetNfType;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("targetNfInstanceId")
  private UUID targetNfInstanceId;

  @JsonProperty("requesterPlmn")
  private PlmnId requesterPlmn;

  @JsonProperty("requesterPlmnList")
  @Valid
  private List<PlmnId> requesterPlmnList = null;

  @JsonProperty("requesterSnssaiList")
  @Valid
  private List<Snssai> requesterSnssaiList = null;

  @JsonProperty("requesterFqdn")
  private String requesterFqdn;

  @JsonProperty("requesterSnpnList")
  @Valid
  private List<PlmnIdNid> requesterSnpnList = null;

  @JsonProperty("targetPlmn")
  private PlmnId targetPlmn;

  @JsonProperty("targetSnssaiList")
  @Valid
  private List<Snssai> targetSnssaiList = null;

  @JsonProperty("targetNsiList")
  @Valid
  private List<String> targetNsiList = null;

  @JsonProperty("targetNfSetId")
  private String targetNfSetId;

  @JsonProperty("targetNfServiceSetId")
  private String targetNfServiceSetId;

  @JsonProperty("hnrfAccessTokenUri")
  private String hnrfAccessTokenUri;

  public AccessTokenReq grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * Get grantType
   * @return grantType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public GrantTypeEnum getGrantType() {
    return grantType;
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  public AccessTokenReq nfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return nfInstanceId
  */
  @ApiModelProperty(required = true, value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")
  @NotNull

  @Valid

  public UUID getNfInstanceId() {
    return nfInstanceId;
  }

  public void setNfInstanceId(UUID nfInstanceId) {
    this.nfInstanceId = nfInstanceId;
  }

  public AccessTokenReq nfType(NFType nfType) {
    this.nfType = nfType;
    return this;
  }

  /**
   * Get nfType
   * @return nfType
  */
  @ApiModelProperty(value = "")

  @Valid

  public NFType getNfType() {
    return nfType;
  }

  public void setNfType(NFType nfType) {
    this.nfType = nfType;
  }

  public AccessTokenReq targetNfType(NFType targetNfType) {
    this.targetNfType = targetNfType;
    return this;
  }

  /**
   * Get targetNfType
   * @return targetNfType
  */
  @ApiModelProperty(value = "")

  @Valid

  public NFType getTargetNfType() {
    return targetNfType;
  }

  public void setTargetNfType(NFType targetNfType) {
    this.targetNfType = targetNfType;
  }

  public AccessTokenReq scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^([a-zA-Z0-9_:-]+)( [a-zA-Z0-9_:-]+)*$") 
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AccessTokenReq targetNfInstanceId(UUID targetNfInstanceId) {
    this.targetNfInstanceId = targetNfInstanceId;
    return this;
  }

  /**
   * String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.
   * @return targetNfInstanceId
  */
  @ApiModelProperty(value = "String uniquely identifying a NF instance. The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, as described in IETF RFC 4122.")

  @Valid

  public UUID getTargetNfInstanceId() {
    return targetNfInstanceId;
  }

  public void setTargetNfInstanceId(UUID targetNfInstanceId) {
    this.targetNfInstanceId = targetNfInstanceId;
  }

  public AccessTokenReq requesterPlmn(PlmnId requesterPlmn) {
    this.requesterPlmn = requesterPlmn;
    return this;
  }

  /**
   * Get requesterPlmn
   * @return requesterPlmn
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlmnId getRequesterPlmn() {
    return requesterPlmn;
  }

  public void setRequesterPlmn(PlmnId requesterPlmn) {
    this.requesterPlmn = requesterPlmn;
  }

  public AccessTokenReq requesterPlmnList(List<PlmnId> requesterPlmnList) {
    this.requesterPlmnList = requesterPlmnList;
    return this;
  }

  public AccessTokenReq addRequesterPlmnListItem(PlmnId requesterPlmnListItem) {
    if (this.requesterPlmnList == null) {
      this.requesterPlmnList = new ArrayList<>();
    }
    this.requesterPlmnList.add(requesterPlmnListItem);
    return this;
  }

  /**
   * Get requesterPlmnList
   * @return requesterPlmnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=2) 
  public List<PlmnId> getRequesterPlmnList() {
    return requesterPlmnList;
  }

  public void setRequesterPlmnList(List<PlmnId> requesterPlmnList) {
    this.requesterPlmnList = requesterPlmnList;
  }

  public AccessTokenReq requesterSnssaiList(List<Snssai> requesterSnssaiList) {
    this.requesterSnssaiList = requesterSnssaiList;
    return this;
  }

  public AccessTokenReq addRequesterSnssaiListItem(Snssai requesterSnssaiListItem) {
    if (this.requesterSnssaiList == null) {
      this.requesterSnssaiList = new ArrayList<>();
    }
    this.requesterSnssaiList.add(requesterSnssaiListItem);
    return this;
  }

  /**
   * Get requesterSnssaiList
   * @return requesterSnssaiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<Snssai> getRequesterSnssaiList() {
    return requesterSnssaiList;
  }

  public void setRequesterSnssaiList(List<Snssai> requesterSnssaiList) {
    this.requesterSnssaiList = requesterSnssaiList;
  }

  public AccessTokenReq requesterFqdn(String requesterFqdn) {
    this.requesterFqdn = requesterFqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return requesterFqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getRequesterFqdn() {
    return requesterFqdn;
  }

  public void setRequesterFqdn(String requesterFqdn) {
    this.requesterFqdn = requesterFqdn;
  }

  public AccessTokenReq requesterSnpnList(List<PlmnIdNid> requesterSnpnList) {
    this.requesterSnpnList = requesterSnpnList;
    return this;
  }

  public AccessTokenReq addRequesterSnpnListItem(PlmnIdNid requesterSnpnListItem) {
    if (this.requesterSnpnList == null) {
      this.requesterSnpnList = new ArrayList<>();
    }
    this.requesterSnpnList.add(requesterSnpnListItem);
    return this;
  }

  /**
   * Get requesterSnpnList
   * @return requesterSnpnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<PlmnIdNid> getRequesterSnpnList() {
    return requesterSnpnList;
  }

  public void setRequesterSnpnList(List<PlmnIdNid> requesterSnpnList) {
    this.requesterSnpnList = requesterSnpnList;
  }

  public AccessTokenReq targetPlmn(PlmnId targetPlmn) {
    this.targetPlmn = targetPlmn;
    return this;
  }

  /**
   * Get targetPlmn
   * @return targetPlmn
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlmnId getTargetPlmn() {
    return targetPlmn;
  }

  public void setTargetPlmn(PlmnId targetPlmn) {
    this.targetPlmn = targetPlmn;
  }

  public AccessTokenReq targetSnssaiList(List<Snssai> targetSnssaiList) {
    this.targetSnssaiList = targetSnssaiList;
    return this;
  }

  public AccessTokenReq addTargetSnssaiListItem(Snssai targetSnssaiListItem) {
    if (this.targetSnssaiList == null) {
      this.targetSnssaiList = new ArrayList<>();
    }
    this.targetSnssaiList.add(targetSnssaiListItem);
    return this;
  }

  /**
   * Get targetSnssaiList
   * @return targetSnssaiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<Snssai> getTargetSnssaiList() {
    return targetSnssaiList;
  }

  public void setTargetSnssaiList(List<Snssai> targetSnssaiList) {
    this.targetSnssaiList = targetSnssaiList;
  }

  public AccessTokenReq targetNsiList(List<String> targetNsiList) {
    this.targetNsiList = targetNsiList;
    return this;
  }

  public AccessTokenReq addTargetNsiListItem(String targetNsiListItem) {
    if (this.targetNsiList == null) {
      this.targetNsiList = new ArrayList<>();
    }
    this.targetNsiList.add(targetNsiListItem);
    return this;
  }

  /**
   * Get targetNsiList
   * @return targetNsiList
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<String> getTargetNsiList() {
    return targetNsiList;
  }

  public void setTargetNsiList(List<String> targetNsiList) {
    this.targetNsiList = targetNsiList;
  }

  public AccessTokenReq targetNfSetId(String targetNfSetId) {
    this.targetNfSetId = targetNfSetId;
    return this;
  }

  /**
   * NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return targetNfSetId
  */
  @ApiModelProperty(value = "NF Set Identifier (see clause 28.12 of 3GPP TS 23.003), formatted as the following string \" set<Set ID>.<nftype>set.5gc.mnc<MNC>.mcc<MCC>\", or \"set<SetID>. <NFType>set.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition) <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition) <NFType> encoded as a value defined in Table 6.1.6.3.3-1 of 3GPP TS 29.510 but with lower case characters <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getTargetNfSetId() {
    return targetNfSetId;
  }

  public void setTargetNfSetId(String targetNfSetId) {
    this.targetNfSetId = targetNfSetId;
  }

  public AccessTokenReq targetNfServiceSetId(String targetNfServiceSetId) {
    this.targetNfServiceSetId = targetNfServiceSetId;
    return this;
  }

  /**
   * NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.
   * @return targetNfServiceSetId
  */
  @ApiModelProperty(value = "NF Service Set Identifier (see clause 28.12 of 3GPP TS 23.003) formatted as the following string  \" set<Set ID>.sn<Service Name>.nfi<NF Instance ID>.5gc.mnc<MNC>.mcc<MCC>\">\", or \"set<SetID>.sn<ServiceName>.nfi<NFInstanceID>.5gc.nid<NID>.mnc<MNC>.mcc<MCC>\" with <MCC> encoded as defined in clause 5.4.2 (\"Mcc\" data type definition)  <MNC> encoded as defined in clause 5.4.2 (\"Mnc\" data type definition)  <NID> encoded as defined in clause 5.4.2 (\"Nid\" data type definition) <NFInstanceId> encoded as defined in clause 5.3.2 <ServiceName> encoded as defined in 3GPP TS 29.510 <Set ID> encoded as a string of characters consisting of alphabetic characters (A-Z and a-z), digits (0-9) and/or the hyphen (-) and that shall end with either an alphabetic character or a digit.")


  public String getTargetNfServiceSetId() {
    return targetNfServiceSetId;
  }

  public void setTargetNfServiceSetId(String targetNfServiceSetId) {
    this.targetNfServiceSetId = targetNfServiceSetId;
  }

  public AccessTokenReq hnrfAccessTokenUri(String hnrfAccessTokenUri) {
    this.hnrfAccessTokenUri = hnrfAccessTokenUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return hnrfAccessTokenUri
  */
  @ApiModelProperty(value = "String providing an URI formatted according to RFC 3986")


  public String getHnrfAccessTokenUri() {
    return hnrfAccessTokenUri;
  }

  public void setHnrfAccessTokenUri(String hnrfAccessTokenUri) {
    this.hnrfAccessTokenUri = hnrfAccessTokenUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenReq accessTokenReq = (AccessTokenReq) o;
    return Objects.equals(this.grantType, accessTokenReq.grantType) &&
        Objects.equals(this.nfInstanceId, accessTokenReq.nfInstanceId) &&
        Objects.equals(this.nfType, accessTokenReq.nfType) &&
        Objects.equals(this.targetNfType, accessTokenReq.targetNfType) &&
        Objects.equals(this.scope, accessTokenReq.scope) &&
        Objects.equals(this.targetNfInstanceId, accessTokenReq.targetNfInstanceId) &&
        Objects.equals(this.requesterPlmn, accessTokenReq.requesterPlmn) &&
        Objects.equals(this.requesterPlmnList, accessTokenReq.requesterPlmnList) &&
        Objects.equals(this.requesterSnssaiList, accessTokenReq.requesterSnssaiList) &&
        Objects.equals(this.requesterFqdn, accessTokenReq.requesterFqdn) &&
        Objects.equals(this.requesterSnpnList, accessTokenReq.requesterSnpnList) &&
        Objects.equals(this.targetPlmn, accessTokenReq.targetPlmn) &&
        Objects.equals(this.targetSnssaiList, accessTokenReq.targetSnssaiList) &&
        Objects.equals(this.targetNsiList, accessTokenReq.targetNsiList) &&
        Objects.equals(this.targetNfSetId, accessTokenReq.targetNfSetId) &&
        Objects.equals(this.targetNfServiceSetId, accessTokenReq.targetNfServiceSetId) &&
        Objects.equals(this.hnrfAccessTokenUri, accessTokenReq.hnrfAccessTokenUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, nfInstanceId, nfType, targetNfType, scope, targetNfInstanceId, requesterPlmn, requesterPlmnList, requesterSnssaiList, requesterFqdn, requesterSnpnList, targetPlmn, targetSnssaiList, targetNsiList, targetNfSetId, targetNfServiceSetId, hnrfAccessTokenUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenReq {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    nfInstanceId: ").append(toIndentedString(nfInstanceId)).append("\n");
    sb.append("    nfType: ").append(toIndentedString(nfType)).append("\n");
    sb.append("    targetNfType: ").append(toIndentedString(targetNfType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    targetNfInstanceId: ").append(toIndentedString(targetNfInstanceId)).append("\n");
    sb.append("    requesterPlmn: ").append(toIndentedString(requesterPlmn)).append("\n");
    sb.append("    requesterPlmnList: ").append(toIndentedString(requesterPlmnList)).append("\n");
    sb.append("    requesterSnssaiList: ").append(toIndentedString(requesterSnssaiList)).append("\n");
    sb.append("    requesterFqdn: ").append(toIndentedString(requesterFqdn)).append("\n");
    sb.append("    requesterSnpnList: ").append(toIndentedString(requesterSnpnList)).append("\n");
    sb.append("    targetPlmn: ").append(toIndentedString(targetPlmn)).append("\n");
    sb.append("    targetSnssaiList: ").append(toIndentedString(targetSnssaiList)).append("\n");
    sb.append("    targetNsiList: ").append(toIndentedString(targetNsiList)).append("\n");
    sb.append("    targetNfSetId: ").append(toIndentedString(targetNfSetId)).append("\n");
    sb.append("    targetNfServiceSetId: ").append(toIndentedString(targetNfServiceSetId)).append("\n");
    sb.append("    hnrfAccessTokenUri: ").append(toIndentedString(hnrfAccessTokenUri)).append("\n");
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

