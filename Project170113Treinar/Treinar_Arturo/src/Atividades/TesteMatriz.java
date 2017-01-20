package Atividades;

public class TesteMatriz {
	public static void main(String[] args) {
		int[][] matriz = { { 10, 20, 30 }, { 40, 50, 60 }, { 90, 100, 110 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz.length; k++) {
			System.out.println(matriz[i][k] + "\t");
				System.out.println(matriz[k][i] + "\t");

			}
		}

	}
}
