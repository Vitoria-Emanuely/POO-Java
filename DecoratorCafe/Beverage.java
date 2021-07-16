package DecoratorCafe;

public abstract class Beverage {
	String description = "Bebida Desconhecida";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
