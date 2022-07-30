package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets UpIntegrity_anyOf
 */
public enum UpIntegrityAnyOf {
  
  REQUIRED("REQUIRED"),
  
  PREFERRED("PREFERRED"),
  
  NOT_NEEDED("NOT_NEEDED");

  private String value;

  UpIntegrityAnyOf(String value) {
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
  public static UpIntegrityAnyOf fromValue(String value) {
    for (UpIntegrityAnyOf b : UpIntegrityAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

