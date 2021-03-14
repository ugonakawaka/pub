package sample.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

class IamUtilTest {

	static class Target {

		String a() {
			return IamUtil.string();
		}
	}

	@Test
	void test() {
		System.out.println(IamUtil.string());
		// fail("Not yet implemented");
		try (MockedStatic<IamUtil> mocked = Mockito.mockStatic(IamUtil.class)) {
			mocked.when(IamUtil::string).thenReturn("bar");
			System.out.println(IamUtil.string());

			Target target = new Target();
			assertEquals("bar", target.a());
		}
		System.out.println(IamUtil.string());
	}

}
