public abstract class Vehicle {
    private String vehicleID;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleID, String model, double baseRentalRate) {
        this.vehicleID = vehicleID;
        this.model = model;
        if ( baseRentalRate > 0 ) {
            this.baseRentalRate = baseRentalRate;
        }
        else {
            System.out.println("Invalid Rental Rate");
        }
        this.isAvailable = true;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setBaseRentalRate(double baseRentalRate){
        if (baseRentalRate > 0) {
            this.baseRentalRate = baseRentalRate;
        }
        else{
            System.out.println("Invalid Rental Rate");
        }
    }

    public double getBaseRentalRate(){
        return baseRentalRate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = true;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    //Abstract methods
    public abstract double calculatedRentalCost(int days);
    public abstract boolean isAvailableForRental();


    public abstract void rent(Customer customer, int days);

    public abstract void returnVehicle();
}
