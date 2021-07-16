package DecoratorCafe;

public class DecoratorTest {

	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + " $" +
		beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.print(beverage2.getDescription());
		System.out.println(" $" + beverage2.cost());
	}

}
