package aaaa;

import java.util.Objects;
import aaaa.TunnelInfo;
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
 * Tunnel Information per QoS Flow
 */
@ApiModel(description = "Tunnel Information per QoS Flow")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:35:56.572150+09:00[Asia/Tokyo]")
public class QosFlowTunnel   {
  @JsonProperty("qfiList")
  @Valid
  private List<Integer> qfiList = new ArrayList<>();

  @JsonProperty("tunnelInfo")
  private TunnelInfo tunnelInfo;

  public QosFlowTunnel qfiList(List<Integer> qfiList) {
    this.qfiList = qfiList;
    return this;
  }

  public QosFlowTunnel addQfiListItem(Integer qfiListItem) {
    this.qfiList.add(qfiListItem);
    return this;
  }

  /**
   * Get qfiList
   * @return qfiList
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1) 
  public List<Integer> getQfiList() {
    return qfiList;
  }

  public void setQfiList(List<Integer> qfiList) {
    this.qfiList = qfiList;
  }

  public QosFlowTunnel tunnelInfo(TunnelInfo tunnelInfo) {
    this.tunnelInfo = tunnelInfo;
    return this;
  }

  /**
   * Get tunnelInfo
   * @return tunnelInfo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TunnelInfo getTunnelInfo() {
    return tunnelInfo;
  }

  public void setTunnelInfo(TunnelInfo tunnelInfo) {
    this.tunnelInfo = tunnelInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosFlowTunnel qosFlowTunnel = (QosFlowTunnel) o;
    return Objects.equals(this.qfiList, qosFlowTunnel.qfiList) &&
        Objects.equals(this.tunnelInfo, qosFlowTunnel.tunnelInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qfiList, tunnelInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosFlowTunnel {\n");
    
    sb.append("    qfiList: ").append(toIndentedString(qfiList)).append("\n");
    sb.append("    tunnelInfo: ").append(toIndentedString(tunnelInfo)).append("\n");
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

