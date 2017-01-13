package br.com.treinar.modelo;

public class LogicalOperators {
public static void main(String[] args) {
	
	boolean ehMaiorDeIdade = true;
	boolean ehpossuiIngresso = false;

	boolean podeEntrar = ehMaiorDeIdade && ehpossuiIngresso;
	System.out.println(!podeEntrar);
	System.out.println(podeEntrar);
	System.out.println(ehMaiorDeIdade || ehpossuiIngresso);
}

}