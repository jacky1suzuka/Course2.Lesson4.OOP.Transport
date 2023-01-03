package Drivers;

import Transport.Transport;

import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private String firstName;
    private String middleName;
    private String lastName;
    private int experience;


    public abstract void takesPart(T transport);

    public abstract void refuel(T transport);

    public Driver(String firstName, String middleName, String lastName, int experience) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.experience = experience;
    }

    public void start(){
        System.out.println("Водитель " + getFullName() + " начал движение.");
    }

    public void stop() {
        System.out.println("Водитель" + getFullName() + " остановился.");
    }

    public String getFullName(){
        return firstName + " " + middleName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver drivers = (Driver) o;
        return experience == drivers.experience && firstName.equals(drivers.firstName) && middleName.equals(drivers.middleName) && lastName.equals(drivers.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, experience);
    }

}
