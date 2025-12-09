
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student2 implements Comparable<Student2> {
    int age;
    String name;

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public Student2() {
        this.age = 0;
        this.name = "";
    }

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student2 that) {
        return this.age > that.age ? 1 : -1;
    }

}

public class Sorting {
    public static void main(String[] args) {

        // Comparator<Student2> com = new Comparator<Student2>() {
        //     @Override
        //     public int compare (Student2 i, Student2 j) {
        //         return i.age > j.age ? 1 : -1;
        //     }
        // };

        List<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(6);
        nums.add(2);
        nums.add(8);
        nums.add(0);
        nums.add(29);
        nums.add(9);
        nums.add(17);

        Collections.sort(nums);
        // System.out.println(nums);

        List<Student2> students2 = new ArrayList<>();

        students2.add(new Student2(30, "JFK"));
        students2.add(new Student2(29, "Bel"));
        students2.add(new Student2(9, "Flor"));
        students2.add(new Student2(2, "Alana"));
        Collections.sort(students2);

        // for (Student2 s: students2) {
        //     System.out.println(s);
        // }

        // int sum = 0;
        // for (int n: nums3) {
        //     if (n%2 == 0) {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }

        // nums3.forEach(n -> System.out.println(n));
        // nums3.forEach(action);

        List<Integer> nums3 = Arrays.asList(4,5,6,7,3,8);

        Function<Integer, Integer> fun = new Function<Integer,Integer>() {
            public Integer apply (Integer n) {
                return n%2;
            }
        };

        // Stream<Integer> s1 = nums3.stream();
        // Stream<Integer> evenNumbers = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = evenNumbers.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        Predicate<Integer> p = n -> n%2==0;

        int result = nums3.stream()
                    .filter(p)
                    .map(n -> n*2)
                    .reduce(0, (c,e) -> c+e);

        Stream<Integer> sortedValues = nums3.stream()
                    .filter(p)
                    .sorted();

        System.out.println(result);
        System.out.println(sortedValues);

        // nums3.forEach(consumer);

    }
}
