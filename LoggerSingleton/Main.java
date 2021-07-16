package LoggerSingleton;

public class Main {

	public static void main(String[] args) {
		Logger.getInstance().registrarLog("Usuário acessou");
		Logger.getInstance().registrarLog("Usuário1 acessou");

	}

}
