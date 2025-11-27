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
        int num1 = 1_000_000_000;

        // literals
        int num2 = 0b101; // binary
        int num3 = 0x75; // hexadecimal

        // float
        double num4 = 12e10;

        // boolean
        boolean isJavaFun = true;
        char c = 'a';
        c++;
        System.out.println(c);
    }

}
