package PizzariaFactory;

public class PedirPizza {

	public static void main(String[] args) {
		SimplePizzaFactory spf = new SimplePizzaFactory();
		PizzaStore pizzaria = new PizzaStore(spf);
		
		pizzaria.orderPizza("cheese");
		pizzaria.orderPizza("pepperoni");

	}

}
