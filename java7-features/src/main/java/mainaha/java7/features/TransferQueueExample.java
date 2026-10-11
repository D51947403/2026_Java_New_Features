package mainaha.java7.features;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {
    public static void main(String[] args) {
        // Create an unbounded TransferQueue
        TransferQueue<String> queue = new LinkedTransferQueue<>();

        // 1. Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("[Consumer] Sleeping for 2 seconds before taking an item...");
                Thread.sleep(2000);
                
                System.out.println("[Consumer] Ready to take an item.");
                String item = queue.take(); // This wakes up the waiting producer
                System.out.println("[Consumer] Successfully received: " + item);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // 2. Producer Thread
        Thread producer = new Thread(() -> {
            try {
                System.out.println("[Producer] Attempting to transfer 'Message A'...");
                long startTime = System.currentTimeMillis();
                
                // This blocks until the consumer thread calls take()
                queue.transfer("Message A"); 
                
                long duration = (System.currentTimeMillis() - startTime) / 1000;
                System.out.println("[Producer] 'Message A' received by consumer! (Blocked for " + duration + " seconds)");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start both threads
        consumer.start();
        producer.start();
    }
}
