package myvali.beans;

import org.hibernate.validator.constraints.Range;
import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class TargetInteger {

	Integer integer00;
	
	@Range
	Integer integer01;
	
	
}
