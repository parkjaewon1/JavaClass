package ch11;
import java.util.HashSet;
import java.util.Iterator;
public class Set1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("���"); set.add("����"); set.add("�ٳ���"); 
		set.add("Ű��"); set.add("���"); set.add("�ٳ���");
		System.out.println("���� : "+set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================");
		for(String s : set) {
			System.out.println(s);
		}
	}
}