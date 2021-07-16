package DecoratorCafe;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Descafeinado";
	}
	
	@Override
	public double cost() {
		return 3.80;
	}
}
