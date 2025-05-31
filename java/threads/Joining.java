/*
 * Preventing Orphan & Zombie threads with thread.join() method
 * 
 * Thread Priority
    - Thread Priority is an advisory to JVM to execute a thread according to its priority. But it is just an advisory, not a rule --> i.e., it just acts as a 'HINT' for the JVM to perform a set execution priority of multithread execution, but JVM is not compelled to follow that order always
    - Threads by default inherit the priority of its Parent.
*/

public class Joining {
    public static void main(String[] args) {
        System.out.println("Main Thread Starting");

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread());
        }, "Test Thread");

        thread.start();

        // Thread priority
        thread.setPriority(1); // setting Thread priority
        System.out.println(thread.getPriority());

        try {
            thread.join(); // blocks the main thread from executing further (or terminating) before the
                           // child thread ends execution of its run() method
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Exiting");
    }
}
