package DecoratorDrinks;

public class Vodka extends Caipira {
	Drink drink;
	
	public Vodka(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + " Vodka";
	}
	
	@Override
	public double cost() {
		return 10.80 + drink.cost();
	}
}
