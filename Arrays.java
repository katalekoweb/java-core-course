class Student {
    int rollno;
    String name;
    int marks;
}

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

        // int nums4[][] = new int[3][]; // jagged array
        // nums4[0] = new int[3];
        // nums4[1] = new int[4];
        // nums4[2] = new int[1];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < nums4[i].length; j++) {
        //         System.out.print(nums3[i][j] + " ");
        //     }
        // }

        int nums5[] = new int[4]; 

        // collections

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navix";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Mark";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name + "      Marks: "+students[i].marks);
            System.out.println("++++++++++++++++++++++++++++++++++++");
        }
    }
}
