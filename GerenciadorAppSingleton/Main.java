package GerenciadorAppSingleton;

public class Main {

	public static void main(String[] args) {
		GerenciadorApp.getInstance().registrarPrograma("Google Chrome");
		GerenciadorApp.getInstance().registrarPrograma("eclipse.exe");
		GerenciadorApp.getInstance().registrarPrograma("Discord");

	}

}
