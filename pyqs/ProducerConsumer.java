import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    static private Queue<Integer> queue;
    private int capacity;

    public ProducerConsumer(int cap) {
        capacity = cap;
        queue = new LinkedList<>();
    }

    public boolean producer(int item) {
        synchronized (queue) {
            while (queue.size() == capacity) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print(Thread.currentThread().getName() + " Producing: ");
            queue.add(item);
            queue.notify();
            return true;
        }
    }

    public int consumer() {
        synchronized (queue) {
            while (queue.size() == 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print(Thread.currentThread().getName() + " Producing: ");
            int cons = queue.poll();
            queue.notify();
            return cons;
        }
    }

    public static void main(String[] args) {
        ProducerConsumer ob = new ProducerConsumer(6);

        new Thread(() -> {
            while (true) {
                System.out.println(ob.producer(100));
            }
        }, "Producer").start();

        new Thread(() -> {
            while (true) {
                System.out.println(ob.consumer());
            }
        }, "Consumer").start();
    }
}
