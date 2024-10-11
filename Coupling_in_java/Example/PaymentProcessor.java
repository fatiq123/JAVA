package Coupling_in_java.Example;

public class PaymentProcessor {
    
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void paid(double paidAmount) {
        paymentGateway.processPayment(paidAmount);
    }


}
