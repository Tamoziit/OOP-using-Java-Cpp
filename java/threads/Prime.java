class TestRange extends Thread {
    static long possPrime;
    long from, to;

    TestRange(int argFrom, long argPossPrime) {
        possPrime = argPossPrime;
        if (argFrom == 0)
            from = 2;
        else
            from = argFrom;

        to = argFrom + 99;
    }

    public void run() {
        for (long i = from; i <= to && i < possPrime; i++) {
            if (possPrime % i == 0) {
                System.out.println("factor " + i + " found by  thread " + getName());
                return;
            }
            Thread.yield();
        }
    }
}

public class Prime {
    public static void main(String[] s) {
        long possPrime = Long.parseLong(s[0]);
        int centuries = (int) (possPrime / 100) + 1;
        for (int i = 0; i < centuries; i++) {
            new TestRange(i * 100, possPrime).start();
        }
    }
}
