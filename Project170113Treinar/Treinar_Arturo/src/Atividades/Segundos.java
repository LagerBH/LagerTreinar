package Atividades;

public class Segundos {
	public static void main(String[] args) {
		int segundos=4165;
		int h= segundos/3600, m=(segundos-3600*h)/60, s=segundos%3600;
			System.out.println(segundos+"seg = "+ h +"h "+ m + "min "+ s + "seg");
		
	}
}
