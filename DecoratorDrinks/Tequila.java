package DecoratorDrinks;

public class Tequila extends Caipira {
	Drink drink;
	
	public Tequila(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + " Tequila";
	}
	
	@Override
	public double cost() {
		return 13.45 + drink.cost();
	}
}
