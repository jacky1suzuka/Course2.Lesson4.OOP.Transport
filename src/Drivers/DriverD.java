package Drivers;

import Transport.Bus;

public final class DriverD extends Driver<Bus> {
    private final String DRIVER_LICENSE = "D";

    public DriverD(String firstName, String middleName, String lastName, int experience, String category) {
        super(firstName, middleName, lastName, experience, category);
    }

    public String getDRIVER_LICENSE() {
        return DRIVER_LICENSE;
    }

    @Override
    public void takesPart(Bus transport) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + transport.getBrand() + " "
                + transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель заправляет " + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "ФИО - " + getFullName() + "; стаж - " + getExperience() + "; категория прав - " + DRIVER_LICENSE;
    }
}
