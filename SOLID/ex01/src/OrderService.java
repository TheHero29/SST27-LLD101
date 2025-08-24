public class OrderService {
    double taxRate;
    IEmailClient email;

    OrderService(double taxRate, IEmailClient email){
        this.taxRate = taxRate;
        this.email = email;
    }

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}