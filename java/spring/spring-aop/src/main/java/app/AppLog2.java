package app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppLog2 {


	public AppLog2() {

	}


	
	@Before("execution(* app.test2.*.*(..))")
	public void beforeLog(JoinPoint joinpoint) {
		// インターフェイスに設定できるのか？
		System.out.println("*** calledd target =>" + joinpoint.getTarget());

		{
			var log2 = LoggerFactory.getLogger(joinpoint.getTarget().getClass());
			log2.info("START: " + joinpoint.getSignature());
		}

	}

	@After("execution(* app.test.*.*(..))")
	public void afterLog(JoinPoint joinpoint) {
		{
			var log2 = LoggerFactory.getLogger(joinpoint.getTarget().getClass());
			log2.info("END: " + joinpoint.getSignature());
		}
	}
}
