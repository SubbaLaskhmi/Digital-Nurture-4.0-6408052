package StrategyPattern;

public class StrategyPatternTest {
	public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(1200.50);
        System.out.println("\n---\n");
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        context.payAmount(2400.00);
    }
}