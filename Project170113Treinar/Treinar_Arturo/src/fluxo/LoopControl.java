package fluxo;

public class LoopControl {
	public static void main(String[] args) {
		/*
		 * 
		 * while(Boolean_expression) { // Statements }
		 * 
		 */

		fora: /*
				 * "label"], serve para bypassear ou parar o bucle quando achar
				 * ou ressolver
				 */

		while (true) {
			int x = 5;
			while (x < 20) {
				System.out.println("value of x : " + x * x + "\n");
				x++;
				if (x > 10) {
					System.out.println(x);
					break fora;

				}
			}
		}
	}
}
