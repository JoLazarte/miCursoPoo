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

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();


    }
}