class Main{
    public static void main(String[] args){
        System.out.println("hola mundo");
        UberX uberX = new UberX("AMQ123", new Account("Reynaldo PAredes", "AND38"), "Chevrolet", "Sonic" );
        uberX.passegenger = 4;
        uberX.printDataCar();

        
        
    }
}