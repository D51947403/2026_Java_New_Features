package mainaha.java7.features;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// Step 1: Define a class that extends RecursiveTask
class SumTask extends RecursiveTask<Long> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int THRESHOLD = 1000; // Small enough to process sequentially
    private final int[] data;
    private final int start;
    private final int end;

    public SumTask(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;

        // Base case: If the workload is small enough, compute sequentially
        if (length <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
            return sum;
        }

        // Fork phase: Split the task in half
        int midpoint = start + length / 2;
        SumTask leftTask = new SumTask(data, start, midpoint);
        SumTask rightTask = new SumTask(data, midpoint, end);

        // Run the left subtask asynchronously
        leftTask.fork();

        // Compute the right subtask synchronously in the current thread
        long rightResult = rightTask.compute();

        // Join phase: Wait for the left subtask result and combine it
        long leftResult = leftTask.join();

        return leftResult + rightResult;
    }
}

// Step 2: Set up the ForkJoinPool and invoke the task
public class ForkJoinExample {
    public static void main(String[] args) {
        // Initialize an array with 10,000 elements
        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // 1 to 10,000
        }

        // Create the managed pool of threads
        ForkJoinPool pool = new ForkJoinPool();

        // Create the root task
        SumTask rootTask = new SumTask(numbers, 0, numbers.length);

        // Submit the task to the pool and get the final result
        long totalSum = pool.invoke(rootTask);

        System.out.println("The total sum is: " + totalSum);
    }
}



