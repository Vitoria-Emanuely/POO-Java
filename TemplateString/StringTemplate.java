package TemplateString;
import java.util.Scanner;

public abstract class StringTemplate {
	String s;
	final void criacao() {
		s = lerString();
		s = transformarString(s);
		imprimirString(s);
	}
	
	public String lerString() {
		String s = null;
		boolean i = true;
		while (i == true) {
			System.out.println("Informe uma palavra:");
			Scanner sca = new Scanner(System.in);
			s = sca.nextLine();
			if (!s.equals("")) 
				i = false;
		}
		return s;
	}
	
	abstract String transformarString(String s);
	
	public void imprimirString(String s) {
		System.out.println(s);
	}
}
