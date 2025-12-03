final class Calc1 {

    public void show() {
        System.out.println("In Calc Show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void by() {
        System.out.println("By Kata");
    }

}

// class AdvanCalc extends Calc1 {
//     public void by() {
//         System.out.println("By John");
//     }
// }

public class Final {
    public static void main(String[] args) {
        final int num = 8;
        // num = 9;
        System.out.println(num);

        Calc1 calc1 = new Calc1();
        calc1.show();
    }
}
