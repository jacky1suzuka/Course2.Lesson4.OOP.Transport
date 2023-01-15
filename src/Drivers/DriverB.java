package Drivers;

import Transport.Car;

public final class DriverB extends Driver<Car> {

    public DriverB(String firstName, String middleName, String lastName, int experience, String category) {
        super(firstName, middleName, lastName, experience, category);
    }

    @Override
    public void takesPart(Car transport) {
        transport.setDriver(this);
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + transport.getBrand() + " "
                    + transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель заправляет " + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "ФИО - " + getFullName() + "; стаж - " + getExperience() + "; категория прав - " + getCategory();
    }
}
