public class Upi extends Payment {

    public Upi(double a) {
        super(a);
    }
    
    public String pay(){
        return "Paid via UPI: " + amount;
    }

}
