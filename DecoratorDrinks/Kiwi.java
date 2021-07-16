package DecoratorDrinks;

public class Kiwi extends Condimento {
	Drink drink;
	
	public Kiwi(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + ", Kiwi";
	}
	
	@Override
	public double cost() {
		return 4.25 + drink.cost();
	}
}
