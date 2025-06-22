package StrategyPattern;

public class PaymentContext {
	private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) 
    {
        this.paymentStrategy = paymentStrategy;
    }
    public void payAmount(double amount) 
    {
        if (paymentStrategy == null) 
        {
            System.out.println("Please select a payment method first.");
        } 
        else 
        {
            paymentStrategy.pay(amount);
        }
    }

}
