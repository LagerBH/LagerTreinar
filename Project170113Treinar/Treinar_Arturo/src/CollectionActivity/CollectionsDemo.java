package CollectionActivity;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		// ArrayList
		List<String> a1 = new ArrayList<>();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		a1.add("Fanaz");
		a1.add("Chyanjhh");
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);
		for (String objeto : a1) {
			System.out.print("\n" + objeto.length());
		}
	}
}
