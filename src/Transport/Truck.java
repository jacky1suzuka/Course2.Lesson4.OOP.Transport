package Transport;


public final class Truck extends Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " +  getBrand() + " " + getModel() + " заходит на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        int time = 90 + (int) (Math.random() * 170);
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand() + " " + getModel()
                           + " составило " + time + " сек." );

    }

    @Override
    public void maxSpeed() {
        int speed = 20 + (int) (Math.random() * 70);
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand() + " " + getModel()
                           + " составила " + speed + " км/ч.");

    }
}
