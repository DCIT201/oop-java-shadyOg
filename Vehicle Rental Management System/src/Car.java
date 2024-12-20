public class Car extends Vehicle {
    private boolean hasAirConditioning;


    public Car(String vehicleID, String model, double baseRentalRate, boolean hasAirConditioning) {
        super(vehicleID, model, baseRentalRate);
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculatedRentalCost(int days) {
        return getBaseRentalRate() * days + (hasAirConditioning ? 50 : 0);
    }

    @Override
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (getIsAvailable()) {
            System.out.println("Renting " + getModel() + " to " + customer.getName() + " for " + days + " days.");
            setIsAvailable(false);  // Mark the vehicle as unavailable
        } else {
            System.out.println(getModel() + " is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println(getModel() + " has been returned.");
        setIsAvailable(true);  // Mark the vehicle as available
    }



}
