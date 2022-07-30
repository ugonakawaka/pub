package aaaa;

import java.util.Objects;
import aaaa.Arp;
import aaaa.EbiArpMapping;
import aaaa.N4Information;
import aaaa.QosFlowItem;
import aaaa.RefToBinaryData;
import aaaa.SecondaryRatUsageInfo;
import aaaa.SecondaryRatUsageReport;
import aaaa.UserLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data within Update Response from V-SMF, or from I-SMF to SMF
 */
@ApiModel(description = "Data within Update Response from V-SMF, or from I-SMF to SMF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class VsmfUpdatedData   {
  @JsonProperty("qosFlowsAddModList")
  @Valid
  private List<QosFlowItem> qosFlowsAddModList = null;

  @JsonProperty("qosFlowsRelList")
  @Valid
  private List<QosFlowItem> qosFlowsRelList = null;

  @JsonProperty("qosFlowsFailedtoAddModList")
  @Valid
  private List<QosFlowItem> qosFlowsFailedtoAddModList = null;

  @JsonProperty("qosFlowsFailedtoRelList")
  @Valid
  private List<QosFlowItem> qosFlowsFailedtoRelList = null;

  @JsonProperty("n1SmInfoFromUe")
  private RefToBinaryData n1SmInfoFromUe;

  @JsonProperty("unknownN1SmInfo")
  private RefToBinaryData unknownN1SmInfo;

  @JsonProperty("ueLocation")
  private UserLocation ueLocation;

  @JsonProperty("ueTimeZone")
  private String ueTimeZone;

  @JsonProperty("addUeLocation")
  private UserLocation addUeLocation;

  @JsonProperty("assignedEbiList")
  @Valid
  private List<EbiArpMapping> assignedEbiList = null;

  @JsonProperty("failedToAssignEbiList")
  @Valid
  private List<Arp> failedToAssignEbiList = null;

  @JsonProperty("releasedEbiList")
  @Valid
  private List<Integer> releasedEbiList = null;

  @JsonProperty("secondaryRatUsageReport")
  @Valid
  private List<SecondaryRatUsageReport> secondaryRatUsageReport = null;

  @JsonProperty("secondaryRatUsageInfo")
  @Valid
  private List<SecondaryRatUsageInfo> secondaryRatUsageInfo = null;

  @JsonProperty("n4Info")
  private N4Information n4Info;

  @JsonProperty("n4InfoExt1")
  private N4Information n4InfoExt1;

  @JsonProperty("n4InfoExt2")
  private N4Information n4InfoExt2;

  @JsonProperty("n4InfoExt3")
  private N4Information n4InfoExt3;

  public VsmfUpdatedData qosFlowsAddModList(List<QosFlowItem> qosFlowsAddModList) {
    this.qosFlowsAddModList = qosFlowsAddModList;
    return this;
  }

  public VsmfUpdatedData addQosFlowsAddModListItem(QosFlowItem qosFlowsAddModListItem) {
    if (this.qosFlowsAddModList == null) {
      this.qosFlowsAddModList = new ArrayList<>();
    }
    this.qosFlowsAddModList.add(qosFlowsAddModListItem);
    return this;
  }

  /**
   * Get qosFlowsAddModList
   * @return qosFlowsAddModList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowItem> getQosFlowsAddModList() {
    return qosFlowsAddModList;
  }

  public void setQosFlowsAddModList(List<QosFlowItem> qosFlowsAddModList) {
    this.qosFlowsAddModList = qosFlowsAddModList;
  }

  public VsmfUpdatedData qosFlowsRelList(List<QosFlowItem> qosFlowsRelList) {
    this.qosFlowsRelList = qosFlowsRelList;
    return this;
  }

  public VsmfUpdatedData addQosFlowsRelListItem(QosFlowItem qosFlowsRelListItem) {
    if (this.qosFlowsRelList == null) {
      this.qosFlowsRelList = new ArrayList<>();
    }
    this.qosFlowsRelList.add(qosFlowsRelListItem);
    return this;
  }

  /**
   * Get qosFlowsRelList
   * @return qosFlowsRelList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowItem> getQosFlowsRelList() {
    return qosFlowsRelList;
  }

  public void setQosFlowsRelList(List<QosFlowItem> qosFlowsRelList) {
    this.qosFlowsRelList = qosFlowsRelList;
  }

  public VsmfUpdatedData qosFlowsFailedtoAddModList(List<QosFlowItem> qosFlowsFailedtoAddModList) {
    this.qosFlowsFailedtoAddModList = qosFlowsFailedtoAddModList;
    return this;
  }

  public VsmfUpdatedData addQosFlowsFailedtoAddModListItem(QosFlowItem qosFlowsFailedtoAddModListItem) {
    if (this.qosFlowsFailedtoAddModList == null) {
      this.qosFlowsFailedtoAddModList = new ArrayList<>();
    }
    this.qosFlowsFailedtoAddModList.add(qosFlowsFailedtoAddModListItem);
    return this;
  }

  /**
   * Get qosFlowsFailedtoAddModList
   * @return qosFlowsFailedtoAddModList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowItem> getQosFlowsFailedtoAddModList() {
    return qosFlowsFailedtoAddModList;
  }

  public void setQosFlowsFailedtoAddModList(List<QosFlowItem> qosFlowsFailedtoAddModList) {
    this.qosFlowsFailedtoAddModList = qosFlowsFailedtoAddModList;
  }

  public VsmfUpdatedData qosFlowsFailedtoRelList(List<QosFlowItem> qosFlowsFailedtoRelList) {
    this.qosFlowsFailedtoRelList = qosFlowsFailedtoRelList;
    return this;
  }

  public VsmfUpdatedData addQosFlowsFailedtoRelListItem(QosFlowItem qosFlowsFailedtoRelListItem) {
    if (this.qosFlowsFailedtoRelList == null) {
      this.qosFlowsFailedtoRelList = new ArrayList<>();
    }
    this.qosFlowsFailedtoRelList.add(qosFlowsFailedtoRelListItem);
    return this;
  }

  /**
   * Get qosFlowsFailedtoRelList
   * @return qosFlowsFailedtoRelList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<QosFlowItem> getQosFlowsFailedtoRelList() {
    return qosFlowsFailedtoRelList;
  }

  public void setQosFlowsFailedtoRelList(List<QosFlowItem> qosFlowsFailedtoRelList) {
    this.qosFlowsFailedtoRelList = qosFlowsFailedtoRelList;
  }

  public VsmfUpdatedData n1SmInfoFromUe(RefToBinaryData n1SmInfoFromUe) {
    this.n1SmInfoFromUe = n1SmInfoFromUe;
    return this;
  }

  /**
   * Get n1SmInfoFromUe
   * @return n1SmInfoFromUe
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getN1SmInfoFromUe() {
    return n1SmInfoFromUe;
  }

  public void setN1SmInfoFromUe(RefToBinaryData n1SmInfoFromUe) {
    this.n1SmInfoFromUe = n1SmInfoFromUe;
  }

  public VsmfUpdatedData unknownN1SmInfo(RefToBinaryData unknownN1SmInfo) {
    this.unknownN1SmInfo = unknownN1SmInfo;
    return this;
  }

  /**
   * Get unknownN1SmInfo
   * @return unknownN1SmInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RefToBinaryData getUnknownN1SmInfo() {
    return unknownN1SmInfo;
  }

  public void setUnknownN1SmInfo(RefToBinaryData unknownN1SmInfo) {
    this.unknownN1SmInfo = unknownN1SmInfo;
  }

  public VsmfUpdatedData ueLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
    return this;
  }

  /**
   * Get ueLocation
   * @return ueLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserLocation getUeLocation() {
    return ueLocation;
  }

  public void setUeLocation(UserLocation ueLocation) {
    this.ueLocation = ueLocation;
  }

  public VsmfUpdatedData ueTimeZone(String ueTimeZone) {
    this.ueTimeZone = ueTimeZone;
    return this;
  }

  /**
   * String with format \"<time-numoffset>\" optionally appended by \"<daylightSavingTime>\", where -  <time-numoffset> shall represent the time zone adjusted for daylight saving time and be encoded as time-numoffset as defined in clause 5.6 of IETF RFC 3339; - <daylightSavingTime> shall represent the adjustment that has been made and shall be encoded as \"+1\" or \"+2\" for a +1 or +2 hours adjustment. The example is for 8 hours behind UTC, +1 hour adjustment for Daylight Saving Time.
   * @return ueTimeZone
  */
  @ApiModelProperty(example = "-08:00+1", value = "String with format \"<time-numoffset>\" optionally appended by \"<daylightSavingTime>\", where -  <time-numoffset> shall represent the time zone adjusted for daylight saving time and be encoded as time-numoffset as defined in clause 5.6 of IETF RFC 3339; - <daylightSavingTime> shall represent the adjustment that has been made and shall be encoded as \"+1\" or \"+2\" for a +1 or +2 hours adjustment. The example is for 8 hours behind UTC, +1 hour adjustment for Daylight Saving Time.")


  public String getUeTimeZone() {
    return ueTimeZone;
  }

  public void setUeTimeZone(String ueTimeZone) {
    this.ueTimeZone = ueTimeZone;
  }

  public VsmfUpdatedData addUeLocation(UserLocation addUeLocation) {
    this.addUeLocation = addUeLocation;
    return this;
  }

  /**
   * Get addUeLocation
   * @return addUeLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserLocation getAddUeLocation() {
    return addUeLocation;
  }

  public void setAddUeLocation(UserLocation addUeLocation) {
    this.addUeLocation = addUeLocation;
  }

  public VsmfUpdatedData assignedEbiList(List<EbiArpMapping> assignedEbiList) {
    this.assignedEbiList = assignedEbiList;
    return this;
  }

  public VsmfUpdatedData addAssignedEbiListItem(EbiArpMapping assignedEbiListItem) {
    if (this.assignedEbiList == null) {
      this.assignedEbiList = new ArrayList<>();
    }
    this.assignedEbiList.add(assignedEbiListItem);
    return this;
  }

  /**
   * Get assignedEbiList
   * @return assignedEbiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<EbiArpMapping> getAssignedEbiList() {
    return assignedEbiList;
  }

  public void setAssignedEbiList(List<EbiArpMapping> assignedEbiList) {
    this.assignedEbiList = assignedEbiList;
  }

  public VsmfUpdatedData failedToAssignEbiList(List<Arp> failedToAssignEbiList) {
    this.failedToAssignEbiList = failedToAssignEbiList;
    return this;
  }

  public VsmfUpdatedData addFailedToAssignEbiListItem(Arp failedToAssignEbiListItem) {
    if (this.failedToAssignEbiList == null) {
      this.failedToAssignEbiList = new ArrayList<>();
    }
    this.failedToAssignEbiList.add(failedToAssignEbiListItem);
    return this;
  }

  /**
   * Get failedToAssignEbiList
   * @return failedToAssignEbiList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<Arp> getFailedToAssignEbiList() {
    return failedToAssignEbiList;
  }

  public void setFailedToAssignEbiList(List<Arp> failedToAssignEbiList) {
    this.failedToAssignEbiList = failedToAssignEbiList;
  }

  public VsmfUpdatedData releasedEbiList(List<Integer> releasedEbiList) {
    this.releasedEbiList = releasedEbiList;
    return this;
  }

  public VsmfUpdatedData addReleasedEbiListItem(Integer releasedEbiListItem) {
    if (this.releasedEbiList == null) {
      this.releasedEbiList = new ArrayList<>();
    }
    this.releasedEbiList.add(releasedEbiListItem);
    return this;
  }

  /**
   * Get releasedEbiList
   * @return releasedEbiList
  */
  @ApiModelProperty(value = "")

@Size(min=1) 
  public List<Integer> getReleasedEbiList() {
    return releasedEbiList;
  }

  public void setReleasedEbiList(List<Integer> releasedEbiList) {
    this.releasedEbiList = releasedEbiList;
  }

  public VsmfUpdatedData secondaryRatUsageReport(List<SecondaryRatUsageReport> secondaryRatUsageReport) {
    this.secondaryRatUsageReport = secondaryRatUsageReport;
    return this;
  }

  public VsmfUpdatedData addSecondaryRatUsageReportItem(SecondaryRatUsageReport secondaryRatUsageReportItem) {
    if (this.secondaryRatUsageReport == null) {
      this.secondaryRatUsageReport = new ArrayList<>();
    }
    this.secondaryRatUsageReport.add(secondaryRatUsageReportItem);
    return this;
  }

  /**
   * Get secondaryRatUsageReport
   * @return secondaryRatUsageReport
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<SecondaryRatUsageReport> getSecondaryRatUsageReport() {
    return secondaryRatUsageReport;
  }

  public void setSecondaryRatUsageReport(List<SecondaryRatUsageReport> secondaryRatUsageReport) {
    this.secondaryRatUsageReport = secondaryRatUsageReport;
  }

  public VsmfUpdatedData secondaryRatUsageInfo(List<SecondaryRatUsageInfo> secondaryRatUsageInfo) {
    this.secondaryRatUsageInfo = secondaryRatUsageInfo;
    return this;
  }

  public VsmfUpdatedData addSecondaryRatUsageInfoItem(SecondaryRatUsageInfo secondaryRatUsageInfoItem) {
    if (this.secondaryRatUsageInfo == null) {
      this.secondaryRatUsageInfo = new ArrayList<>();
    }
    this.secondaryRatUsageInfo.add(secondaryRatUsageInfoItem);
    return this;
  }

  /**
   * Get secondaryRatUsageInfo
   * @return secondaryRatUsageInfo
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min=1) 
  public List<SecondaryRatUsageInfo> getSecondaryRatUsageInfo() {
    return secondaryRatUsageInfo;
  }

  public void setSecondaryRatUsageInfo(List<SecondaryRatUsageInfo> secondaryRatUsageInfo) {
    this.secondaryRatUsageInfo = secondaryRatUsageInfo;
  }

  public VsmfUpdatedData n4Info(N4Information n4Info) {
    this.n4Info = n4Info;
    return this;
  }

  /**
   * Get n4Info
   * @return n4Info
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4Info() {
    return n4Info;
  }

  public void setN4Info(N4Information n4Info) {
    this.n4Info = n4Info;
  }

  public VsmfUpdatedData n4InfoExt1(N4Information n4InfoExt1) {
    this.n4InfoExt1 = n4InfoExt1;
    return this;
  }

  /**
   * Get n4InfoExt1
   * @return n4InfoExt1
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt1() {
    return n4InfoExt1;
  }

  public void setN4InfoExt1(N4Information n4InfoExt1) {
    this.n4InfoExt1 = n4InfoExt1;
  }

  public VsmfUpdatedData n4InfoExt2(N4Information n4InfoExt2) {
    this.n4InfoExt2 = n4InfoExt2;
    return this;
  }

  /**
   * Get n4InfoExt2
   * @return n4InfoExt2
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt2() {
    return n4InfoExt2;
  }

  public void setN4InfoExt2(N4Information n4InfoExt2) {
    this.n4InfoExt2 = n4InfoExt2;
  }

  public VsmfUpdatedData n4InfoExt3(N4Information n4InfoExt3) {
    this.n4InfoExt3 = n4InfoExt3;
    return this;
  }

  /**
   * Get n4InfoExt3
   * @return n4InfoExt3
  */
  @ApiModelProperty(value = "")

  @Valid

  public N4Information getN4InfoExt3() {
    return n4InfoExt3;
  }

  public void setN4InfoExt3(N4Information n4InfoExt3) {
    this.n4InfoExt3 = n4InfoExt3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsmfUpdatedData vsmfUpdatedData = (VsmfUpdatedData) o;
    return Objects.equals(this.qosFlowsAddModList, vsmfUpdatedData.qosFlowsAddModList) &&
        Objects.equals(this.qosFlowsRelList, vsmfUpdatedData.qosFlowsRelList) &&
        Objects.equals(this.qosFlowsFailedtoAddModList, vsmfUpdatedData.qosFlowsFailedtoAddModList) &&
        Objects.equals(this.qosFlowsFailedtoRelList, vsmfUpdatedData.qosFlowsFailedtoRelList) &&
        Objects.equals(this.n1SmInfoFromUe, vsmfUpdatedData.n1SmInfoFromUe) &&
        Objects.equals(this.unknownN1SmInfo, vsmfUpdatedData.unknownN1SmInfo) &&
        Objects.equals(this.ueLocation, vsmfUpdatedData.ueLocation) &&
        Objects.equals(this.ueTimeZone, vsmfUpdatedData.ueTimeZone) &&
        Objects.equals(this.addUeLocation, vsmfUpdatedData.addUeLocation) &&
        Objects.equals(this.assignedEbiList, vsmfUpdatedData.assignedEbiList) &&
        Objects.equals(this.failedToAssignEbiList, vsmfUpdatedData.failedToAssignEbiList) &&
        Objects.equals(this.releasedEbiList, vsmfUpdatedData.releasedEbiList) &&
        Objects.equals(this.secondaryRatUsageReport, vsmfUpdatedData.secondaryRatUsageReport) &&
        Objects.equals(this.secondaryRatUsageInfo, vsmfUpdatedData.secondaryRatUsageInfo) &&
        Objects.equals(this.n4Info, vsmfUpdatedData.n4Info) &&
        Objects.equals(this.n4InfoExt1, vsmfUpdatedData.n4InfoExt1) &&
        Objects.equals(this.n4InfoExt2, vsmfUpdatedData.n4InfoExt2) &&
        Objects.equals(this.n4InfoExt3, vsmfUpdatedData.n4InfoExt3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qosFlowsAddModList, qosFlowsRelList, qosFlowsFailedtoAddModList, qosFlowsFailedtoRelList, n1SmInfoFromUe, unknownN1SmInfo, ueLocation, ueTimeZone, addUeLocation, assignedEbiList, failedToAssignEbiList, releasedEbiList, secondaryRatUsageReport, secondaryRatUsageInfo, n4Info, n4InfoExt1, n4InfoExt2, n4InfoExt3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsmfUpdatedData {\n");
    
    sb.append("    qosFlowsAddModList: ").append(toIndentedString(qosFlowsAddModList)).append("\n");
    sb.append("    qosFlowsRelList: ").append(toIndentedString(qosFlowsRelList)).append("\n");
    sb.append("    qosFlowsFailedtoAddModList: ").append(toIndentedString(qosFlowsFailedtoAddModList)).append("\n");
    sb.append("    qosFlowsFailedtoRelList: ").append(toIndentedString(qosFlowsFailedtoRelList)).append("\n");
    sb.append("    n1SmInfoFromUe: ").append(toIndentedString(n1SmInfoFromUe)).append("\n");
    sb.append("    unknownN1SmInfo: ").append(toIndentedString(unknownN1SmInfo)).append("\n");
    sb.append("    ueLocation: ").append(toIndentedString(ueLocation)).append("\n");
    sb.append("    ueTimeZone: ").append(toIndentedString(ueTimeZone)).append("\n");
    sb.append("    addUeLocation: ").append(toIndentedString(addUeLocation)).append("\n");
    sb.append("    assignedEbiList: ").append(toIndentedString(assignedEbiList)).append("\n");
    sb.append("    failedToAssignEbiList: ").append(toIndentedString(failedToAssignEbiList)).append("\n");
    sb.append("    releasedEbiList: ").append(toIndentedString(releasedEbiList)).append("\n");
    sb.append("    secondaryRatUsageReport: ").append(toIndentedString(secondaryRatUsageReport)).append("\n");
    sb.append("    secondaryRatUsageInfo: ").append(toIndentedString(secondaryRatUsageInfo)).append("\n");
    sb.append("    n4Info: ").append(toIndentedString(n4Info)).append("\n");
    sb.append("    n4InfoExt1: ").append(toIndentedString(n4InfoExt1)).append("\n");
    sb.append("    n4InfoExt2: ").append(toIndentedString(n4InfoExt2)).append("\n");
    sb.append("    n4InfoExt3: ").append(toIndentedString(n4InfoExt3)).append("\n");
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

