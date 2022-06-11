import com.globalpayex.college.entities.Student;

import java.util.*;

public class SearchStudent {

    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(10, new Student("mehul", 'm', 10, 90));
        map.put(13, new Student("jane", 'f', 13, 78));
        map.put(17, new Student("john", 'm', 17, 100));
        map.put(11, new Student("rock", 'm', 11, 78));

        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        Collection<Student> students = map.values();
        System.out.println(students);
        System.out.println(map.containsKey(13));

        Set<Map.Entry<Integer, Student>> entries = map.entrySet();
        for(Map.Entry<Integer, Student> entry : entries) {
            System.out.println(entry.getValue().name);
            System.out.println(entry.getKey());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter roll number to search: ");
        int roll = scanner.nextInt();

        Student student = map.get(roll);
        if (student != null) {
            System.out.println(student.getDetails());
        } else {
            System.out.println("Student not found");
        }

    }
}
