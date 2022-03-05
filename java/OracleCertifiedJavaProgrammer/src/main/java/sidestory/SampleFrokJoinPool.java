package sidestory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;

import java.util.concurrent.RecursiveTask;
import java.util.function.BiFunction;

// 
public class SampleFrokJoinPool {
	public static void main(String[] a) throws InterruptedException, ExecutionException {
		var n = 4;
		var workload = 1000000;
		executeParallel2("02", n, workload);
		executeParallel("01", n, workload);

		executeParallel("01", n, workload);
		executeParallel2("02", n, workload);

		executeParallel2("02", n, workload);
		executeParallel("01", n, workload);

		executeParallel("01", n, workload);
		executeParallel2("02", n, workload);


		
	}

	private static void execute(String name, int n, long workload, BiFunction<Executor, Long, Long> func) {
		long l1 = System.currentTimeMillis();
		ForkJoinPool forkJoinPool = new ForkJoinPool(n);
		var result = func.apply(forkJoinPool, workload);
		var l2 = System.currentTimeMillis();
		System.out.printf("name:%s %d sec:%f%n", name, result, (l2 - l1) / 1000.);
	}
	
	private static void executeParallel(String name, int n, long workload) {
		long l1 = System.currentTimeMillis();
		ForkJoinPool forkJoinPool = new ForkJoinPool(n);
		CreateFrokJoinPool createFrokJoinPool = new CreateFrokJoinPool(workload);
		var result = forkJoinPool.invoke(createFrokJoinPool);
		var l2 = System.currentTimeMillis();
		System.out.printf("name:%s %d sec:%f%n", name, result, (l2 - l1) / 1000.);
	}

	private static void executeParallel2(String name, int n, long workload)
			throws InterruptedException, ExecutionException {
		long l1 = System.currentTimeMillis();
		ForkJoinPool forkJoinPool = new ForkJoinPool(n);
		CreateFrokJoinPool2 createFrokJoinPool = new CreateFrokJoinPool2(workload);
		forkJoinPool.execute(createFrokJoinPool);
		var result = createFrokJoinPool.get();
		var l2 = System.currentTimeMillis();
		System.out.printf("name:%s %d sec:%f%n", name, result, (l2 - l1) / 1000.);
	}

	@SuppressWarnings("serial")
	private static class CreateFrokJoinPool extends RecursiveTask<Long> {
		private long workload = 0;

		public CreateFrokJoinPool(long workload) {
			this.workload = workload;
		}

		@Override
		protected Long compute() {

			if (workload > 16) {

				List<CreateFrokJoinPool> subTasks = new ArrayList<>();
				subTasks.addAll(createSubTasks());
				for (CreateFrokJoinPool subTaskAction : subTasks) {
					subTaskAction.fork();
				}

				long result = 0;
				for (CreateFrokJoinPool subTask : subTasks) {
					result += subTask.join();
				}
				return result;
			} else {

				return workload * 3;
			}
		}

		private List<CreateFrokJoinPool> createSubTasks() {
			List<CreateFrokJoinPool> subTasks = new ArrayList<>();
			CreateFrokJoinPool task_01 = new CreateFrokJoinPool(this.workload / 2);
			CreateFrokJoinPool task_02 = new CreateFrokJoinPool(this.workload / 2);

			subTasks.add(task_01);
			subTasks.add(task_02);

			return subTasks;
		}
	}

	@SuppressWarnings("serial")
	private static class CreateFrokJoinPool2 extends RecursiveTask<Long> {
		private long workload = 0;

		public CreateFrokJoinPool2(long workload) {
			this.workload = workload;
		}

		@Override
		protected Long compute() {

			if (workload > 16) {
				CreateFrokJoinPool2 c1 = new CreateFrokJoinPool2(this.workload / 2);
				c1.fork();
				CreateFrokJoinPool2 c2 = new CreateFrokJoinPool2(this.workload / 2);
				return c2.compute() + c1.join();
			}

			return workload * 3;

		}

	}

}