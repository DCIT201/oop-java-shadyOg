public class Main {
    public static void main(String[] args) {
        // Create some vehicles
        Car car = new Car("V123", "Sedan", 50.0, true);
        Truck truck = new Truck("V456", "Pickup", 80.0, 3000);
        Motorcycle motorcycle = new Motorcycle("V789", "Harley", 40.0, true);

        // Create a rental agency and add vehicles
        RentalAgency agency = new RentalAgency();
        agency.addVehicle(car);
        agency.addVehicle(truck);
        agency.addVehicle(motorcycle);

        // Create a customer
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Rent a vehicle
        agency.rentVehicle(car, customer, 5);  // Renting the car for 5 days

        // Return a vehicle
        agency.returnVehicle(car);

        // Generate a rental report
        agency.generateReport();
    }
}
