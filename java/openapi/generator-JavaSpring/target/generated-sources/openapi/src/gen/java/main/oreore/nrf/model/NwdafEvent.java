package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import oreore.nrf.model.NwdafEventAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Possible values are - SLICE_LOAD_LEVEL: Indicates that the event subscribed is load level information of Network Slice - NETWORK_PERFORMANCE: Indicates that the event subscribed is network performance information. - NF_LOAD: Indicates that the event subscribed is load level and status of one or several Network Functions. - SERVICE_EXPERIENCE: Indicates that the event subscribed is service experience. - UE_MOBILITY: Indicates that the event subscribed is UE mobility information. - UE_COMMUNICATION: Indicates that the event subscribed is UE communication information. - QOS_SUSTAINABILITY: Indicates that the event subscribed is QoS sustainability. - ABNORMAL_BEHAVIOUR: Indicates that the event subscribed is abnormal behaviour. - USER_DATA_CONGESTION: Indicates that the event subscribed is user data congestion information. - NSI_LOAD_LEVEL: Indicates that the event subscribed is load level information of Network Slice and the optionally associated Network Slice Instance 
 */
@ApiModel(description = "Possible values are - SLICE_LOAD_LEVEL: Indicates that the event subscribed is load level information of Network Slice - NETWORK_PERFORMANCE: Indicates that the event subscribed is network performance information. - NF_LOAD: Indicates that the event subscribed is load level and status of one or several Network Functions. - SERVICE_EXPERIENCE: Indicates that the event subscribed is service experience. - UE_MOBILITY: Indicates that the event subscribed is UE mobility information. - UE_COMMUNICATION: Indicates that the event subscribed is UE communication information. - QOS_SUSTAINABILITY: Indicates that the event subscribed is QoS sustainability. - ABNORMAL_BEHAVIOUR: Indicates that the event subscribed is abnormal behaviour. - USER_DATA_CONGESTION: Indicates that the event subscribed is user data congestion information. - NSI_LOAD_LEVEL: Indicates that the event subscribed is load level information of Network Slice and the optionally associated Network Slice Instance ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class NwdafEvent  implements Serializable {
  private static final long serialVersionUID = 1L;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NwdafEvent {\n");
    
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

