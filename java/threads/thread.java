public class thread extends Thread {
    // setting up thread name inside constructor
    public thread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside " + Thread.currentThread().getName() + " " + i); // curentThread().getName() --> returns name of current thread
        }

        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().threadId());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread is starting");

        Thread thread1 = new thread("Lol Thread"); // instantiating thread class with Java.Thread class
        //thread1.setDaemon(true); /* Daemon Thread - If main thread stops, this might stop as well without its execution being complete */
        thread1.start(); // run the thread & execute the run() func. inside it

        System.out.println("Main Thread is exiting");
    }
}