import java.time.LocalDate;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double rentalCost;
    private LocalDate rentalDate;
    private LocalDate returnDate;


    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays, LocalDate rentalDate) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalDate = rentalDate;
        this.returnDate = null;
        this.rentalCost = calculateRentalCost();
    }


    public double calculateRentalCost() {
        return vehicle.calculatedRentalCost(rentalDays);
    }


    public void generateInvoice() {
        System.out.println("Rental Invoice:");
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Vehicle: " + vehicle.getModel());
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Rental Cost: $" + rentalCost);
        System.out.println("Rental Start Date: " + rentalDate);
        if (returnDate != null) {
            System.out.println("Return Date: " + returnDate);
        }
    }


    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    public String getRentalDetails() {
        return "Rental Transaction [Customer: " + customer.getCustomerName() +
                ", Vehicle: " + vehicle.getModel() +
                ", Rental Days: " + rentalDays +
                ", Rental Cost: $" + rentalCost +
                ", Rental Date: " + rentalDate +
                ", Return Date: " + returnDate + "]";
    }


    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public int getRentalDays()
    {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays)
    {
        this.rentalDays = rentalDays;
    }

    public double getRentalCost()
    {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost)
    {
        this.rentalCost = rentalCost;
    }

    public LocalDate getRentalDate()
    {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate)
    {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate()
    {
        return returnDate;
    }
}
