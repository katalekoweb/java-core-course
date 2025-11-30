public class Arrays {
    public static void main(String[] args) {
        int nums[] = { 5, 6, 7 };
        int nums2[] = new int[8];
        nums[1] = 9;
        nums2[0] = 15;
        nums2[1] = 7;
        nums2[2] = 3;
        nums2[3] = 9;

        // for (int i = 0; i<nums2.length; i++) {
        // System.out.println(nums2[i]);
        // }

        // multidimensaional array
        int nums3[][] = new int[3][4];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         nums3[i][j] = (int) (Math.random() * 100);
        //     }
        // }

        // for (int i = 0; i < 3;i++) {
        // for (int j = 0; j<4; j++) {
        // System.out.print(nums3[i][j] + " ");
        // }
        // System.out.println();
        // }

        // enhanced for loop
        // for (int n[] : nums3) {
        //     for (int m : n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        int nums4[][] = new int[3][]; // jagged array
        nums4[0] = new int[3];
        nums4[1] = new int[4];
        nums4[2] = new int[1];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums4[i].length; j++) {
                System.out.print(nums3[i][j] + " ");
            }
        }

    }
}
