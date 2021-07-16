package DecoratorDrinks;

public class Caipirinha extends Drink {
	public Caipirinha() {
		description = "Nossa caipirinha contém: cachaca, limao, gelo e acucar";
	}
	
	@Override
	public double cost() {
		return 15.45;
	}
}
