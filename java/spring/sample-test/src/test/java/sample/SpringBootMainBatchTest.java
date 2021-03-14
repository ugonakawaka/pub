package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.extension.ExpectSystemExit;

class SpringBootMainBatchTest {

	@Test
	@ExpectSystemExit
	void test() {

		SpringBootMainBatch.main(new String[0]);
	}

}
