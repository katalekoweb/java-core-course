class C {
    public C() {
        System.out.println("Object created");
    }

    public void show () {
        System.out.println("In A show");
    }
}

public class NameConvention {
    public static void main (String args[]) {
        // Camel casing
        // class and interface - Calc, Runable
        // variable and method - marks, show()
        // constants - PIE, BRAND

        // showMyMarks()
        // age, DATA, MY_DATA, Human()

        // C obj; // reference
        // obj = new C(); // assign
        // obj.show();

        new C().show(); // anonymous objects
    }
}