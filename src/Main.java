import Drivers.*;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.6);
        Car bmw = new Car("BMW", "X5", 3);
        Car ferrari = new Car("Ferrari", "488", 3.9);
        Car lamborghini = new Car("Lamborghini", "Gallardo", 5.2);

        Bus kia = new Bus("Kia", "Granbird Silkroad", 13.5);
        Bus hyundai = new Bus("Hyundai", "County", 3.9);
        Bus daewoo = new Bus("Daewoo", "BS090", 7);
        Bus gazel = new Bus("ГАЗель", "Next", 2.5);

        Truck kamaz = new Truck("КамАЗ", "5320", 10.9);
        Truck zil = new Truck("Зил", "130", 5.9);
        Truck ural = new Truck("Урал", "4320", 6);
        Truck man = new Truck("MAN", "TGX", 10.5);


        lada.pitStop();
        daewoo.pitStop();
        lada.bestLapTime();
        lada.maxSpeed();
        daewoo.maxSpeed();
        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();


        DriverB driverB = new DriverB("Иван", "Иванович", "Иванов", 2, "B");
        DriverC driverC = new DriverC("Федор", "Федорович", "Федоров", 5, "C");
        DriverD driverD = new DriverD("Лев", "Иванович", "Морозов", 10, "D");

        driverC.takesPart(zil);
        driverC.refuel(zil);
        driverB.takesPart(lamborghini);
        driverB.refuel(lamborghini);

        lada.setType(Car.BodyType.SEDAN);

        lada.printType();
        ferrari.printType();


        ural.setType(Truck.LoadCapacity.N1);
        zil.setType(Truck.LoadCapacity.N2);
        kamaz.setType(Truck.LoadCapacity.N3);
        ural.printType();
        zil.printType();
        kamaz.printType();
        man.printType();

        kia.setType(Bus.Capacity.VERY_SMALL);
        hyundai.setType(Bus.Capacity.SMALL);
        daewoo.setType(Bus.Capacity.MIDDLE);
        gazel.setType(Bus.Capacity.VERY_LARGE);
        kia.printType();
        hyundai.printType();
        daewoo.printType();
        gazel.printType();


        zil.getDiagnosed();
        ferrari.getDiagnosed();
        lada.getDiagnosed();



    }

}