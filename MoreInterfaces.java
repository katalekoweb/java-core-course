
@FunctionalInterface
interface X {
    // Single Absctract Method
    void show(int i);
}

class Y implements X {
    public void show(int i) {
        System.out.println("In show");
    }
}

public class MoreInterfaces {
    public static void main(String[] args) {
        // Types of interfaces
        // Normal, Functional/SAM, Marker
        // Sam only has one methos
        // Marker doesnt have interface

        // X x = new X() { // anonymous class
        // @Override
        // public void show () {
        // System.out.println("In show...");
        // }
        // };

        // X x = (i) -> { // Lambda
        //     System.out.println("In show..." + i);
        // };

        X x = i -> System.out.println("In show..." + i);
        x.show(5);

        // Lambda Expressions

    }
}
