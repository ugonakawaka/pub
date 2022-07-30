package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets QosFlowAccessType_anyOf
 */
public enum QosFlowAccessTypeAnyOf {
  
  _3GPP("3GPP"),
  
  NON_3GPP("NON_3GPP"),
  
  _3GPP_AND_NON_3GPP("3GPP_AND_NON_3GPP");

  private String value;

  QosFlowAccessTypeAnyOf(String value) {
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
  public static QosFlowAccessTypeAnyOf fromValue(String value) {
    for (QosFlowAccessTypeAnyOf b : QosFlowAccessTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

