package Coupling_in_java.Example;

public class Main {
    
    public static void main(String[] args) {
        
        // Loose Coupling
        // Not get stucked

        // Payment using Paypal
        PaymentGateway paymentGateway = new Paypal();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        paymentProcessor.paid(100.0);

        // Payment using Stripe
        PaymentGateway paymentGateway2 = new Stripe();
        PaymentProcessor paymentProcessor2 = new PaymentProcessor(paymentGateway2);
        paymentProcessor2.paid(200.0);

    }

}
