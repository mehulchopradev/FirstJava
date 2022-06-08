import com.globalpayex.college.entities.StudentOld;

public class StudentList {
    public static void main(String[] args) {
        StudentOld[] students = {
                new StudentOld("mehul", 'm', 10, 90),
                new StudentOld("jane", 'f', 12, 78),
                new StudentOld("john", 'm', 14, 67),
        };

        for(StudentOld student : students) {
            System.out.println(student.getNameGender());
        }
    }
}
