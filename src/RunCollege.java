import com.abc.salary.SalaryCalculator;
import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege {

    public static void main(String[] args) {
        int i = 10;

        Student s = new Student("mehul", 'm', 10, 90);
        s.setAddress(new Address("IN", "UP", 400057));
        System.out.println(s.getDetails());
        System.out.println(s.isAddressPresent());

        String[] subjects = {"Physics", "Chemistry"};
        Professor p = new Professor("jane", 'f', subjects, 5000, 20);
        System.out.println(p.getDetails());
        System.out.println(SalaryCalculator.calculate(p));
        System.out.println(p.calculate());
        System.out.println(p.isAddressPresent());

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
