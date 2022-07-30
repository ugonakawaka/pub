package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SmfSelectionType_anyOf
 */
public enum SmfSelectionTypeAnyOf {
  
  CURRENT_PDU_SESSION("CURRENT_PDU_SESSION"),
  
  NEXT_PDU_SESSION("NEXT_PDU_SESSION");

  private String value;

  SmfSelectionTypeAnyOf(String value) {
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
  public static SmfSelectionTypeAnyOf fromValue(String value) {
    for (SmfSelectionTypeAnyOf b : SmfSelectionTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

