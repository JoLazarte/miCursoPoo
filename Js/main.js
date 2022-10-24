//import Account from "./account.js";
//import UberX from "./uberX.js";
//import UberVan from "./uberVan.js";

const car = new Car("AW456", new Account("Andres Herrera", "QWE234"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("ASA56", new Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark");
uberX.id = "UberX 232478321";
uberX.passenger = 4;
uberX.printDataCar();

var uberVan = new UberVan("DGC548", new Account("Francisco Peralta", "FR56ALF"), "Nissan", "Versa");
uberVan.id = "Ubervan 45432124";
uberVan.passenger = 6;
uberVan.printDataCar();
