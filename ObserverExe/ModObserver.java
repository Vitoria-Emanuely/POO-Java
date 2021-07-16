package ObserverExe;

public class ModObserver implements Observer {
	private int valor;
	private ConcreteSubject concreteSubject;
	
	public ModObserver(ConcreteSubject cs) {
		this.concreteSubject = cs;
		this.concreteSubject.registerObserver(this);
	}
	
	@Override
	public void update(int val, int valS) {
		this.valor = val % valS;
		System.out.println("O resto da divisão é: " + this.valor);
	}
	
	public void remove() {
		this.concreteSubject.removeObserver(this);
	}
}
