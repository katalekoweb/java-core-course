class Counter {
    int count;

    public synchronized void increment () {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable h1 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable h2 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
