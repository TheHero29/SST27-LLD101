
public class ChocolateDecorator extends Beverage{
    private final int CHOCOLATE_COST = 6;
    private Beverage beverage;
    public ChocolateDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost(){
        int baseCost = beverage.cost();
        baseCost += CHOCOLATE_COST;
        return baseCost;
    }
}
