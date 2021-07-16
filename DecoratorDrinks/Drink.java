package DecoratorDrinks;

public abstract class Drink {
	String description = "Drink Desconhecido";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
