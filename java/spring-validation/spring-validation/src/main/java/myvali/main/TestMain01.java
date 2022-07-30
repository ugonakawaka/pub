package myvali.main;

import javax.validation.Validator;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import myvali.beans.Aaa;

public class TestMain01 {

	public static void main(String[] args) {
		a();
	}

	static void a() {


		{
			Aaa aaa = new Aaa();

			aaa.setS("1");
			aaa.setI0(null);
			var validator = new LocalValidatorFactoryBean();

			BindingResult bindingResult = new BindException(aaa, "aaa");
			// これ↓大事
			validator.afterPropertiesSet();

			validator.validate(aaa, bindingResult);

			System.out.println(bindingResult);

		}

	}
}
