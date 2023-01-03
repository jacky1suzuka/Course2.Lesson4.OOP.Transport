package Drivers;

import Transport.Car;

public final class DriverB extends Driver<Car> {
    private final String DRIVER_LICENSE = "B";

    public DriverB(String firstName, String middleName, String lastName, int experience) {
        super(firstName, middleName, lastName, experience);
    }

    @Override
    public void takesPart(Car transport) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + transport.getBrand() + " "
                    + transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель заправляет " + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "ФИО - " + getFullName() + "; стаж - " + getExperience() + "; категория прав - " + DRIVER_LICENSE;
    }
}
