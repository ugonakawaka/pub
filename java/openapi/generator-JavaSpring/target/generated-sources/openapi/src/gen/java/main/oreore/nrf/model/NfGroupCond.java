package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Subscription to a set of NFs based on their Group Id
 */
@ApiModel(description = "Subscription to a set of NFs based on their Group Id")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NfGroupCond  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets nfType
   */
  public enum NfTypeEnum {
    UDM("UDM"),
    
    AUSF("AUSF"),
    
    UDR("UDR"),
    
    PCF("PCF"),
    
    CHF("CHF");

    private String value;

    NfTypeEnum(String value) {
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
    public static NfTypeEnum fromValue(String value) {
      for (NfTypeEnum b : NfTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("nfType")
  private NfTypeEnum nfType;

  @JsonProperty("nfGroupId")
  private String nfGroupId;

  public NfGroupCond nfType(NfTypeEnum nfType) {
    this.nfType = nfType;
    return this;
  }

  /**
   * Get nfType
   * @return nfType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public NfTypeEnum getNfType() {
    return nfType;
  }

  public void setNfType(NfTypeEnum nfType) {
    this.nfType = nfType;
  }

  public NfGroupCond nfGroupId(String nfGroupId) {
    this.nfGroupId = nfGroupId;
    return this;
  }

  /**
   * Identifier of a group of NFs.
   * @return nfGroupId
  */
  @ApiModelProperty(required = true, value = "Identifier of a group of NFs.")
  @NotNull


  public String getNfGroupId() {
    return nfGroupId;
  }

  public void setNfGroupId(String nfGroupId) {
    this.nfGroupId = nfGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfGroupCond nfGroupCond = (NfGroupCond) o;
    return Objects.equals(this.nfType, nfGroupCond.nfType) &&
        Objects.equals(this.nfGroupId, nfGroupCond.nfGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfType, nfGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfGroupCond {\n");
    
    sb.append("    nfType: ").append(toIndentedString(nfType)).append("\n");
    sb.append("    nfGroupId: ").append(toIndentedString(nfGroupId)).append("\n");
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

