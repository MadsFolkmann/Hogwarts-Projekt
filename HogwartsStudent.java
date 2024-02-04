import java.util.Arrays;

public class HogwartsStudent extends Student {
    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent(String fullName, House house, boolean prefect, String[] teams) {
        super(fullName);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(int enrollmentYear, String firstName, String middleName, String lastName, House house, boolean prefect, String[] teams) {
        super(enrollmentYear, firstName, middleName, lastName);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("House: ").append(house).append("\n");
        result.append("Prefect: ").append(prefect).append("\n");
        result.append("Teams: ").append(Arrays.toString(teams)).append("\n");
        return result.toString();
    }
}
