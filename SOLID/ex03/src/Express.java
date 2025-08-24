public class Express extends Shipment {
    
    Express(double w) {
        super(w);
    }

    double getCost(){
        return 80 + 8*weightKg;
    }
}
