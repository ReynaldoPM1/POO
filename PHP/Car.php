<?php

    class Car{
        Public $id;
        public$license;
        public $driver;
        public $passenger;

        public function __construc($license, driver){
            $this->license = $license;
            this->driver = $driver;
        }

        public function printDataCar(){
            echo "Licencia:  $this->license Driver: ".this->driver->name;
        }
    }
?>