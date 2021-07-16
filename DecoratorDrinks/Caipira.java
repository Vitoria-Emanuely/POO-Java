package DecoratorDrinks;

public class Caipira extends Drink {
	public Caipira() {
		description = "Caipira de";
	}
	
	@Override
	public double cost() {
		return 3.00;
	}
}
