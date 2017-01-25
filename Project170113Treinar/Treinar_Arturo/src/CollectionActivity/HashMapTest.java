package CollectionActivity;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;

import javax.print.DocFlavor.STRING;

public class HashMapTest {
	public static void main(String[] args) {
		Character primLetra = null;
		List<String> n1 = new LinkedList<>();
		add(n1, "Jorge", "Henrique", "Jadine", "Gleidson", "Hugo", "Cristiano", "Arturo", "Artur", "Karina", "Bruno",
				"Gabriel", "Cristiano");
		System.out.println("/n");
		for (int i = 0; i < n1.size(); i++) {
			System.out.println("Primeria Letra");
			System.out.println(n1.size());

		}

	}

	private static void add(List<String> n1, String... string) {
		for (String nome : string) {
			n1.add(nome);
		}
	}
}