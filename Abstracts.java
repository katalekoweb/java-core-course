abstract class Car {
    public abstract void drive ();
    public abstract void fly ();

    public void playMusic () {
        System.out.println("Play music");
    }
}

class WagnoR extends Car {
    public void drive () {
        System.out.println("Driving...");
    }

    public void fly () {
        System.out.println("Flying...");
    }
}

public class Abstracts {
    public static void main(String[] args) {
        Car car = new WagnoR(); // you cannot create an object of abstract class
        car.drive();
        car.playMusic();
        car.fly();
    }
}
