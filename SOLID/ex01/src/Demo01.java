

public class Demo01 {
    public static void main(String[] args) {
        new OrderService(0.18,new EmailClient()).checkout("a@shop.com", 100.0);
    }
}
