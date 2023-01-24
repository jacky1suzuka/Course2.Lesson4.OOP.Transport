import Drivers.*;
import Mechanics.Mechanic;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;

import java.util.*;

public class Main {
    static List<Transport> vehicles = new ArrayList<>();
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.6);
        Car bmw = new Car("BMW", "X5", 3);
        Car ferrari = new Car("Ferrari", "488", 3.9);
        Car lamborghini = new Car("Lamborghini", "Gallardo", 5.2);

        Truck kamaz = new Truck("КамАЗ", "5320", 10.9);
        Truck zil = new Truck("Зил", "130", 5.9);
        Truck ural = new Truck("Урал", "4320", 6);
        Truck man = new Truck("MAN", "TGX", 10.5);

        Bus kia = new Bus("Kia", "Granbird Silkroad", 13.5);
        Bus hyundai = new Bus("Hyundai", "County", 3.9);
        Bus daewoo = new Bus("Daewoo", "BS090", 7);
        Bus gazel = new Bus("ГАЗель", "Next", 2.5);


        addToArrayList(lada, bmw, ferrari, lamborghini, kia, hyundai, daewoo, gazel, kamaz, zil, ural, man);


        DriverB driverB = new DriverB("Иван", "Иванович", "Иванов", 2, "B");
        DriverC driverC = new DriverC("Федор", "Федорович", "Федоров", 5, "C");
        DriverD driverD = new DriverD("Лев", "Иванович", "Морозов", 10, "D");


        Mechanic<Transport> mechanic = new Mechanic<Transport>("Иван", "Иванов", "АвтоСервисПро");
        Mechanic<Car> mechanic1 = new Mechanic<Car>("Федор", "Федоров", "СервисПлюс");
        Mechanic<Car> mechanic2 = new Mechanic<Car>("Владимир", "Гутин", "СервисПлюс");
        Mechanic<Truck> mechanic3 = new Mechanic<Truck>("Василий", "Морозов", "ГрузСервис");
        Mechanic<Truck> mechanic4 = new Mechanic<Truck>("Егор","Ларин","ГрузСервис");
        Mechanic<Bus> mechanic5 = new Mechanic<Bus>("Владислав", "Кругов", "СервисЮг");
        Mechanic<Bus> mechanic6 = new Mechanic<Bus>("Леонид", "Волков", "СервисЮг");

        Set<Driver<?>> drivers = new HashSet<>();
        drivers.add(driverB);
        drivers.add(driverB);
        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);

        Iterator<Driver<?>> driverIterator = drivers.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }




//        driverB.takesPart(ferrari);
//        mechanic1.carryOutMaintenance(ferrari);
//        mechanic1.carryOutMaintenance(ferrari);
//        mechanic1.carryOutMaintenance(ferrari);
//        mechanic2.carryOutMaintenance(ferrari);
//        ferrari.getCrew();


//        driverB.refuel(ferrari);
//        mechanic.carryOutMaintenance(ferrari);
//        mechanic1.carryOutMaintenance(ferrari);
//        mechanic2.carryOutMaintenance(ferrari);
//        mechanic.fix(ferrari);
//
//        driverC.takesPart(kamaz);
//        driverC.refuel(kamaz);
//        mechanic3.carryOutMaintenance(kamaz);
//        mechanic4.carryOutMaintenance(kamaz);
//        mechanic3.fix(kamaz);
//
//        driverD.takesPart(daewoo);
//        driverD.refuel(daewoo);
//        mechanic5.carryOutMaintenance(daewoo);
//        mechanic6.carryOutMaintenance(daewoo);
//        mechanic5.fix(daewoo);
//
//
//        vehicles.get(2).getCrew();
//        vehicles.get(8).getCrew();
//        vehicles.get(6).getCrew();
//
//
//        List<Driver> drivers = new ArrayList<>();
//        drivers.add(driverB);
//        drivers.add(driverC);
//        drivers.add(driverD);
//
//        System.out.println(drivers);








//        mechanics.get(0).fix(ferrari);
//        getBrandsFromVehicles();
//        lada.pitStop();
//        daewoo.pitStop();
//        lada.bestLapTime();
//        lada.maxSpeed();
//        daewoo.maxSpeed();
//        kamaz.pitStop();
//        kamaz.bestLapTime();
//        kamaz.maxSpeed();
//        driverC.takesPart(zil);
//        driverC.refuel(zil);
//        driverB.takesPart(lamborghini);
//        driverB.refuel(lamborghini);
//
//        lada.setType(Car.BodyType.SEDAN);
//
//        lada.printType();
//        ferrari.printType();
//
//
//        ural.setType(Truck.LoadCapacity.N1);
//        zil.setType(Truck.LoadCapacity.N2);
//        kamaz.setType(Truck.LoadCapacity.N3);
//        ural.printType();
//        zil.printType();
//        kamaz.printType();
//        man.printType();
//
//        kia.setType(Bus.Capacity.VERY_SMALL);
//        hyundai.setType(Bus.Capacity.SMALL);
//        daewoo.setType(Bus.Capacity.MIDDLE);
//        gazel.setType(Bus.Capacity.VERY_LARGE);
//        kia.printType();
//        hyundai.printType();
//        daewoo.printType();
//        gazel.printType();
//
//
//        zil.getDiagnosed();
//        ferrari.getDiagnosed();
//        lada.getDiagnosed();

    }

    public static void addToArrayList(Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            vehicles.add(i, transports[i]);
        }
    }

    public static void getBrandsFromVehicles(){
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i).getBrand());
        }
    }
}