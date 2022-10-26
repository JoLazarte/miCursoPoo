package Car.CarBasic;
import Account.Account;
import Car.Car;

public class CarBasic extends Car {

    protected String brand;
    protected String model;

    public CarBasic(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }
//sobrescribo el metodo de Car (ejemplo de polimorfismo)
    @Override
    public void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
    
}
