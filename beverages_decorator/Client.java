public class Client {
	public static void main(String[] args) {

		Beverage coffee = new Cappuccino();
		System.out.println("Coffee");
		System.out.println(coffee.cost());

		Beverage chocolateCoffee = new ChocolateDecorator(coffee);
		System.out.println("Chocolate Coffee");
		System.out.println(chocolateCoffee.cost());

		Beverage latte = new Latte();
		System.out.println("Latte");
		System.out.println(latte.cost());

		Beverage doubleEspressoLatte = new EspressoShots(latte,2);
		System.out.println("Double Espresso Latte");
		System.out.println(doubleEspressoLatte.cost());
	}

}