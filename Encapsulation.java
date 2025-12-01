class Human {
    private int age = 30; // accessible only in the same class
    private String name = "Kata";

    public int getAge ()
    {
        return age;
    }

    public void setAge (int a) {
        age = a;
    }

    public String getName () {
        return name;
    }

    public void setName (String n) {
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(31);
        // h.name = "Katasboy";
        // h.age = 30;

        System.out.println(h.getName());
        System.out.println(h.getAge());
    }
}
