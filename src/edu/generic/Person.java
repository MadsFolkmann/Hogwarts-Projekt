package src.edu.generic;

public class Person {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Person(Person other) {
        this.id = other.id;
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.lastName = other.lastName;
        this.birthYear = other.birthYear;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String middleName, String lastName) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(String fullName) {
        this();
        setFullName(fullName);
    }

    public String toString() {
        return firstName + " " + lastName ;
    }

    public String getMiddleName() {
        return middleName;
    }
    
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public boolean hasMiddleName(){
        return middleName != null;
    }
    
    public String getFullName(){
        if(hasMiddleName()) {
        return firstName + " " + middleName + " " + lastName;
        } else{
        return firstName + " " + lastName;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName){
        String[] parts = fullName.split(" ");
        firstName = parts[0];
         lastName = parts[parts.length - 1];

        if (parts.length > 1){
        middleName = parts[1];
        } else {
        middleName = null;
        }

    }


}