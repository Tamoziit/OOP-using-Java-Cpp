public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside " + Thread.currentThread().getName() + " " + i);
        }

        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().threadId());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread is starting");

        Thread thread2 = new Thread(new Thread2(), "thread2"); // instantiating Thread2 class with Java.Thread class by passing in the Thread2 class & threadname as params to Runnable Interface constructor
        thread2.start();

        System.out.println("Main Thread is exiting");
    }
}
