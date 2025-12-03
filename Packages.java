import tools.A;

class Fooo extends A {

}

public class Packages {
    public static void main(String[] args) {
        // Calc obj = new Calc();
        Fooo obj = new Fooo();
        System.out.println(obj.marks);

        // public can be accessed anywhere

        // private  cab be used in the same class

        // protected can be accessed in the same class and childs

        // default can be accessed in the same package
    }
}
