package Transport;

import Drivers.Driver;
import Mechanics.Mechanic;

import java.util.*;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

    public Map<Transport, Mechanic> mechanicMap = new HashMap<>();

    private Driver driver;

    public void start() {
        System.out.println(brand + " " + model + " начинает движение.");
    }

    public abstract void getDiagnosed();

    public abstract void printType();

    public void stop() {
        System.out.println(brand + " " + model + " останавливается.");
    }

    public void addToMechanicMap(Transport transport, Mechanic mechanic) {
        mechanicMap.put(transport, mechanic);
    }

    public void getCrew() {
        System.out.println("Водитель " + brand + " " + model + ": "  + driver.getFullName() + ".");
        getMechanics();
    }

    public void getMechanics() {
        System.out.println("Список механиков у " + brand + " " + model + ": ");
        System.out.println(mechanicMap.get(this).getFirstName() + " " + mechanicMap.get(this).getLastName() + " из '" +
                mechanicMap.get(this).getCompany() + "'");
    }


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "Default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "Default";
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public Transport(String brand, String model, double engineVolume) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "Default";
        }

        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "Default";
        }

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

    }


    @Override
    public String toString() {
        return "Марка - " + brand + "; Модель - " + model + "; Объем двигателя - " + engineVolume + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

}
