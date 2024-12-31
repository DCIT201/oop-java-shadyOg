import java.util.ArrayList;
import java.util.List;

public class RentalAgency implements LoyaltyProgram{
    private String agencyName;
    private final List<Vehicle> fleet;
    private final List<Customer> customers;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void rentVehicle(Rentable vehicle, Customer customer, int days) {
        if (fleet.contains(vehicle) && customers.contains(customer)) {
            vehicle.rent(customer, days);

            customer.addToRentalHistory((Vehicle) vehicle);
            addPoints(customer, days);
        }
        else{
            System.out.println("We do not have this vehicle in our fleet");
        }


    }


    public void returningVehicle(Rentable vehicle) {
        if (vehicle != null) {
        vehicle.returnVehicle();
    }
        else
            System.out.println("Vehicle cannot be null");
    }

    @Override
    public void addPoints(Customer customer, int days) {
        int points = days * 10; // Example: 10 points per rental day
        customer.addLoyaltyPoints(points);
        System.out.println(customer.getCustomerName() + " earned " + points + " loyalty points.");
    }

    @Override
    public int calculatePoints(Customer customer) {
        return customer.getLoyaltyPoints();
    }

    public void rateVehicle(Vehicle vehicle, int rating) {
        vehicle.rateVehicle(rating);
    }


    public void generateReport() {
        for (Vehicle vehicle : fleet) {
            System.out.println("Vehicle: " + vehicle.getModel() + " | Available: " + vehicle.isAvailableForRental());
        }
    }

}
