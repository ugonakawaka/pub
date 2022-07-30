package myvali.main;

import java.io.IOException;
import java.lang.reflect.Field;

import javax.validation.Validator;

import org.aopalliance.intercept.Interceptor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;

import myvali.beans.Aaa;
import myvali.beans.TargetInteger;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.dynamic.DynamicType.Builder;
import net.bytebuddy.implementation.FieldAccessor;
import net.bytebuddy.implementation.MethodDelegation;

public class TestMain2 {

	public static void main(String[] args) {
		a();
	}

	static void a() {

		{

			Class<? extends TargetInteger> dynamicUserType = new ByteBuddy().subclass(TargetInteger.class)

					.defineField("interceptor", Interceptor.class, Visibility.PRIVATE)
					.implement(InterceptionAccessor.class).intercept(FieldAccessor.ofBeanProperty()).make()
					.load(getClass().getClassLoader()).getLoaded();

			ByteBuddy byteBuddy = new ByteBuddy();
			Builder<TargetInteger> targetInteger = byteBuddy.decorate(TargetInteger.class).define(null);
		}

		{
			TargetInteger aaa = new TargetInteger();

			DynamicAnnotationReplaceUtils.a(aaa);
		}

	}
}
