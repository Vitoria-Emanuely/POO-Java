package DecoratorCafe;

public class Mocha extends CondimentDecorator {
	//Relacionamento associativo
	Beverage beverage;
	
	public Mocha(Beverage beverage ) {
		this.beverage = beverage;
	}
	
	@Override
	//Recursividade
	//Cafe e depois os decoradores
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}
}
