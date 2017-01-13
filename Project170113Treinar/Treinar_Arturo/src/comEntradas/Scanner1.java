package comEntradas;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = leitor.nextLine();
		
		System.out.print("Sobrenome: ");
		String sobrenome = leitor.nextLine();
	
		System.out.print("natural de: ");
		String end = leitor.nextLine();

		System.out.print("Quantas vezes? :");
		int qtde = leitor.nextInt();
		leitor.close();// precisa sempre fechar o escanner

				for (int x = 1; x <= qtde; x++) {
			System.out.println(x + "-" + nome +" "+sobrenome+" nasceu em "+end);
		}
	}

}
