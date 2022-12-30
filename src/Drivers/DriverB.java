package Drivers;

import Transport.Car;
import Transport.Transport;

public final class DriverB <A extends Car> extends Drivers {
    private final String DRIVER_LICENSE = "B";

    public DriverB(String firstName, String middleName, String lastName, int experience) {
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
