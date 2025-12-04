class A2 {

    public void show () {
        System.out.println("In show");
    }

    // static class B {
    //     public void config () {
    //         System.out.println("In config");
    //     }
    // }
}

abstract class A4 {
    public abstract void show();
    public abstract void config();
}

// class B4 extends A4 {
//     public void show () {
//         System.out.println("In B show method");
//     }
// }

public class AnonymousClass {
    public static void main(String[] args) {
        A2 obj = new A2() {
            @Override
            public void show () {
                System.out.println("In new show!!");
            }
        };

        obj.show();

        // A2.B obj2 = obj.new B();
        // obj2.config();

        // when we need to implement the interface or the absctract only once
        A obj5 = new A() {
            public void show () {
                System.out.println("In show");
            }
        };
    }
}