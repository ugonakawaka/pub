package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-09T17:51:16.518942+09:00[Asia/Tokyo]")
@Controller
@RequestMapping("${openapi.nsmfPDUSession.base-path:/nsmf-pdusession/v1}")
public class SmContextsApiController implements SmContextsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SmContextsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
