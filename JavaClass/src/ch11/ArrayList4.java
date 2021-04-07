package ch11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayList4 {
	public static void main(String[] args) {
		String[] fruits = {"»êµþ±â", "ÆÇµþ±â", "¹ìµþ±â", "ÀÎ»ïµþ±â"};
		ArrayList<String> list = new ArrayList<>();
		for(String fruit : fruits) {
			list.add(fruit);
		}
		for(String str : list) {
			System.out.println(str);
		}
		list.clear(); // ´Ù Áö¿ì±â
		List<String> list2 = Arrays.asList("Ã¶¼ö","±æµ¿","³ª³Ä","³Ê´Ï");
		for(String a : list2) {
			System.out.println(a);
		}
	}
}
