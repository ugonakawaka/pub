package aaaa;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates wether the access is  via 3GPP or via non-3GPP.
 */
public enum AccessType {
  
  _3GPP_ACCESS("3GPP_ACCESS"),
  
  NON_3GPP_ACCESS("NON_3GPP_ACCESS");

  private String value;

  AccessType(String value) {
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
  public static AccessType fromValue(String value) {
    for (AccessType b : AccessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

