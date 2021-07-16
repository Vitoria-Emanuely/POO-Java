package DecoratorDrinks;

public class Saque extends Caipira {
	Drink drink;
	
	public Saque(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + " Saque";
	}
	
	@Override
	public double cost() {
		return 8.50 + drink.cost();
	}
}
