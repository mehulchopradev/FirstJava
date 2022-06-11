import com.globalpayex.college.entities.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContainsElement {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("mehul", 'm', 10, 90),
                new Student("jane", 'f', 13, 78),
                new Student("john", 'm', 17, 100),
                new Student("rock", 'm', 11, 78)
        );

        System.out.println("Enter roll number of student you want to search: ");
        Scanner scanner = new Scanner(System.in);
        int roll = scanner.nextInt();

        boolean isFound = students.contains(new Student("NA", 'm', roll, 0));
        System.out.println(isFound ? "Student found": "Student not found");

        /* boolean isPresent = false;
        for(Student student: students) {
            if (student.roll == roll) {
                isPresent = true;
                System.out.println(student.getDetails());
                break;
            }
        }

        if (!isPresent) {
            System.out.println("Student not found");
        } */
    }
}
