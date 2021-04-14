package ch19;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class FromArray1 {
	public static void main(String[] args) {
		String[] strList = {"����", "����","ö��","�浿"};
		Stream<String> strStream = Arrays.stream(strList);
		strStream.forEach(a->System.out.println(a+", "));
		System.out.println("==============");
		int[] intArray = {12, 34, 56, 77,25};
		IntStream stream2 = Arrays.stream(intArray);
		stream2.forEach(n-> System.out.println(n+","));
		System.out.println("==============");
		List<Student1> list = Arrays.asList(new Student1("����", 20),
				new Student1("�浿", 25), new Student1("���ٴϿ�", 22));
		Stream<Student1> stream = list.stream();
		stream.forEach(s-> System.out.println(s.getName()));
	}
}