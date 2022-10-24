<?php
require_once('car.php');
class UberX extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        //en vez de "super()"...
        parent::__construct($license,$driver);
        $this->brand = $brand;
        $this->model = $model;
    }

}
?>