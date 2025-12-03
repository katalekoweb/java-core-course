public class WarapperClasses {
    public static void main(String[] args) {
        // primitive vs objects
        // int -> Integer;
        // double -> Double

        int num = 7;
        Integer num1 = new Integer(8); // boxing
        int num2 = num1; // autoboxing
        int num4 = num1.intValue();

        String str = "11";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);

        System.out.println(num1);
    }
}
