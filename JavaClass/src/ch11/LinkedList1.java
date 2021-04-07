package ch11;
import java.util.LinkedList;
public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("±¸··ÀÌ"); list.add("ÆÈ··ÀÌ"); list.add("Ä¥··ÀÌ");
		list.add("À°··ÀÌ"); list.add("±¸··ÀÌ"); print(list);
		// ÀÎµ¦½º 1¹ø¿¡ ±¸·³»ï Ãß°¡ÇÏ°í Ãâ·Â
		list.add(1, "±¸··»ï"); print(list);
		// ÀÎµ¦½º 3¹ø¿¡ µµ·æ·æÀ¸·Î ¼öÁ¤ÇÏ°í Ãâ·Â
		list.set(3, "µµ·æ·æ"); print(list);
		// ÀÎµ¦½º 2¹ø µ¥ÀÌÅÍ Áö¿ì°í Ãâ·Â
		list.remove(2);      print(list);
		// ±¸··ÀÌ Áö¿ì°í Ãâ·Â
		list.remove("±¸··ÀÌ"); print(list); // ¾Õ¿¡ ÀÖ´Â ±¸··ÀÌ ÇÏ³ª¸¸ »èÁ¦
	}
	private static void print(LinkedList<String> list) {
//		for(String snake : list) {
//			System.out.print(snake+"\t");
//		}
		System.out.println(list);
	}
}