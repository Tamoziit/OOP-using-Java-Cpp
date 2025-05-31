import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    static private Queue<Integer> queue; // object of Queue class
    private int capacity;

    public ProducerConsumer(int cap) {
        queue = new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int item) { // for producer thread
        synchronized (queue) { // Queue queue() object used as MUTEX
            while (queue.size() == capacity) {
                try {
                    queue.wait(); // wait till queue is not full
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print(Thread.currentThread().getName() + " Producing: ");
            queue.add(item);
            queue.notifyAll(); // notify all threads that queue is not empty
            return true;
        }
    }

    public int remove() { // for consumer thread
        synchronized (queue) {
            while (queue.size() == 0) {
                try {
                    queue.wait(); // wait till queue is not empty
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print(Thread.currentThread().getName() + " Consuming: ");
            int dequeued = queue.poll(); // dequeueing
            queue.notifyAll(); // notify all threads that queue is not full
            return dequeued;
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Thread Starting");
        ProducerConsumer ob = new ProducerConsumer(10);

        // Producer Threads
        new Thread(() -> {
            while (true) {
                System.out.println(ob.add(100) + "(size = " + queue.size() + ")");
            }
        }, "Producer 1").start();
        new Thread(() -> {
            while (true) {
                System.out.println(ob.add(100) + "(size = " + queue.size() + ")");
            }
        }, "Producer 2").start();

        // Consumer Threads
        new Thread(() -> {
            while (true) {
                System.out.println(ob.remove() + "(size = " + queue.size() + ")");
            }
        }, "Consumer 1").start();
        new Thread(() -> {
            while (true) {
                System.out.println(ob.remove() + "(size = " + queue.size() + ")");
            }
        }, "Consumer 2").start();

        System.out.println("Main Thread Exiting");
    }
}
