package sample.exception;

public class PatternRuntimeException {

	public static class XxxRuntimeException extends RuntimeException {

		public XxxRuntimeException(String message) {
			super(message);
		}
		
	}
	
	public static void throwXxxRuntimeException(String message) throws XxxRuntimeException {
		throw new XxxRuntimeException(message);
	}
}
