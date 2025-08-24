public class Wallet extends Payment {

    Wallet(double a) {
        super(a);
    }
    
    public String pay(){
        return "Wallet debit: " + amount;
    }
    
}