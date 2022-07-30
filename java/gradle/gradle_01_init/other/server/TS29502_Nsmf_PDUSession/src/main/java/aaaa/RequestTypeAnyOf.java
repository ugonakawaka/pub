package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets RequestType_anyOf
 */
public enum RequestTypeAnyOf {
  
  INITIAL_REQUEST("INITIAL_REQUEST"),
  
  EXISTING_PDU_SESSION("EXISTING_PDU_SESSION"),
  
  INITIAL_EMERGENCY_REQUEST("INITIAL_EMERGENCY_REQUEST"),
  
  EXISTING_EMERGENCY_PDU_SESSION("EXISTING_EMERGENCY_PDU_SESSION");

  private String value;

  RequestTypeAnyOf(String value) {
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
  public static RequestTypeAnyOf fromValue(String value) {
    for (RequestTypeAnyOf b : RequestTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

