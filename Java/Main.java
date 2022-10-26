import java.util.ArrayList;
import java.util.TreeMap;

import Account.*;
//import Car.*;
import Car.CarBasic.*;
import Car.CarAdvanced.*;


class Main {
    public static void main(String[] args) {
        System.out.println("Hola, Maka!");
        //Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        //car.license = "AMQ123";
        //car.driver = "Andres Herrera";
       
        //System.out.println("Car License: " + car.license);
        //car.printDataCar();

        UberX uberX = new UberX("QWE567", new Account("Andrea Herrera", "ANDA876"), "Chevrolet", "Sonic");
        //uberX.passenger = 3;
        uberX.setPassenger(2);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("RETVCF", new Account("Maria", "MA456"), new TreeMap<>(), new ArrayList<>());
        uberVan.setPassenger(2);
        uberVan.printDataCar();


    }
}