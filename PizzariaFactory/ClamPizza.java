package PizzariaFactory;

public class ClamPizza extends Pizza {
	@Override
	public void prepare() {
		super.prepare();
		System.out.println("Queijo Muzzarella, Atum e Cebola");
	}
}
