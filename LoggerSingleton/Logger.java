package LoggerSingleton;

public class Logger {
	private static Logger instancia = null;
	
	public static synchronized Logger getInstance() {
		if (instancia == null)
			instancia = new Logger();
		return instancia;
	}
	
	private Logger() {};
	
	public void registrarLog(String dados) {
		System.out.println("Vou registrar o log: " + dados);
	}
}
