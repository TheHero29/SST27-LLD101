public class Card extends Payment {

    Card(double a) {
        super(a);
    }
    
    public String pay(){
        return "Charged card: " + amount;
    }
    
}