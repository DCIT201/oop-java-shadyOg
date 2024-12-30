public abstract class Vehicle implements Rateable{
    private final String vehicleID;
    private final String model;
    private double baseRentalRate;
    private boolean isAvailable;
    private int rating;

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


    public String getVehicleID() {
        return vehicleID;
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

    @Override
    public void rateVehicle(int rating) {
        this.rating = rating;
        System.out.println("Vehicle " + this.model + " has been rated " + rating + " stars.");
    }

    @Override
    public void rateCustomer(int rating) {
        // Vehicles don't rate customers, so I left this empty
    }

    //Abstract methods
    public abstract double calculatedRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "VehicleID: " + vehicleID + ", Model: " + model + ", Base Rental Rate: $"
                + baseRentalRate + ", Available: " + isAvailable;
    }




}
