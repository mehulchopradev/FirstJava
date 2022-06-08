import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege {

    public static void main(String[] args) {
        int i = 10;

        Student s = new Student("mehul", 'm', 10, 90);

        String[] subjects = {"Physics", "Chemistry"};
        Professor p = new Professor("jane", 'f', subjects);

        System.out.println(i);

        System.out.println(s);
        // Internally
        // System.out.println(s.toString());
        // System.out.println(Student.toString(s));

        System.out.println(p);

        /* System.out.println(s.name);
        System.out.println(s.gender);

        System.out.println(p.name);
        System.out.println(p.gender); */

        // System.out.println(s.getDetails());
        // Internally
        // Student.getDetails(s)

        // System.out.println(p.getDetails());
        // Internally
        // Professor.getDetails(p)
    }
}
