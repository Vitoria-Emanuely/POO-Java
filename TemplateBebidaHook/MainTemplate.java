package TemplateBebidaHook;

public class MainTemplate {

	public static void main(String[] args) {
		Cha ch1 = new Cha();
		Cafe cf1 = new Cafe();
		System.out.println("Making tea ...");
		ch1.prepare();
		System.out.println("\nMaking coffee ...");
		cf1.prepare();

	}

}
