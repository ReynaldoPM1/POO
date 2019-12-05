<?php
    require_once('Car.php');
    class UberBlack extends Car{
        public $typeCarAccepted;
        public $seatsMaterial;

        public function __contruct($license, $driver, $typeCarAccepted, $seatsMaterial){
            parent:: __contruct($license, $driver);
            $this->typeCarAccepted = $typeCarAccepted;
            $this->seatsMaterial = $seatsMaterial;
        }
    }
?>