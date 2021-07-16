package DecoratorDrinks;

public class Limao extends Condimento {
	Drink drink;
	
	public Limao(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + ", Limao";
	}
	
	@Override
	public double cost() {
		return 1.50 + drink.cost();
	}
}
