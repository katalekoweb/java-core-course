class Calculator {

    int num = 5;

    // a class can have methods and properties
    public int add (int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        System.out.println(num);
        return n1+n2;
    }

    public double add(double n1, int n2) {
        return n1+n2;
    }
}

class Computer {

    public void playMusic () {
        System.out.println("Music Playing");
    }

    public String getMeAPen (int cost) {
        if (cost >= 70) return "Pen";
        return "Nothing";
    }
}

public class Oop {
    public static void main(String[] args) {
        int num1 = 4, num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        // Calculator calculator = new Calculator();
        // int addResult = calculator.add(num1, num2);
        // System.out.println(addResult);

        // Computer obj = new Computer();
        // String str = obj.getMeAPen(25);
        // obj.playMusic();
        // System.out.println(str);

        Calculator obj = new Calculator();
        int r1 = obj.add(2, 4, 10);
        int r2 = obj.add(2, 4);
        double r3 = obj.add(12.9, 9);

        obj.num = 10;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(obj.num);
    }
}
