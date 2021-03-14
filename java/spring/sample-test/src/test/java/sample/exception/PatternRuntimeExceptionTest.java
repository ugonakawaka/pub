package sample.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatternRuntimeExceptionTest {

	@Test
	void test() {

		assertThrows(PatternRuntimeException.XxxRuntimeException.class, () -> {
			PatternRuntimeException.throwXxxRuntimeException("xxx");
		});
	}

}
