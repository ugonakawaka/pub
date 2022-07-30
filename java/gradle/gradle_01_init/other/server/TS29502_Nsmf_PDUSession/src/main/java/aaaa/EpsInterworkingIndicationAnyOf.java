package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EpsInterworkingIndication_anyOf
 */
public enum EpsInterworkingIndicationAnyOf {
  
  NONE("NONE"),
  
  WITH_N26("WITH_N26"),
  
  WITHOUT_N26("WITHOUT_N26"),
  
  IWK_NON_3GPP("IWK_NON_3GPP");

  private String value;

  EpsInterworkingIndicationAnyOf(String value) {
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
  public static EpsInterworkingIndicationAnyOf fromValue(String value) {
    for (EpsInterworkingIndicationAnyOf b : EpsInterworkingIndicationAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

