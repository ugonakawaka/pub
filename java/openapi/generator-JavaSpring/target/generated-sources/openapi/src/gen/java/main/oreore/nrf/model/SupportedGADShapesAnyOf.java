package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets SupportedGADShapes_anyOf
 */
public enum SupportedGADShapesAnyOf {
  
  POINT("POINT"),
  
  POINT_UNCERTAINTY_CIRCLE("POINT_UNCERTAINTY_CIRCLE"),
  
  POINT_UNCERTAINTY_ELLIPSE("POINT_UNCERTAINTY_ELLIPSE"),
  
  POLYGON("POLYGON"),
  
  POINT_ALTITUDE("POINT_ALTITUDE"),
  
  POINT_ALTITUDE_UNCERTAINTY("POINT_ALTITUDE_UNCERTAINTY"),
  
  ELLIPSOID_ARC("ELLIPSOID_ARC"),
  
  LOCAL_2D_POINT_UNCERTAINTY_ELLIPSE("LOCAL_2D_POINT_UNCERTAINTY_ELLIPSE"),
  
  LOCAL_3D_POINT_UNCERTAINTY_ELLIPSOID("LOCAL_3D_POINT_UNCERTAINTY_ELLIPSOID");

  private String value;

  SupportedGADShapesAnyOf(String value) {
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
  public static SupportedGADShapesAnyOf fromValue(String value) {
    for (SupportedGADShapesAnyOf b : SupportedGADShapesAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

