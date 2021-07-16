package DecoratorDrinks;

public class Abacaxi extends Condimento {
	Drink drink;
	
	public Abacaxi(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + ", Abacaxi";
	}
	
	@Override
	public double cost() {
		return 2.10 + drink.cost();
	}
}
