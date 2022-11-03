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
public class AppLog {
	private final Logger log;

	public AppLog() {
		super();
		log = LoggerFactory.getLogger(AppLog.class);
	}

	
	@Before("execution(* app.test.*.*(..))")
	public void beforeLog(JoinPoint joinpoint) {
		System.out.println("*** calledd target =>" + joinpoint.getTarget());
		log.info("START: " + joinpoint.getSignature());

		{
			var log2 = LoggerFactory.getLogger(joinpoint.getTarget().getClass());
			log2.info("START: " + joinpoint.getSignature());
		}

	}

	@After("execution(* app.test.*.*(..))")
	public void afterLog(JoinPoint joinpoint) {
		log.info("END: " + joinpoint.getSignature());
	}
}
