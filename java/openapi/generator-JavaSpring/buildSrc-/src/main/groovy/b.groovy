
@Grab(group = 'org.openapitools', module = 'openapi-generator-cli', version = '5.1.1')
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.openapitools.codegen.*
import org.openapitools.codegen.languages.*


class HogeTask extends DefaultTask {

    @TaskAction
    def hoge() {

		println("Hello Hoge4.")
  
    }


}


