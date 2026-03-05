package payments;

public class CashPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment Method: Cash");
        System.out.println("Paid Amount: ₱" + amount);
        return true; // always successful for demo
    }
}