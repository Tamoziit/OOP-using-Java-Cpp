/* 
 * Unsynchronized multithread Stack implementation --> will through exception if pop() thread decrements stackTop to -1 (for curr stackTop = 0), after push() thread had completed checking stackTop validity & was sleeping before pushing.
*/

public class Stack {
    private int[] array;
    private int stackTop;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public boolean push(int element) {
        if (isFull())
            return false;
        ++stackTop;

        try {
            Thread.sleep(1000); // sleeping Stack thread before pushing the ele
        } catch (Exception e) {
        }

        array[stackTop] = element;
        return true;
    }

    public int pop() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;

        try {
            Thread.sleep(1000); // sleeping Stack thread before popping the ele
        } catch (Exception e) {
        }

        stackTop--;
        return obj;
    }

    public static void main(String[] args) {
        System.out.println("Main Thread Starting");
        Stack stack = new Stack(5);

        // Lambda func. method to override run() method of Thread class through its
        // instance
        new Thread(() -> { // Thread for pushing
            int counter = 0;
            while (++counter < 10)
                System.out.println("Pushed:" + stack.push(100));
        }, "Pusher").start();

        new Thread(() -> { // Thread for popping
            int counter = 0;
            while (++counter < 10)
                System.out.println("Popped:" + stack.pop());
        }, "Popper").start();

        System.out.println("Main Thread Exiting");
    }
}
