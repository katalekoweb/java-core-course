public class Arrays {
    public static void main(String[] args) {
        int nums[] = {5,6,7};
        int nums2[] = new int[8];
        nums[1] = 9;
        nums2[0] = 15;
        nums2[1] = 7;
        nums2[2] = 3;
        nums2[3] = 9;

        for (int i = 0; i<nums2.length; i++) {
            System.out.println(nums2[i]);
        }

    }
}
