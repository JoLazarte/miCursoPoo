<?php
require_once('car.php');
class UberVan extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($license,$driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    public function setPassenger($passenger) {
    
        if ($passenger == 6) {
            $this->passenger = $passenger;
            echo "El número de pasajeros es: $this->passenger. \n";
        }
        else {
            echo "Necesitas asignar 6 pasajeros. \n";
        }
    }

    public function printDataCar(){
        echo 'La licencia es: '
        . $this->license .". \n"
        .'El conductor es: '. $this->driver->name .". \n"
        .'El documento es: ' . $this->driver->document .". \n"
        .'El tipo de auto es: '. $this->typeCarAccepted .". \n"
        .'El tipo de asiento es: ' . $this->seatsMaterial .". \n";
        
    }

}
?>