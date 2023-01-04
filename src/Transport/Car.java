package Transport;


public final class Car extends Transport {
    private BodyType type;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public BodyType getType() {
        return type;
    }

    public void setType(BodyType type) {
        this.type = type;
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");


       private final String BODY_TYPE;

       BodyType(String bodyType) {
           this.BODY_TYPE = bodyType;
       }

       @Override
       public String toString() {
           return BODY_TYPE;
       }
    }

    @Override
    public void getDiagnosed() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " проходит диагностику.");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " +  getBrand() + " " + getModel() + " заходит на пит-стоп.");
    }

    @Override
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Тип кузова автомобиля: " + type + ".");
        }
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
