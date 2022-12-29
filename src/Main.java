import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
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


        DriverB driverB = new DriverB("Иван", "Иванович", "Иванов", 2);
        DriverC driverC = new DriverC("Федор", "Федорович", "Федоров", 5);
        DriverD driverD = new DriverD("Лев", "Иванович", "Морозов", 10);

        driverB.refuel(ferrari);
        driverC.refuel(kamaz);
        driverD.refuel(daewoo);

        driverB.start();

        driverB.takesPart(bmw);
        driverC.takesPart(kamaz);
        driverD.takesPart(gazel);




        System.out.println(driverB);







    }
}