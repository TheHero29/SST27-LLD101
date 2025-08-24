public class Standard extends Shipment {

    Standard(double w) {
        super(w);
    }

    @Override
    double getCost() {
        return 50 + 5*weightKg;
    }
    
}
