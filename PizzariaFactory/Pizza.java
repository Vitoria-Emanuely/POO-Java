package PizzariaFactory;

public abstract class Pizza {
	public void prepare() {
		System.out.println("Pizza sendo preparada");
	}
	
	public void bake() {
		System.out.println("Pizza est� no forno");
	}
	
	public void cut() {
		System.out.println("Pizza sendo fatiada");
	}
	
	public void box() {
		System.out.println("Pizza sendo embalada");
	}
}
