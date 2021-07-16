package DecoratorDrinks;

public class Maracuja extends Condimento {
	Drink drink;
	
	public Maracuja(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + ", Maracuja";
	}
	
	@Override
	public double cost() {
		return 1.99 + drink.cost();
	}
}
