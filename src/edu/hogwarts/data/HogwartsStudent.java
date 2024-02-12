package src.edu.hogwarts.data;

import src.edu.generic.Student;

public class HogwartsStudent extends Student implements HogwartsPerson {
    private House house;
    private boolean pureBlood;
    private String[] clubs;

    public HogwartsStudent(HogwartsStudent other) {
        super(other);
        this.house = other.house;
        this.pureBlood = other.pureBlood;
        this.clubs = other.clubs.clone();
    }

    public HogwartsStudent(String fullName, int birthYear, House house, boolean pureBlood, String[] clubs) {
        super(fullName, birthYear);
        this.house = house;
        this.pureBlood = pureBlood;
        this.clubs = clubs;
    }

    public HogwartsStudent(int enrollmentYear, String firstName, String lastName, House house, boolean pureBlood, String[] clubs) {
        super(enrollmentYear, firstName, lastName);
        this.house = house;
        this.pureBlood = pureBlood;
        this.clubs = clubs;
    }

    public HogwartsStudent(String fullName, House house, boolean pureBlood, String[] clubs) {
        super(fullName);
        this.house = house;
        this.pureBlood = pureBlood;
        this.clubs = clubs;
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
        return clubs;
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