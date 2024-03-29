package src.edu.hogwarts.data;

import src.edu.generic.Teacher;

import java.util.Date;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String fullName, String empType, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(fullName, empType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(HogwartsTeacher teacher) {
        super(teacher.getFullName(), teacher.getEmpType(), teacher.getEmploymentStart(), teacher.getEmploymentEnd());
        this.house = teacher.house;
        this.headOfHouse = teacher.headOfHouse;
    }

    @Override
    public House getHouse() {
        return house;
    }

    @Override
    public boolean isMuggleBorn() {
        return false;
    }

    @Override
    public String[] getActivities() {
        return new String[0];
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getMiddleName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }
}