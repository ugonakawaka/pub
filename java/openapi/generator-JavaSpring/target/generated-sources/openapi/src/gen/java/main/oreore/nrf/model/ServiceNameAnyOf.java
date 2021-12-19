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
 * Gets or Sets ServiceName_anyOf
 */
public enum ServiceNameAnyOf {
  
  NNRF_NFM("nnrf-nfm"),
  
  NNRF_DISC("nnrf-disc"),
  
  NNRF_OAUTH2("nnrf-oauth2"),
  
  NUDM_SDM("nudm-sdm"),
  
  NUDM_UECM("nudm-uecm"),
  
  NUDM_UEAU("nudm-ueau"),
  
  NUDM_EE("nudm-ee"),
  
  NUDM_PP("nudm-pp"),
  
  NUDM_NIDDAU("nudm-niddau"),
  
  NUDM_MT("nudm-mt"),
  
  NAMF_COMM("namf-comm"),
  
  NAMF_EVTS("namf-evts"),
  
  NAMF_MT("namf-mt"),
  
  NAMF_LOC("namf-loc"),
  
  NSMF_PDUSESSION("nsmf-pdusession"),
  
  NSMF_EVENT_EXPOSURE("nsmf-event-exposure"),
  
  NSMF_NIDD("nsmf-nidd"),
  
  NAUSF_AUTH("nausf-auth"),
  
  NAUSF_SORPROTECTION("nausf-sorprotection"),
  
  NAUSF_UPUPROTECTION("nausf-upuprotection"),
  
  NNEF_PFDMANAGEMENT("nnef-pfdmanagement"),
  
  NNEF_SMCONTEXT("nnef-smcontext"),
  
  NNEF_EVENTEXPOSURE("nnef-eventexposure"),
  
  NPCF_AM_POLICY_CONTROL("npcf-am-policy-control"),
  
  NPCF_SMPOLICYCONTROL("npcf-smpolicycontrol"),
  
  NPCF_POLICYAUTHORIZATION("npcf-policyauthorization"),
  
  NPCF_BDTPOLICYCONTROL("npcf-bdtpolicycontrol"),
  
  NPCF_EVENTEXPOSURE("npcf-eventexposure"),
  
  NPCF_UE_POLICY_CONTROL("npcf-ue-policy-control"),
  
  NSMSF_SMS("nsmsf-sms"),
  
  NNSSF_NSSELECTION("nnssf-nsselection"),
  
  NNSSF_NSSAIAVAILABILITY("nnssf-nssaiavailability"),
  
  NUDR_DR("nudr-dr"),
  
  NUDR_GROUP_ID_MAP("nudr-group-id-map"),
  
  NLMF_LOC("nlmf-loc"),
  
  N5G_EIR_EIC("n5g-eir-eic"),
  
  NBSF_MANAGEMENT("nbsf-management"),
  
  NCHF_SPENDINGLIMITCONTROL("nchf-spendinglimitcontrol"),
  
  NCHF_CONVERGEDCHARGING("nchf-convergedcharging"),
  
  NCHF_OFFLINEONLYCHARGING("nchf-offlineonlycharging"),
  
  NNWDAF_EVENTSSUBSCRIPTION("nnwdaf-eventssubscription"),
  
  NNWDAF_ANALYTICSINFO("nnwdaf-analyticsinfo"),
  
  NNWDAF_DATAMANAGEMENT("nnwdaf-datamanagement"),
  
  NNWDAF_MLMODELPROVISION("nnwdaf-mlmodelprovision"),
  
  NGMLC_LOC("ngmlc-loc"),
  
  NUCMF_PROVISIONING("nucmf-provisioning"),
  
  NUCMF_UECAPABILITYMANAGEMENT("nucmf-uecapabilitymanagement"),
  
  NHSS_SDM("nhss-sdm"),
  
  NHSS_UECM("nhss-uecm"),
  
  NHSS_UEAU("nhss-ueau"),
  
  NHSS_EE("nhss-ee"),
  
  NHSS_IMS_SDM("nhss-ims-sdm"),
  
  NHSS_IMS_UECM("nhss-ims-uecm"),
  
  NHSS_IMS_UEAU("nhss-ims-ueau"),
  
  NSEPP_TELESCOPIC("nsepp-telescopic"),
  
  NSORAF_SOR("nsoraf-sor"),
  
  NSPAF_SECURED_PACKET("nspaf-secured-packet"),
  
  NUDSF_DR("nudsf-dr"),
  
  NUDSF_TIMER("nudsf-timer"),
  
  NNSSAAF_NSSAA("nnssaaf-nssaa"),
  
  NAANF_AKMA("naanf-akma"),
  
  N5GDDNMF_DISCOVERY("n5gddnmf-discovery"),
  
  NMFAF_3DADM("nmfaf-3dadm"),
  
  NMFAF_3CADM("nmfaf-3cadm"),
  
  NEASDF_DNSCONTEXT("neasdf-dnscontext"),
  
  NDCCF_DM("ndccf-dm"),
  
  NDCCF_CM("ndccf-cm");

  private String value;

  ServiceNameAnyOf(String value) {
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
  public static ServiceNameAnyOf fromValue(String value) {
    for (ServiceNameAnyOf b : ServiceNameAnyOf.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

