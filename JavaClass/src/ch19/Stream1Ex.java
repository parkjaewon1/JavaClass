package ch19;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Stream1Ex {
	public static void main(String[] args) {
//		List<String> list= new ArrayList<>();
//		list.add("����"); list.add("BTS"); list.add("�浿"); list.add("IU");
		List<String> list= Arrays.asList("����","BTS","�浿","IU");
		for (String name:list) {
			System.out.println(name);
		}
		System.out.println("====================");
		Stream<String> stream = list.stream();
		stream.forEach(name->System.out.println(name));
	}
}