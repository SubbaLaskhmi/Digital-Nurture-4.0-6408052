package AdapterPattern;

public class StripeGateway {
    public void makeStripeCharge(double amount) {
        System.out.println("Charged " + amount + " using Stripe.");
    }
}
