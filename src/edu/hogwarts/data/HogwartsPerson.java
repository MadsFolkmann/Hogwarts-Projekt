package src.edu.hogwarts.data;

public interface HogwartsPerson extends Comparable<HogwartsPerson> {
    String getFirstName();
    String getMiddleName();
    String getLastName();
    House getHouse();
    boolean isMuggleBorn();
    String[] getActivities();
    String getFullName();


    default int compareTo(HogwartsPerson other) {
        return this.getFullName().compareTo(other.getFullName());
    }
}
