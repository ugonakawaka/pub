package aaaa;

import java.util.Objects;
import aaaa.EutraLocation;
import aaaa.GeraLocation;
import aaaa.N3gaLocation;
import aaaa.NrLocation;
import aaaa.UtraLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * At least one of eutraLocation, nrLocation and n3gaLocation shall be present. Several of them may be present
 */
@ApiModel(description = "At least one of eutraLocation, nrLocation and n3gaLocation shall be present. Several of them may be present")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class UserLocation   {
  @JsonProperty("eutraLocation")
  private EutraLocation eutraLocation;

  @JsonProperty("nrLocation")
  private NrLocation nrLocation;

  @JsonProperty("n3gaLocation")
  private N3gaLocation n3gaLocation;

  @JsonProperty("utraLocation")
  private UtraLocation utraLocation;

  @JsonProperty("geraLocation")
  private GeraLocation geraLocation;

  public UserLocation eutraLocation(EutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
    return this;
  }

  /**
   * Get eutraLocation
   * @return eutraLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public EutraLocation getEutraLocation() {
    return eutraLocation;
  }

  public void setEutraLocation(EutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
  }

  public UserLocation nrLocation(NrLocation nrLocation) {
    this.nrLocation = nrLocation;
    return this;
  }

  /**
   * Get nrLocation
   * @return nrLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public NrLocation getNrLocation() {
    return nrLocation;
  }

  public void setNrLocation(NrLocation nrLocation) {
    this.nrLocation = nrLocation;
  }

  public UserLocation n3gaLocation(N3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
    return this;
  }

  /**
   * Get n3gaLocation
   * @return n3gaLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public N3gaLocation getN3gaLocation() {
    return n3gaLocation;
  }

  public void setN3gaLocation(N3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
  }

  public UserLocation utraLocation(UtraLocation utraLocation) {
    this.utraLocation = utraLocation;
    return this;
  }

  /**
   * Get utraLocation
   * @return utraLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UtraLocation getUtraLocation() {
    return utraLocation;
  }

  public void setUtraLocation(UtraLocation utraLocation) {
    this.utraLocation = utraLocation;
  }

  public UserLocation geraLocation(GeraLocation geraLocation) {
    this.geraLocation = geraLocation;
    return this;
  }

  /**
   * Get geraLocation
   * @return geraLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public GeraLocation getGeraLocation() {
    return geraLocation;
  }

  public void setGeraLocation(GeraLocation geraLocation) {
    this.geraLocation = geraLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLocation userLocation = (UserLocation) o;
    return Objects.equals(this.eutraLocation, userLocation.eutraLocation) &&
        Objects.equals(this.nrLocation, userLocation.nrLocation) &&
        Objects.equals(this.n3gaLocation, userLocation.n3gaLocation) &&
        Objects.equals(this.utraLocation, userLocation.utraLocation) &&
        Objects.equals(this.geraLocation, userLocation.geraLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eutraLocation, nrLocation, n3gaLocation, utraLocation, geraLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLocation {\n");
    
    sb.append("    eutraLocation: ").append(toIndentedString(eutraLocation)).append("\n");
    sb.append("    nrLocation: ").append(toIndentedString(nrLocation)).append("\n");
    sb.append("    n3gaLocation: ").append(toIndentedString(n3gaLocation)).append("\n");
    sb.append("    utraLocation: ").append(toIndentedString(utraLocation)).append("\n");
    sb.append("    geraLocation: ").append(toIndentedString(geraLocation)).append("\n");
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

