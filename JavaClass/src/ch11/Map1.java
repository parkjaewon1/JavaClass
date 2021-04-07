package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("BTS", "010-1111-1234");
		hm1.put("����ũ", "010-1234-1234");
		hm1.put("�극�̺�ɽ�", "010-2222-1234");
		hm1.put("BTS", "010-2222-1234");

		System.out.println(hm1.get("BTS"));
		System.out.println(hm1.get("����ũ"));
		System.out.println("================");
		Set<String> keys = hm1.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + hm1.get(key));
		}
		System.out.println("================");
		Iterator<String> it = hm1.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + hm1.get(key));
		}

	}

}
