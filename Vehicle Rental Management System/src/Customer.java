import java.util.ArrayList;
import java.util.List;

public class Customer implements Rateable{
    private final String customerID;
    private final String customerName;
    private String contactInfo;
    private List<Vehicle> rentalHistory;
    private int loyaltyPoints;
    private int rating;


    public Customer(String customerID, String customerName, String contactInfo) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.contactInfo = contactInfo;
        this.rentalHistory = new ArrayList<>();
    }


    public String getCustomerID() {
        return customerID;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
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

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }

    @Override
    public void rateVehicle(int rating) {
        // Customers don't rate vehicles, so we can leave this empty
    }

    @Override
    public void rateCustomer(int rating) {
        this.rating = rating;
        System.out.println("Customer " + this.customerName + " has been rated " + rating + " stars.");
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name: " + customerName);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Rental History: " + rentalHistory.size() + " rentals.");
    }
}
