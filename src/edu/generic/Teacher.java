package src.edu.generic;

import src.edu.generic.Person;

import java.util.Date;

public class Teacher extends Person {
    private String empType;
    private Date employmentStart;
    private Date employmentEnd;

    public Teacher(String fullName, String empType, Date employmentStart, Date employmentEnd) {
        super(fullName);
        this.empType = empType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public String getEmpType() {
        return empType;
    }

    public String getFullName() {
        return super.getFullName();
    }
    
    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public Date getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(Date employmentStart) {
        this.employmentStart = employmentStart;
    }

    public Date getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(Date employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("Employment Type: ").append(empType).append("\n");
        result.append("Employment Start Date: ").append(employmentStart).append("\n");
        result.append("Employment End Date: ").append(employmentEnd).append("\n");
        return result.toString();
    }
}
