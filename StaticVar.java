class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    // static {
    //     name = "Phone";
    //     System.out.println("In static block");
    // }

    // public Mobile () {
    //     brand = "";
    //     price = 200;
    //     // name = "Phone";
    //     System.out.println("In construtor");
    // }

    public void show () {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1 (Mobile m) {
        System.out.println(m.brand + " : " + m.price + " : " + name);
        System.out.println("In static method");
    }
}

public class StaticVar {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("Mobile");
        
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        // m1.name = "Smartphone";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1700;
        // m2.name = "Smartphone";

        Mobile.name = "Cell";

        // m1.show();
        // m2.show();

        Mobile.show1(m1);
    }
}
