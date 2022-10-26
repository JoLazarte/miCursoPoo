package Car.CarAdvanced;
import java.util.ArrayList;
import java.util.Map;

import Account.Account;

public class UberVan extends CarAdvanced {


    public UberVan(String license, Account driver, Map<String, CarAdvModel> typeCarAccepted,
    ArrayList<String> seatsMaterial) {
        super(license, driver, typeCarAccepted, seatsMaterial);
       
    }      
}
