import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.CollegeUser;
import com.globalpayex.college.entities.Student;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStream {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("mehul", 'm', 10, 90, new Address("IN", "MH", 400053)),
                new Student("jane", 'f', 13, 78, new Address("USA", "MH", 34325)),
                new Student("john", 'm', 17, 100, new Address("USA", "CO", 1312)),
                new Student("rock", 'm', 11, 78)
        );

        // print the names of all students comma separated as a string who belong to the USA country
        String result = students
                .stream()
                .filter(student -> student.isAddressPresent() && student.getAddress().getCountry().equals("USA"))
                .map(student -> student.name)
                .collect(Collectors.joining(","));
        System.out.println(result);

        // find names of all the students comma separated, who have scored more than 80 marks
        // stream API
        String st = students.stream()
                .filter(student -> student.marks > 80)
                .map(student -> student.name)
                .collect(Collectors.joining(","));
        System.out.println(st);

        // find the average marks scored by all the students
        // students -> stream -> terminal ?? Collectors.??
        double average = students.stream()
                .collect(Collectors.averagingDouble(student -> student.marks));
        System.out.println(average);

        // statistics of the marks scored by all the students
        DoubleSummaryStatistics ds =  students.stream()
                .collect(Collectors.summarizingDouble(student -> student.marks));
        System.out.println(ds);
        System.out.println(ds.getAverage());
        System.out.println(ds.getMax());
        System.out.println(ds.getMin());
        System.out.println(ds.getSum());

        // group the above student list by gender
        Map<Character, List<Student>> genderMap = students.stream()
                .collect(Collectors.groupingBy(student -> student.getGender()));
        System.out.println(genderMap);

        // from the above student list make two groups of Students
        // 1. Scored more than or equal 80 marks
        // 2. Scored less than 80 marks
        Map<Boolean, List<Student>> marksMap = students.stream()
                .collect(Collectors.partitioningBy(student -> student.marks >= 80));
        System.out.println(marksMap);

        /* CollegeUser collegeUser = new CollegeUser("mehul", 'm');
        System.out.println(collegeUser.gender); */

    }

}
