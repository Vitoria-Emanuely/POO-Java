package TemplateString;

public class Inverte extends StringTemplate {
	public String transformarString(String s) {
		String si = new StringBuilder(s).reverse().toString();
		return si;
	}
}
