package Transport;


public final class Bus extends Transport {
    private Capacity type;
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum Capacity {
        VERY_SMALL(null, 10),
        SMALL(null, 25),
        MIDDLE(40, 50),
        LARGE(60, 80),
        VERY_LARGE(100,120);

        private final Integer FROM;
        private final Integer TO;

        Capacity(Integer FROM, Integer TO) {
            this.FROM = FROM;
            this.TO = TO;
        }

        @Override
        public String toString() {
            if (FROM != null && TO != null) {
                return "Вместимость: от " + FROM + " человек до " + TO + " человек.";
            } else if (FROM == null) {
                return "Вместимость: до " + TO + " человек.";
            } else if (TO == null) {
                return "Вместимость: свыше " + FROM + " человек.";
            }
            return "";
        }
    }

    public Capacity getType() {
        return type;
    }

    public void setType(Capacity type) {
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
