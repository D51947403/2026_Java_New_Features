# New Features in Java 7

## Language changes –
- Strings in Switch statements
- Try with resources statements
- Improved type inference for generic instance creation – “Diamond”
- Simplified varargs method invocation
- Better integral literals
- Improved exception handling (multi-catch)

## Concurrency & Collection utilities
- A lightweight fork/join framework
- flexible and reusable synchronization barriers
- Transfer queues
- concurrent linked double-ended queues
- thread-local pseudo-random number generators

## New I/O APIs for the Java Platform
- New file I/O library to enhance platform independence and add support for metadata and symbolic links
- The new packages are java.nio.file and java.nio.file.attribute

## Update the XML stack
- Upgrade the components of the XML stack to the most recent stable versions: JAXP 1.4, JAXB 2.2a, and JAX-WS 2.2

## JVM and Performance Changes
- G1 Garbage Collector: Introduced the Garbage-First collector as an experimental feature for large heaps.
- Dynamic Language Support: Added the invokedynamic bytecode instruction and the java.lang.invoke package to support dynamically typed languages on the JVM

### Fork/Join framework
The Java Fork/Join framework, introduced in Java 7, is designed to speed up parallel processing by utilizing all available processor cores. It breaks a large task down into smaller, manageable subtasks (Forking) and then combines their results (Joining). This approach follows a parallel divide-and-conquer strategy.
Core Concepts
- Fork: Asynchronously splits a large task into smaller independent subtasks that run concurrently.
- Join: Blocks and waits until the subtask finishes execution, then retrieves its result.
- Work-Stealing Algorithm: Idle threads in the pool actively "steal" tasks from the queues of busy threads to maximize CPU efficiency

### TransferQueue 
In Java, a TransferQueue is a specialized type of BlockingQueue where a producer thread can explicitly wait for a consumer thread to receive its element. This provides a form of message-passing back-pressure.
The primary implementation of this interface is LinkedTransferQueue.

Core Handoff Methods

- transfer(E e): Transfers the element to a waiting consumer immediately. 
  If no consumer is waiting, the producer thread blocks until a consumer invokes take() or poll().
- tryTransfer(E e): Attempts to hand off the element immediately without blocking.
  It returns true if a consumer was waiting, or false if it would have to block.
- put(E e) / add(E e): Standard queue operations inherited from BlockingQueue. 
  These insert the element into the queue without waiting for a consumer to physically pull it.
- https://www.geeksforgeeks.org/java/transferqueue-interface-in-java/

### Concurrent Linked double-ended queue
In Java, a concurrent linked double-ended queue is implemented by the java.util.concurrent.ConcurrentLinkedDeque class. 
It is an unbounded, thread-safe, and lock-free implementation based on linked nodes, which allows multiple threads to safely insert,
remove, and access elements from both ends concurrently without blocking.

Key Characteristics

- Lock-Free Mechanics: It relies on high-performance, non-blocking algorithms using Compare-And-Swap (CAS) instructions.
- No Null Elements: It strictly forbids inserting null values.
- Linear Time Size: The size() method is not a constant-time operation (O(1)). 
  It requires traversing the entire deque to count elements because the size can dynamically change across threads.
- https://www.geeksforgeeks.org/java/concurrentlinkeddeque-in-java-with-examples/

### Reference 
- https://www.oracle.com/java/technologies/javase/jdk7-relnotes.html

