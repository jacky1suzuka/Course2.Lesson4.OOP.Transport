package Transport;


public final class Truck extends Transport {

    private LoadCapacity type;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private final Float FROM;
        private final Float TO;

        LoadCapacity(Float FROM, Float TO) {
            this.FROM = FROM;
            this.TO = TO;
        }


        @Override
        public String toString() {
            if (FROM != null && TO != null) {
                return "Грузоподъемность: от " + FROM + " тонн до " + TO + " тонн.";
            } else if (FROM == null) {
                return "Грузоподъемность: до " + TO + " тонн.";
            } else if (TO == null) {
                return "Грузоподъемность: свыше " + FROM + " тонн.";
            }
            return "";
        }
    }

    public LoadCapacity getType() {
        return type;
    }

    public void setType(LoadCapacity type) {
        this.type = type;
    }

    @Override
    public void printType() {
        if (type == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(type);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " заходит на пит-стоп.");
    }

    @Override
    public void bestLapTime() {
        int time = 90 + (int) (Math.random() * 170);
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand() + " " + getModel()
                + " составило " + time + " сек.");

    }

    @Override
    public void maxSpeed() {
        int speed = 20 + (int) (Math.random() * 70);
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand() + " " + getModel()
                + " составила " + speed + " км/ч.");

    }
}
