package DecoratorDrinks;

public class Vinho extends Caipira {
	Drink drink;
	
	public Vinho(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + " Vinho";
	}
	
	@Override
	public double cost() {
		return 6.99 + drink.cost();
	}
}
