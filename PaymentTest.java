class PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

class CreditCardPayment extends PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment extends PaymentGateway {
    void processPayment(double amount) {
        System.out.println("Connecting to PayPal for payment of $" + amount);
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment();
        PaymentGateway p2 = new PayPalPayment();
        p1.processPayment(1000);
        p2.processPayment(500);
    }
}
