
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // System.out.println("Enter a number");

        // int num = System.in.read(); // resturn ASCII value

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // Scanner sc = new Scanner(System.in);

        // int num = Integer.parseInt(bf.readLine());
        // int num = sc.nextInt();

        // System.out.println(num);

        // bf.close();

        int i = 0;
        int j = 0;
        int num = 0;

        // try with resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            num = Integer.parseInt(br.readLine());
            System.out.println("Num: " + num);
            br.close();

            j = 18/i;
        } 
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            System.out.println("Bye");
        }
    }
}
