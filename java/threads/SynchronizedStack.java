/* 
 * Synchronized multithread Stack implementation --> with critical section segmentation & Mutex locking
 * When push() is in its Critical section, pop() cannot pop an element and decrement stackTop
 * When pop() is in its Critical section, push() cannot push an element and increment stackTop
*/

public class SynchronizedStack {
    private int[] array;
    private int stackTop;
    Object lock;

    public SynchronizedStack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object(); // any object in Java [lyk: new Integer(), new String() etc. or a custom object
                             // like done here -> new Object()], can be used as MUTEX LOCK to lock the
                             // critical section
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public boolean push(int element) {
        synchronized (lock) { // 'synchronized' block defines the critical section of a thread which is lock by an Object (here "lock")
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
    }

    public int pop() {
        synchronized (lock) { // Critical section of pop thread
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
    }

    public static void main(String[] args) {
        System.out.println("Main Thread Starting");
        SynchronizedStack stack = new SynchronizedStack(5);

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


/*
 * NB: We can declare methods as synchronized as well  ->
    public synchronized boolean push () --> here the JVM uses the current object as MUTEX lock

    This is equivalent to:
    public boolean push () {
        synchronized(this) {
            ....
        }
    }

 * For static synchronized methods JVM use CurrClass.class as MUTEX
    eg: For a static method inside class "Stack"
    public static synchronized boolean push () --> equivalent to:

    public static boolean push () {
        synchronized(Stack.class) {
            ....
        }
    }
 */