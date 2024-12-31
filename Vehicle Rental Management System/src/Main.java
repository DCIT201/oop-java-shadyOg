import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create rental agency, customers, and vehicles
        RentalAgency rentalAgency = new RentalAgency("Best Rentals");

        Customer customer = new Customer("John Doe", "12345", "02449695786");

        Car car = new Car("C001", "Toyota Corolla", 100.0, true);
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha", 80.0, false);
        Truck truck = new Truck("T001", "Ford F-150", 120.0, 2);

        // Add customers and vehicles to the rental agency
        rentalAgency.addCustomer(customer);
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        // Rent a vehicle
        System.out.println("Renting vehicle to customer...");
        rentalAgency.rentVehicle(car, customer, 5);
        car.calculatedRentalCost(5);

        // Check vehicle availability and rental history
        System.out.println("Is the car available? " + car.isAvailableForRental());
        System.out.println("Rental history for customer: " + customer.getRentalHistory().size() + " rental(s)");


        // Return the vehicle
        System.out.println("Returning vehicle...");
        rentalAgency.returningVehicle(car);
        System.out.println("Is the car available after returning? " + car.isAvailableForRental());

        //Generate invoice
        RentalTransaction rentalTransaction1 = new RentalTransaction( car, customer, 5,
                LocalDate.of(2024,12,21));
        rentalTransaction1.setReturnDate(LocalDate.of(2024,12,26));
        rentalTransaction1.generateInvoice();


        // Rent another vehicle
        System.out.println("Renting motorcycle to customer...");
        rentalAgency.rentVehicle(motorcycle, customer, 3);
        System.out.println("Rental history for customer: " + customer.getRentalHistory().size() + " rental(s)");

        System.out.println("Returning vehicle...");
        rentalAgency.returningVehicle(motorcycle);
        System.out.println("Is the motorcycle available after returning? " + motorcycle.isAvailableForRental());

        //Generate invoice
        RentalTransaction rentalTransaction2 = new RentalTransaction( motorcycle, customer, 3,
                LocalDate.of(2024,12,28));
        rentalTransaction2.setReturnDate(LocalDate.of(2024,12,31));
        rentalTransaction2.generateInvoice();

        //Creating another customer
        Customer newCustomer = new Customer("12345", "Jane Smith", "02447695786");
        rentalAgency.addCustomer(newCustomer);
        System.out.println("Renting vehicle to customer...");
        rentalAgency.rentVehicle(new Car("C999", "Non-Existent Car",
                40.0, false), newCustomer, 2);
    }
}
