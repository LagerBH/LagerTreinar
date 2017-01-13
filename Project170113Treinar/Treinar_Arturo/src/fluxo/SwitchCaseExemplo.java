package fluxo;

public class SwitchCaseExemplo {
	public static void main(String[] args) {

		int opcao=2;

		switch (opcao) {//no usar boolean item
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;

		default:
			System.out.println("numero invalido");
		}
	}
}
