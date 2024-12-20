import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String contactInfo;
    private List<Vehicle> rentalHistory;


    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.rentalHistory = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }


    public void addToRentalHistory(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }


    public boolean isEligibleToRent() {
        return rentalHistory.size() < 5;
    }
}
