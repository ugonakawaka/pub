package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.N1MessageClass;
import oreore.nrf.model.N2InformationClass;
import oreore.nrf.model.NotificationType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Data structure for specifying the notifications the NF service subscribes by default along with callback URI
 */
@ApiModel(description = "Data structure for specifying the notifications the NF service subscribes by default along with callback URI")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class DefaultNotificationSubscription  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("notificationType")
  private NotificationType notificationType;

  @JsonProperty("callbackUri")
  private String callbackUri;

  @JsonProperty("n1MessageClass")
  private N1MessageClass n1MessageClass;

  @JsonProperty("n2InformationClass")
  private N2InformationClass n2InformationClass;

  @JsonProperty("versions")
  @Valid
  private List<String> versions = null;

  @JsonProperty("binding")
  private String binding;

  @JsonProperty("acceptedEncoding")
  private String acceptedEncoding;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures;

  public DefaultNotificationSubscription notificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   * @return notificationType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NotificationType getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }

  public DefaultNotificationSubscription callbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
    return this;
  }

  /**
   * String providing an URI formatted according to RFC 3986
   * @return callbackUri
  */
  @ApiModelProperty(required = true, value = "String providing an URI formatted according to RFC 3986")
  @NotNull


  public String getCallbackUri() {
    return callbackUri;
  }

  public void setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
  }

  public DefaultNotificationSubscription n1MessageClass(N1MessageClass n1MessageClass) {
    this.n1MessageClass = n1MessageClass;
    return this;
  }

  /**
   * Get n1MessageClass
   * @return n1MessageClass
  */
  @ApiModelProperty(value = "")

  @Valid

  public N1MessageClass getN1MessageClass() {
    return n1MessageClass;
  }

  public void setN1MessageClass(N1MessageClass n1MessageClass) {
    this.n1MessageClass = n1MessageClass;
  }

  public DefaultNotificationSubscription n2InformationClass(N2InformationClass n2InformationClass) {
    this.n2InformationClass = n2InformationClass;
    return this;
  }

  /**
   * Get n2InformationClass
   * @return n2InformationClass
  */
  @ApiModelProperty(value = "")

  @Valid

  public N2InformationClass getN2InformationClass() {
    return n2InformationClass;
  }

  public void setN2InformationClass(N2InformationClass n2InformationClass) {
    this.n2InformationClass = n2InformationClass;
  }

  public DefaultNotificationSubscription versions(List<String> versions) {
    this.versions = versions;
    return this;
  }

  public DefaultNotificationSubscription addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * Get versions
   * @return versions
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getVersions() {
    return versions;
  }

  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  public DefaultNotificationSubscription binding(String binding) {
    this.binding = binding;
    return this;
  }

  /**
   * Get binding
   * @return binding
  */
  @ApiModelProperty(value = "")


  public String getBinding() {
    return binding;
  }

  public void setBinding(String binding) {
    this.binding = binding;
  }

  public DefaultNotificationSubscription acceptedEncoding(String acceptedEncoding) {
    this.acceptedEncoding = acceptedEncoding;
    return this;
  }

  /**
   * Get acceptedEncoding
   * @return acceptedEncoding
  */
  @ApiModelProperty(value = "")


  public String getAcceptedEncoding() {
    return acceptedEncoding;
  }

  public void setAcceptedEncoding(String acceptedEncoding) {
    this.acceptedEncoding = acceptedEncoding;
  }

  public DefaultNotificationSubscription supportedFeatures(String supportedFeatures) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultNotificationSubscription defaultNotificationSubscription = (DefaultNotificationSubscription) o;
    return Objects.equals(this.notificationType, defaultNotificationSubscription.notificationType) &&
        Objects.equals(this.callbackUri, defaultNotificationSubscription.callbackUri) &&
        Objects.equals(this.n1MessageClass, defaultNotificationSubscription.n1MessageClass) &&
        Objects.equals(this.n2InformationClass, defaultNotificationSubscription.n2InformationClass) &&
        Objects.equals(this.versions, defaultNotificationSubscription.versions) &&
        Objects.equals(this.binding, defaultNotificationSubscription.binding) &&
        Objects.equals(this.acceptedEncoding, defaultNotificationSubscription.acceptedEncoding) &&
        Objects.equals(this.supportedFeatures, defaultNotificationSubscription.supportedFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationType, callbackUri, n1MessageClass, n2InformationClass, versions, binding, acceptedEncoding, supportedFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultNotificationSubscription {\n");
    
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    callbackUri: ").append(toIndentedString(callbackUri)).append("\n");
    sb.append("    n1MessageClass: ").append(toIndentedString(n1MessageClass)).append("\n");
    sb.append("    n2InformationClass: ").append(toIndentedString(n2InformationClass)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
    sb.append("    acceptedEncoding: ").append(toIndentedString(acceptedEncoding)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
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

