package DecoratorCafe;

public class Milk extends CondimentDecorator {
	//Relacionamento associativo
	Beverage beverage;
	
	public Milk(Beverage beverage ) {
		this.beverage = beverage;
	}
	
	@Override
	//Recursividade
	//Cafe e depois os decoradores
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
	
	@Override
	public double cost() {
		return 0.30 + beverage.cost();
	}
}
