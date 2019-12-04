class Main{
    public static void main(String[] args){
        System.out.println("hola mundo");
        Car car = new Car("AMQ123", new Account("Reynaldo PAredes", "AND38"));
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("WEJD12", new Account("Erick Daniel", "abddb232"));
        car2.passegenger= 2;
        car2.printDataCar();
        
    }
}