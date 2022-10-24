<?php 
        require_once('account.php'); 
       
class Car {

    public int $id;
    public string $license;
    public Account $driver;
    protected int $passenger; 
    //La sigiente estructura arruina el constructor
    //public $passengers = integer;

    public function __construct(string $license, Account $driver){
        $this->license = $license;
        $this->driver = $driver;
    }
    public function printDataCar(){
        echo 'La licencia es: '
        . $this->license .". \n"
        .'El conductor es: '. $this->driver->name .". \n"
        .'El documento es: ' . $this->driver->document .". \n";
        
    }
    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        
        if ($passenger == 4) {
            $this->passenger = $passenger;
            echo "El número de pasajeros es: $this->passenger. \n";
            
        } else {
            echo "Necesitas asignar 4 pasajeros. \n";
        }
    }

    
    
}

    


//$car = new Car("GTRF_899", "Anna");
//print_r($car);
?>