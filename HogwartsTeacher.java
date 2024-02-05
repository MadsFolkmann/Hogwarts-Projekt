import java.util.Date;

public class HogwartsTeacher extends Teacher {
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String fullName, String empType, Date employmentStart, House house, boolean headOfHouse) {
        super(fullName, empType, employmentStart);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("House: ").append(house).append("\n");
        result.append("Head of House: ").append(headOfHouse).append("\n");
        return result.toString();
    }
}
