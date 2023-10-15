package oreore.bsf.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Pattern;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;
import oreore.bsf.api.PcfBindingsApi;
import oreore.bsf.model.ExtProblemDetails;
import oreore.bsf.model.PcfBinding;
import oreore.bsf.model.PcfBindingPatch;
import oreore.bsf.model.ProblemDetails;
import oreore.bsf.model.Snssai;

@Controller
@RequestMapping("/nbsf-management/v1/")
public class PcfBindingsApiImpl implements PcfBindingsApi {

	
	private final NativeWebRequest request;

	@InitBinder
    public void initBinder(WebDataBinder binder) {
		// System.out.println("*** ok initBinder");
        // bind empty strings as null
        // binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	// @ExceptionHandler(MethodArgumentNotValidException.class)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public Map<String, String> handleValidationExceptions(
			HttpMessageNotReadableException ex) {
	    Map<String, String> errors = new HashMap<>();

	    System.out.println("***** Errrorrrr");
	    System.out.println(errors);
	    return errors;
	}
	
	// =====================
    @org.springframework.beans.factory.annotation.Autowired
    public PcfBindingsApiImpl(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    // ============================
    // ============================
    

    
    // ============================
    // ============================ 
    
    
    
	@Override
	public ResponseEntity<PcfBinding> createPCFBinding(PcfBinding pcfBinding) {
		
		System.out.println("************ createPCFBinding OK!!!" + pcfBinding);
		
		{
			System.out.println(pcfBinding.getIpv4Addr());
			
		}
		
		if (false) {
			
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<PcfBinding>> violations = validator.validate(pcfBinding);
			for (ConstraintViolation<PcfBinding> violation : violations) {
			    System.out.println(violation);
			}
		}
		
		
		return PcfBindingsApi.super.createPCFBinding(pcfBinding);
	}

	@Override
	public ResponseEntity<Void> deleteIndPCFBinding(String bindingId) {
		// TODO Auto-generated method stub
		return PcfBindingsApi.super.deleteIndPCFBinding(bindingId);
	}


	@Override
	public ResponseEntity<PcfBinding> getPCFBindings(String ipv6Prefix, String ipv4Addr, String macAddr48, String dnn,
			String supi, String gpsi, Snssai snssai, String ipDomain, String suppFeat) {
		// TODO Auto-generated method stub
		return PcfBindingsApi.super.getPCFBindings(ipv6Prefix, ipv4Addr, macAddr48, dnn, supi, gpsi, snssai, ipDomain,
				suppFeat);
	}

	@Override
	public ResponseEntity<PcfBinding> updateIndPCFBinding(String bindingId, PcfBindingPatch pcfBindingPatch) {
		// TODO Auto-generated method stub
		return PcfBindingsApi.super.updateIndPCFBinding(bindingId, pcfBindingPatch);
	}
	
	
	
}
