package models;

import java.util.Comparator;

public class Producer {
    private long id;
    private String firstName;
    private String lastName;

    public Producer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
public static Comparator<Producer> sortP = Comparator.comparing(Producer::getFirstName);
//    public Producer() {
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static Comparator<Producer> sortByName = Comparator.comparing(Producer::getFirstName);

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
