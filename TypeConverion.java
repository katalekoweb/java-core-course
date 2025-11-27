public class TypeConverion {
    public static void main(String[] args) {
        byte b = 125;
        int a = 256;

        // b = a; // Compile time error: incompatible types: possible lossy conversion from int to byte
        b = (byte)a; // Casting - explicit converting
        a = b; // No error: byte can be converted to int - implicit converting
        int k = a;

        float f = 10.5f;
        int i = (int)f; // Casting - explicit converting

        // type promotion
        byte x = 10;
        byte y = 20;
        int result = x + y; // byte values are promoted to int before arithmetic operation

        System.out.println(i);
    }
}
