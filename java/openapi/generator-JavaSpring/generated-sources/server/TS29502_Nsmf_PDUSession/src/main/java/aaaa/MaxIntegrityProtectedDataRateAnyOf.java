package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MaxIntegrityProtectedDataRate_anyOf
 */
public enum MaxIntegrityProtectedDataRateAnyOf {
  
  _64_KBPS("64_KBPS"),
  
  MAX_UE_RATE("MAX_UE_RATE");

  private String value;

  MaxIntegrityProtectedDataRateAnyOf(String value) {
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
  public static MaxIntegrityProtectedDataRateAnyOf fromValue(String value) {
    for (MaxIntegrityProtectedDataRateAnyOf b : MaxIntegrityProtectedDataRateAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

