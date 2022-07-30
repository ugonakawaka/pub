@Grab(group = 'org.openapitools', module = 'openapi-generator-cli', version = '5.1.1')
@Grab(group='io.swagger.core.v3', module='swagger-annotations', version='2.1.13')



import org.openapitools.codegen.*
import org.openapitools.codegen.languages.*

// String[] args = "-i ../spec/TS29510_Nnrf_NFManagement.yaml -o openapi_client -g spring".split(" ")


class MyJavaClientCodegen extends JavaClientCodegen {
 
  static main(String[] args) {
    OpenAPIGenerator.main(args)
  }
 
  MyJavaClientCodegen() {
    super()
  }
 
  String name = "my-codegen"
}

def generator(String yamlName, String type, String g) {

  xxx = ['generate', 
  '-i', "${project.basedir}/spec/5G_APIs-master/${yamlName}.yaml", 
  '--output', "${project.build.directory}/generated-sources/${type}/${yamlName}",
  '--config',
  "${project.basedir}/script/my.properties",
  '-g', "${g}",
  '--additional-properties=modelPackage=aaaa,swaggerAnnotations=false',
  ] as String[]

}




println("path => " + this.class.protectionDomain.codeSource.location.path)

println("${project.version}")

String all = """
//TS29502_Nsmf_PDUSession
TS29503_Nudm_EE
TS29503_Nudm_MT
TS29503_Nudm_NIDDAU
TS29503_Nudm_PP
TS29503_Nudm_SDM
TS29503_Nudm_SSAU
TS29503_Nudm_UEAU
TS29503_Nudm_UECM
//TS29504_Nudr_DR
TS29504_Nudr_GroupIDmap
TS29507_Npcf_AMPolicyControl
TS29508_Nsmf_EventExposure
TS29509_Nausf_SoRProtection
TS29509_Nausf_UEAuthentication
TS29509_Nausf_UPUProtection
TS29510_Nnrf_AccessToken
TS29510_Nnrf_Bootstrapping
TS29510_Nnrf_NFDiscovery
TS29510_Nnrf_NFManagement
TS29511_N5g-eir_EquipmentIdentityCheck
TS29512_Npcf_SMPolicyControl
TS29514_Npcf_PolicyAuthorization
TS29515_Ngmlc_Location
TS29517_Naf_EventExposure
//TS29518_Namf_Communication
TS29518_Namf_EventExposure
TS29518_Namf_Location
//TS29518_Namf_MBSBroadcast
TS29518_Namf_MBSCommunication
TS29518_Namf_MT
TS29520_Nnwdaf_AnalyticsInfo
TS29520_Nnwdaf_EventsSubscription
TS29520_Nnwdaf_MLModelProvision
TS29521_Nbsf_Management
//TS29522_NIDDConfigurationTrigger
//TS29523_Npcf_EventExposure
//TS29525_Npcf_UEPolicyControl
//TS29526_Nnssaaf_NSSAA
TS29531_Nnssf_NSSAIAvailability
TS29531_Nnssf_NSSelection
//TS29532_Nmbsmf_MBSSession
TS29532_Nmbsmf_TMGI
TS29534_Npcf_AMPolicyAuthorization
TS29535_Naanf_AKMA
TS29536_Nnsacf_NSAC
TS29536_Nnsacf_SliceEventExposure
TS29540_Nsmsf_SMService
TS29541_Nnef_SMContext
TS29542_Nsmf_NIDD
TS29544_Nspaf_SecuredPacket
TS29550_Nsoraf_SOR
TS29551_Nnef_PFDmanagement
TS29554_Npcf_BDTPolicyControl
TS29555_N5g-ddnmf_Discovery
TS29556_Neasdf_BaselineDNSPattern
TS29556_Neasdf_DNSContext
TS29557_Naf_ProSe
TS29562_Nhss_gbaSDM
TS29562_Nhss_gbaUEAU
TS29562_Nhss_imsSDM
TS29562_Nhss_imsUEAU
TS29562_Nhss_imsUECM
TS29563_Nhss_EE
TS29563_Nhss_SDM
TS29563_Nhss_UEAU
TS29563_Nhss_UECM
TS29564_Nupf_EventExposure
TS29565_Ntsctsf_QoSandTSCAssistance
TS29565_Ntsctsf_TimeSynchronization
TS29572_Nlmf_Broadcast
//TS29572_Nlmf_Location
TS29573_N32_Handshake
TS29591_Nnef_EventExposure
TS29594_Nchf_SpendingLimitControl
//TS29598_Nudsf_DataRepository
//TS29598_Nudsf_Timer
"""

ss = all.split("\n")

ss = ['TS29502_Nsmf_PDUSession']
for( String values : ss ) {
  println values
  if (values == "") continue

  if (values.startsWith("//")) continue

  MyJavaClientCodegen.main(generator(values, "server", "spring"))
  MyJavaClientCodegen.main(generator(values, "client", "java"))
}

// MyJavaClientCodegen.main(generator("TS29508_Nsmf_EventExposure", "server", "spring"))
// MyJavaClientCodegen.main(generator("TS29504_Nudr_GroupIDmap", "server", "spring"))
// MyJavaClientCodegen.main(generator("TS29518_Namf_EventExposure", "server", "spring"))
// MyJavaClientCodegen.main(generator("TS29521_Nbsf_Management", "server", "spring"))

// MyJavaClientCodegen.main(generator("TS29508_Nsmf_EventExposure", "client", "java"))
// MyJavaClientCodegen.main(generator("TS29504_Nudr_GroupIDmap", "client", "java"))
// MyJavaClientCodegen.main(generator("TS29518_Namf_EventExposure", "client", "java"))
// MyJavaClientCodegen.main(generator("TS29521_Nbsf_Management", "client", "java"))