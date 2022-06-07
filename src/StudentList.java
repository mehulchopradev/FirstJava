public class StudentList {
    public static void main(String[] args) {
        Student[] students = {
                new Student("mehul", 'm', 10, 90),
                new Student("jane", 'f', 12, 78),
                new Student("john", 'm', 14, 67),
        };

        for(int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getNameGender());
        }
    }
}
