package test.extension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.platform.commons.util.AnnotationUtils;

import test.extension.DisallowExitSecurityManager.SystemExitPreventedException;

/**
 * 
 * @see https://todd.ginsberg.com/post/testing-system-exit/
 *
 */
public class SystemExitExtension implements BeforeEachCallback, AfterEachCallback, TestExecutionExceptionHandler {
	private Integer expectedStatusCode;
	private final DisallowExitSecurityManager disallowExitSecurityManager = new DisallowExitSecurityManager(
			System.getSecurityManager());
	private SecurityManager originalSecurityManager;

	@Override
	public void beforeEach(final ExtensionContext context) {
		// Set aside the current SecurityManager
		originalSecurityManager = System.getSecurityManager();

		// Get the expected exit status code, if any
		getAnnotation(context).ifPresent(code -> expectedStatusCode = code.value());

		// Install our own SecurityManager
		System.setSecurityManager(disallowExitSecurityManager);
	}

	@Override
	public void handleTestExecutionException(final ExtensionContext context, final Throwable throwable)
			throws Throwable {
		if (!(throwable instanceof SystemExitPreventedException)) {
			throw throwable;
		}
	}

	@Override
	public void afterEach(final ExtensionContext context) {
		// Return the original SecurityManager, if any, to service.
		System.setSecurityManager(originalSecurityManager);

		if (expectedStatusCode == null) {
			assertNotNull(disallowExitSecurityManager.getFirstExitStatusCode(),
					"Expected System.exit() to be called, but it was not");
		} else {
			assertEquals(expectedStatusCode, disallowExitSecurityManager.getFirstExitStatusCode(),
					"Expected System.exit(" + expectedStatusCode + ") to be called, but it was not.");
		}
	}

	// Find the annotation on a method, or failing that, a class.
	private Optional<ExpectSystemExitWithStatus> getAnnotation(final ExtensionContext context) {
		final Optional<ExpectSystemExitWithStatus> method = AnnotationUtils.findAnnotation(context.getTestMethod(),
				ExpectSystemExitWithStatus.class);

		if (method.isPresent()) {
			return method;
		} else {
			return AnnotationUtils.findAnnotation(context.getTestClass(), ExpectSystemExitWithStatus.class);
		}
	}
}
