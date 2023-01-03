package Drivers;

import Transport.Truck;

public final class DriverC extends Driver <Truck> {
    private final String DRIVER_LICENSE = "C";

    public DriverC(String firstName, String middleName, String lastName, int experience) {
        super(firstName, middleName, lastName, experience);
    }

    @Override
    public void takesPart(Truck transport) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + transport.getBrand() + " "
                + transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель заправляет " + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "ФИО - " + getFullName() + "; стаж - " + getExperience() + "; категория прав - " + DRIVER_LICENSE;
    }
}
