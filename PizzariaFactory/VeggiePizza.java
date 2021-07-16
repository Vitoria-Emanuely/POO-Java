package PizzariaFactory;

public class VeggiePizza extends Pizza {
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("Queijo Muzzarella, RPalmito, Milho, Ervilha");
	}
}
