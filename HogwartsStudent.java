import java.util.Arrays;

public class HogwartsStudent extends Student implements HogwartsPerson {
    private House house;
    private boolean pureBlood;
    private String[] clubs;

    public HogwartsStudent(int birthYear, String firstName, String middleName, String lastName, House house, boolean pureBlood, String[] clubs) {
        super(birthYear, firstName, middleName, lastName);
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