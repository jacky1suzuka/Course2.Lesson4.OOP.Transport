package Transport;

import Drivers.DriverB;

public final class Car <A extends DriverB> extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " +  getBrand() + " " + getModel() + " заходит на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        int time = 40 + (int) (Math.random() * 60);
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " " + getModel()
                           + " составило " + time + " сек." );

    }

    @Override
    public void maxSpeed() {
        int speed = 60 + (int) (Math.random() * 120);
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " " + getModel()
                           + " составила " + speed + " км/ч.");

    }
}
