package ObserverExe;

public class DivObserver implements Observer {
	private int valor;
	private ConcreteSubject concreteSubject;
	
	public DivObserver(ConcreteSubject cs) {
		this.concreteSubject = cs;
		this.concreteSubject.registerObserver(this);
	}
	
	@Override
	public void update(int val, int valS) {
		this.valor = val / valS;
		System.out.println("O resultado da divisão é: " + this.valor);
	}
	
	public void remove() {
		this.concreteSubject.removeObserver(this);
	}
}
