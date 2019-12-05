class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account drive, String brand, String model){
        super(license, drive);
        this.brand = brand;
        this.model = model;
    }
}