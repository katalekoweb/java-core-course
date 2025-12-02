import Classes.VeryAdvCalc;

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc c = new VeryAdvCalc();
        int r1 = c.add(10, 9);
        int r2 = c.sub(10, 5);
        int r3 = c.multi(10, 5);
        double power = c.power(10, 3);

        System.out.println(r1 + " " + r2 + " " + r3 + " Power: " + power);
    }
}
