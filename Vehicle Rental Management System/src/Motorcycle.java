public class Motorcycle extends Vehicle {
    public boolean hasHelmet;

    public Motorcycle(String vehicleID, String model, double baseRentalRate, boolean hasHelmet) {
        super(vehicleID, model, baseRentalRate);
        this.hasHelmet = hasHelmet;
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
            System.out.println("Renting " + getModel() + " to " + customer.getName() + " for " + days + " days.");
            setIsAvailable(false);
        } else {
            System.out.println(getModel() + " is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println(getModel() + " has been returned.");
        setIsAvailable(true);
    }



}
