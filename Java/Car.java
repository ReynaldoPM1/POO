class Car{
    Integer id;
    String license;
    Account drive;
    Integer passegenger;


        public Car(String license, Account drive){
            this.license = license;
            this.drive = drive;
        }
    void printDataCar(){
        System.out.println("License: " + license + "Name driver: " + drive.name);
    }
}