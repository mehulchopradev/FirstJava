import com.globalpayex.college.entities.StudentOld;

public class CreateStudents {

    public static void main(String[] args) {
        System.out.println(StudentOld.count);
        // var s1 = new com.globalpayex.college.entities.Student();
        // Internally
        // new ---> RAM 6006
        // com.globalpayex.college.entities.Student(6006)
        // s1 ---> 6006

        var s1 = new StudentOld("mehul", 'm', 10, 56);

        // Internally
        // new ---> RAM 6006
        // com.globalpayex.college.entities.Student("mehul", 'm', 56, 10, 6006)

        var s2 = new StudentOld("jane", 'f', 13, 67);

        /* System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.marks);
        System.out.println(s1.roll); */

        System.out.println(StudentOld.count);

        var s3 = new StudentOld();

        /* s1.name = "mehul";
        s1.gender = 'm';
        s1.marks = 56;
        s1.roll = 10; */

        /* s2.name = "jane";
        s2.gender = 'f';
        s2.marks = 67;
        s2.roll = 13; */
        /* System.out.println(s1.name);
        System.out.println(s2.name); */

        System.out.println(s1.getDetails());
        // Internally
        // System.out.println(com.globalpayex.college.entities.Student.getDetails(s1));

        System.out.println(s2.getDetails());
        // Internally
        // System.out.println(com.globalpayex.college.entities.Student.getDetails(s2));

        System.out.println(s1.getGrade());

        System.out.println(s3.getDetails());

        System.out.println(StudentOld.count);

        StudentOld s4 = StudentOld.newInstance("John", 'm', 34, 90);
        System.out.println(s4.getDetails());
    }
}
