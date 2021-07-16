package DecoratorCafe;

public class Soy extends CondimentDecorator {
	//Relacionamento associativo
	Beverage beverage;
	
	public Soy(Beverage beverage ) {
		this.beverage = beverage;
	}
	
	@Override
	//Recursividade
	//Cafe e depois os decoradores
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	@Override
	public double cost() {
		return 0.25 + beverage.cost();
	}
}
