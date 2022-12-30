package Drivers;

import Transport.Bus;
import Transport.Transport;

public class DriverD <A extends Transport> extends Drivers {
    private final String DRIVER_LICENSE = "D";

    public DriverD(String firstName, String middleName, String lastName, int experience) {
        super(firstName, middleName, lastName, experience);
    }

    public void takesPart(A transport) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + transport.getBrand() + " "
                + transport.getModel() + " и будет участвовать в заезде.");
    }

    public void refuel(A truck) {
        System.out.println("Водитель заправляет " + truck.getBrand() + " " + truck.getModel());
    }

    @Override
    public String toString() {
        return "ФИО - " + getFullName() + "; стаж - " + getExperience() + "; категория прав - " + DRIVER_LICENSE;
    }
}
