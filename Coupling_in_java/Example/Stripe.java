package Coupling_in_java.Example;

public class Stripe implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment using Stripe: " + amount);
    }
}
