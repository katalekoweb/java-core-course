class Human {
    private int age = 30; // accessible only in the same class
    private String name = "Kataleko Segundo ";

    public Human () {
        age = 12;
        name = "John";
        System.out.println("In constrtuctor...");
    }

    public Human (String name) {
        this.name = name;
    }

    public Human (String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("In constrtuctor...");
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int a) {
        this.age = a;
    }

    public String getName () {
        return name;
    }

    public void setName (String n) {
        this.name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human("Julian Kataleko", 30);
        Human h2 = new Human("Julian 2 Kataleko", 35);
        // h.setAge(31);
        // h.setName("Katasboy");
        // h.age = 30;

        System.out.println(h.getName() + " " + h.getAge());
        System.out.println(h2.getName() + " " + h2.getAge());
    }
}
