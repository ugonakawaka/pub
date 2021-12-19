package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oreore.nrf.model.DefaultNotificationSubscription;
import oreore.nrf.model.ExtSnssai;
import oreore.nrf.model.IpEndPoint;
import oreore.nrf.model.NFServiceStatus;
import oreore.nrf.model.NFServiceVersion;
import oreore.nrf.model.NFType;
import oreore.nrf.model.PlmnId;
import oreore.nrf.model.PlmnIdNid;
import oreore.nrf.model.PlmnSnssai;
import oreore.nrf.model.ServiceName;
import oreore.nrf.model.UriScheme;
import oreore.nrf.model.VendorSpecificFeature;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a given NF Service Instance; it is part of the NFProfile of an NF Instance
 */
@ApiModel(description = "Information of a given NF Service Instance; it is part of the NFProfile of an NF Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NFService  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("serviceInstanceId")
  private String serviceInstanceId;

  @JsonProperty("serviceName")
  private ServiceName serviceName;

  @JsonProperty("versions")
  @Valid
  private List<NFServiceVersion> versions = new ArrayList<>();

  @JsonProperty("scheme")
  private UriScheme scheme;

  @JsonProperty("nfServiceStatus")
  private NFServiceStatus nfServiceStatus;

  @JsonProperty("fqdn")
  private String fqdn;

  @JsonProperty("interPlmnFqdn")
  private String interPlmnFqdn;

  @JsonProperty("ipEndPoints")
  @Valid
  private List<IpEndPoint> ipEndPoints = null;

  @JsonProperty("apiPrefix")
  private String apiPrefix;

  @JsonProperty("defaultNotificationSubscriptions")
  @Valid
  private List<DefaultNotificationSubscription> defaultNotificationSubscriptions = null;

  @JsonProperty("allowedPlmns")
  @Valid
  private List<PlmnId> allowedPlmns = null;

  @JsonProperty("allowedSnpns")
  @Valid
  private List<PlmnIdNid> allowedSnpns = null;

  @JsonProperty("allowedNfTypes")
  @Valid
  private List<NFType> allowedNfTypes = null;

  @JsonProperty("allowedNfDomains")
  @Valid
  private List<String> allowedNfDomains = null;

  @JsonProperty("allowedNssais")
  @Valid
  private List<ExtSnssai> allowedNssais = null;

  @JsonProperty("allowedOperationsPerNfType")
  @Valid
  private Map<String, List<String>> allowedOperationsPerNfType = null;

  @JsonProperty("allowedOperationsPerNfInstance")
  @Valid
  private Map<String, List<String>> allowedOperationsPerNfInstance = null;

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("capacity")
  private Integer capacity;

  @JsonProperty("load")
  private Integer load;

  @JsonProperty("loadTimeStamp")
  private OffsetDateTime loadTimeStamp;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  @JsonProperty("nfServiceSetIdList")
  @Valid
  private List<String> nfServiceSetIdList = null;

  @JsonProperty("sNssais")
  @Valid
  private List<ExtSnssai> sNssais = null;

  @JsonProperty("perPlmnSnssaiList")
  @Valid
  private List<PlmnSnssai> perPlmnSnssaiList = null;

  @JsonProperty("vendorId")
  private String vendorId;

  @JsonProperty("supportedVendorSpecificFeatures")
  @Valid
  private Map<String, List<VendorSpecificFeature>> supportedVendorSpecificFeatures = null;

  @JsonProperty("oauth2Required")
  private Boolean oauth2Required;

  public NFService serviceInstanceId(String serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
    return this;
  }

  /**
   * Get serviceInstanceId
   * @return serviceInstanceId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getServiceInstanceId() {
    return serviceInstanceId;
  }

  public void setServiceInstanceId(String serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
  }

  public NFService serviceName(ServiceName serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ServiceName getServiceName() {
    return serviceName;
  }

  public void setServiceName(ServiceName serviceName) {
    this.serviceName = serviceName;
  }

  public NFService versions(List<NFServiceVersion> versions) {
    this.versions = versions;
    return this;
  }

  public NFService addVersionsItem(NFServiceVersion versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * Get versions
   * @return versions
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min = 1) 
  public List<NFServiceVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<NFServiceVersion> versions) {
    this.versions = versions;
  }

  public NFService scheme(UriScheme scheme) {
    this.scheme = scheme;
    return this;
  }

  /**
   * Get scheme
   * @return scheme
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UriScheme getScheme() {
    return scheme;
  }

  public void setScheme(UriScheme scheme) {
    this.scheme = scheme;
  }

  public NFService nfServiceStatus(NFServiceStatus nfServiceStatus) {
    this.nfServiceStatus = nfServiceStatus;
    return this;
  }

  /**
   * Get nfServiceStatus
   * @return nfServiceStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NFServiceStatus getNfServiceStatus() {
    return nfServiceStatus;
  }

  public void setNfServiceStatus(NFServiceStatus nfServiceStatus) {
    this.nfServiceStatus = nfServiceStatus;
  }

  public NFService fqdn(String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return fqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

  public NFService interPlmnFqdn(String interPlmnFqdn) {
    this.interPlmnFqdn = interPlmnFqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return interPlmnFqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getInterPlmnFqdn() {
    return interPlmnFqdn;
  }

  public void setInterPlmnFqdn(String interPlmnFqdn) {
    this.interPlmnFqdn = interPlmnFqdn;
  }

  public NFService ipEndPoints(List<IpEndPoint> ipEndPoints) {
    this.ipEndPoints = ipEndPoints;
    return this;
  }

  public NFService addIpEndPointsItem(IpEndPoint ipEndPointsItem) {
    if (this.ipEndPoints == null) {
      this.ipEndPoints = new ArrayList<>();
    }
    this.ipEndPoints.add(ipEndPointsItem);
    return this;
  }

  /**
   * Get ipEndPoints
   * @return ipEndPoints
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IpEndPoint> getIpEndPoints() {
    return ipEndPoints;
  }

  public void setIpEndPoints(List<IpEndPoint> ipEndPoints) {
    this.ipEndPoints = ipEndPoints;
  }

  public NFService apiPrefix(String apiPrefix) {
    this.apiPrefix = apiPrefix;
    return this;
  }

  /**
   * Get apiPrefix
   * @return apiPrefix
  */
  @ApiModelProperty(value = "")


  public String getApiPrefix() {
    return apiPrefix;
  }

  public void setApiPrefix(String apiPrefix) {
    this.apiPrefix = apiPrefix;
  }

  public NFService defaultNotificationSubscriptions(List<DefaultNotificationSubscription> defaultNotificationSubscriptions) {
    this.defaultNotificationSubscriptions = defaultNotificationSubscriptions;
    return this;
  }

  public NFService addDefaultNotificationSubscriptionsItem(DefaultNotificationSubscription defaultNotificationSubscriptionsItem) {
    if (this.defaultNotificationSubscriptions == null) {
      this.defaultNotificationSubscriptions = new ArrayList<>();
    }
    this.defaultNotificationSubscriptions.add(defaultNotificationSubscriptionsItem);
    return this;
  }

  /**
   * Get defaultNotificationSubscriptions
   * @return defaultNotificationSubscriptions
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<DefaultNotificationSubscription> getDefaultNotificationSubscriptions() {
    return defaultNotificationSubscriptions;
  }

  public void setDefaultNotificationSubscriptions(List<DefaultNotificationSubscription> defaultNotificationSubscriptions) {
    this.defaultNotificationSubscriptions = defaultNotificationSubscriptions;
  }

  public NFService allowedPlmns(List<PlmnId> allowedPlmns) {
    this.allowedPlmns = allowedPlmns;
    return this;
  }

  public NFService addAllowedPlmnsItem(PlmnId allowedPlmnsItem) {
    if (this.allowedPlmns == null) {
      this.allowedPlmns = new ArrayList<>();
    }
    this.allowedPlmns.add(allowedPlmnsItem);
    return this;
  }

  /**
   * Get allowedPlmns
   * @return allowedPlmns
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnId> getAllowedPlmns() {
    return allowedPlmns;
  }

  public void setAllowedPlmns(List<PlmnId> allowedPlmns) {
    this.allowedPlmns = allowedPlmns;
  }

  public NFService allowedSnpns(List<PlmnIdNid> allowedSnpns) {
    this.allowedSnpns = allowedSnpns;
    return this;
  }

  public NFService addAllowedSnpnsItem(PlmnIdNid allowedSnpnsItem) {
    if (this.allowedSnpns == null) {
      this.allowedSnpns = new ArrayList<>();
    }
    this.allowedSnpns.add(allowedSnpnsItem);
    return this;
  }

  /**
   * Get allowedSnpns
   * @return allowedSnpns
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnIdNid> getAllowedSnpns() {
    return allowedSnpns;
  }

  public void setAllowedSnpns(List<PlmnIdNid> allowedSnpns) {
    this.allowedSnpns = allowedSnpns;
  }

  public NFService allowedNfTypes(List<NFType> allowedNfTypes) {
    this.allowedNfTypes = allowedNfTypes;
    return this;
  }

  public NFService addAllowedNfTypesItem(NFType allowedNfTypesItem) {
    if (this.allowedNfTypes == null) {
      this.allowedNfTypes = new ArrayList<>();
    }
    this.allowedNfTypes.add(allowedNfTypesItem);
    return this;
  }

  /**
   * Get allowedNfTypes
   * @return allowedNfTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NFType> getAllowedNfTypes() {
    return allowedNfTypes;
  }

  public void setAllowedNfTypes(List<NFType> allowedNfTypes) {
    this.allowedNfTypes = allowedNfTypes;
  }

  public NFService allowedNfDomains(List<String> allowedNfDomains) {
    this.allowedNfDomains = allowedNfDomains;
    return this;
  }

  public NFService addAllowedNfDomainsItem(String allowedNfDomainsItem) {
    if (this.allowedNfDomains == null) {
      this.allowedNfDomains = new ArrayList<>();
    }
    this.allowedNfDomains.add(allowedNfDomainsItem);
    return this;
  }

  /**
   * Get allowedNfDomains
   * @return allowedNfDomains
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getAllowedNfDomains() {
    return allowedNfDomains;
  }

  public void setAllowedNfDomains(List<String> allowedNfDomains) {
    this.allowedNfDomains = allowedNfDomains;
  }

  public NFService allowedNssais(List<ExtSnssai> allowedNssais) {
    this.allowedNssais = allowedNssais;
    return this;
  }

  public NFService addAllowedNssaisItem(ExtSnssai allowedNssaisItem) {
    if (this.allowedNssais == null) {
      this.allowedNssais = new ArrayList<>();
    }
    this.allowedNssais.add(allowedNssaisItem);
    return this;
  }

  /**
   * Get allowedNssais
   * @return allowedNssais
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<ExtSnssai> getAllowedNssais() {
    return allowedNssais;
  }

  public void setAllowedNssais(List<ExtSnssai> allowedNssais) {
    this.allowedNssais = allowedNssais;
  }

  public NFService allowedOperationsPerNfType(Map<String, List<String>> allowedOperationsPerNfType) {
    this.allowedOperationsPerNfType = allowedOperationsPerNfType;
    return this;
  }

  public NFService putAllowedOperationsPerNfTypeItem(String key, List<String> allowedOperationsPerNfTypeItem) {
    if (this.allowedOperationsPerNfType == null) {
      this.allowedOperationsPerNfType = new HashMap<>();
    }
    this.allowedOperationsPerNfType.put(key, allowedOperationsPerNfTypeItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NF Type serves as key
   * @return allowedOperationsPerNfType
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NF Type serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, List<String>> getAllowedOperationsPerNfType() {
    return allowedOperationsPerNfType;
  }

  public void setAllowedOperationsPerNfType(Map<String, List<String>> allowedOperationsPerNfType) {
    this.allowedOperationsPerNfType = allowedOperationsPerNfType;
  }

  public NFService allowedOperationsPerNfInstance(Map<String, List<String>> allowedOperationsPerNfInstance) {
    this.allowedOperationsPerNfInstance = allowedOperationsPerNfInstance;
    return this;
  }

  public NFService putAllowedOperationsPerNfInstanceItem(String key, List<String> allowedOperationsPerNfInstanceItem) {
    if (this.allowedOperationsPerNfInstance == null) {
      this.allowedOperationsPerNfInstance = new HashMap<>();
    }
    this.allowedOperationsPerNfInstance.put(key, allowedOperationsPerNfInstanceItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NF Instance Id serves as key
   * @return allowedOperationsPerNfInstance
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NF Instance Id serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, List<String>> getAllowedOperationsPerNfInstance() {
    return allowedOperationsPerNfInstance;
  }

  public void setAllowedOperationsPerNfInstance(Map<String, List<String>> allowedOperationsPerNfInstance) {
    this.allowedOperationsPerNfInstance = allowedOperationsPerNfInstance;
  }

  public NFService priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * minimum: 0
   * maximum: 65535
   * @return priority
  */
  @ApiModelProperty(value = "")

@Min(0) @Max(65535) 
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public NFService capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * minimum: 0
   * maximum: 65535
   * @return capacity
  */
  @ApiModelProperty(value = "")

@Min(0) @Max(65535) 
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public NFService load(Integer load) {
    this.load = load;
    return this;
  }

  /**
   * Get load
   * minimum: 0
   * maximum: 100
   * @return load
  */
  @ApiModelProperty(value = "")

@Min(0) @Max(100) 
  public Integer getLoad() {
    return load;
  }

  public void setLoad(Integer load) {
    this.load = load;
  }

  public NFService loadTimeStamp(OffsetDateTime loadTimeStamp) {
    this.loadTimeStamp = loadTimeStamp;
    return this;
  }

  /**
   * Get loadTimeStamp
   * @return loadTimeStamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLoadTimeStamp() {
    return loadTimeStamp;
  }

  public void setLoadTimeStamp(OffsetDateTime loadTimeStamp) {
    this.loadTimeStamp = loadTimeStamp;
  }

  public NFService recoveryTime(OffsetDateTime recoveryTime) {
    this.recoveryTime = recoveryTime;
    return this;
  }

  /**
   * Get recoveryTime
   * @return recoveryTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRecoveryTime() {
    return recoveryTime;
  }

  public void setRecoveryTime(OffsetDateTime recoveryTime) {
    this.recoveryTime = recoveryTime;
  }

  public NFService supportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported
   * @return supportedFeatures
  */
  @ApiModelProperty(value = "A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported")

@Pattern(regexp = "^[A-Fa-f0-9]*$") 
  public String getSupportedFeatures() {
    return supportedFeatures;
  }

  public void setSupportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }

  public NFService nfServiceSetIdList(List<String> nfServiceSetIdList) {
    this.nfServiceSetIdList = nfServiceSetIdList;
    return this;
  }

  public NFService addNfServiceSetIdListItem(String nfServiceSetIdListItem) {
    if (this.nfServiceSetIdList == null) {
      this.nfServiceSetIdList = new ArrayList<>();
    }
    this.nfServiceSetIdList.add(nfServiceSetIdListItem);
    return this;
  }

  /**
   * Get nfServiceSetIdList
   * @return nfServiceSetIdList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getNfServiceSetIdList() {
    return nfServiceSetIdList;
  }

  public void setNfServiceSetIdList(List<String> nfServiceSetIdList) {
    this.nfServiceSetIdList = nfServiceSetIdList;
  }

  public NFService sNssais(List<ExtSnssai> sNssais) {
    this.sNssais = sNssais;
    return this;
  }

  public NFService addSNssaisItem(ExtSnssai sNssaisItem) {
    if (this.sNssais == null) {
      this.sNssais = new ArrayList<>();
    }
    this.sNssais.add(sNssaisItem);
    return this;
  }

  /**
   * Get sNssais
   * @return sNssais
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<ExtSnssai> getsNssais() {
    return sNssais;
  }

  public void setsNssais(List<ExtSnssai> sNssais) {
    this.sNssais = sNssais;
  }

  public NFService perPlmnSnssaiList(List<PlmnSnssai> perPlmnSnssaiList) {
    this.perPlmnSnssaiList = perPlmnSnssaiList;
    return this;
  }

  public NFService addPerPlmnSnssaiListItem(PlmnSnssai perPlmnSnssaiListItem) {
    if (this.perPlmnSnssaiList == null) {
      this.perPlmnSnssaiList = new ArrayList<>();
    }
    this.perPlmnSnssaiList.add(perPlmnSnssaiListItem);
    return this;
  }

  /**
   * Get perPlmnSnssaiList
   * @return perPlmnSnssaiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnSnssai> getPerPlmnSnssaiList() {
    return perPlmnSnssaiList;
  }

  public void setPerPlmnSnssaiList(List<PlmnSnssai> perPlmnSnssaiList) {
    this.perPlmnSnssaiList = perPlmnSnssaiList;
  }

  public NFService vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

  /**
   * Vendor ID of the NF Service instance (Private Enterprise Number assigned by IANA)
   * @return vendorId
  */
  @ApiModelProperty(value = "Vendor ID of the NF Service instance (Private Enterprise Number assigned by IANA)")

@Pattern(regexp = "^[0-9]{6}$") 
  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public NFService supportedVendorSpecificFeatures(Map<String, List<VendorSpecificFeature>> supportedVendorSpecificFeatures) {
    this.supportedVendorSpecificFeatures = supportedVendorSpecificFeatures;
    return this;
  }

  public NFService putSupportedVendorSpecificFeaturesItem(String key, List<VendorSpecificFeature> supportedVendorSpecificFeaturesItem) {
    if (this.supportedVendorSpecificFeatures == null) {
      this.supportedVendorSpecificFeatures = new HashMap<>();
    }
    this.supportedVendorSpecificFeatures.put(key, supportedVendorSpecificFeaturesItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where IANA-assigned SMI Network Management Private Enterprise Codes serves as key
   * @return supportedVendorSpecificFeatures
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where IANA-assigned SMI Network Management Private Enterprise Codes serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, List<VendorSpecificFeature>> getSupportedVendorSpecificFeatures() {
    return supportedVendorSpecificFeatures;
  }

  public void setSupportedVendorSpecificFeatures(Map<String, List<VendorSpecificFeature>> supportedVendorSpecificFeatures) {
    this.supportedVendorSpecificFeatures = supportedVendorSpecificFeatures;
  }

  public NFService oauth2Required(Boolean oauth2Required) {
    this.oauth2Required = oauth2Required;
    return this;
  }

  /**
   * Get oauth2Required
   * @return oauth2Required
  */
  @ApiModelProperty(value = "")


  public Boolean getOauth2Required() {
    return oauth2Required;
  }

  public void setOauth2Required(Boolean oauth2Required) {
    this.oauth2Required = oauth2Required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFService nfService = (NFService) o;
    return Objects.equals(this.serviceInstanceId, nfService.serviceInstanceId) &&
        Objects.equals(this.serviceName, nfService.serviceName) &&
        Objects.equals(this.versions, nfService.versions) &&
        Objects.equals(this.scheme, nfService.scheme) &&
        Objects.equals(this.nfServiceStatus, nfService.nfServiceStatus) &&
        Objects.equals(this.fqdn, nfService.fqdn) &&
        Objects.equals(this.interPlmnFqdn, nfService.interPlmnFqdn) &&
        Objects.equals(this.ipEndPoints, nfService.ipEndPoints) &&
        Objects.equals(this.apiPrefix, nfService.apiPrefix) &&
        Objects.equals(this.defaultNotificationSubscriptions, nfService.defaultNotificationSubscriptions) &&
        Objects.equals(this.allowedPlmns, nfService.allowedPlmns) &&
        Objects.equals(this.allowedSnpns, nfService.allowedSnpns) &&
        Objects.equals(this.allowedNfTypes, nfService.allowedNfTypes) &&
        Objects.equals(this.allowedNfDomains, nfService.allowedNfDomains) &&
        Objects.equals(this.allowedNssais, nfService.allowedNssais) &&
        Objects.equals(this.allowedOperationsPerNfType, nfService.allowedOperationsPerNfType) &&
        Objects.equals(this.allowedOperationsPerNfInstance, nfService.allowedOperationsPerNfInstance) &&
        Objects.equals(this.priority, nfService.priority) &&
        Objects.equals(this.capacity, nfService.capacity) &&
        Objects.equals(this.load, nfService.load) &&
        Objects.equals(this.loadTimeStamp, nfService.loadTimeStamp) &&
        Objects.equals(this.recoveryTime, nfService.recoveryTime) &&
        Objects.equals(this.supportedFeatures, nfService.supportedFeatures) &&
        Objects.equals(this.nfServiceSetIdList, nfService.nfServiceSetIdList) &&
        Objects.equals(this.sNssais, nfService.sNssais) &&
        Objects.equals(this.perPlmnSnssaiList, nfService.perPlmnSnssaiList) &&
        Objects.equals(this.vendorId, nfService.vendorId) &&
        Objects.equals(this.supportedVendorSpecificFeatures, nfService.supportedVendorSpecificFeatures) &&
        Objects.equals(this.oauth2Required, nfService.oauth2Required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceInstanceId, serviceName, versions, scheme, nfServiceStatus, fqdn, interPlmnFqdn, ipEndPoints, apiPrefix, defaultNotificationSubscriptions, allowedPlmns, allowedSnpns, allowedNfTypes, allowedNfDomains, allowedNssais, allowedOperationsPerNfType, allowedOperationsPerNfInstance, priority, capacity, load, loadTimeStamp, recoveryTime, supportedFeatures, nfServiceSetIdList, sNssais, perPlmnSnssaiList, vendorId, supportedVendorSpecificFeatures, oauth2Required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFService {\n");
    
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    nfServiceStatus: ").append(toIndentedString(nfServiceStatus)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    interPlmnFqdn: ").append(toIndentedString(interPlmnFqdn)).append("\n");
    sb.append("    ipEndPoints: ").append(toIndentedString(ipEndPoints)).append("\n");
    sb.append("    apiPrefix: ").append(toIndentedString(apiPrefix)).append("\n");
    sb.append("    defaultNotificationSubscriptions: ").append(toIndentedString(defaultNotificationSubscriptions)).append("\n");
    sb.append("    allowedPlmns: ").append(toIndentedString(allowedPlmns)).append("\n");
    sb.append("    allowedSnpns: ").append(toIndentedString(allowedSnpns)).append("\n");
    sb.append("    allowedNfTypes: ").append(toIndentedString(allowedNfTypes)).append("\n");
    sb.append("    allowedNfDomains: ").append(toIndentedString(allowedNfDomains)).append("\n");
    sb.append("    allowedNssais: ").append(toIndentedString(allowedNssais)).append("\n");
    sb.append("    allowedOperationsPerNfType: ").append(toIndentedString(allowedOperationsPerNfType)).append("\n");
    sb.append("    allowedOperationsPerNfInstance: ").append(toIndentedString(allowedOperationsPerNfInstance)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
    sb.append("    loadTimeStamp: ").append(toIndentedString(loadTimeStamp)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    nfServiceSetIdList: ").append(toIndentedString(nfServiceSetIdList)).append("\n");
    sb.append("    sNssais: ").append(toIndentedString(sNssais)).append("\n");
    sb.append("    perPlmnSnssaiList: ").append(toIndentedString(perPlmnSnssaiList)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    supportedVendorSpecificFeatures: ").append(toIndentedString(supportedVendorSpecificFeatures)).append("\n");
    sb.append("    oauth2Required: ").append(toIndentedString(oauth2Required)).append("\n");
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

