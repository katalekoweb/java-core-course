package grukta;

// the records are used to get data
record Alien2 (int age, String name) implements Cloneable {

    /*
    public Alien2 () {
        this(0, "");
    }

    // canonical construtor
    public Alien2 (int age, String name) {
        if (age == 0) {
            throw new IllegalArgumentException("id cannot be zero");
        }

        this.age = age;
        this.name = name;
    }
     */

    // canonical construtor
    public Alien2 {
        if (age == 0) {
            throw new IllegalArgumentException("id cannot be zero");
        }
    }


}


public class Project {
    public static void main(String[] args) {
        Alien2 a1 = new Alien2(1, "Navin");
        Alien2 a2 = new Alien2(10, "Navin");
        // Alien2 a3 = new Alien2();

        // System.out.println(a1.getName());
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.name());
    }
}
