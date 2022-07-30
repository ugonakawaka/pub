package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets UnavailableAccessIndication_anyOf
 */
public enum UnavailableAccessIndicationAnyOf {
  
  _3GA_UNAVAILABLE("3GA_UNAVAILABLE"),
  
  N3GA_UNAVAILABLE("N3GA_UNAVAILABLE");

  private String value;

  UnavailableAccessIndicationAnyOf(String value) {
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
  public static UnavailableAccessIndicationAnyOf fromValue(String value) {
    for (UnavailableAccessIndicationAnyOf b : UnavailableAccessIndicationAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

