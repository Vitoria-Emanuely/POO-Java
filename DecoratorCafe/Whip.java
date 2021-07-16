package DecoratorCafe;

public class Whip extends CondimentDecorator {
	//Relacionamento associativo
	Beverage beverage;
	
	public Whip(Beverage beverage ) {
		this.beverage = beverage;
	}
	
	@Override
	//Recursividade
	//Cafe e depois os decoradores
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	@Override
	public double cost() {
		return 0.35 + beverage.cost();
	}
}
