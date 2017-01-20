package CollectionActivity;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		m1.put("Daisy", "18");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.println("\t" + m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.size());
		
		
	}
}
