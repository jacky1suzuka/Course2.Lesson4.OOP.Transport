package Transport;


public final class Bus extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заходит на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        int time = 80 + (int) (Math.random() * 150);
        System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel()
                           + " составило " + time + " сек." );

    }

    @Override
    public void maxSpeed() {
        int speed = 20 + (int) (Math.random() * 100);
        System.out.println("Максимальная скорость автобуса " + getBrand() + " " + getModel()
                           + " составила " + speed + " км/ч.");

    }
}
