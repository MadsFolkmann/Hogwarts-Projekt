
public class Student extends Person {
    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated;

    public Student(String fullName, int enrollmentYear) {
        super(fullName);
        this.enrollmentYear = enrollmentYear;
        this.graduated = false;
    }

    public Student(int enrollmentYear, String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
        this.enrollmentYear = enrollmentYear;
        this.graduated = false;
    }

    public Student(int enrollmentYear, String firstName, String lastName) {
        this(enrollmentYear, firstName, null, lastName);
    }

    public Student(String fullName) {
        super(fullName);
    }


    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void graduate(int graduationYear) {
        this.graduationYear = graduationYear;
        this.graduated = true;
    }

    @Override
    public String toString() {
        String studentInfo = super.toString();
        String graduationInfo = graduated ? ", graduationYear: " + graduationYear : ", not graduated yet";
        return studentInfo + graduationInfo;
    }
}
