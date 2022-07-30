package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets N4MessageType_anyOf
 */
public enum N4MessageTypeAnyOf {
  
  EST_REQ("PFCP_SES_EST_REQ"),
  
  EST_RSP("PFCP_SES_EST_RSP"),
  
  MOD_REQ("PFCP_SES_MOD_REQ"),
  
  MOD_RSP("PFCP_SES_MOD_RSP"),
  
  DEL_REQ("PFCP_SES_DEL_REQ"),
  
  DEL_RSP("PFCP_SES_DEL_RSP"),
  
  REP_REQ("PFCP_SES_REP_REQ"),
  
  REP_RSP("PFCP_SES_REP_RSP");

  private String value;

  N4MessageTypeAnyOf(String value) {
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
  public static N4MessageTypeAnyOf fromValue(String value) {
    for (N4MessageTypeAnyOf b : N4MessageTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

