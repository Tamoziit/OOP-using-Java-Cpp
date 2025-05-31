/*
 * Simulating a Deadlock Situation

 * Thread1 locks 'lock1' & waits for 'lock2' to enter Critical Section
 * Thread2 locks 'lock2' & waits for 'lock1' to enter Critical Section
 */

public class Deadlock {
    public static void main(String[] args) {
        System.out.println("Main Thread Starting");

        String lock1 = "lock1"; // String class object acts as MUTEX LOCK
        String lock2 = "lock2";

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Lock Acquired by " + Thread.currentThread().getName());
                }
            }
        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Lock Acquired by " + Thread.currentThread().getName());
                }
            }
        }, "Thread2");

        thread1.start();
        thread2.start();

        System.out.println("Main Thread Exiting");
    }
}
