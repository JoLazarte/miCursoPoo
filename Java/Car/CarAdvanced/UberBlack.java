package Car.CarAdvanced;
import java.util.ArrayList;
import java.util.Map;

import Account.Account;

class UberBlack extends CarAdvanced {

    public UberBlack(String license, Account driver, Map<String, CarAdvModel> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver, typeCarAccepted, seatsMaterial);
    }
    
    
}
