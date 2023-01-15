package Mechanics;

import Transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mechanic<T extends Transport> {
    private String firstName;
    private String lastName;
    private String company;


    public Mechanic(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void carryOutMaintenance(T transport) {
        transport.addToMechanics(this);
        System.out.println("Механик " + firstName + " " + lastName + " проводит техобслуживание у " +
                transport.getBrand() + " " + transport.getModel() + ".");
    }

    public void fix(T transport) {
        System.out.println("Механик " + firstName + " " + lastName + " чинит " + transport.getBrand() + " " +
                transport.getModel() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return firstName.equals(mechanic.firstName) && lastName.equals(mechanic.lastName) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
