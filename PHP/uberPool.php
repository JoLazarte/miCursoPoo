<?php
require_once('car.php');
class UberPool extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license,$driver);
        $this->brand = $brand;
        $this->model = $model;
    }

    public function printDataCar(){
        echo 'La licencia es: '
        . $this->license .". \n"
        .'El conductor es: '. $this->driver->name .". \n"
        .'El documento es: ' . $this->driver->document .". \n"
        .'La marca de auto es: '. $this->brand .". \n"
        .'El modelo de auto es: ' . $this->model .". \n";
        
    }

}
?>