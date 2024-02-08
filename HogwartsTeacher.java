import java.util.Date;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String fullName, String empType, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(fullName, empType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
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