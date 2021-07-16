package DecoratorDrinks;

public class DecoratorTest {

	public static void main(String[] args) {
		Drink drink = new Caipira();
		drink = new Whisky(drink);
		System.out.println(drink.getDescription() + " - R$" +
				drink.cost());
		
		Drink drink2 = new Caipira();
		drink2 = new Tequila(drink2);
		drink2 = new Limao(drink2);
		drink2 = new Acucar(drink2);
		drink2 = new Morango(drink2);
		System.out.print(drink2.getDescription());
		System.out.println(" - R$" + drink2.cost());
		
		Drink drink3 = new Caipirinha();
		System.out.println(drink3.getDescription() + " - R$" +
				drink3.cost());
		
		Drink drink4 = new Caipira();
		drink4 = new Saque(drink4);
		drink4 = new Kiwi(drink4);
		drink4 = new Acucar(drink4);
		drink4 = new Maracuja(drink4);
		System.out.print(drink4.getDescription());
		System.out.println(" - R$" + drink4.cost());
	}

}
