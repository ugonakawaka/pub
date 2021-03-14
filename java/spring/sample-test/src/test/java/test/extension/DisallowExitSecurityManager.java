package test.extension;

import java.security.Permission;

/**
 * 
 * @see https://todd.ginsberg.com/post/testing-system-exit/
 *
 */
public class DisallowExitSecurityManager extends SecurityManager {
	private final SecurityManager delegatedSecurityManager;
	private Integer firstExitStatusCode;

	public static class SystemExitPreventedException extends SecurityException {

	}

	public DisallowExitSecurityManager(final SecurityManager originalSecurityManager) {
		this.delegatedSecurityManager = originalSecurityManager;
	}

	/**
	 * This is the one method we truly override in this class, all others are
	 * delegated.
	 *
	 * @param statusCode the exit status
	 */
	@Override
	public void checkExit(final int statusCode) {
		if (firstExitStatusCode == null) {
			this.firstExitStatusCode = statusCode;
		}
		throw new SystemExitPreventedException();
	}

	public Integer getFirstExitStatusCode() {
		return firstExitStatusCode;
	}

	// All other methods implemented and delegate to delegatedSecurityManager, if it
	// is present.
	// Otherwise, they do nothing and allow the check to pass.

	// Example:
	@Override
	public void checkPermission(Permission perm) {
		if (delegatedSecurityManager != null) {
			delegatedSecurityManager.checkPermission(perm);
		}
	}
}
