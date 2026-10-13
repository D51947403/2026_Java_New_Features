package mainaha.java7.features;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/***
 * java.util.concurrent.ThreadLocalRandom is a high-performance utility class introduced 
 * in Java 7 specifically designed to generate random numbers in multi-threaded environments. 
 * By providing a random number generator isolated to each thread, 
 * it drastically reduces contention and overhead compared to sharing a single java.util.Random instance
 */
public class ThreadLocalRandomDemo {

	public static void main(String[] args) {
		// Create a thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Submit 5 distinct tasks to the thread pool
		for (int i = 1; i <= 5; i++) {
			final int taskId = i;
			executor.submit(() -> {
				String threadName = Thread.currentThread().getName();

				// 1. Get the thread-safe random instance for the current thread
				ThreadLocalRandom random = ThreadLocalRandom.current();

				// 2. Generate different types of pseudo-random values
				int randomInt = random.nextInt(); // Unbounded integer
				int boundedInt = random.nextInt(1, 101); // Bounded integer between 1 (inclusive) and 101 (exclusive)
				double randomDouble = random.nextDouble(0.0, 1.0); // Bounded double
				boolean randomBoolean = random.nextBoolean(); // Random boolean

				// 3. Print results to observe independent generation per thread
				System.out.printf("[%s] Task %d -> Int: %d | Bound Int(1-100): %d | Double: %.4f | Boolean: %b%n",
						threadName, taskId, randomInt, boundedInt, randomDouble, randomBoolean);
			});
		}

		// Properly shut down the executor pool
		executor.shutdown();
		try {
			if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
				executor.shutdownNow();
			}
		} catch (InterruptedException e) {
			executor.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}
}
