<?php 
    require_once('car.php'); 
    require_once("uberX.php");
    require_once("uberVan.php");
    require_once("uberPool.php");
    require_once("account.php");

    $uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
    $uberX->setPassenger(4);
    $uberX->printDataCar();
    print "\n";
    print "\n";
    $uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Dodge", "Attitude");
    $uberPool->setPassenger(3);
    $uberPool->printDataCar();
    print "\n";
    print "\n";
    //$car = new Car('LEMM-180300', 'Mond-Mond');
    //print_r($car);
    $bochito = new Car('LEMM-180300', new Account('Marco Antonio', 'POK876'));
    $bochito->setPassenger(2);
    $bochito->printDataCar();
    print "\n";
    print "\n";
    $uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "RAR456"), "Nissan", "Versa");
    $uberVan->setPassenger(7);
    $uberVan->printDataCar();
        
    print "\n";
    print "\n";
    print "Hola, canicheeeees!";
?>


    
    


