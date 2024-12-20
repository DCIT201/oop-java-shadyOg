public class Truck extends Vehicle {
    public double towingCapacity;

    public Truck (String vehicleID, String model, double baseRentalRate, double TowingCapacity) {
        super(vehicleID, model, baseRentalRate);
        this.towingCapacity = towingCapacity;
    }

    public void setTowingCapacity(double TowingCapacity) {
        if (towingCapacity > 200){
            System.out.println("Invalid Towing Capacity");
        }
        else {
            this.towingCapacity = TowingCapacity;
        }
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public double calculatedRentalCost(int days){
        return getBaseRentalRate() * days + towingCapacity > 5000 ? 200 : 100;
    }

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
