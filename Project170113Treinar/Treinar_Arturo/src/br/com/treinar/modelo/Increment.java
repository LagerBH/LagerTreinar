package br.com.treinar.modelo;

public class Increment {
	public static void main(String[] args) {
		int contador=4165;
		System.out.println(contador);
		contador=contador+1;
		System.out.println(contador);
		contador++;
		System.out.println(contador);
		
		int maisUm=contador++;
		
		System.out.println(maisUm);
		System.out.println(contador++);
		System.out.println(++contador);
	}
	}
