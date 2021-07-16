package ObserverExe;

public class ObserverTester {

	public static void main(String[] args) {
		ConcreteSubject cj = new ConcreteSubject();
		
		DivObserver div = new DivObserver(cj);
		ModObserver mod = new ModObserver(cj);
		
		cj.setValor(5, 1);
		System.out.println("------------------------------------------");
		//div.remove();
		//mod.remove();
		//Lembrando que como foi definido o tipo inteiro, ele só resultará em valores inteiros
		cj.setValor(256, 3);
		System.out.println("------------------------------------------");
		cj.setValor(420, 9);
	}

}
