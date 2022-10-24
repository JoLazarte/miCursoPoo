//import Car from "./car.js"
//export default class UberVan extends Car {
class UberVan extends Car {    
    constructor(license, driver, typeCarAccepted, seatsMaterial) {
        super(license, driver)
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    get passenger() {
        return this._passenger;
      }
    
    set passenger(passengers) {
        if (passengers != 6) {
          console.log("Debes tener 6 pasajeros");
        } else {
          this._passenger = passengers;
        }
    }
    
    printDataCar() {
        
        //console.group();
        console.group(this.id);
        console.log('License: ' + this.license);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log('Pasajeros: ' + this.passenger);
        console.log('Tipo de auto ' + this.typeCarAccepted);
        console.log('Material de asientos: ' + this.seatsMaterial);
        console.groupEnd();
        //console.groupEnd();
    }
}