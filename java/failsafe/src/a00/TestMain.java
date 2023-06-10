package a00;

import java.net.ConnectException;
import java.sql.Connection;
import java.time.Duration;

import dev.failsafe.Failsafe;
import dev.failsafe.RetryPolicy;

public class TestMain {

	public static void main(String[] args) {
		a();
	}

	static void a() {
		try {

			System.out.println("**** start");
			RetryPolicy<Object> retryPolicy = RetryPolicy.builder().handle(ConnectException.class)
					.withDelay(/* １秒まち */Duration.ofSeconds(1)).withMaxRetries(/* 最大３回リトライ */3).build();

			// Run with retries
			Failsafe.with(retryPolicy).run(() -> connect());

			// Get with retries
			Connection connection = Failsafe.with(retryPolicy).get(() -> connect());
			System.out.println("**** ここは実行されない想定");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println(e.getClass()); // dev.failsafe.FailsafeException
		} finally {
			System.out.println("cnt:" + cnt);
		}

	}

	static int cnt = 0;

	static void called() {
		cnt++;
	}

	static Connection connect() throws ConnectException {
		called();
		throw new ConnectException();
	}
}
