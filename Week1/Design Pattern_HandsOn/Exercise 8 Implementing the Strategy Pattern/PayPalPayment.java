package StrategyPattern;

public class PayPalPayment  implements PaymentStrategy {
    private String email;
    public PayPalPayment(String email) 
    {
        this.email = email;
    }
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using PayPal account: " + email);
    }
}