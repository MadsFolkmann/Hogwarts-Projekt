import java.util.Arrays;

public class Subject {
    private String name;
    private int schoolYear;
    private boolean elective;

    public Subject(String name, int schoolYear, boolean elective) {
        this.name = name;
        this.schoolYear = schoolYear;
        this.elective = elective;
    }

    public String getName() {
        return name;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public boolean isElective() {
        return elective;
    }

    @Override
    public String toString() {
        return "Subject: " + name + "\nSchool Year: " + schoolYear + "\nElective: " + elective;
    }
}