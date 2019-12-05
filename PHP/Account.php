<?php

Class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public$password;

    public function __contruct($name, $docuemnt) {
        $this->name = $name;
        $this->document = $document;
    }
}
?>