package Transport;

import java.util.Objects;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;


    public void start() {
        System.out.println(brand + " " + model + " начинает движение.");
    }

    public abstract void getDiagnosed();

    public abstract void printType();

    public void stop() {
        System.out.println(brand + " " + model + " останавливается.");
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
