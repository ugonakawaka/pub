package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import oreore.nrf.model.EventIdAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Possible values are - LOAD_LEVEL_INFORMATION: Represent the analytics of load level information of corresponding network slice. - NETWORK_PERFORMANCE: Represent the analytics of network performance information. - NF_LOAD: Indicates that the event subscribed is NF Load. - SERVICE_EXPERIENCE: Represent the analytics of service experience information of the specific applications. - UE_MOBILITY: Represent the analytics of UE mobility. - UE_COMMUNICATION: Represent the analytics of UE communication. - QOS_SUSTAINABILITY: Represent the analytics of QoS sustainability information in the certain area.  - ABNORMAL_BEHAVIOUR: Indicates that the event subscribed is abnormal behaviour information. - USER_DATA_CONGESTION: Represent the analytics of the user data congestion in the certain area. - NSI_LOAD_LEVEL: Represent the analytics of Network Slice and the optionally associated Network Slice Instance. 
 */
@ApiModel(description = "Possible values are - LOAD_LEVEL_INFORMATION: Represent the analytics of load level information of corresponding network slice. - NETWORK_PERFORMANCE: Represent the analytics of network performance information. - NF_LOAD: Indicates that the event subscribed is NF Load. - SERVICE_EXPERIENCE: Represent the analytics of service experience information of the specific applications. - UE_MOBILITY: Represent the analytics of UE mobility. - UE_COMMUNICATION: Represent the analytics of UE communication. - QOS_SUSTAINABILITY: Represent the analytics of QoS sustainability information in the certain area.  - ABNORMAL_BEHAVIOUR: Indicates that the event subscribed is abnormal behaviour information. - USER_DATA_CONGESTION: Represent the analytics of the user data congestion in the certain area. - NSI_LOAD_LEVEL: Represent the analytics of Network Slice and the optionally associated Network Slice Instance. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class EventId  implements Serializable {
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
    sb.append("class EventId {\n");
    
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

