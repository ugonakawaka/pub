package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contain the TNAP Identifier see clause5.6.2 of 3GPP TS 23.501.
 */
@ApiModel(description = "Contain the TNAP Identifier see clause5.6.2 of 3GPP TS 23.501.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class TnapId   {
  @JsonProperty("ssId")
  private String ssId;

  @JsonProperty("bssId")
  private String bssId;

  @JsonProperty("civicAddress")
  private byte[] civicAddress;

  public TnapId ssId(String ssId) {
    this.ssId = ssId;
    return this;
  }

  /**
   * This IE shall be present if the UE is accessing the 5GC via a trusted WLAN access network.When present, it shall contain the SSID of the access point to which the UE is attached, that is received over NGAP, see IEEE Std 802.11-2012.
   * @return ssId
  */
  @ApiModelProperty(value = "This IE shall be present if the UE is accessing the 5GC via a trusted WLAN access network.When present, it shall contain the SSID of the access point to which the UE is attached, that is received over NGAP, see IEEE Std 802.11-2012.")


  public String getSsId() {
    return ssId;
  }

  public void setSsId(String ssId) {
    this.ssId = ssId;
  }

  public TnapId bssId(String bssId) {
    this.bssId = bssId;
    return this;
  }

  /**
   * When present, it shall contain the BSSID of the access point to which the UE is attached, that is received over NGAP, see IEEE Std 802.11-2012.
   * @return bssId
  */
  @ApiModelProperty(value = "When present, it shall contain the BSSID of the access point to which the UE is attached, that is received over NGAP, see IEEE Std 802.11-2012.")


  public String getBssId() {
    return bssId;
  }

  public void setBssId(String bssId) {
    this.bssId = bssId;
  }

  public TnapId civicAddress(byte[] civicAddress) {
    this.civicAddress = civicAddress;
    return this;
  }

  /**
   * string with format \"bytes\" as defined in OpenAPI
   * @return civicAddress
  */
  @ApiModelProperty(value = "string with format \"bytes\" as defined in OpenAPI")


  public byte[] getCivicAddress() {
    return civicAddress;
  }

  public void setCivicAddress(byte[] civicAddress) {
    this.civicAddress = civicAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TnapId tnapId = (TnapId) o;
    return Objects.equals(this.ssId, tnapId.ssId) &&
        Objects.equals(this.bssId, tnapId.bssId) &&
        Arrays.equals(this.civicAddress, tnapId.civicAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssId, bssId, Arrays.hashCode(civicAddress));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TnapId {\n");
    
    sb.append("    ssId: ").append(toIndentedString(ssId)).append("\n");
    sb.append("    bssId: ").append(toIndentedString(bssId)).append("\n");
    sb.append("    civicAddress: ").append(toIndentedString(civicAddress)).append("\n");
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

