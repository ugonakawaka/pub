package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets PsaIndication_anyOf
 */
public enum PsaIndicationAnyOf {
  
  INSERTED("PSA_INSERTED"),
  
  REMOVED("PSA_REMOVED"),
  
  INSERTED_ONLY("PSA_INSERTED_ONLY"),
  
  REMOVED_ONLY("PSA_REMOVED_ONLY");

  private String value;

  PsaIndicationAnyOf(String value) {
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
  public static PsaIndicationAnyOf fromValue(String value) {
    for (PsaIndicationAnyOf b : PsaIndicationAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

