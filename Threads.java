class Zed {

}

class Helloo implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HellooB implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Runnable h1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable h2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // h2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(h1.getPriority());

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        // h1.show();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        // h2.show();
    }
}
