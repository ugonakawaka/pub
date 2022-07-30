package aaaa;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TriggerType_anyOf
 */
public enum TriggerTypeAnyOf {
  
  QUOTA_THRESHOLD("QUOTA_THRESHOLD"),
  
  QHT("QHT"),
  
  FINAL("FINAL"),
  
  QUOTA_EXHAUSTED("QUOTA_EXHAUSTED"),
  
  VALIDITY_TIME("VALIDITY_TIME"),
  
  OTHER_QUOTA_TYPE("OTHER_QUOTA_TYPE"),
  
  FORCED_REAUTHORISATION("FORCED_REAUTHORISATION"),
  
  UNUSED_QUOTA_TIMER("UNUSED_QUOTA_TIMER"),
  
  UNIT_COUNT_INACTIVITY_TIMER("UNIT_COUNT_INACTIVITY_TIMER"),
  
  ABNORMAL_RELEASE("ABNORMAL_RELEASE"),
  
  QOS_CHANGE("QOS_CHANGE"),
  
  VOLUME_LIMIT("VOLUME_LIMIT"),
  
  TIME_LIMIT("TIME_LIMIT"),
  
  EVENT_LIMIT("EVENT_LIMIT"),
  
  PLMN_CHANGE("PLMN_CHANGE"),
  
  USER_LOCATION_CHANGE("USER_LOCATION_CHANGE"),
  
  RAT_CHANGE("RAT_CHANGE"),
  
  SESSION_AMBR_CHANGE("SESSION_AMBR_CHANGE"),
  
  UE_TIMEZONE_CHANGE("UE_TIMEZONE_CHANGE"),
  
  TARIFF_TIME_CHANGE("TARIFF_TIME_CHANGE"),
  
  MAX_NUMBER_OF_CHANGES_IN_CHARGING_CONDITIONS("MAX_NUMBER_OF_CHANGES_IN_CHARGING_CONDITIONS"),
  
  MANAGEMENT_INTERVENTION("MANAGEMENT_INTERVENTION"),
  
  CHANGE_OF_UE_PRESENCE_IN_PRESENCE_REPORTING_AREA("CHANGE_OF_UE_PRESENCE_IN_PRESENCE_REPORTING_AREA"),
  
  CHANGE_OF_3GPP_PS_DATA_OFF_STATUS("CHANGE_OF_3GPP_PS_DATA_OFF_STATUS"),
  
  SERVING_NODE_CHANGE("SERVING_NODE_CHANGE"),
  
  REMOVAL_OF_UPF("REMOVAL_OF_UPF"),
  
  ADDITION_OF_UPF("ADDITION_OF_UPF"),
  
  INSERTION_OF_ISMF("INSERTION_OF_ISMF"),
  
  REMOVAL_OF_ISMF("REMOVAL_OF_ISMF"),
  
  CHANGE_OF_ISMF("CHANGE_OF_ISMF"),
  
  START_OF_SERVICE_DATA_FLOW("START_OF_SERVICE_DATA_FLOW"),
  
  ECGI_CHANGE("ECGI_CHANGE"),
  
  TAI_CHANGE("TAI_CHANGE"),
  
  HANDOVER_CANCEL("HANDOVER_CANCEL"),
  
  HANDOVER_START("HANDOVER_START"),
  
  HANDOVER_COMPLETE("HANDOVER_COMPLETE"),
  
  GFBR_GUARANTEED_STATUS_CHANGE("GFBR_GUARANTEED_STATUS_CHANGE"),
  
  ADDITION_OF_ACCESS("ADDITION_OF_ACCESS"),
  
  REMOVAL_OF_ACCESS("REMOVAL_OF_ACCESS"),
  
  START_OF_SDF_ADDITIONAL_ACCESS("START_OF_SDF_ADDITIONAL_ACCESS"),
  
  REDUNDANT_TRANSMISSION_CHANGE("REDUNDANT_TRANSMISSION_CHANGE"),
  
  CGI_SAI_CHANGE("CGI_SAI_CHANGE"),
  
  RAI_CHANGE("RAI_CHANGE");

  private String value;

  TriggerTypeAnyOf(String value) {
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
  public static TriggerTypeAnyOf fromValue(String value) {
    for (TriggerTypeAnyOf b : TriggerTypeAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

