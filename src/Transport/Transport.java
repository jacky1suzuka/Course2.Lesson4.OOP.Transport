package Transport;

import Drivers.Driver;
import Mechanics.Mechanic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

    private List<Mechanic> mechanics = new ArrayList<>();

    private Driver driver;

    public void start() {
        System.out.println(brand + " " + model + " начинает движение.");
    }

    public abstract void getDiagnosed();

    public abstract void printType();

    public void stop() {
        System.out.println(brand + " " + model + " останавливается.");
    }

    public void addToMechanics(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public void getCrew() {
        System.out.println("Водитель: " + driver.getFullName() + ".");
        getMechanics();
    }

    public void getMechanics() {
        System.out.print("Список механиков у " + brand + " " + model + ": ");
        for (int i = 0; i < mechanics.size(); i++) {
            if (i < mechanics.size() - 1) {
                System.out.print(mechanics.get(i).getFirstName() + " " + mechanics.get(i).getLastName() + " из '" + mechanics.get(i).getCompany() +  "', ");
            } else {
                System.out.println(mechanics.get(i).getFirstName() + " " + mechanics.get(i).getLastName() + " из '" + mechanics.get(i).getCompany() + "'.");
            }
        }
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
