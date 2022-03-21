@Grab(group = 'org.openapitools', module = 'openapi-generator-cli', version = '5.4.0')

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

def generator(String yamlName) {

  xxx = ['generate', 
  '-i', "${project.basedir}/spec/5G_APIs-master/${yamlName}.yaml", 
  '--output', "${project.build.directory}/generated-sources/server/${yamlName}",
  '--config',
  "${project.basedir}/script/my.properties",
  '-g', 'spring',
  '--additional-properties=modelPackage=aaaa',
  ] as String[]

}




println("path => " + this.class.protectionDomain.codeSource.location.path)

println("${project.version}")


MyJavaClientCodegen.main(generator("TS29508_Nsmf_EventExposure"))
MyJavaClientCodegen.main(generator("TS29504_Nudr_GroupIDmap"))
MyJavaClientCodegen.main(generator("TS29518_Namf_EventExposure"))
MyJavaClientCodegen.main(generator("TS29521_Nbsf_Management"))