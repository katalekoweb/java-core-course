public class Hello {

    // javac is used to compile the Java program javac Hello.java
    // java is used to run the compiled Java program java Hello

    // Variable is a box where we store data
    // Java is strongly typed language, so we need to declare the type of variable before using it
    // Java is case sensitive language
    // Data types: int, float, double, char, boolean, String, byte, short, long, void
    // int: whole numbers
    // float: decimal numbers (single precision)
    // double: decimal numbers (double precision)
    // char: single character
    // boolean: true or false
    // String: sequence of characters
    // Primitive data types: int, float, double, char, boolean
    // Non-primitive data types: String, Arrays, Classes, Interfaces

    // int - 4 bytes
    // float - 4 bytes
    // double - 8 bytes
    // char - 2 bytes
    // boolean - 1 bit
    // short - 2 bytes
    // byte - 1 byte
    // long - 8 bytes

    public static void main (String a[]) {
        int num1 = 0;
        byte by = 127;
        short sh = 12345;
        long lg = 5854l;
        float fl = 5.67f;
        double db = 19.9;
        char c = 'c';
        String name = "John Doe";

        System.out.println(num1);
    }

}
