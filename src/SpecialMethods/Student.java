package SpecialMethods;

import java.util.Objects;

public class Student {
    // This class, like the one we created in Ch4 lecture
    // is designed to model what a Student in our application
    // so we should give various properties that describe
    // a student
    // Examples: firstName, lastName, TA
    private String firstName;
    private String lastName;
    private String TA;

    public Student(String firstName, String lastName, String TA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.TA = TA;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTA() {
        return TA;
    }

    public void setTA(String TA) {
        this.TA = TA;
    }

    @Override
    public String toString() {
        return "This student's name is " + firstName + " " + lastName + ". They are in " +
                TA + "'s TA group.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(TA, student.TA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, TA);
    }
}
