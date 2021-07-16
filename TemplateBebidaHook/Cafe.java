package TemplateBebidaHook;

import java.io.*;

public class Cafe extends BebidaCafeina {
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}
	
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y"))
			return true;
		else
			return false;
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");
		
		//Classe que lê do teclado
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		
		if (answer == null) 
			return "no";
		return answer;
	}
}
