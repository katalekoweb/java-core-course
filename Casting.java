class A1 {
    public void show1() {
        System.out.println("In A show");
    }
}

class B1 extends A1 {
    public void show2() {
        System.out.println("In B show");
    }
}

public class Casting {
    public static void main(String[] args) {
        A1 a1 = (A1) new B1();
        a1.show1();

        B1 obj2 = (B1) a1;
        obj2.show2();
    }
}
