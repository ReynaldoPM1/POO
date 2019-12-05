<?php
    require_once("car.php");
    require_once("UberX.php");
    require_once("Account.php");
    
    $uberX = new UberX("CBD123", new Account("Andres herrera", "AND4546", "chevrolet","spark"))
    $iberX->printDataCar();

?>