package lock;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test {

	public static void main(String[] args) {

		final X x = new X();

		final Runnable r = () -> {
			while (true) {

				try {
					x.get("aaa", 2000);
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};

		final Runnable r1 = () -> {
			while (true) {

				try {
					x.get("bbb", 100);
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};

		final Runnable r3 = () -> {
			while (true) {

				try {
					x.put("ccc", new Data(), 1300);
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		};
		new Thread(r, "th1").start();
		new Thread(r1, "th2").start();
		new Thread(r3, "th3").start();

	}

	static class Data {
	}

	static class X {
		private final Map<String, Data> m = new TreeMap<>();
		private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
		private final Lock r = rwl.readLock();
		private final Lock w = rwl.writeLock();

		public Data get(String key, int sleeptime) {
			r.lock();
			try {

				System.out.println(key + " " + sleeptime);
				sleep(sleeptime);

				return m.get(key);
			} finally {
				r.unlock();
			}
		}

		public Data get(String key) {
			r.lock();
			try {
				return m.get(key);
			} finally {
				r.unlock();
			}
		}

		public String[] allKeys() {
			r.lock();
			try {
				return (String[]) m.keySet().toArray();
			} finally {
				r.unlock();
			}
		}

		public Data put(String key, Data value) {
			w.lock();
			try {
				return m.put(key, value);
			} finally {
				w.unlock();
			}
		}

		public Data put(String key, Data value, int sleeptime) {
			w.lock();
			try {
				System.out.println("*** write " + key + " " + sleeptime);
				sleep(sleeptime);
				return m.put(key, value);
			} finally {
				w.unlock();
			}
		}

		public void clear() {
			w.lock();
			try {
				m.clear();
			} finally {
				w.unlock();
			}
		}
	}

	static void sleep(long millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
