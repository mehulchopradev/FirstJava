public class Grader {

    static char computeGrade(float marks) {
        char grade;
        if (marks < 0 || marks > 100) {
            grade = 'I';
        } else if (marks >= 70) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static void main(String[] args) {
        var marks = 56;
        System.out.println(computeGrade(marks));
    }
}
