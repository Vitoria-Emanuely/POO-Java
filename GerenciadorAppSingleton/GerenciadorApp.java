package GerenciadorAppSingleton;

public class GerenciadorApp {
	private static GerenciadorApp instancia = null;
	
	public static synchronized GerenciadorApp getInstance() {
		if (instancia == null)
			instancia = new GerenciadorApp();
		return instancia;
	}
	
	private GerenciadorApp() {};
	
	public void registrarPrograma(String dados) {
		System.out.println("Registrando no gerenciador o programa: " + dados);
	}
}
