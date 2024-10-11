package Coupling_in_java.Example;

public class Paypal implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment using Paypal: " + amount);
    }
}
