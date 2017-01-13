package br.com.treinar;

public class Aula {
	public static void main(String[] args) {
		Endereco casa1 = new Endereco();
			casa1.numero = 1245;
			casa1.area = (float) 150.5;
			casa1.idade = 10;
			casa1.valor = (float)20000.45;
		System.out.println("casa "+casa1.numero+" = "+casa1.area+"m²"+" = "+casa1.idade+" anos custa "+casa1.valor+" US$");
		
		Endereco casa2 = new Endereco();
			casa2.numero = 30;
			casa2.area = (float) 350.5;
			casa2.idade = 25;
			casa2.valor = (float)2500000.45;		
		
		Endereco casa3 = new Endereco();
			casa3.numero= 1250;
			casa3.area = (float) 175.05;
			casa3.idade = 15;
			casa3.valor = (float)350000.75;

		System.out.println("casa " + casa2.numero+" = "+casa2.area+"m²"+" = "+casa2.idade+" anos custa  "+casa2.valor+" US$");
		System.out.println("casa "+casa3.numero+" = "+casa3.area+"m²"+" = "+casa3.idade+" anos custa"+casa3.valor+" US$");
	}
}
