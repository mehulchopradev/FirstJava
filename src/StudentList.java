public class StudentList {
    public static void main(String[] args) {
        Student[] students = {
                new Student("mehul", 'm', 10, 90),
                new Student("jane", 'f', 12, 78),
                new Student("john", 'm', 14, 67),
        };

        for(Student student : students) {
            System.out.println(student.getNameGender());
        }
    }
}
