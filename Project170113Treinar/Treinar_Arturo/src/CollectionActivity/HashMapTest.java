package CollectionActivity;

import java.util.LinkedList;
import java.util.List;

public class HashMapTest {
	public static void main(String[] args) {
		Character primLetra = null;
		List<String> n1 = new LinkedList<>();
		add(n1, "Jorge", "Henrique", "Jadine", "Gleidson", "Hugo", "Cristiano", "Arturo", "Artur", "Karina", "Bruno",
				"Gabriel", "Cristiano");

		for (int i = 0; i < n1.size(); i++) {
			System.out.println("Primeria Letra".substring(0, 1));

		}


	}

	private static void add(List<String> n1, String... string) {
		for (String nome : string) {
			n1.add(nome);
		}
	}
}