/*
function Car(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;  
}

Car.prototype.printDataCar = function () {
    console.table(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}
*/
class Car {

    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this._passenger;
    }

    get passenger() {
        return this._passenger
    }
    
    set passenger(passengers) {
        if (passengers != 4) {
          console.log("Debes tener 4 pasajeros")
        } else {
          this._passenger = passengers
        }
    }    

    printDataCar() {
        //console.table(this.driver);
        console.group(this.id);
        console.log('License: ' + this.license);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log('Pasajeros: ' + this.passenger);
        console.groupEnd();
    }
    
}