// EspressoShots.java
public class EspressoShots extends Beverage {
    private int shots;
    private final int SHOT_COST = 5;
    private Beverage beverage;
    public EspressoShots(Beverage beverage, int shots) {
        this.beverage = beverage;
        this.shots = shots;
    }

    @Override
    public int cost() {
        int baseCost = beverage.cost();
        int additionalCost = shots * SHOT_COST;
        return baseCost + additionalCost;
    }
}