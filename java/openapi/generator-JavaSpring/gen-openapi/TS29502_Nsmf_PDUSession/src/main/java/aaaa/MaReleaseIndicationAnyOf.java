package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets MaReleaseIndication_anyOf
 */
public enum MaReleaseIndicationAnyOf {
  
  _3GPP("REL_MAPDU_OVER_3GPP"),
  
  N3GPP("REL_MAPDU_OVER_N3GPP");

  private String value;

  MaReleaseIndicationAnyOf(String value) {
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
  public static MaReleaseIndicationAnyOf fromValue(String value) {
    for (MaReleaseIndicationAnyOf b : MaReleaseIndicationAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

