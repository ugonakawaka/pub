package a1114_PrintinOrder;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Foo {
	public Foo() {

	}

	Object lock = new Object();
	AtomicBoolean b1 = new AtomicBoolean(false);
	AtomicBoolean b2 = new AtomicBoolean(false);
	AtomicBoolean b3 = new AtomicBoolean(false);

	AtomicInteger atomicInteger = new AtomicInteger(1);

	public void first(Runnable printFirst) throws InterruptedException {

		// printFirst.run() outputs "first". Do not change or remove this line.
		printFirst.run();

		// Thread.currentThread().notifyAll();
		atomicInteger.set(2);

	}

	public void second(Runnable printSecond) throws InterruptedException {

		while (atomicInteger.get() != 2) {

		}
		// printSecond.run() outputs "second". Do not change or remove this line.
		printSecond.run();
		atomicInteger.set(3);
		// notifyAll();
	}

	public void third(Runnable printThird) throws InterruptedException {
		while (atomicInteger.get() != 3) {

		}
		// printThird.run() outputs "third". Do not change or remove this line.
		printThird.run();

	}
}
