package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oreore.nrf.model.AnyOfAanfInfoobject;
import oreore.nrf.model.AnyOfAmfInfoobject;
import oreore.nrf.model.AnyOfAusfInfoobject;
import oreore.nrf.model.AnyOfBsfInfoobject;
import oreore.nrf.model.AnyOfChfInfoobject;
import oreore.nrf.model.AnyOfGmlcInfoobject;
import oreore.nrf.model.AnyOfHssInfoobject;
import oreore.nrf.model.AnyOfLmfInfoobject;
import oreore.nrf.model.AnyOfNefInfoobject;
import oreore.nrf.model.AnyOfNwdafInfoobject;
import oreore.nrf.model.AnyOfPcfInfoobject;
import oreore.nrf.model.AnyOfPcscfInfoobject;
import oreore.nrf.model.AnyOfScpInfoobject;
import oreore.nrf.model.AnyOfSeppInfoobject;
import oreore.nrf.model.AnyOfSmfInfoobject;
import oreore.nrf.model.AnyOfUdmInfoobject;
import oreore.nrf.model.AnyOfUdrInfoobject;
import oreore.nrf.model.AnyOfUdsfInfoobject;
import oreore.nrf.model.AnyOfUpfInfoobject;
import oreore.nrf.model.DccfInfo;
import oreore.nrf.model.EasdfInfo;
import oreore.nrf.model.MfafInfo;
import oreore.nrf.model.Model5GDdnmfInfo;
import oreore.nrf.model.NfInfo;
import oreore.nrf.model.NwdafInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of an NRF NF Instance, used in hierarchical NRF deployments
 */
@ApiModel(description = "Information of an NRF NF Instance, used in hierarchical NRF deployments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NrfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("servedUdrInfo")
  @Valid
  private Map<String, AnyOfUdrInfoobject> servedUdrInfo = null;

  @JsonProperty("servedUdrInfoList")
  @Valid
  private Map<String, Map<String, AnyOfUdrInfoobject>> servedUdrInfoList = null;

  @JsonProperty("servedUdmInfo")
  @Valid
  private Map<String, AnyOfUdmInfoobject> servedUdmInfo = null;

  @JsonProperty("servedUdmInfoList")
  @Valid
  private Map<String, Map<String, AnyOfUdmInfoobject>> servedUdmInfoList = null;

  @JsonProperty("servedAusfInfo")
  @Valid
  private Map<String, AnyOfAusfInfoobject> servedAusfInfo = null;

  @JsonProperty("servedAusfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfAusfInfoobject>> servedAusfInfoList = null;

  @JsonProperty("servedAmfInfo")
  @Valid
  private Map<String, AnyOfAmfInfoobject> servedAmfInfo = null;

  @JsonProperty("servedAmfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfAmfInfoobject>> servedAmfInfoList = null;

  @JsonProperty("servedSmfInfo")
  @Valid
  private Map<String, AnyOfSmfInfoobject> servedSmfInfo = null;

  @JsonProperty("servedSmfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfSmfInfoobject>> servedSmfInfoList = null;

  @JsonProperty("servedUpfInfo")
  @Valid
  private Map<String, AnyOfUpfInfoobject> servedUpfInfo = null;

  @JsonProperty("servedUpfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfUpfInfoobject>> servedUpfInfoList = null;

  @JsonProperty("servedPcfInfo")
  @Valid
  private Map<String, AnyOfPcfInfoobject> servedPcfInfo = null;

  @JsonProperty("servedPcfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfPcfInfoobject>> servedPcfInfoList = null;

  @JsonProperty("servedBsfInfo")
  @Valid
  private Map<String, AnyOfBsfInfoobject> servedBsfInfo = null;

  @JsonProperty("servedBsfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfBsfInfoobject>> servedBsfInfoList = null;

  @JsonProperty("servedChfInfo")
  @Valid
  private Map<String, AnyOfChfInfoobject> servedChfInfo = null;

  @JsonProperty("servedChfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfChfInfoobject>> servedChfInfoList = null;

  @JsonProperty("servedNefInfo")
  @Valid
  private Map<String, AnyOfNefInfoobject> servedNefInfo = null;

  @JsonProperty("servedNwdafInfo")
  @Valid
  private Map<String, AnyOfNwdafInfoobject> servedNwdafInfo = null;

  @JsonProperty("servedNwdafInfoList")
  @Valid
  private Map<String, Map<String, NwdafInfo>> servedNwdafInfoList = null;

  @JsonProperty("servedPcscfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfPcscfInfoobject>> servedPcscfInfoList = null;

  @JsonProperty("servedGmlcInfo")
  @Valid
  private Map<String, AnyOfGmlcInfoobject> servedGmlcInfo = null;

  @JsonProperty("servedLmfInfo")
  @Valid
  private Map<String, AnyOfLmfInfoobject> servedLmfInfo = null;

  @JsonProperty("servedNfInfo")
  @Valid
  private Map<String, NfInfo> servedNfInfo = null;

  @JsonProperty("servedHssInfoList")
  @Valid
  private Map<String, Map<String, AnyOfHssInfoobject>> servedHssInfoList = null;

  @JsonProperty("servedUdsfInfo")
  @Valid
  private Map<String, AnyOfUdsfInfoobject> servedUdsfInfo = null;

  @JsonProperty("servedUdsfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfUdsfInfoobject>> servedUdsfInfoList = null;

  @JsonProperty("servedScpInfoList")
  @Valid
  private Map<String, AnyOfScpInfoobject> servedScpInfoList = null;

  @JsonProperty("servedSeppInfoList")
  @Valid
  private Map<String, AnyOfSeppInfoobject> servedSeppInfoList = null;

  @JsonProperty("servedAanfInfoList")
  @Valid
  private Map<String, Map<String, AnyOfAanfInfoobject>> servedAanfInfoList = null;

  @JsonProperty("served5gDdnmfInfo")
  @Valid
  private Map<String, Model5GDdnmfInfo> served5gDdnmfInfo = null;

  @JsonProperty("servedMfafInfoList")
  @Valid
  private Map<String, MfafInfo> servedMfafInfoList = null;

  @JsonProperty("servedEasdfInfoList")
  @Valid
  private Map<String, Map<String, EasdfInfo>> servedEasdfInfoList = null;

  @JsonProperty("servedDccfInfoList")
  @Valid
  private Map<String, DccfInfo> servedDccfInfoList = null;

  public NrfInfo servedUdrInfo(Map<String, AnyOfUdrInfoobject> servedUdrInfo) {
    this.servedUdrInfo = servedUdrInfo;
    return this;
  }

  public NrfInfo putServedUdrInfoItem(String key, AnyOfUdrInfoobject servedUdrInfoItem) {
    if (this.servedUdrInfo == null) {
      this.servedUdrInfo = new HashMap<>();
    }
    this.servedUdrInfo.put(key, servedUdrInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUdrInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfUdrInfoobject> getServedUdrInfo() {
    return servedUdrInfo;
  }

  public void setServedUdrInfo(Map<String, AnyOfUdrInfoobject> servedUdrInfo) {
    this.servedUdrInfo = servedUdrInfo;
  }

  public NrfInfo servedUdrInfoList(Map<String, Map<String, AnyOfUdrInfoobject>> servedUdrInfoList) {
    this.servedUdrInfoList = servedUdrInfoList;
    return this;
  }

  public NrfInfo putServedUdrInfoListItem(String key, Map<String, AnyOfUdrInfoobject> servedUdrInfoListItem) {
    if (this.servedUdrInfoList == null) {
      this.servedUdrInfoList = new HashMap<>();
    }
    this.servedUdrInfoList.put(key, servedUdrInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUdrInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfUdrInfoobject>> getServedUdrInfoList() {
    return servedUdrInfoList;
  }

  public void setServedUdrInfoList(Map<String, Map<String, AnyOfUdrInfoobject>> servedUdrInfoList) {
    this.servedUdrInfoList = servedUdrInfoList;
  }

  public NrfInfo servedUdmInfo(Map<String, AnyOfUdmInfoobject> servedUdmInfo) {
    this.servedUdmInfo = servedUdmInfo;
    return this;
  }

  public NrfInfo putServedUdmInfoItem(String key, AnyOfUdmInfoobject servedUdmInfoItem) {
    if (this.servedUdmInfo == null) {
      this.servedUdmInfo = new HashMap<>();
    }
    this.servedUdmInfo.put(key, servedUdmInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUdmInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfUdmInfoobject> getServedUdmInfo() {
    return servedUdmInfo;
  }

  public void setServedUdmInfo(Map<String, AnyOfUdmInfoobject> servedUdmInfo) {
    this.servedUdmInfo = servedUdmInfo;
  }

  public NrfInfo servedUdmInfoList(Map<String, Map<String, AnyOfUdmInfoobject>> servedUdmInfoList) {
    this.servedUdmInfoList = servedUdmInfoList;
    return this;
  }

  public NrfInfo putServedUdmInfoListItem(String key, Map<String, AnyOfUdmInfoobject> servedUdmInfoListItem) {
    if (this.servedUdmInfoList == null) {
      this.servedUdmInfoList = new HashMap<>();
    }
    this.servedUdmInfoList.put(key, servedUdmInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUdmInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfUdmInfoobject>> getServedUdmInfoList() {
    return servedUdmInfoList;
  }

  public void setServedUdmInfoList(Map<String, Map<String, AnyOfUdmInfoobject>> servedUdmInfoList) {
    this.servedUdmInfoList = servedUdmInfoList;
  }

  public NrfInfo servedAusfInfo(Map<String, AnyOfAusfInfoobject> servedAusfInfo) {
    this.servedAusfInfo = servedAusfInfo;
    return this;
  }

  public NrfInfo putServedAusfInfoItem(String key, AnyOfAusfInfoobject servedAusfInfoItem) {
    if (this.servedAusfInfo == null) {
      this.servedAusfInfo = new HashMap<>();
    }
    this.servedAusfInfo.put(key, servedAusfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedAusfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfAusfInfoobject> getServedAusfInfo() {
    return servedAusfInfo;
  }

  public void setServedAusfInfo(Map<String, AnyOfAusfInfoobject> servedAusfInfo) {
    this.servedAusfInfo = servedAusfInfo;
  }

  public NrfInfo servedAusfInfoList(Map<String, Map<String, AnyOfAusfInfoobject>> servedAusfInfoList) {
    this.servedAusfInfoList = servedAusfInfoList;
    return this;
  }

  public NrfInfo putServedAusfInfoListItem(String key, Map<String, AnyOfAusfInfoobject> servedAusfInfoListItem) {
    if (this.servedAusfInfoList == null) {
      this.servedAusfInfoList = new HashMap<>();
    }
    this.servedAusfInfoList.put(key, servedAusfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedAusfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfAusfInfoobject>> getServedAusfInfoList() {
    return servedAusfInfoList;
  }

  public void setServedAusfInfoList(Map<String, Map<String, AnyOfAusfInfoobject>> servedAusfInfoList) {
    this.servedAusfInfoList = servedAusfInfoList;
  }

  public NrfInfo servedAmfInfo(Map<String, AnyOfAmfInfoobject> servedAmfInfo) {
    this.servedAmfInfo = servedAmfInfo;
    return this;
  }

  public NrfInfo putServedAmfInfoItem(String key, AnyOfAmfInfoobject servedAmfInfoItem) {
    if (this.servedAmfInfo == null) {
      this.servedAmfInfo = new HashMap<>();
    }
    this.servedAmfInfo.put(key, servedAmfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedAmfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfAmfInfoobject> getServedAmfInfo() {
    return servedAmfInfo;
  }

  public void setServedAmfInfo(Map<String, AnyOfAmfInfoobject> servedAmfInfo) {
    this.servedAmfInfo = servedAmfInfo;
  }

  public NrfInfo servedAmfInfoList(Map<String, Map<String, AnyOfAmfInfoobject>> servedAmfInfoList) {
    this.servedAmfInfoList = servedAmfInfoList;
    return this;
  }

  public NrfInfo putServedAmfInfoListItem(String key, Map<String, AnyOfAmfInfoobject> servedAmfInfoListItem) {
    if (this.servedAmfInfoList == null) {
      this.servedAmfInfoList = new HashMap<>();
    }
    this.servedAmfInfoList.put(key, servedAmfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedAmfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfAmfInfoobject>> getServedAmfInfoList() {
    return servedAmfInfoList;
  }

  public void setServedAmfInfoList(Map<String, Map<String, AnyOfAmfInfoobject>> servedAmfInfoList) {
    this.servedAmfInfoList = servedAmfInfoList;
  }

  public NrfInfo servedSmfInfo(Map<String, AnyOfSmfInfoobject> servedSmfInfo) {
    this.servedSmfInfo = servedSmfInfo;
    return this;
  }

  public NrfInfo putServedSmfInfoItem(String key, AnyOfSmfInfoobject servedSmfInfoItem) {
    if (this.servedSmfInfo == null) {
      this.servedSmfInfo = new HashMap<>();
    }
    this.servedSmfInfo.put(key, servedSmfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedSmfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfSmfInfoobject> getServedSmfInfo() {
    return servedSmfInfo;
  }

  public void setServedSmfInfo(Map<String, AnyOfSmfInfoobject> servedSmfInfo) {
    this.servedSmfInfo = servedSmfInfo;
  }

  public NrfInfo servedSmfInfoList(Map<String, Map<String, AnyOfSmfInfoobject>> servedSmfInfoList) {
    this.servedSmfInfoList = servedSmfInfoList;
    return this;
  }

  public NrfInfo putServedSmfInfoListItem(String key, Map<String, AnyOfSmfInfoobject> servedSmfInfoListItem) {
    if (this.servedSmfInfoList == null) {
      this.servedSmfInfoList = new HashMap<>();
    }
    this.servedSmfInfoList.put(key, servedSmfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedSmfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfSmfInfoobject>> getServedSmfInfoList() {
    return servedSmfInfoList;
  }

  public void setServedSmfInfoList(Map<String, Map<String, AnyOfSmfInfoobject>> servedSmfInfoList) {
    this.servedSmfInfoList = servedSmfInfoList;
  }

  public NrfInfo servedUpfInfo(Map<String, AnyOfUpfInfoobject> servedUpfInfo) {
    this.servedUpfInfo = servedUpfInfo;
    return this;
  }

  public NrfInfo putServedUpfInfoItem(String key, AnyOfUpfInfoobject servedUpfInfoItem) {
    if (this.servedUpfInfo == null) {
      this.servedUpfInfo = new HashMap<>();
    }
    this.servedUpfInfo.put(key, servedUpfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUpfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfUpfInfoobject> getServedUpfInfo() {
    return servedUpfInfo;
  }

  public void setServedUpfInfo(Map<String, AnyOfUpfInfoobject> servedUpfInfo) {
    this.servedUpfInfo = servedUpfInfo;
  }

  public NrfInfo servedUpfInfoList(Map<String, Map<String, AnyOfUpfInfoobject>> servedUpfInfoList) {
    this.servedUpfInfoList = servedUpfInfoList;
    return this;
  }

  public NrfInfo putServedUpfInfoListItem(String key, Map<String, AnyOfUpfInfoobject> servedUpfInfoListItem) {
    if (this.servedUpfInfoList == null) {
      this.servedUpfInfoList = new HashMap<>();
    }
    this.servedUpfInfoList.put(key, servedUpfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUpfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfUpfInfoobject>> getServedUpfInfoList() {
    return servedUpfInfoList;
  }

  public void setServedUpfInfoList(Map<String, Map<String, AnyOfUpfInfoobject>> servedUpfInfoList) {
    this.servedUpfInfoList = servedUpfInfoList;
  }

  public NrfInfo servedPcfInfo(Map<String, AnyOfPcfInfoobject> servedPcfInfo) {
    this.servedPcfInfo = servedPcfInfo;
    return this;
  }

  public NrfInfo putServedPcfInfoItem(String key, AnyOfPcfInfoobject servedPcfInfoItem) {
    if (this.servedPcfInfo == null) {
      this.servedPcfInfo = new HashMap<>();
    }
    this.servedPcfInfo.put(key, servedPcfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedPcfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfPcfInfoobject> getServedPcfInfo() {
    return servedPcfInfo;
  }

  public void setServedPcfInfo(Map<String, AnyOfPcfInfoobject> servedPcfInfo) {
    this.servedPcfInfo = servedPcfInfo;
  }

  public NrfInfo servedPcfInfoList(Map<String, Map<String, AnyOfPcfInfoobject>> servedPcfInfoList) {
    this.servedPcfInfoList = servedPcfInfoList;
    return this;
  }

  public NrfInfo putServedPcfInfoListItem(String key, Map<String, AnyOfPcfInfoobject> servedPcfInfoListItem) {
    if (this.servedPcfInfoList == null) {
      this.servedPcfInfoList = new HashMap<>();
    }
    this.servedPcfInfoList.put(key, servedPcfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedPcfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfPcfInfoobject>> getServedPcfInfoList() {
    return servedPcfInfoList;
  }

  public void setServedPcfInfoList(Map<String, Map<String, AnyOfPcfInfoobject>> servedPcfInfoList) {
    this.servedPcfInfoList = servedPcfInfoList;
  }

  public NrfInfo servedBsfInfo(Map<String, AnyOfBsfInfoobject> servedBsfInfo) {
    this.servedBsfInfo = servedBsfInfo;
    return this;
  }

  public NrfInfo putServedBsfInfoItem(String key, AnyOfBsfInfoobject servedBsfInfoItem) {
    if (this.servedBsfInfo == null) {
      this.servedBsfInfo = new HashMap<>();
    }
    this.servedBsfInfo.put(key, servedBsfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedBsfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfBsfInfoobject> getServedBsfInfo() {
    return servedBsfInfo;
  }

  public void setServedBsfInfo(Map<String, AnyOfBsfInfoobject> servedBsfInfo) {
    this.servedBsfInfo = servedBsfInfo;
  }

  public NrfInfo servedBsfInfoList(Map<String, Map<String, AnyOfBsfInfoobject>> servedBsfInfoList) {
    this.servedBsfInfoList = servedBsfInfoList;
    return this;
  }

  public NrfInfo putServedBsfInfoListItem(String key, Map<String, AnyOfBsfInfoobject> servedBsfInfoListItem) {
    if (this.servedBsfInfoList == null) {
      this.servedBsfInfoList = new HashMap<>();
    }
    this.servedBsfInfoList.put(key, servedBsfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedBsfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfBsfInfoobject>> getServedBsfInfoList() {
    return servedBsfInfoList;
  }

  public void setServedBsfInfoList(Map<String, Map<String, AnyOfBsfInfoobject>> servedBsfInfoList) {
    this.servedBsfInfoList = servedBsfInfoList;
  }

  public NrfInfo servedChfInfo(Map<String, AnyOfChfInfoobject> servedChfInfo) {
    this.servedChfInfo = servedChfInfo;
    return this;
  }

  public NrfInfo putServedChfInfoItem(String key, AnyOfChfInfoobject servedChfInfoItem) {
    if (this.servedChfInfo == null) {
      this.servedChfInfo = new HashMap<>();
    }
    this.servedChfInfo.put(key, servedChfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedChfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfChfInfoobject> getServedChfInfo() {
    return servedChfInfo;
  }

  public void setServedChfInfo(Map<String, AnyOfChfInfoobject> servedChfInfo) {
    this.servedChfInfo = servedChfInfo;
  }

  public NrfInfo servedChfInfoList(Map<String, Map<String, AnyOfChfInfoobject>> servedChfInfoList) {
    this.servedChfInfoList = servedChfInfoList;
    return this;
  }

  public NrfInfo putServedChfInfoListItem(String key, Map<String, AnyOfChfInfoobject> servedChfInfoListItem) {
    if (this.servedChfInfoList == null) {
      this.servedChfInfoList = new HashMap<>();
    }
    this.servedChfInfoList.put(key, servedChfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedChfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfChfInfoobject>> getServedChfInfoList() {
    return servedChfInfoList;
  }

  public void setServedChfInfoList(Map<String, Map<String, AnyOfChfInfoobject>> servedChfInfoList) {
    this.servedChfInfoList = servedChfInfoList;
  }

  public NrfInfo servedNefInfo(Map<String, AnyOfNefInfoobject> servedNefInfo) {
    this.servedNefInfo = servedNefInfo;
    return this;
  }

  public NrfInfo putServedNefInfoItem(String key, AnyOfNefInfoobject servedNefInfoItem) {
    if (this.servedNefInfo == null) {
      this.servedNefInfo = new HashMap<>();
    }
    this.servedNefInfo.put(key, servedNefInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedNefInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfNefInfoobject> getServedNefInfo() {
    return servedNefInfo;
  }

  public void setServedNefInfo(Map<String, AnyOfNefInfoobject> servedNefInfo) {
    this.servedNefInfo = servedNefInfo;
  }

  public NrfInfo servedNwdafInfo(Map<String, AnyOfNwdafInfoobject> servedNwdafInfo) {
    this.servedNwdafInfo = servedNwdafInfo;
    return this;
  }

  public NrfInfo putServedNwdafInfoItem(String key, AnyOfNwdafInfoobject servedNwdafInfoItem) {
    if (this.servedNwdafInfo == null) {
      this.servedNwdafInfo = new HashMap<>();
    }
    this.servedNwdafInfo.put(key, servedNwdafInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedNwdafInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfNwdafInfoobject> getServedNwdafInfo() {
    return servedNwdafInfo;
  }

  public void setServedNwdafInfo(Map<String, AnyOfNwdafInfoobject> servedNwdafInfo) {
    this.servedNwdafInfo = servedNwdafInfo;
  }

  public NrfInfo servedNwdafInfoList(Map<String, Map<String, NwdafInfo>> servedNwdafInfoList) {
    this.servedNwdafInfoList = servedNwdafInfoList;
    return this;
  }

  public NrfInfo putServedNwdafInfoListItem(String key, Map<String, NwdafInfo> servedNwdafInfoListItem) {
    if (this.servedNwdafInfoList == null) {
      this.servedNwdafInfoList = new HashMap<>();
    }
    this.servedNwdafInfoList.put(key, servedNwdafInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NF Instance Id serves as key
   * @return servedNwdafInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NF Instance Id serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, NwdafInfo>> getServedNwdafInfoList() {
    return servedNwdafInfoList;
  }

  public void setServedNwdafInfoList(Map<String, Map<String, NwdafInfo>> servedNwdafInfoList) {
    this.servedNwdafInfoList = servedNwdafInfoList;
  }

  public NrfInfo servedPcscfInfoList(Map<String, Map<String, AnyOfPcscfInfoobject>> servedPcscfInfoList) {
    this.servedPcscfInfoList = servedPcscfInfoList;
    return this;
  }

  public NrfInfo putServedPcscfInfoListItem(String key, Map<String, AnyOfPcscfInfoobject> servedPcscfInfoListItem) {
    if (this.servedPcscfInfoList == null) {
      this.servedPcscfInfoList = new HashMap<>();
    }
    this.servedPcscfInfoList.put(key, servedPcscfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedPcscfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfPcscfInfoobject>> getServedPcscfInfoList() {
    return servedPcscfInfoList;
  }

  public void setServedPcscfInfoList(Map<String, Map<String, AnyOfPcscfInfoobject>> servedPcscfInfoList) {
    this.servedPcscfInfoList = servedPcscfInfoList;
  }

  public NrfInfo servedGmlcInfo(Map<String, AnyOfGmlcInfoobject> servedGmlcInfo) {
    this.servedGmlcInfo = servedGmlcInfo;
    return this;
  }

  public NrfInfo putServedGmlcInfoItem(String key, AnyOfGmlcInfoobject servedGmlcInfoItem) {
    if (this.servedGmlcInfo == null) {
      this.servedGmlcInfo = new HashMap<>();
    }
    this.servedGmlcInfo.put(key, servedGmlcInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedGmlcInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfGmlcInfoobject> getServedGmlcInfo() {
    return servedGmlcInfo;
  }

  public void setServedGmlcInfo(Map<String, AnyOfGmlcInfoobject> servedGmlcInfo) {
    this.servedGmlcInfo = servedGmlcInfo;
  }

  public NrfInfo servedLmfInfo(Map<String, AnyOfLmfInfoobject> servedLmfInfo) {
    this.servedLmfInfo = servedLmfInfo;
    return this;
  }

  public NrfInfo putServedLmfInfoItem(String key, AnyOfLmfInfoobject servedLmfInfoItem) {
    if (this.servedLmfInfo == null) {
      this.servedLmfInfo = new HashMap<>();
    }
    this.servedLmfInfo.put(key, servedLmfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedLmfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfLmfInfoobject> getServedLmfInfo() {
    return servedLmfInfo;
  }

  public void setServedLmfInfo(Map<String, AnyOfLmfInfoobject> servedLmfInfo) {
    this.servedLmfInfo = servedLmfInfo;
  }

  public NrfInfo servedNfInfo(Map<String, NfInfo> servedNfInfo) {
    this.servedNfInfo = servedNfInfo;
    return this;
  }

  public NrfInfo putServedNfInfoItem(String key, NfInfo servedNfInfoItem) {
    if (this.servedNfInfo == null) {
      this.servedNfInfo = new HashMap<>();
    }
    this.servedNfInfo.put(key, servedNfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedNfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, NfInfo> getServedNfInfo() {
    return servedNfInfo;
  }

  public void setServedNfInfo(Map<String, NfInfo> servedNfInfo) {
    this.servedNfInfo = servedNfInfo;
  }

  public NrfInfo servedHssInfoList(Map<String, Map<String, AnyOfHssInfoobject>> servedHssInfoList) {
    this.servedHssInfoList = servedHssInfoList;
    return this;
  }

  public NrfInfo putServedHssInfoListItem(String key, Map<String, AnyOfHssInfoobject> servedHssInfoListItem) {
    if (this.servedHssInfoList == null) {
      this.servedHssInfoList = new HashMap<>();
    }
    this.servedHssInfoList.put(key, servedHssInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedHssInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfHssInfoobject>> getServedHssInfoList() {
    return servedHssInfoList;
  }

  public void setServedHssInfoList(Map<String, Map<String, AnyOfHssInfoobject>> servedHssInfoList) {
    this.servedHssInfoList = servedHssInfoList;
  }

  public NrfInfo servedUdsfInfo(Map<String, AnyOfUdsfInfoobject> servedUdsfInfo) {
    this.servedUdsfInfo = servedUdsfInfo;
    return this;
  }

  public NrfInfo putServedUdsfInfoItem(String key, AnyOfUdsfInfoobject servedUdsfInfoItem) {
    if (this.servedUdsfInfo == null) {
      this.servedUdsfInfo = new HashMap<>();
    }
    this.servedUdsfInfo.put(key, servedUdsfInfoItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUdsfInfo
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfUdsfInfoobject> getServedUdsfInfo() {
    return servedUdsfInfo;
  }

  public void setServedUdsfInfo(Map<String, AnyOfUdsfInfoobject> servedUdsfInfo) {
    this.servedUdsfInfo = servedUdsfInfo;
  }

  public NrfInfo servedUdsfInfoList(Map<String, Map<String, AnyOfUdsfInfoobject>> servedUdsfInfoList) {
    this.servedUdsfInfoList = servedUdsfInfoList;
    return this;
  }

  public NrfInfo putServedUdsfInfoListItem(String key, Map<String, AnyOfUdsfInfoobject> servedUdsfInfoListItem) {
    if (this.servedUdsfInfoList == null) {
      this.servedUdsfInfoList = new HashMap<>();
    }
    this.servedUdsfInfoList.put(key, servedUdsfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedUdsfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, Map<String, AnyOfUdsfInfoobject>> getServedUdsfInfoList() {
    return servedUdsfInfoList;
  }

  public void setServedUdsfInfoList(Map<String, Map<String, AnyOfUdsfInfoobject>> servedUdsfInfoList) {
    this.servedUdsfInfoList = servedUdsfInfoList;
  }

  public NrfInfo servedScpInfoList(Map<String, AnyOfScpInfoobject> servedScpInfoList) {
    this.servedScpInfoList = servedScpInfoList;
    return this;
  }

  public NrfInfo putServedScpInfoListItem(String key, AnyOfScpInfoobject servedScpInfoListItem) {
    if (this.servedScpInfoList == null) {
      this.servedScpInfoList = new HashMap<>();
    }
    this.servedScpInfoList.put(key, servedScpInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedScpInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfScpInfoobject> getServedScpInfoList() {
    return servedScpInfoList;
  }

  public void setServedScpInfoList(Map<String, AnyOfScpInfoobject> servedScpInfoList) {
    this.servedScpInfoList = servedScpInfoList;
  }

  public NrfInfo servedSeppInfoList(Map<String, AnyOfSeppInfoobject> servedSeppInfoList) {
    this.servedSeppInfoList = servedSeppInfoList;
    return this;
  }

  public NrfInfo putServedSeppInfoListItem(String key, AnyOfSeppInfoobject servedSeppInfoListItem) {
    if (this.servedSeppInfoList == null) {
      this.servedSeppInfoList = new HashMap<>();
    }
    this.servedSeppInfoList.put(key, servedSeppInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where nfInstanceId serves as key
   * @return servedSeppInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where nfInstanceId serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, AnyOfSeppInfoobject> getServedSeppInfoList() {
    return servedSeppInfoList;
  }

  public void setServedSeppInfoList(Map<String, AnyOfSeppInfoobject> servedSeppInfoList) {
    this.servedSeppInfoList = servedSeppInfoList;
  }

  public NrfInfo servedAanfInfoList(Map<String, Map<String, AnyOfAanfInfoobject>> servedAanfInfoList) {
    this.servedAanfInfoList = servedAanfInfoList;
    return this;
  }

  public NrfInfo putServedAanfInfoListItem(String key, Map<String, AnyOfAanfInfoobject> servedAanfInfoListItem) {
    if (this.servedAanfInfoList == null) {
      this.servedAanfInfoList = new HashMap<>();
    }
    this.servedAanfInfoList.put(key, servedAanfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NF Instance Id serves as key
   * @return servedAanfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NF Instance Id serves as key")

  @Valid

  public Map<String, Map<String, AnyOfAanfInfoobject>> getServedAanfInfoList() {
    return servedAanfInfoList;
  }

  public void setServedAanfInfoList(Map<String, Map<String, AnyOfAanfInfoobject>> servedAanfInfoList) {
    this.servedAanfInfoList = servedAanfInfoList;
  }

  public NrfInfo served5gDdnmfInfo(Map<String, Model5GDdnmfInfo> served5gDdnmfInfo) {
    this.served5gDdnmfInfo = served5gDdnmfInfo;
    return this;
  }

  public NrfInfo putServed5gDdnmfInfoItem(String key, Model5GDdnmfInfo served5gDdnmfInfoItem) {
    if (this.served5gDdnmfInfo == null) {
      this.served5gDdnmfInfo = new HashMap<>();
    }
    this.served5gDdnmfInfo.put(key, served5gDdnmfInfoItem);
    return this;
  }

  /**
   * Get served5gDdnmfInfo
   * @return served5gDdnmfInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public Map<String, Model5GDdnmfInfo> getServed5gDdnmfInfo() {
    return served5gDdnmfInfo;
  }

  public void setServed5gDdnmfInfo(Map<String, Model5GDdnmfInfo> served5gDdnmfInfo) {
    this.served5gDdnmfInfo = served5gDdnmfInfo;
  }

  public NrfInfo servedMfafInfoList(Map<String, MfafInfo> servedMfafInfoList) {
    this.servedMfafInfoList = servedMfafInfoList;
    return this;
  }

  public NrfInfo putServedMfafInfoListItem(String key, MfafInfo servedMfafInfoListItem) {
    if (this.servedMfafInfoList == null) {
      this.servedMfafInfoList = new HashMap<>();
    }
    this.servedMfafInfoList.put(key, servedMfafInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NF Instance Id serves as key
   * @return servedMfafInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NF Instance Id serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, MfafInfo> getServedMfafInfoList() {
    return servedMfafInfoList;
  }

  public void setServedMfafInfoList(Map<String, MfafInfo> servedMfafInfoList) {
    this.servedMfafInfoList = servedMfafInfoList;
  }

  public NrfInfo servedEasdfInfoList(Map<String, Map<String, EasdfInfo>> servedEasdfInfoList) {
    this.servedEasdfInfoList = servedEasdfInfoList;
    return this;
  }

  public NrfInfo putServedEasdfInfoListItem(String key, Map<String, EasdfInfo> servedEasdfInfoListItem) {
    if (this.servedEasdfInfoList == null) {
      this.servedEasdfInfoList = new HashMap<>();
    }
    this.servedEasdfInfoList.put(key, servedEasdfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NF Instance Id serves as key
   * @return servedEasdfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NF Instance Id serves as key")

  @Valid

  public Map<String, Map<String, EasdfInfo>> getServedEasdfInfoList() {
    return servedEasdfInfoList;
  }

  public void setServedEasdfInfoList(Map<String, Map<String, EasdfInfo>> servedEasdfInfoList) {
    this.servedEasdfInfoList = servedEasdfInfoList;
  }

  public NrfInfo servedDccfInfoList(Map<String, DccfInfo> servedDccfInfoList) {
    this.servedDccfInfoList = servedDccfInfoList;
    return this;
  }

  public NrfInfo putServedDccfInfoListItem(String key, DccfInfo servedDccfInfoListItem) {
    if (this.servedDccfInfoList == null) {
      this.servedDccfInfoList = new HashMap<>();
    }
    this.servedDccfInfoList.put(key, servedDccfInfoListItem);
    return this;
  }

  /**
   * A map (list of key-value pairs) where NF Instance Id serves as key
   * @return servedDccfInfoList
  */
  @ApiModelProperty(value = "A map (list of key-value pairs) where NF Instance Id serves as key")

  @Valid
@Size(min = 1) 
  public Map<String, DccfInfo> getServedDccfInfoList() {
    return servedDccfInfoList;
  }

  public void setServedDccfInfoList(Map<String, DccfInfo> servedDccfInfoList) {
    this.servedDccfInfoList = servedDccfInfoList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrfInfo nrfInfo = (NrfInfo) o;
    return Objects.equals(this.servedUdrInfo, nrfInfo.servedUdrInfo) &&
        Objects.equals(this.servedUdrInfoList, nrfInfo.servedUdrInfoList) &&
        Objects.equals(this.servedUdmInfo, nrfInfo.servedUdmInfo) &&
        Objects.equals(this.servedUdmInfoList, nrfInfo.servedUdmInfoList) &&
        Objects.equals(this.servedAusfInfo, nrfInfo.servedAusfInfo) &&
        Objects.equals(this.servedAusfInfoList, nrfInfo.servedAusfInfoList) &&
        Objects.equals(this.servedAmfInfo, nrfInfo.servedAmfInfo) &&
        Objects.equals(this.servedAmfInfoList, nrfInfo.servedAmfInfoList) &&
        Objects.equals(this.servedSmfInfo, nrfInfo.servedSmfInfo) &&
        Objects.equals(this.servedSmfInfoList, nrfInfo.servedSmfInfoList) &&
        Objects.equals(this.servedUpfInfo, nrfInfo.servedUpfInfo) &&
        Objects.equals(this.servedUpfInfoList, nrfInfo.servedUpfInfoList) &&
        Objects.equals(this.servedPcfInfo, nrfInfo.servedPcfInfo) &&
        Objects.equals(this.servedPcfInfoList, nrfInfo.servedPcfInfoList) &&
        Objects.equals(this.servedBsfInfo, nrfInfo.servedBsfInfo) &&
        Objects.equals(this.servedBsfInfoList, nrfInfo.servedBsfInfoList) &&
        Objects.equals(this.servedChfInfo, nrfInfo.servedChfInfo) &&
        Objects.equals(this.servedChfInfoList, nrfInfo.servedChfInfoList) &&
        Objects.equals(this.servedNefInfo, nrfInfo.servedNefInfo) &&
        Objects.equals(this.servedNwdafInfo, nrfInfo.servedNwdafInfo) &&
        Objects.equals(this.servedNwdafInfoList, nrfInfo.servedNwdafInfoList) &&
        Objects.equals(this.servedPcscfInfoList, nrfInfo.servedPcscfInfoList) &&
        Objects.equals(this.servedGmlcInfo, nrfInfo.servedGmlcInfo) &&
        Objects.equals(this.servedLmfInfo, nrfInfo.servedLmfInfo) &&
        Objects.equals(this.servedNfInfo, nrfInfo.servedNfInfo) &&
        Objects.equals(this.servedHssInfoList, nrfInfo.servedHssInfoList) &&
        Objects.equals(this.servedUdsfInfo, nrfInfo.servedUdsfInfo) &&
        Objects.equals(this.servedUdsfInfoList, nrfInfo.servedUdsfInfoList) &&
        Objects.equals(this.servedScpInfoList, nrfInfo.servedScpInfoList) &&
        Objects.equals(this.servedSeppInfoList, nrfInfo.servedSeppInfoList) &&
        Objects.equals(this.servedAanfInfoList, nrfInfo.servedAanfInfoList) &&
        Objects.equals(this.served5gDdnmfInfo, nrfInfo.served5gDdnmfInfo) &&
        Objects.equals(this.servedMfafInfoList, nrfInfo.servedMfafInfoList) &&
        Objects.equals(this.servedEasdfInfoList, nrfInfo.servedEasdfInfoList) &&
        Objects.equals(this.servedDccfInfoList, nrfInfo.servedDccfInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servedUdrInfo, servedUdrInfoList, servedUdmInfo, servedUdmInfoList, servedAusfInfo, servedAusfInfoList, servedAmfInfo, servedAmfInfoList, servedSmfInfo, servedSmfInfoList, servedUpfInfo, servedUpfInfoList, servedPcfInfo, servedPcfInfoList, servedBsfInfo, servedBsfInfoList, servedChfInfo, servedChfInfoList, servedNefInfo, servedNwdafInfo, servedNwdafInfoList, servedPcscfInfoList, servedGmlcInfo, servedLmfInfo, servedNfInfo, servedHssInfoList, servedUdsfInfo, servedUdsfInfoList, servedScpInfoList, servedSeppInfoList, servedAanfInfoList, served5gDdnmfInfo, servedMfafInfoList, servedEasdfInfoList, servedDccfInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrfInfo {\n");
    
    sb.append("    servedUdrInfo: ").append(toIndentedString(servedUdrInfo)).append("\n");
    sb.append("    servedUdrInfoList: ").append(toIndentedString(servedUdrInfoList)).append("\n");
    sb.append("    servedUdmInfo: ").append(toIndentedString(servedUdmInfo)).append("\n");
    sb.append("    servedUdmInfoList: ").append(toIndentedString(servedUdmInfoList)).append("\n");
    sb.append("    servedAusfInfo: ").append(toIndentedString(servedAusfInfo)).append("\n");
    sb.append("    servedAusfInfoList: ").append(toIndentedString(servedAusfInfoList)).append("\n");
    sb.append("    servedAmfInfo: ").append(toIndentedString(servedAmfInfo)).append("\n");
    sb.append("    servedAmfInfoList: ").append(toIndentedString(servedAmfInfoList)).append("\n");
    sb.append("    servedSmfInfo: ").append(toIndentedString(servedSmfInfo)).append("\n");
    sb.append("    servedSmfInfoList: ").append(toIndentedString(servedSmfInfoList)).append("\n");
    sb.append("    servedUpfInfo: ").append(toIndentedString(servedUpfInfo)).append("\n");
    sb.append("    servedUpfInfoList: ").append(toIndentedString(servedUpfInfoList)).append("\n");
    sb.append("    servedPcfInfo: ").append(toIndentedString(servedPcfInfo)).append("\n");
    sb.append("    servedPcfInfoList: ").append(toIndentedString(servedPcfInfoList)).append("\n");
    sb.append("    servedBsfInfo: ").append(toIndentedString(servedBsfInfo)).append("\n");
    sb.append("    servedBsfInfoList: ").append(toIndentedString(servedBsfInfoList)).append("\n");
    sb.append("    servedChfInfo: ").append(toIndentedString(servedChfInfo)).append("\n");
    sb.append("    servedChfInfoList: ").append(toIndentedString(servedChfInfoList)).append("\n");
    sb.append("    servedNefInfo: ").append(toIndentedString(servedNefInfo)).append("\n");
    sb.append("    servedNwdafInfo: ").append(toIndentedString(servedNwdafInfo)).append("\n");
    sb.append("    servedNwdafInfoList: ").append(toIndentedString(servedNwdafInfoList)).append("\n");
    sb.append("    servedPcscfInfoList: ").append(toIndentedString(servedPcscfInfoList)).append("\n");
    sb.append("    servedGmlcInfo: ").append(toIndentedString(servedGmlcInfo)).append("\n");
    sb.append("    servedLmfInfo: ").append(toIndentedString(servedLmfInfo)).append("\n");
    sb.append("    servedNfInfo: ").append(toIndentedString(servedNfInfo)).append("\n");
    sb.append("    servedHssInfoList: ").append(toIndentedString(servedHssInfoList)).append("\n");
    sb.append("    servedUdsfInfo: ").append(toIndentedString(servedUdsfInfo)).append("\n");
    sb.append("    servedUdsfInfoList: ").append(toIndentedString(servedUdsfInfoList)).append("\n");
    sb.append("    servedScpInfoList: ").append(toIndentedString(servedScpInfoList)).append("\n");
    sb.append("    servedSeppInfoList: ").append(toIndentedString(servedSeppInfoList)).append("\n");
    sb.append("    servedAanfInfoList: ").append(toIndentedString(servedAanfInfoList)).append("\n");
    sb.append("    served5gDdnmfInfo: ").append(toIndentedString(served5gDdnmfInfo)).append("\n");
    sb.append("    servedMfafInfoList: ").append(toIndentedString(servedMfafInfoList)).append("\n");
    sb.append("    servedEasdfInfoList: ").append(toIndentedString(servedEasdfInfoList)).append("\n");
    sb.append("    servedDccfInfoList: ").append(toIndentedString(servedDccfInfoList)).append("\n");
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

