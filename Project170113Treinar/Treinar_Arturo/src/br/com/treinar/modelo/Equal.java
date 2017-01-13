package br.com.treinar.modelo;

public class Equal {
	public static void main(String[] args) {
		int a = 10, b = 10, c = 12;
		System.out.println(a == b); //imprime falso
		System.out.println(a == c); //imprime falso

		Caneta bic = new Caneta();
		bic.cor = "azul";
		bic.preco = 12.50;
		
		Caneta pena = new Caneta();
		pena.cor = "Azul";
		pena.preco =12.5;
		
		System.out.println(bic == pena); //imprime falso
		System.out.println(bic.cor == pena.cor);
		
		Caneta copia = pena;
		
		System.out.println(copia == pena); //imprime verdadero
		System.out.println(copia.cor); //imprime azul
		
		copia = new Caneta();
		System.out.println(copia == pena); //imprime falso
	}
}
