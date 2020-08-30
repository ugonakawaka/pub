package z_grpc;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class TaskExecutorImpl implements TaskExecutor {

	final long period = 5 * 1000; // 3 sec.

	@Autowired
	ThreadPoolTaskScheduler poolTaskScheduler;

	final ConcurrentHashMap<String, ScheduledFuture<?>> map = new ConcurrentHashMap<String, ScheduledFuture<?>>();

	@Configuration
	@ComponentScan(basePackages = "org.baeldung.taskscheduler", basePackageClasses = { TaskExecutorImpl.class })
	public class ThreadPoolTaskSchedulerConfig {

		@Bean
		public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
			ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
			threadPoolTaskScheduler.setPoolSize(5);
			threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
			return threadPoolTaskScheduler;
		}
	}

	public class EchoRequestTask implements Runnable {

		String address;

		public EchoRequestTask(String address) {
			this.address = address;
		}

		@Override
		public void run() {

			System.out.println(" echo:[" + address + "]" + new Date());
		}

	}

	public void startEcho(String address) {

		synchronized (map) {
			if (map.containsKey(address)) {
				System.out.println("already scheduling " + address);
				return;
			}

			final int poolSize = poolTaskScheduler.getPoolSize();
			final int activeCount = poolTaskScheduler.getActiveCount();
			if (poolSize <= activeCount + 1) {
				poolTaskScheduler.setPoolSize(poolSize + 1);
			}

			final EchoRequestTask task = new EchoRequestTask(address);

			final ScheduledFuture<?> future = poolTaskScheduler.scheduleAtFixedRate(task, period);
			map.put(address, future);
		}

	}

	public void stopEcho(String address) {
		synchronized (map) {
			final ScheduledFuture<?> future = map.get(address);
			if (future == null) {
				System.out.println("not scheduled task " + address);
				return;
			}

			map.remove(address);
			System.out.println("*** stop echo");
			future.cancel(true);

		}
	}

}
