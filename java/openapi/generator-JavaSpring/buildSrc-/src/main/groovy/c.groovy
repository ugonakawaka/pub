@Grab(group = 'org.openapitools', module = 'openapi-generator-cli', version = '5.1.1')
import org.openapitools.codegen.*
import org.openapitools.codegen.languages.*
class MyJavaClientCodegen extends JavaClientCodegen {

    MyJavaClientCodegen() {
        super()
    }

    String name = "my-codegen"
}
