public class AssignmentOperator {
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 5;

        // int result = num1 + num2;
        // int result = num1 - num2;
        // int result = num1 * num2;
        // int result = num1 / num2;
        int result = num1 % num2;

        // increment
        num1 = num1 + 1;
        ++num1;
        num1++;

        result = ++num1;
        
        System.out.println(result);
    }
}
