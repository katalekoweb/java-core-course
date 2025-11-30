

public class Foreach {
    public static void main(String[] args) {
        int nums2[] = new int[8];
        nums2[0] = 5;
        nums2[1] = 7;
        nums2[2] = 3;
        nums2[3] = 9;
        nums2[4] = 11;

        // for (int n : nums2) {
        //     System.out.println(n);
        // }

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

        // enhanced for loop
        for (Student s: students) {
            System.out.println("Name: " + s.name + "        Marks: " + s.marks);
        }
    }
}
