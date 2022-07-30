package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SbiBindingLevel_anyOf
 */
public enum SbiBindingLevelAnyOf {
  
  INSTANCE_BINDING("NF_INSTANCE_BINDING"),
  
  SET_BINDING("NF_SET_BINDING"),
  
  SERVICE_SET_BINDING("NF_SERVICE_SET_BINDING"),
  
  SERVICE_INSTANCE_BINDING("NF_SERVICE_INSTANCE_BINDING");

  private String value;

  SbiBindingLevelAnyOf(String value) {
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
  public static SbiBindingLevelAnyOf fromValue(String value) {
    for (SbiBindingLevelAnyOf b : SbiBindingLevelAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

