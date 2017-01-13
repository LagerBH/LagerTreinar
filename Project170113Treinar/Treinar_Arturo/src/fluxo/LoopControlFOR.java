//
// for(initialization; Boolean_expression; update) {
// Statements
// }
//
package fluxo;

import java.util.Scanner;

public class LoopControlFOR {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Quantidade: ");
		int quantidade = leitor.nextInt();
		leitor.close();//precisa sempre fechar o escanner  

		for (int x = 1; x <= quantidade; x++) {
			System.out.println(x + "- Arturo");
		}
}

}
