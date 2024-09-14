package myvali.beans;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class Aaa {

	@NotBlank
	@Size(min = 1, max = 100)
	String s;

	@Range(min = 100)
	Integer i0;

	Integer i1;

	Integer i2;
	

	Integer i3;

}
