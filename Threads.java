class Zed {
    
}

class Helloo extends Thread {
    public void run () {
        for (int i = 0; i<=100;i++) {
            System.out.println("Hi");
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HellooB extends Thread {
    public void run () {
        for (int i = 0; i<=100;i++) {
            System.out.println("Hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Helloo h1 = new Helloo();
        HellooB h2 = new HellooB();

        h2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(h1.getPriority());

        h1.start();
        // h1.show();

        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        h2.start();
        // h2.show();
    }
}
