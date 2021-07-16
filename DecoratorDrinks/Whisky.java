package DecoratorDrinks;

public class Whisky extends Caipira {
	Drink drink;
	
	public Whisky(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + " Whisky";
	}
	
	@Override
	public double cost() {
		return 15.30 + drink.cost();
	}
}
