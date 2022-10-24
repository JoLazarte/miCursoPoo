class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }
    //sobrescribo el metodo de Car (ejemplo de polimorfismo)
    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
}
