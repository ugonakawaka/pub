package aaa;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class A001_Fibonacci_ForkJoinPool_RecursiveTask {

	@SuppressWarnings("serial")
	static class Fibonacci extends RecursiveTask<Integer> {
		final int n;

		Fibonacci(int n) {
			this.n = n;
		}

		protected Integer compute() {
			System.out.printf("%s %d%n", Thread.currentThread().getName(), this.n);

			if (n <= 1)
				return n;
			Fibonacci f1 = new Fibonacci(n - 1);
			f1.fork();
			Fibonacci f2 = new Fibonacci(n - 2);
			return f2.compute() + f1.join();
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ForkJoinPool forkJoinPool = new ForkJoinPool(3);
		Fibonacci fibonacci = new Fibonacci(9);

		forkJoinPool.execute(fibonacci);
		System.out.println(fibonacci.get());

	}
	
	// ================
	
	

}
