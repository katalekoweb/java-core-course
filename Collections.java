
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Collections {
    public static void main(String[] args) {
        // Map
        // HiddenList

        // Collections
        // List, Queue, Set

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);

        // for (int n : nums) {
        //     System.out.println(n);
        // }

        // System.out.println(nums(1));
        // System.out.println(nums.get(1));

        // set dont allow repeateds values
        Set<Integer> nums2 = new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(21);

        // for (int n: nums) {
        //     System.out.println(n);
        // }

        // System.out.println(nums);

        Iterator<Integer> values = nums.iterator();

        // while (values.hasNext()) {
        //     System.out.println();
        // }

        // Map doesnt extends collection like List and Set
        // The key is unique
        Map<String, Integer> students = new Hashtable<>(); // using HashTable to work ith threads
        students.put("Kataleko", 30);
        students.put("Beliza", 29);
        students.put("Floripa", 5);
        students.put("Alana", 2);

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

        // students

        for (String name: students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}