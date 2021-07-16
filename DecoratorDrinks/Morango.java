package DecoratorDrinks;

public class Morango extends Condimento {
	Drink drink;
	
	public Morango(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + ", Morango";
	}
	
	@Override
	public double cost() {
		return 3.00 + drink.cost();
	}
}
