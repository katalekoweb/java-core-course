

class A {
    public A () {
        System.out.println("In A");
    }

    public A (int n) {
        System.out.println("In A int");
    }
}

class B extends A {
    public B () {
        super();
        System.out.println("In B");
    }

    public B (int n) {
        //super(10);
        this();
        System.out.println("In B int");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
