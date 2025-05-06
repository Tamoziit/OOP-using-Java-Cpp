//package java.threads;

class Coffee extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("I like coffee...");
                sleep(500); // sleep throws InterruptedException
            }
        } catch (InterruptedException e) {
            return; // end this thread
        }
    }
}

class Tea extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("I like tea...");
                sleep(100); // sleep throws InterruptedException
            }
        } catch (InterruptedException e) {
            return; // end this thread
        }
    }
}

public class unrelatedThreads {
    public static void main(String[] args) {
        Coffee t1 = new Coffee();
        t1.start();
        new Tea().start(); // anonymous thread
    }
}
