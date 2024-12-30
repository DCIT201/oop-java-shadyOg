public class Motorcycle extends Vehicle implements Rentable {
    private boolean hasHelmet;

    public Motorcycle(String vehicleID, String model, double baseRentalRate, boolean hasHelmet) {
        super(vehicleID, model, baseRentalRate);
        this.hasHelmet = hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    public boolean hasAirConditioning() {
        return hasHelmet;
    }


    @Override
    public double calculatedRentalCost(int days){
        return getBaseRentalRate()*days + (hasHelmet? 20 : 0);
    }

    @Override
    public boolean isAvailableForRental(){
        return getIsAvailable();
    }



    @Override
    public void rent(Customer customer, int days) {
        if (getIsAvailable()) {
            System.out.println("Renting " + getModel() + " to " + customer.getCustomerName() + " for " + days + " days.");
            setIsAvailable(false);  // Mark the vehicle as unavailable
        } else {
            System.out.println(getModel() + " is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println(getModel() + " has been returned.");
        setIsAvailable(true);
    }

    @Override
    public String toString() {
        return super.toString() + " Has Helmet: " + hasHelmet;
    }



}
