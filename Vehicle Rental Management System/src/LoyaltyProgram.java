public interface LoyaltyProgram {
    void addPoints(Customer customer, int days);
    int calculatePoints(Customer customer);
}
