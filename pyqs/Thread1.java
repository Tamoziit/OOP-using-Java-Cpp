class One implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (3 * i));
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Two implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (4 * i));
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Three implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (5 * i));
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        System.out.println("Main Thread Starting");

        Thread t1 = new Thread(new One(), "one");
        Thread t2 = new Thread(new Two(), "two");
        Thread t3 = new Thread(new Three(), "three");

        t1.start();
        t2.start();
        t3.start();

        // Joining threads
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Exiting");
    }
}
