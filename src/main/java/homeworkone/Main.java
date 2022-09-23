package homeworkone;

public class Main {

    public static void main(String[] args) {
        //Engine "class"
        Engine engine = new Engine();
        //4 objects
        Bike bike = new Bike("Harley",2,2500, engine, 44.5f);
        Car car = new Car("BMW", 3, 12000, engine,78.3f);
        RollerCoaster rollerCoaster = new RollerCoaster(12, 2);
        Truck truck = new Truck("Ford",1, 15500, engine, 66.6f);

        //array to store vehicles
        Vehicle[] vehicles = new Vehicle[] {bike, car, truck};
        //invoke to print names and prices of vehicles
        //array to store rideable rides
        IRideable[] rides = new IRideable[] {bike, car, rollerCoaster, truck}; //**
        //invoke printVehicleNamesAndPrices - NEED HELP
        //invoke getSpeedOfRideableObjects() - NEED HELP
        //invoke totalAfterTax
        bike.totalAfterTax();
        car.totalAfterTax();
        truck.totalAfterTax();
        //invoke totalBeforeTax
        System.out.println("bike before tax is $" + bike.totalBeforeTax());
        System.out.println("car before tax is $" + car.totalBeforeTax());
        System.out.println("truck before tax is $" + truck.totalBeforeTax());
    }

}
