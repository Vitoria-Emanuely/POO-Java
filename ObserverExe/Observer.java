package ObserverExe;

public interface Observer {
	//Ao acrescentar o segundo valor no ConcreteSubject, altera-se o update tamb�m, para atualizar os dois valores
	public void update(int valor, int valorS);
}
