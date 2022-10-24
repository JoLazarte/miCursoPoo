//import Car from "./car.js"
//export default class UberX extends Car {
class UberX extends Car {
    constructor(license, driver, brand, model) {
        super(license, driver)
        this.brand = brand;
        this.model = model;
    }

    printDataCar() {
       
        //console.group();
        console.group(this.id);
        console.log('License: ' + this.license);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log('Pasajeros: ' + this.passenger);
        console.log('Marca: ' + this.brand);
        console.log('Modelo: ' + this.model);
        console.groupEnd();
        //console.groupEnd();
    }
}