package Car.CarAdvanced;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import Account.Account;
import Car.Car;

public class CarAdvanced extends Car {
    
    protected Map<String,Integer> model;
    protected Map<String, CarAdvModel> typeCarAccepted = new TreeMap<String, CarAdvModel>();
    private ArrayList<String> seatsMaterial;

    public Map<String, CarAdvModel> getTypeCarAccepted() {
        return typeCarAccepted;
    }

    public void setTypeCarAccepted(Map<String, CarAdvModel> typeCarAccepted) {
        this.typeCarAccepted = typeCarAccepted;
    }

    public ArrayList<String> getSeatsMaterial() {
        return seatsMaterial;
    }

    public void setSeatsMaterial(ArrayList<String> seatsMaterial) {
    
        this.seatsMaterial = seatsMaterial;
    }

    public CarAdvanced(String license, Account driver, 
    Map<String, CarAdvModel> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        seatsMaterial.add("Leather");
        seatsMaterial.add("Leatherette");
        seatsMaterial.add("Polyester");
        seatsMaterial.add("Nylon");
        

        typeCarAccepted.put("Multi-Purpose Vehicle ", new CarAdvModel("MPV-OA", 1));
        typeCarAccepted.put("Compact MPV ", new CarAdvModel("CMPV-OB", 2));
        typeCarAccepted.put("Mini MPV ", new CarAdvModel("MMPV-OC", 3));
        typeCarAccepted.put("Minivan ", new CarAdvModel("MV-OC1", 4));
        typeCarAccepted.put("Microvan ", new CarAdvModel("MCV-D", 5));
        typeCarAccepted.put("Panel Van ", new CarAdvModel("PNV-E", 6));
        typeCarAccepted.put("Box Van ", new CarAdvModel("BOV-F", 7));
        typeCarAccepted.put("Step Van ", new CarAdvModel("STV-G", 8));
        typeCarAccepted.put("Full-Size Van ", new CarAdvModel("FSV-H", 9));


        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    //Sobrescribo un setter de Car (ej de Polimorfismo)
    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    @Override
    public void printDataCar() {
        super.printDataCar();
        
        System.out.println("Tipo de auto: " + typeCarAccepted + " Tipo de asiento: " + seatsMaterial);
    }

    
}
