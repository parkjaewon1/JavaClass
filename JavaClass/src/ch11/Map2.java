package ch11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Map2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("����","�����ϴ�");
		map.put("����","�ÿ��ϴ�");
		map.put("Ű��","��ŭ�ϴ�");
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.println(key+" : "+map.get(key));
		}
		System.out.println("==================");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
	}
}