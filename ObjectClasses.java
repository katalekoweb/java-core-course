class Laptop1 {
    String model;
    int price;

    public String toString () {
        return model + " : " + price;
    }
}

public class ObjectClasses {
    public static void main(String[] args) {
        Laptop1 lap1 = new Laptop1();
        lap1.model = "Lenovo Yoga";
        lap1.price = 1000;

        Laptop1 lap2 = new Laptop1();
        lap2.model = "Lenovo Yoga Edited";
        lap2.price = 900;

        boolean result = lap1.equals(lap2);
        System.out.println(result);
    }
}
