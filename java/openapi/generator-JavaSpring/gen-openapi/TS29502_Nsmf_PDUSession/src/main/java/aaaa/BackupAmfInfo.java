package aaaa;

import java.util.Objects;
import aaaa.Guami;
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
 * Provides details of the Backup AMF.
 */
@ApiModel(description = "Provides details of the Backup AMF.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-03T14:43:48.072613+09:00[Asia/Tokyo]")
public class BackupAmfInfo   {
  @JsonProperty("backupAmf")
  private String backupAmf;

  @JsonProperty("guamiList")
  @Valid
  private List<Guami> guamiList = null;

  public BackupAmfInfo backupAmf(String backupAmf) {
    this.backupAmf = backupAmf;
    return this;
  }

  /**
   * FQDN (Fully Qualified Domain Name) of the AMF as defined in clause 28.3.2.5 of 3GPP TS 23.003
   * @return backupAmf
  */
  @ApiModelProperty(required = true, value = "FQDN (Fully Qualified Domain Name) of the AMF as defined in clause 28.3.2.5 of 3GPP TS 23.003")
  @NotNull


  public String getBackupAmf() {
    return backupAmf;
  }

  public void setBackupAmf(String backupAmf) {
    this.backupAmf = backupAmf;
  }

  public BackupAmfInfo guamiList(List<Guami> guamiList) {
    this.guamiList = guamiList;
    return this;
  }

  public BackupAmfInfo addGuamiListItem(Guami guamiListItem) {
    if (this.guamiList == null) {
      this.guamiList = new ArrayList<>();
    }
    this.guamiList.add(guamiListItem);
    return this;
  }

  /**
   * If present, this IE shall contain the list of GUAMI(s) (supported by the AMF) for which the backupAmf IE applies.
   * @return guamiList
  */
  @ApiModelProperty(value = "If present, this IE shall contain the list of GUAMI(s) (supported by the AMF) for which the backupAmf IE applies.")

  @Valid
@Size(min=1) 
  public List<Guami> getGuamiList() {
    return guamiList;
  }

  public void setGuamiList(List<Guami> guamiList) {
    this.guamiList = guamiList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupAmfInfo backupAmfInfo = (BackupAmfInfo) o;
    return Objects.equals(this.backupAmf, backupAmfInfo.backupAmf) &&
        Objects.equals(this.guamiList, backupAmfInfo.guamiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupAmf, guamiList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupAmfInfo {\n");
    
    sb.append("    backupAmf: ").append(toIndentedString(backupAmf)).append("\n");
    sb.append("    guamiList: ").append(toIndentedString(guamiList)).append("\n");
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

