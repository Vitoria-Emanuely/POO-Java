package PizzariaFactory;

public class PepperoniPizza extends Pizza {
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("Queijo Muzzarella, Lingui�a Pepperoni");
	}
}
