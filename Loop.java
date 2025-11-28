public class Loop {
    public static void main(String[] args) {
        // repeat this statement 4 times
        // loops - while, do while, for

        // while
        // int i = 5;
        // while (i <= 4) {
        //     System.out.println("Hi " + i);

        //     int j = 1;
        //     while (j <= 3) {
        //         System.out.println("Hello");
        //         j++;
        //     }
            
        //     System.out.println("__________________________");

        //     i++;
        // }

        // do while
        // do {
        //     System.out.println("Hello!");
        //     i++;
        // } while(i <= 4);

        // for
        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY " + i);

            for (int j = 1; j<=9; j++) {
                System.out.println("   " + (j+8) + " - " + (j+9));
            }
        }

        // System.out.println("Bye " + i);
    }
}
