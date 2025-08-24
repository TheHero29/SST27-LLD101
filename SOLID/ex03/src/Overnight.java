public class Overnight extends Shipment {

    Overnight(double w) {
        super(w);
    }

    @Override
    double getCost() {
        return 120 + 10*weightKg;
    }
    
}