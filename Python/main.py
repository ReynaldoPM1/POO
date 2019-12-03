from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "ADWD23"
    car.driver = "Andres herrera"
    print(vars(car))

    car2 = Car()
    car2.license  = "dsdad!"
    car2.driver = "Maria Magdalena"
    print(vars(car2))