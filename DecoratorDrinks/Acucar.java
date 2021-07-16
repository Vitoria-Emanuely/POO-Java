package DecoratorDrinks;

public class Acucar extends Condimento {
	Drink drink;
	
	public Acucar(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDescription() {
		return drink.getDescription() + ", Acucar";
	}
	
	@Override
	public double cost() {
		return 0.50 + drink.cost();
	}
}
