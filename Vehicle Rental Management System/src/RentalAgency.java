import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }


    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }


    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental() && customer.isEligibleToRent()) {
            vehicle.rent(customer, days);
            customer.addToRentalHistory(vehicle);
            System.out.println("Vehicle rented successfully!");
        } else {
            System.out.println("Unable to rent vehicle. Either the vehicle is unavailable or the customer is not eligible.");
        }
    }


    public void returnVehicle(Vehicle vehicle) {
        vehicle.returnVehicle();
        System.out.println("Vehicle returned successfully!");
    }


    public void generateReport() {
        for (Vehicle vehicle : fleet) {
            System.out.println("Vehicle: " + vehicle.getModel() + " | Available: " + vehicle.isAvailableForRental());
        }
    }
}
