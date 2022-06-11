import com.globalpayex.college.entities.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStream {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("mehul", 'm', 10, 90),
                new Student("jane", 'f', 13, 78),
                new Student("john", 'm', 17, 100),
                new Student("rock", 'm', 11, 78)
        );

        // find names of all the students comma separated, who have scored more than 80 marks
        // stream API
        String st = students.stream()
                .filter(student -> student.marks > 80)
                .map(student -> student.name)
                .collect(Collectors.joining(","));
        System.out.println(st);
    }

}
