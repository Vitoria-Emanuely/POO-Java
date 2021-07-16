package TemplateCafeina;

public abstract class BebidaCafeina {
	//Template (final significa que deve seguir)
	final void prepare() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	//Private para proteger o usuário
	private void boilWater() {
		System.out.println("Boiling water");
	}
	
	private void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
