class Main{
    public static void main(String[] args){
        System.out.println("hola mundo");
        Car car = new Car();
        car.license= "AMQ123";
        car.drive = "Reynaldo PAredes";
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "WEJD12";
        car2.drive = "Erick Daniel";
        car2.passegenger= 2;
        car2.printDataCar();
        car2.printDataCar();
        car2.printDataCar();
        
    }
}