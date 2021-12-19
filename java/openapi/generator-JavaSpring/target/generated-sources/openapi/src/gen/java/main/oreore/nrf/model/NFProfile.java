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
import java.util.UUID;
import oreore.nrf.model.AanfInfo;
import oreore.nrf.model.AmfInfo;
import oreore.nrf.model.AusfInfo;
import oreore.nrf.model.BsfInfo;
import oreore.nrf.model.ChfInfo;
import oreore.nrf.model.DccfInfo;
import oreore.nrf.model.DefaultNotificationSubscription;
import oreore.nrf.model.EasdfInfo;
import oreore.nrf.model.ExtSnssai;
import oreore.nrf.model.GmlcInfo;
import oreore.nrf.model.HssInfo;
import oreore.nrf.model.Ipv6Addr;
import oreore.nrf.model.LmfInfo;
import oreore.nrf.model.MfafInfo;
import oreore.nrf.model.Model5GDdnmfInfo;
import oreore.nrf.model.NFService;
import oreore.nrf.model.NFStatus;
import oreore.nrf.model.NFType;
import oreore.nrf.model.NefInfo;
import oreore.nrf.model.NrfInfo;
import oreore.nrf.model.NwdafInfo;
import oreore.nrf.model.PcfInfo;
import oreore.nrf.model.PcscfInfo;
import oreore.nrf.model.PlmnId;
import oreore.nrf.model.PlmnIdNid;
import oreore.nrf.model.PlmnSnssai;
import oreore.nrf.model.ScpInfo;
import oreore.nrf.model.SeppInfo;
import oreore.nrf.model.SmfInfo;
import oreore.nrf.model.UdmInfo;
import oreore.nrf.model.UdrInfo;
import oreore.nrf.model.UdsfInfo;
import oreore.nrf.model.UpfInfo;
import oreore.nrf.model.VendorSpecificFeature;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an NF Instance registered in the NRF
 */
@ApiModel(description = "Information of an NF Instance registered in the NRF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NFProfile  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nfInstanceId")
  private UUID nfInstanceId;

  @JsonProperty("nfType")
  private NFType nfType;

  @JsonProperty("nfStatus")
  private NFStatus nfStatus;

  @JsonProperty("nfInstanceName")
  private String nfInstanceName;

  @JsonProperty("heartBeatTimer")
  private Integer heartBeatTimer;

  @JsonProperty("plmnList")
  @Valid
  private List<PlmnId> plmnList = null;

  @JsonProperty("snpnList")
  @Valid
  private List<PlmnIdNid> snpnList = null;

  @JsonProperty("sNssais")
  @Valid
  private List<ExtSnssai> sNssais = null;

  @JsonProperty("perPlmnSnssaiList")
  @Valid
  private List<PlmnSnssai> perPlmnSnssaiList = null;

  @JsonProperty("nsiList")
  @Valid
  private List<String> nsiList = null;

  @JsonProperty("fqdn")
  private String fqdn;

  @JsonProperty("interPlmnFqdn")
  private String interPlmnFqdn;

  @JsonProperty("ipv4Addresses")
  @Valid
  private List<String> ipv4Addresses = null;

  @JsonProperty("ipv6Addresses")
  @Valid
  private List<Ipv6Addr> ipv6Addresses = null;

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

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("capacity")
  private Integer capacity;

  @JsonProperty("load")
  private Integer load;

  @JsonProperty("loadTimeStamp")
  private OffsetDateTime loadTimeStamp;

  @JsonProperty("locality")
  private String locality;

  @JsonProperty("udrInfo")
  private UdrInfo udrInfo;

  @JsonProperty("udrInfoList")
  @Valid
  private Map<String, UdrInfo> udrInfoList = null;

  @JsonProperty("udmInfo")
  private UdmInfo udmInfo;

  @JsonProperty("udmInfoList")
  @Valid
  private Map<String, UdmInfo> udmInfoList = null;

  @JsonProperty("ausfInfo")
  private AusfInfo ausfInfo;

  @JsonProperty("ausfInfoList")
  @Valid
  private Map<String, AusfInfo> ausfInfoList = null;

  @JsonProperty("amfInfo")
  private AmfInfo amfInfo;

  @JsonProperty("amfInfoList")
  @Valid
  private Map<String, AmfInfo> amfInfoList = null;

  @JsonProperty("smfInfo")
  private SmfInfo smfInfo;

  @JsonProperty("smfInfoList")
  @Valid
  private Map<String, SmfInfo> smfInfoList = null;

  @JsonProperty("upfInfo")
  private UpfInfo upfInfo;

  @JsonProperty("upfInfoList")
  @Valid
  private Map<String, UpfInfo> upfInfoList = null;

  @JsonProperty("pcfInfo")
  private PcfInfo pcfInfo;

  @JsonProperty("pcfInfoList")
  @Valid
  private Map<String, PcfInfo> pcfInfoList = null;

  @JsonProperty("bsfInfo")
  private BsfInfo bsfInfo;

  @JsonProperty("bsfInfoList")
  @Valid
  private Map<String, BsfInfo> bsfInfoList = null;

  @JsonProperty("chfInfo")
  private ChfInfo chfInfo;

  @JsonProperty("chfInfoList")
  @Valid
  private Map<String, ChfInfo> chfInfoList = null;

  @JsonProperty("nefInfo")
  private NefInfo nefInfo;

  @JsonProperty("nrfInfo")
  private NrfInfo nrfInfo;

  @JsonProperty("udsfInfo")
  private UdsfInfo udsfInfo;

  @JsonProperty("udsfInfoList")
  @Valid
  private Map<String, UdsfInfo> udsfInfoList = null;

  @JsonProperty("nwdafInfo")
  private NwdafInfo nwdafInfo;

  @JsonProperty("nwdafInfoList")
  @Valid
  private Map<String, NwdafInfo> nwdafInfoList = null;

  @JsonProperty("pcscfInfoList")
  @Valid
  private Map<String, PcscfInfo> pcscfInfoList = null;

  @JsonProperty("hssInfoList")
  @Valid
  private Map<String, HssInfo> hssInfoList = null;

  @JsonProperty("customInfo")
  private Object customInfo;

  @JsonProperty("recoveryTime")
  private OffsetDateTime recoveryTime;

  @JsonProperty("nfServicePersistence")
  private Boolean nfServicePersistence = false;

  @JsonProperty("nfServices")
  @Valid
  private List<NFService> nfServices = null;

  @JsonProperty("nfServiceList")
  @Valid
  private Map<String, NFService> nfServiceList = null;

  @JsonProperty("nfProfileChangesSupportInd")
  private Boolean nfProfileChangesSupportInd = false;

  @JsonProperty("nfProfileChangesInd")
  private Boolean nfProfileChangesInd = false;

  @JsonProperty("defaultNotificationSubscriptions")
  @Valid
  private List<DefaultNotificationSubscription> defaultNotificationSubscriptions = null;

  @JsonProperty("lmfInfo")
  private LmfInfo lmfInfo;

  @JsonProperty("gmlcInfo")
  private GmlcInfo gmlcInfo;

  @JsonProperty("nfSetIdList")
  @Valid
  private List<String> nfSetIdList = null;

  @JsonProperty("servingScope")
  @Valid
  private List<String> servingScope = null;

  @JsonProperty("lcHSupportInd")
  private Boolean lcHSupportInd = false;

  @JsonProperty("olcHSupportInd")
  private Boolean olcHSupportInd = false;

  @JsonProperty("nfSetRecoveryTimeList")
  @Valid
  private Map<String, OffsetDateTime> nfSetRecoveryTimeList = null;

  @JsonProperty("serviceSetRecoveryTimeList")
  @Valid
  private Map<String, OffsetDateTime> serviceSetRecoveryTimeList = null;

  @JsonProperty("scpDomains")
  @Valid
  private List<String> scpDomains = null;

  @JsonProperty("scpInfo")
  private ScpInfo scpInfo;

  @JsonProperty("seppInfo")
  private SeppInfo seppInfo;

  @JsonProperty("vendorId")
  private String vendorId;

  @JsonProperty("supportedVendorSpecificFeatures")
  @Valid
  private Map<String, List<VendorSpecificFeature>> supportedVendorSpecificFeatures = null;

  @JsonProperty("aanfInfoList")
  @Valid
  private Map<String, AanfInfo> aanfInfoList = null;

  @JsonProperty("5gDdnmfInfo")
  private Model5GDdnmfInfo _5gDdnmfInfo;

  @JsonProperty("mfafInfo")
  private MfafInfo mfafInfo;

  @JsonProperty("easdfInfoList")
  @Valid
  private Map<String, EasdfInfo> easdfInfoList = null;

  @JsonProperty("dccfInfo")
  private DccfInfo dccfInfo;

  public NFProfile nfInstanceId(UUID nfInstanceId) {
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

  public NFProfile nfType(NFType nfType) {
    this.nfType = nfType;
    return this;
  }

  /**
   * Get nfType
   * @return nfType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NFType getNfType() {
    return nfType;
  }

  public void setNfType(NFType nfType) {
    this.nfType = nfType;
  }

  public NFProfile nfStatus(NFStatus nfStatus) {
    this.nfStatus = nfStatus;
    return this;
  }

  /**
   * Get nfStatus
   * @return nfStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NFStatus getNfStatus() {
    return nfStatus;
  }

  public void setNfStatus(NFStatus nfStatus) {
    this.nfStatus = nfStatus;
  }

  public NFProfile nfInstanceName(String nfInstanceName) {
    this.nfInstanceName = nfInstanceName;
    return this;
  }

  /**
   * Get nfInstanceName
   * @return nfInstanceName
  */
  @ApiModelProperty(value = "")


  public String getNfInstanceName() {
    return nfInstanceName;
  }

  public void setNfInstanceName(String nfInstanceName) {
    this.nfInstanceName = nfInstanceName;
  }

  public NFProfile heartBeatTimer(Integer heartBeatTimer) {
    this.heartBeatTimer = heartBeatTimer;
    return this;
  }

  /**
   * Get heartBeatTimer
   * minimum: 1
   * @return heartBeatTimer
  */
  @ApiModelProperty(value = "")

@Min(1) 
  public Integer getHeartBeatTimer() {
    return heartBeatTimer;
  }

  public void setHeartBeatTimer(Integer heartBeatTimer) {
    this.heartBeatTimer = heartBeatTimer;
  }

  public NFProfile plmnList(List<PlmnId> plmnList) {
    this.plmnList = plmnList;
    return this;
  }

  public NFProfile addPlmnListItem(PlmnId plmnListItem) {
    if (this.plmnList == null) {
      this.plmnList = new ArrayList<>();
    }
    this.plmnList.add(plmnListItem);
    return this;
  }

  /**
   * Get plmnList
   * @return plmnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnId> getPlmnList() {
    return plmnList;
  }

  public void setPlmnList(List<PlmnId> plmnList) {
    this.plmnList = plmnList;
  }

  public NFProfile snpnList(List<PlmnIdNid> snpnList) {
    this.snpnList = snpnList;
    return this;
  }

  public NFProfile addSnpnListItem(PlmnIdNid snpnListItem) {
    if (this.snpnList == null) {
      this.snpnList = new ArrayList<>();
    }
    this.snpnList.add(snpnListItem);
    return this;
  }

  /**
   * Get snpnList
   * @return snpnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnIdNid> getSnpnList() {
    return snpnList;
  }

  public void setSnpnList(List<PlmnIdNid> snpnList) {
    this.snpnList = snpnList;
  }

  public NFProfile sNssais(List<ExtSnssai> sNssais) {
    this.sNssais = sNssais;
    return this;
  }

  public NFProfile addSNssaisItem(ExtSnssai sNssaisItem) {
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

  public NFProfile perPlmnSnssaiList(List<PlmnSnssai> perPlmnSnssaiList) {
    this.perPlmnSnssaiList = perPlmnSnssaiList;
    return this;
  }

  public NFProfile addPerPlmnSnssaiListItem(PlmnSnssai perPlmnSnssaiListItem) {
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

  public NFProfile nsiList(List<String> nsiList) {
    this.nsiList = nsiList;
    return this;
  }

  public NFProfile addNsiListItem(String nsiListItem) {
    if (this.nsiList == null) {
      this.nsiList = new ArrayList<>();
    }
    this.nsiList.add(nsiListItem);
    return this;
  }

  /**
   * Get nsiList
   * @return nsiList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getNsiList() {
    return nsiList;
  }

  public void setNsiList(List<String> nsiList) {
    this.nsiList = nsiList;
  }

  public NFProfile fqdn(String fqdn) {
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

  public NFProfile interPlmnFqdn(String interPlmnFqdn) {
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

  public NFProfile ipv4Addresses(List<String> ipv4Addresses) {
    this.ipv4Addresses = ipv4Addresses;
    return this;
  }

  public NFProfile addIpv4AddressesItem(String ipv4AddressesItem) {
    if (this.ipv4Addresses == null) {
      this.ipv4Addresses = new ArrayList<>();
    }
    this.ipv4Addresses.add(ipv4AddressesItem);
    return this;
  }

  /**
   * Get ipv4Addresses
   * @return ipv4Addresses
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getIpv4Addresses() {
    return ipv4Addresses;
  }

  public void setIpv4Addresses(List<String> ipv4Addresses) {
    this.ipv4Addresses = ipv4Addresses;
  }

  public NFProfile ipv6Addresses(List<Ipv6Addr> ipv6Addresses) {
    this.ipv6Addresses = ipv6Addresses;
    return this;
  }

  public NFProfile addIpv6AddressesItem(Ipv6Addr ipv6AddressesItem) {
    if (this.ipv6Addresses == null) {
      this.ipv6Addresses = new ArrayList<>();
    }
    this.ipv6Addresses.add(ipv6AddressesItem);
    return this;
  }

  /**
   * Get ipv6Addresses
   * @return ipv6Addresses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv6Addr> getIpv6Addresses() {
    return ipv6Addresses;
  }

  public void setIpv6Addresses(List<Ipv6Addr> ipv6Addresses) {
    this.ipv6Addresses = ipv6Addresses;
  }

  public NFProfile allowedPlmns(List<PlmnId> allowedPlmns) {
    this.allowedPlmns = allowedPlmns;
    return this;
  }

  public NFProfile addAllowedPlmnsItem(PlmnId allowedPlmnsItem) {
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

  public NFProfile allowedSnpns(List<PlmnIdNid> allowedSnpns) {
    this.allowedSnpns = allowedSnpns;
    return this;
  }

  public NFProfile addAllowedSnpnsItem(PlmnIdNid allowedSnpnsItem) {
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

  public NFProfile allowedNfTypes(List<NFType> allowedNfTypes) {
    this.allowedNfTypes = allowedNfTypes;
    return this;
  }

  public NFProfile addAllowedNfTypesItem(NFType allowedNfTypesItem) {
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

  public NFProfile allowedNfDomains(List<String> allowedNfDomains) {
    this.allowedNfDomains = allowedNfDomains;
    return this;
  }

  public NFProfile addAllowedNfDomainsItem(String allowedNfDomainsItem) {
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

  public NFProfile allowedNssais(List<ExtSnssai> allowedNssais) {
    this.allowedNssais = allowedNssais;
    return this;
  }

  public NFProfile addAllowedNssaisItem(ExtSnssai allowedNssaisItem) {
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

  public NFProfile priority(Integer priority) {
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

  public NFProfile capacity(Integer capacity) {
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

  public NFProfile load(Integer load) {
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

  public NFProfile loadTimeStamp(OffsetDateTime loadTimeStamp) {
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

  public NFProfile locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Get locality
   * @return locality
  */
  @ApiModelProperty(value = "")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public NFProfile udrInfo(UdrInfo udrInfo) {
    this.udrInfo = udrInfo;
    return this;
  }

  /**
   * Get udrInfo
   * @return udrInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public UdrInfo getUdrInfo() {
    return udrInfo;
  }

  public void setUdrInfo(UdrInfo udrInfo) {
    this.udrInfo = udrInfo;
  }

  public NFProfile udrInfoList(Map<String, UdrInfo> udrInfoList) {
    this.udrInfoList = udrInfoList;
    return this;
  }

  public NFProfile putUdrInfoListItem(String key, UdrInfo udrInfoListItem) {
    if (this.udrInfoList == null) {
      this.udrInfoList = new HashMap<>();
    }
    this.udrInfoList.put(key, udrInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UdrInfo
   * @return udrInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UdrInfo")

  @Valid
@Size(min = 1) 
  public Map<String, UdrInfo> getUdrInfoList() {
    return udrInfoList;
  }

  public void setUdrInfoList(Map<String, UdrInfo> udrInfoList) {
    this.udrInfoList = udrInfoList;
  }

  public NFProfile udmInfo(UdmInfo udmInfo) {
    this.udmInfo = udmInfo;
    return this;
  }

  /**
   * Get udmInfo
   * @return udmInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public UdmInfo getUdmInfo() {
    return udmInfo;
  }

  public void setUdmInfo(UdmInfo udmInfo) {
    this.udmInfo = udmInfo;
  }

  public NFProfile udmInfoList(Map<String, UdmInfo> udmInfoList) {
    this.udmInfoList = udmInfoList;
    return this;
  }

  public NFProfile putUdmInfoListItem(String key, UdmInfo udmInfoListItem) {
    if (this.udmInfoList == null) {
      this.udmInfoList = new HashMap<>();
    }
    this.udmInfoList.put(key, udmInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UdmInfo
   * @return udmInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UdmInfo")

  @Valid
@Size(min = 1) 
  public Map<String, UdmInfo> getUdmInfoList() {
    return udmInfoList;
  }

  public void setUdmInfoList(Map<String, UdmInfo> udmInfoList) {
    this.udmInfoList = udmInfoList;
  }

  public NFProfile ausfInfo(AusfInfo ausfInfo) {
    this.ausfInfo = ausfInfo;
    return this;
  }

  /**
   * Get ausfInfo
   * @return ausfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AusfInfo getAusfInfo() {
    return ausfInfo;
  }

  public void setAusfInfo(AusfInfo ausfInfo) {
    this.ausfInfo = ausfInfo;
  }

  public NFProfile ausfInfoList(Map<String, AusfInfo> ausfInfoList) {
    this.ausfInfoList = ausfInfoList;
    return this;
  }

  public NFProfile putAusfInfoListItem(String key, AusfInfo ausfInfoListItem) {
    if (this.ausfInfoList == null) {
      this.ausfInfoList = new HashMap<>();
    }
    this.ausfInfoList.put(key, ausfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of AusfInfo
   * @return ausfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of AusfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, AusfInfo> getAusfInfoList() {
    return ausfInfoList;
  }

  public void setAusfInfoList(Map<String, AusfInfo> ausfInfoList) {
    this.ausfInfoList = ausfInfoList;
  }

  public NFProfile amfInfo(AmfInfo amfInfo) {
    this.amfInfo = amfInfo;
    return this;
  }

  /**
   * Get amfInfo
   * @return amfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AmfInfo getAmfInfo() {
    return amfInfo;
  }

  public void setAmfInfo(AmfInfo amfInfo) {
    this.amfInfo = amfInfo;
  }

  public NFProfile amfInfoList(Map<String, AmfInfo> amfInfoList) {
    this.amfInfoList = amfInfoList;
    return this;
  }

  public NFProfile putAmfInfoListItem(String key, AmfInfo amfInfoListItem) {
    if (this.amfInfoList == null) {
      this.amfInfoList = new HashMap<>();
    }
    this.amfInfoList.put(key, amfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of AmfInfo
   * @return amfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of AmfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, AmfInfo> getAmfInfoList() {
    return amfInfoList;
  }

  public void setAmfInfoList(Map<String, AmfInfo> amfInfoList) {
    this.amfInfoList = amfInfoList;
  }

  public NFProfile smfInfo(SmfInfo smfInfo) {
    this.smfInfo = smfInfo;
    return this;
  }

  /**
   * Get smfInfo
   * @return smfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmfInfo getSmfInfo() {
    return smfInfo;
  }

  public void setSmfInfo(SmfInfo smfInfo) {
    this.smfInfo = smfInfo;
  }

  public NFProfile smfInfoList(Map<String, SmfInfo> smfInfoList) {
    this.smfInfoList = smfInfoList;
    return this;
  }

  public NFProfile putSmfInfoListItem(String key, SmfInfo smfInfoListItem) {
    if (this.smfInfoList == null) {
      this.smfInfoList = new HashMap<>();
    }
    this.smfInfoList.put(key, smfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of SmfInfo
   * @return smfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of SmfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, SmfInfo> getSmfInfoList() {
    return smfInfoList;
  }

  public void setSmfInfoList(Map<String, SmfInfo> smfInfoList) {
    this.smfInfoList = smfInfoList;
  }

  public NFProfile upfInfo(UpfInfo upfInfo) {
    this.upfInfo = upfInfo;
    return this;
  }

  /**
   * Get upfInfo
   * @return upfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpfInfo getUpfInfo() {
    return upfInfo;
  }

  public void setUpfInfo(UpfInfo upfInfo) {
    this.upfInfo = upfInfo;
  }

  public NFProfile upfInfoList(Map<String, UpfInfo> upfInfoList) {
    this.upfInfoList = upfInfoList;
    return this;
  }

  public NFProfile putUpfInfoListItem(String key, UpfInfo upfInfoListItem) {
    if (this.upfInfoList == null) {
      this.upfInfoList = new HashMap<>();
    }
    this.upfInfoList.put(key, upfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UpfInfo
   * @return upfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UpfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, UpfInfo> getUpfInfoList() {
    return upfInfoList;
  }

  public void setUpfInfoList(Map<String, UpfInfo> upfInfoList) {
    this.upfInfoList = upfInfoList;
  }

  public NFProfile pcfInfo(PcfInfo pcfInfo) {
    this.pcfInfo = pcfInfo;
    return this;
  }

  /**
   * Get pcfInfo
   * @return pcfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PcfInfo getPcfInfo() {
    return pcfInfo;
  }

  public void setPcfInfo(PcfInfo pcfInfo) {
    this.pcfInfo = pcfInfo;
  }

  public NFProfile pcfInfoList(Map<String, PcfInfo> pcfInfoList) {
    this.pcfInfoList = pcfInfoList;
    return this;
  }

  public NFProfile putPcfInfoListItem(String key, PcfInfo pcfInfoListItem) {
    if (this.pcfInfoList == null) {
      this.pcfInfoList = new HashMap<>();
    }
    this.pcfInfoList.put(key, pcfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of PcfInfo
   * @return pcfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of PcfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, PcfInfo> getPcfInfoList() {
    return pcfInfoList;
  }

  public void setPcfInfoList(Map<String, PcfInfo> pcfInfoList) {
    this.pcfInfoList = pcfInfoList;
  }

  public NFProfile bsfInfo(BsfInfo bsfInfo) {
    this.bsfInfo = bsfInfo;
    return this;
  }

  /**
   * Get bsfInfo
   * @return bsfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public BsfInfo getBsfInfo() {
    return bsfInfo;
  }

  public void setBsfInfo(BsfInfo bsfInfo) {
    this.bsfInfo = bsfInfo;
  }

  public NFProfile bsfInfoList(Map<String, BsfInfo> bsfInfoList) {
    this.bsfInfoList = bsfInfoList;
    return this;
  }

  public NFProfile putBsfInfoListItem(String key, BsfInfo bsfInfoListItem) {
    if (this.bsfInfoList == null) {
      this.bsfInfoList = new HashMap<>();
    }
    this.bsfInfoList.put(key, bsfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of BsfInfo
   * @return bsfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of BsfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, BsfInfo> getBsfInfoList() {
    return bsfInfoList;
  }

  public void setBsfInfoList(Map<String, BsfInfo> bsfInfoList) {
    this.bsfInfoList = bsfInfoList;
  }

  public NFProfile chfInfo(ChfInfo chfInfo) {
    this.chfInfo = chfInfo;
    return this;
  }

  /**
   * Get chfInfo
   * @return chfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChfInfo getChfInfo() {
    return chfInfo;
  }

  public void setChfInfo(ChfInfo chfInfo) {
    this.chfInfo = chfInfo;
  }

  public NFProfile chfInfoList(Map<String, ChfInfo> chfInfoList) {
    this.chfInfoList = chfInfoList;
    return this;
  }

  public NFProfile putChfInfoListItem(String key, ChfInfo chfInfoListItem) {
    if (this.chfInfoList == null) {
      this.chfInfoList = new HashMap<>();
    }
    this.chfInfoList.put(key, chfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of ChfInfo
   * @return chfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of ChfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, ChfInfo> getChfInfoList() {
    return chfInfoList;
  }

  public void setChfInfoList(Map<String, ChfInfo> chfInfoList) {
    this.chfInfoList = chfInfoList;
  }

  public NFProfile nefInfo(NefInfo nefInfo) {
    this.nefInfo = nefInfo;
    return this;
  }

  /**
   * Get nefInfo
   * @return nefInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public NefInfo getNefInfo() {
    return nefInfo;
  }

  public void setNefInfo(NefInfo nefInfo) {
    this.nefInfo = nefInfo;
  }

  public NFProfile nrfInfo(NrfInfo nrfInfo) {
    this.nrfInfo = nrfInfo;
    return this;
  }

  /**
   * Get nrfInfo
   * @return nrfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public NrfInfo getNrfInfo() {
    return nrfInfo;
  }

  public void setNrfInfo(NrfInfo nrfInfo) {
    this.nrfInfo = nrfInfo;
  }

  public NFProfile udsfInfo(UdsfInfo udsfInfo) {
    this.udsfInfo = udsfInfo;
    return this;
  }

  /**
   * Get udsfInfo
   * @return udsfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public UdsfInfo getUdsfInfo() {
    return udsfInfo;
  }

  public void setUdsfInfo(UdsfInfo udsfInfo) {
    this.udsfInfo = udsfInfo;
  }

  public NFProfile udsfInfoList(Map<String, UdsfInfo> udsfInfoList) {
    this.udsfInfoList = udsfInfoList;
    return this;
  }

  public NFProfile putUdsfInfoListItem(String key, UdsfInfo udsfInfoListItem) {
    if (this.udsfInfoList == null) {
      this.udsfInfoList = new HashMap<>();
    }
    this.udsfInfoList.put(key, udsfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UdsfInfo
   * @return udsfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of UdsfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, UdsfInfo> getUdsfInfoList() {
    return udsfInfoList;
  }

  public void setUdsfInfoList(Map<String, UdsfInfo> udsfInfoList) {
    this.udsfInfoList = udsfInfoList;
  }

  public NFProfile nwdafInfo(NwdafInfo nwdafInfo) {
    this.nwdafInfo = nwdafInfo;
    return this;
  }

  /**
   * Get nwdafInfo
   * @return nwdafInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public NwdafInfo getNwdafInfo() {
    return nwdafInfo;
  }

  public void setNwdafInfo(NwdafInfo nwdafInfo) {
    this.nwdafInfo = nwdafInfo;
  }

  public NFProfile nwdafInfoList(Map<String, NwdafInfo> nwdafInfoList) {
    this.nwdafInfoList = nwdafInfoList;
    return this;
  }

  public NFProfile putNwdafInfoListItem(String key, NwdafInfo nwdafInfoListItem) {
    if (this.nwdafInfoList == null) {
      this.nwdafInfoList = new HashMap<>();
    }
    this.nwdafInfoList.put(key, nwdafInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a valid JSON string serves as key
   * @return nwdafInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a valid JSON string serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, NwdafInfo> getNwdafInfoList() {
    return nwdafInfoList;
  }

  public void setNwdafInfoList(Map<String, NwdafInfo> nwdafInfoList) {
    this.nwdafInfoList = nwdafInfoList;
  }

  public NFProfile pcscfInfoList(Map<String, PcscfInfo> pcscfInfoList) {
    this.pcscfInfoList = pcscfInfoList;
    return this;
  }

  public NFProfile putPcscfInfoListItem(String key, PcscfInfo pcscfInfoListItem) {
    if (this.pcscfInfoList == null) {
      this.pcscfInfoList = new HashMap<>();
    }
    this.pcscfInfoList.put(key, pcscfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of PcscfInfo
   * @return pcscfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of PcscfInfo")

  @Valid
@Size(min = 1) 
  public Map<String, PcscfInfo> getPcscfInfoList() {
    return pcscfInfoList;
  }

  public void setPcscfInfoList(Map<String, PcscfInfo> pcscfInfoList) {
    this.pcscfInfoList = pcscfInfoList;
  }

  public NFProfile hssInfoList(Map<String, HssInfo> hssInfoList) {
    this.hssInfoList = hssInfoList;
    return this;
  }

  public NFProfile putHssInfoListItem(String key, HssInfo hssInfoListItem) {
    if (this.hssInfoList == null) {
      this.hssInfoList = new HashMap<>();
    }
    this.hssInfoList.put(key, hssInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a (unique) valid JSON string serves as key of HssInfo
   * @return hssInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a (unique) valid JSON string serves as key of HssInfo")

  @Valid
@Size(min = 1) 
  public Map<String, HssInfo> getHssInfoList() {
    return hssInfoList;
  }

  public void setHssInfoList(Map<String, HssInfo> hssInfoList) {
    this.hssInfoList = hssInfoList;
  }

  public NFProfile customInfo(Object customInfo) {
    this.customInfo = customInfo;
    return this;
  }

  /**
   * Get customInfo
   * @return customInfo
  */
  @ApiModelProperty(value = "")


  public Object getCustomInfo() {
    return customInfo;
  }

  public void setCustomInfo(Object customInfo) {
    this.customInfo = customInfo;
  }

  public NFProfile recoveryTime(OffsetDateTime recoveryTime) {
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

  public NFProfile nfServicePersistence(Boolean nfServicePersistence) {
    this.nfServicePersistence = nfServicePersistence;
    return this;
  }

  /**
   * Get nfServicePersistence
   * @return nfServicePersistence
  */
  @ApiModelProperty(value = "")


  public Boolean getNfServicePersistence() {
    return nfServicePersistence;
  }

  public void setNfServicePersistence(Boolean nfServicePersistence) {
    this.nfServicePersistence = nfServicePersistence;
  }

  public NFProfile nfServices(List<NFService> nfServices) {
    this.nfServices = nfServices;
    return this;
  }

  public NFProfile addNfServicesItem(NFService nfServicesItem) {
    if (this.nfServices == null) {
      this.nfServices = new ArrayList<>();
    }
    this.nfServices.add(nfServicesItem);
    return this;
  }

  /**
   * Get nfServices
   * @return nfServices
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<NFService> getNfServices() {
    return nfServices;
  }

  public void setNfServices(List<NFService> nfServices) {
    this.nfServices = nfServices;
  }

  public NFProfile nfServiceList(Map<String, NFService> nfServiceList) {
    this.nfServiceList = nfServiceList;
    return this;
  }

  public NFProfile putNfServiceListItem(String key, NFService nfServiceListItem) {
    if (this.nfServiceList == null) {
      this.nfServiceList = new HashMap<>();
    }
    this.nfServiceList.put(key, nfServiceListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where serviceInstanceId serves as key of NFService
   * @return nfServiceList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where serviceInstanceId serves as key of NFService")

  @Valid
@Size(min = 1) 
  public Map<String, NFService> getNfServiceList() {
    return nfServiceList;
  }

  public void setNfServiceList(Map<String, NFService> nfServiceList) {
    this.nfServiceList = nfServiceList;
  }

  public NFProfile nfProfileChangesSupportInd(Boolean nfProfileChangesSupportInd) {
    this.nfProfileChangesSupportInd = nfProfileChangesSupportInd;
    return this;
  }

  /**
   * Get nfProfileChangesSupportInd
   * @return nfProfileChangesSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getNfProfileChangesSupportInd() {
    return nfProfileChangesSupportInd;
  }

  public void setNfProfileChangesSupportInd(Boolean nfProfileChangesSupportInd) {
    this.nfProfileChangesSupportInd = nfProfileChangesSupportInd;
  }

  public NFProfile nfProfileChangesInd(Boolean nfProfileChangesInd) {
    this.nfProfileChangesInd = nfProfileChangesInd;
    return this;
  }

  /**
   * Get nfProfileChangesInd
   * @return nfProfileChangesInd
  */
  @ApiModelProperty(readOnly = true, value = "")


  public Boolean getNfProfileChangesInd() {
    return nfProfileChangesInd;
  }

  public void setNfProfileChangesInd(Boolean nfProfileChangesInd) {
    this.nfProfileChangesInd = nfProfileChangesInd;
  }

  public NFProfile defaultNotificationSubscriptions(List<DefaultNotificationSubscription> defaultNotificationSubscriptions) {
    this.defaultNotificationSubscriptions = defaultNotificationSubscriptions;
    return this;
  }

  public NFProfile addDefaultNotificationSubscriptionsItem(DefaultNotificationSubscription defaultNotificationSubscriptionsItem) {
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

  public List<DefaultNotificationSubscription> getDefaultNotificationSubscriptions() {
    return defaultNotificationSubscriptions;
  }

  public void setDefaultNotificationSubscriptions(List<DefaultNotificationSubscription> defaultNotificationSubscriptions) {
    this.defaultNotificationSubscriptions = defaultNotificationSubscriptions;
  }

  public NFProfile lmfInfo(LmfInfo lmfInfo) {
    this.lmfInfo = lmfInfo;
    return this;
  }

  /**
   * Get lmfInfo
   * @return lmfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public LmfInfo getLmfInfo() {
    return lmfInfo;
  }

  public void setLmfInfo(LmfInfo lmfInfo) {
    this.lmfInfo = lmfInfo;
  }

  public NFProfile gmlcInfo(GmlcInfo gmlcInfo) {
    this.gmlcInfo = gmlcInfo;
    return this;
  }

  /**
   * Get gmlcInfo
   * @return gmlcInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GmlcInfo getGmlcInfo() {
    return gmlcInfo;
  }

  public void setGmlcInfo(GmlcInfo gmlcInfo) {
    this.gmlcInfo = gmlcInfo;
  }

  public NFProfile nfSetIdList(List<String> nfSetIdList) {
    this.nfSetIdList = nfSetIdList;
    return this;
  }

  public NFProfile addNfSetIdListItem(String nfSetIdListItem) {
    if (this.nfSetIdList == null) {
      this.nfSetIdList = new ArrayList<>();
    }
    this.nfSetIdList.add(nfSetIdListItem);
    return this;
  }

  /**
   * Get nfSetIdList
   * @return nfSetIdList
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getNfSetIdList() {
    return nfSetIdList;
  }

  public void setNfSetIdList(List<String> nfSetIdList) {
    this.nfSetIdList = nfSetIdList;
  }

  public NFProfile servingScope(List<String> servingScope) {
    this.servingScope = servingScope;
    return this;
  }

  public NFProfile addServingScopeItem(String servingScopeItem) {
    if (this.servingScope == null) {
      this.servingScope = new ArrayList<>();
    }
    this.servingScope.add(servingScopeItem);
    return this;
  }

  /**
   * Get servingScope
   * @return servingScope
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getServingScope() {
    return servingScope;
  }

  public void setServingScope(List<String> servingScope) {
    this.servingScope = servingScope;
  }

  public NFProfile lcHSupportInd(Boolean lcHSupportInd) {
    this.lcHSupportInd = lcHSupportInd;
    return this;
  }

  /**
   * Get lcHSupportInd
   * @return lcHSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getLcHSupportInd() {
    return lcHSupportInd;
  }

  public void setLcHSupportInd(Boolean lcHSupportInd) {
    this.lcHSupportInd = lcHSupportInd;
  }

  public NFProfile olcHSupportInd(Boolean olcHSupportInd) {
    this.olcHSupportInd = olcHSupportInd;
    return this;
  }

  /**
   * Get olcHSupportInd
   * @return olcHSupportInd
  */
  @ApiModelProperty(value = "")


  public Boolean getOlcHSupportInd() {
    return olcHSupportInd;
  }

  public void setOlcHSupportInd(Boolean olcHSupportInd) {
    this.olcHSupportInd = olcHSupportInd;
  }

  public NFProfile nfSetRecoveryTimeList(Map<String, OffsetDateTime> nfSetRecoveryTimeList) {
    this.nfSetRecoveryTimeList = nfSetRecoveryTimeList;
    return this;
  }

  public NFProfile putNfSetRecoveryTimeListItem(String key, OffsetDateTime nfSetRecoveryTimeListItem) {
    if (this.nfSetRecoveryTimeList == null) {
      this.nfSetRecoveryTimeList = new HashMap<>();
    }
    this.nfSetRecoveryTimeList.put(key, nfSetRecoveryTimeListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NfSetId serves as key of DateTime
   * @return nfSetRecoveryTimeList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NfSetId serves as key of DateTime")

  @Valid
@Size(min = 1) 
  public Map<String, OffsetDateTime> getNfSetRecoveryTimeList() {
    return nfSetRecoveryTimeList;
  }

  public void setNfSetRecoveryTimeList(Map<String, OffsetDateTime> nfSetRecoveryTimeList) {
    this.nfSetRecoveryTimeList = nfSetRecoveryTimeList;
  }

  public NFProfile serviceSetRecoveryTimeList(Map<String, OffsetDateTime> serviceSetRecoveryTimeList) {
    this.serviceSetRecoveryTimeList = serviceSetRecoveryTimeList;
    return this;
  }

  public NFProfile putServiceSetRecoveryTimeListItem(String key, OffsetDateTime serviceSetRecoveryTimeListItem) {
    if (this.serviceSetRecoveryTimeList == null) {
      this.serviceSetRecoveryTimeList = new HashMap<>();
    }
    this.serviceSetRecoveryTimeList.put(key, serviceSetRecoveryTimeListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NfServiceSetId serves as key of DateTime
   * @return serviceSetRecoveryTimeList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NfServiceSetId serves as key of DateTime")

  @Valid
@Size(min = 1) 
  public Map<String, OffsetDateTime> getServiceSetRecoveryTimeList() {
    return serviceSetRecoveryTimeList;
  }

  public void setServiceSetRecoveryTimeList(Map<String, OffsetDateTime> serviceSetRecoveryTimeList) {
    this.serviceSetRecoveryTimeList = serviceSetRecoveryTimeList;
  }

  public NFProfile scpDomains(List<String> scpDomains) {
    this.scpDomains = scpDomains;
    return this;
  }

  public NFProfile addScpDomainsItem(String scpDomainsItem) {
    if (this.scpDomains == null) {
      this.scpDomains = new ArrayList<>();
    }
    this.scpDomains.add(scpDomainsItem);
    return this;
  }

  /**
   * Get scpDomains
   * @return scpDomains
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getScpDomains() {
    return scpDomains;
  }

  public void setScpDomains(List<String> scpDomains) {
    this.scpDomains = scpDomains;
  }

  public NFProfile scpInfo(ScpInfo scpInfo) {
    this.scpInfo = scpInfo;
    return this;
  }

  /**
   * Get scpInfo
   * @return scpInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ScpInfo getScpInfo() {
    return scpInfo;
  }

  public void setScpInfo(ScpInfo scpInfo) {
    this.scpInfo = scpInfo;
  }

  public NFProfile seppInfo(SeppInfo seppInfo) {
    this.seppInfo = seppInfo;
    return this;
  }

  /**
   * Get seppInfo
   * @return seppInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeppInfo getSeppInfo() {
    return seppInfo;
  }

  public void setSeppInfo(SeppInfo seppInfo) {
    this.seppInfo = seppInfo;
  }

  public NFProfile vendorId(String vendorId) {
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

  public NFProfile supportedVendorSpecificFeatures(Map<String, List<VendorSpecificFeature>> supportedVendorSpecificFeatures) {
    this.supportedVendorSpecificFeatures = supportedVendorSpecificFeatures;
    return this;
  }

  public NFProfile putSupportedVendorSpecificFeaturesItem(String key, List<VendorSpecificFeature> supportedVendorSpecificFeaturesItem) {
    if (this.supportedVendorSpecificFeatures == null) {
      this.supportedVendorSpecificFeatures = new HashMap<>();
    }
    this.supportedVendorSpecificFeatures.put(key, supportedVendorSpecificFeaturesItem);
    return this;
  }

  /**
   * the key of the map is the IANA-assigned SMI Network Management Private Enterprise Codes
   * @return supportedVendorSpecificFeatures
  */
  @ApiModelProperty(value = "the key of the map is the IANA-assigned SMI Network Management Private Enterprise Codes")

  @Valid
@Size(min = 1) 
  public Map<String, List<VendorSpecificFeature>> getSupportedVendorSpecificFeatures() {
    return supportedVendorSpecificFeatures;
  }

  public void setSupportedVendorSpecificFeatures(Map<String, List<VendorSpecificFeature>> supportedVendorSpecificFeatures) {
    this.supportedVendorSpecificFeatures = supportedVendorSpecificFeatures;
  }

  public NFProfile aanfInfoList(Map<String, AanfInfo> aanfInfoList) {
    this.aanfInfoList = aanfInfoList;
    return this;
  }

  public NFProfile putAanfInfoListItem(String key, AanfInfo aanfInfoListItem) {
    if (this.aanfInfoList == null) {
      this.aanfInfoList = new HashMap<>();
    }
    this.aanfInfoList.put(key, aanfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a valid JSON string serves as key
   * @return aanfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a valid JSON string serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AanfInfo> getAanfInfoList() {
    return aanfInfoList;
  }

  public void setAanfInfoList(Map<String, AanfInfo> aanfInfoList) {
    this.aanfInfoList = aanfInfoList;
  }

  public NFProfile _5gDdnmfInfo(Model5GDdnmfInfo _5gDdnmfInfo) {
    this._5gDdnmfInfo = _5gDdnmfInfo;
    return this;
  }

  /**
   * Get _5gDdnmfInfo
   * @return _5gDdnmfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public Model5GDdnmfInfo get5gDdnmfInfo() {
    return _5gDdnmfInfo;
  }

  public void set5gDdnmfInfo(Model5GDdnmfInfo _5gDdnmfInfo) {
    this._5gDdnmfInfo = _5gDdnmfInfo;
  }

  public NFProfile mfafInfo(MfafInfo mfafInfo) {
    this.mfafInfo = mfafInfo;
    return this;
  }

  /**
   * Get mfafInfo
   * @return mfafInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public MfafInfo getMfafInfo() {
    return mfafInfo;
  }

  public void setMfafInfo(MfafInfo mfafInfo) {
    this.mfafInfo = mfafInfo;
  }

  public NFProfile easdfInfoList(Map<String, EasdfInfo> easdfInfoList) {
    this.easdfInfoList = easdfInfoList;
    return this;
  }

  public NFProfile putEasdfInfoListItem(String key, EasdfInfo easdfInfoListItem) {
    if (this.easdfInfoList == null) {
      this.easdfInfoList = new HashMap<>();
    }
    this.easdfInfoList.put(key, easdfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where a valid JSON string serves as key
   * @return easdfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where a valid JSON string serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, EasdfInfo> getEasdfInfoList() {
    return easdfInfoList;
  }

  public void setEasdfInfoList(Map<String, EasdfInfo> easdfInfoList) {
    this.easdfInfoList = easdfInfoList;
  }

  public NFProfile dccfInfo(DccfInfo dccfInfo) {
    this.dccfInfo = dccfInfo;
    return this;
  }

  /**
   * Get dccfInfo
   * @return dccfInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DccfInfo getDccfInfo() {
    return dccfInfo;
  }

  public void setDccfInfo(DccfInfo dccfInfo) {
    this.dccfInfo = dccfInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFProfile nfProfile = (NFProfile) o;
    return Objects.equals(this.nfInstanceId, nfProfile.nfInstanceId) &&
        Objects.equals(this.nfType, nfProfile.nfType) &&
        Objects.equals(this.nfStatus, nfProfile.nfStatus) &&
        Objects.equals(this.nfInstanceName, nfProfile.nfInstanceName) &&
        Objects.equals(this.heartBeatTimer, nfProfile.heartBeatTimer) &&
        Objects.equals(this.plmnList, nfProfile.plmnList) &&
        Objects.equals(this.snpnList, nfProfile.snpnList) &&
        Objects.equals(this.sNssais, nfProfile.sNssais) &&
        Objects.equals(this.perPlmnSnssaiList, nfProfile.perPlmnSnssaiList) &&
        Objects.equals(this.nsiList, nfProfile.nsiList) &&
        Objects.equals(this.fqdn, nfProfile.fqdn) &&
        Objects.equals(this.interPlmnFqdn, nfProfile.interPlmnFqdn) &&
        Objects.equals(this.ipv4Addresses, nfProfile.ipv4Addresses) &&
        Objects.equals(this.ipv6Addresses, nfProfile.ipv6Addresses) &&
        Objects.equals(this.allowedPlmns, nfProfile.allowedPlmns) &&
        Objects.equals(this.allowedSnpns, nfProfile.allowedSnpns) &&
        Objects.equals(this.allowedNfTypes, nfProfile.allowedNfTypes) &&
        Objects.equals(this.allowedNfDomains, nfProfile.allowedNfDomains) &&
        Objects.equals(this.allowedNssais, nfProfile.allowedNssais) &&
        Objects.equals(this.priority, nfProfile.priority) &&
        Objects.equals(this.capacity, nfProfile.capacity) &&
        Objects.equals(this.load, nfProfile.load) &&
        Objects.equals(this.loadTimeStamp, nfProfile.loadTimeStamp) &&
        Objects.equals(this.locality, nfProfile.locality) &&
        Objects.equals(this.udrInfo, nfProfile.udrInfo) &&
        Objects.equals(this.udrInfoList, nfProfile.udrInfoList) &&
        Objects.equals(this.udmInfo, nfProfile.udmInfo) &&
        Objects.equals(this.udmInfoList, nfProfile.udmInfoList) &&
        Objects.equals(this.ausfInfo, nfProfile.ausfInfo) &&
        Objects.equals(this.ausfInfoList, nfProfile.ausfInfoList) &&
        Objects.equals(this.amfInfo, nfProfile.amfInfo) &&
        Objects.equals(this.amfInfoList, nfProfile.amfInfoList) &&
        Objects.equals(this.smfInfo, nfProfile.smfInfo) &&
        Objects.equals(this.smfInfoList, nfProfile.smfInfoList) &&
        Objects.equals(this.upfInfo, nfProfile.upfInfo) &&
        Objects.equals(this.upfInfoList, nfProfile.upfInfoList) &&
        Objects.equals(this.pcfInfo, nfProfile.pcfInfo) &&
        Objects.equals(this.pcfInfoList, nfProfile.pcfInfoList) &&
        Objects.equals(this.bsfInfo, nfProfile.bsfInfo) &&
        Objects.equals(this.bsfInfoList, nfProfile.bsfInfoList) &&
        Objects.equals(this.chfInfo, nfProfile.chfInfo) &&
        Objects.equals(this.chfInfoList, nfProfile.chfInfoList) &&
        Objects.equals(this.nefInfo, nfProfile.nefInfo) &&
        Objects.equals(this.nrfInfo, nfProfile.nrfInfo) &&
        Objects.equals(this.udsfInfo, nfProfile.udsfInfo) &&
        Objects.equals(this.udsfInfoList, nfProfile.udsfInfoList) &&
        Objects.equals(this.nwdafInfo, nfProfile.nwdafInfo) &&
        Objects.equals(this.nwdafInfoList, nfProfile.nwdafInfoList) &&
        Objects.equals(this.pcscfInfoList, nfProfile.pcscfInfoList) &&
        Objects.equals(this.hssInfoList, nfProfile.hssInfoList) &&
        Objects.equals(this.customInfo, nfProfile.customInfo) &&
        Objects.equals(this.recoveryTime, nfProfile.recoveryTime) &&
        Objects.equals(this.nfServicePersistence, nfProfile.nfServicePersistence) &&
        Objects.equals(this.nfServices, nfProfile.nfServices) &&
        Objects.equals(this.nfServiceList, nfProfile.nfServiceList) &&
        Objects.equals(this.nfProfileChangesSupportInd, nfProfile.nfProfileChangesSupportInd) &&
        Objects.equals(this.nfProfileChangesInd, nfProfile.nfProfileChangesInd) &&
        Objects.equals(this.defaultNotificationSubscriptions, nfProfile.defaultNotificationSubscriptions) &&
        Objects.equals(this.lmfInfo, nfProfile.lmfInfo) &&
        Objects.equals(this.gmlcInfo, nfProfile.gmlcInfo) &&
        Objects.equals(this.nfSetIdList, nfProfile.nfSetIdList) &&
        Objects.equals(this.servingScope, nfProfile.servingScope) &&
        Objects.equals(this.lcHSupportInd, nfProfile.lcHSupportInd) &&
        Objects.equals(this.olcHSupportInd, nfProfile.olcHSupportInd) &&
        Objects.equals(this.nfSetRecoveryTimeList, nfProfile.nfSetRecoveryTimeList) &&
        Objects.equals(this.serviceSetRecoveryTimeList, nfProfile.serviceSetRecoveryTimeList) &&
        Objects.equals(this.scpDomains, nfProfile.scpDomains) &&
        Objects.equals(this.scpInfo, nfProfile.scpInfo) &&
        Objects.equals(this.seppInfo, nfProfile.seppInfo) &&
        Objects.equals(this.vendorId, nfProfile.vendorId) &&
        Objects.equals(this.supportedVendorSpecificFeatures, nfProfile.supportedVendorSpecificFeatures) &&
        Objects.equals(this.aanfInfoList, nfProfile.aanfInfoList) &&
        Objects.equals(this._5gDdnmfInfo, nfProfile._5gDdnmfInfo) &&
        Objects.equals(this.mfafInfo, nfProfile.mfafInfo) &&
        Objects.equals(this.easdfInfoList, nfProfile.easdfInfoList) &&
        Objects.equals(this.dccfInfo, nfProfile.dccfInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfInstanceId, nfType, nfStatus, nfInstanceName, heartBeatTimer, plmnList, snpnList, sNssais, perPlmnSnssaiList, nsiList, fqdn, interPlmnFqdn, ipv4Addresses, ipv6Addresses, allowedPlmns, allowedSnpns, allowedNfTypes, allowedNfDomains, allowedNssais, priority, capacity, load, loadTimeStamp, locality, udrInfo, udrInfoList, udmInfo, udmInfoList, ausfInfo, ausfInfoList, amfInfo, amfInfoList, smfInfo, smfInfoList, upfInfo, upfInfoList, pcfInfo, pcfInfoList, bsfInfo, bsfInfoList, chfInfo, chfInfoList, nefInfo, nrfInfo, udsfInfo, udsfInfoList, nwdafInfo, nwdafInfoList, pcscfInfoList, hssInfoList, customInfo, recoveryTime, nfServicePersistence, nfServices, nfServiceList, nfProfileChangesSupportInd, nfProfileChangesInd, defaultNotificationSubscriptions, lmfInfo, gmlcInfo, nfSetIdList, servingScope, lcHSupportInd, olcHSupportInd, nfSetRecoveryTimeList, serviceSetRecoveryTimeList, scpDomains, scpInfo, seppInfo, vendorId, supportedVendorSpecificFeatures, aanfInfoList, _5gDdnmfInfo, mfafInfo, easdfInfoList, dccfInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFProfile {\n");
    
    sb.append("    nfInstanceId: ").append(toIndentedString(nfInstanceId)).append("\n");
    sb.append("    nfType: ").append(toIndentedString(nfType)).append("\n");
    sb.append("    nfStatus: ").append(toIndentedString(nfStatus)).append("\n");
    sb.append("    nfInstanceName: ").append(toIndentedString(nfInstanceName)).append("\n");
    sb.append("    heartBeatTimer: ").append(toIndentedString(heartBeatTimer)).append("\n");
    sb.append("    plmnList: ").append(toIndentedString(plmnList)).append("\n");
    sb.append("    snpnList: ").append(toIndentedString(snpnList)).append("\n");
    sb.append("    sNssais: ").append(toIndentedString(sNssais)).append("\n");
    sb.append("    perPlmnSnssaiList: ").append(toIndentedString(perPlmnSnssaiList)).append("\n");
    sb.append("    nsiList: ").append(toIndentedString(nsiList)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    interPlmnFqdn: ").append(toIndentedString(interPlmnFqdn)).append("\n");
    sb.append("    ipv4Addresses: ").append(toIndentedString(ipv4Addresses)).append("\n");
    sb.append("    ipv6Addresses: ").append(toIndentedString(ipv6Addresses)).append("\n");
    sb.append("    allowedPlmns: ").append(toIndentedString(allowedPlmns)).append("\n");
    sb.append("    allowedSnpns: ").append(toIndentedString(allowedSnpns)).append("\n");
    sb.append("    allowedNfTypes: ").append(toIndentedString(allowedNfTypes)).append("\n");
    sb.append("    allowedNfDomains: ").append(toIndentedString(allowedNfDomains)).append("\n");
    sb.append("    allowedNssais: ").append(toIndentedString(allowedNssais)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
    sb.append("    loadTimeStamp: ").append(toIndentedString(loadTimeStamp)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    udrInfo: ").append(toIndentedString(udrInfo)).append("\n");
    sb.append("    udrInfoList: ").append(toIndentedString(udrInfoList)).append("\n");
    sb.append("    udmInfo: ").append(toIndentedString(udmInfo)).append("\n");
    sb.append("    udmInfoList: ").append(toIndentedString(udmInfoList)).append("\n");
    sb.append("    ausfInfo: ").append(toIndentedString(ausfInfo)).append("\n");
    sb.append("    ausfInfoList: ").append(toIndentedString(ausfInfoList)).append("\n");
    sb.append("    amfInfo: ").append(toIndentedString(amfInfo)).append("\n");
    sb.append("    amfInfoList: ").append(toIndentedString(amfInfoList)).append("\n");
    sb.append("    smfInfo: ").append(toIndentedString(smfInfo)).append("\n");
    sb.append("    smfInfoList: ").append(toIndentedString(smfInfoList)).append("\n");
    sb.append("    upfInfo: ").append(toIndentedString(upfInfo)).append("\n");
    sb.append("    upfInfoList: ").append(toIndentedString(upfInfoList)).append("\n");
    sb.append("    pcfInfo: ").append(toIndentedString(pcfInfo)).append("\n");
    sb.append("    pcfInfoList: ").append(toIndentedString(pcfInfoList)).append("\n");
    sb.append("    bsfInfo: ").append(toIndentedString(bsfInfo)).append("\n");
    sb.append("    bsfInfoList: ").append(toIndentedString(bsfInfoList)).append("\n");
    sb.append("    chfInfo: ").append(toIndentedString(chfInfo)).append("\n");
    sb.append("    chfInfoList: ").append(toIndentedString(chfInfoList)).append("\n");
    sb.append("    nefInfo: ").append(toIndentedString(nefInfo)).append("\n");
    sb.append("    nrfInfo: ").append(toIndentedString(nrfInfo)).append("\n");
    sb.append("    udsfInfo: ").append(toIndentedString(udsfInfo)).append("\n");
    sb.append("    udsfInfoList: ").append(toIndentedString(udsfInfoList)).append("\n");
    sb.append("    nwdafInfo: ").append(toIndentedString(nwdafInfo)).append("\n");
    sb.append("    nwdafInfoList: ").append(toIndentedString(nwdafInfoList)).append("\n");
    sb.append("    pcscfInfoList: ").append(toIndentedString(pcscfInfoList)).append("\n");
    sb.append("    hssInfoList: ").append(toIndentedString(hssInfoList)).append("\n");
    sb.append("    customInfo: ").append(toIndentedString(customInfo)).append("\n");
    sb.append("    recoveryTime: ").append(toIndentedString(recoveryTime)).append("\n");
    sb.append("    nfServicePersistence: ").append(toIndentedString(nfServicePersistence)).append("\n");
    sb.append("    nfServices: ").append(toIndentedString(nfServices)).append("\n");
    sb.append("    nfServiceList: ").append(toIndentedString(nfServiceList)).append("\n");
    sb.append("    nfProfileChangesSupportInd: ").append(toIndentedString(nfProfileChangesSupportInd)).append("\n");
    sb.append("    nfProfileChangesInd: ").append(toIndentedString(nfProfileChangesInd)).append("\n");
    sb.append("    defaultNotificationSubscriptions: ").append(toIndentedString(defaultNotificationSubscriptions)).append("\n");
    sb.append("    lmfInfo: ").append(toIndentedString(lmfInfo)).append("\n");
    sb.append("    gmlcInfo: ").append(toIndentedString(gmlcInfo)).append("\n");
    sb.append("    nfSetIdList: ").append(toIndentedString(nfSetIdList)).append("\n");
    sb.append("    servingScope: ").append(toIndentedString(servingScope)).append("\n");
    sb.append("    lcHSupportInd: ").append(toIndentedString(lcHSupportInd)).append("\n");
    sb.append("    olcHSupportInd: ").append(toIndentedString(olcHSupportInd)).append("\n");
    sb.append("    nfSetRecoveryTimeList: ").append(toIndentedString(nfSetRecoveryTimeList)).append("\n");
    sb.append("    serviceSetRecoveryTimeList: ").append(toIndentedString(serviceSetRecoveryTimeList)).append("\n");
    sb.append("    scpDomains: ").append(toIndentedString(scpDomains)).append("\n");
    sb.append("    scpInfo: ").append(toIndentedString(scpInfo)).append("\n");
    sb.append("    seppInfo: ").append(toIndentedString(seppInfo)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    supportedVendorSpecificFeatures: ").append(toIndentedString(supportedVendorSpecificFeatures)).append("\n");
    sb.append("    aanfInfoList: ").append(toIndentedString(aanfInfoList)).append("\n");
    sb.append("    _5gDdnmfInfo: ").append(toIndentedString(_5gDdnmfInfo)).append("\n");
    sb.append("    mfafInfo: ").append(toIndentedString(mfafInfo)).append("\n");
    sb.append("    easdfInfoList: ").append(toIndentedString(easdfInfoList)).append("\n");
    sb.append("    dccfInfo: ").append(toIndentedString(dccfInfo)).append("\n");
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

