package ObserverExe;
import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	private ArrayList observers;
	private int valor;
	//Diferente do diagrama, criei outro atributo para passar o segundo valor
	private int valorS;
	
	public ConcreteSubject() {
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}
	
	@Override
	public void notifyObservers() {
		for (int i = 0; i<observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this.valor, this.valorS);
		}
	}
	
	public void valorChanged() {
		notifyObservers();
	}
	
	//"Seto" os dois valores na mesma função (se não dá erro no update)
	public void setValor(int valor, int valorS) {
		this.valor = valor;
		this.valorS = valorS;
		valorChanged();
	}
}
